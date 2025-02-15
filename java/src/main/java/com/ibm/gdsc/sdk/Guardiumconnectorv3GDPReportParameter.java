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
 * Report parameter definition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GDPReportParameter {
  public static final String SERIALIZED_NAME_PARAMETER_VALUE = "parameter_value";
  @SerializedName(SERIALIZED_NAME_PARAMETER_VALUE)
  private String parameterValue;

  public static final String SERIALIZED_NAME_PAREMETER_NAME = "paremeter_name";
  @SerializedName(SERIALIZED_NAME_PAREMETER_NAME)
  private String paremeterName;

  public Guardiumconnectorv3GDPReportParameter() {
  }

  public Guardiumconnectorv3GDPReportParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Parameter value.
   * @return parameterValue
  **/
  @javax.annotation.Nullable
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  public Guardiumconnectorv3GDPReportParameter paremeterName(String paremeterName) {
    this.paremeterName = paremeterName;
    return this;
  }

   /**
   * Parameter name.
   * @return paremeterName
  **/
  @javax.annotation.Nullable
  public String getParemeterName() {
    return paremeterName;
  }

  public void setParemeterName(String paremeterName) {
    this.paremeterName = paremeterName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GDPReportParameter guardiumconnectorv3GDPReportParameter = (Guardiumconnectorv3GDPReportParameter) o;
    return Objects.equals(this.parameterValue, guardiumconnectorv3GDPReportParameter.parameterValue) &&
        Objects.equals(this.paremeterName, guardiumconnectorv3GDPReportParameter.paremeterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterValue, paremeterName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GDPReportParameter {\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    paremeterName: ").append(toIndentedString(paremeterName)).append("\n");
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
    openapiFields.add("parameter_value");
    openapiFields.add("paremeter_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GDPReportParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GDPReportParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GDPReportParameter is not found in the empty JSON string", Guardiumconnectorv3GDPReportParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GDPReportParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GDPReportParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parameter_value") != null && !jsonObj.get("parameter_value").isJsonNull()) && !jsonObj.get("parameter_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_value").toString()));
      }
      if ((jsonObj.get("paremeter_name") != null && !jsonObj.get("paremeter_name").isJsonNull()) && !jsonObj.get("paremeter_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paremeter_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paremeter_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3GDPReportParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GDPReportParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GDPReportParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GDPReportParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GDPReportParameter>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GDPReportParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GDPReportParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GDPReportParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GDPReportParameter
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GDPReportParameter
  */
  public static Guardiumconnectorv3GDPReportParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GDPReportParameter.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GDPReportParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

