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
import com.ibm.security.guardium.Riskanalyticscontrollerv3ObservationReportFilter;
import com.ibm.security.guardium.Riskanalyticscontrollerv3Statistics;
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
 * [risk-details] A reference link within a finding; used for representing a deep-link to relevant report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3FindingReferenceLink {
  public static final String SERIALIZED_NAME_REPORT_FILTERS = "report_filters";
  @SerializedName(SERIALIZED_NAME_REPORT_FILTERS)
  private List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private Riskanalyticscontrollerv3Statistics statistics;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TEXT_TEMPLATE = "text_template";
  @SerializedName(SERIALIZED_NAME_TEXT_TEMPLATE)
  private String textTemplate;

  public static final String SERIALIZED_NAME_TEXT_VARIABLES = "text_variables";
  @SerializedName(SERIALIZED_NAME_TEXT_VARIABLES)
  private List<String> textVariables = new ArrayList<>();

  public Riskanalyticscontrollerv3FindingReferenceLink() {
  }

  public Riskanalyticscontrollerv3FindingReferenceLink reportFilters(List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public Riskanalyticscontrollerv3FindingReferenceLink addReportFiltersItem(Riskanalyticscontrollerv3ObservationReportFilter reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new ArrayList<>();
    }
    this.reportFilters.add(reportFiltersItem);
    return this;
  }

   /**
   * Get reportFilters
   * @return reportFilters
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3ObservationReportFilter> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters) {
    this.reportFilters = reportFilters;
  }


  public Riskanalyticscontrollerv3FindingReferenceLink statistics(Riskanalyticscontrollerv3Statistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3Statistics getStatistics() {
    return statistics;
  }

  public void setStatistics(Riskanalyticscontrollerv3Statistics statistics) {
    this.statistics = statistics;
  }


  public Riskanalyticscontrollerv3FindingReferenceLink text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Final text, generated from text_template (localized) and text_variables (as-is).
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public Riskanalyticscontrollerv3FindingReferenceLink textTemplate(String textTemplate) {
    this.textTemplate = textTemplate;
    return this;
  }

   /**
   * Text template key in insights-nls project; used to create the final text for the UI, during the response.
   * @return textTemplate
  **/
  @javax.annotation.Nullable
  public String getTextTemplate() {
    return textTemplate;
  }

  public void setTextTemplate(String textTemplate) {
    this.textTemplate = textTemplate;
  }


  public Riskanalyticscontrollerv3FindingReferenceLink textVariables(List<String> textVariables) {
    this.textVariables = textVariables;
    return this;
  }

  public Riskanalyticscontrollerv3FindingReferenceLink addTextVariablesItem(String textVariablesItem) {
    if (this.textVariables == null) {
      this.textVariables = new ArrayList<>();
    }
    this.textVariables.add(textVariablesItem);
    return this;
  }

   /**
   * [optional] Variable text tokens that replace placeholders in the text template; ordered according to appearance in template.
   * @return textVariables
  **/
  @javax.annotation.Nullable
  public List<String> getTextVariables() {
    return textVariables;
  }

  public void setTextVariables(List<String> textVariables) {
    this.textVariables = textVariables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3FindingReferenceLink riskanalyticscontrollerv3FindingReferenceLink = (Riskanalyticscontrollerv3FindingReferenceLink) o;
    return Objects.equals(this.reportFilters, riskanalyticscontrollerv3FindingReferenceLink.reportFilters) &&
        Objects.equals(this.statistics, riskanalyticscontrollerv3FindingReferenceLink.statistics) &&
        Objects.equals(this.text, riskanalyticscontrollerv3FindingReferenceLink.text) &&
        Objects.equals(this.textTemplate, riskanalyticscontrollerv3FindingReferenceLink.textTemplate) &&
        Objects.equals(this.textVariables, riskanalyticscontrollerv3FindingReferenceLink.textVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFilters, statistics, text, textTemplate, textVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3FindingReferenceLink {\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textTemplate: ").append(toIndentedString(textTemplate)).append("\n");
    sb.append("    textVariables: ").append(toIndentedString(textVariables)).append("\n");
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
    openapiFields.add("report_filters");
    openapiFields.add("statistics");
    openapiFields.add("text");
    openapiFields.add("text_template");
    openapiFields.add("text_variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3FindingReferenceLink
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3FindingReferenceLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3FindingReferenceLink is not found in the empty JSON string", Riskanalyticscontrollerv3FindingReferenceLink.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3FindingReferenceLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3FindingReferenceLink` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("report_filters") != null && !jsonObj.get("report_filters").isJsonNull()) {
        JsonArray jsonArrayreportFilters = jsonObj.getAsJsonArray("report_filters");
        if (jsonArrayreportFilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_filters` to be an array in the JSON string but got `%s`", jsonObj.get("report_filters").toString()));
          }

          // validate the optional field `report_filters` (array)
          for (int i = 0; i < jsonArrayreportFilters.size(); i++) {
            Riskanalyticscontrollerv3ObservationReportFilter.validateJsonElement(jsonArrayreportFilters.get(i));
          };
        }
      }
      // validate the optional field `statistics`
      if (jsonObj.get("statistics") != null && !jsonObj.get("statistics").isJsonNull()) {
        Riskanalyticscontrollerv3Statistics.validateJsonElement(jsonObj.get("statistics"));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("text_template") != null && !jsonObj.get("text_template").isJsonNull()) && !jsonObj.get("text_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text_template").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("text_variables") != null && !jsonObj.get("text_variables").isJsonNull() && !jsonObj.get("text_variables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `text_variables` to be an array in the JSON string but got `%s`", jsonObj.get("text_variables").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3FindingReferenceLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3FindingReferenceLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3FindingReferenceLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3FindingReferenceLink.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3FindingReferenceLink>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3FindingReferenceLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3FindingReferenceLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3FindingReferenceLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3FindingReferenceLink
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3FindingReferenceLink
  */
  public static Riskanalyticscontrollerv3FindingReferenceLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3FindingReferenceLink.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3FindingReferenceLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

