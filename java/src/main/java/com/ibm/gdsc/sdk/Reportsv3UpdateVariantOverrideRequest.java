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
 * Reportsv3UpdateVariantOverrideRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3UpdateVariantOverrideRequest {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, String> values = new HashMap<>();

  public static final String SERIALIZED_NAME_VARIANT_ID = "variant_id";
  @SerializedName(SERIALIZED_NAME_VARIANT_ID)
  private String variantId;

  public Reportsv3UpdateVariantOverrideRequest() {
  }

  public Reportsv3UpdateVariantOverrideRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Reportsv3UpdateVariantOverrideRequest values(Map<String, String> values) {
    this.values = values;
    return this;
  }

  public Reportsv3UpdateVariantOverrideRequest putValuesItem(String key, String valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  public Map<String, String> getValues() {
    return values;
  }

  public void setValues(Map<String, String> values) {
    this.values = values;
  }


  public Reportsv3UpdateVariantOverrideRequest variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * Get variantId
   * @return variantId
  **/
  @javax.annotation.Nullable
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3UpdateVariantOverrideRequest reportsv3UpdateVariantOverrideRequest = (Reportsv3UpdateVariantOverrideRequest) o;
    return Objects.equals(this.key, reportsv3UpdateVariantOverrideRequest.key) &&
        Objects.equals(this.values, reportsv3UpdateVariantOverrideRequest.values) &&
        Objects.equals(this.variantId, reportsv3UpdateVariantOverrideRequest.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, variantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3UpdateVariantOverrideRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("values");
    openapiFields.add("variant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3UpdateVariantOverrideRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3UpdateVariantOverrideRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3UpdateVariantOverrideRequest is not found in the empty JSON string", Reportsv3UpdateVariantOverrideRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3UpdateVariantOverrideRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3UpdateVariantOverrideRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("variant_id") != null && !jsonObj.get("variant_id").isJsonNull()) && !jsonObj.get("variant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3UpdateVariantOverrideRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3UpdateVariantOverrideRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3UpdateVariantOverrideRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3UpdateVariantOverrideRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3UpdateVariantOverrideRequest>() {
           @Override
           public void write(JsonWriter out, Reportsv3UpdateVariantOverrideRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3UpdateVariantOverrideRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3UpdateVariantOverrideRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3UpdateVariantOverrideRequest
  * @throws IOException if the JSON string is invalid with respect to Reportsv3UpdateVariantOverrideRequest
  */
  public static Reportsv3UpdateVariantOverrideRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3UpdateVariantOverrideRequest.class);
  }

 /**
  * Convert an instance of Reportsv3UpdateVariantOverrideRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

