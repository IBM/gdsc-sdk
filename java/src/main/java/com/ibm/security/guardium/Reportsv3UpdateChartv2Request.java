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
 * UpdateChartv2Request is the argument type used to update a VEGA chart.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3UpdateChartv2Request {
  public static final String SERIALIZED_NAME_CHART_ID = "chart_id";
  @SerializedName(SERIALIZED_NAME_CHART_ID)
  private String chartId;

  public static final String SERIALIZED_NAME_CHART_SETTINGS_V2 = "chart_settings_v2";
  @SerializedName(SERIALIZED_NAME_CHART_SETTINGS_V2)
  private Reportsv3ChartSettingsv2 chartSettingsV2;

  public static final String SERIALIZED_NAME_PRIMARY_CATEGORY = "primary_category";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CATEGORY)
  private Integer primaryCategory;

  public static final String SERIALIZED_NAME_PRIMARY_MEASURE = "primary_measure";
  @SerializedName(SERIALIZED_NAME_PRIMARY_MEASURE)
  private Integer primaryMeasure;

  public static final String SERIALIZED_NAME_SECONDARY_CATEGORY = "secondary_category";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CATEGORY)
  private Integer secondaryCategory;

  public static final String SERIALIZED_NAME_SECONDARY_MEASURE = "secondary_measure";
  @SerializedName(SERIALIZED_NAME_SECONDARY_MEASURE)
  private Integer secondaryMeasure;

  public static final String SERIALIZED_NAME_TERTIARY_CATEGORY = "tertiary_category";
  @SerializedName(SERIALIZED_NAME_TERTIARY_CATEGORY)
  private Integer tertiaryCategory;

  public static final String SERIALIZED_NAME_TERTIARY_MEASURE = "tertiary_measure";
  @SerializedName(SERIALIZED_NAME_TERTIARY_MEASURE)
  private Integer tertiaryMeasure;

  public static final String SERIALIZED_NAME_VEGA_DEFINITION = "vega_definition";
  @SerializedName(SERIALIZED_NAME_VEGA_DEFINITION)
  private String vegaDefinition;

  public Reportsv3UpdateChartv2Request() {
  }

  public Reportsv3UpdateChartv2Request chartId(String chartId) {
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


  public Reportsv3UpdateChartv2Request chartSettingsV2(Reportsv3ChartSettingsv2 chartSettingsV2) {
    this.chartSettingsV2 = chartSettingsV2;
    return this;
  }

   /**
   * Get chartSettingsV2
   * @return chartSettingsV2
  **/
  @javax.annotation.Nullable
  public Reportsv3ChartSettingsv2 getChartSettingsV2() {
    return chartSettingsV2;
  }

  public void setChartSettingsV2(Reportsv3ChartSettingsv2 chartSettingsV2) {
    this.chartSettingsV2 = chartSettingsV2;
  }


  public Reportsv3UpdateChartv2Request primaryCategory(Integer primaryCategory) {
    this.primaryCategory = primaryCategory;
    return this;
  }

   /**
   * Get primaryCategory
   * @return primaryCategory
  **/
  @javax.annotation.Nullable
  public Integer getPrimaryCategory() {
    return primaryCategory;
  }

  public void setPrimaryCategory(Integer primaryCategory) {
    this.primaryCategory = primaryCategory;
  }


  public Reportsv3UpdateChartv2Request primaryMeasure(Integer primaryMeasure) {
    this.primaryMeasure = primaryMeasure;
    return this;
  }

   /**
   * Get primaryMeasure
   * @return primaryMeasure
  **/
  @javax.annotation.Nullable
  public Integer getPrimaryMeasure() {
    return primaryMeasure;
  }

  public void setPrimaryMeasure(Integer primaryMeasure) {
    this.primaryMeasure = primaryMeasure;
  }


  public Reportsv3UpdateChartv2Request secondaryCategory(Integer secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
    return this;
  }

   /**
   * Get secondaryCategory
   * @return secondaryCategory
  **/
  @javax.annotation.Nullable
  public Integer getSecondaryCategory() {
    return secondaryCategory;
  }

  public void setSecondaryCategory(Integer secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
  }


  public Reportsv3UpdateChartv2Request secondaryMeasure(Integer secondaryMeasure) {
    this.secondaryMeasure = secondaryMeasure;
    return this;
  }

   /**
   * Get secondaryMeasure
   * @return secondaryMeasure
  **/
  @javax.annotation.Nullable
  public Integer getSecondaryMeasure() {
    return secondaryMeasure;
  }

  public void setSecondaryMeasure(Integer secondaryMeasure) {
    this.secondaryMeasure = secondaryMeasure;
  }


  public Reportsv3UpdateChartv2Request tertiaryCategory(Integer tertiaryCategory) {
    this.tertiaryCategory = tertiaryCategory;
    return this;
  }

   /**
   * Get tertiaryCategory
   * @return tertiaryCategory
  **/
  @javax.annotation.Nullable
  public Integer getTertiaryCategory() {
    return tertiaryCategory;
  }

  public void setTertiaryCategory(Integer tertiaryCategory) {
    this.tertiaryCategory = tertiaryCategory;
  }


  public Reportsv3UpdateChartv2Request tertiaryMeasure(Integer tertiaryMeasure) {
    this.tertiaryMeasure = tertiaryMeasure;
    return this;
  }

   /**
   * Get tertiaryMeasure
   * @return tertiaryMeasure
  **/
  @javax.annotation.Nullable
  public Integer getTertiaryMeasure() {
    return tertiaryMeasure;
  }

  public void setTertiaryMeasure(Integer tertiaryMeasure) {
    this.tertiaryMeasure = tertiaryMeasure;
  }


  public Reportsv3UpdateChartv2Request vegaDefinition(String vegaDefinition) {
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
    Reportsv3UpdateChartv2Request reportsv3UpdateChartv2Request = (Reportsv3UpdateChartv2Request) o;
    return Objects.equals(this.chartId, reportsv3UpdateChartv2Request.chartId) &&
        Objects.equals(this.chartSettingsV2, reportsv3UpdateChartv2Request.chartSettingsV2) &&
        Objects.equals(this.primaryCategory, reportsv3UpdateChartv2Request.primaryCategory) &&
        Objects.equals(this.primaryMeasure, reportsv3UpdateChartv2Request.primaryMeasure) &&
        Objects.equals(this.secondaryCategory, reportsv3UpdateChartv2Request.secondaryCategory) &&
        Objects.equals(this.secondaryMeasure, reportsv3UpdateChartv2Request.secondaryMeasure) &&
        Objects.equals(this.tertiaryCategory, reportsv3UpdateChartv2Request.tertiaryCategory) &&
        Objects.equals(this.tertiaryMeasure, reportsv3UpdateChartv2Request.tertiaryMeasure) &&
        Objects.equals(this.vegaDefinition, reportsv3UpdateChartv2Request.vegaDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartId, chartSettingsV2, primaryCategory, primaryMeasure, secondaryCategory, secondaryMeasure, tertiaryCategory, tertiaryMeasure, vegaDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3UpdateChartv2Request {\n");
    sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
    sb.append("    chartSettingsV2: ").append(toIndentedString(chartSettingsV2)).append("\n");
    sb.append("    primaryCategory: ").append(toIndentedString(primaryCategory)).append("\n");
    sb.append("    primaryMeasure: ").append(toIndentedString(primaryMeasure)).append("\n");
    sb.append("    secondaryCategory: ").append(toIndentedString(secondaryCategory)).append("\n");
    sb.append("    secondaryMeasure: ").append(toIndentedString(secondaryMeasure)).append("\n");
    sb.append("    tertiaryCategory: ").append(toIndentedString(tertiaryCategory)).append("\n");
    sb.append("    tertiaryMeasure: ").append(toIndentedString(tertiaryMeasure)).append("\n");
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
    openapiFields.add("chart_id");
    openapiFields.add("chart_settings_v2");
    openapiFields.add("primary_category");
    openapiFields.add("primary_measure");
    openapiFields.add("secondary_category");
    openapiFields.add("secondary_measure");
    openapiFields.add("tertiary_category");
    openapiFields.add("tertiary_measure");
    openapiFields.add("vega_definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3UpdateChartv2Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3UpdateChartv2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3UpdateChartv2Request is not found in the empty JSON string", Reportsv3UpdateChartv2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3UpdateChartv2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3UpdateChartv2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chart_id") != null && !jsonObj.get("chart_id").isJsonNull()) && !jsonObj.get("chart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chart_id").toString()));
      }
      // validate the optional field `chart_settings_v2`
      if (jsonObj.get("chart_settings_v2") != null && !jsonObj.get("chart_settings_v2").isJsonNull()) {
        Reportsv3ChartSettingsv2.validateJsonElement(jsonObj.get("chart_settings_v2"));
      }
      if ((jsonObj.get("vega_definition") != null && !jsonObj.get("vega_definition").isJsonNull()) && !jsonObj.get("vega_definition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vega_definition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vega_definition").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3UpdateChartv2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3UpdateChartv2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3UpdateChartv2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3UpdateChartv2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3UpdateChartv2Request>() {
           @Override
           public void write(JsonWriter out, Reportsv3UpdateChartv2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3UpdateChartv2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3UpdateChartv2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3UpdateChartv2Request
  * @throws IOException if the JSON string is invalid with respect to Reportsv3UpdateChartv2Request
  */
  public static Reportsv3UpdateChartv2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3UpdateChartv2Request.class);
  }

 /**
  * Convert an instance of Reportsv3UpdateChartv2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

