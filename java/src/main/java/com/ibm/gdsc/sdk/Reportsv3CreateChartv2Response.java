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
 * CreateChartv2Response contains the chart id of the newly created VEGA chart.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3CreateChartv2Response {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public Reportsv3CreateChartv2Response() {
  }

  public Reportsv3CreateChartv2Response chartId(String chartId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3CreateChartv2Response reportsv3CreateChartv2Response = (Reportsv3CreateChartv2Response) o;
    return Objects.equals(this.chartId, reportsv3CreateChartv2Response.chartId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3CreateChartv2Response {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3CreateChartv2Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3CreateChartv2Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3CreateChartv2Response is not found in the empty JSON string", Reportsv3CreateChartv2Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3CreateChartv2Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3CreateChartv2Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3CreateChartv2Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3CreateChartv2Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3CreateChartv2Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3CreateChartv2Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3CreateChartv2Response>() {
           @Override
           public void write(JsonWriter out, Reportsv3CreateChartv2Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3CreateChartv2Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3CreateChartv2Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3CreateChartv2Response
  * @throws IOException if the JSON string is invalid with respect to Reportsv3CreateChartv2Response
  */
  public static Reportsv3CreateChartv2Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3CreateChartv2Response.class);
  }

 /**
  * Convert an instance of Reportsv3CreateChartv2Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

