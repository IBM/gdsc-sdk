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
import com.ibm.security.guardium.Reportsv3DateRange;
import com.ibm.security.guardium.Reportsv3ModelType;
import com.ibm.security.guardium.Reportsv3ReportDefinition;
import com.ibm.security.guardium.Reportsv3ReportHeader;
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
 * Reportsrunnerv3GetReportColumnFacetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3GetReportColumnFacetRequest {
  public static final String SERIALIZED_NAME_DATE_RANGE = "date_range";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE)
  private Reportsv3DateRange dateRange;

  public static final String SERIALIZED_NAME_FACET_SELECTED_HEADER = "facet_selected_header";
  @SerializedName(SERIALIZED_NAME_FACET_SELECTED_HEADER)
  private Reportsv3ReportHeader facetSelectedHeader;

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

  public Reportsrunnerv3GetReportColumnFacetRequest() {
  }

  public Reportsrunnerv3GetReportColumnFacetRequest dateRange(Reportsv3DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nullable
  public Reportsv3DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(Reportsv3DateRange dateRange) {
    this.dateRange = dateRange;
  }


  public Reportsrunnerv3GetReportColumnFacetRequest facetSelectedHeader(Reportsv3ReportHeader facetSelectedHeader) {
    this.facetSelectedHeader = facetSelectedHeader;
    return this;
  }

   /**
   * Get facetSelectedHeader
   * @return facetSelectedHeader
  **/
  @javax.annotation.Nullable
  public Reportsv3ReportHeader getFacetSelectedHeader() {
    return facetSelectedHeader;
  }

  public void setFacetSelectedHeader(Reportsv3ReportHeader facetSelectedHeader) {
    this.facetSelectedHeader = facetSelectedHeader;
  }


  public Reportsrunnerv3GetReportColumnFacetRequest modelType(Reportsv3ModelType modelType) {
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


  public Reportsrunnerv3GetReportColumnFacetRequest reportDefinition(Reportsv3ReportDefinition reportDefinition) {
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


  public Reportsrunnerv3GetReportColumnFacetRequest runtimeParameterList(List<Reportsv3RunTimeParameter> runtimeParameterList) {
    this.runtimeParameterList = runtimeParameterList;
    return this;
  }

  public Reportsrunnerv3GetReportColumnFacetRequest addRuntimeParameterListItem(Reportsv3RunTimeParameter runtimeParameterListItem) {
    if (this.runtimeParameterList == null) {
      this.runtimeParameterList = new ArrayList<>();
    }
    this.runtimeParameterList.add(runtimeParameterListItem);
    return this;
  }

   /**
   * List of runtime parameter if needed.
   * @return runtimeParameterList
  **/
  @javax.annotation.Nullable
  public List<Reportsv3RunTimeParameter> getRuntimeParameterList() {
    return runtimeParameterList;
  }

  public void setRuntimeParameterList(List<Reportsv3RunTimeParameter> runtimeParameterList) {
    this.runtimeParameterList = runtimeParameterList;
  }


  public Reportsrunnerv3GetReportColumnFacetRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone.
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
    Reportsrunnerv3GetReportColumnFacetRequest reportsrunnerv3GetReportColumnFacetRequest = (Reportsrunnerv3GetReportColumnFacetRequest) o;
    return Objects.equals(this.dateRange, reportsrunnerv3GetReportColumnFacetRequest.dateRange) &&
        Objects.equals(this.facetSelectedHeader, reportsrunnerv3GetReportColumnFacetRequest.facetSelectedHeader) &&
        Objects.equals(this.modelType, reportsrunnerv3GetReportColumnFacetRequest.modelType) &&
        Objects.equals(this.reportDefinition, reportsrunnerv3GetReportColumnFacetRequest.reportDefinition) &&
        Objects.equals(this.runtimeParameterList, reportsrunnerv3GetReportColumnFacetRequest.runtimeParameterList) &&
        Objects.equals(this.timeZone, reportsrunnerv3GetReportColumnFacetRequest.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRange, facetSelectedHeader, modelType, reportDefinition, runtimeParameterList, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3GetReportColumnFacetRequest {\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    facetSelectedHeader: ").append(toIndentedString(facetSelectedHeader)).append("\n");
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
    openapiFields.add("date_range");
    openapiFields.add("facet_selected_header");
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
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3GetReportColumnFacetRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3GetReportColumnFacetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3GetReportColumnFacetRequest is not found in the empty JSON string", Reportsrunnerv3GetReportColumnFacetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3GetReportColumnFacetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3GetReportColumnFacetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `date_range`
      if (jsonObj.get("date_range") != null && !jsonObj.get("date_range").isJsonNull()) {
        Reportsv3DateRange.validateJsonElement(jsonObj.get("date_range"));
      }
      // validate the optional field `facet_selected_header`
      if (jsonObj.get("facet_selected_header") != null && !jsonObj.get("facet_selected_header").isJsonNull()) {
        Reportsv3ReportHeader.validateJsonElement(jsonObj.get("facet_selected_header"));
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
       if (!Reportsrunnerv3GetReportColumnFacetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3GetReportColumnFacetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3GetReportColumnFacetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3GetReportColumnFacetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3GetReportColumnFacetRequest>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3GetReportColumnFacetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3GetReportColumnFacetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3GetReportColumnFacetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3GetReportColumnFacetRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3GetReportColumnFacetRequest
  */
  public static Reportsrunnerv3GetReportColumnFacetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3GetReportColumnFacetRequest.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3GetReportColumnFacetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

