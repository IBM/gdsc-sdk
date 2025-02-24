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
import com.ibm.security.guardium.Reportsv3ChartSettings;
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

import com.ibm.security.JSON;

/**
 * UpdateChartRequests is the argument type used to update a chart.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3UpdateChartRequest {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_SETTINGS = "chart_settings";
  @SerializedName(SERIALIZED_NAME_CHART_SETTINGS)
  private Reportsv3ChartSettings chartSettings;

  public Reportsv3UpdateChartRequest() {
  }

  public Reportsv3UpdateChartRequest chartId(String chartId) {
    this.chartId = chartId;
    return this;
  }

   /**
   * Unique chart ID.
   * @return chartId
  **/
  @javax.annotation.Nullable
  public String getChartId() {
    return chartId;
  }

  public void setChartId(String chartId) {
    this.chartId = chartId;
  }


  public Reportsv3UpdateChartRequest chartSettings(Reportsv3ChartSettings chartSettings) {
    this.chartSettings = chartSettings;
    return this;
  }

   /**
   * Get chartSettings
   * @return chartSettings
  **/
  @javax.annotation.Nullable
  public Reportsv3ChartSettings getChartSettings() {
    return chartSettings;
  }

  public void setChartSettings(Reportsv3ChartSettings chartSettings) {
    this.chartSettings = chartSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3UpdateChartRequest reportsv3UpdateChartRequest = (Reportsv3UpdateChartRequest) o;
    return Objects.equals(this.chartId, reportsv3UpdateChartRequest.chartId) &&
        Objects.equals(this.chartSettings, reportsv3UpdateChartRequest.chartSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, chartSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3UpdateChartRequest {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartSettings: ").append(toIndentedString(chartSettings)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3UpdateChartRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3UpdateChartRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3UpdateChartRequest is not found in the empty JSON string", Reportsv3UpdateChartRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3UpdateChartRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3UpdateChartRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      // validate the optional field `chart_settings`
      if (jsonObj.get("chart_settings") != null && !jsonObj.get("chart_settings").isJsonNull()) {
        Reportsv3ChartSettings.validateJsonElement(jsonObj.get("chart_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3UpdateChartRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3UpdateChartRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3UpdateChartRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3UpdateChartRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3UpdateChartRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3UpdateChartRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3UpdateChartRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3UpdateChartRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3UpdateChartRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3UpdateChartRequest
  */
  public static Reportsv3UpdateChartRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3UpdateChartRequest.class);
  }

 /**
  * Convert an instance of Reportsv3UpdateChartRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

