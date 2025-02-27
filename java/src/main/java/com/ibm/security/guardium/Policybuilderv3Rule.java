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
import com.ibm.security.guardium.Policybuilderv3Action;
import com.ibm.security.guardium.Policybuilderv3RuleParameter;
import com.ibm.security.guardium.Policybuilderv3RuleSeverity;
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
 * Message format for rule object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3Rule {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Policybuilderv3Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTINUE_TO_NEXT_RULE = "continue_to_next_rule";
  @SerializedName(SERIALIZED_NAME_CONTINUE_TO_NEXT_RULE)
  private Boolean continueToNextRule;

  public static final String SERIALIZED_NAME_EMPTY_GROUPS = "empty_groups";
  @SerializedName(SERIALIZED_NAME_EMPTY_GROUPS)
  private List<Integer> emptyGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVALID_ACTIONS = "invalid_actions";
  @SerializedName(SERIALIZED_NAME_INVALID_ACTIONS)
  private List<Policybuilderv3Action> invalidActions = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVALID_PARAMETERS = "invalid_parameters";
  @SerializedName(SERIALIZED_NAME_INVALID_PARAMETERS)
  private List<Policybuilderv3RuleParameter> invalidParameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Policybuilderv3RuleParameter> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RULE_KEY = "rule_key";
  @SerializedName(SERIALIZED_NAME_RULE_KEY)
  private String ruleKey;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_RULE_ORDER = "rule_order";
  @SerializedName(SERIALIZED_NAME_RULE_ORDER)
  private Integer ruleOrder;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule_type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private Policybuilderv3RuleType ruleType = Policybuilderv3RuleType.ACCESS;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Policybuilderv3RuleSeverity severity = Policybuilderv3RuleSeverity.INFO;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Boolean template;

  public Policybuilderv3Rule() {
  }

  public Policybuilderv3Rule actions(List<Policybuilderv3Action> actions) {
    this.actions = actions;
    return this;
  }

  public Policybuilderv3Rule addActionsItem(Policybuilderv3Action actionsItem) {
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
  public List<Policybuilderv3Action> getActions() {
    return actions;
  }

  public void setActions(List<Policybuilderv3Action> actions) {
    this.actions = actions;
  }


  public Policybuilderv3Rule continueToNextRule(Boolean continueToNextRule) {
    this.continueToNextRule = continueToNextRule;
    return this;
  }

   /**
   * Flag indicating whether continue to next rule is on/off.
   * @return continueToNextRule
  **/
  @javax.annotation.Nullable
  public Boolean getContinueToNextRule() {
    return continueToNextRule;
  }

  public void setContinueToNextRule(Boolean continueToNextRule) {
    this.continueToNextRule = continueToNextRule;
  }


  public Policybuilderv3Rule emptyGroups(List<Integer> emptyGroups) {
    this.emptyGroups = emptyGroups;
    return this;
  }

  public Policybuilderv3Rule addEmptyGroupsItem(Integer emptyGroupsItem) {
    if (this.emptyGroups == null) {
      this.emptyGroups = new ArrayList<>();
    }
    this.emptyGroups.add(emptyGroupsItem);
    return this;
  }

   /**
   * Variable that contains group ids being used by the rule that contains 0 members.
   * @return emptyGroups
  **/
  @javax.annotation.Nullable
  public List<Integer> getEmptyGroups() {
    return emptyGroups;
  }

  public void setEmptyGroups(List<Integer> emptyGroups) {
    this.emptyGroups = emptyGroups;
  }


  public Policybuilderv3Rule invalidActions(List<Policybuilderv3Action> invalidActions) {
    this.invalidActions = invalidActions;
    return this;
  }

  public Policybuilderv3Rule addInvalidActionsItem(Policybuilderv3Action invalidActionsItem) {
    if (this.invalidActions == null) {
      this.invalidActions = new ArrayList<>();
    }
    this.invalidActions.add(invalidActionsItem);
    return this;
  }

   /**
   * Get invalidActions
   * @return invalidActions
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3Action> getInvalidActions() {
    return invalidActions;
  }

  public void setInvalidActions(List<Policybuilderv3Action> invalidActions) {
    this.invalidActions = invalidActions;
  }


  public Policybuilderv3Rule invalidParameters(List<Policybuilderv3RuleParameter> invalidParameters) {
    this.invalidParameters = invalidParameters;
    return this;
  }

  public Policybuilderv3Rule addInvalidParametersItem(Policybuilderv3RuleParameter invalidParametersItem) {
    if (this.invalidParameters == null) {
      this.invalidParameters = new ArrayList<>();
    }
    this.invalidParameters.add(invalidParametersItem);
    return this;
  }

   /**
   * Get invalidParameters
   * @return invalidParameters
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3RuleParameter> getInvalidParameters() {
    return invalidParameters;
  }

  public void setInvalidParameters(List<Policybuilderv3RuleParameter> invalidParameters) {
    this.invalidParameters = invalidParameters;
  }


  public Policybuilderv3Rule parameters(List<Policybuilderv3RuleParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Policybuilderv3Rule addParametersItem(Policybuilderv3RuleParameter parametersItem) {
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
  public List<Policybuilderv3RuleParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Policybuilderv3RuleParameter> parameters) {
    this.parameters = parameters;
  }


  public Policybuilderv3Rule policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Policy Id.
   * @return policyId
  **/
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public Policybuilderv3Rule ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Rule id.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public Policybuilderv3Rule ruleKey(String ruleKey) {
    this.ruleKey = ruleKey;
    return this;
  }

   /**
   * Get ruleKey
   * @return ruleKey
  **/
  @javax.annotation.Nullable
  public String getRuleKey() {
    return ruleKey;
  }

  public void setRuleKey(String ruleKey) {
    this.ruleKey = ruleKey;
  }


  public Policybuilderv3Rule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Rule name.
   * @return ruleName
  **/
  @javax.annotation.Nullable
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public Policybuilderv3Rule ruleOrder(Integer ruleOrder) {
    this.ruleOrder = ruleOrder;
    return this;
  }

   /**
   * Integer to indicate the order of the rule in the policy.
   * @return ruleOrder
  **/
  @javax.annotation.Nullable
  public Integer getRuleOrder() {
    return ruleOrder;
  }

  public void setRuleOrder(Integer ruleOrder) {
    this.ruleOrder = ruleOrder;
  }


  public Policybuilderv3Rule ruleType(Policybuilderv3RuleType ruleType) {
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


  public Policybuilderv3Rule severity(Policybuilderv3RuleSeverity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public Policybuilderv3RuleSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(Policybuilderv3RuleSeverity severity) {
    this.severity = severity;
  }


  public Policybuilderv3Rule tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Policybuilderv3Rule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Variable that contains tags assosicated with the rule.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Policybuilderv3Rule template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Flag to indicate if the rule is a template rule.
   * @return template
  **/
  @javax.annotation.Nullable
  public Boolean getTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3Rule policybuilderv3Rule = (Policybuilderv3Rule) o;
    return Objects.equals(this.actions, policybuilderv3Rule.actions) &&
        Objects.equals(this.continueToNextRule, policybuilderv3Rule.continueToNextRule) &&
        Objects.equals(this.emptyGroups, policybuilderv3Rule.emptyGroups) &&
        Objects.equals(this.invalidActions, policybuilderv3Rule.invalidActions) &&
        Objects.equals(this.invalidParameters, policybuilderv3Rule.invalidParameters) &&
        Objects.equals(this.parameters, policybuilderv3Rule.parameters) &&
        Objects.equals(this.policyId, policybuilderv3Rule.policyId) &&
        Objects.equals(this.ruleId, policybuilderv3Rule.ruleId) &&
        Objects.equals(this.ruleKey, policybuilderv3Rule.ruleKey) &&
        Objects.equals(this.ruleName, policybuilderv3Rule.ruleName) &&
        Objects.equals(this.ruleOrder, policybuilderv3Rule.ruleOrder) &&
        Objects.equals(this.ruleType, policybuilderv3Rule.ruleType) &&
        Objects.equals(this.severity, policybuilderv3Rule.severity) &&
        Objects.equals(this.tags, policybuilderv3Rule.tags) &&
        Objects.equals(this.template, policybuilderv3Rule.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, continueToNextRule, emptyGroups, invalidActions, invalidParameters, parameters, policyId, ruleId, ruleKey, ruleName, ruleOrder, ruleType, severity, tags, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3Rule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    continueToNextRule: ").append(toIndentedString(continueToNextRule)).append("\n");
    sb.append("    emptyGroups: ").append(toIndentedString(emptyGroups)).append("\n");
    sb.append("    invalidActions: ").append(toIndentedString(invalidActions)).append("\n");
    sb.append("    invalidParameters: ").append(toIndentedString(invalidParameters)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleKey: ").append(toIndentedString(ruleKey)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleOrder: ").append(toIndentedString(ruleOrder)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("continue_to_next_rule");
    openapiFields.add("empty_groups");
    openapiFields.add("invalid_actions");
    openapiFields.add("invalid_parameters");
    openapiFields.add("parameters");
    openapiFields.add("policy_id");
    openapiFields.add("rule_id");
    openapiFields.add("rule_key");
    openapiFields.add("rule_name");
    openapiFields.add("rule_order");
    openapiFields.add("rule_type");
    openapiFields.add("severity");
    openapiFields.add("tags");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3Rule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3Rule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3Rule is not found in the empty JSON string", Policybuilderv3Rule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3Rule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3Rule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Policybuilderv3Action.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("empty_groups") != null && !jsonObj.get("empty_groups").isJsonNull() && !jsonObj.get("empty_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `empty_groups` to be an array in the JSON string but got `%s`", jsonObj.get("empty_groups").toString()));
      }
      if (jsonObj.get("invalid_actions") != null && !jsonObj.get("invalid_actions").isJsonNull()) {
        JsonArray jsonArrayinvalidActions = jsonObj.getAsJsonArray("invalid_actions");
        if (jsonArrayinvalidActions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("invalid_actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `invalid_actions` to be an array in the JSON string but got `%s`", jsonObj.get("invalid_actions").toString()));
          }

          // validate the optional field `invalid_actions` (array)
          for (int i = 0; i < jsonArrayinvalidActions.size(); i++) {
            Policybuilderv3Action.validateJsonElement(jsonArrayinvalidActions.get(i));
          };
        }
      }
      if (jsonObj.get("invalid_parameters") != null && !jsonObj.get("invalid_parameters").isJsonNull()) {
        JsonArray jsonArrayinvalidParameters = jsonObj.getAsJsonArray("invalid_parameters");
        if (jsonArrayinvalidParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("invalid_parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `invalid_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("invalid_parameters").toString()));
          }

          // validate the optional field `invalid_parameters` (array)
          for (int i = 0; i < jsonArrayinvalidParameters.size(); i++) {
            Policybuilderv3RuleParameter.validateJsonElement(jsonArrayinvalidParameters.get(i));
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
            Policybuilderv3RuleParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("rule_id") != null && !jsonObj.get("rule_id").isJsonNull()) && !jsonObj.get("rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_id").toString()));
      }
      if ((jsonObj.get("rule_key") != null && !jsonObj.get("rule_key").isJsonNull()) && !jsonObj.get("rule_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_key").toString()));
      }
      if ((jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonNull()) && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      // validate the optional field `rule_type`
      if (jsonObj.get("rule_type") != null && !jsonObj.get("rule_type").isJsonNull()) {
        Policybuilderv3RuleType.validateJsonElement(jsonObj.get("rule_type"));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        Policybuilderv3RuleSeverity.validateJsonElement(jsonObj.get("severity"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3Rule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3Rule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3Rule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3Rule.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3Rule>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3Rule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3Rule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3Rule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3Rule
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3Rule
  */
  public static Policybuilderv3Rule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3Rule.class);
  }

 /**
  * Convert an instance of Policybuilderv3Rule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

