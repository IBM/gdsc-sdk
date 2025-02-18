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
import com.ibm.gdsc.sdk.Policybuilderv3PolicyGroups;
import com.ibm.gdsc.sdk.Policybuilderv3StatusResponseBase;
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

import com.ibm.gdsc.JSON;

/**
 * Response message for groups being used in policies.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3GetPoliciesGroupsResponse {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Policybuilderv3PolicyGroups> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Policybuilderv3StatusResponseBase status;

  public Policybuilderv3GetPoliciesGroupsResponse() {
  }

  public Policybuilderv3GetPoliciesGroupsResponse groups(List<Policybuilderv3PolicyGroups> groups) {
    this.groups = groups;
    return this;
  }

  public Policybuilderv3GetPoliciesGroupsResponse addGroupsItem(Policybuilderv3PolicyGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Message containing group and policy details.
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3PolicyGroups> getGroups() {
    return groups;
  }

  public void setGroups(List<Policybuilderv3PolicyGroups> groups) {
    this.groups = groups;
  }


  public Policybuilderv3GetPoliciesGroupsResponse status(Policybuilderv3StatusResponseBase status) {
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
    Policybuilderv3GetPoliciesGroupsResponse policybuilderv3GetPoliciesGroupsResponse = (Policybuilderv3GetPoliciesGroupsResponse) o;
    return Objects.equals(this.groups, policybuilderv3GetPoliciesGroupsResponse.groups) &&
        Objects.equals(this.status, policybuilderv3GetPoliciesGroupsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3GetPoliciesGroupsResponse {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3GetPoliciesGroupsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3GetPoliciesGroupsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3GetPoliciesGroupsResponse is not found in the empty JSON string", Policybuilderv3GetPoliciesGroupsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3GetPoliciesGroupsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3GetPoliciesGroupsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            Policybuilderv3PolicyGroups.validateJsonElement(jsonArraygroups.get(i));
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
       if (!Policybuilderv3GetPoliciesGroupsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3GetPoliciesGroupsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3GetPoliciesGroupsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3GetPoliciesGroupsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3GetPoliciesGroupsResponse>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3GetPoliciesGroupsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3GetPoliciesGroupsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3GetPoliciesGroupsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3GetPoliciesGroupsResponse
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3GetPoliciesGroupsResponse
  */
  public static Policybuilderv3GetPoliciesGroupsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3GetPoliciesGroupsResponse.class);
  }

 /**
  * Convert an instance of Policybuilderv3GetPoliciesGroupsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

