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
import com.ibm.gdsc.sdk.Riskanalyticscontrollerv3EmergingRiskDetails;
import com.ibm.gdsc.sdk.Riskanalyticscontrollerv3ObservationReportFilter;
import com.ibm.gdsc.sdk.Riskanalyticsenginev3Feature;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Risk observation details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3RiskObservationDetails {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_DATE_FROM = "date_from";
  @SerializedName(SERIALIZED_NAME_DATE_FROM)
  private OffsetDateTime dateFrom;

  public static final String SERIALIZED_NAME_DATE_TO = "date_to";
  @SerializedName(SERIALIZED_NAME_DATE_TO)
  private OffsetDateTime dateTo;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMERGING_RISK_DETAILS = "emerging_risk_details";
  @SerializedName(SERIALIZED_NAME_EMERGING_RISK_DETAILS)
  private Riskanalyticscontrollerv3EmergingRiskDetails emergingRiskDetails;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<Riskanalyticsenginev3Feature> features = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_FILTERS = "report_filters";
  @SerializedName(SERIALIZED_NAME_REPORT_FILTERS)
  private List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public Riskanalyticscontrollerv3RiskObservationDetails() {
  }

  public Riskanalyticscontrollerv3RiskObservationDetails classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Get classification
   * @return classification
  **/
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails dateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Start date in format YYYY-MM-DDTHH:mm:ssZ.
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails dateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * End updated date in format YYYY-MM-DDTHH:mm:ssZ.
   * @return dateTo
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateTo() {
    return dateTo;
  }

  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails emergingRiskDetails(Riskanalyticscontrollerv3EmergingRiskDetails emergingRiskDetails) {
    this.emergingRiskDetails = emergingRiskDetails;
    return this;
  }

   /**
   * Get emergingRiskDetails
   * @return emergingRiskDetails
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3EmergingRiskDetails getEmergingRiskDetails() {
    return emergingRiskDetails;
  }

  public void setEmergingRiskDetails(Riskanalyticscontrollerv3EmergingRiskDetails emergingRiskDetails) {
    this.emergingRiskDetails = emergingRiskDetails;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails features(List<Riskanalyticsenginev3Feature> features) {
    this.features = features;
    return this;
  }

  public Riskanalyticscontrollerv3RiskObservationDetails addFeaturesItem(Riskanalyticsenginev3Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Features list based on the requested lead_feature_id.
   * @return features
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsenginev3Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Riskanalyticsenginev3Feature> features) {
    this.features = features;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails reportFilters(List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public Riskanalyticscontrollerv3RiskObservationDetails addReportFiltersItem(Riskanalyticscontrollerv3ObservationReportFilter reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new ArrayList<>();
    }
    this.reportFilters.add(reportFiltersItem);
    return this;
  }

   /**
   * List of headers and values for filtering the report based on pivot information.
   * @return reportFilters
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3ObservationReportFilter> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(List<Riskanalyticscontrollerv3ObservationReportFilter> reportFilters) {
    this.reportFilters = reportFilters;
  }


  public Riskanalyticscontrollerv3RiskObservationDetails reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Report id based on the requested ObservationType.
   * @return reportId
  **/
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3RiskObservationDetails riskanalyticscontrollerv3RiskObservationDetails = (Riskanalyticscontrollerv3RiskObservationDetails) o;
    return Objects.equals(this.classification, riskanalyticscontrollerv3RiskObservationDetails.classification) &&
        Objects.equals(this.dateFrom, riskanalyticscontrollerv3RiskObservationDetails.dateFrom) &&
        Objects.equals(this.dateTo, riskanalyticscontrollerv3RiskObservationDetails.dateTo) &&
        Objects.equals(this.description, riskanalyticscontrollerv3RiskObservationDetails.description) &&
        Objects.equals(this.emergingRiskDetails, riskanalyticscontrollerv3RiskObservationDetails.emergingRiskDetails) &&
        Objects.equals(this.features, riskanalyticscontrollerv3RiskObservationDetails.features) &&
        Objects.equals(this.reportFilters, riskanalyticscontrollerv3RiskObservationDetails.reportFilters) &&
        Objects.equals(this.reportId, riskanalyticscontrollerv3RiskObservationDetails.reportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, dateFrom, dateTo, description, emergingRiskDetails, features, reportFilters, reportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3RiskObservationDetails {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emergingRiskDetails: ").append(toIndentedString(emergingRiskDetails)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("date_from");
    openapiFields.add("date_to");
    openapiFields.add("description");
    openapiFields.add("emerging_risk_details");
    openapiFields.add("features");
    openapiFields.add("report_filters");
    openapiFields.add("report_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3RiskObservationDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3RiskObservationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3RiskObservationDetails is not found in the empty JSON string", Riskanalyticscontrollerv3RiskObservationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3RiskObservationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3RiskObservationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `emerging_risk_details`
      if (jsonObj.get("emerging_risk_details") != null && !jsonObj.get("emerging_risk_details").isJsonNull()) {
        Riskanalyticscontrollerv3EmergingRiskDetails.validateJsonElement(jsonObj.get("emerging_risk_details"));
      }
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
        if (jsonArrayfeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("features").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
          }

          // validate the optional field `features` (array)
          for (int i = 0; i < jsonArrayfeatures.size(); i++) {
            Riskanalyticsenginev3Feature.validateJsonElement(jsonArrayfeatures.get(i));
          };
        }
      }
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
      if ((jsonObj.get("report_id") != null && !jsonObj.get("report_id").isJsonNull()) && !jsonObj.get("report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3RiskObservationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3RiskObservationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3RiskObservationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3RiskObservationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3RiskObservationDetails>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3RiskObservationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3RiskObservationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3RiskObservationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3RiskObservationDetails
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3RiskObservationDetails
  */
  public static Riskanalyticscontrollerv3RiskObservationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3RiskObservationDetails.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3RiskObservationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

