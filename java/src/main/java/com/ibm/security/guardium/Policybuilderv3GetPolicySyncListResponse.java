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
import com.ibm.security.guardium.Policybuilderv3GdpPolicySyncRes;
import com.ibm.security.guardium.Policybuilderv3StatusResponseBase;
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
 * Policybuilderv3GetPolicySyncListResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3GetPolicySyncListResponse {
  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<Policybuilderv3GdpPolicySyncRes> policies = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Policybuilderv3StatusResponseBase status;

  public Policybuilderv3GetPolicySyncListResponse() {
  }

  public Policybuilderv3GetPolicySyncListResponse policies(List<Policybuilderv3GdpPolicySyncRes> policies) {
    this.policies = policies;
    return this;
  }

  public Policybuilderv3GetPolicySyncListResponse addPoliciesItem(Policybuilderv3GdpPolicySyncRes policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3GdpPolicySyncRes> getPolicies() {
    return policies;
  }

  public void setPolicies(List<Policybuilderv3GdpPolicySyncRes> policies) {
    this.policies = policies;
  }


  public Policybuilderv3GetPolicySyncListResponse status(Policybuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Policybuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Policybuilderv3StatusResponseBase status) {
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
    Policybuilderv3GetPolicySyncListResponse policybuilderv3GetPolicySyncListResponse = (Policybuilderv3GetPolicySyncListResponse) o;
    return Objects.equals(this.policies, policybuilderv3GetPolicySyncListResponse.policies) &&
        Objects.equals(this.status, policybuilderv3GetPolicySyncListResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3GetPolicySyncListResponse {\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
    openapiFields.add("policies");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3GetPolicySyncListResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3GetPolicySyncListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3GetPolicySyncListResponse is not found in the empty JSON string", Policybuilderv3GetPolicySyncListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3GetPolicySyncListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3GetPolicySyncListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("policies") != null && !jsonObj.get("policies").isJsonNull()) {
        JsonArray jsonArraypolicies = jsonObj.getAsJsonArray("policies");
        if (jsonArraypolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
          }

          // validate the optional field `policies` (array)
          for (int i = 0; i < jsonArraypolicies.size(); i++) {
            Policybuilderv3GdpPolicySyncRes.validateJsonElement(jsonArraypolicies.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Policybuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3GetPolicySyncListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3GetPolicySyncListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3GetPolicySyncListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3GetPolicySyncListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3GetPolicySyncListResponse>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3GetPolicySyncListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3GetPolicySyncListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3GetPolicySyncListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3GetPolicySyncListResponse
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3GetPolicySyncListResponse
  */
  public static Policybuilderv3GetPolicySyncListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3GetPolicySyncListResponse.class);
  }

 /**
  * Convert an instance of Policybuilderv3GetPolicySyncListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

