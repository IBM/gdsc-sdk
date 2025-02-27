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
import com.ibm.security.guardium.Riskanalyticscontrollerv3RiskObservationDetails;
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
 * GetRiskObservationDetailsResponse is the response object for GetRiskObservationDetails API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3GetRiskObservationDetailsResponse {
  public static final String SERIALIZED_NAME_RISK_OBSERVATION_DETAILS = "riskObservationDetails";
  @SerializedName(SERIALIZED_NAME_RISK_OBSERVATION_DETAILS)
  private Riskanalyticscontrollerv3RiskObservationDetails riskObservationDetails;

  public Riskanalyticscontrollerv3GetRiskObservationDetailsResponse() {
  }

  public Riskanalyticscontrollerv3GetRiskObservationDetailsResponse riskObservationDetails(Riskanalyticscontrollerv3RiskObservationDetails riskObservationDetails) {
    this.riskObservationDetails = riskObservationDetails;
    return this;
  }

   /**
   * Get riskObservationDetails
   * @return riskObservationDetails
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3RiskObservationDetails getRiskObservationDetails() {
    return riskObservationDetails;
  }

  public void setRiskObservationDetails(Riskanalyticscontrollerv3RiskObservationDetails riskObservationDetails) {
    this.riskObservationDetails = riskObservationDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3GetRiskObservationDetailsResponse riskanalyticscontrollerv3GetRiskObservationDetailsResponse = (Riskanalyticscontrollerv3GetRiskObservationDetailsResponse) o;
    return Objects.equals(this.riskObservationDetails, riskanalyticscontrollerv3GetRiskObservationDetailsResponse.riskObservationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskObservationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3GetRiskObservationDetailsResponse {\n");
    sb.append("    riskObservationDetails: ").append(toIndentedString(riskObservationDetails)).append("\n");
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
    openapiFields.add("riskObservationDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3GetRiskObservationDetailsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3GetRiskObservationDetailsResponse is not found in the empty JSON string", Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3GetRiskObservationDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `riskObservationDetails`
      if (jsonObj.get("riskObservationDetails") != null && !jsonObj.get("riskObservationDetails").isJsonNull()) {
        Riskanalyticscontrollerv3RiskObservationDetails.validateJsonElement(jsonObj.get("riskObservationDetails"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3GetRiskObservationDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3GetRiskObservationDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3GetRiskObservationDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3GetRiskObservationDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3GetRiskObservationDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3GetRiskObservationDetailsResponse
  */
  public static Riskanalyticscontrollerv3GetRiskObservationDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3GetRiskObservationDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

