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
import com.ibm.security.guardium.Policybuilderv3ActionParameterMetadata;
import com.ibm.security.guardium.Policybuilderv3ActionType;
import com.ibm.security.guardium.Policybuilderv3RuleType;
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

import com.ibm.security.JSON;

/**
 * Action metadata object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3ActionMetadata {
  public static final String SERIALIZED_NAME_ACTION_NAME = "action_name";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Policybuilderv3ActionParameterMetadata> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule_type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private List<Policybuilderv3RuleType> ruleType = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Policybuilderv3ActionType type = Policybuilderv3ActionType.UNDEFINED_ACTIONTYPE;

  public Policybuilderv3ActionMetadata() {
  }

  public Policybuilderv3ActionMetadata actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

   /**
   * Name of the action.
   * @return actionName
  **/
  @javax.annotation.Nullable
  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public Policybuilderv3ActionMetadata label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Ui label for the action.
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Policybuilderv3ActionMetadata parameters(List<Policybuilderv3ActionParameterMetadata> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Policybuilderv3ActionMetadata addParametersItem(Policybuilderv3ActionParameterMetadata parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Action parameters.
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3ActionParameterMetadata> getParameters() {
    return parameters;
  }

  public void setParameters(List<Policybuilderv3ActionParameterMetadata> parameters) {
    this.parameters = parameters;
  }


  public Policybuilderv3ActionMetadata ruleType(List<Policybuilderv3RuleType> ruleType) {
    this.ruleType = ruleType;
    return this;
  }

  public Policybuilderv3ActionMetadata addRuleTypeItem(Policybuilderv3RuleType ruleTypeItem) {
    if (this.ruleType == null) {
      this.ruleType = new ArrayList<>();
    }
    this.ruleType.add(ruleTypeItem);
    return this;
  }

   /**
   * Rule type for the action.
   * @return ruleType
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3RuleType> getRuleType() {
    return ruleType;
  }

  public void setRuleType(List<Policybuilderv3RuleType> ruleType) {
    this.ruleType = ruleType;
  }


  public Policybuilderv3ActionMetadata type(Policybuilderv3ActionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Policybuilderv3ActionType getType() {
    return type;
  }

  public void setType(Policybuilderv3ActionType type) {
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
    Policybuilderv3ActionMetadata policybuilderv3ActionMetadata = (Policybuilderv3ActionMetadata) o;
    return Objects.equals(this.actionName, policybuilderv3ActionMetadata.actionName) &&
        Objects.equals(this.label, policybuilderv3ActionMetadata.label) &&
        Objects.equals(this.parameters, policybuilderv3ActionMetadata.parameters) &&
        Objects.equals(this.ruleType, policybuilderv3ActionMetadata.ruleType) &&
        Objects.equals(this.type, policybuilderv3ActionMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, label, parameters, ruleType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3ActionMetadata {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
    openapiFields.add("action_name");
    openapiFields.add("label");
    openapiFields.add("parameters");
    openapiFields.add("rule_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3ActionMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3ActionMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3ActionMetadata is not found in the empty JSON string", Policybuilderv3ActionMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3ActionMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3ActionMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_name") != null && !jsonObj.get("action_name").isJsonNull()) && !jsonObj.get("action_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_name").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            Policybuilderv3ActionParameterMetadata.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rule_type") != null && !jsonObj.get("rule_type").isJsonNull() && !jsonObj.get("rule_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_type` to be an array in the JSON string but got `%s`", jsonObj.get("rule_type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Policybuilderv3ActionType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3ActionMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3ActionMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3ActionMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3ActionMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3ActionMetadata>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3ActionMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3ActionMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3ActionMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3ActionMetadata
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3ActionMetadata
  */
  public static Policybuilderv3ActionMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3ActionMetadata.class);
  }

 /**
  * Convert an instance of Policybuilderv3ActionMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

