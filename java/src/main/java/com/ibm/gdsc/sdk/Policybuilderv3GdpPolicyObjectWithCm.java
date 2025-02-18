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
 * Policybuilderv3GdpPolicyObjectWithCm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3GdpPolicyObjectWithCm {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER = "central_manager";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER)
  private String centralManager;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_EDITED_TIMESTAMP = "last_edited_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_EDITED_TIMESTAMP)
  private String lastEditedTimestamp;

  public static final String SERIALIZED_NAME_POLICY_DESCRIPTION = "policy_description";
  @SerializedName(SERIALIZED_NAME_POLICY_DESCRIPTION)
  private String policyDescription;

  public static final String SERIALIZED_NAME_POLICY_RULES_COUNT = "policy_rules_count";
  @SerializedName(SERIALIZED_NAME_POLICY_RULES_COUNT)
  private Integer policyRulesCount;

  public static final String SERIALIZED_NAME_POLICY_SUB_TYPE = "policy_sub_type";
  @SerializedName(SERIALIZED_NAME_POLICY_SUB_TYPE)
  private String policySubType;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public Policybuilderv3GdpPolicyObjectWithCm() {
  }

  public Policybuilderv3GdpPolicyObjectWithCm centralManager(String centralManager) {
    this.centralManager = centralManager;
    return this;
  }

   /**
   * Get centralManager
   * @return centralManager
  **/
  @javax.annotation.Nullable
  public String getCentralManager() {
    return centralManager;
  }

  public void setCentralManager(String centralManager) {
    this.centralManager = centralManager;
  }


  public Policybuilderv3GdpPolicyObjectWithCm id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Policybuilderv3GdpPolicyObjectWithCm lastEditedTimestamp(String lastEditedTimestamp) {
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


  public Policybuilderv3GdpPolicyObjectWithCm policyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
    return this;
  }

   /**
   * Policy name.
   * @return policyDescription
  **/
  @javax.annotation.Nullable
  public String getPolicyDescription() {
    return policyDescription;
  }

  public void setPolicyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
  }


  public Policybuilderv3GdpPolicyObjectWithCm policyRulesCount(Integer policyRulesCount) {
    this.policyRulesCount = policyRulesCount;
    return this;
  }

   /**
   * Number of rules.
   * @return policyRulesCount
  **/
  @javax.annotation.Nullable
  public Integer getPolicyRulesCount() {
    return policyRulesCount;
  }

  public void setPolicyRulesCount(Integer policyRulesCount) {
    this.policyRulesCount = policyRulesCount;
  }


  public Policybuilderv3GdpPolicyObjectWithCm policySubType(String policySubType) {
    this.policySubType = policySubType;
    return this;
  }

   /**
   * Get policySubType
   * @return policySubType
  **/
  @javax.annotation.Nullable
  public String getPolicySubType() {
    return policySubType;
  }

  public void setPolicySubType(String policySubType) {
    this.policySubType = policySubType;
  }


  public Policybuilderv3GdpPolicyObjectWithCm policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3GdpPolicyObjectWithCm policybuilderv3GdpPolicyObjectWithCm = (Policybuilderv3GdpPolicyObjectWithCm) o;
    return Objects.equals(this.centralManager, policybuilderv3GdpPolicyObjectWithCm.centralManager) &&
        Objects.equals(this.id, policybuilderv3GdpPolicyObjectWithCm.id) &&
        Objects.equals(this.lastEditedTimestamp, policybuilderv3GdpPolicyObjectWithCm.lastEditedTimestamp) &&
        Objects.equals(this.policyDescription, policybuilderv3GdpPolicyObjectWithCm.policyDescription) &&
        Objects.equals(this.policyRulesCount, policybuilderv3GdpPolicyObjectWithCm.policyRulesCount) &&
        Objects.equals(this.policySubType, policybuilderv3GdpPolicyObjectWithCm.policySubType) &&
        Objects.equals(this.policyType, policybuilderv3GdpPolicyObjectWithCm.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManager, id, lastEditedTimestamp, policyDescription, policyRulesCount, policySubType, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3GdpPolicyObjectWithCm {\n");
    sb.append("    centralManager: ").append(toIndentedString(centralManager)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastEditedTimestamp: ").append(toIndentedString(lastEditedTimestamp)).append("\n");
    sb.append("    policyDescription: ").append(toIndentedString(policyDescription)).append("\n");
    sb.append("    policyRulesCount: ").append(toIndentedString(policyRulesCount)).append("\n");
    sb.append("    policySubType: ").append(toIndentedString(policySubType)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("central_manager");
    openapiFields.add("id");
    openapiFields.add("last_edited_timestamp");
    openapiFields.add("policy_description");
    openapiFields.add("policy_rules_count");
    openapiFields.add("policy_sub_type");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3GdpPolicyObjectWithCm
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3GdpPolicyObjectWithCm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3GdpPolicyObjectWithCm is not found in the empty JSON string", Policybuilderv3GdpPolicyObjectWithCm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3GdpPolicyObjectWithCm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3GdpPolicyObjectWithCm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager") != null && !jsonObj.get("central_manager").isJsonNull()) && !jsonObj.get("central_manager").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("last_edited_timestamp") != null && !jsonObj.get("last_edited_timestamp").isJsonNull()) && !jsonObj.get("last_edited_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_edited_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_edited_timestamp").toString()));
      }
      if ((jsonObj.get("policy_description") != null && !jsonObj.get("policy_description").isJsonNull()) && !jsonObj.get("policy_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_description").toString()));
      }
      if ((jsonObj.get("policy_sub_type") != null && !jsonObj.get("policy_sub_type").isJsonNull()) && !jsonObj.get("policy_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_sub_type").toString()));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3GdpPolicyObjectWithCm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3GdpPolicyObjectWithCm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3GdpPolicyObjectWithCm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3GdpPolicyObjectWithCm.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3GdpPolicyObjectWithCm>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3GdpPolicyObjectWithCm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3GdpPolicyObjectWithCm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3GdpPolicyObjectWithCm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3GdpPolicyObjectWithCm
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3GdpPolicyObjectWithCm
  */
  public static Policybuilderv3GdpPolicyObjectWithCm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3GdpPolicyObjectWithCm.class);
  }

 /**
  * Convert an instance of Policybuilderv3GdpPolicyObjectWithCm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

