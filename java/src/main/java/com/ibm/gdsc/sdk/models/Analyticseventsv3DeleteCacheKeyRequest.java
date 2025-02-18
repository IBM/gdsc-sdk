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
 * DeleteCacheKeyRequest message for delete /api/v3/eventscache/{cache_key}.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Analyticseventsv3DeleteCacheKeyRequest {
  public static final String SERIALIZED_NAME_CACHE_KEY = "cache_key";
  @SerializedName(SERIALIZED_NAME_CACHE_KEY)
  private String cacheKey;

  public Analyticseventsv3DeleteCacheKeyRequest() {
  }

  public Analyticseventsv3DeleteCacheKeyRequest cacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
    return this;
  }

   /**
   * The cache key to delete.
   * @return cacheKey
  **/
  @javax.annotation.Nullable
  public String getCacheKey() {
    return cacheKey;
  }

  public void setCacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Analyticseventsv3DeleteCacheKeyRequest analyticseventsv3DeleteCacheKeyRequest = (Analyticseventsv3DeleteCacheKeyRequest) o;
    return Objects.equals(this.cacheKey, analyticseventsv3DeleteCacheKeyRequest.cacheKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analyticseventsv3DeleteCacheKeyRequest {\n");
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
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
    openapiFields.add("cache_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Analyticseventsv3DeleteCacheKeyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Analyticseventsv3DeleteCacheKeyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Analyticseventsv3DeleteCacheKeyRequest is not found in the empty JSON string", Analyticseventsv3DeleteCacheKeyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Analyticseventsv3DeleteCacheKeyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Analyticseventsv3DeleteCacheKeyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cache_key") != null && !jsonObj.get("cache_key").isJsonNull()) && !jsonObj.get("cache_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cache_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cache_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Analyticseventsv3DeleteCacheKeyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Analyticseventsv3DeleteCacheKeyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Analyticseventsv3DeleteCacheKeyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Analyticseventsv3DeleteCacheKeyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Analyticseventsv3DeleteCacheKeyRequest>() {
           @Override
           public void write(JsonWriter out, Analyticseventsv3DeleteCacheKeyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Analyticseventsv3DeleteCacheKeyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Analyticseventsv3DeleteCacheKeyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Analyticseventsv3DeleteCacheKeyRequest
  * @throws IOException if the JSON string is invalid with respect to Analyticseventsv3DeleteCacheKeyRequest
  */
  public static Analyticseventsv3DeleteCacheKeyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Analyticseventsv3DeleteCacheKeyRequest.class);
  }

 /**
  * Convert an instance of Analyticseventsv3DeleteCacheKeyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

