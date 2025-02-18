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
import com.ibm.gdsc.sdk.Groupbuilderv3StatusResponseBase;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Response object for group types mapping.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Groupbuilderv3GetGroupSyncMappingResponse {
  public static final String SERIALIZED_NAME_GROUP_MAP = "group_map";
  @SerializedName(SERIALIZED_NAME_GROUP_MAP)
  private Map<String, Integer> groupMap = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Groupbuilderv3StatusResponseBase status;

  public Groupbuilderv3GetGroupSyncMappingResponse() {
  }

  public Groupbuilderv3GetGroupSyncMappingResponse groupMap(Map<String, Integer> groupMap) {
    this.groupMap = groupMap;
    return this;
  }

  public Groupbuilderv3GetGroupSyncMappingResponse putGroupMapItem(String key, Integer groupMapItem) {
    if (this.groupMap == null) {
      this.groupMap = new HashMap<>();
    }
    this.groupMap.put(key, groupMapItem);
    return this;
  }

   /**
   * Map of gdp to gi group type mapping objects.
   * @return groupMap
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getGroupMap() {
    return groupMap;
  }

  public void setGroupMap(Map<String, Integer> groupMap) {
    this.groupMap = groupMap;
  }


  public Groupbuilderv3GetGroupSyncMappingResponse status(Groupbuilderv3StatusResponseBase status) {
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
    Groupbuilderv3GetGroupSyncMappingResponse groupbuilderv3GetGroupSyncMappingResponse = (Groupbuilderv3GetGroupSyncMappingResponse) o;
    return Objects.equals(this.groupMap, groupbuilderv3GetGroupSyncMappingResponse.groupMap) &&
        Objects.equals(this.status, groupbuilderv3GetGroupSyncMappingResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupMap, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groupbuilderv3GetGroupSyncMappingResponse {\n");
    sb.append("    groupMap: ").append(toIndentedString(groupMap)).append("\n");
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
    openapiFields.add("group_map");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Groupbuilderv3GetGroupSyncMappingResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Groupbuilderv3GetGroupSyncMappingResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Groupbuilderv3GetGroupSyncMappingResponse is not found in the empty JSON string", Groupbuilderv3GetGroupSyncMappingResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Groupbuilderv3GetGroupSyncMappingResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Groupbuilderv3GetGroupSyncMappingResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Groupbuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Groupbuilderv3GetGroupSyncMappingResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Groupbuilderv3GetGroupSyncMappingResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Groupbuilderv3GetGroupSyncMappingResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Groupbuilderv3GetGroupSyncMappingResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Groupbuilderv3GetGroupSyncMappingResponse>() {
           @Override
           public void write(JsonWriter out, Groupbuilderv3GetGroupSyncMappingResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Groupbuilderv3GetGroupSyncMappingResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Groupbuilderv3GetGroupSyncMappingResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Groupbuilderv3GetGroupSyncMappingResponse
  * @throws IOException if the JSON string is invalid with respect to Groupbuilderv3GetGroupSyncMappingResponse
  */
  public static Groupbuilderv3GetGroupSyncMappingResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Groupbuilderv3GetGroupSyncMappingResponse.class);
  }

 /**
  * Convert an instance of Groupbuilderv3GetGroupSyncMappingResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

