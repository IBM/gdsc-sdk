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
 * Message format for the parameters being used in Actions.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3ActionParameter {
  public static final String SERIALIZED_NAME_PARAMETER_NAME = "parameter_name";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_PARAMETER_VALUE = "parameter_value";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUE)
  private String parameterValue;

  public Policybuilderv3ActionParameter() {
  }

  public Policybuilderv3ActionParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter.
   * @return parameterName
  **/
  @javax.annotation.Nullable
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public Policybuilderv3ActionParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Value of the parameter.
   * @return parameterValue
  **/
  @javax.annotation.Nullable
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3ActionParameter policybuilderv3ActionParameter = (Policybuilderv3ActionParameter) o;
    return Objects.equals(this.parameterName, policybuilderv3ActionParameter.parameterName) &&
        Objects.equals(this.parameterValue, policybuilderv3ActionParameter.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3ActionParameter {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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
    openapiFields.add("parameter_name");
    openapiFields.add("parameter_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3ActionParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3ActionParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3ActionParameter is not found in the empty JSON string", Policybuilderv3ActionParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3ActionParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3ActionParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parameter_name") != null && !jsonObj.get("parameter_name").isJsonNull()) && !jsonObj.get("parameter_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_name").toString()));
      }
      if ((jsonObj.get("parameter_value") != null && !jsonObj.get("parameter_value").isJsonNull()) && !jsonObj.get("parameter_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3ActionParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3ActionParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3ActionParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3ActionParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3ActionParameter>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3ActionParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3ActionParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3ActionParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3ActionParameter
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3ActionParameter
  */
  public static Policybuilderv3ActionParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3ActionParameter.class);
  }

 /**
  * Convert an instance of Policybuilderv3ActionParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

