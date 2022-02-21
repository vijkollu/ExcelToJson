
package com.example.demo.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "apiName",
    "score",
    "recommendation",
    "categoryStatus",
    "results"
})
@Generated("jsonschema2pojo")
public class ApiScore {

    @JsonProperty("id")
    private String id;
    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("score")
    private String score;
    @JsonProperty("recommendation")
    private String recommendation;
    @JsonProperty("categoryStatus")
    private List<Categorystatus> categoryStatus = new ArrayList<Categorystatus>();
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
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

    public ApiScore withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("apiName")
    public String getApiName() {
        return apiName;
    }

    @JsonProperty("apiName")
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ApiScore withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    @JsonProperty("score")
    public String getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(String score) {
        this.score = score;
    }

    public ApiScore withScore(String score) {
        this.score = score;
        return this;
    }

    @JsonProperty("recommendation")
    public String getRecommendation() {
        return recommendation;
    }

    @JsonProperty("recommendation")
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public ApiScore withRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    @JsonProperty("categoryStatus")
    public List<Categorystatus> getCategoryStatus() {
        return categoryStatus;
    }

    @JsonProperty("categoryStatus")
    public void setCategoryStatus(List<Categorystatus> categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public ApiScore withCategoryStatus(List<Categorystatus> categoryStatus) {
        this.categoryStatus = categoryStatus;
        return this;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public ApiScore withResults(List<Result> results) {
        this.results = results;
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

    public ApiScore withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiScore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("apiName");
        sb.append('=');
        sb.append(((this.apiName == null)?"<null>":this.apiName));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("recommendation");
        sb.append('=');
        sb.append(((this.recommendation == null)?"<null>":this.recommendation));
        sb.append(',');
        sb.append("categoryStatus");
        sb.append('=');
        sb.append(((this.categoryStatus == null)?"<null>":this.categoryStatus));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
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
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.apiName == null)? 0 :this.apiName.hashCode()));
        result = ((result* 31)+((this.categoryStatus == null)? 0 :this.categoryStatus.hashCode()));
        result = ((result* 31)+((this.recommendation == null)? 0 :this.recommendation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiScore) == false) {
            return false;
        }
        ApiScore rhs = ((ApiScore) other);
        return ((((((((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score)))&&((this.apiName == rhs.apiName)||((this.apiName!= null)&&this.apiName.equals(rhs.apiName))))&&((this.categoryStatus == rhs.categoryStatus)||((this.categoryStatus!= null)&&this.categoryStatus.equals(rhs.categoryStatus))))&&((this.recommendation == rhs.recommendation)||((this.recommendation!= null)&&this.recommendation.equals(rhs.recommendation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))));
    }

}
