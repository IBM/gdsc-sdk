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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Complianceacceleratorv3Action;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

import com.ibm.gdsc.sdk.JSON;

/**
 * Policy rule and action for alerts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3RuleAndAction {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private Map<String, Complianceacceleratorv3Action> actions = new HashMap<>();

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public Complianceacceleratorv3RuleAndAction() {
  }

  public Complianceacceleratorv3RuleAndAction actions(Map<String, Complianceacceleratorv3Action> actions) {
    this.actions = actions;
    return this;
  }

  public Complianceacceleratorv3RuleAndAction putActionsItem(String key, Complianceacceleratorv3Action actionsItem) {
    if (this.actions == null) {
      this.actions = new HashMap<>();
    }
    this.actions.put(key, actionsItem);
    return this;
  }

   /**
   * Action name.
   * @return actions
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3Action> getActions() {
    return actions;
  }

  public void setActions(Map<String, Complianceacceleratorv3Action> actions) {
    this.actions = actions;
  }


  public Complianceacceleratorv3RuleAndAction ruleId(String ruleId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3RuleAndAction complianceacceleratorv3RuleAndAction = (Complianceacceleratorv3RuleAndAction) o;
    return Objects.equals(this.actions, complianceacceleratorv3RuleAndAction.actions) &&
        Objects.equals(this.ruleId, complianceacceleratorv3RuleAndAction.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3RuleAndAction {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
    openapiFields.add("rule_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3RuleAndAction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3RuleAndAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3RuleAndAction is not found in the empty JSON string", Complianceacceleratorv3RuleAndAction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3RuleAndAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3RuleAndAction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rule_id") != null && !jsonObj.get("rule_id").isJsonNull()) && !jsonObj.get("rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3RuleAndAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3RuleAndAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3RuleAndAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3RuleAndAction.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3RuleAndAction>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3RuleAndAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3RuleAndAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3RuleAndAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3RuleAndAction
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3RuleAndAction
  */
  public static Complianceacceleratorv3RuleAndAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3RuleAndAction.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3RuleAndAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

