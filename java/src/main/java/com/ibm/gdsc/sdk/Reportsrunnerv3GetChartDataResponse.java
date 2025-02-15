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
import com.ibm.gdsc.sdk.Reportsrunnerv3DataRow;
import com.ibm.gdsc.sdk.Reportsv3ChartDisplayLayout;
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

import com.ibm.gdsc.JSON;

/**
 * GetChartDataResponse is the return type of GetChartData API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3GetChartDataResponse {
  public static final String SERIALIZED_NAME_CHART_LAYOUT = "chart_layout";
  @SerializedName(SERIALIZED_NAME_CHART_LAYOUT)
  private Reportsv3ChartDisplayLayout chartLayout;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Reportsrunnerv3DataRow> data = new ArrayList<>();

  public Reportsrunnerv3GetChartDataResponse() {
  }

  public Reportsrunnerv3GetChartDataResponse chartLayout(Reportsv3ChartDisplayLayout chartLayout) {
    this.chartLayout = chartLayout;
    return this;
  }

   /**
   * Get chartLayout
   * @return chartLayout
  **/
  @javax.annotation.Nullable
  public Reportsv3ChartDisplayLayout getChartLayout() {
    return chartLayout;
  }

  public void setChartLayout(Reportsv3ChartDisplayLayout chartLayout) {
    this.chartLayout = chartLayout;
  }


  public Reportsrunnerv3GetChartDataResponse data(List<Reportsrunnerv3DataRow> data) {
    this.data = data;
    return this;
  }

  public Reportsrunnerv3GetChartDataResponse addDataItem(Reportsrunnerv3DataRow dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Chart data.
   * @return data
  **/
  @javax.annotation.Nullable
  public List<Reportsrunnerv3DataRow> getData() {
    return data;
  }

  public void setData(List<Reportsrunnerv3DataRow> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3GetChartDataResponse reportsrunnerv3GetChartDataResponse = (Reportsrunnerv3GetChartDataResponse) o;
    return Objects.equals(this.chartLayout, reportsrunnerv3GetChartDataResponse.chartLayout) &&
        Objects.equals(this.data, reportsrunnerv3GetChartDataResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartLayout, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3GetChartDataResponse {\n");
    sb.append("    chartLayout: ").append(toIndentedString(chartLayout)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("chart_layout");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3GetChartDataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3GetChartDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3GetChartDataResponse is not found in the empty JSON string", Reportsrunnerv3GetChartDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3GetChartDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3GetChartDataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `chart_layout`
      if (jsonObj.get("chart_layout") != null && !jsonObj.get("chart_layout").isJsonNull()) {
        Reportsv3ChartDisplayLayout.validateJsonElement(jsonObj.get("chart_layout"));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            Reportsrunnerv3DataRow.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3GetChartDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3GetChartDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3GetChartDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3GetChartDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3GetChartDataResponse>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3GetChartDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3GetChartDataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3GetChartDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3GetChartDataResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3GetChartDataResponse
  */
  public static Reportsrunnerv3GetChartDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3GetChartDataResponse.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3GetChartDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

