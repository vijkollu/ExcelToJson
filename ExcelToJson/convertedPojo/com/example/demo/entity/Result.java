
package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "category",
    "requirement_is_met",
    "score_band",
    "recomended",
    "comment",
    "assement_type"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("category")
    private String category;
    @JsonProperty("requirement_is_met")
    private String requirementIsMet;
    @JsonProperty("score_band")
    private String scoreBand;
    @JsonProperty("recomended")
    private String recomended;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("assement_type")
    private String assementType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Result withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Result withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("requirement_is_met")
    public String getRequirementIsMet() {
        return requirementIsMet;
    }

    @JsonProperty("requirement_is_met")
    public void setRequirementIsMet(String requirementIsMet) {
        this.requirementIsMet = requirementIsMet;
    }

    public Result withRequirementIsMet(String requirementIsMet) {
        this.requirementIsMet = requirementIsMet;
        return this;
    }

    @JsonProperty("score_band")
    public String getScoreBand() {
        return scoreBand;
    }

    @JsonProperty("score_band")
    public void setScoreBand(String scoreBand) {
        this.scoreBand = scoreBand;
    }

    public Result withScoreBand(String scoreBand) {
        this.scoreBand = scoreBand;
        return this;
    }

    @JsonProperty("recomended")
    public String getRecomended() {
        return recomended;
    }

    @JsonProperty("recomended")
    public void setRecomended(String recomended) {
        this.recomended = recomended;
    }

    public Result withRecomended(String recomended) {
        this.recomended = recomended;
        return this;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Result withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("assement_type")
    public String getAssementType() {
        return assementType;
    }

    @JsonProperty("assement_type")
    public void setAssementType(String assementType) {
        this.assementType = assementType;
    }

    public Result withAssementType(String assementType) {
        this.assementType = assementType;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("requirementIsMet");
        sb.append('=');
        sb.append(((this.requirementIsMet == null)?"<null>":this.requirementIsMet));
        sb.append(',');
        sb.append("scoreBand");
        sb.append('=');
        sb.append(((this.scoreBand == null)?"<null>":this.scoreBand));
        sb.append(',');
        sb.append("recomended");
        sb.append('=');
        sb.append(((this.recomended == null)?"<null>":this.recomended));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("assementType");
        sb.append('=');
        sb.append(((this.assementType == null)?"<null>":this.assementType));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.requirementIsMet == null)? 0 :this.requirementIsMet.hashCode()));
        result = ((result* 31)+((this.assementType == null)? 0 :this.assementType.hashCode()));
        result = ((result* 31)+((this.recomended == null)? 0 :this.recomended.hashCode()));
        result = ((result* 31)+((this.scoreBand == null)? 0 :this.scoreBand.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return (((((((((this.requirementIsMet == rhs.requirementIsMet)||((this.requirementIsMet!= null)&&this.requirementIsMet.equals(rhs.requirementIsMet)))&&((this.assementType == rhs.assementType)||((this.assementType!= null)&&this.assementType.equals(rhs.assementType))))&&((this.recomended == rhs.recomended)||((this.recomended!= null)&&this.recomended.equals(rhs.recomended))))&&((this.scoreBand == rhs.scoreBand)||((this.scoreBand!= null)&&this.scoreBand.equals(rhs.scoreBand))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
