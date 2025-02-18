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
import com.ibm.gdsc.sdk.CloudServiceProvider;
import com.ibm.gdsc.sdk.SensitivitySummary;
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
 * VendorDataStore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class VendorDataStore {
  public static final String SERIALIZED_NAME_DATA_STORE_ID = "dataStoreId";
  @SerializedName(SERIALIZED_NAME_DATA_STORE_ID)
  private String dataStoreId;

  public static final String SERIALIZED_NAME_DATA_STORE_TYPE = "dataStoreType";
  @SerializedName(SERIALIZED_NAME_DATA_STORE_TYPE)
  private String dataStoreType;

  public static final String SERIALIZED_NAME_DATA_STORE_NAME = "dataStoreName";
  @SerializedName(SERIALIZED_NAME_DATA_STORE_NAME)
  private String dataStoreName;

  public static final String SERIALIZED_NAME_CLOUD_REGION = "cloudRegion";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGION)
  private String cloudRegion;

  public static final String SERIALIZED_NAME_SENSITIVITIES_SUMMARY = "sensitivitiesSummary";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES_SUMMARY)
  private List<SensitivitySummary> sensitivitiesSummary = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public VendorDataStore() {
  }

  public VendorDataStore dataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
    return this;
  }

   /**
   * Get dataStoreId
   * @return dataStoreId
  **/
  @javax.annotation.Nonnull
  public String getDataStoreId() {
    return dataStoreId;
  }

  public void setDataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
  }


  public VendorDataStore dataStoreType(String dataStoreType) {
    this.dataStoreType = dataStoreType;
    return this;
  }

   /**
   * Get dataStoreType
   * @return dataStoreType
  **/
  @javax.annotation.Nonnull
  public String getDataStoreType() {
    return dataStoreType;
  }

  public void setDataStoreType(String dataStoreType) {
    this.dataStoreType = dataStoreType;
  }


  public VendorDataStore dataStoreName(String dataStoreName) {
    this.dataStoreName = dataStoreName;
    return this;
  }

   /**
   * Get dataStoreName
   * @return dataStoreName
  **/
  @javax.annotation.Nonnull
  public String getDataStoreName() {
    return dataStoreName;
  }

  public void setDataStoreName(String dataStoreName) {
    this.dataStoreName = dataStoreName;
  }


  public VendorDataStore cloudRegion(String cloudRegion) {
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


  public VendorDataStore sensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
    return this;
  }

  public VendorDataStore addSensitivitiesSummaryItem(SensitivitySummary sensitivitiesSummaryItem) {
    if (this.sensitivitiesSummary == null) {
      this.sensitivitiesSummary = new ArrayList<>();
    }
    this.sensitivitiesSummary.add(sensitivitiesSummaryItem);
    return this;
  }

   /**
   * Get sensitivitiesSummary
   * @return sensitivitiesSummary
  **/
  @javax.annotation.Nonnull
  public List<SensitivitySummary> getSensitivitiesSummary() {
    return sensitivitiesSummary;
  }

  public void setSensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
  }


  public VendorDataStore cloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  public CloudServiceProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorDataStore vendorDataStore = (VendorDataStore) o;
    return Objects.equals(this.dataStoreId, vendorDataStore.dataStoreId) &&
        Objects.equals(this.dataStoreType, vendorDataStore.dataStoreType) &&
        Objects.equals(this.dataStoreName, vendorDataStore.dataStoreName) &&
        Objects.equals(this.cloudRegion, vendorDataStore.cloudRegion) &&
        Objects.equals(this.sensitivitiesSummary, vendorDataStore.sensitivitiesSummary) &&
        Objects.equals(this.cloudProvider, vendorDataStore.cloudProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStoreId, dataStoreType, dataStoreName, cloudRegion, sensitivitiesSummary, cloudProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorDataStore {\n");
    sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
    sb.append("    dataStoreType: ").append(toIndentedString(dataStoreType)).append("\n");
    sb.append("    dataStoreName: ").append(toIndentedString(dataStoreName)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    sensitivitiesSummary: ").append(toIndentedString(sensitivitiesSummary)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
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
    openapiFields.add("dataStoreId");
    openapiFields.add("dataStoreType");
    openapiFields.add("dataStoreName");
    openapiFields.add("cloudRegion");
    openapiFields.add("sensitivitiesSummary");
    openapiFields.add("cloudProvider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataStoreId");
    openapiRequiredFields.add("dataStoreType");
    openapiRequiredFields.add("dataStoreName");
    openapiRequiredFields.add("cloudRegion");
    openapiRequiredFields.add("sensitivitiesSummary");
    openapiRequiredFields.add("cloudProvider");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorDataStore
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VendorDataStore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VendorDataStore is not found in the empty JSON string", VendorDataStore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VendorDataStore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VendorDataStore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VendorDataStore.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dataStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreId").toString()));
      }
      if (!jsonObj.get("dataStoreType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreType").toString()));
      }
      if (!jsonObj.get("dataStoreName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreName").toString()));
      }
      if (!jsonObj.get("cloudRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudRegion").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sensitivitiesSummary").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivitiesSummary` to be an array in the JSON string but got `%s`", jsonObj.get("sensitivitiesSummary").toString()));
      }

      JsonArray jsonArraysensitivitiesSummary = jsonObj.getAsJsonArray("sensitivitiesSummary");
      // validate the required field `sensitivitiesSummary` (array)
      for (int i = 0; i < jsonArraysensitivitiesSummary.size(); i++) {
        SensitivitySummary.validateJsonElement(jsonArraysensitivitiesSummary.get(i));
      };
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorDataStore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorDataStore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorDataStore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorDataStore.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorDataStore>() {
           @Override
           public void write(JsonWriter out, VendorDataStore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorDataStore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorDataStore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorDataStore
  * @throws IOException if the JSON string is invalid with respect to VendorDataStore
  */
  public static VendorDataStore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorDataStore.class);
  }

 /**
  * Convert an instance of VendorDataStore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

