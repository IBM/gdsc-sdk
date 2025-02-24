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
 * Qspmpolicymanagerv3UpdateTicketStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmpolicymanagerv3UpdateTicketStatusRequest {
  public static final String SERIALIZED_NAME_POLICY_DATASET_ID = "PolicyDatasetId";
  @SerializedName(SERIALIZED_NAME_POLICY_DATASET_ID)
  private String policyDatasetId;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "PolicyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public Qspmpolicymanagerv3UpdateTicketStatusRequest() {
  }

  public Qspmpolicymanagerv3UpdateTicketStatusRequest policyDatasetId(String policyDatasetId) {
    this.policyDatasetId = policyDatasetId;
    return this;
  }

   /**
   * Get policyDatasetId
   * @return policyDatasetId
  **/
  @javax.annotation.Nullable
  public String getPolicyDatasetId() {
    return policyDatasetId;
  }

  public void setPolicyDatasetId(String policyDatasetId) {
    this.policyDatasetId = policyDatasetId;
  }


  public Qspmpolicymanagerv3UpdateTicketStatusRequest policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpolicymanagerv3UpdateTicketStatusRequest qspmpolicymanagerv3UpdateTicketStatusRequest = (Qspmpolicymanagerv3UpdateTicketStatusRequest) o;
    return Objects.equals(this.policyDatasetId, qspmpolicymanagerv3UpdateTicketStatusRequest.policyDatasetId) &&
        Objects.equals(this.policyType, qspmpolicymanagerv3UpdateTicketStatusRequest.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyDatasetId, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpolicymanagerv3UpdateTicketStatusRequest {\n");
    sb.append("    policyDatasetId: ").append(toIndentedString(policyDatasetId)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("PolicyDatasetId");
    openapiFields.add("PolicyType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpolicymanagerv3UpdateTicketStatusRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpolicymanagerv3UpdateTicketStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpolicymanagerv3UpdateTicketStatusRequest is not found in the empty JSON string", Qspmpolicymanagerv3UpdateTicketStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpolicymanagerv3UpdateTicketStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpolicymanagerv3UpdateTicketStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("PolicyDatasetId") != null && !jsonObj.get("PolicyDatasetId").isJsonNull()) && !jsonObj.get("PolicyDatasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PolicyDatasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PolicyDatasetId").toString()));
      }
      if ((jsonObj.get("PolicyType") != null && !jsonObj.get("PolicyType").isJsonNull()) && !jsonObj.get("PolicyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PolicyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PolicyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpolicymanagerv3UpdateTicketStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpolicymanagerv3UpdateTicketStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpolicymanagerv3UpdateTicketStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpolicymanagerv3UpdateTicketStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpolicymanagerv3UpdateTicketStatusRequest>() {
           @Override
           public void write(JsonWriter out, Qspmpolicymanagerv3UpdateTicketStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpolicymanagerv3UpdateTicketStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpolicymanagerv3UpdateTicketStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpolicymanagerv3UpdateTicketStatusRequest
  * @throws IOException if the JSON string is invalid with respect to Qspmpolicymanagerv3UpdateTicketStatusRequest
  */
  public static Qspmpolicymanagerv3UpdateTicketStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpolicymanagerv3UpdateTicketStatusRequest.class);
  }

 /**
  * Convert an instance of Qspmpolicymanagerv3UpdateTicketStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

