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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Action parameter metadata object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3ActionParameterMetadata {
  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POSSIBLE_VALUES = "possible_values";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_VALUES)
  private List<String> possibleValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Policybuilderv3ActionParameterMetadata() {
  }

  public Policybuilderv3ActionParameterMetadata defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value of the parameter.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public Policybuilderv3ActionParameterMetadata mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Flag indicating if the parameter is manadatory or not.
   * @return mandatory
  **/
  @javax.annotation.Nullable
  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public Policybuilderv3ActionParameterMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the parameter.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Policybuilderv3ActionParameterMetadata possibleValues(List<String> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  public Policybuilderv3ActionParameterMetadata addPossibleValuesItem(String possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new ArrayList<>();
    }
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

   /**
   * Possible values of the parameter.
   * @return possibleValues
  **/
  @javax.annotation.Nullable
  public List<String> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<String> possibleValues) {
    this.possibleValues = possibleValues;
  }


  public Policybuilderv3ActionParameterMetadata sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequence of the parameter.
   * @return sequence
  **/
  @javax.annotation.Nullable
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public Policybuilderv3ActionParameterMetadata type(String type) {
    this.type = type;
    return this;
  }

   /**
   * TYpe of the Parameter like String, Number, Reg and so on.
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
    Policybuilderv3ActionParameterMetadata policybuilderv3ActionParameterMetadata = (Policybuilderv3ActionParameterMetadata) o;
    return Objects.equals(this.defaultValue, policybuilderv3ActionParameterMetadata.defaultValue) &&
        Objects.equals(this.mandatory, policybuilderv3ActionParameterMetadata.mandatory) &&
        Objects.equals(this.name, policybuilderv3ActionParameterMetadata.name) &&
        Objects.equals(this.possibleValues, policybuilderv3ActionParameterMetadata.possibleValues) &&
        Objects.equals(this.sequence, policybuilderv3ActionParameterMetadata.sequence) &&
        Objects.equals(this.type, policybuilderv3ActionParameterMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, mandatory, name, possibleValues, sequence, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3ActionParameterMetadata {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("default_value");
    openapiFields.add("mandatory");
    openapiFields.add("name");
    openapiFields.add("possible_values");
    openapiFields.add("sequence");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3ActionParameterMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3ActionParameterMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3ActionParameterMetadata is not found in the empty JSON string", Policybuilderv3ActionParameterMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3ActionParameterMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3ActionParameterMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default_value") != null && !jsonObj.get("default_value").isJsonNull()) && !jsonObj.get("default_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_value").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("possible_values") != null && !jsonObj.get("possible_values").isJsonNull() && !jsonObj.get("possible_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `possible_values` to be an array in the JSON string but got `%s`", jsonObj.get("possible_values").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3ActionParameterMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3ActionParameterMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3ActionParameterMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3ActionParameterMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3ActionParameterMetadata>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3ActionParameterMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3ActionParameterMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3ActionParameterMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3ActionParameterMetadata
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3ActionParameterMetadata
  */
  public static Policybuilderv3ActionParameterMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3ActionParameterMetadata.class);
  }

 /**
  * Convert an instance of Policybuilderv3ActionParameterMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

