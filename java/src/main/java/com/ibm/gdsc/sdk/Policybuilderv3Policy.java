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
import com.ibm.gdsc.sdk.Policybuilderv3ControlFlow;
import com.ibm.gdsc.sdk.Policybuilderv3ImportIssue;
import com.ibm.gdsc.sdk.Policybuilderv3ImportState;
import com.ibm.gdsc.sdk.Policybuilderv3PolicyType;
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
 * Policy object for creating/storing the policy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3Policy {
  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Integer activationStatus;

  public static final String SERIALIZED_NAME_CONTAINS_RULE_TYPES = "contains_rule_types";
  @SerializedName(SERIALIZED_NAME_CONTAINS_RULE_TYPES)
  private List<Policybuilderv3RuleType> containsRuleTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTROL_FLOW = "control_flow";
  @SerializedName(SERIALIZED_NAME_CONTROL_FLOW)
  private Policybuilderv3ControlFlow controlFlow = Policybuilderv3ControlFlow.STANDARD;

  public static final String SERIALIZED_NAME_INSTALLED_FLAG = "installed_flag";
  @SerializedName(SERIALIZED_NAME_INSTALLED_FLAG)
  private Boolean installedFlag;

  public static final String SERIALIZED_NAME_INSTALLED_ORDER = "installed_order";
  @SerializedName(SERIALIZED_NAME_INSTALLED_ORDER)
  private Integer installedOrder;

  public static final String SERIALIZED_NAME_INSTALLED_TIMESTAMP = "installed_timestamp";
  @SerializedName(SERIALIZED_NAME_INSTALLED_TIMESTAMP)
  private String installedTimestamp;

  public static final String SERIALIZED_NAME_LAST_EDITED_TIMESTAMP = "last_edited_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_EDITED_TIMESTAMP)
  private String lastEditedTimestamp;

  public static final String SERIALIZED_NAME_LOG_FLAT = "log_flat";
  @SerializedName(SERIALIZED_NAME_LOG_FLAT)
  private Boolean logFlat;

  public static final String SERIALIZED_NAME_NO_OF_RULES = "no_of_rules";
  @SerializedName(SERIALIZED_NAME_NO_OF_RULES)
  private Integer noOfRules;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_IMPORT_ISSUE = "policy_import_issue";
  @SerializedName(SERIALIZED_NAME_POLICY_IMPORT_ISSUE)
  private Policybuilderv3ImportIssue policyImportIssue = Policybuilderv3ImportIssue.NO_IMPORT_ISSUE;

  public static final String SERIALIZED_NAME_POLICY_IMPORT_STATE = "policy_import_state";
  @SerializedName(SERIALIZED_NAME_POLICY_IMPORT_STATE)
  private Policybuilderv3ImportState policyImportState = Policybuilderv3ImportState.NO_IMPORT_STATUS;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private Policybuilderv3PolicyType policyType = Policybuilderv3PolicyType.DATA_POLICY;

  public static final String SERIALIZED_NAME_RULES_ON_FLAT = "rules_on_flat";
  @SerializedName(SERIALIZED_NAME_RULES_ON_FLAT)
  private Boolean rulesOnFlat;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Boolean template;

  public static final String SERIALIZED_NAME_UI_SEQUENCE = "ui_sequence";
  @SerializedName(SERIALIZED_NAME_UI_SEQUENCE)
  private Integer uiSequence;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public Policybuilderv3Policy() {
  }

  public Policybuilderv3Policy activationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed.
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  public Integer getActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
  }


  public Policybuilderv3Policy containsRuleTypes(List<Policybuilderv3RuleType> containsRuleTypes) {
    this.containsRuleTypes = containsRuleTypes;
    return this;
  }

  public Policybuilderv3Policy addContainsRuleTypesItem(Policybuilderv3RuleType containsRuleTypesItem) {
    if (this.containsRuleTypes == null) {
      this.containsRuleTypes = new ArrayList<>();
    }
    this.containsRuleTypes.add(containsRuleTypesItem);
    return this;
  }

   /**
   * Indicates different type of rule types contained by the policy.
   * @return containsRuleTypes
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3RuleType> getContainsRuleTypes() {
    return containsRuleTypes;
  }

  public void setContainsRuleTypes(List<Policybuilderv3RuleType> containsRuleTypes) {
    this.containsRuleTypes = containsRuleTypes;
  }


  public Policybuilderv3Policy controlFlow(Policybuilderv3ControlFlow controlFlow) {
    this.controlFlow = controlFlow;
    return this;
  }

   /**
   * Get controlFlow
   * @return controlFlow
  **/
  @javax.annotation.Nullable
  public Policybuilderv3ControlFlow getControlFlow() {
    return controlFlow;
  }

  public void setControlFlow(Policybuilderv3ControlFlow controlFlow) {
    this.controlFlow = controlFlow;
  }


  public Policybuilderv3Policy installedFlag(Boolean installedFlag) {
    this.installedFlag = installedFlag;
    return this;
  }

   /**
   * Flag to indicate whether policy is installed or not.
   * @return installedFlag
  **/
  @javax.annotation.Nullable
  public Boolean getInstalledFlag() {
    return installedFlag;
  }

  public void setInstalledFlag(Boolean installedFlag) {
    this.installedFlag = installedFlag;
  }


  public Policybuilderv3Policy installedOrder(Integer installedOrder) {
    this.installedOrder = installedOrder;
    return this;
  }

   /**
   * Variable to indicate the order of the installed policy.
   * @return installedOrder
  **/
  @javax.annotation.Nullable
  public Integer getInstalledOrder() {
    return installedOrder;
  }

  public void setInstalledOrder(Integer installedOrder) {
    this.installedOrder = installedOrder;
  }


  public Policybuilderv3Policy installedTimestamp(String installedTimestamp) {
    this.installedTimestamp = installedTimestamp;
    return this;
  }

   /**
   * Timestamp to indicate when the policy was installed.
   * @return installedTimestamp
  **/
  @javax.annotation.Nullable
  public String getInstalledTimestamp() {
    return installedTimestamp;
  }

  public void setInstalledTimestamp(String installedTimestamp) {
    this.installedTimestamp = installedTimestamp;
  }


  public Policybuilderv3Policy lastEditedTimestamp(String lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
    return this;
  }

   /**
   * Timestamp to indicate when the policy was last edited.
   * @return lastEditedTimestamp
  **/
  @javax.annotation.Nullable
  public String getLastEditedTimestamp() {
    return lastEditedTimestamp;
  }

  public void setLastEditedTimestamp(String lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
  }


  public Policybuilderv3Policy logFlat(Boolean logFlat) {
    this.logFlat = logFlat;
    return this;
  }

   /**
   * Flag to indicate whether the policy has log flat enabled or not.
   * @return logFlat
  **/
  @javax.annotation.Nullable
  public Boolean getLogFlat() {
    return logFlat;
  }

  public void setLogFlat(Boolean logFlat) {
    this.logFlat = logFlat;
  }


  public Policybuilderv3Policy noOfRules(Integer noOfRules) {
    this.noOfRules = noOfRules;
    return this;
  }

   /**
   * Indicates number of rules in the policy.
   * @return noOfRules
  **/
  @javax.annotation.Nullable
  public Integer getNoOfRules() {
    return noOfRules;
  }

  public void setNoOfRules(Integer noOfRules) {
    this.noOfRules = noOfRules;
  }


  public Policybuilderv3Policy policyId(String policyId) {
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


  public Policybuilderv3Policy policyImportIssue(Policybuilderv3ImportIssue policyImportIssue) {
    this.policyImportIssue = policyImportIssue;
    return this;
  }

   /**
   * Get policyImportIssue
   * @return policyImportIssue
  **/
  @javax.annotation.Nullable
  public Policybuilderv3ImportIssue getPolicyImportIssue() {
    return policyImportIssue;
  }

  public void setPolicyImportIssue(Policybuilderv3ImportIssue policyImportIssue) {
    this.policyImportIssue = policyImportIssue;
  }


  public Policybuilderv3Policy policyImportState(Policybuilderv3ImportState policyImportState) {
    this.policyImportState = policyImportState;
    return this;
  }

   /**
   * Get policyImportState
   * @return policyImportState
  **/
  @javax.annotation.Nullable
  public Policybuilderv3ImportState getPolicyImportState() {
    return policyImportState;
  }

  public void setPolicyImportState(Policybuilderv3ImportState policyImportState) {
    this.policyImportState = policyImportState;
  }


  public Policybuilderv3Policy policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Policy Name.
   * @return policyName
  **/
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public Policybuilderv3Policy policyType(Policybuilderv3PolicyType policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  public Policybuilderv3PolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(Policybuilderv3PolicyType policyType) {
    this.policyType = policyType;
  }


  public Policybuilderv3Policy rulesOnFlat(Boolean rulesOnFlat) {
    this.rulesOnFlat = rulesOnFlat;
    return this;
  }

   /**
   * Flag to indicate whether the policy has rules on flat enabled or not.
   * @return rulesOnFlat
  **/
  @javax.annotation.Nullable
  public Boolean getRulesOnFlat() {
    return rulesOnFlat;
  }

  public void setRulesOnFlat(Boolean rulesOnFlat) {
    this.rulesOnFlat = rulesOnFlat;
  }


  public Policybuilderv3Policy template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Flag to indicate whether the policy is a template policy or not.
   * @return template
  **/
  @javax.annotation.Nullable
  public Boolean getTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }


  public Policybuilderv3Policy uiSequence(Integer uiSequence) {
    this.uiSequence = uiSequence;
    return this;
  }

   /**
   * Sequence in which the policy will be displayed in the UI.
   * @return uiSequence
  **/
  @javax.annotation.Nullable
  public Integer getUiSequence() {
    return uiSequence;
  }

  public void setUiSequence(Integer uiSequence) {
    this.uiSequence = uiSequence;
  }


  public Policybuilderv3Policy version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Policy version for different versions of the policy.
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3Policy policybuilderv3Policy = (Policybuilderv3Policy) o;
    return Objects.equals(this.activationStatus, policybuilderv3Policy.activationStatus) &&
        Objects.equals(this.containsRuleTypes, policybuilderv3Policy.containsRuleTypes) &&
        Objects.equals(this.controlFlow, policybuilderv3Policy.controlFlow) &&
        Objects.equals(this.installedFlag, policybuilderv3Policy.installedFlag) &&
        Objects.equals(this.installedOrder, policybuilderv3Policy.installedOrder) &&
        Objects.equals(this.installedTimestamp, policybuilderv3Policy.installedTimestamp) &&
        Objects.equals(this.lastEditedTimestamp, policybuilderv3Policy.lastEditedTimestamp) &&
        Objects.equals(this.logFlat, policybuilderv3Policy.logFlat) &&
        Objects.equals(this.noOfRules, policybuilderv3Policy.noOfRules) &&
        Objects.equals(this.policyId, policybuilderv3Policy.policyId) &&
        Objects.equals(this.policyImportIssue, policybuilderv3Policy.policyImportIssue) &&
        Objects.equals(this.policyImportState, policybuilderv3Policy.policyImportState) &&
        Objects.equals(this.policyName, policybuilderv3Policy.policyName) &&
        Objects.equals(this.policyType, policybuilderv3Policy.policyType) &&
        Objects.equals(this.rulesOnFlat, policybuilderv3Policy.rulesOnFlat) &&
        Objects.equals(this.template, policybuilderv3Policy.template) &&
        Objects.equals(this.uiSequence, policybuilderv3Policy.uiSequence) &&
        Objects.equals(this.version, policybuilderv3Policy.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationStatus, containsRuleTypes, controlFlow, installedFlag, installedOrder, installedTimestamp, lastEditedTimestamp, logFlat, noOfRules, policyId, policyImportIssue, policyImportState, policyName, policyType, rulesOnFlat, template, uiSequence, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3Policy {\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    containsRuleTypes: ").append(toIndentedString(containsRuleTypes)).append("\n");
    sb.append("    controlFlow: ").append(toIndentedString(controlFlow)).append("\n");
    sb.append("    installedFlag: ").append(toIndentedString(installedFlag)).append("\n");
    sb.append("    installedOrder: ").append(toIndentedString(installedOrder)).append("\n");
    sb.append("    installedTimestamp: ").append(toIndentedString(installedTimestamp)).append("\n");
    sb.append("    lastEditedTimestamp: ").append(toIndentedString(lastEditedTimestamp)).append("\n");
    sb.append("    logFlat: ").append(toIndentedString(logFlat)).append("\n");
    sb.append("    noOfRules: ").append(toIndentedString(noOfRules)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyImportIssue: ").append(toIndentedString(policyImportIssue)).append("\n");
    sb.append("    policyImportState: ").append(toIndentedString(policyImportState)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    rulesOnFlat: ").append(toIndentedString(rulesOnFlat)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    uiSequence: ").append(toIndentedString(uiSequence)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("activation_status");
    openapiFields.add("contains_rule_types");
    openapiFields.add("control_flow");
    openapiFields.add("installed_flag");
    openapiFields.add("installed_order");
    openapiFields.add("installed_timestamp");
    openapiFields.add("last_edited_timestamp");
    openapiFields.add("log_flat");
    openapiFields.add("no_of_rules");
    openapiFields.add("policy_id");
    openapiFields.add("policy_import_issue");
    openapiFields.add("policy_import_state");
    openapiFields.add("policy_name");
    openapiFields.add("policy_type");
    openapiFields.add("rules_on_flat");
    openapiFields.add("template");
    openapiFields.add("ui_sequence");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3Policy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3Policy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3Policy is not found in the empty JSON string", Policybuilderv3Policy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3Policy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3Policy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("contains_rule_types") != null && !jsonObj.get("contains_rule_types").isJsonNull() && !jsonObj.get("contains_rule_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contains_rule_types` to be an array in the JSON string but got `%s`", jsonObj.get("contains_rule_types").toString()));
      }
      // validate the optional field `control_flow`
      if (jsonObj.get("control_flow") != null && !jsonObj.get("control_flow").isJsonNull()) {
        Policybuilderv3ControlFlow.validateJsonElement(jsonObj.get("control_flow"));
      }
      if ((jsonObj.get("installed_timestamp") != null && !jsonObj.get("installed_timestamp").isJsonNull()) && !jsonObj.get("installed_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installed_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installed_timestamp").toString()));
      }
      if ((jsonObj.get("last_edited_timestamp") != null && !jsonObj.get("last_edited_timestamp").isJsonNull()) && !jsonObj.get("last_edited_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_edited_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_edited_timestamp").toString()));
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      // validate the optional field `policy_import_issue`
      if (jsonObj.get("policy_import_issue") != null && !jsonObj.get("policy_import_issue").isJsonNull()) {
        Policybuilderv3ImportIssue.validateJsonElement(jsonObj.get("policy_import_issue"));
      }
      // validate the optional field `policy_import_state`
      if (jsonObj.get("policy_import_state") != null && !jsonObj.get("policy_import_state").isJsonNull()) {
        Policybuilderv3ImportState.validateJsonElement(jsonObj.get("policy_import_state"));
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      // validate the optional field `policy_type`
      if (jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) {
        Policybuilderv3PolicyType.validateJsonElement(jsonObj.get("policy_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3Policy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3Policy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3Policy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3Policy.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3Policy>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3Policy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3Policy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3Policy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3Policy
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3Policy
  */
  public static Policybuilderv3Policy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3Policy.class);
  }

 /**
  * Convert an instance of Policybuilderv3Policy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

