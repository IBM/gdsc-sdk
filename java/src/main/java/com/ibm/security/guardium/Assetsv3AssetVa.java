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

import com.ibm.security.JSON;

/**
 * AssetVa - Asset Overview - Vulnerabilites widget data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetVa {
  public static final String SERIALIZED_NAME_CRITICAL_COUNT = "critical_count";
  @SerializedName(SERIALIZED_NAME_CRITICAL_COUNT)
  private Integer criticalCount;

  public static final String SERIALIZED_NAME_HIGH_COUNT = "high_count";
  @SerializedName(SERIALIZED_NAME_HIGH_COUNT)
  private Integer highCount;

  public Assetsv3AssetVa() {
  }

  public Assetsv3AssetVa criticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
    return this;
  }

   /**
   * Get criticalCount
   * @return criticalCount
  **/
  @javax.annotation.Nullable
  public Integer getCriticalCount() {
    return criticalCount;
  }

  public void setCriticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
  }


  public Assetsv3AssetVa highCount(Integer highCount) {
    this.highCount = highCount;
    return this;
  }

   /**
   * Get highCount
   * @return highCount
  **/
  @javax.annotation.Nullable
  public Integer getHighCount() {
    return highCount;
  }

  public void setHighCount(Integer highCount) {
    this.highCount = highCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetVa assetsv3AssetVa = (Assetsv3AssetVa) o;
    return Objects.equals(this.criticalCount, assetsv3AssetVa.criticalCount) &&
        Objects.equals(this.highCount, assetsv3AssetVa.highCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticalCount, highCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetVa {\n");
    sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
    sb.append("    highCount: ").append(toIndentedString(highCount)).append("\n");
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
    openapiFields.add("critical_count");
    openapiFields.add("high_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetVa
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetVa.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetVa is not found in the empty JSON string", Assetsv3AssetVa.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetVa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetVa` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetVa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetVa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetVa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetVa.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetVa>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetVa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetVa read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetVa given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetVa
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetVa
  */
  public static Assetsv3AssetVa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetVa.class);
  }

 /**
  * Convert an instance of Assetsv3AssetVa to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

