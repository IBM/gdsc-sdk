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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Complianceacceleratorv3EmailConfig;
import org.openapitools.client.model.Complianceacceleratorv3Group;
import org.openapitools.client.model.Complianceacceleratorv3RuleAndAction;
import org.openapitools.client.model.Complianceacceleratorv3SyslogConfig;
import org.openapitools.client.model.Complianceacceleratorv3TaskStatus;

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
 * Complianceacceleratorv3Options
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3Options {
  public static final String SERIALIZED_NAME_EMAIL_CONFIG = "email_config";
  @SerializedName(SERIALIZED_NAME_EMAIL_CONFIG)
  private Complianceacceleratorv3EmailConfig emailConfig;

  public static final String SERIALIZED_NAME_PARENT_GROUPS = "parent_groups";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUPS)
  private Map<String, Complianceacceleratorv3Group> parentGroups = new HashMap<>();

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private Map<String, Complianceacceleratorv3RuleAndAction> rules = new HashMap<>();

  public static final String SERIALIZED_NAME_SYSLOG_CONFIG = "syslog_config";
  @SerializedName(SERIALIZED_NAME_SYSLOG_CONFIG)
  private Complianceacceleratorv3SyslogConfig syslogConfig;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private Map<String, Complianceacceleratorv3TaskStatus> tasks = new HashMap<>();

  public Complianceacceleratorv3Options() {
  }

  public Complianceacceleratorv3Options emailConfig(Complianceacceleratorv3EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }

   /**
   * Get emailConfig
   * @return emailConfig
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3EmailConfig getEmailConfig() {
    return emailConfig;
  }

  public void setEmailConfig(Complianceacceleratorv3EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  public Complianceacceleratorv3Options parentGroups(Map<String, Complianceacceleratorv3Group> parentGroups) {
    this.parentGroups = parentGroups;
    return this;
  }

  public Complianceacceleratorv3Options putParentGroupsItem(String key, Complianceacceleratorv3Group parentGroupsItem) {
    if (this.parentGroups == null) {
      this.parentGroups = new HashMap<>();
    }
    this.parentGroups.put(key, parentGroupsItem);
    return this;
  }

   /**
   * Get parentGroups
   * @return parentGroups
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3Group> getParentGroups() {
    return parentGroups;
  }

  public void setParentGroups(Map<String, Complianceacceleratorv3Group> parentGroups) {
    this.parentGroups = parentGroups;
  }


  public Complianceacceleratorv3Options policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public Complianceacceleratorv3Options rules(Map<String, Complianceacceleratorv3RuleAndAction> rules) {
    this.rules = rules;
    return this;
  }

  public Complianceacceleratorv3Options putRulesItem(String key, Complianceacceleratorv3RuleAndAction rulesItem) {
    if (this.rules == null) {
      this.rules = new HashMap<>();
    }
    this.rules.put(key, rulesItem);
    return this;
  }

   /**
   * Key is policy rule names for alerts.
   * @return rules
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3RuleAndAction> getRules() {
    return rules;
  }

  public void setRules(Map<String, Complianceacceleratorv3RuleAndAction> rules) {
    this.rules = rules;
  }


  public Complianceacceleratorv3Options syslogConfig(Complianceacceleratorv3SyslogConfig syslogConfig) {
    this.syslogConfig = syslogConfig;
    return this;
  }

   /**
   * Get syslogConfig
   * @return syslogConfig
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3SyslogConfig getSyslogConfig() {
    return syslogConfig;
  }

  public void setSyslogConfig(Complianceacceleratorv3SyslogConfig syslogConfig) {
    this.syslogConfig = syslogConfig;
  }


  public Complianceacceleratorv3Options tasks(Map<String, Complianceacceleratorv3TaskStatus> tasks) {
    this.tasks = tasks;
    return this;
  }

  public Complianceacceleratorv3Options putTasksItem(String key, Complianceacceleratorv3TaskStatus tasksItem) {
    if (this.tasks == null) {
      this.tasks = new HashMap<>();
    }
    this.tasks.put(key, tasksItem);
    return this;
  }

   /**
   * Tasks that need to be completed.
   * @return tasks
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3TaskStatus> getTasks() {
    return tasks;
  }

  public void setTasks(Map<String, Complianceacceleratorv3TaskStatus> tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3Options complianceacceleratorv3Options = (Complianceacceleratorv3Options) o;
    return Objects.equals(this.emailConfig, complianceacceleratorv3Options.emailConfig) &&
        Objects.equals(this.parentGroups, complianceacceleratorv3Options.parentGroups) &&
        Objects.equals(this.policyId, complianceacceleratorv3Options.policyId) &&
        Objects.equals(this.rules, complianceacceleratorv3Options.rules) &&
        Objects.equals(this.syslogConfig, complianceacceleratorv3Options.syslogConfig) &&
        Objects.equals(this.tasks, complianceacceleratorv3Options.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailConfig, parentGroups, policyId, rules, syslogConfig, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3Options {\n");
    sb.append("    emailConfig: ").append(toIndentedString(emailConfig)).append("\n");
    sb.append("    parentGroups: ").append(toIndentedString(parentGroups)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    syslogConfig: ").append(toIndentedString(syslogConfig)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("email_config");
    openapiFields.add("parent_groups");
    openapiFields.add("policy_id");
    openapiFields.add("rules");
    openapiFields.add("syslog_config");
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3Options
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3Options.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3Options is not found in the empty JSON string", Complianceacceleratorv3Options.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3Options.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3Options` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `email_config`
      if (jsonObj.get("email_config") != null && !jsonObj.get("email_config").isJsonNull()) {
        Complianceacceleratorv3EmailConfig.validateJsonElement(jsonObj.get("email_config"));
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      // validate the optional field `syslog_config`
      if (jsonObj.get("syslog_config") != null && !jsonObj.get("syslog_config").isJsonNull()) {
        Complianceacceleratorv3SyslogConfig.validateJsonElement(jsonObj.get("syslog_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3Options.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3Options' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3Options> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3Options.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3Options>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3Options value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3Options read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3Options given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3Options
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3Options
  */
  public static Complianceacceleratorv3Options fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3Options.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3Options to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

