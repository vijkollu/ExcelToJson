package com.example.demo.logic;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.entity.ApiScore;
import com.example.demo.entity.Categorystatus;
import com.example.demo.entity.Result;
import com.google.gson.Gson;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToJsonConv {

	public static ArrayList<String> listOfCategory = new ArrayList<String>();

	public static void excelToJsonConversion(String args[]) {

		try {

			FileInputStream file = new FileInputStream(new File("curatedresults.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();
			ApiScore apiScore = new ApiScore();

			apiScore.setId(args[1]);
			apiScore.setApiName(args[2]);
			apiScore.setScore(args[3]);
			apiScore.setRecommendation(args[4]);
			apiScore.setCategoryStatus(readCategorystatus());

			ArrayList<Result> listOfResultCuration = new ArrayList<Result>();
			int rowNumber = 0;
			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}

				Iterator<Cell> cellIterator = row.cellIterator();

				Result result = new Result();

				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					if (cell.getColumnIndex() == 0) {

						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setId("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setId(cell.getStringCellValue());
						}

					} else if (cell.getColumnIndex() == 1) {

						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setRequirementIsMet("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setRequirementIsMet(cell.getStringCellValue());
						}

					} else if (cell.getColumnIndex() == 2) {
						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setScoreBand("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setScoreBand(cell.getStringCellValue());
						}

					} else if (cell.getColumnIndex() == 3) {
						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setCategory("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setCategory(cell.getStringCellValue());
						}

					} else if (cell.getColumnIndex() == 4) {
						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setComment("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setComment(cell.getStringCellValue());
						}

					} else if (cell.getColumnIndex() == 5) {
						if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

							result.setRecomended("" + cell.getNumericCellValue());

						} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
							result.setRecomended(cell.getStringCellValue());
						}

					}

				}
				listOfResultCuration.add(result);

			}
			apiScore.setResults(listOfResultCuration);
			Gson gson = new Gson();

			System.out.println(gson.toJson(apiScore));

			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<Categorystatus> readCategorystatus() throws Exception {
		ArrayList<Categorystatus> listOfCategorystatus = new ArrayList<Categorystatus>();

		FileInputStream file = new FileInputStream(new File("APIcategorization.xlsx"));

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();

		int rowNumber = 0;
		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();
			if (rowNumber == 0) {
				rowNumber++;
				continue;
			}

			Iterator<Cell> cellIterator = row.cellIterator();

			Categorystatus result = new Categorystatus();

			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();

				if (cell.getColumnIndex() == 0) {

					if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

						result.setId("" + cell.getNumericCellValue());

					} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						result.setId(cell.getStringCellValue());
					}

				} else if (cell.getColumnIndex() == 1) {

					if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

						result.setCategory("" + cell.getNumericCellValue());

					} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						result.setCategory(cell.getStringCellValue());
					}

				} else if (cell.getColumnIndex() == 2) {
					if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

						result.setStatus("" + cell.getNumericCellValue());

					} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						result.setStatus(cell.getStringCellValue());
					}

				} else if (cell.getColumnIndex() == 3) {
					if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

						result.setComments("" + cell.getNumericCellValue());

					} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						result.setComments(cell.getStringCellValue());
					}
				}

			}
			listOfCategorystatus.add(result);
		}

		return listOfCategorystatus;

	}

}
