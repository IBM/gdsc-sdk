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
import org.openapitools.client.model.Policybuilderv3Rule;
import org.openapitools.client.model.Policybuilderv3StatusResponseBase;

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
 * Return object for creating or updating a policy.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3CreateUpdatePolicyResponse {
  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Integer activationStatus;

  public static final String SERIALIZED_NAME_INSTALLED_FLAG = "installed_flag";
  @SerializedName(SERIALIZED_NAME_INSTALLED_FLAG)
  private Boolean installedFlag;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Policybuilderv3Rule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Policybuilderv3StatusResponseBase status;

  public Policybuilderv3CreateUpdatePolicyResponse() {
  }

  public Policybuilderv3CreateUpdatePolicyResponse activationStatus(Integer activationStatus) {
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


  public Policybuilderv3CreateUpdatePolicyResponse installedFlag(Boolean installedFlag) {
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


  public Policybuilderv3CreateUpdatePolicyResponse policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Policy id of the created or updated policy.
   * @return policyId
  **/
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public Policybuilderv3CreateUpdatePolicyResponse policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Policy Name for the created or updated policy.
   * @return policyName
  **/
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public Policybuilderv3CreateUpdatePolicyResponse rules(List<Policybuilderv3Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Policybuilderv3CreateUpdatePolicyResponse addRulesItem(Policybuilderv3Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules contained by the policy.
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3Rule> getRules() {
    return rules;
  }

  public void setRules(List<Policybuilderv3Rule> rules) {
    this.rules = rules;
  }


  public Policybuilderv3CreateUpdatePolicyResponse status(Policybuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Policybuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Policybuilderv3StatusResponseBase status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3CreateUpdatePolicyResponse policybuilderv3CreateUpdatePolicyResponse = (Policybuilderv3CreateUpdatePolicyResponse) o;
    return Objects.equals(this.activationStatus, policybuilderv3CreateUpdatePolicyResponse.activationStatus) &&
        Objects.equals(this.installedFlag, policybuilderv3CreateUpdatePolicyResponse.installedFlag) &&
        Objects.equals(this.policyId, policybuilderv3CreateUpdatePolicyResponse.policyId) &&
        Objects.equals(this.policyName, policybuilderv3CreateUpdatePolicyResponse.policyName) &&
        Objects.equals(this.rules, policybuilderv3CreateUpdatePolicyResponse.rules) &&
        Objects.equals(this.status, policybuilderv3CreateUpdatePolicyResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationStatus, installedFlag, policyId, policyName, rules, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3CreateUpdatePolicyResponse {\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    installedFlag: ").append(toIndentedString(installedFlag)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("rules");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3CreateUpdatePolicyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3CreateUpdatePolicyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3CreateUpdatePolicyResponse is not found in the empty JSON string", Policybuilderv3CreateUpdatePolicyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3CreateUpdatePolicyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3CreateUpdatePolicyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
            Policybuilderv3Rule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Policybuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3CreateUpdatePolicyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3CreateUpdatePolicyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3CreateUpdatePolicyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3CreateUpdatePolicyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3CreateUpdatePolicyResponse>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3CreateUpdatePolicyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3CreateUpdatePolicyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3CreateUpdatePolicyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3CreateUpdatePolicyResponse
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3CreateUpdatePolicyResponse
  */
  public static Policybuilderv3CreateUpdatePolicyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3CreateUpdatePolicyResponse.class);
  }

 /**
  * Convert an instance of Policybuilderv3CreateUpdatePolicyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

