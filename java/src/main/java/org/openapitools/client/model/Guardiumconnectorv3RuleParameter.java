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
 * Guardiumconnectorv3RuleParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3RuleParameter {
  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_PARAMETER_NAME = "parameter_name";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_PARAMETER_OPERATOR = "parameter_operator";
  @SerializedName(SERIALIZED_NAME_PARAMETER_OPERATOR)
  private String parameterOperator;

  public static final String SERIALIZED_NAME_PARAMETER_VALUE = "parameter_value";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUE)
  private String parameterValue;

  public Guardiumconnectorv3RuleParameter() {
  }

  public Guardiumconnectorv3RuleParameter groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public Guardiumconnectorv3RuleParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @javax.annotation.Nullable
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public Guardiumconnectorv3RuleParameter parameterOperator(String parameterOperator) {
    this.parameterOperator = parameterOperator;
    return this;
  }

   /**
   * Get parameterOperator
   * @return parameterOperator
  **/
  @javax.annotation.Nullable
  public String getParameterOperator() {
    return parameterOperator;
  }

  public void setParameterOperator(String parameterOperator) {
    this.parameterOperator = parameterOperator;
  }


  public Guardiumconnectorv3RuleParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Get parameterValue
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
    Guardiumconnectorv3RuleParameter guardiumconnectorv3RuleParameter = (Guardiumconnectorv3RuleParameter) o;
    return Objects.equals(this.groupId, guardiumconnectorv3RuleParameter.groupId) &&
        Objects.equals(this.parameterName, guardiumconnectorv3RuleParameter.parameterName) &&
        Objects.equals(this.parameterOperator, guardiumconnectorv3RuleParameter.parameterOperator) &&
        Objects.equals(this.parameterValue, guardiumconnectorv3RuleParameter.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, parameterName, parameterOperator, parameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3RuleParameter {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterOperator: ").append(toIndentedString(parameterOperator)).append("\n");
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
    openapiFields.add("group_id");
    openapiFields.add("parameter_name");
    openapiFields.add("parameter_operator");
    openapiFields.add("parameter_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3RuleParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3RuleParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3RuleParameter is not found in the empty JSON string", Guardiumconnectorv3RuleParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3RuleParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3RuleParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parameter_name") != null && !jsonObj.get("parameter_name").isJsonNull()) && !jsonObj.get("parameter_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_name").toString()));
      }
      if ((jsonObj.get("parameter_operator") != null && !jsonObj.get("parameter_operator").isJsonNull()) && !jsonObj.get("parameter_operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_operator").toString()));
      }
      if ((jsonObj.get("parameter_value") != null && !jsonObj.get("parameter_value").isJsonNull()) && !jsonObj.get("parameter_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3RuleParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3RuleParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3RuleParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3RuleParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3RuleParameter>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3RuleParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3RuleParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3RuleParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3RuleParameter
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3RuleParameter
  */
  public static Guardiumconnectorv3RuleParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3RuleParameter.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3RuleParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

