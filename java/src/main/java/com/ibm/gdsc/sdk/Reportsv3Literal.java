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
 * Literal represents a field name&#39;s translation key and its translated value.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3Literal {
  public static final String SERIALIZED_NAME_CUSTOMIZED_VALUE = "customized_value";
  @SerializedName(SERIALIZED_NAME_CUSTOMIZED_VALUE)
  private String customizedValue;

  public static final String SERIALIZED_NAME_NLS_KEY = "nls_key";
  @SerializedName(SERIALIZED_NAME_NLS_KEY)
  private String nlsKey;

  public static final String SERIALIZED_NAME_NLS_VALUE = "nls_value";
  @SerializedName(SERIALIZED_NAME_NLS_VALUE)
  private String nlsValue;

  public Reportsv3Literal() {
  }

  public Reportsv3Literal customizedValue(String customizedValue) {
    this.customizedValue = customizedValue;
    return this;
  }

   /**
   * User-defined field name.
   * @return customizedValue
  **/
  @javax.annotation.Nullable
  public String getCustomizedValue() {
    return customizedValue;
  }

  public void setCustomizedValue(String customizedValue) {
    this.customizedValue = customizedValue;
  }


  public Reportsv3Literal nlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
    return this;
  }

   /**
   * Identifies the literal&#39;s name NLS translated string.
   * @return nlsKey
  **/
  @javax.annotation.Nullable
  public String getNlsKey() {
    return nlsKey;
  }

  public void setNlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
  }


  public Reportsv3Literal nlsValue(String nlsValue) {
    this.nlsValue = nlsValue;
    return this;
  }

   /**
   * The literal&#39;s name NLS translated string.
   * @return nlsValue
  **/
  @javax.annotation.Nullable
  public String getNlsValue() {
    return nlsValue;
  }

  public void setNlsValue(String nlsValue) {
    this.nlsValue = nlsValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3Literal reportsv3Literal = (Reportsv3Literal) o;
    return Objects.equals(this.customizedValue, reportsv3Literal.customizedValue) &&
        Objects.equals(this.nlsKey, reportsv3Literal.nlsKey) &&
        Objects.equals(this.nlsValue, reportsv3Literal.nlsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizedValue, nlsKey, nlsValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3Literal {\n");
    sb.append("    customizedValue: ").append(toIndentedString(customizedValue)).append("\n");
    sb.append("    nlsKey: ").append(toIndentedString(nlsKey)).append("\n");
    sb.append("    nlsValue: ").append(toIndentedString(nlsValue)).append("\n");
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
    openapiFields.add("customized_value");
    openapiFields.add("nls_key");
    openapiFields.add("nls_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3Literal
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3Literal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3Literal is not found in the empty JSON string", Reportsv3Literal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3Literal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3Literal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customized_value") != null && !jsonObj.get("customized_value").isJsonNull()) && !jsonObj.get("customized_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customized_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customized_value").toString()));
      }
      if ((jsonObj.get("nls_key") != null && !jsonObj.get("nls_key").isJsonNull()) && !jsonObj.get("nls_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nls_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nls_key").toString()));
      }
      if ((jsonObj.get("nls_value") != null && !jsonObj.get("nls_value").isJsonNull()) && !jsonObj.get("nls_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nls_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nls_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3Literal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3Literal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3Literal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3Literal.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3Literal>() {
           @Override
           public void write(JsonWriter out, Reportsv3Literal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3Literal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3Literal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3Literal
  * @throws IOException if the JSON string is invalid with respect to Reportsv3Literal
  */
  public static Reportsv3Literal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3Literal.class);
  }

 /**
  * Convert an instance of Reportsv3Literal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

