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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3QueryLogs;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Resourcecontrollerk8v3QueryControllerLogsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3QueryControllerLogsRequest {
  public static final String SERIALIZED_NAME_CONTROLLER_ID = "controller_id";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_ID)
  private String controllerId;

  public static final String SERIALIZED_NAME_QUERY_LOGS = "queryLogs";
  @SerializedName(SERIALIZED_NAME_QUERY_LOGS)
  private Resourcecontrollerk8v3QueryLogs queryLogs;

  public Resourcecontrollerk8v3QueryControllerLogsRequest() {
  }

  public Resourcecontrollerk8v3QueryControllerLogsRequest controllerId(String controllerId) {
    this.controllerId = controllerId;
    return this;
  }

   /**
   * The ID of the controller to get logs for.
   * @return controllerId
  **/
  @javax.annotation.Nullable
  public String getControllerId() {
    return controllerId;
  }

  public void setControllerId(String controllerId) {
    this.controllerId = controllerId;
  }


  public Resourcecontrollerk8v3QueryControllerLogsRequest queryLogs(Resourcecontrollerk8v3QueryLogs queryLogs) {
    this.queryLogs = queryLogs;
    return this;
  }

   /**
   * Get queryLogs
   * @return queryLogs
  **/
  @javax.annotation.Nullable
  public Resourcecontrollerk8v3QueryLogs getQueryLogs() {
    return queryLogs;
  }

  public void setQueryLogs(Resourcecontrollerk8v3QueryLogs queryLogs) {
    this.queryLogs = queryLogs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3QueryControllerLogsRequest resourcecontrollerk8v3QueryControllerLogsRequest = (Resourcecontrollerk8v3QueryControllerLogsRequest) o;
    return Objects.equals(this.controllerId, resourcecontrollerk8v3QueryControllerLogsRequest.controllerId) &&
        Objects.equals(this.queryLogs, resourcecontrollerk8v3QueryControllerLogsRequest.queryLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerId, queryLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3QueryControllerLogsRequest {\n");
    sb.append("    controllerId: ").append(toIndentedString(controllerId)).append("\n");
    sb.append("    queryLogs: ").append(toIndentedString(queryLogs)).append("\n");
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
    openapiFields.add("controller_id");
    openapiFields.add("queryLogs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3QueryControllerLogsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3QueryControllerLogsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3QueryControllerLogsRequest is not found in the empty JSON string", Resourcecontrollerk8v3QueryControllerLogsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3QueryControllerLogsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3QueryControllerLogsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("controller_id") != null && !jsonObj.get("controller_id").isJsonNull()) && !jsonObj.get("controller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controller_id").toString()));
      }
      // validate the optional field `queryLogs`
      if (jsonObj.get("queryLogs") != null && !jsonObj.get("queryLogs").isJsonNull()) {
        Resourcecontrollerk8v3QueryLogs.validateJsonElement(jsonObj.get("queryLogs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3QueryControllerLogsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3QueryControllerLogsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3QueryControllerLogsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3QueryControllerLogsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3QueryControllerLogsRequest>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3QueryControllerLogsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3QueryControllerLogsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3QueryControllerLogsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3QueryControllerLogsRequest
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3QueryControllerLogsRequest
  */
  public static Resourcecontrollerk8v3QueryControllerLogsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3QueryControllerLogsRequest.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3QueryControllerLogsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

