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
 * Assetsv3Action
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Assetsv3Action {
  public static final String SERIALIZED_NAME_DEST_CATEGORY = "dest_category";
  @SerializedName(SERIALIZED_NAME_DEST_CATEGORY)
  private String destCategory;

  public static final String SERIALIZED_NAME_DEST_TYPE = "dest_type";
  @SerializedName(SERIALIZED_NAME_DEST_TYPE)
  private String destType;

  public static final String SERIALIZED_NAME_DEST_VALUE = "dest_value";
  @SerializedName(SERIALIZED_NAME_DEST_VALUE)
  private String destValue;

  public Assetsv3Action() {
  }

  public Assetsv3Action destCategory(String destCategory) {
    this.destCategory = destCategory;
    return this;
  }

   /**
   * Category of the action.
   * @return destCategory
  **/
  @javax.annotation.Nullable
  public String getDestCategory() {
    return destCategory;
  }

  public void setDestCategory(String destCategory) {
    this.destCategory = destCategory;
  }


  public Assetsv3Action destType(String destType) {
    this.destType = destType;
    return this;
  }

   /**
   * Action type for the rule.
   * @return destType
  **/
  @javax.annotation.Nullable
  public String getDestType() {
    return destType;
  }

  public void setDestType(String destType) {
    this.destType = destType;
  }


  public Assetsv3Action destValue(String destValue) {
    this.destValue = destValue;
    return this;
  }

   /**
   * Value of the action.
   * @return destValue
  **/
  @javax.annotation.Nullable
  public String getDestValue() {
    return destValue;
  }

  public void setDestValue(String destValue) {
    this.destValue = destValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3Action assetsv3Action = (Assetsv3Action) o;
    return Objects.equals(this.destCategory, assetsv3Action.destCategory) &&
        Objects.equals(this.destType, assetsv3Action.destType) &&
        Objects.equals(this.destValue, assetsv3Action.destValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destCategory, destType, destValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3Action {\n");
    sb.append("    destCategory: ").append(toIndentedString(destCategory)).append("\n");
    sb.append("    destType: ").append(toIndentedString(destType)).append("\n");
    sb.append("    destValue: ").append(toIndentedString(destValue)).append("\n");
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
    openapiFields.add("dest_category");
    openapiFields.add("dest_type");
    openapiFields.add("dest_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3Action
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3Action.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3Action is not found in the empty JSON string", Assetsv3Action.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3Action.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3Action` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dest_category") != null && !jsonObj.get("dest_category").isJsonNull()) && !jsonObj.get("dest_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dest_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dest_category").toString()));
      }
      if ((jsonObj.get("dest_type") != null && !jsonObj.get("dest_type").isJsonNull()) && !jsonObj.get("dest_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dest_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dest_type").toString()));
      }
      if ((jsonObj.get("dest_value") != null && !jsonObj.get("dest_value").isJsonNull()) && !jsonObj.get("dest_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dest_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dest_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3Action.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3Action' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3Action> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3Action.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3Action>() {
           @Override
           public void write(JsonWriter out, Assetsv3Action value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3Action read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3Action given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3Action
  * @throws IOException if the JSON string is invalid with respect to Assetsv3Action
  */
  public static Assetsv3Action fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3Action.class);
  }

 /**
  * Convert an instance of Assetsv3Action to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

