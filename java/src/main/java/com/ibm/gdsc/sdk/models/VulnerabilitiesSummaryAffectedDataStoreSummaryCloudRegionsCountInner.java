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
import java.io.IOException;
import java.math.BigDecimal;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner {
  public static final String SERIALIZED_NAME_CLOUD_REGION = "cloudRegion";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGION)
  private String cloudRegion;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner() {
  }

  public VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

   /**
   * Get cloudRegion
   * @return cloudRegion
  **/
  @javax.annotation.Nonnull
  public String getCloudRegion() {
    return cloudRegion;
  }

  public void setCloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  public VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner vulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner = (VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner) o;
    return Objects.equals(this.cloudRegion, vulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.cloudRegion) &&
        Objects.equals(this.count, vulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudRegion, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner {\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("cloudRegion");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudRegion");
    openapiRequiredFields.add("count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner is not found in the empty JSON string", VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cloudRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudRegion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.class));

       return (TypeAdapter<T>) new TypeAdapter<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner>() {
           @Override
           public void write(JsonWriter out, VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner
  * @throws IOException if the JSON string is invalid with respect to VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner
  */
  public static VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.class);
  }

 /**
  * Convert an instance of VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

