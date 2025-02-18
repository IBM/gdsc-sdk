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
import com.ibm.gdsc.sdk.Reportsv3ChartSettingsv2;
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
 * GetChartSettingsv2Response is the return type which encapsulates a VEGA chart settings from the GetChartSettingsv2() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3GetChartSettingsv2Response {
  public static final String SERIALIZED_NAME_CHART_SETTINGS = "chart_settings";
  @SerializedName(SERIALIZED_NAME_CHART_SETTINGS)
  private List<Reportsv3ChartSettingsv2> chartSettings = new ArrayList<>();

  public Reportsv3GetChartSettingsv2Response() {
  }

  public Reportsv3GetChartSettingsv2Response chartSettings(List<Reportsv3ChartSettingsv2> chartSettings) {
    this.chartSettings = chartSettings;
    return this;
  }

  public Reportsv3GetChartSettingsv2Response addChartSettingsItem(Reportsv3ChartSettingsv2 chartSettingsItem) {
    if (this.chartSettings == null) {
      this.chartSettings = new ArrayList<>();
    }
    this.chartSettings.add(chartSettingsItem);
    return this;
  }

   /**
   * A new VEGA chart definition.
   * @return chartSettings
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ChartSettingsv2> getChartSettings() {
    return chartSettings;
  }

  public void setChartSettings(List<Reportsv3ChartSettingsv2> chartSettings) {
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
    Reportsv3GetChartSettingsv2Response reportsv3GetChartSettingsv2Response = (Reportsv3GetChartSettingsv2Response) o;
    return Objects.equals(this.chartSettings, reportsv3GetChartSettingsv2Response.chartSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetChartSettingsv2Response {\n");
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
    openapiFields.add("chart_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetChartSettingsv2Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetChartSettingsv2Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetChartSettingsv2Response is not found in the empty JSON string", Reportsv3GetChartSettingsv2Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetChartSettingsv2Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetChartSettingsv2Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("chart_settings") != null && !jsonObj.get("chart_settings").isJsonNull()) {
        JsonArray jsonArraychartSettings = jsonObj.getAsJsonArray("chart_settings");
        if (jsonArraychartSettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("chart_settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `chart_settings` to be an array in the JSON string but got `%s`", jsonObj.get("chart_settings").toString()));
          }

          // validate the optional field `chart_settings` (array)
          for (int i = 0; i < jsonArraychartSettings.size(); i++) {
            Reportsv3ChartSettingsv2.validateJsonElement(jsonArraychartSettings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetChartSettingsv2Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetChartSettingsv2Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetChartSettingsv2Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetChartSettingsv2Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetChartSettingsv2Response>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetChartSettingsv2Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetChartSettingsv2Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetChartSettingsv2Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetChartSettingsv2Response
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetChartSettingsv2Response
  */
  public static Reportsv3GetChartSettingsv2Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetChartSettingsv2Response.class);
  }

 /**
  * Convert an instance of Reportsv3GetChartSettingsv2Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

