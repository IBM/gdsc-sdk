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
import java.util.Arrays;

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
 * Base Policy object which is used in create and list APIs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3Policy {
  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Integer activationStatus;

  public static final String SERIALIZED_NAME_INSTALLED_FLAG = "installed_flag";
  @SerializedName(SERIALIZED_NAME_INSTALLED_FLAG)
  private Boolean installedFlag;

  public static final String SERIALIZED_NAME_INSTALLED_TIMESTAMP = "installed_timestamp";
  @SerializedName(SERIALIZED_NAME_INSTALLED_TIMESTAMP)
  private String installedTimestamp;

  public static final String SERIALIZED_NAME_IS_DELETE = "is_delete";
  @SerializedName(SERIALIZED_NAME_IS_DELETE)
  private Integer isDelete;

  public static final String SERIALIZED_NAME_LAST_EDITED_TIMESTAMP = "last_edited_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_EDITED_TIMESTAMP)
  private String lastEditedTimestamp;

  public static final String SERIALIZED_NAME_NO_OF_RULES = "no_of_rules";
  @SerializedName(SERIALIZED_NAME_NO_OF_RULES)
  private Integer noOfRules;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_SEQUENCE = "policy_sequence";
  @SerializedName(SERIALIZED_NAME_POLICY_SEQUENCE)
  private Integer policySequence;

  public Assetsv3Policy() {
  }

  public Assetsv3Policy activationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Policy Activation Status.
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  public Integer getActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
  }


  public Assetsv3Policy installedFlag(Boolean installedFlag) {
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


  public Assetsv3Policy installedTimestamp(String installedTimestamp) {
    this.installedTimestamp = installedTimestamp;
    return this;
  }

   /**
   * Get installedTimestamp
   * @return installedTimestamp
  **/
  @javax.annotation.Nullable
  public String getInstalledTimestamp() {
    return installedTimestamp;
  }

  public void setInstalledTimestamp(String installedTimestamp) {
    this.installedTimestamp = installedTimestamp;
  }


  public Assetsv3Policy isDelete(Integer isDelete) {
    this.isDelete = isDelete;
    return this;
  }

   /**
   * Policy isDelete.
   * @return isDelete
  **/
  @javax.annotation.Nullable
  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }


  public Assetsv3Policy lastEditedTimestamp(String lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
    return this;
  }

   /**
   * Get lastEditedTimestamp
   * @return lastEditedTimestamp
  **/
  @javax.annotation.Nullable
  public String getLastEditedTimestamp() {
    return lastEditedTimestamp;
  }

  public void setLastEditedTimestamp(String lastEditedTimestamp) {
    this.lastEditedTimestamp = lastEditedTimestamp;
  }


  public Assetsv3Policy noOfRules(Integer noOfRules) {
    this.noOfRules = noOfRules;
    return this;
  }

   /**
   * No. of rules associated with policy.
   * @return noOfRules
  **/
  @javax.annotation.Nullable
  public Integer getNoOfRules() {
    return noOfRules;
  }

  public void setNoOfRules(Integer noOfRules) {
    this.noOfRules = noOfRules;
  }


  public Assetsv3Policy policyId(String policyId) {
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


  public Assetsv3Policy policyName(String policyName) {
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


  public Assetsv3Policy policySequence(Integer policySequence) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3Policy assetsv3Policy = (Assetsv3Policy) o;
    return Objects.equals(this.activationStatus, assetsv3Policy.activationStatus) &&
        Objects.equals(this.installedFlag, assetsv3Policy.installedFlag) &&
        Objects.equals(this.installedTimestamp, assetsv3Policy.installedTimestamp) &&
        Objects.equals(this.isDelete, assetsv3Policy.isDelete) &&
        Objects.equals(this.lastEditedTimestamp, assetsv3Policy.lastEditedTimestamp) &&
        Objects.equals(this.noOfRules, assetsv3Policy.noOfRules) &&
        Objects.equals(this.policyId, assetsv3Policy.policyId) &&
        Objects.equals(this.policyName, assetsv3Policy.policyName) &&
        Objects.equals(this.policySequence, assetsv3Policy.policySequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationStatus, installedFlag, installedTimestamp, isDelete, lastEditedTimestamp, noOfRules, policyId, policyName, policySequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3Policy {\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    installedFlag: ").append(toIndentedString(installedFlag)).append("\n");
    sb.append("    installedTimestamp: ").append(toIndentedString(installedTimestamp)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    lastEditedTimestamp: ").append(toIndentedString(lastEditedTimestamp)).append("\n");
    sb.append("    noOfRules: ").append(toIndentedString(noOfRules)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policySequence: ").append(toIndentedString(policySequence)).append("\n");
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
    openapiFields.add("installed_flag");
    openapiFields.add("installed_timestamp");
    openapiFields.add("is_delete");
    openapiFields.add("last_edited_timestamp");
    openapiFields.add("no_of_rules");
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_sequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3Policy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3Policy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3Policy is not found in the empty JSON string", Assetsv3Policy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3Policy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3Policy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3Policy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3Policy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3Policy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3Policy.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3Policy>() {
           @Override
           public void write(JsonWriter out, Assetsv3Policy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3Policy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3Policy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3Policy
  * @throws IOException if the JSON string is invalid with respect to Assetsv3Policy
  */
  public static Assetsv3Policy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3Policy.class);
  }

 /**
  * Convert an instance of Assetsv3Policy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

