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
 * GetDistributionRulesResponse returns all the distribution rule IDs in the scheduler collection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3GetDistributionRulesResponse {
  public static final String SERIALIZED_NAME_DISTRIBUTION_RULE_IDS = "distribution_rule_ids";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_RULE_IDS)
  private List<String> distributionRuleIds = new ArrayList<>();

  public Schedulerv3GetDistributionRulesResponse() {
  }

  public Schedulerv3GetDistributionRulesResponse distributionRuleIds(List<String> distributionRuleIds) {
    this.distributionRuleIds = distributionRuleIds;
    return this;
  }

  public Schedulerv3GetDistributionRulesResponse addDistributionRuleIdsItem(String distributionRuleIdsItem) {
    if (this.distributionRuleIds == null) {
      this.distributionRuleIds = new ArrayList<>();
    }
    this.distributionRuleIds.add(distributionRuleIdsItem);
    return this;
  }

   /**
   * Get distributionRuleIds
   * @return distributionRuleIds
  **/
  @javax.annotation.Nullable
  public List<String> getDistributionRuleIds() {
    return distributionRuleIds;
  }

  public void setDistributionRuleIds(List<String> distributionRuleIds) {
    this.distributionRuleIds = distributionRuleIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3GetDistributionRulesResponse schedulerv3GetDistributionRulesResponse = (Schedulerv3GetDistributionRulesResponse) o;
    return Objects.equals(this.distributionRuleIds, schedulerv3GetDistributionRulesResponse.distributionRuleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionRuleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3GetDistributionRulesResponse {\n");
    sb.append("    distributionRuleIds: ").append(toIndentedString(distributionRuleIds)).append("\n");
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
    openapiFields.add("distribution_rule_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3GetDistributionRulesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3GetDistributionRulesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3GetDistributionRulesResponse is not found in the empty JSON string", Schedulerv3GetDistributionRulesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3GetDistributionRulesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3GetDistributionRulesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("distribution_rule_ids") != null && !jsonObj.get("distribution_rule_ids").isJsonNull() && !jsonObj.get("distribution_rule_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_rule_ids` to be an array in the JSON string but got `%s`", jsonObj.get("distribution_rule_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3GetDistributionRulesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3GetDistributionRulesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3GetDistributionRulesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3GetDistributionRulesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3GetDistributionRulesResponse>() {
           @Override
           public void write(JsonWriter out, Schedulerv3GetDistributionRulesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3GetDistributionRulesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3GetDistributionRulesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3GetDistributionRulesResponse
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3GetDistributionRulesResponse
  */
  public static Schedulerv3GetDistributionRulesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3GetDistributionRulesResponse.class);
  }

 /**
  * Convert an instance of Schedulerv3GetDistributionRulesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

