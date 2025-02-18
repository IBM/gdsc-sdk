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
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * EmergingRiskDetails is the information for emerging risks.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3EmergingRiskDetails {
  public static final String SERIALIZED_NAME_END_MAX_TIME = "end_max_time";
  @SerializedName(SERIALIZED_NAME_END_MAX_TIME)
  private OffsetDateTime endMaxTime;

  public static final String SERIALIZED_NAME_END_MAX_VALUE = "end_max_value";
  @SerializedName(SERIALIZED_NAME_END_MAX_VALUE)
  private Integer endMaxValue;

  public static final String SERIALIZED_NAME_PEAK_MAX_TIME = "peak_max_time";
  @SerializedName(SERIALIZED_NAME_PEAK_MAX_TIME)
  private OffsetDateTime peakMaxTime;

  public static final String SERIALIZED_NAME_PEAK_MAX_VALUE = "peak_max_value";
  @SerializedName(SERIALIZED_NAME_PEAK_MAX_VALUE)
  private Integer peakMaxValue;

  public static final String SERIALIZED_NAME_PREVIOUS_MAX_VALUE = "previous_max_value";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_MAX_VALUE)
  private Integer previousMaxValue;

  public static final String SERIALIZED_NAME_RISK_FEATURES = "risk_features";
  @SerializedName(SERIALIZED_NAME_RISK_FEATURES)
  private String riskFeatures;

  public static final String SERIALIZED_NAME_START_MAX_TIME = "start_max_time";
  @SerializedName(SERIALIZED_NAME_START_MAX_TIME)
  private OffsetDateTime startMaxTime;

  public static final String SERIALIZED_NAME_START_MAX_VALUE = "start_max_value";
  @SerializedName(SERIALIZED_NAME_START_MAX_VALUE)
  private Integer startMaxValue;

  public Riskanalyticscontrollerv3EmergingRiskDetails() {
  }

  public Riskanalyticscontrollerv3EmergingRiskDetails endMaxTime(OffsetDateTime endMaxTime) {
    this.endMaxTime = endMaxTime;
    return this;
  }

   /**
   * Time of the last max value.
   * @return endMaxTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndMaxTime() {
    return endMaxTime;
  }

  public void setEndMaxTime(OffsetDateTime endMaxTime) {
    this.endMaxTime = endMaxTime;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails endMaxValue(Integer endMaxValue) {
    this.endMaxValue = endMaxValue;
    return this;
  }

   /**
   * Value of the last max value.
   * @return endMaxValue
  **/
  @javax.annotation.Nullable
  public Integer getEndMaxValue() {
    return endMaxValue;
  }

  public void setEndMaxValue(Integer endMaxValue) {
    this.endMaxValue = endMaxValue;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails peakMaxTime(OffsetDateTime peakMaxTime) {
    this.peakMaxTime = peakMaxTime;
    return this;
  }

   /**
   * Time of the peak max value.
   * @return peakMaxTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getPeakMaxTime() {
    return peakMaxTime;
  }

  public void setPeakMaxTime(OffsetDateTime peakMaxTime) {
    this.peakMaxTime = peakMaxTime;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails peakMaxValue(Integer peakMaxValue) {
    this.peakMaxValue = peakMaxValue;
    return this;
  }

   /**
   * Value of the peak max value.
   * @return peakMaxValue
  **/
  @javax.annotation.Nullable
  public Integer getPeakMaxValue() {
    return peakMaxValue;
  }

  public void setPeakMaxValue(Integer peakMaxValue) {
    this.peakMaxValue = peakMaxValue;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails previousMaxValue(Integer previousMaxValue) {
    this.previousMaxValue = previousMaxValue;
    return this;
  }

   /**
   * Value of the previous max value.
   * @return previousMaxValue
  **/
  @javax.annotation.Nullable
  public Integer getPreviousMaxValue() {
    return previousMaxValue;
  }

  public void setPreviousMaxValue(Integer previousMaxValue) {
    this.previousMaxValue = previousMaxValue;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails riskFeatures(String riskFeatures) {
    this.riskFeatures = riskFeatures;
    return this;
  }

   /**
   * Features of the risk in JSON format.
   * @return riskFeatures
  **/
  @javax.annotation.Nullable
  public String getRiskFeatures() {
    return riskFeatures;
  }

  public void setRiskFeatures(String riskFeatures) {
    this.riskFeatures = riskFeatures;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails startMaxTime(OffsetDateTime startMaxTime) {
    this.startMaxTime = startMaxTime;
    return this;
  }

   /**
   * Time of the first max value.
   * @return startMaxTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartMaxTime() {
    return startMaxTime;
  }

  public void setStartMaxTime(OffsetDateTime startMaxTime) {
    this.startMaxTime = startMaxTime;
  }


  public Riskanalyticscontrollerv3EmergingRiskDetails startMaxValue(Integer startMaxValue) {
    this.startMaxValue = startMaxValue;
    return this;
  }

   /**
   * Value of the first max value.
   * @return startMaxValue
  **/
  @javax.annotation.Nullable
  public Integer getStartMaxValue() {
    return startMaxValue;
  }

  public void setStartMaxValue(Integer startMaxValue) {
    this.startMaxValue = startMaxValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3EmergingRiskDetails riskanalyticscontrollerv3EmergingRiskDetails = (Riskanalyticscontrollerv3EmergingRiskDetails) o;
    return Objects.equals(this.endMaxTime, riskanalyticscontrollerv3EmergingRiskDetails.endMaxTime) &&
        Objects.equals(this.endMaxValue, riskanalyticscontrollerv3EmergingRiskDetails.endMaxValue) &&
        Objects.equals(this.peakMaxTime, riskanalyticscontrollerv3EmergingRiskDetails.peakMaxTime) &&
        Objects.equals(this.peakMaxValue, riskanalyticscontrollerv3EmergingRiskDetails.peakMaxValue) &&
        Objects.equals(this.previousMaxValue, riskanalyticscontrollerv3EmergingRiskDetails.previousMaxValue) &&
        Objects.equals(this.riskFeatures, riskanalyticscontrollerv3EmergingRiskDetails.riskFeatures) &&
        Objects.equals(this.startMaxTime, riskanalyticscontrollerv3EmergingRiskDetails.startMaxTime) &&
        Objects.equals(this.startMaxValue, riskanalyticscontrollerv3EmergingRiskDetails.startMaxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMaxTime, endMaxValue, peakMaxTime, peakMaxValue, previousMaxValue, riskFeatures, startMaxTime, startMaxValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3EmergingRiskDetails {\n");
    sb.append("    endMaxTime: ").append(toIndentedString(endMaxTime)).append("\n");
    sb.append("    endMaxValue: ").append(toIndentedString(endMaxValue)).append("\n");
    sb.append("    peakMaxTime: ").append(toIndentedString(peakMaxTime)).append("\n");
    sb.append("    peakMaxValue: ").append(toIndentedString(peakMaxValue)).append("\n");
    sb.append("    previousMaxValue: ").append(toIndentedString(previousMaxValue)).append("\n");
    sb.append("    riskFeatures: ").append(toIndentedString(riskFeatures)).append("\n");
    sb.append("    startMaxTime: ").append(toIndentedString(startMaxTime)).append("\n");
    sb.append("    startMaxValue: ").append(toIndentedString(startMaxValue)).append("\n");
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
    openapiFields.add("end_max_time");
    openapiFields.add("end_max_value");
    openapiFields.add("peak_max_time");
    openapiFields.add("peak_max_value");
    openapiFields.add("previous_max_value");
    openapiFields.add("risk_features");
    openapiFields.add("start_max_time");
    openapiFields.add("start_max_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3EmergingRiskDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3EmergingRiskDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3EmergingRiskDetails is not found in the empty JSON string", Riskanalyticscontrollerv3EmergingRiskDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3EmergingRiskDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3EmergingRiskDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("risk_features") != null && !jsonObj.get("risk_features").isJsonNull()) && !jsonObj.get("risk_features").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_features` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk_features").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3EmergingRiskDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3EmergingRiskDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3EmergingRiskDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3EmergingRiskDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3EmergingRiskDetails>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3EmergingRiskDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3EmergingRiskDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3EmergingRiskDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3EmergingRiskDetails
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3EmergingRiskDetails
  */
  public static Riskanalyticscontrollerv3EmergingRiskDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3EmergingRiskDetails.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3EmergingRiskDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

