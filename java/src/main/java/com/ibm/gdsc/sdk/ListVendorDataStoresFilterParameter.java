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
import com.ibm.gdsc.sdk.CloudServiceProvider;
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
 * ListVendorDataStoresFilterParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class ListVendorDataStoresFilterParameter {
  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_ID = "cloudAccountId";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_ID)
  private String cloudAccountId;

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

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public ListVendorDataStoresFilterParameter() {
  }

  public ListVendorDataStoresFilterParameter cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * The customer cloud account ID
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public ListVendorDataStoresFilterParameter dataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
    return this;
  }

   /**
   * Get dataStoreId
   * @return dataStoreId
  **/
  @javax.annotation.Nullable
  public String getDataStoreId() {
    return dataStoreId;
  }

  public void setDataStoreId(String dataStoreId) {
    this.dataStoreId = dataStoreId;
  }


  public ListVendorDataStoresFilterParameter dataStoreType(String dataStoreType) {
    this.dataStoreType = dataStoreType;
    return this;
  }

   /**
   * Get dataStoreType
   * @return dataStoreType
  **/
  @javax.annotation.Nullable
  public String getDataStoreType() {
    return dataStoreType;
  }

  public void setDataStoreType(String dataStoreType) {
    this.dataStoreType = dataStoreType;
  }


  public ListVendorDataStoresFilterParameter dataStoreName(String dataStoreName) {
    this.dataStoreName = dataStoreName;
    return this;
  }

   /**
   * Get dataStoreName
   * @return dataStoreName
  **/
  @javax.annotation.Nullable
  public String getDataStoreName() {
    return dataStoreName;
  }

  public void setDataStoreName(String dataStoreName) {
    this.dataStoreName = dataStoreName;
  }


  public ListVendorDataStoresFilterParameter cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

   /**
   * Get cloudRegion
   * @return cloudRegion
  **/
  @javax.annotation.Nullable
  public String getCloudRegion() {
    return cloudRegion;
  }

  public void setCloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  public ListVendorDataStoresFilterParameter cloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
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
    ListVendorDataStoresFilterParameter listVendorDataStoresFilterParameter = (ListVendorDataStoresFilterParameter) o;
    return Objects.equals(this.cloudAccountId, listVendorDataStoresFilterParameter.cloudAccountId) &&
        Objects.equals(this.dataStoreId, listVendorDataStoresFilterParameter.dataStoreId) &&
        Objects.equals(this.dataStoreType, listVendorDataStoresFilterParameter.dataStoreType) &&
        Objects.equals(this.dataStoreName, listVendorDataStoresFilterParameter.dataStoreName) &&
        Objects.equals(this.cloudRegion, listVendorDataStoresFilterParameter.cloudRegion) &&
        Objects.equals(this.cloudProvider, listVendorDataStoresFilterParameter.cloudProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, dataStoreId, dataStoreType, dataStoreName, cloudRegion, cloudProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVendorDataStoresFilterParameter {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
    sb.append("    dataStoreType: ").append(toIndentedString(dataStoreType)).append("\n");
    sb.append("    dataStoreName: ").append(toIndentedString(dataStoreName)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
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
    openapiFields.add("cloudAccountId");
    openapiFields.add("dataStoreId");
    openapiFields.add("dataStoreType");
    openapiFields.add("dataStoreName");
    openapiFields.add("cloudRegion");
    openapiFields.add("cloudProvider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListVendorDataStoresFilterParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListVendorDataStoresFilterParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListVendorDataStoresFilterParameter is not found in the empty JSON string", ListVendorDataStoresFilterParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListVendorDataStoresFilterParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListVendorDataStoresFilterParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cloudAccountId") != null && !jsonObj.get("cloudAccountId").isJsonNull()) && !jsonObj.get("cloudAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountId").toString()));
      }
      if ((jsonObj.get("dataStoreId") != null && !jsonObj.get("dataStoreId").isJsonNull()) && !jsonObj.get("dataStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreId").toString()));
      }
      if ((jsonObj.get("dataStoreType") != null && !jsonObj.get("dataStoreType").isJsonNull()) && !jsonObj.get("dataStoreType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreType").toString()));
      }
      if ((jsonObj.get("dataStoreName") != null && !jsonObj.get("dataStoreName").isJsonNull()) && !jsonObj.get("dataStoreName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataStoreName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataStoreName").toString()));
      }
      if ((jsonObj.get("cloudRegion") != null && !jsonObj.get("cloudRegion").isJsonNull()) && !jsonObj.get("cloudRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudRegion").toString()));
      }
      // validate the optional field `cloudProvider`
      if (jsonObj.get("cloudProvider") != null && !jsonObj.get("cloudProvider").isJsonNull()) {
        CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListVendorDataStoresFilterParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListVendorDataStoresFilterParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListVendorDataStoresFilterParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListVendorDataStoresFilterParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<ListVendorDataStoresFilterParameter>() {
           @Override
           public void write(JsonWriter out, ListVendorDataStoresFilterParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListVendorDataStoresFilterParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListVendorDataStoresFilterParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListVendorDataStoresFilterParameter
  * @throws IOException if the JSON string is invalid with respect to ListVendorDataStoresFilterParameter
  */
  public static ListVendorDataStoresFilterParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListVendorDataStoresFilterParameter.class);
  }

 /**
  * Convert an instance of ListVendorDataStoresFilterParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

