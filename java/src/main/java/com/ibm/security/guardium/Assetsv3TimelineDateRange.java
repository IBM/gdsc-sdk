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
 * Assetsv3TimelineDateRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3TimelineDateRange {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_END_NUMBER = "end_number";
  @SerializedName(SERIALIZED_NAME_END_NUMBER)
  private Integer endNumber;

  public static final String SERIALIZED_NAME_END_UNIT = "end_unit";
  @SerializedName(SERIALIZED_NAME_END_UNIT)
  private String endUnit;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_START_NUMBER = "start_number";
  @SerializedName(SERIALIZED_NAME_START_NUMBER)
  private Integer startNumber;

  public static final String SERIALIZED_NAME_START_UNIT = "start_unit";
  @SerializedName(SERIALIZED_NAME_START_UNIT)
  private String startUnit;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Assetsv3TimelineDateRange() {
  }

  public Assetsv3TimelineDateRange end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  public Assetsv3TimelineDateRange endNumber(Integer endNumber) {
    this.endNumber = endNumber;
    return this;
  }

   /**
   * Get endNumber
   * @return endNumber
  **/
  @javax.annotation.Nullable
  public Integer getEndNumber() {
    return endNumber;
  }

  public void setEndNumber(Integer endNumber) {
    this.endNumber = endNumber;
  }


  public Assetsv3TimelineDateRange endUnit(String endUnit) {
    this.endUnit = endUnit;
    return this;
  }

   /**
   * Get endUnit
   * @return endUnit
  **/
  @javax.annotation.Nullable
  public String getEndUnit() {
    return endUnit;
  }

  public void setEndUnit(String endUnit) {
    this.endUnit = endUnit;
  }


  public Assetsv3TimelineDateRange error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public Assetsv3TimelineDateRange key(String key) {
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


  public Assetsv3TimelineDateRange start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  public Assetsv3TimelineDateRange startNumber(Integer startNumber) {
    this.startNumber = startNumber;
    return this;
  }

   /**
   * Get startNumber
   * @return startNumber
  **/
  @javax.annotation.Nullable
  public Integer getStartNumber() {
    return startNumber;
  }

  public void setStartNumber(Integer startNumber) {
    this.startNumber = startNumber;
  }


  public Assetsv3TimelineDateRange startUnit(String startUnit) {
    this.startUnit = startUnit;
    return this;
  }

   /**
   * Get startUnit
   * @return startUnit
  **/
  @javax.annotation.Nullable
  public String getStartUnit() {
    return startUnit;
  }

  public void setStartUnit(String startUnit) {
    this.startUnit = startUnit;
  }


  public Assetsv3TimelineDateRange type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3TimelineDateRange assetsv3TimelineDateRange = (Assetsv3TimelineDateRange) o;
    return Objects.equals(this.end, assetsv3TimelineDateRange.end) &&
        Objects.equals(this.endNumber, assetsv3TimelineDateRange.endNumber) &&
        Objects.equals(this.endUnit, assetsv3TimelineDateRange.endUnit) &&
        Objects.equals(this.error, assetsv3TimelineDateRange.error) &&
        Objects.equals(this.key, assetsv3TimelineDateRange.key) &&
        Objects.equals(this.start, assetsv3TimelineDateRange.start) &&
        Objects.equals(this.startNumber, assetsv3TimelineDateRange.startNumber) &&
        Objects.equals(this.startUnit, assetsv3TimelineDateRange.startUnit) &&
        Objects.equals(this.type, assetsv3TimelineDateRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, endNumber, endUnit, error, key, start, startNumber, startUnit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3TimelineDateRange {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    endNumber: ").append(toIndentedString(endNumber)).append("\n");
    sb.append("    endUnit: ").append(toIndentedString(endUnit)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
    sb.append("    startUnit: ").append(toIndentedString(startUnit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("end_number");
    openapiFields.add("end_unit");
    openapiFields.add("error");
    openapiFields.add("key");
    openapiFields.add("start");
    openapiFields.add("start_number");
    openapiFields.add("start_unit");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3TimelineDateRange
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3TimelineDateRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3TimelineDateRange is not found in the empty JSON string", Assetsv3TimelineDateRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3TimelineDateRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3TimelineDateRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if ((jsonObj.get("end_unit") != null && !jsonObj.get("end_unit").isJsonNull()) && !jsonObj.get("end_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_unit").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if ((jsonObj.get("start_unit") != null && !jsonObj.get("start_unit").isJsonNull()) && !jsonObj.get("start_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_unit").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3TimelineDateRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3TimelineDateRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3TimelineDateRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3TimelineDateRange.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3TimelineDateRange>() {
           @Override
           public void write(JsonWriter out, Assetsv3TimelineDateRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3TimelineDateRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3TimelineDateRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3TimelineDateRange
  * @throws IOException if the JSON string is invalid with respect to Assetsv3TimelineDateRange
  */
  public static Assetsv3TimelineDateRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3TimelineDateRange.class);
  }

 /**
  * Convert an instance of Assetsv3TimelineDateRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

