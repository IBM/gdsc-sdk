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
 * Assetsv3UpdatePolicyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3UpdatePolicyRequest {
  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private List<String> policyId = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATE_ACTIVATION_STATUS = "update_activation_status";
  @SerializedName(SERIALIZED_NAME_UPDATE_ACTIVATION_STATUS)
  private Boolean updateActivationStatus;

  public Assetsv3UpdatePolicyRequest() {
  }

  public Assetsv3UpdatePolicyRequest policyId(List<String> policyId) {
    this.policyId = policyId;
    return this;
  }

  public Assetsv3UpdatePolicyRequest addPolicyIdItem(String policyIdItem) {
    if (this.policyId == null) {
      this.policyId = new ArrayList<>();
    }
    this.policyId.add(policyIdItem);
    return this;
  }

   /**
   * The IDs of the policies to be updated.
   * @return policyId
  **/
  @javax.annotation.Nullable
  public List<String> getPolicyId() {
    return policyId;
  }

  public void setPolicyId(List<String> policyId) {
    this.policyId = policyId;
  }


  public Assetsv3UpdatePolicyRequest updateActivationStatus(Boolean updateActivationStatus) {
    this.updateActivationStatus = updateActivationStatus;
    return this;
  }

   /**
   * The activation status to be updated.
   * @return updateActivationStatus
  **/
  @javax.annotation.Nullable
  public Boolean getUpdateActivationStatus() {
    return updateActivationStatus;
  }

  public void setUpdateActivationStatus(Boolean updateActivationStatus) {
    this.updateActivationStatus = updateActivationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3UpdatePolicyRequest assetsv3UpdatePolicyRequest = (Assetsv3UpdatePolicyRequest) o;
    return Objects.equals(this.policyId, assetsv3UpdatePolicyRequest.policyId) &&
        Objects.equals(this.updateActivationStatus, assetsv3UpdatePolicyRequest.updateActivationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, updateActivationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3UpdatePolicyRequest {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    updateActivationStatus: ").append(toIndentedString(updateActivationStatus)).append("\n");
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
    openapiFields.add("policy_id");
    openapiFields.add("update_activation_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3UpdatePolicyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3UpdatePolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3UpdatePolicyRequest is not found in the empty JSON string", Assetsv3UpdatePolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3UpdatePolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3UpdatePolicyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull() && !jsonObj.get("policy_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be an array in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3UpdatePolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3UpdatePolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3UpdatePolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3UpdatePolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3UpdatePolicyRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3UpdatePolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3UpdatePolicyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3UpdatePolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3UpdatePolicyRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3UpdatePolicyRequest
  */
  public static Assetsv3UpdatePolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3UpdatePolicyRequest.class);
  }

 /**
  * Convert an instance of Assetsv3UpdatePolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

