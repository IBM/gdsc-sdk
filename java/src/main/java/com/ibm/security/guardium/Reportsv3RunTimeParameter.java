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
import com.ibm.security.guardium.Reportsv3HeaderType;
import com.ibm.security.guardium.Reportsv3OperatorType;
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
 * RunTimeParameter object define all necessary data for a report runtime parameter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3RunTimeParameter {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_OPERATOR_TYPE = "operator_type";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TYPE)
  private Reportsv3OperatorType operatorType = Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE;

  public static final String SERIALIZED_NAME_RUNTIME_PARAMETER_TYPE = "runtime_parameter_type";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAMETER_TYPE)
  private Reportsv3HeaderType runtimeParameterType = Reportsv3HeaderType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_RUNTIME_PARAMETER_TYPE_LENGTH = "runtime_parameter_type_length";
  @SerializedName(SERIALIZED_NAME_RUNTIME_PARAMETER_TYPE_LENGTH)
  private Integer runtimeParameterTypeLength;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Reportsv3RunTimeParameter() {
  }

  public Reportsv3RunTimeParameter key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The run time parameter key (ReportFilter.value).
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Reportsv3RunTimeParameter label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The run time parameter label.
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Reportsv3RunTimeParameter operatorType(Reportsv3OperatorType operatorType) {
    this.operatorType = operatorType;
    return this;
  }

   /**
   * Get operatorType
   * @return operatorType
  **/
  @javax.annotation.Nullable
  public Reportsv3OperatorType getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(Reportsv3OperatorType operatorType) {
    this.operatorType = operatorType;
  }


  public Reportsv3RunTimeParameter runtimeParameterType(Reportsv3HeaderType runtimeParameterType) {
    this.runtimeParameterType = runtimeParameterType;
    return this;
  }

   /**
   * Get runtimeParameterType
   * @return runtimeParameterType
  **/
  @javax.annotation.Nullable
  public Reportsv3HeaderType getRuntimeParameterType() {
    return runtimeParameterType;
  }

  public void setRuntimeParameterType(Reportsv3HeaderType runtimeParameterType) {
    this.runtimeParameterType = runtimeParameterType;
  }


  public Reportsv3RunTimeParameter runtimeParameterTypeLength(Integer runtimeParameterTypeLength) {
    this.runtimeParameterTypeLength = runtimeParameterTypeLength;
    return this;
  }

   /**
   * Runtime parameter&#39;s field type length.
   * @return runtimeParameterTypeLength
  **/
  @javax.annotation.Nullable
  public Integer getRuntimeParameterTypeLength() {
    return runtimeParameterTypeLength;
  }

  public void setRuntimeParameterTypeLength(Integer runtimeParameterTypeLength) {
    this.runtimeParameterTypeLength = runtimeParameterTypeLength;
  }


  public Reportsv3RunTimeParameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Run time parameter values.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3RunTimeParameter reportsv3RunTimeParameter = (Reportsv3RunTimeParameter) o;
    return Objects.equals(this.key, reportsv3RunTimeParameter.key) &&
        Objects.equals(this.label, reportsv3RunTimeParameter.label) &&
        Objects.equals(this.operatorType, reportsv3RunTimeParameter.operatorType) &&
        Objects.equals(this.runtimeParameterType, reportsv3RunTimeParameter.runtimeParameterType) &&
        Objects.equals(this.runtimeParameterTypeLength, reportsv3RunTimeParameter.runtimeParameterTypeLength) &&
        Objects.equals(this.value, reportsv3RunTimeParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, label, operatorType, runtimeParameterType, runtimeParameterTypeLength, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3RunTimeParameter {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    runtimeParameterType: ").append(toIndentedString(runtimeParameterType)).append("\n");
    sb.append("    runtimeParameterTypeLength: ").append(toIndentedString(runtimeParameterTypeLength)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("operator_type");
    openapiFields.add("runtime_parameter_type");
    openapiFields.add("runtime_parameter_type_length");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3RunTimeParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3RunTimeParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3RunTimeParameter is not found in the empty JSON string", Reportsv3RunTimeParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3RunTimeParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3RunTimeParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `operator_type`
      if (jsonObj.get("operator_type") != null && !jsonObj.get("operator_type").isJsonNull()) {
        Reportsv3OperatorType.validateJsonElement(jsonObj.get("operator_type"));
      }
      // validate the optional field `runtime_parameter_type`
      if (jsonObj.get("runtime_parameter_type") != null && !jsonObj.get("runtime_parameter_type").isJsonNull()) {
        Reportsv3HeaderType.validateJsonElement(jsonObj.get("runtime_parameter_type"));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3RunTimeParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3RunTimeParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3RunTimeParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3RunTimeParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3RunTimeParameter>() {
           @Override
           public void write(JsonWriter out, Reportsv3RunTimeParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3RunTimeParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3RunTimeParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3RunTimeParameter
  * @throws IOException if the JSON string is invalid with respect to Reportsv3RunTimeParameter
  */
  public static Reportsv3RunTimeParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3RunTimeParameter.class);
  }

 /**
  * Convert an instance of Reportsv3RunTimeParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

