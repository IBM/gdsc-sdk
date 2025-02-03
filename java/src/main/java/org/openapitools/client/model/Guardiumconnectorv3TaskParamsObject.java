/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import org.openapitools.client.JSON;

/**
 * Json object holding an arg value and arg name.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3TaskParamsObject {
  public static final String SERIALIZED_NAME_ARG_NAME = "arg_name";
  @SerializedName(SERIALIZED_NAME_ARG_NAME)
  private String argName;

  public static final String SERIALIZED_NAME_ARG_VALUE = "arg_value";
  @SerializedName(SERIALIZED_NAME_ARG_VALUE)
  private String argValue;

  public Guardiumconnectorv3TaskParamsObject() {
  }

  public Guardiumconnectorv3TaskParamsObject argName(String argName) {
    this.argName = argName;
    return this;
  }

   /**
   * Arg name.
   * @return argName
  **/
  @javax.annotation.Nullable
  public String getArgName() {
    return argName;
  }

  public void setArgName(String argName) {
    this.argName = argName;
  }


  public Guardiumconnectorv3TaskParamsObject argValue(String argValue) {
    this.argValue = argValue;
    return this;
  }

   /**
   * Arg value.
   * @return argValue
  **/
  @javax.annotation.Nullable
  public String getArgValue() {
    return argValue;
  }

  public void setArgValue(String argValue) {
    this.argValue = argValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3TaskParamsObject guardiumconnectorv3TaskParamsObject = (Guardiumconnectorv3TaskParamsObject) o;
    return Objects.equals(this.argName, guardiumconnectorv3TaskParamsObject.argName) &&
        Objects.equals(this.argValue, guardiumconnectorv3TaskParamsObject.argValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argName, argValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3TaskParamsObject {\n");
    sb.append("    argName: ").append(toIndentedString(argName)).append("\n");
    sb.append("    argValue: ").append(toIndentedString(argValue)).append("\n");
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
    openapiFields.add("arg_name");
    openapiFields.add("arg_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3TaskParamsObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3TaskParamsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3TaskParamsObject is not found in the empty JSON string", Guardiumconnectorv3TaskParamsObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3TaskParamsObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3TaskParamsObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("arg_name") != null && !jsonObj.get("arg_name").isJsonNull()) && !jsonObj.get("arg_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arg_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arg_name").toString()));
      }
      if ((jsonObj.get("arg_value") != null && !jsonObj.get("arg_value").isJsonNull()) && !jsonObj.get("arg_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arg_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arg_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3TaskParamsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3TaskParamsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3TaskParamsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3TaskParamsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3TaskParamsObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3TaskParamsObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3TaskParamsObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3TaskParamsObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3TaskParamsObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3TaskParamsObject
  */
  public static Guardiumconnectorv3TaskParamsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3TaskParamsObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3TaskParamsObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

