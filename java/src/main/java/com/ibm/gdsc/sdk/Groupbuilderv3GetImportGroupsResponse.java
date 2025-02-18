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
import com.ibm.gdsc.sdk.Groupbuilderv3Group;
import com.ibm.gdsc.sdk.Groupbuilderv3StatusResponseBase;
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
 * GetGroupsResponse returns filtered groups from a Guardium Data Protection central manager.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3GetImportGroupsResponse {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Groupbuilderv3Group> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Groupbuilderv3StatusResponseBase status;

  public Groupbuilderv3GetImportGroupsResponse() {
  }

  public Groupbuilderv3GetImportGroupsResponse groups(List<Groupbuilderv3Group> groups) {
    this.groups = groups;
    return this;
  }

  public Groupbuilderv3GetImportGroupsResponse addGroupsItem(Groupbuilderv3Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Group information returned from the central manager.
   * @return groups
  **/
  @javax.annotation.Nullable
  public List<Groupbuilderv3Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Groupbuilderv3Group> groups) {
    this.groups = groups;
  }


  public Groupbuilderv3GetImportGroupsResponse status(Groupbuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Groupbuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Groupbuilderv3StatusResponseBase status) {
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
    Groupbuilderv3GetImportGroupsResponse groupbuilderv3GetImportGroupsResponse = (Groupbuilderv3GetImportGroupsResponse) o;
    return Objects.equals(this.groups, groupbuilderv3GetImportGroupsResponse.groups) &&
        Objects.equals(this.status, groupbuilderv3GetImportGroupsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3GetImportGroupsResponse {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3GetImportGroupsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3GetImportGroupsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3GetImportGroupsResponse is not found in the empty JSON string", Groupbuilderv3GetImportGroupsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3GetImportGroupsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3GetImportGroupsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Groupbuilderv3Group.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Groupbuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3GetImportGroupsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3GetImportGroupsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3GetImportGroupsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3GetImportGroupsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3GetImportGroupsResponse>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3GetImportGroupsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3GetImportGroupsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3GetImportGroupsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3GetImportGroupsResponse
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3GetImportGroupsResponse
  */
  public static Groupbuilderv3GetImportGroupsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3GetImportGroupsResponse.class);
  }

 /**
  * Convert an instance of Groupbuilderv3GetImportGroupsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

