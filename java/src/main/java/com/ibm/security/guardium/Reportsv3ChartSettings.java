/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.security.guardium;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.security.guardium.Reportsv3ChartType;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.ibm.security.JSON;

/**
 * ChartSettings encapsulates all data necessary for a chart object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3ChartSettings {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_TITLE = "chart_title";
  @SerializedName(SERIALIZED_NAME_CHART_TITLE)
  private String chartTitle;

  public static final String SERIALIZED_NAME_CHART_TYPE = "chart_type";
  @SerializedName(SERIALIZED_NAME_CHART_TYPE)
  private Reportsv3ChartType chartType = Reportsv3ChartType.UNDEFINED_CHART_TYPE;

  public static final String SERIALIZED_NAME_CREATION_TIME = "creation_time";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_CREATOR_USER_ID = "creator_user_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_USER_ID)
  private String creatorUserId;

  public static final String SERIALIZED_NAME_DATASET_HEADER_ID = "dataset_header_id";
  @SerializedName(SERIALIZED_NAME_DATASET_HEADER_ID)
  private String datasetHeaderId;

  public static final String SERIALIZED_NAME_DATASET_MAX_VALUES = "dataset_max_values";
  @SerializedName(SERIALIZED_NAME_DATASET_MAX_VALUES)
  private Integer datasetMaxValues;

  public static final String SERIALIZED_NAME_DEFAULT_CHART_EXPANDED = "default_chart_expanded";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CHART_EXPANDED)
  private Boolean defaultChartExpanded;

  public static final String SERIALIZED_NAME_IS_DEFAULT_CHART = "is_default_chart";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_CHART)
  private Boolean isDefaultChart;

  public static final String SERIALIZED_NAME_IS_PREDEFINED = "is_predefined";
  @SerializedName(SERIALIZED_NAME_IS_PREDEFINED)
  private Boolean isPredefined;

  public static final String SERIALIZED_NAME_REFRESH_RATE = "refresh_rate";
  @SerializedName(SERIALIZED_NAME_REFRESH_RATE)
  private Integer refreshRate;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_XAXIS_HEADER_ID = "xaxis_header_id";
  @SerializedName(SERIALIZED_NAME_XAXIS_HEADER_ID)
  private String xaxisHeaderId;

  public static final String SERIALIZED_NAME_XAXIS_MAX_VALUES = "xaxis_max_values";
  @SerializedName(SERIALIZED_NAME_XAXIS_MAX_VALUES)
  private Integer xaxisMaxValues;

  public static final String SERIALIZED_NAME_YAXIS_HEADER_ID = "yaxis_header_id";
  @SerializedName(SERIALIZED_NAME_YAXIS_HEADER_ID)
  private String yaxisHeaderId;

  public Reportsv3ChartSettings() {
  }

  public Reportsv3ChartSettings chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

   /**
   * The chart id.
   * @return chartId
  **/
  @javax.annotation.Nullable
  public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }


  public Reportsv3ChartSettings chartTitle(String chartTitle) {
    this.chartTitle = chartTitle;
    return this;
  }

   /**
   * The chart title.
   * @return chartTitle
  **/
  @javax.annotation.Nullable
  public String getChartTitle() {
    return chartTitle;
  }

  public void setChartTitle(String chartTitle) {
    this.chartTitle = chartTitle;
  }


  public Reportsv3ChartSettings chartType(Reportsv3ChartType chartType) {
    this.chartType = chartType;
    return this;
  }

   /**
   * Get chartType
   * @return chartType
  **/
  @javax.annotation.Nullable
  public Reportsv3ChartType getChartType() {
    return chartType;
  }

  public void setChartType(Reportsv3ChartType chartType) {
    this.chartType = chartType;
  }


  public Reportsv3ChartSettings creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The chart&#39;s cration time in format YYYY-MM-DDTHH:mm:ss.sssZ.
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Reportsv3ChartSettings creatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * An identifier for the creator of the chart.
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  public String getCreatorUserId() {
    return creatorUserId;
  }

  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  public Reportsv3ChartSettings datasetHeaderId(String datasetHeaderId) {
    this.datasetHeaderId = datasetHeaderId;
    return this;
  }

   /**
   * Header id for the dataset values.
   * @return datasetHeaderId
  **/
  @javax.annotation.Nullable
  public String getDatasetHeaderId() {
    return datasetHeaderId;
  }

  public void setDatasetHeaderId(String datasetHeaderId) {
    this.datasetHeaderId = datasetHeaderId;
  }


  public Reportsv3ChartSettings datasetMaxValues(Integer datasetMaxValues) {
    this.datasetMaxValues = datasetMaxValues;
    return this;
  }

   /**
   * Chart dataset max values.
   * @return datasetMaxValues
  **/
  @javax.annotation.Nullable
  public Integer getDatasetMaxValues() {
    return datasetMaxValues;
  }

  public void setDatasetMaxValues(Integer datasetMaxValues) {
    this.datasetMaxValues = datasetMaxValues;
  }


  public Reportsv3ChartSettings defaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
    return this;
  }

   /**
   * The default_chart_expanded is a flag taken from the user settings collection per report and user.
   * @return defaultChartExpanded
  **/
  @javax.annotation.Nullable
  public Boolean getDefaultChartExpanded() {
    return defaultChartExpanded;
  }

  public void setDefaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
  }


  public Reportsv3ChartSettings isDefaultChart(Boolean isDefaultChart) {
    this.isDefaultChart = isDefaultChart;
    return this;
  }

   /**
   * If true - this chart will be shown with the report.
   * @return isDefaultChart
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultChart() {
    return isDefaultChart;
  }

  public void setIsDefaultChart(Boolean isDefaultChart) {
    this.isDefaultChart = isDefaultChart;
  }


  public Reportsv3ChartSettings isPredefined(Boolean isPredefined) {
    this.isPredefined = isPredefined;
    return this;
  }

   /**
   * If a chart is predefined.
   * @return isPredefined
  **/
  @javax.annotation.Nullable
  public Boolean getIsPredefined() {
    return isPredefined;
  }

  public void setIsPredefined(Boolean isPredefined) {
    this.isPredefined = isPredefined;
  }


  public Reportsv3ChartSettings refreshRate(Integer refreshRate) {
    this.refreshRate = refreshRate;
    return this;
  }

   /**
   * Chart refresh rate.
   * @return refreshRate
  **/
  @javax.annotation.Nullable
  public Integer getRefreshRate() {
    return refreshRate;
  }

  public void setRefreshRate(Integer refreshRate) {
    this.refreshRate = refreshRate;
  }


  public Reportsv3ChartSettings reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The report id that the chart connected to.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsv3ChartSettings xaxisHeaderId(String xaxisHeaderId) {
    this.xaxisHeaderId = xaxisHeaderId;
    return this;
  }

   /**
   * Header id for the x-axis values.
   * @return xaxisHeaderId
  **/
  @javax.annotation.Nullable
  public String getXaxisHeaderId() {
    return xaxisHeaderId;
  }

  public void setXaxisHeaderId(String xaxisHeaderId) {
    this.xaxisHeaderId = xaxisHeaderId;
  }


  public Reportsv3ChartSettings xaxisMaxValues(Integer xaxisMaxValues) {
    this.xaxisMaxValues = xaxisMaxValues;
    return this;
  }

   /**
   * Chart xaxis max values.
   * @return xaxisMaxValues
  **/
  @javax.annotation.Nullable
  public Integer getXaxisMaxValues() {
    return xaxisMaxValues;
  }

  public void setXaxisMaxValues(Integer xaxisMaxValues) {
    this.xaxisMaxValues = xaxisMaxValues;
  }


  public Reportsv3ChartSettings yaxisHeaderId(String yaxisHeaderId) {
    this.yaxisHeaderId = yaxisHeaderId;
    return this;
  }

   /**
   * Header id for the y-axis values.
   * @return yaxisHeaderId
  **/
  @javax.annotation.Nullable
  public String getYaxisHeaderId() {
    return yaxisHeaderId;
  }

  public void setYaxisHeaderId(String yaxisHeaderId) {
    this.yaxisHeaderId = yaxisHeaderId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3ChartSettings reportsv3ChartSettings = (Reportsv3ChartSettings) o;
    return Objects.equals(this.chartId, reportsv3ChartSettings.chartId) &&
        Objects.equals(this.chartTitle, reportsv3ChartSettings.chartTitle) &&
        Objects.equals(this.chartType, reportsv3ChartSettings.chartType) &&
        Objects.equals(this.creationTime, reportsv3ChartSettings.creationTime) &&
        Objects.equals(this.creatorUserId, reportsv3ChartSettings.creatorUserId) &&
        Objects.equals(this.datasetHeaderId, reportsv3ChartSettings.datasetHeaderId) &&
        Objects.equals(this.datasetMaxValues, reportsv3ChartSettings.datasetMaxValues) &&
        Objects.equals(this.defaultChartExpanded, reportsv3ChartSettings.defaultChartExpanded) &&
        Objects.equals(this.isDefaultChart, reportsv3ChartSettings.isDefaultChart) &&
        Objects.equals(this.isPredefined, reportsv3ChartSettings.isPredefined) &&
        Objects.equals(this.refreshRate, reportsv3ChartSettings.refreshRate) &&
        Objects.equals(this.reportId, reportsv3ChartSettings.reportId) &&
        Objects.equals(this.xaxisHeaderId, reportsv3ChartSettings.xaxisHeaderId) &&
        Objects.equals(this.xaxisMaxValues, reportsv3ChartSettings.xaxisMaxValues) &&
        Objects.equals(this.yaxisHeaderId, reportsv3ChartSettings.yaxisHeaderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, chartTitle, chartType, creationTime, creatorUserId, datasetHeaderId, datasetMaxValues, defaultChartExpanded, isDefaultChart, isPredefined, refreshRate, reportId, xaxisHeaderId, xaxisMaxValues, yaxisHeaderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3ChartSettings {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartTitle: ").append(toIndentedString(chartTitle)).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    datasetHeaderId: ").append(toIndentedString(datasetHeaderId)).append("\n");
    sb.append("    datasetMaxValues: ").append(toIndentedString(datasetMaxValues)).append("\n");
    sb.append("    defaultChartExpanded: ").append(toIndentedString(defaultChartExpanded)).append("\n");
    sb.append("    isDefaultChart: ").append(toIndentedString(isDefaultChart)).append("\n");
    sb.append("    isPredefined: ").append(toIndentedString(isPredefined)).append("\n");
    sb.append("    refreshRate: ").append(toIndentedString(refreshRate)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    xaxisHeaderId: ").append(toIndentedString(xaxisHeaderId)).append("\n");
    sb.append("    xaxisMaxValues: ").append(toIndentedString(xaxisMaxValues)).append("\n");
    sb.append("    yaxisHeaderId: ").append(toIndentedString(yaxisHeaderId)).append("\n");
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
    openapiFields.add("chart_id");
    openapiFields.add("chart_title");
    openapiFields.add("chart_type");
    openapiFields.add("creation_time");
    openapiFields.add("creator_user_id");
    openapiFields.add("dataset_header_id");
    openapiFields.add("dataset_max_values");
    openapiFields.add("default_chart_expanded");
    openapiFields.add("is_default_chart");
    openapiFields.add("is_predefined");
    openapiFields.add("refresh_rate");
    openapiFields.add("report_id");
    openapiFields.add("xaxis_header_id");
    openapiFields.add("xaxis_max_values");
    openapiFields.add("yaxis_header_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3ChartSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3ChartSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3ChartSettings is not found in the empty JSON string", Reportsv3ChartSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3ChartSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3ChartSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      if ((jsonObj.get("chart_title") != null && !jsonObj.get("chart_title").isJsonNull()) && !jsonObj.get("chart_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_title").toString()));
      }
      // validate the optional field `chart_type`
      if (jsonObj.get("chart_type") != null && !jsonObj.get("chart_type").isJsonNull()) {
        Reportsv3ChartType.validateJsonElement(jsonObj.get("chart_type"));
      }
      if ((jsonObj.get("creator_user_id") != null && !jsonObj.get("creator_user_id").isJsonNull()) && !jsonObj.get("creator_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_user_id").toString()));
      }
      if ((jsonObj.get("dataset_header_id") != null && !jsonObj.get("dataset_header_id").isJsonNull()) && !jsonObj.get("dataset_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_header_id").toString()));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("xaxis_header_id") != null && !jsonObj.get("xaxis_header_id").isJsonNull()) && !jsonObj.get("xaxis_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xaxis_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xaxis_header_id").toString()));
      }
      if ((jsonObj.get("yaxis_header_id") != null && !jsonObj.get("yaxis_header_id").isJsonNull()) && !jsonObj.get("yaxis_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yaxis_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yaxis_header_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3ChartSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3ChartSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3ChartSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3ChartSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3ChartSettings>() {
           @Override
           public void write(JsonWriter out, Reportsv3ChartSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3ChartSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3ChartSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3ChartSettings
  * @throws IOException if the JSON string is invalid with respect to Reportsv3ChartSettings
  */
  public static Reportsv3ChartSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3ChartSettings.class);
  }

 /**
  * Convert an instance of Reportsv3ChartSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

