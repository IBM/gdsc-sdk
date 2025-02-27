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
import com.ibm.security.guardium.Reportsv3DisplayHeader;
import java.io.IOException;
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

import com.ibm.security.JSON;

/**
 * ChartDisplayLayout has Chart matadata , rows and headers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3ChartDisplayLayout {
  public static final String SERIALIZED_NAME_CHART_HEADERS = "chart_headers";
  @SerializedName(SERIALIZED_NAME_CHART_HEADERS)
  private List<Reportsv3DisplayHeader> chartHeaders = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_RESULTS_LIMIT = "results_limit";
  @SerializedName(SERIALIZED_NAME_RESULTS_LIMIT)
  private Integer resultsLimit;

  public Reportsv3ChartDisplayLayout() {
  }

  public Reportsv3ChartDisplayLayout chartHeaders(List<Reportsv3DisplayHeader> chartHeaders) {
    this.chartHeaders = chartHeaders;
    return this;
  }

  public Reportsv3ChartDisplayLayout addChartHeadersItem(Reportsv3DisplayHeader chartHeadersItem) {
    if (this.chartHeaders == null) {
      this.chartHeaders = new ArrayList<>();
    }
    this.chartHeaders.add(chartHeadersItem);
    return this;
  }

   /**
   * The Chart headers.
   * @return chartHeaders
  **/
  @javax.annotation.Nullable
  public List<Reportsv3DisplayHeader> getChartHeaders() {
    return chartHeaders;
  }

  public void setChartHeaders(List<Reportsv3DisplayHeader> chartHeaders) {
    this.chartHeaders = chartHeaders;
  }


  public Reportsv3ChartDisplayLayout chartId(String chartId) {
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


  public Reportsv3ChartDisplayLayout reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The report ID.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public Reportsv3ChartDisplayLayout resultsLimit(Integer resultsLimit) {
    this.resultsLimit = resultsLimit;
    return this;
  }

   /**
   * Chart data results limit.
   * @return resultsLimit
  **/
  @javax.annotation.Nullable
  public Integer getResultsLimit() {
    return resultsLimit;
  }

  public void setResultsLimit(Integer resultsLimit) {
    this.resultsLimit = resultsLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3ChartDisplayLayout reportsv3ChartDisplayLayout = (Reportsv3ChartDisplayLayout) o;
    return Objects.equals(this.chartHeaders, reportsv3ChartDisplayLayout.chartHeaders) &&
        Objects.equals(this.chartId, reportsv3ChartDisplayLayout.chartId) &&
        Objects.equals(this.reportId, reportsv3ChartDisplayLayout.reportId) &&
        Objects.equals(this.resultsLimit, reportsv3ChartDisplayLayout.resultsLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartHeaders, chartId, reportId, resultsLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3ChartDisplayLayout {\n");
    sb.append("    chartHeaders: ").append(toIndentedString(chartHeaders)).append("\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    resultsLimit: ").append(toIndentedString(resultsLimit)).append("\n");
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
    openapiFields.add("chart_headers");
    openapiFields.add("chart_id");
    openapiFields.add("report_id");
    openapiFields.add("results_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3ChartDisplayLayout
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3ChartDisplayLayout.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3ChartDisplayLayout is not found in the empty JSON string", Reportsv3ChartDisplayLayout.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3ChartDisplayLayout.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3ChartDisplayLayout` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("chart_headers") != null && !jsonObj.get("chart_headers").isJsonNull()) {
        JsonArray jsonArraychartHeaders = jsonObj.getAsJsonArray("chart_headers");
        if (jsonArraychartHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("chart_headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `chart_headers` to be an array in the JSON string but got `%s`", jsonObj.get("chart_headers").toString()));
          }

          // validate the optional field `chart_headers` (array)
          for (int i = 0; i < jsonArraychartHeaders.size(); i++) {
            Reportsv3DisplayHeader.validateJsonElement(jsonArraychartHeaders.get(i));
          };
        }
      }
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3ChartDisplayLayout.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3ChartDisplayLayout' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3ChartDisplayLayout> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3ChartDisplayLayout.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3ChartDisplayLayout>() {
           @Override
           public void write(JsonWriter out, Reportsv3ChartDisplayLayout value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3ChartDisplayLayout read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3ChartDisplayLayout given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3ChartDisplayLayout
  * @throws IOException if the JSON string is invalid with respect to Reportsv3ChartDisplayLayout
  */
  public static Reportsv3ChartDisplayLayout fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3ChartDisplayLayout.class);
  }

 /**
  * Convert an instance of Reportsv3ChartDisplayLayout to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

