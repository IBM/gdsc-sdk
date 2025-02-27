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
import com.ibm.security.guardium.Riskanalyticscontrollerv3FindingDetails;
import com.ibm.security.guardium.Riskanalyticscontrollerv3FindingReferenceLink;
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
 * Contains a list of examples, reference links, in a finding category. If outlier finding, it could be HIGH_VOLUME, ERROR, NEW, and so on.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3FindingDetailsMap {
  public static final String SERIALIZED_NAME_FINDING_DETAILS = "finding_details";
  @SerializedName(SERIALIZED_NAME_FINDING_DETAILS)
  private Riskanalyticscontrollerv3FindingDetails findingDetails;

  public static final String SERIALIZED_NAME_FINDING_DETAILS_TYPE = "finding_details_type";
  @SerializedName(SERIALIZED_NAME_FINDING_DETAILS_TYPE)
  private String findingDetailsType;

  public static final String SERIALIZED_NAME_FINDING_REFERENCE = "finding_reference";
  @SerializedName(SERIALIZED_NAME_FINDING_REFERENCE)
  private Riskanalyticscontrollerv3FindingReferenceLink findingReference;

  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private String report;

  public Riskanalyticscontrollerv3FindingDetailsMap() {
  }

  public Riskanalyticscontrollerv3FindingDetailsMap findingDetails(Riskanalyticscontrollerv3FindingDetails findingDetails) {
    this.findingDetails = findingDetails;
    return this;
  }

   /**
   * Get findingDetails
   * @return findingDetails
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3FindingDetails getFindingDetails() {
    return findingDetails;
  }

  public void setFindingDetails(Riskanalyticscontrollerv3FindingDetails findingDetails) {
    this.findingDetails = findingDetails;
  }


  public Riskanalyticscontrollerv3FindingDetailsMap findingDetailsType(String findingDetailsType) {
    this.findingDetailsType = findingDetailsType;
    return this;
  }

   /**
   * Get findingDetailsType
   * @return findingDetailsType
  **/
  @javax.annotation.Nullable
  public String getFindingDetailsType() {
    return findingDetailsType;
  }

  public void setFindingDetailsType(String findingDetailsType) {
    this.findingDetailsType = findingDetailsType;
  }


  public Riskanalyticscontrollerv3FindingDetailsMap findingReference(Riskanalyticscontrollerv3FindingReferenceLink findingReference) {
    this.findingReference = findingReference;
    return this;
  }

   /**
   * Get findingReference
   * @return findingReference
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3FindingReferenceLink getFindingReference() {
    return findingReference;
  }

  public void setFindingReference(Riskanalyticscontrollerv3FindingReferenceLink findingReference) {
    this.findingReference = findingReference;
  }


  public Riskanalyticscontrollerv3FindingDetailsMap report(String report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @javax.annotation.Nullable
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3FindingDetailsMap riskanalyticscontrollerv3FindingDetailsMap = (Riskanalyticscontrollerv3FindingDetailsMap) o;
    return Objects.equals(this.findingDetails, riskanalyticscontrollerv3FindingDetailsMap.findingDetails) &&
        Objects.equals(this.findingDetailsType, riskanalyticscontrollerv3FindingDetailsMap.findingDetailsType) &&
        Objects.equals(this.findingReference, riskanalyticscontrollerv3FindingDetailsMap.findingReference) &&
        Objects.equals(this.report, riskanalyticscontrollerv3FindingDetailsMap.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findingDetails, findingDetailsType, findingReference, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3FindingDetailsMap {\n");
    sb.append("    findingDetails: ").append(toIndentedString(findingDetails)).append("\n");
    sb.append("    findingDetailsType: ").append(toIndentedString(findingDetailsType)).append("\n");
    sb.append("    findingReference: ").append(toIndentedString(findingReference)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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
    openapiFields.add("finding_details");
    openapiFields.add("finding_details_type");
    openapiFields.add("finding_reference");
    openapiFields.add("report");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3FindingDetailsMap
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3FindingDetailsMap.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3FindingDetailsMap is not found in the empty JSON string", Riskanalyticscontrollerv3FindingDetailsMap.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3FindingDetailsMap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3FindingDetailsMap` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `finding_details`
      if (jsonObj.get("finding_details") != null && !jsonObj.get("finding_details").isJsonNull()) {
        Riskanalyticscontrollerv3FindingDetails.validateJsonElement(jsonObj.get("finding_details"));
      }
      if ((jsonObj.get("finding_details_type") != null && !jsonObj.get("finding_details_type").isJsonNull()) && !jsonObj.get("finding_details_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finding_details_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finding_details_type").toString()));
      }
      // validate the optional field `finding_reference`
      if (jsonObj.get("finding_reference") != null && !jsonObj.get("finding_reference").isJsonNull()) {
        Riskanalyticscontrollerv3FindingReferenceLink.validateJsonElement(jsonObj.get("finding_reference"));
      }
      if ((jsonObj.get("report") != null && !jsonObj.get("report").isJsonNull()) && !jsonObj.get("report").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3FindingDetailsMap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3FindingDetailsMap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3FindingDetailsMap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3FindingDetailsMap.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3FindingDetailsMap>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3FindingDetailsMap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3FindingDetailsMap read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3FindingDetailsMap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3FindingDetailsMap
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3FindingDetailsMap
  */
  public static Riskanalyticscontrollerv3FindingDetailsMap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3FindingDetailsMap.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3FindingDetailsMap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

