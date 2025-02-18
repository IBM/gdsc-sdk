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
import com.ibm.gdsc.sdk.Policybuilderv3ParameterRelationShip;
import com.ibm.gdsc.sdk.Policybuilderv3PossibleValueObj;
import com.ibm.gdsc.sdk.Policybuilderv3RuleType;
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
 * Message format for RuleParameter Metadata.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3RuleParameterMetadata {
  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GROUP_TYPE_ID = "group_type_id";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE_ID)
  private Integer groupTypeId;

  public static final String SERIALIZED_NAME_HAS_EVERY = "has_every";
  @SerializedName(SERIALIZED_NAME_HAS_EVERY)
  private String hasEvery;

  public static final String SERIALIZED_NAME_HAS_GROUP = "has_group";
  @SerializedName(SERIALIZED_NAME_HAS_GROUP)
  private String hasGroup;

  public static final String SERIALIZED_NAME_HAS_NOT = "has_not";
  @SerializedName(SERIALIZED_NAME_HAS_NOT)
  private String hasNot;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_PARAMETER_NAME = "parameter_name";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NAME)
  private String parameterName;

  public static final String SERIALIZED_NAME_POSSIBLE_VALUES = "possible_values";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_VALUES)
  private List<Policybuilderv3PossibleValueObj> possibleValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private List<Policybuilderv3ParameterRelationShip> relationships = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULE_CATEGORY = "rule_category";
  @SerializedName(SERIALIZED_NAME_RULE_CATEGORY)
  private String ruleCategory;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule_type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private Policybuilderv3RuleType ruleType = Policybuilderv3RuleType.ACCESS;

  public static final String SERIALIZED_NAME_STANDALONE_PARAMETER = "standalone_parameter";
  @SerializedName(SERIALIZED_NAME_STANDALONE_PARAMETER)
  private Boolean standaloneParameter;

  public static final String SERIALIZED_NAME_SUPPORTED_DB_TYPES = "supported_db_types";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DB_TYPES)
  private List<String> supportedDbTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE_LENGTH = "value_length";
  @SerializedName(SERIALIZED_NAME_VALUE_LENGTH)
  private Integer valueLength;

  public Policybuilderv3RuleParameterMetadata() {
  }

  public Policybuilderv3RuleParameterMetadata defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public Policybuilderv3RuleParameterMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Policybuilderv3RuleParameterMetadata groupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
    return this;
  }

   /**
   * Group type id.
   * @return groupTypeId
  **/
  @javax.annotation.Nullable
  public Integer getGroupTypeId() {
    return groupTypeId;
  }

  public void setGroupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
  }


  public Policybuilderv3RuleParameterMetadata hasEvery(String hasEvery) {
    this.hasEvery = hasEvery;
    return this;
  }

   /**
   * Indicating and populating parameter name if it supports every operator.
   * @return hasEvery
  **/
  @javax.annotation.Nullable
  public String getHasEvery() {
    return hasEvery;
  }

  public void setHasEvery(String hasEvery) {
    this.hasEvery = hasEvery;
  }


  public Policybuilderv3RuleParameterMetadata hasGroup(String hasGroup) {
    this.hasGroup = hasGroup;
    return this;
  }

   /**
   * Indicating and populating parameter name if it supports group.
   * @return hasGroup
  **/
  @javax.annotation.Nullable
  public String getHasGroup() {
    return hasGroup;
  }

  public void setHasGroup(String hasGroup) {
    this.hasGroup = hasGroup;
  }


  public Policybuilderv3RuleParameterMetadata hasNot(String hasNot) {
    this.hasNot = hasNot;
    return this;
  }

   /**
   * Indicating and populating parameter name if it supports a not operator.
   * @return hasNot
  **/
  @javax.annotation.Nullable
  public String getHasNot() {
    return hasNot;
  }

  public void setHasNot(String hasNot) {
    this.hasNot = hasNot;
  }


  public Policybuilderv3RuleParameterMetadata label(String label) {
    this.label = label;
    return this;
  }

   /**
   * UI label for parameter.
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Policybuilderv3RuleParameterMetadata mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Flag to indicate if the parameter is mandatory or not.
   * @return mandatory
  **/
  @javax.annotation.Nullable
  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public Policybuilderv3RuleParameterMetadata parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Parameter name.
   * @return parameterName
  **/
  @javax.annotation.Nullable
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public Policybuilderv3RuleParameterMetadata possibleValues(List<Policybuilderv3PossibleValueObj> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  public Policybuilderv3RuleParameterMetadata addPossibleValuesItem(Policybuilderv3PossibleValueObj possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new ArrayList<>();
    }
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

   /**
   * Possible value length of the rule parameter.
   * @return possibleValues
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3PossibleValueObj> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<Policybuilderv3PossibleValueObj> possibleValues) {
    this.possibleValues = possibleValues;
  }


  public Policybuilderv3RuleParameterMetadata relationships(List<Policybuilderv3ParameterRelationShip> relationships) {
    this.relationships = relationships;
    return this;
  }

  public Policybuilderv3RuleParameterMetadata addRelationshipsItem(Policybuilderv3ParameterRelationShip relationshipsItem) {
    if (this.relationships == null) {
      this.relationships = new ArrayList<>();
    }
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * Parameter relationship object.
   * @return relationships
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3ParameterRelationShip> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<Policybuilderv3ParameterRelationShip> relationships) {
    this.relationships = relationships;
  }


  public Policybuilderv3RuleParameterMetadata ruleCategory(String ruleCategory) {
    this.ruleCategory = ruleCategory;
    return this;
  }

   /**
   * Category of the rule.
   * @return ruleCategory
  **/
  @javax.annotation.Nullable
  public String getRuleCategory() {
    return ruleCategory;
  }

  public void setRuleCategory(String ruleCategory) {
    this.ruleCategory = ruleCategory;
  }


  public Policybuilderv3RuleParameterMetadata ruleType(Policybuilderv3RuleType ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nullable
  public Policybuilderv3RuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(Policybuilderv3RuleType ruleType) {
    this.ruleType = ruleType;
  }


  public Policybuilderv3RuleParameterMetadata standaloneParameter(Boolean standaloneParameter) {
    this.standaloneParameter = standaloneParameter;
    return this;
  }

   /**
   * If the parameter is standalone.
   * @return standaloneParameter
  **/
  @javax.annotation.Nullable
  public Boolean getStandaloneParameter() {
    return standaloneParameter;
  }

  public void setStandaloneParameter(Boolean standaloneParameter) {
    this.standaloneParameter = standaloneParameter;
  }


  public Policybuilderv3RuleParameterMetadata supportedDbTypes(List<String> supportedDbTypes) {
    this.supportedDbTypes = supportedDbTypes;
    return this;
  }

  public Policybuilderv3RuleParameterMetadata addSupportedDbTypesItem(String supportedDbTypesItem) {
    if (this.supportedDbTypes == null) {
      this.supportedDbTypes = new ArrayList<>();
    }
    this.supportedDbTypes.add(supportedDbTypesItem);
    return this;
  }

   /**
   * Stores all the supported db types.
   * @return supportedDbTypes
  **/
  @javax.annotation.Nullable
  public List<String> getSupportedDbTypes() {
    return supportedDbTypes;
  }

  public void setSupportedDbTypes(List<String> supportedDbTypes) {
    this.supportedDbTypes = supportedDbTypes;
  }


  public Policybuilderv3RuleParameterMetadata type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of parameter.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Policybuilderv3RuleParameterMetadata valueLength(Integer valueLength) {
    this.valueLength = valueLength;
    return this;
  }

   /**
   * Maximum value of the parameter value.
   * @return valueLength
  **/
  @javax.annotation.Nullable
  public Integer getValueLength() {
    return valueLength;
  }

  public void setValueLength(Integer valueLength) {
    this.valueLength = valueLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3RuleParameterMetadata policybuilderv3RuleParameterMetadata = (Policybuilderv3RuleParameterMetadata) o;
    return Objects.equals(this.defaultValue, policybuilderv3RuleParameterMetadata.defaultValue) &&
        Objects.equals(this.description, policybuilderv3RuleParameterMetadata.description) &&
        Objects.equals(this.groupTypeId, policybuilderv3RuleParameterMetadata.groupTypeId) &&
        Objects.equals(this.hasEvery, policybuilderv3RuleParameterMetadata.hasEvery) &&
        Objects.equals(this.hasGroup, policybuilderv3RuleParameterMetadata.hasGroup) &&
        Objects.equals(this.hasNot, policybuilderv3RuleParameterMetadata.hasNot) &&
        Objects.equals(this.label, policybuilderv3RuleParameterMetadata.label) &&
        Objects.equals(this.mandatory, policybuilderv3RuleParameterMetadata.mandatory) &&
        Objects.equals(this.parameterName, policybuilderv3RuleParameterMetadata.parameterName) &&
        Objects.equals(this.possibleValues, policybuilderv3RuleParameterMetadata.possibleValues) &&
        Objects.equals(this.relationships, policybuilderv3RuleParameterMetadata.relationships) &&
        Objects.equals(this.ruleCategory, policybuilderv3RuleParameterMetadata.ruleCategory) &&
        Objects.equals(this.ruleType, policybuilderv3RuleParameterMetadata.ruleType) &&
        Objects.equals(this.standaloneParameter, policybuilderv3RuleParameterMetadata.standaloneParameter) &&
        Objects.equals(this.supportedDbTypes, policybuilderv3RuleParameterMetadata.supportedDbTypes) &&
        Objects.equals(this.type, policybuilderv3RuleParameterMetadata.type) &&
        Objects.equals(this.valueLength, policybuilderv3RuleParameterMetadata.valueLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, groupTypeId, hasEvery, hasGroup, hasNot, label, mandatory, parameterName, possibleValues, relationships, ruleCategory, ruleType, standaloneParameter, supportedDbTypes, type, valueLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3RuleParameterMetadata {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupTypeId: ").append(toIndentedString(groupTypeId)).append("\n");
    sb.append("    hasEvery: ").append(toIndentedString(hasEvery)).append("\n");
    sb.append("    hasGroup: ").append(toIndentedString(hasGroup)).append("\n");
    sb.append("    hasNot: ").append(toIndentedString(hasNot)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    ruleCategory: ").append(toIndentedString(ruleCategory)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    standaloneParameter: ").append(toIndentedString(standaloneParameter)).append("\n");
    sb.append("    supportedDbTypes: ").append(toIndentedString(supportedDbTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueLength: ").append(toIndentedString(valueLength)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("group_type_id");
    openapiFields.add("has_every");
    openapiFields.add("has_group");
    openapiFields.add("has_not");
    openapiFields.add("label");
    openapiFields.add("mandatory");
    openapiFields.add("parameter_name");
    openapiFields.add("possible_values");
    openapiFields.add("relationships");
    openapiFields.add("rule_category");
    openapiFields.add("rule_type");
    openapiFields.add("standalone_parameter");
    openapiFields.add("supported_db_types");
    openapiFields.add("type");
    openapiFields.add("value_length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3RuleParameterMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3RuleParameterMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3RuleParameterMetadata is not found in the empty JSON string", Policybuilderv3RuleParameterMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3RuleParameterMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3RuleParameterMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("default_value") != null && !jsonObj.get("default_value").isJsonNull()) && !jsonObj.get("default_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_value").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("has_every") != null && !jsonObj.get("has_every").isJsonNull()) && !jsonObj.get("has_every").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_every` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_every").toString()));
      }
      if ((jsonObj.get("has_group") != null && !jsonObj.get("has_group").isJsonNull()) && !jsonObj.get("has_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_group").toString()));
      }
      if ((jsonObj.get("has_not") != null && !jsonObj.get("has_not").isJsonNull()) && !jsonObj.get("has_not").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_not` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_not").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("parameter_name") != null && !jsonObj.get("parameter_name").isJsonNull()) && !jsonObj.get("parameter_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter_name").toString()));
      }
      if (jsonObj.get("possible_values") != null && !jsonObj.get("possible_values").isJsonNull()) {
        JsonArray jsonArraypossibleValues = jsonObj.getAsJsonArray("possible_values");
        if (jsonArraypossibleValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("possible_values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `possible_values` to be an array in the JSON string but got `%s`", jsonObj.get("possible_values").toString()));
          }

          // validate the optional field `possible_values` (array)
          for (int i = 0; i < jsonArraypossibleValues.size(); i++) {
            Policybuilderv3PossibleValueObj.validateJsonElement(jsonArraypossibleValues.get(i));
          };
        }
      }
      if (jsonObj.get("relationships") != null && !jsonObj.get("relationships").isJsonNull()) {
        JsonArray jsonArrayrelationships = jsonObj.getAsJsonArray("relationships");
        if (jsonArrayrelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("relationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `relationships` to be an array in the JSON string but got `%s`", jsonObj.get("relationships").toString()));
          }

          // validate the optional field `relationships` (array)
          for (int i = 0; i < jsonArrayrelationships.size(); i++) {
            Policybuilderv3ParameterRelationShip.validateJsonElement(jsonArrayrelationships.get(i));
          };
        }
      }
      if ((jsonObj.get("rule_category") != null && !jsonObj.get("rule_category").isJsonNull()) && !jsonObj.get("rule_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_category").toString()));
      }
      // validate the optional field `rule_type`
      if (jsonObj.get("rule_type") != null && !jsonObj.get("rule_type").isJsonNull()) {
        Policybuilderv3RuleType.validateJsonElement(jsonObj.get("rule_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supported_db_types") != null && !jsonObj.get("supported_db_types").isJsonNull() && !jsonObj.get("supported_db_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_db_types` to be an array in the JSON string but got `%s`", jsonObj.get("supported_db_types").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3RuleParameterMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3RuleParameterMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3RuleParameterMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3RuleParameterMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3RuleParameterMetadata>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3RuleParameterMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3RuleParameterMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3RuleParameterMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3RuleParameterMetadata
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3RuleParameterMetadata
  */
  public static Policybuilderv3RuleParameterMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3RuleParameterMetadata.class);
  }

 /**
  * Convert an instance of Policybuilderv3RuleParameterMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

