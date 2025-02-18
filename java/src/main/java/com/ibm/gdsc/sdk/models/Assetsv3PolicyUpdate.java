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
import com.ibm.gdsc.sdk.models.Assetsv3Rule;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Create and update policy request message.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Assetsv3PolicyUpdate {
  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Integer activationStatus;

  public static final String SERIALIZED_NAME_DELETED_RULE_IDS = "deleted_rule_ids";
  @SerializedName(SERIALIZED_NAME_DELETED_RULE_IDS)
  private List<String> deletedRuleIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_INSTALLED_FLAG = "installed_flag";
  @SerializedName(SERIALIZED_NAME_INSTALLED_FLAG)
  private Boolean installedFlag;

  public static final String SERIALIZED_NAME_INSTALLED_TIMESTAMP = "installed_timestamp";
  @SerializedName(SERIALIZED_NAME_INSTALLED_TIMESTAMP)
  private String installedTimestamp;

  public static final String SERIALIZED_NAME_LAST_EDITED_TIMESTAMP = "last_edited_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_EDITED_TIMESTAMP)
  private String lastEditedTimestamp;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_SEQUENCE = "policy_sequence";
  @SerializedName(SERIALIZED_NAME_POLICY_SEQUENCE)
  private Integer policySequence;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Assetsv3Rule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_RULE_IDS = "updated_rule_ids";
  @SerializedName(SERIALIZED_NAME_UPDATED_RULE_IDS)
  private List<String> updatedRuleIds = new ArrayList<>();

  public Assetsv3PolicyUpdate() {
  }

  public Assetsv3PolicyUpdate activationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Activation status identifier.
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  public Integer getActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
  }


  public Assetsv3PolicyUpdate deletedRuleIds(List<String> deletedRuleIds) {
    this.deletedRuleIds = deletedRuleIds;
    return this;
  }

  public Assetsv3PolicyUpdate addDeletedRuleIdsItem(String deletedRuleIdsItem) {
    if (this.deletedRuleIds == null) {
      this.deletedRuleIds = new ArrayList<>();
    }
    this.deletedRuleIds.add(deletedRuleIdsItem);
    return this;
  }

   /**
   * The rule ids which are supposed to be deleted on a update policy request.
   * @return deletedRuleIds
  **/
  @javax.annotation.Nullable
  public List<String> getDeletedRuleIds() {
    return deletedRuleIds;
  }

  public void setDeletedRuleIds(List<String> deletedRuleIds) {
    this.deletedRuleIds = deletedRuleIds;
  }


  public Assetsv3PolicyUpdate installedFlag(Boolean installedFlag) {
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


  public Assetsv3PolicyUpdate installedTimestamp(String installedTimestamp) {
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


  public Assetsv3PolicyUpdate lastEditedTimestamp(String lastEditedTimestamp) {
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


  public Assetsv3PolicyUpdate policyId(String policyId) {
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


  public Assetsv3PolicyUpdate policyName(String policyName) {
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


  public Assetsv3PolicyUpdate policySequence(Integer policySequence) {
    this.policySequence = policySequence;
    return this;
  }

   /**
   * Get policySequence
   * @return policySequence
  **/
  @javax.annotation.Nullable
  public Integer getPolicySequence() {
    return policySequence;
  }

  public void setPolicySequence(Integer policySequence) {
    this.policySequence = policySequence;
  }


  public Assetsv3PolicyUpdate rules(List<Assetsv3Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Assetsv3PolicyUpdate addRulesItem(Assetsv3Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<Assetsv3Rule> getRules() {
    return rules;
  }

  public void setRules(List<Assetsv3Rule> rules) {
    this.rules = rules;
  }


  public Assetsv3PolicyUpdate updatedRuleIds(List<String> updatedRuleIds) {
    this.updatedRuleIds = updatedRuleIds;
    return this;
  }

  public Assetsv3PolicyUpdate addUpdatedRuleIdsItem(String updatedRuleIdsItem) {
    if (this.updatedRuleIds == null) {
      this.updatedRuleIds = new ArrayList<>();
    }
    this.updatedRuleIds.add(updatedRuleIdsItem);
    return this;
  }

   /**
   * The rule ids which have been updated on a update policy request.
   * @return updatedRuleIds
  **/
  @javax.annotation.Nullable
  public List<String> getUpdatedRuleIds() {
    return updatedRuleIds;
  }

  public void setUpdatedRuleIds(List<String> updatedRuleIds) {
    this.updatedRuleIds = updatedRuleIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3PolicyUpdate assetsv3PolicyUpdate = (Assetsv3PolicyUpdate) o;
    return Objects.equals(this.activationStatus, assetsv3PolicyUpdate.activationStatus) &&
        Objects.equals(this.deletedRuleIds, assetsv3PolicyUpdate.deletedRuleIds) &&
        Objects.equals(this.installedFlag, assetsv3PolicyUpdate.installedFlag) &&
        Objects.equals(this.installedTimestamp, assetsv3PolicyUpdate.installedTimestamp) &&
        Objects.equals(this.lastEditedTimestamp, assetsv3PolicyUpdate.lastEditedTimestamp) &&
        Objects.equals(this.policyId, assetsv3PolicyUpdate.policyId) &&
        Objects.equals(this.policyName, assetsv3PolicyUpdate.policyName) &&
        Objects.equals(this.policySequence, assetsv3PolicyUpdate.policySequence) &&
        Objects.equals(this.rules, assetsv3PolicyUpdate.rules) &&
        Objects.equals(this.updatedRuleIds, assetsv3PolicyUpdate.updatedRuleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationStatus, deletedRuleIds, installedFlag, installedTimestamp, lastEditedTimestamp, policyId, policyName, policySequence, rules, updatedRuleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3PolicyUpdate {\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    deletedRuleIds: ").append(toIndentedString(deletedRuleIds)).append("\n");
    sb.append("    installedFlag: ").append(toIndentedString(installedFlag)).append("\n");
    sb.append("    installedTimestamp: ").append(toIndentedString(installedTimestamp)).append("\n");
    sb.append("    lastEditedTimestamp: ").append(toIndentedString(lastEditedTimestamp)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policySequence: ").append(toIndentedString(policySequence)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    updatedRuleIds: ").append(toIndentedString(updatedRuleIds)).append("\n");
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
    openapiFields.add("deleted_rule_ids");
    openapiFields.add("installed_flag");
    openapiFields.add("installed_timestamp");
    openapiFields.add("last_edited_timestamp");
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_sequence");
    openapiFields.add("rules");
    openapiFields.add("updated_rule_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3PolicyUpdate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3PolicyUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3PolicyUpdate is not found in the empty JSON string", Assetsv3PolicyUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3PolicyUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3PolicyUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("deleted_rule_ids") != null && !jsonObj.get("deleted_rule_ids").isJsonNull() && !jsonObj.get("deleted_rule_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_rule_ids` to be an array in the JSON string but got `%s`", jsonObj.get("deleted_rule_ids").toString()));
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
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            Assetsv3Rule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("updated_rule_ids") != null && !jsonObj.get("updated_rule_ids").isJsonNull() && !jsonObj.get("updated_rule_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_rule_ids` to be an array in the JSON string but got `%s`", jsonObj.get("updated_rule_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3PolicyUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3PolicyUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3PolicyUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3PolicyUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3PolicyUpdate>() {
           @Override
           public void write(JsonWriter out, Assetsv3PolicyUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3PolicyUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3PolicyUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3PolicyUpdate
  * @throws IOException if the JSON string is invalid with respect to Assetsv3PolicyUpdate
  */
  public static Assetsv3PolicyUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3PolicyUpdate.class);
  }

 /**
  * Convert an instance of Assetsv3PolicyUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

