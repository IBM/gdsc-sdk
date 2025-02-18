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
import com.ibm.gdsc.sdk.Guardiumconnectorv3Rule;
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
 * Guardiumconnectorv3PolicyData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3PolicyData {
  public static final String SERIALIZED_NAME_AUDIT_PATTERN = "audit_pattern";
  @SerializedName(SERIALIZED_NAME_AUDIT_PATTERN)
  private String auditPattern;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_INSTALLED = "installed";
  @SerializedName(SERIALIZED_NAME_INSTALLED)
  private Boolean installed;

  public static final String SERIALIZED_NAME_LOG_FLAT = "log_flat";
  @SerializedName(SERIALIZED_NAME_LOG_FLAT)
  private Boolean logFlat;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Guardiumconnectorv3Rule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_RULES_ON_FLAT = "rules_on_flat";
  @SerializedName(SERIALIZED_NAME_RULES_ON_FLAT)
  private Boolean rulesOnFlat;

  public Guardiumconnectorv3PolicyData() {
  }

  public Guardiumconnectorv3PolicyData auditPattern(String auditPattern) {
    this.auditPattern = auditPattern;
    return this;
  }

   /**
   * Get auditPattern
   * @return auditPattern
  **/
  @javax.annotation.Nullable
  public String getAuditPattern() {
    return auditPattern;
  }

  public void setAuditPattern(String auditPattern) {
    this.auditPattern = auditPattern;
  }


  public Guardiumconnectorv3PolicyData category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public Guardiumconnectorv3PolicyData installed(Boolean installed) {
    this.installed = installed;
    return this;
  }

   /**
   * Get installed
   * @return installed
  **/
  @javax.annotation.Nullable
  public Boolean getInstalled() {
    return installed;
  }

  public void setInstalled(Boolean installed) {
    this.installed = installed;
  }


  public Guardiumconnectorv3PolicyData logFlat(Boolean logFlat) {
    this.logFlat = logFlat;
    return this;
  }

   /**
   * Get logFlat
   * @return logFlat
  **/
  @javax.annotation.Nullable
  public Boolean getLogFlat() {
    return logFlat;
  }

  public void setLogFlat(Boolean logFlat) {
    this.logFlat = logFlat;
  }


  public Guardiumconnectorv3PolicyData policyName(String policyName) {
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


  public Guardiumconnectorv3PolicyData policyType(String policyType) {
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


  public Guardiumconnectorv3PolicyData rules(List<Guardiumconnectorv3Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Guardiumconnectorv3PolicyData addRulesItem(Guardiumconnectorv3Rule rulesItem) {
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
  public List<Guardiumconnectorv3Rule> getRules() {
    return rules;
  }

  public void setRules(List<Guardiumconnectorv3Rule> rules) {
    this.rules = rules;
  }


  public Guardiumconnectorv3PolicyData rulesOnFlat(Boolean rulesOnFlat) {
    this.rulesOnFlat = rulesOnFlat;
    return this;
  }

   /**
   * Get rulesOnFlat
   * @return rulesOnFlat
  **/
  @javax.annotation.Nullable
  public Boolean getRulesOnFlat() {
    return rulesOnFlat;
  }

  public void setRulesOnFlat(Boolean rulesOnFlat) {
    this.rulesOnFlat = rulesOnFlat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3PolicyData guardiumconnectorv3PolicyData = (Guardiumconnectorv3PolicyData) o;
    return Objects.equals(this.auditPattern, guardiumconnectorv3PolicyData.auditPattern) &&
        Objects.equals(this.category, guardiumconnectorv3PolicyData.category) &&
        Objects.equals(this.installed, guardiumconnectorv3PolicyData.installed) &&
        Objects.equals(this.logFlat, guardiumconnectorv3PolicyData.logFlat) &&
        Objects.equals(this.policyName, guardiumconnectorv3PolicyData.policyName) &&
        Objects.equals(this.policyType, guardiumconnectorv3PolicyData.policyType) &&
        Objects.equals(this.rules, guardiumconnectorv3PolicyData.rules) &&
        Objects.equals(this.rulesOnFlat, guardiumconnectorv3PolicyData.rulesOnFlat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditPattern, category, installed, logFlat, policyName, policyType, rules, rulesOnFlat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3PolicyData {\n");
    sb.append("    auditPattern: ").append(toIndentedString(auditPattern)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
    sb.append("    logFlat: ").append(toIndentedString(logFlat)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    rulesOnFlat: ").append(toIndentedString(rulesOnFlat)).append("\n");
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
    openapiFields.add("audit_pattern");
    openapiFields.add("category");
    openapiFields.add("installed");
    openapiFields.add("log_flat");
    openapiFields.add("policy_name");
    openapiFields.add("policy_type");
    openapiFields.add("rules");
    openapiFields.add("rules_on_flat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3PolicyData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3PolicyData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3PolicyData is not found in the empty JSON string", Guardiumconnectorv3PolicyData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3PolicyData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3PolicyData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("audit_pattern") != null && !jsonObj.get("audit_pattern").isJsonNull()) && !jsonObj.get("audit_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_pattern").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if ((jsonObj.get("policy_type") != null && !jsonObj.get("policy_type").isJsonNull()) && !jsonObj.get("policy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type").toString()));
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
            Guardiumconnectorv3Rule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3PolicyData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3PolicyData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3PolicyData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3PolicyData.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3PolicyData>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3PolicyData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3PolicyData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3PolicyData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3PolicyData
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3PolicyData
  */
  public static Guardiumconnectorv3PolicyData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3PolicyData.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3PolicyData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

