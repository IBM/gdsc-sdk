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
import com.ibm.gdsc.sdk.ProtobufFieldMask;
import com.ibm.gdsc.sdk.Reportsv3ChartType;
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
 * PartialChartUpdateRequest is the argument type used to update a chart  with partial information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3PartialChartUpdateRequest {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_TITLE = "chart_title";
  @SerializedName(SERIALIZED_NAME_CHART_TITLE)
  private String chartTitle;

  public static final String SERIALIZED_NAME_CHART_TYPE = "chart_type";
  @SerializedName(SERIALIZED_NAME_CHART_TYPE)
  private Reportsv3ChartType chartType = Reportsv3ChartType.UNDEFINED_CHART_TYPE;

  public static final String SERIALIZED_NAME_UPDATE_MASK = "update_mask";
  @SerializedName(SERIALIZED_NAME_UPDATE_MASK)
  private ProtobufFieldMask updateMask;

  public Reportsv3PartialChartUpdateRequest() {
  }

  public Reportsv3PartialChartUpdateRequest chartId(String chartId) {
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


  public Reportsv3PartialChartUpdateRequest chartTitle(String chartTitle) {
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


  public Reportsv3PartialChartUpdateRequest chartType(Reportsv3ChartType chartType) {
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


  public Reportsv3PartialChartUpdateRequest updateMask(ProtobufFieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

   /**
   * Get updateMask
   * @return updateMask
  **/
  @javax.annotation.Nullable
  public ProtobufFieldMask getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(ProtobufFieldMask updateMask) {
    this.updateMask = updateMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3PartialChartUpdateRequest reportsv3PartialChartUpdateRequest = (Reportsv3PartialChartUpdateRequest) o;
    return Objects.equals(this.chartId, reportsv3PartialChartUpdateRequest.chartId) &&
        Objects.equals(this.chartTitle, reportsv3PartialChartUpdateRequest.chartTitle) &&
        Objects.equals(this.chartType, reportsv3PartialChartUpdateRequest.chartType) &&
        Objects.equals(this.updateMask, reportsv3PartialChartUpdateRequest.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, chartTitle, chartType, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3PartialChartUpdateRequest {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartTitle: ").append(toIndentedString(chartTitle)).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
    openapiFields.add("update_mask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3PartialChartUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3PartialChartUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3PartialChartUpdateRequest is not found in the empty JSON string", Reportsv3PartialChartUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3PartialChartUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3PartialChartUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `update_mask`
      if (jsonObj.get("update_mask") != null && !jsonObj.get("update_mask").isJsonNull()) {
        ProtobufFieldMask.validateJsonElement(jsonObj.get("update_mask"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3PartialChartUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3PartialChartUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3PartialChartUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3PartialChartUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3PartialChartUpdateRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3PartialChartUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3PartialChartUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3PartialChartUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3PartialChartUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3PartialChartUpdateRequest
  */
  public static Reportsv3PartialChartUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3PartialChartUpdateRequest.class);
  }

 /**
  * Convert an instance of Reportsv3PartialChartUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

