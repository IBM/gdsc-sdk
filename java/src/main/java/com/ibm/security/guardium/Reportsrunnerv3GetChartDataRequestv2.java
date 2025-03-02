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
import com.ibm.security.guardium.Reportsv3ChartSettingsv2;
import com.ibm.security.guardium.Reportsv3ModelType;
import com.ibm.security.guardium.Reportsv3ReportDefinition;
import com.ibm.security.guardium.Reportsv3RunTimeParameter;
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
 * GetChartDataRequestv2 is the argument type used to run api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3GetChartDataRequestv2 {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_SETTINGS = "chart_settings";
  @SerializedName(SERIALIZED_NAME_CHART_SETTINGS)
  private Reportsv3ChartSettingsv2 chartSettings;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private Reportsv3ModelType modelType = Reportsv3ModelType.UNDEFINED_MODEL_TYPE;

  public static final String SERIALIZED_NAME_REPORT_DEFINITION = "report_definition";
  @SerializedName(SERIALIZED_NAME_REPORT_DEFINITION)
  private Reportsv3ReportDefinition reportDefinition;

  public static final String SERIALIZED_NAME_RUNTIME_PARAMETER_LIST = "runtime_parameter_list";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAMETER_LIST)
  private List<Reportsv3RunTimeParameter> runtimeParameterList = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public Reportsrunnerv3GetChartDataRequestv2() {
  }

  public Reportsrunnerv3GetChartDataRequestv2 chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

   /**
   * Optional: the ID of the chart we wish to get its data.
   * @return chartId
  **/
  @javax.annotation.Nullable
  public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }


  public Reportsrunnerv3GetChartDataRequestv2 chartSettings(Reportsv3ChartSettingsv2 chartSettings) {
    this.chartSettings = chartSettings;
    return this;
  }

   /**
   * Get chartSettings
   * @return chartSettings
  **/
  @javax.annotation.Nullable
  public Reportsv3ChartSettingsv2 getChartSettings() {
    return chartSettings;
  }

  public void setChartSettings(Reportsv3ChartSettingsv2 chartSettings) {
    this.chartSettings = chartSettings;
  }


  public Reportsrunnerv3GetChartDataRequestv2 modelType(Reportsv3ModelType modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
  public Reportsv3ModelType getModelType() {
    return modelType;
  }

  public void setModelType(Reportsv3ModelType modelType) {
    this.modelType = modelType;
  }


  public Reportsrunnerv3GetChartDataRequestv2 reportDefinition(Reportsv3ReportDefinition reportDefinition) {
    this.reportDefinition = reportDefinition;
    return this;
  }

   /**
   * Get reportDefinition
   * @return reportDefinition
  **/
  @javax.annotation.Nullable
  public Reportsv3ReportDefinition getReportDefinition() {
    return reportDefinition;
  }

  public void setReportDefinition(Reportsv3ReportDefinition reportDefinition) {
    this.reportDefinition = reportDefinition;
  }


  public Reportsrunnerv3GetChartDataRequestv2 runtimeParameterList(List<Reportsv3RunTimeParameter> runtimeParameterList) {
    this.runtimeParameterList = runtimeParameterList;
    return this;
  }

  public Reportsrunnerv3GetChartDataRequestv2 addRuntimeParameterListItem(Reportsv3RunTimeParameter runtimeParameterListItem) {
    if (this.runtimeParameterList == null) {
      this.runtimeParameterList = new ArrayList<>();
    }
    this.runtimeParameterList.add(runtimeParameterListItem);
    return this;
  }

   /**
   * Runtime parameters.
   * @return runtimeParameterList
  **/
  @javax.annotation.Nullable
  public List<Reportsv3RunTimeParameter> getRuntimeParameterList() {
    return runtimeParameterList;
  }

  public void setRuntimeParameterList(List<Reportsv3RunTimeParameter> runtimeParameterList) {
    this.runtimeParameterList = runtimeParameterList;
  }


  public Reportsrunnerv3GetChartDataRequestv2 timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Optional: time zone.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3GetChartDataRequestv2 reportsrunnerv3GetChartDataRequestv2 = (Reportsrunnerv3GetChartDataRequestv2) o;
    return Objects.equals(this.chartId, reportsrunnerv3GetChartDataRequestv2.chartId) &&
        Objects.equals(this.chartSettings, reportsrunnerv3GetChartDataRequestv2.chartSettings) &&
        Objects.equals(this.modelType, reportsrunnerv3GetChartDataRequestv2.modelType) &&
        Objects.equals(this.reportDefinition, reportsrunnerv3GetChartDataRequestv2.reportDefinition) &&
        Objects.equals(this.runtimeParameterList, reportsrunnerv3GetChartDataRequestv2.runtimeParameterList) &&
        Objects.equals(this.timeZone, reportsrunnerv3GetChartDataRequestv2.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, chartSettings, modelType, reportDefinition, runtimeParameterList, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3GetChartDataRequestv2 {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartSettings: ").append(toIndentedString(chartSettings)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    reportDefinition: ").append(toIndentedString(reportDefinition)).append("\n");
    sb.append("    runtimeParameterList: ").append(toIndentedString(runtimeParameterList)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("chart_settings");
    openapiFields.add("model_type");
    openapiFields.add("report_definition");
    openapiFields.add("runtime_parameter_list");
    openapiFields.add("time_zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3GetChartDataRequestv2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3GetChartDataRequestv2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3GetChartDataRequestv2 is not found in the empty JSON string", Reportsrunnerv3GetChartDataRequestv2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3GetChartDataRequestv2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3GetChartDataRequestv2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      // validate the optional field `chart_settings`
      if (jsonObj.get("chart_settings") != null && !jsonObj.get("chart_settings").isJsonNull()) {
        Reportsv3ChartSettingsv2.validateJsonElement(jsonObj.get("chart_settings"));
      }
      // validate the optional field `model_type`
      if (jsonObj.get("model_type") != null && !jsonObj.get("model_type").isJsonNull()) {
        Reportsv3ModelType.validateJsonElement(jsonObj.get("model_type"));
      }
      // validate the optional field `report_definition`
      if (jsonObj.get("report_definition") != null && !jsonObj.get("report_definition").isJsonNull()) {
        Reportsv3ReportDefinition.validateJsonElement(jsonObj.get("report_definition"));
      }
      if (jsonObj.get("runtime_parameter_list") != null && !jsonObj.get("runtime_parameter_list").isJsonNull()) {
        JsonArray jsonArrayruntimeParameterList = jsonObj.getAsJsonArray("runtime_parameter_list");
        if (jsonArrayruntimeParameterList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runtime_parameter_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runtime_parameter_list` to be an array in the JSON string but got `%s`", jsonObj.get("runtime_parameter_list").toString()));
          }

          // validate the optional field `runtime_parameter_list` (array)
          for (int i = 0; i < jsonArrayruntimeParameterList.size(); i++) {
            Reportsv3RunTimeParameter.validateJsonElement(jsonArrayruntimeParameterList.get(i));
          };
        }
      }
      if ((jsonObj.get("time_zone") != null && !jsonObj.get("time_zone").isJsonNull()) && !jsonObj.get("time_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3GetChartDataRequestv2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3GetChartDataRequestv2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3GetChartDataRequestv2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3GetChartDataRequestv2.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3GetChartDataRequestv2>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3GetChartDataRequestv2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3GetChartDataRequestv2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3GetChartDataRequestv2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3GetChartDataRequestv2
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3GetChartDataRequestv2
  */
  public static Reportsrunnerv3GetChartDataRequestv2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3GetChartDataRequestv2.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3GetChartDataRequestv2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

