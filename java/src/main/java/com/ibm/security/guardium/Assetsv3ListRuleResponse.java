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
import com.ibm.security.guardium.Assetsv3Rule;
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
 * Assetsv3ListRuleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3ListRuleResponse {
  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Integer activationStatus;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_SEQUENCE = "policy_sequence";
  @SerializedName(SERIALIZED_NAME_POLICY_SEQUENCE)
  private Integer policySequence;

  public static final String SERIALIZED_NAME_RULE_LIST = "rule_list";
  @SerializedName(SERIALIZED_NAME_RULE_LIST)
  private List<Assetsv3Rule> ruleList = new ArrayList<>();

  public Assetsv3ListRuleResponse() {
  }

  public Assetsv3ListRuleResponse activationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Get activationStatus
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  public Integer getActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(Integer activationStatus) {
    this.activationStatus = activationStatus;
  }


  public Assetsv3ListRuleResponse policyId(String policyId) {
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


  public Assetsv3ListRuleResponse policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Get policyName
   * @return policyName
  **/
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public Assetsv3ListRuleResponse policySequence(Integer policySequence) {
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


  public Assetsv3ListRuleResponse ruleList(List<Assetsv3Rule> ruleList) {
    this.ruleList = ruleList;
    return this;
  }

  public Assetsv3ListRuleResponse addRuleListItem(Assetsv3Rule ruleListItem) {
    if (this.ruleList == null) {
      this.ruleList = new ArrayList<>();
    }
    this.ruleList.add(ruleListItem);
    return this;
  }

   /**
   * Get ruleList
   * @return ruleList
  **/
  @javax.annotation.Nullable
  public List<Assetsv3Rule> getRuleList() {
    return ruleList;
  }

  public void setRuleList(List<Assetsv3Rule> ruleList) {
    this.ruleList = ruleList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3ListRuleResponse assetsv3ListRuleResponse = (Assetsv3ListRuleResponse) o;
    return Objects.equals(this.activationStatus, assetsv3ListRuleResponse.activationStatus) &&
        Objects.equals(this.policyId, assetsv3ListRuleResponse.policyId) &&
        Objects.equals(this.policyName, assetsv3ListRuleResponse.policyName) &&
        Objects.equals(this.policySequence, assetsv3ListRuleResponse.policySequence) &&
        Objects.equals(this.ruleList, assetsv3ListRuleResponse.ruleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationStatus, policyId, policyName, policySequence, ruleList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3ListRuleResponse {\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policySequence: ").append(toIndentedString(policySequence)).append("\n");
    sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
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
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_sequence");
    openapiFields.add("rule_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3ListRuleResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3ListRuleResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3ListRuleResponse is not found in the empty JSON string", Assetsv3ListRuleResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3ListRuleResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3ListRuleResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if (jsonObj.get("rule_list") != null && !jsonObj.get("rule_list").isJsonNull()) {
        JsonArray jsonArrayruleList = jsonObj.getAsJsonArray("rule_list");
        if (jsonArrayruleList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rule_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rule_list` to be an array in the JSON string but got `%s`", jsonObj.get("rule_list").toString()));
          }

          // validate the optional field `rule_list` (array)
          for (int i = 0; i < jsonArrayruleList.size(); i++) {
            Assetsv3Rule.validateJsonElement(jsonArrayruleList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3ListRuleResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3ListRuleResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3ListRuleResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3ListRuleResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3ListRuleResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3ListRuleResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3ListRuleResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3ListRuleResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3ListRuleResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3ListRuleResponse
  */
  public static Assetsv3ListRuleResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3ListRuleResponse.class);
  }

 /**
  * Convert an instance of Assetsv3ListRuleResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

