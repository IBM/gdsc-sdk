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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ChartSettingsv2 encapsulates all data necessary for a VEGA chart object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3ChartSettingsv2 {
  public static final String SERIALIZED_NAME_CATEGORY_SEQUENCE_NUMBERS = "category_sequence_numbers";
  @SerializedName(SERIALIZED_NAME_CATEGORY_SEQUENCE_NUMBERS)
  private List<Integer> categorySequenceNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_TITLE = "chart_title";
  @SerializedName(SERIALIZED_NAME_CHART_TITLE)
  private String chartTitle;

  public static final String SERIALIZED_NAME_CREATION_TIME = "creation_time";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_CREATOR_USER_ID = "creator_user_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_USER_ID)
  private String creatorUserId;

  public static final String SERIALIZED_NAME_DEFAULT_CHART_EXPANDED = "default_chart_expanded";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CHART_EXPANDED)
  private Boolean defaultChartExpanded;

  public static final String SERIALIZED_NAME_IS_DEFAULT_CHART = "is_default_chart";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT_CHART)
  private Boolean isDefaultChart;

  public static final String SERIALIZED_NAME_IS_PREDEFINED = "is_predefined";
  @SerializedName(SERIALIZED_NAME_IS_PREDEFINED)
  private Boolean isPredefined;

  public static final String SERIALIZED_NAME_MEASURE_SEQUENCE_NUMBERS = "measure_sequence_numbers";
  @SerializedName(SERIALIZED_NAME_MEASURE_SEQUENCE_NUMBERS)
  private List<Integer> measureSequenceNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_REFRESH_RATE = "refresh_rate";
  @SerializedName(SERIALIZED_NAME_REFRESH_RATE)
  private Integer refreshRate;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_VEGA_DEFINITION = "vega_definition";
  @SerializedName(SERIALIZED_NAME_VEGA_DEFINITION)
  private String vegaDefinition;

  public Reportsv3ChartSettingsv2() {
  }

  public Reportsv3ChartSettingsv2 categorySequenceNumbers(List<Integer> categorySequenceNumbers) {
    this.categorySequenceNumbers = categorySequenceNumbers;
    return this;
  }

  public Reportsv3ChartSettingsv2 addCategorySequenceNumbersItem(Integer categorySequenceNumbersItem) {
    if (this.categorySequenceNumbers == null) {
      this.categorySequenceNumbers = new ArrayList<>();
    }
    this.categorySequenceNumbers.add(categorySequenceNumbersItem);
    return this;
  }

   /**
   * Sequence numbers for the categories.
   * @return categorySequenceNumbers
  **/
  @javax.annotation.Nullable
  public List<Integer> getCategorySequenceNumbers() {
    return categorySequenceNumbers;
  }

  public void setCategorySequenceNumbers(List<Integer> categorySequenceNumbers) {
    this.categorySequenceNumbers = categorySequenceNumbers;
  }


  public Reportsv3ChartSettingsv2 chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

   /**
   * The chart ID.
   * @return chartId
  **/
  @javax.annotation.Nullable
  public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }


  public Reportsv3ChartSettingsv2 chartTitle(String chartTitle) {
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


  public Reportsv3ChartSettingsv2 creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The creation time of the chart.
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Reportsv3ChartSettingsv2 creatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

   /**
   * The ID of the creator of the chart.
   * @return creatorUserId
  **/
  @javax.annotation.Nullable
  public String getCreatorUserId() {
    return creatorUserId;
  }

  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }


  public Reportsv3ChartSettingsv2 defaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
    return this;
  }

   /**
   * Indicates if the default chart is expanded.
   * @return defaultChartExpanded
  **/
  @javax.annotation.Nullable
  public Boolean getDefaultChartExpanded() {
    return defaultChartExpanded;
  }

  public void setDefaultChartExpanded(Boolean defaultChartExpanded) {
    this.defaultChartExpanded = defaultChartExpanded;
  }


  public Reportsv3ChartSettingsv2 isDefaultChart(Boolean isDefaultChart) {
    this.isDefaultChart = isDefaultChart;
    return this;
  }

   /**
   * Indicates if the chart is the default chart.
   * @return isDefaultChart
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefaultChart() {
    return isDefaultChart;
  }

  public void setIsDefaultChart(Boolean isDefaultChart) {
    this.isDefaultChart = isDefaultChart;
  }


  public Reportsv3ChartSettingsv2 isPredefined(Boolean isPredefined) {
    this.isPredefined = isPredefined;
    return this;
  }

   /**
   * Indicates if the chart is predefined.
   * @return isPredefined
  **/
  @javax.annotation.Nullable
  public Boolean getIsPredefined() {
    return isPredefined;
  }

  public void setIsPredefined(Boolean isPredefined) {
    this.isPredefined = isPredefined;
  }


  public Reportsv3ChartSettingsv2 measureSequenceNumbers(List<Integer> measureSequenceNumbers) {
    this.measureSequenceNumbers = measureSequenceNumbers;
    return this;
  }

  public Reportsv3ChartSettingsv2 addMeasureSequenceNumbersItem(Integer measureSequenceNumbersItem) {
    if (this.measureSequenceNumbers == null) {
      this.measureSequenceNumbers = new ArrayList<>();
    }
    this.measureSequenceNumbers.add(measureSequenceNumbersItem);
    return this;
  }

   /**
   * Sequence numbers for the measures.
   * @return measureSequenceNumbers
  **/
  @javax.annotation.Nullable
  public List<Integer> getMeasureSequenceNumbers() {
    return measureSequenceNumbers;
  }

  public void setMeasureSequenceNumbers(List<Integer> measureSequenceNumbers) {
    this.measureSequenceNumbers = measureSequenceNumbers;
  }


  public Reportsv3ChartSettingsv2 refreshRate(Integer refreshRate) {
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


  public Reportsv3ChartSettingsv2 reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The ID of the report connected to the chart.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsv3ChartSettingsv2 vegaDefinition(String vegaDefinition) {
    this.vegaDefinition = vegaDefinition;
    return this;
  }

   /**
   * The VEGA chart definition in a stringified JSON.
   * @return vegaDefinition
  **/
  @javax.annotation.Nullable
  public String getVegaDefinition() {
    return vegaDefinition;
  }

  public void setVegaDefinition(String vegaDefinition) {
    this.vegaDefinition = vegaDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3ChartSettingsv2 reportsv3ChartSettingsv2 = (Reportsv3ChartSettingsv2) o;
    return Objects.equals(this.categorySequenceNumbers, reportsv3ChartSettingsv2.categorySequenceNumbers) &&
        Objects.equals(this.chartId, reportsv3ChartSettingsv2.chartId) &&
        Objects.equals(this.chartTitle, reportsv3ChartSettingsv2.chartTitle) &&
        Objects.equals(this.creationTime, reportsv3ChartSettingsv2.creationTime) &&
        Objects.equals(this.creatorUserId, reportsv3ChartSettingsv2.creatorUserId) &&
        Objects.equals(this.defaultChartExpanded, reportsv3ChartSettingsv2.defaultChartExpanded) &&
        Objects.equals(this.isDefaultChart, reportsv3ChartSettingsv2.isDefaultChart) &&
        Objects.equals(this.isPredefined, reportsv3ChartSettingsv2.isPredefined) &&
        Objects.equals(this.measureSequenceNumbers, reportsv3ChartSettingsv2.measureSequenceNumbers) &&
        Objects.equals(this.refreshRate, reportsv3ChartSettingsv2.refreshRate) &&
        Objects.equals(this.reportId, reportsv3ChartSettingsv2.reportId) &&
        Objects.equals(this.vegaDefinition, reportsv3ChartSettingsv2.vegaDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorySequenceNumbers, chartId, chartTitle, creationTime, creatorUserId, defaultChartExpanded, isDefaultChart, isPredefined, measureSequenceNumbers, refreshRate, reportId, vegaDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3ChartSettingsv2 {\n");
    sb.append("    categorySequenceNumbers: ").append(toIndentedString(categorySequenceNumbers)).append("\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartTitle: ").append(toIndentedString(chartTitle)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    creatorUserId: ").append(toIndentedString(creatorUserId)).append("\n");
    sb.append("    defaultChartExpanded: ").append(toIndentedString(defaultChartExpanded)).append("\n");
    sb.append("    isDefaultChart: ").append(toIndentedString(isDefaultChart)).append("\n");
    sb.append("    isPredefined: ").append(toIndentedString(isPredefined)).append("\n");
    sb.append("    measureSequenceNumbers: ").append(toIndentedString(measureSequenceNumbers)).append("\n");
    sb.append("    refreshRate: ").append(toIndentedString(refreshRate)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    vegaDefinition: ").append(toIndentedString(vegaDefinition)).append("\n");
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
    openapiFields.add("category_sequence_numbers");
    openapiFields.add("chart_id");
    openapiFields.add("chart_title");
    openapiFields.add("creation_time");
    openapiFields.add("creator_user_id");
    openapiFields.add("default_chart_expanded");
    openapiFields.add("is_default_chart");
    openapiFields.add("is_predefined");
    openapiFields.add("measure_sequence_numbers");
    openapiFields.add("refresh_rate");
    openapiFields.add("report_id");
    openapiFields.add("vega_definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3ChartSettingsv2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3ChartSettingsv2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3ChartSettingsv2 is not found in the empty JSON string", Reportsv3ChartSettingsv2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3ChartSettingsv2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3ChartSettingsv2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("category_sequence_numbers") != null && !jsonObj.get("category_sequence_numbers").isJsonNull() && !jsonObj.get("category_sequence_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_sequence_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("category_sequence_numbers").toString()));
      }
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      if ((jsonObj.get("chart_title") != null && !jsonObj.get("chart_title").isJsonNull()) && !jsonObj.get("chart_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_title").toString()));
      }
      if ((jsonObj.get("creator_user_id") != null && !jsonObj.get("creator_user_id").isJsonNull()) && !jsonObj.get("creator_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_user_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("measure_sequence_numbers") != null && !jsonObj.get("measure_sequence_numbers").isJsonNull() && !jsonObj.get("measure_sequence_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `measure_sequence_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("measure_sequence_numbers").toString()));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
      if ((jsonObj.get("vega_definition") != null && !jsonObj.get("vega_definition").isJsonNull()) && !jsonObj.get("vega_definition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vega_definition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vega_definition").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3ChartSettingsv2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3ChartSettingsv2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3ChartSettingsv2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3ChartSettingsv2.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3ChartSettingsv2>() {
           @Override
           public void write(JsonWriter out, Reportsv3ChartSettingsv2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3ChartSettingsv2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3ChartSettingsv2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3ChartSettingsv2
  * @throws IOException if the JSON string is invalid with respect to Reportsv3ChartSettingsv2
  */
  public static Reportsv3ChartSettingsv2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3ChartSettingsv2.class);
  }

 /**
  * Convert an instance of Reportsv3ChartSettingsv2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

