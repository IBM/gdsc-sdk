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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Guardiumconnectorv3Action;
import org.openapitools.client.model.Guardiumconnectorv3RuleParameter;

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
 * Guardiumconnectorv3Rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3Rule {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<Guardiumconnectorv3Action> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTINUE_TO_NEXT_RULE = "continue_to_next_rule";
  @SerializedName(SERIALIZED_NAME_CONTINUE_TO_NEXT_RULE)
  private Boolean continueToNextRule;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Guardiumconnectorv3RuleParameter> parameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULE_LEVEL = "rule_level";
  @SerializedName(SERIALIZED_NAME_RULE_LEVEL)
  private Integer ruleLevel;

  public static final String SERIALIZED_NAME_RULE_NAME = "rule_name";
  @SerializedName(SERIALIZED_NAME_RULE_NAME)
  private String ruleName;

  public static final String SERIALIZED_NAME_RULE_TYPE = "rule_type";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private String ruleType;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public Guardiumconnectorv3Rule() {
  }

  public Guardiumconnectorv3Rule actions(List<Guardiumconnectorv3Action> actions) {
    this.actions = actions;
    return this;
  }

  public Guardiumconnectorv3Rule addActionsItem(Guardiumconnectorv3Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3Action> getActions() {
    return actions;
  }

  public void setActions(List<Guardiumconnectorv3Action> actions) {
    this.actions = actions;
  }


  public Guardiumconnectorv3Rule continueToNextRule(Boolean continueToNextRule) {
    this.continueToNextRule = continueToNextRule;
    return this;
  }

   /**
   * Get continueToNextRule
   * @return continueToNextRule
  **/
  @javax.annotation.Nullable
  public Boolean getContinueToNextRule() {
    return continueToNextRule;
  }

  public void setContinueToNextRule(Boolean continueToNextRule) {
    this.continueToNextRule = continueToNextRule;
  }


  public Guardiumconnectorv3Rule parameters(List<Guardiumconnectorv3RuleParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Guardiumconnectorv3Rule addParametersItem(Guardiumconnectorv3RuleParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3RuleParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Guardiumconnectorv3RuleParameter> parameters) {
    this.parameters = parameters;
  }


  public Guardiumconnectorv3Rule ruleLevel(Integer ruleLevel) {
    this.ruleLevel = ruleLevel;
    return this;
  }

   /**
   * Get ruleLevel
   * @return ruleLevel
  **/
  @javax.annotation.Nullable
  public Integer getRuleLevel() {
    return ruleLevel;
  }

  public void setRuleLevel(Integer ruleLevel) {
    this.ruleLevel = ruleLevel;
  }


  public Guardiumconnectorv3Rule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Get ruleName
   * @return ruleName
  **/
  @javax.annotation.Nullable
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public Guardiumconnectorv3Rule ruleType(String ruleType) {
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nullable
  public String getRuleType() {
    return ruleType;
  }

  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }


  public Guardiumconnectorv3Rule severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public Guardiumconnectorv3Rule tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Guardiumconnectorv3Rule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3Rule guardiumconnectorv3Rule = (Guardiumconnectorv3Rule) o;
    return Objects.equals(this.actions, guardiumconnectorv3Rule.actions) &&
        Objects.equals(this.continueToNextRule, guardiumconnectorv3Rule.continueToNextRule) &&
        Objects.equals(this.parameters, guardiumconnectorv3Rule.parameters) &&
        Objects.equals(this.ruleLevel, guardiumconnectorv3Rule.ruleLevel) &&
        Objects.equals(this.ruleName, guardiumconnectorv3Rule.ruleName) &&
        Objects.equals(this.ruleType, guardiumconnectorv3Rule.ruleType) &&
        Objects.equals(this.severity, guardiumconnectorv3Rule.severity) &&
        Objects.equals(this.tags, guardiumconnectorv3Rule.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, continueToNextRule, parameters, ruleLevel, ruleName, ruleType, severity, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3Rule {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    continueToNextRule: ").append(toIndentedString(continueToNextRule)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    ruleLevel: ").append(toIndentedString(ruleLevel)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("parameters");
    openapiFields.add("rule_level");
    openapiFields.add("rule_name");
    openapiFields.add("rule_type");
    openapiFields.add("severity");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3Rule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3Rule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3Rule is not found in the empty JSON string", Guardiumconnectorv3Rule.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3Rule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3Rule` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Guardiumconnectorv3Action.validateJsonElement(jsonArrayactions.get(i));
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
            Guardiumconnectorv3RuleParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if ((jsonObj.get("rule_name") != null && !jsonObj.get("rule_name").isJsonNull()) && !jsonObj.get("rule_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_name").toString()));
      }
      if ((jsonObj.get("rule_type") != null && !jsonObj.get("rule_type").isJsonNull()) && !jsonObj.get("rule_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_type").toString()));
      }
      if ((jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
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
       if (!Guardiumconnectorv3Rule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3Rule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3Rule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3Rule.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3Rule>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3Rule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3Rule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3Rule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3Rule
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3Rule
  */
  public static Guardiumconnectorv3Rule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3Rule.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3Rule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

