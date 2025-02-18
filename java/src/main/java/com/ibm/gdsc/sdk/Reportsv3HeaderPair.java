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
 * Reportsv3HeaderPair
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3HeaderPair {
  public static final String SERIALIZED_NAME_SOURCE_HEADER_ID = "source_header_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_HEADER_ID)
  private String sourceHeaderId;

  public static final String SERIALIZED_NAME_TARGET_HEADER_ID = "target_header_id";
  @SerializedName(SERIALIZED_NAME_TARGET_HEADER_ID)
  private String targetHeaderId;

  public Reportsv3HeaderPair() {
  }

  public Reportsv3HeaderPair sourceHeaderId(String sourceHeaderId) {
    this.sourceHeaderId = sourceHeaderId;
    return this;
  }

   /**
   * Get sourceHeaderId
   * @return sourceHeaderId
  **/
  @javax.annotation.Nullable
  public String getSourceHeaderId() {
    return sourceHeaderId;
  }

  public void setSourceHeaderId(String sourceHeaderId) {
    this.sourceHeaderId = sourceHeaderId;
  }


  public Reportsv3HeaderPair targetHeaderId(String targetHeaderId) {
    this.targetHeaderId = targetHeaderId;
    return this;
  }

   /**
   * Get targetHeaderId
   * @return targetHeaderId
  **/
  @javax.annotation.Nullable
  public String getTargetHeaderId() {
    return targetHeaderId;
  }

  public void setTargetHeaderId(String targetHeaderId) {
    this.targetHeaderId = targetHeaderId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3HeaderPair reportsv3HeaderPair = (Reportsv3HeaderPair) o;
    return Objects.equals(this.sourceHeaderId, reportsv3HeaderPair.sourceHeaderId) &&
        Objects.equals(this.targetHeaderId, reportsv3HeaderPair.targetHeaderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceHeaderId, targetHeaderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3HeaderPair {\n");
    sb.append("    sourceHeaderId: ").append(toIndentedString(sourceHeaderId)).append("\n");
    sb.append("    targetHeaderId: ").append(toIndentedString(targetHeaderId)).append("\n");
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
    openapiFields.add("source_header_id");
    openapiFields.add("target_header_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3HeaderPair
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3HeaderPair.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3HeaderPair is not found in the empty JSON string", Reportsv3HeaderPair.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3HeaderPair.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3HeaderPair` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("source_header_id") != null && !jsonObj.get("source_header_id").isJsonNull()) && !jsonObj.get("source_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_header_id").toString()));
      }
      if ((jsonObj.get("target_header_id") != null && !jsonObj.get("target_header_id").isJsonNull()) && !jsonObj.get("target_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_header_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3HeaderPair.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3HeaderPair' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3HeaderPair> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3HeaderPair.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3HeaderPair>() {
           @Override
           public void write(JsonWriter out, Reportsv3HeaderPair value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3HeaderPair read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3HeaderPair given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3HeaderPair
  * @throws IOException if the JSON string is invalid with respect to Reportsv3HeaderPair
  */
  public static Reportsv3HeaderPair fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3HeaderPair.class);
  }

 /**
  * Convert an instance of Reportsv3HeaderPair to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

