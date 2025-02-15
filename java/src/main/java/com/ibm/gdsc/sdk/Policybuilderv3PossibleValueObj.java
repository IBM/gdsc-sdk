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
 * Possible value objects for parameters which supports predefined values.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3PossibleValueObj {
  public static final String SERIALIZED_NAME_DESCRPTION = "descrption";
  @SerializedName(SERIALIZED_NAME_DESCRPTION)
  private String descrption;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Policybuilderv3PossibleValueObj() {
  }

  public Policybuilderv3PossibleValueObj descrption(String descrption) {
    this.descrption = descrption;
    return this;
  }

   /**
   * Description used to describe the value. Primarily being used for tooltip.
   * @return descrption
  **/
  @javax.annotation.Nullable
  public String getDescrption() {
    return descrption;
  }

  public void setDescrption(String descrption) {
    this.descrption = descrption;
  }


  public Policybuilderv3PossibleValueObj value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the parameter.
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
    Policybuilderv3PossibleValueObj policybuilderv3PossibleValueObj = (Policybuilderv3PossibleValueObj) o;
    return Objects.equals(this.descrption, policybuilderv3PossibleValueObj.descrption) &&
        Objects.equals(this.value, policybuilderv3PossibleValueObj.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descrption, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3PossibleValueObj {\n");
    sb.append("    descrption: ").append(toIndentedString(descrption)).append("\n");
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
    openapiFields.add("descrption");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3PossibleValueObj
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3PossibleValueObj.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3PossibleValueObj is not found in the empty JSON string", Policybuilderv3PossibleValueObj.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3PossibleValueObj.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3PossibleValueObj` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("descrption") != null && !jsonObj.get("descrption").isJsonNull()) && !jsonObj.get("descrption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descrption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descrption").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3PossibleValueObj.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3PossibleValueObj' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3PossibleValueObj> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3PossibleValueObj.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3PossibleValueObj>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3PossibleValueObj value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3PossibleValueObj read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3PossibleValueObj given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3PossibleValueObj
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3PossibleValueObj
  */
  public static Policybuilderv3PossibleValueObj fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3PossibleValueObj.class);
  }

 /**
  * Convert an instance of Policybuilderv3PossibleValueObj to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

