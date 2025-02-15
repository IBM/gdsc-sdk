/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Outliersenginev3AnalysisStatisticsMessage;
import com.ibm.gdsc.sdk.Outliersenginev3OutliersStats;
import com.ibm.gdsc.sdk.Outliersenginev3QueueStatisticsMessage;
import com.ibm.gdsc.sdk.Outliersenginev3SourcesStats;
import com.ibm.gdsc.sdk.RpcStatus;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ibm.gdsc.JSON;

/**
 * StatisticsResponse is the message for the result from getStatistics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3StatisticsResponse {
  public static final String SERIALIZED_NAME_ANALYSIS_STATISTICS = "analysis_statistics";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_STATISTICS)
  private Outliersenginev3AnalysisStatisticsMessage analysisStatistics;

  public static final String SERIALIZED_NAME_NUMBER_OF_CLUSTERS = "number_of_clusters";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_CLUSTERS)
  private Integer numberOfClusters;

  public static final String SERIALIZED_NAME_NUMBER_OF_COMPLETED_PERIODS = "number_of_completed_periods";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_COMPLETED_PERIODS)
  private Integer numberOfCompletedPeriods;

  public static final String SERIALIZED_NAME_NUMBER_OF_OUTLIERS_DETAILS = "number_of_outliers_details";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_OUTLIERS_DETAILS)
  private Integer numberOfOutliersDetails;

  public static final String SERIALIZED_NAME_NUMBER_OF_OUTLIERS_SUMMARY = "number_of_outliers_summary";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_OUTLIERS_SUMMARY)
  private Integer numberOfOutliersSummary;

  public static final String SERIALIZED_NAME_NUMBER_OF_SOURCES = "number_of_sources";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SOURCES)
  private Integer numberOfSources;

  public static final String SERIALIZED_NAME_NUMBER_OF_UNCOMPLETED_PERIODS = "number_of_uncompleted_periods";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_UNCOMPLETED_PERIODS)
  private Integer numberOfUncompletedPeriods;

  public static final String SERIALIZED_NAME_OUTLIERS_STATS = "outliers_stats";
  @SerializedName(SERIALIZED_NAME_OUTLIERS_STATS)
  private Outliersenginev3OutliersStats outliersStats;

  public static final String SERIALIZED_NAME_QUEUE_STATISTICS = "queue_statistics";
  @SerializedName(SERIALIZED_NAME_QUEUE_STATISTICS)
  private Outliersenginev3QueueStatisticsMessage queueStatistics;

  public static final String SERIALIZED_NAME_SOURCES_STATS = "sources_stats";
  @SerializedName(SERIALIZED_NAME_SOURCES_STATS)
  private Outliersenginev3SourcesStats sourcesStats;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RpcStatus status;

  public Outliersenginev3StatisticsResponse() {
  }

  public Outliersenginev3StatisticsResponse analysisStatistics(Outliersenginev3AnalysisStatisticsMessage analysisStatistics) {
    this.analysisStatistics = analysisStatistics;
    return this;
  }

   /**
   * Get analysisStatistics
   * @return analysisStatistics
  **/
  @javax.annotation.Nullable
  public Outliersenginev3AnalysisStatisticsMessage getAnalysisStatistics() {
    return analysisStatistics;
  }

  public void setAnalysisStatistics(Outliersenginev3AnalysisStatisticsMessage analysisStatistics) {
    this.analysisStatistics = analysisStatistics;
  }


  public Outliersenginev3StatisticsResponse numberOfClusters(Integer numberOfClusters) {
    this.numberOfClusters = numberOfClusters;
    return this;
  }

   /**
   * Number of clusters.
   * @return numberOfClusters
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfClusters() {
    return numberOfClusters;
  }

  public void setNumberOfClusters(Integer numberOfClusters) {
    this.numberOfClusters = numberOfClusters;
  }


  public Outliersenginev3StatisticsResponse numberOfCompletedPeriods(Integer numberOfCompletedPeriods) {
    this.numberOfCompletedPeriods = numberOfCompletedPeriods;
    return this;
  }

   /**
   * Number of completed periods.
   * @return numberOfCompletedPeriods
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfCompletedPeriods() {
    return numberOfCompletedPeriods;
  }

  public void setNumberOfCompletedPeriods(Integer numberOfCompletedPeriods) {
    this.numberOfCompletedPeriods = numberOfCompletedPeriods;
  }


  public Outliersenginev3StatisticsResponse numberOfOutliersDetails(Integer numberOfOutliersDetails) {
    this.numberOfOutliersDetails = numberOfOutliersDetails;
    return this;
  }

   /**
   * Number of outliers in details table.
   * @return numberOfOutliersDetails
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfOutliersDetails() {
    return numberOfOutliersDetails;
  }

  public void setNumberOfOutliersDetails(Integer numberOfOutliersDetails) {
    this.numberOfOutliersDetails = numberOfOutliersDetails;
  }


  public Outliersenginev3StatisticsResponse numberOfOutliersSummary(Integer numberOfOutliersSummary) {
    this.numberOfOutliersSummary = numberOfOutliersSummary;
    return this;
  }

   /**
   * Number of outliers in summary table.
   * @return numberOfOutliersSummary
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfOutliersSummary() {
    return numberOfOutliersSummary;
  }

  public void setNumberOfOutliersSummary(Integer numberOfOutliersSummary) {
    this.numberOfOutliersSummary = numberOfOutliersSummary;
  }


  public Outliersenginev3StatisticsResponse numberOfSources(Integer numberOfSources) {
    this.numberOfSources = numberOfSources;
    return this;
  }

   /**
   * Number of sources.
   * @return numberOfSources
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfSources() {
    return numberOfSources;
  }

  public void setNumberOfSources(Integer numberOfSources) {
    this.numberOfSources = numberOfSources;
  }


  public Outliersenginev3StatisticsResponse numberOfUncompletedPeriods(Integer numberOfUncompletedPeriods) {
    this.numberOfUncompletedPeriods = numberOfUncompletedPeriods;
    return this;
  }

   /**
   * Number of uncompleted periods.
   * @return numberOfUncompletedPeriods
  **/
  @javax.annotation.Nullable
  public Integer getNumberOfUncompletedPeriods() {
    return numberOfUncompletedPeriods;
  }

  public void setNumberOfUncompletedPeriods(Integer numberOfUncompletedPeriods) {
    this.numberOfUncompletedPeriods = numberOfUncompletedPeriods;
  }


  public Outliersenginev3StatisticsResponse outliersStats(Outliersenginev3OutliersStats outliersStats) {
    this.outliersStats = outliersStats;
    return this;
  }

   /**
   * Get outliersStats
   * @return outliersStats
  **/
  @javax.annotation.Nullable
  public Outliersenginev3OutliersStats getOutliersStats() {
    return outliersStats;
  }

  public void setOutliersStats(Outliersenginev3OutliersStats outliersStats) {
    this.outliersStats = outliersStats;
  }


  public Outliersenginev3StatisticsResponse queueStatistics(Outliersenginev3QueueStatisticsMessage queueStatistics) {
    this.queueStatistics = queueStatistics;
    return this;
  }

   /**
   * Get queueStatistics
   * @return queueStatistics
  **/
  @javax.annotation.Nullable
  public Outliersenginev3QueueStatisticsMessage getQueueStatistics() {
    return queueStatistics;
  }

  public void setQueueStatistics(Outliersenginev3QueueStatisticsMessage queueStatistics) {
    this.queueStatistics = queueStatistics;
  }


  public Outliersenginev3StatisticsResponse sourcesStats(Outliersenginev3SourcesStats sourcesStats) {
    this.sourcesStats = sourcesStats;
    return this;
  }

   /**
   * Get sourcesStats
   * @return sourcesStats
  **/
  @javax.annotation.Nullable
  public Outliersenginev3SourcesStats getSourcesStats() {
    return sourcesStats;
  }

  public void setSourcesStats(Outliersenginev3SourcesStats sourcesStats) {
    this.sourcesStats = sourcesStats;
  }


  public Outliersenginev3StatisticsResponse status(RpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RpcStatus getStatus() {
    return status;
  }

  public void setStatus(RpcStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3StatisticsResponse outliersenginev3StatisticsResponse = (Outliersenginev3StatisticsResponse) o;
    return Objects.equals(this.analysisStatistics, outliersenginev3StatisticsResponse.analysisStatistics) &&
        Objects.equals(this.numberOfClusters, outliersenginev3StatisticsResponse.numberOfClusters) &&
        Objects.equals(this.numberOfCompletedPeriods, outliersenginev3StatisticsResponse.numberOfCompletedPeriods) &&
        Objects.equals(this.numberOfOutliersDetails, outliersenginev3StatisticsResponse.numberOfOutliersDetails) &&
        Objects.equals(this.numberOfOutliersSummary, outliersenginev3StatisticsResponse.numberOfOutliersSummary) &&
        Objects.equals(this.numberOfSources, outliersenginev3StatisticsResponse.numberOfSources) &&
        Objects.equals(this.numberOfUncompletedPeriods, outliersenginev3StatisticsResponse.numberOfUncompletedPeriods) &&
        Objects.equals(this.outliersStats, outliersenginev3StatisticsResponse.outliersStats) &&
        Objects.equals(this.queueStatistics, outliersenginev3StatisticsResponse.queueStatistics) &&
        Objects.equals(this.sourcesStats, outliersenginev3StatisticsResponse.sourcesStats) &&
        Objects.equals(this.status, outliersenginev3StatisticsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisStatistics, numberOfClusters, numberOfCompletedPeriods, numberOfOutliersDetails, numberOfOutliersSummary, numberOfSources, numberOfUncompletedPeriods, outliersStats, queueStatistics, sourcesStats, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3StatisticsResponse {\n");
    sb.append("    analysisStatistics: ").append(toIndentedString(analysisStatistics)).append("\n");
    sb.append("    numberOfClusters: ").append(toIndentedString(numberOfClusters)).append("\n");
    sb.append("    numberOfCompletedPeriods: ").append(toIndentedString(numberOfCompletedPeriods)).append("\n");
    sb.append("    numberOfOutliersDetails: ").append(toIndentedString(numberOfOutliersDetails)).append("\n");
    sb.append("    numberOfOutliersSummary: ").append(toIndentedString(numberOfOutliersSummary)).append("\n");
    sb.append("    numberOfSources: ").append(toIndentedString(numberOfSources)).append("\n");
    sb.append("    numberOfUncompletedPeriods: ").append(toIndentedString(numberOfUncompletedPeriods)).append("\n");
    sb.append("    outliersStats: ").append(toIndentedString(outliersStats)).append("\n");
    sb.append("    queueStatistics: ").append(toIndentedString(queueStatistics)).append("\n");
    sb.append("    sourcesStats: ").append(toIndentedString(sourcesStats)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("analysis_statistics");
    openapiFields.add("number_of_clusters");
    openapiFields.add("number_of_completed_periods");
    openapiFields.add("number_of_outliers_details");
    openapiFields.add("number_of_outliers_summary");
    openapiFields.add("number_of_sources");
    openapiFields.add("number_of_uncompleted_periods");
    openapiFields.add("outliers_stats");
    openapiFields.add("queue_statistics");
    openapiFields.add("sources_stats");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3StatisticsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3StatisticsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3StatisticsResponse is not found in the empty JSON string", Outliersenginev3StatisticsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3StatisticsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3StatisticsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `analysis_statistics`
      if (jsonObj.get("analysis_statistics") != null && !jsonObj.get("analysis_statistics").isJsonNull()) {
        Outliersenginev3AnalysisStatisticsMessage.validateJsonElement(jsonObj.get("analysis_statistics"));
      }
      // validate the optional field `outliers_stats`
      if (jsonObj.get("outliers_stats") != null && !jsonObj.get("outliers_stats").isJsonNull()) {
        Outliersenginev3OutliersStats.validateJsonElement(jsonObj.get("outliers_stats"));
      }
      // validate the optional field `queue_statistics`
      if (jsonObj.get("queue_statistics") != null && !jsonObj.get("queue_statistics").isJsonNull()) {
        Outliersenginev3QueueStatisticsMessage.validateJsonElement(jsonObj.get("queue_statistics"));
      }
      // validate the optional field `sources_stats`
      if (jsonObj.get("sources_stats") != null && !jsonObj.get("sources_stats").isJsonNull()) {
        Outliersenginev3SourcesStats.validateJsonElement(jsonObj.get("sources_stats"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3StatisticsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3StatisticsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3StatisticsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3StatisticsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3StatisticsResponse>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3StatisticsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3StatisticsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3StatisticsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3StatisticsResponse
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3StatisticsResponse
  */
  public static Outliersenginev3StatisticsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3StatisticsResponse.class);
  }

 /**
  * Convert an instance of Outliersenginev3StatisticsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

