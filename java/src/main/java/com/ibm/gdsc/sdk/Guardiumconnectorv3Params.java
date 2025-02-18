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
 * Params is the parameter name-value pair.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3Params {
  public static final String SERIALIZED_NAME_PARAM_NAME = "param_name";
  @SerializedName(SERIALIZED_NAME_PARAM_NAME)
  private String paramName;

  public static final String SERIALIZED_NAME_PARAM_VALUE = "param_value";
  @SerializedName(SERIALIZED_NAME_PARAM_VALUE)
  private String paramValue;

  public Guardiumconnectorv3Params() {
  }

  public Guardiumconnectorv3Params paramName(String paramName) {
    this.paramName = paramName;
    return this;
  }

   /**
   * Parameter name.
   * @return paramName
  **/
  @javax.annotation.Nullable
  public String getParamName() {
    return paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }


  public Guardiumconnectorv3Params paramValue(String paramValue) {
    this.paramValue = paramValue;
    return this;
  }

   /**
   * Parameter value.
   * @return paramValue
  **/
  @javax.annotation.Nullable
  public String getParamValue() {
    return paramValue;
  }

  public void setParamValue(String paramValue) {
    this.paramValue = paramValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3Params guardiumconnectorv3Params = (Guardiumconnectorv3Params) o;
    return Objects.equals(this.paramName, guardiumconnectorv3Params.paramName) &&
        Objects.equals(this.paramValue, guardiumconnectorv3Params.paramValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paramName, paramValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3Params {\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
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
    openapiFields.add("param_name");
    openapiFields.add("param_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3Params
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3Params.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3Params is not found in the empty JSON string", Guardiumconnectorv3Params.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3Params.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3Params` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("param_name") != null && !jsonObj.get("param_name").isJsonNull()) && !jsonObj.get("param_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param_name").toString()));
      }
      if ((jsonObj.get("param_value") != null && !jsonObj.get("param_value").isJsonNull()) && !jsonObj.get("param_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `param_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("param_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3Params.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3Params' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3Params> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3Params.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3Params>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3Params value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3Params read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3Params given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3Params
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3Params
  */
  public static Guardiumconnectorv3Params fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3Params.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3Params to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

