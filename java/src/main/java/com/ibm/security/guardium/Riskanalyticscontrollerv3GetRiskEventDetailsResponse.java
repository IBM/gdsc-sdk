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
import com.ibm.security.guardium.Riskanalyticscontrollerv3EmergingRiskDetails;
import com.ibm.security.guardium.Riskanalyticscontrollerv3Observation;
import com.ibm.security.guardium.Riskanalyticscontrollerv3RiskEvent;
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
 * GetRiskEventDetailsResponse is the response object for GetRiskEventDetails API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3GetRiskEventDetailsResponse {
  public static final String SERIALIZED_NAME_EMERGING_RISK_DETAILS = "emerging_risk_details";
  @SerializedName(SERIALIZED_NAME_EMERGING_RISK_DETAILS)
  private Riskanalyticscontrollerv3EmergingRiskDetails emergingRiskDetails;

  public static final String SERIALIZED_NAME_OBSERVATIONS = "observations";
  @SerializedName(SERIALIZED_NAME_OBSERVATIONS)
  private List<Riskanalyticscontrollerv3Observation> observations = new ArrayList<>();

  public static final String SERIALIZED_NAME_RISK_EVENT = "risk_event";
  @SerializedName(SERIALIZED_NAME_RISK_EVENT)
  private Riskanalyticscontrollerv3RiskEvent riskEvent;

  public Riskanalyticscontrollerv3GetRiskEventDetailsResponse() {
  }

  public Riskanalyticscontrollerv3GetRiskEventDetailsResponse emergingRiskDetails(Riskanalyticscontrollerv3EmergingRiskDetails emergingRiskDetails) {
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


  public Riskanalyticscontrollerv3GetRiskEventDetailsResponse observations(List<Riskanalyticscontrollerv3Observation> observations) {
    this.observations = observations;
    return this;
  }

  public Riskanalyticscontrollerv3GetRiskEventDetailsResponse addObservationsItem(Riskanalyticscontrollerv3Observation observationsItem) {
    if (this.observations == null) {
      this.observations = new ArrayList<>();
    }
    this.observations.add(observationsItem);
    return this;
  }

   /**
   * Observations list.
   * @return observations
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticscontrollerv3Observation> getObservations() {
    return observations;
  }

  public void setObservations(List<Riskanalyticscontrollerv3Observation> observations) {
    this.observations = observations;
  }


  public Riskanalyticscontrollerv3GetRiskEventDetailsResponse riskEvent(Riskanalyticscontrollerv3RiskEvent riskEvent) {
    this.riskEvent = riskEvent;
    return this;
  }

   /**
   * Get riskEvent
   * @return riskEvent
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3RiskEvent getRiskEvent() {
    return riskEvent;
  }

  public void setRiskEvent(Riskanalyticscontrollerv3RiskEvent riskEvent) {
    this.riskEvent = riskEvent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3GetRiskEventDetailsResponse riskanalyticscontrollerv3GetRiskEventDetailsResponse = (Riskanalyticscontrollerv3GetRiskEventDetailsResponse) o;
    return Objects.equals(this.emergingRiskDetails, riskanalyticscontrollerv3GetRiskEventDetailsResponse.emergingRiskDetails) &&
        Objects.equals(this.observations, riskanalyticscontrollerv3GetRiskEventDetailsResponse.observations) &&
        Objects.equals(this.riskEvent, riskanalyticscontrollerv3GetRiskEventDetailsResponse.riskEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emergingRiskDetails, observations, riskEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3GetRiskEventDetailsResponse {\n");
    sb.append("    emergingRiskDetails: ").append(toIndentedString(emergingRiskDetails)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    riskEvent: ").append(toIndentedString(riskEvent)).append("\n");
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
    openapiFields.add("emerging_risk_details");
    openapiFields.add("observations");
    openapiFields.add("risk_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3GetRiskEventDetailsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3GetRiskEventDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3GetRiskEventDetailsResponse is not found in the empty JSON string", Riskanalyticscontrollerv3GetRiskEventDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3GetRiskEventDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3GetRiskEventDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `emerging_risk_details`
      if (jsonObj.get("emerging_risk_details") != null && !jsonObj.get("emerging_risk_details").isJsonNull()) {
        Riskanalyticscontrollerv3EmergingRiskDetails.validateJsonElement(jsonObj.get("emerging_risk_details"));
      }
      if (jsonObj.get("observations") != null && !jsonObj.get("observations").isJsonNull()) {
        JsonArray jsonArrayobservations = jsonObj.getAsJsonArray("observations");
        if (jsonArrayobservations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("observations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `observations` to be an array in the JSON string but got `%s`", jsonObj.get("observations").toString()));
          }

          // validate the optional field `observations` (array)
          for (int i = 0; i < jsonArrayobservations.size(); i++) {
            Riskanalyticscontrollerv3Observation.validateJsonElement(jsonArrayobservations.get(i));
          };
        }
      }
      // validate the optional field `risk_event`
      if (jsonObj.get("risk_event") != null && !jsonObj.get("risk_event").isJsonNull()) {
        Riskanalyticscontrollerv3RiskEvent.validateJsonElement(jsonObj.get("risk_event"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3GetRiskEventDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3GetRiskEventDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3GetRiskEventDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3GetRiskEventDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3GetRiskEventDetailsResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3GetRiskEventDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3GetRiskEventDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3GetRiskEventDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3GetRiskEventDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3GetRiskEventDetailsResponse
  */
  public static Riskanalyticscontrollerv3GetRiskEventDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3GetRiskEventDetailsResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3GetRiskEventDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

