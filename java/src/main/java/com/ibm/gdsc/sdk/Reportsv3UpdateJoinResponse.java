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

import com.ibm.gdsc.JSON;

/**
 * Reportsv3UpdateJoinResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3UpdateJoinResponse {
  public static final String SERIALIZED_NAME_JOIN_ID = "join_id";
  @SerializedName(SERIALIZED_NAME_JOIN_ID)
  private String joinId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public Reportsv3UpdateJoinResponse() {
  }

  public Reportsv3UpdateJoinResponse joinId(String joinId) {
    this.joinId = joinId;
    return this;
  }

   /**
   * Get joinId
   * @return joinId
  **/
  @javax.annotation.Nullable
  public String getJoinId() {
    return joinId;
  }

  public void setJoinId(String joinId) {
    this.joinId = joinId;
  }


  public Reportsv3UpdateJoinResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3UpdateJoinResponse reportsv3UpdateJoinResponse = (Reportsv3UpdateJoinResponse) o;
    return Objects.equals(this.joinId, reportsv3UpdateJoinResponse.joinId) &&
        Objects.equals(this.message, reportsv3UpdateJoinResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3UpdateJoinResponse {\n");
    sb.append("    joinId: ").append(toIndentedString(joinId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("join_id");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3UpdateJoinResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3UpdateJoinResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3UpdateJoinResponse is not found in the empty JSON string", Reportsv3UpdateJoinResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3UpdateJoinResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3UpdateJoinResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("join_id") != null && !jsonObj.get("join_id").isJsonNull()) && !jsonObj.get("join_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `join_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("join_id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3UpdateJoinResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3UpdateJoinResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3UpdateJoinResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3UpdateJoinResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3UpdateJoinResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3UpdateJoinResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3UpdateJoinResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3UpdateJoinResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3UpdateJoinResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3UpdateJoinResponse
  */
  public static Reportsv3UpdateJoinResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3UpdateJoinResponse.class);
  }

 /**
  * Convert an instance of Reportsv3UpdateJoinResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

