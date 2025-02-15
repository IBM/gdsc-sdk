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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Reportsv3VariantRule;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Reportsv3VariantDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3VariantDetails {
  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_LAST_RUN = "last_run";
  @SerializedName(SERIALIZED_NAME_LAST_RUN)
  private OffsetDateTime lastRun;

  public static final String SERIALIZED_NAME_LAST_RUN_ERROR = "last_run_error";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_ERROR)
  private String lastRunError;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<Reportsv3VariantRule> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_VARIANT_ID = "variant_id";
  @SerializedName(SERIALIZED_NAME_VARIANT_ID)
  private String variantId;

  public static final String SERIALIZED_NAME_VARIANT_NAME = "variant_name";
  @SerializedName(SERIALIZED_NAME_VARIANT_NAME)
  private String variantName;

  public static final String SERIALIZED_NAME_VARIANT_TABLE = "variant_table";
  @SerializedName(SERIALIZED_NAME_VARIANT_TABLE)
  private String variantTable;

  public Reportsv3VariantDetails() {
  }

  public Reportsv3VariantDetails headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Reportsv3VariantDetails lastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
    return this;
  }

   /**
   * Get lastRun
   * @return lastRun
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastRun() {
    return lastRun;
  }

  public void setLastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
  }


  public Reportsv3VariantDetails lastRunError(String lastRunError) {
    this.lastRunError = lastRunError;
    return this;
  }

   /**
   * Get lastRunError
   * @return lastRunError
  **/
  @javax.annotation.Nullable
  public String getLastRunError() {
    return lastRunError;
  }

  public void setLastRunError(String lastRunError) {
    this.lastRunError = lastRunError;
  }


  public Reportsv3VariantDetails rules(List<Reportsv3VariantRule> rules) {
    this.rules = rules;
    return this;
  }

  public Reportsv3VariantDetails addRulesItem(Reportsv3VariantRule rulesItem) {
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
  public List<Reportsv3VariantRule> getRules() {
    return rules;
  }

  public void setRules(List<Reportsv3VariantRule> rules) {
    this.rules = rules;
  }


  public Reportsv3VariantDetails totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public Reportsv3VariantDetails variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * Get variantId
   * @return variantId
  **/
  @javax.annotation.Nullable
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }


  public Reportsv3VariantDetails variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

   /**
   * Get variantName
   * @return variantName
  **/
  @javax.annotation.Nullable
  public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
  }


  public Reportsv3VariantDetails variantTable(String variantTable) {
    this.variantTable = variantTable;
    return this;
  }

   /**
   * Get variantTable
   * @return variantTable
  **/
  @javax.annotation.Nullable
  public String getVariantTable() {
    return variantTable;
  }

  public void setVariantTable(String variantTable) {
    this.variantTable = variantTable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3VariantDetails reportsv3VariantDetails = (Reportsv3VariantDetails) o;
    return Objects.equals(this.headerId, reportsv3VariantDetails.headerId) &&
        Objects.equals(this.lastRun, reportsv3VariantDetails.lastRun) &&
        Objects.equals(this.lastRunError, reportsv3VariantDetails.lastRunError) &&
        Objects.equals(this.rules, reportsv3VariantDetails.rules) &&
        Objects.equals(this.totalCount, reportsv3VariantDetails.totalCount) &&
        Objects.equals(this.variantId, reportsv3VariantDetails.variantId) &&
        Objects.equals(this.variantName, reportsv3VariantDetails.variantName) &&
        Objects.equals(this.variantTable, reportsv3VariantDetails.variantTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerId, lastRun, lastRunError, rules, totalCount, variantId, variantName, variantTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3VariantDetails {\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    lastRunError: ").append(toIndentedString(lastRunError)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
    sb.append("    variantTable: ").append(toIndentedString(variantTable)).append("\n");
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
    openapiFields.add("header_id");
    openapiFields.add("last_run");
    openapiFields.add("last_run_error");
    openapiFields.add("rules");
    openapiFields.add("total_count");
    openapiFields.add("variant_id");
    openapiFields.add("variant_name");
    openapiFields.add("variant_table");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3VariantDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3VariantDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3VariantDetails is not found in the empty JSON string", Reportsv3VariantDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3VariantDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3VariantDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("last_run_error") != null && !jsonObj.get("last_run_error").isJsonNull()) && !jsonObj.get("last_run_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_run_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_run_error").toString()));
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
            Reportsv3VariantRule.validateJsonElement(jsonArrayrules.get(i));
          };
        }
      }
      if ((jsonObj.get("variant_id") != null && !jsonObj.get("variant_id").isJsonNull()) && !jsonObj.get("variant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_id").toString()));
      }
      if ((jsonObj.get("variant_name") != null && !jsonObj.get("variant_name").isJsonNull()) && !jsonObj.get("variant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_name").toString()));
      }
      if ((jsonObj.get("variant_table") != null && !jsonObj.get("variant_table").isJsonNull()) && !jsonObj.get("variant_table").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_table` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_table").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3VariantDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3VariantDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3VariantDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3VariantDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3VariantDetails>() {
           @Override
           public void write(JsonWriter out, Reportsv3VariantDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3VariantDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3VariantDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3VariantDetails
  * @throws IOException if the JSON string is invalid with respect to Reportsv3VariantDetails
  */
  public static Reportsv3VariantDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3VariantDetails.class);
  }

 /**
  * Convert an instance of Reportsv3VariantDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

