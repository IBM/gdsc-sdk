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
import com.ibm.gdsc.sdk.VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner;
import com.ibm.gdsc.sdk.VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner;
import com.ibm.gdsc.sdk.VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner;
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
 * VulnerabilitiesSummaryAffectedDataStoreSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class VulnerabilitiesSummaryAffectedDataStoreSummary {
  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_IDS_COUNT = "cloudAccountIdsCount";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_IDS_COUNT)
  private List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner> cloudAccountIdsCount = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_REGIONS_COUNT = "cloudRegionsCount";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGIONS_COUNT)
  private List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner> cloudRegionsCount = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_STORE_TYPES = "dataStoreTypes";
  @SerializedName(SERIALIZED_NAME_DATA_STORE_TYPES)
  private List<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner> dataStoreTypes = new ArrayList<>();

  public VulnerabilitiesSummaryAffectedDataStoreSummary() {
  }

  public VulnerabilitiesSummaryAffectedDataStoreSummary cloudAccountIdsCount(List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner> cloudAccountIdsCount) {
    this.cloudAccountIdsCount = cloudAccountIdsCount;
    return this;
  }

  public VulnerabilitiesSummaryAffectedDataStoreSummary addCloudAccountIdsCountItem(VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner cloudAccountIdsCountItem) {
    if (this.cloudAccountIdsCount == null) {
      this.cloudAccountIdsCount = new ArrayList<>();
    }
    this.cloudAccountIdsCount.add(cloudAccountIdsCountItem);
    return this;
  }

   /**
   * Get cloudAccountIdsCount
   * @return cloudAccountIdsCount
  **/
  @javax.annotation.Nonnull
  public List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner> getCloudAccountIdsCount() {
    return cloudAccountIdsCount;
  }

  public void setCloudAccountIdsCount(List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner> cloudAccountIdsCount) {
    this.cloudAccountIdsCount = cloudAccountIdsCount;
  }


  public VulnerabilitiesSummaryAffectedDataStoreSummary cloudRegionsCount(List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner> cloudRegionsCount) {
    this.cloudRegionsCount = cloudRegionsCount;
    return this;
  }

  public VulnerabilitiesSummaryAffectedDataStoreSummary addCloudRegionsCountItem(VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner cloudRegionsCountItem) {
    if (this.cloudRegionsCount == null) {
      this.cloudRegionsCount = new ArrayList<>();
    }
    this.cloudRegionsCount.add(cloudRegionsCountItem);
    return this;
  }

   /**
   * Get cloudRegionsCount
   * @return cloudRegionsCount
  **/
  @javax.annotation.Nonnull
  public List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner> getCloudRegionsCount() {
    return cloudRegionsCount;
  }

  public void setCloudRegionsCount(List<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner> cloudRegionsCount) {
    this.cloudRegionsCount = cloudRegionsCount;
  }


  public VulnerabilitiesSummaryAffectedDataStoreSummary dataStoreTypes(List<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner> dataStoreTypes) {
    this.dataStoreTypes = dataStoreTypes;
    return this;
  }

  public VulnerabilitiesSummaryAffectedDataStoreSummary addDataStoreTypesItem(VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner dataStoreTypesItem) {
    if (this.dataStoreTypes == null) {
      this.dataStoreTypes = new ArrayList<>();
    }
    this.dataStoreTypes.add(dataStoreTypesItem);
    return this;
  }

   /**
   * Get dataStoreTypes
   * @return dataStoreTypes
  **/
  @javax.annotation.Nonnull
  public List<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner> getDataStoreTypes() {
    return dataStoreTypes;
  }

  public void setDataStoreTypes(List<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner> dataStoreTypes) {
    this.dataStoreTypes = dataStoreTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VulnerabilitiesSummaryAffectedDataStoreSummary vulnerabilitiesSummaryAffectedDataStoreSummary = (VulnerabilitiesSummaryAffectedDataStoreSummary) o;
    return Objects.equals(this.cloudAccountIdsCount, vulnerabilitiesSummaryAffectedDataStoreSummary.cloudAccountIdsCount) &&
        Objects.equals(this.cloudRegionsCount, vulnerabilitiesSummaryAffectedDataStoreSummary.cloudRegionsCount) &&
        Objects.equals(this.dataStoreTypes, vulnerabilitiesSummaryAffectedDataStoreSummary.dataStoreTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountIdsCount, cloudRegionsCount, dataStoreTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VulnerabilitiesSummaryAffectedDataStoreSummary {\n");
    sb.append("    cloudAccountIdsCount: ").append(toIndentedString(cloudAccountIdsCount)).append("\n");
    sb.append("    cloudRegionsCount: ").append(toIndentedString(cloudRegionsCount)).append("\n");
    sb.append("    dataStoreTypes: ").append(toIndentedString(dataStoreTypes)).append("\n");
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
    openapiFields.add("cloudAccountIdsCount");
    openapiFields.add("cloudRegionsCount");
    openapiFields.add("dataStoreTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudAccountIdsCount");
    openapiRequiredFields.add("cloudRegionsCount");
    openapiRequiredFields.add("dataStoreTypes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VulnerabilitiesSummaryAffectedDataStoreSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VulnerabilitiesSummaryAffectedDataStoreSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VulnerabilitiesSummaryAffectedDataStoreSummary is not found in the empty JSON string", VulnerabilitiesSummaryAffectedDataStoreSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VulnerabilitiesSummaryAffectedDataStoreSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VulnerabilitiesSummaryAffectedDataStoreSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VulnerabilitiesSummaryAffectedDataStoreSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("cloudAccountIdsCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountIdsCount` to be an array in the JSON string but got `%s`", jsonObj.get("cloudAccountIdsCount").toString()));
      }

      JsonArray jsonArraycloudAccountIdsCount = jsonObj.getAsJsonArray("cloudAccountIdsCount");
      // validate the required field `cloudAccountIdsCount` (array)
      for (int i = 0; i < jsonArraycloudAccountIdsCount.size(); i++) {
        VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner.validateJsonElement(jsonArraycloudAccountIdsCount.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("cloudRegionsCount").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegionsCount` to be an array in the JSON string but got `%s`", jsonObj.get("cloudRegionsCount").toString()));
      }

      JsonArray jsonArraycloudRegionsCount = jsonObj.getAsJsonArray("cloudRegionsCount");
      // validate the required field `cloudRegionsCount` (array)
      for (int i = 0; i < jsonArraycloudRegionsCount.size(); i++) {
        VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner.validateJsonElement(jsonArraycloudRegionsCount.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("dataStoreTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreTypes` to be an array in the JSON string but got `%s`", jsonObj.get("dataStoreTypes").toString()));
      }

      JsonArray jsonArraydataStoreTypes = jsonObj.getAsJsonArray("dataStoreTypes");
      // validate the required field `dataStoreTypes` (array)
      for (int i = 0; i < jsonArraydataStoreTypes.size(); i++) {
        VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner.validateJsonElement(jsonArraydataStoreTypes.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VulnerabilitiesSummaryAffectedDataStoreSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VulnerabilitiesSummaryAffectedDataStoreSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VulnerabilitiesSummaryAffectedDataStoreSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VulnerabilitiesSummaryAffectedDataStoreSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<VulnerabilitiesSummaryAffectedDataStoreSummary>() {
           @Override
           public void write(JsonWriter out, VulnerabilitiesSummaryAffectedDataStoreSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VulnerabilitiesSummaryAffectedDataStoreSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VulnerabilitiesSummaryAffectedDataStoreSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VulnerabilitiesSummaryAffectedDataStoreSummary
  * @throws IOException if the JSON string is invalid with respect to VulnerabilitiesSummaryAffectedDataStoreSummary
  */
  public static VulnerabilitiesSummaryAffectedDataStoreSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VulnerabilitiesSummaryAffectedDataStoreSummary.class);
  }

 /**
  * Convert an instance of VulnerabilitiesSummaryAffectedDataStoreSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

