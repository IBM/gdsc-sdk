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
import com.ibm.security.guardium.Assetsv3Action;
import com.ibm.security.guardium.Assetsv3RuleParameter;
import com.ibm.security.guardium.Assetsv3RuleType;
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
 * Base Rule object which is used in create and list APIs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3Rule {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Assetsv3Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_DELETE = "is_delete";
  @SerializedName(SERIALIZED_NAME_IS_DELETE)
  private Integer isDelete;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Assetsv3RuleParameter> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule_type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private Assetsv3RuleType ruleType = Assetsv3RuleType.ACCESS;

  public Assetsv3Rule() {
  }

  public Assetsv3Rule actions(List<Assetsv3Action> actions) {
    this.actions = actions;
    return this;
  }

  public Assetsv3Rule addActionsItem(Assetsv3Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Action object of the actions in the rules.
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<Assetsv3Action> getActions() {
    return actions;
  }

  public void setActions(List<Assetsv3Action> actions) {
    this.actions = actions;
  }


  public Assetsv3Rule isDelete(Integer isDelete) {
    this.isDelete = isDelete;
    return this;
  }

   /**
   * Rule isDelete.
   * @return isDelete
  **/
  @javax.annotation.Nullable
  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }


  public Assetsv3Rule parameters(List<Assetsv3RuleParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Assetsv3Rule addParametersItem(Assetsv3RuleParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameter object which are used in the rule.
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<Assetsv3RuleParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Assetsv3RuleParameter> parameters) {
    this.parameters = parameters;
  }


  public Assetsv3Rule policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Policy ID.
   * @return policyId
  **/
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public Assetsv3Rule ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Rule ID.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public Assetsv3Rule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Rule Name.
   * @return ruleName
  **/
  @javax.annotation.Nullable
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public Assetsv3Rule ruleType(Assetsv3RuleType ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nullable
  public Assetsv3RuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(Assetsv3RuleType ruleType) {
    this.ruleType = ruleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3Rule assetsv3Rule = (Assetsv3Rule) o;
    return Objects.equals(this.actions, assetsv3Rule.actions) &&
        Objects.equals(this.isDelete, assetsv3Rule.isDelete) &&
        Objects.equals(this.parameters, assetsv3Rule.parameters) &&
        Objects.equals(this.policyId, assetsv3Rule.policyId) &&
        Objects.equals(this.ruleId, assetsv3Rule.ruleId) &&
        Objects.equals(this.ruleName, assetsv3Rule.ruleName) &&
        Objects.equals(this.ruleType, assetsv3Rule.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, isDelete, parameters, policyId, ruleId, ruleName, ruleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3Rule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("is_delete");
    openapiFields.add("parameters");
    openapiFields.add("policy_id");
    openapiFields.add("rule_id");
    openapiFields.add("rule_name");
    openapiFields.add("rule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3Rule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3Rule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3Rule is not found in the empty JSON string", Assetsv3Rule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3Rule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3Rule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            Assetsv3Action.validateJsonElement(jsonArrayactions.get(i));
          };
        }
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
            Assetsv3RuleParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("rule_id") != null && !jsonObj.get("rule_id").isJsonNull()) && !jsonObj.get("rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_id").toString()));
      }
      if ((jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonNull()) && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      // validate the optional field `rule_type`
      if (jsonObj.get("rule_type") != null && !jsonObj.get("rule_type").isJsonNull()) {
        Assetsv3RuleType.validateJsonElement(jsonObj.get("rule_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3Rule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3Rule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3Rule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3Rule.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3Rule>() {
           @Override
           public void write(JsonWriter out, Assetsv3Rule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3Rule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3Rule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3Rule
  * @throws IOException if the JSON string is invalid with respect to Assetsv3Rule
  */
  public static Assetsv3Rule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3Rule.class);
  }

 /**
  * Convert an instance of Assetsv3Rule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

