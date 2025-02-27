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
import com.ibm.security.guardium.Riskanalyticscontrollerv3Status;
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
 * SetRiskEventStatusRequest is the request object for SetRiskEventStatus API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3SetRiskEventStatusRequest {
  public static final String SERIALIZED_NAME_JUSTIFICATION = "justification";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATION)
  private String justification;

  public static final String SERIALIZED_NAME_RISK_IDS = "risk_ids";
  @SerializedName(SERIALIZED_NAME_RISK_IDS)
  private List<Integer> riskIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Riskanalyticscontrollerv3Status status = Riskanalyticscontrollerv3Status.UNDEFINED_STATUS;

  public Riskanalyticscontrollerv3SetRiskEventStatusRequest() {
  }

  public Riskanalyticscontrollerv3SetRiskEventStatusRequest justification(String justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Justification.
   * @return justification
  **/
  @javax.annotation.Nullable
  public String getJustification() {
    return justification;
  }

  public void setJustification(String justification) {
    this.justification = justification;
  }


  public Riskanalyticscontrollerv3SetRiskEventStatusRequest riskIds(List<Integer> riskIds) {
    this.riskIds = riskIds;
    return this;
  }

  public Riskanalyticscontrollerv3SetRiskEventStatusRequest addRiskIdsItem(Integer riskIdsItem) {
    if (this.riskIds == null) {
      this.riskIds = new ArrayList<>();
    }
    this.riskIds.add(riskIdsItem);
    return this;
  }

   /**
   * One or more risk id. This API can be called for multiple risks.
   * @return riskIds
  **/
  @javax.annotation.Nullable
  public List<Integer> getRiskIds() {
    return riskIds;
  }

  public void setRiskIds(List<Integer> riskIds) {
    this.riskIds = riskIds;
  }


  public Riskanalyticscontrollerv3SetRiskEventStatusRequest status(Riskanalyticscontrollerv3Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3Status getStatus() {
    return status;
  }

  public void setStatus(Riskanalyticscontrollerv3Status status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3SetRiskEventStatusRequest riskanalyticscontrollerv3SetRiskEventStatusRequest = (Riskanalyticscontrollerv3SetRiskEventStatusRequest) o;
    return Objects.equals(this.justification, riskanalyticscontrollerv3SetRiskEventStatusRequest.justification) &&
        Objects.equals(this.riskIds, riskanalyticscontrollerv3SetRiskEventStatusRequest.riskIds) &&
        Objects.equals(this.status, riskanalyticscontrollerv3SetRiskEventStatusRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justification, riskIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3SetRiskEventStatusRequest {\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    riskIds: ").append(toIndentedString(riskIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("justification");
    openapiFields.add("risk_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3SetRiskEventStatusRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3SetRiskEventStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3SetRiskEventStatusRequest is not found in the empty JSON string", Riskanalyticscontrollerv3SetRiskEventStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3SetRiskEventStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3SetRiskEventStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("justification") != null && !jsonObj.get("justification").isJsonNull()) && !jsonObj.get("justification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justification").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("risk_ids") != null && !jsonObj.get("risk_ids").isJsonNull() && !jsonObj.get("risk_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_ids` to be an array in the JSON string but got `%s`", jsonObj.get("risk_ids").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Riskanalyticscontrollerv3Status.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3SetRiskEventStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3SetRiskEventStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3SetRiskEventStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3SetRiskEventStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3SetRiskEventStatusRequest>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3SetRiskEventStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3SetRiskEventStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3SetRiskEventStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3SetRiskEventStatusRequest
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3SetRiskEventStatusRequest
  */
  public static Riskanalyticscontrollerv3SetRiskEventStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3SetRiskEventStatusRequest.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3SetRiskEventStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

