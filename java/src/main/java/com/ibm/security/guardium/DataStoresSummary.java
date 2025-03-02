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
import com.ibm.security.guardium.DataStoresSummaryCloudLocationsInner;
import com.ibm.security.guardium.DataStoresSummaryServiceProvidersInner;
import com.ibm.security.guardium.DataStoresSummaryStoreTypesInner;
import com.ibm.security.guardium.SensitivitiesItemsInner;
import java.io.IOException;
import java.math.BigDecimal;
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
 * DataStoresSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class DataStoresSummary {
  public static final String SERIALIZED_NAME_TOTAL_STORES = "totalStores";
  @SerializedName(SERIALIZED_NAME_TOTAL_STORES)
  private BigDecimal totalStores;

  public static final String SERIALIZED_NAME_STORE_TYPES = "storeTypes";
  @SerializedName(SERIALIZED_NAME_STORE_TYPES)
  private List<DataStoresSummaryStoreTypesInner> storeTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLOUD_LOCATIONS = "cloudLocations";
  @SerializedName(SERIALIZED_NAME_CLOUD_LOCATIONS)
  private List<DataStoresSummaryCloudLocationsInner> cloudLocations = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICE_PROVIDERS = "serviceProviders";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDERS)
  private List<DataStoresSummaryServiceProvidersInner> serviceProviders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_SENSITIVITIES = "totalSensitivities";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENSITIVITIES)
  private BigDecimal totalSensitivities;

  public static final String SERIALIZED_NAME_SENSITIVITIES = "sensitivities";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES)
  private List<SensitivitiesItemsInner> sensitivities = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_POTENTIAL_FLOWS = "totalPotentialFlows";
  @SerializedName(SERIALIZED_NAME_TOTAL_POTENTIAL_FLOWS)
  private BigDecimal totalPotentialFlows;

  public static final String SERIALIZED_NAME_TOTAL_ACTUAL_FLOWS = "totalActualFlows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACTUAL_FLOWS)
  private BigDecimal totalActualFlows;

  public static final String SERIALIZED_NAME_TOTAL_SENSITIVE_STORES = "totalSensitiveStores";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENSITIVE_STORES)
  private BigDecimal totalSensitiveStores;

  public static final String SERIALIZED_NAME_ACCOUNTS_IDS = "accountsIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS_IDS)
  private List<String> accountsIds = new ArrayList<>();

  public DataStoresSummary() {
  }

  public DataStoresSummary totalStores(BigDecimal totalStores) {
    this.totalStores = totalStores;
    return this;
  }

   /**
   * Get totalStores
   * @return totalStores
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalStores() {
    return totalStores;
  }

  public void setTotalStores(BigDecimal totalStores) {
    this.totalStores = totalStores;
  }


  public DataStoresSummary storeTypes(List<DataStoresSummaryStoreTypesInner> storeTypes) {
    this.storeTypes = storeTypes;
    return this;
  }

  public DataStoresSummary addStoreTypesItem(DataStoresSummaryStoreTypesInner storeTypesItem) {
    if (this.storeTypes == null) {
      this.storeTypes = new ArrayList<>();
    }
    this.storeTypes.add(storeTypesItem);
    return this;
  }

   /**
   * Get storeTypes
   * @return storeTypes
  **/
  @javax.annotation.Nonnull
  public List<DataStoresSummaryStoreTypesInner> getStoreTypes() {
    return storeTypes;
  }

  public void setStoreTypes(List<DataStoresSummaryStoreTypesInner> storeTypes) {
    this.storeTypes = storeTypes;
  }


  public DataStoresSummary cloudLocations(List<DataStoresSummaryCloudLocationsInner> cloudLocations) {
    this.cloudLocations = cloudLocations;
    return this;
  }

  public DataStoresSummary addCloudLocationsItem(DataStoresSummaryCloudLocationsInner cloudLocationsItem) {
    if (this.cloudLocations == null) {
      this.cloudLocations = new ArrayList<>();
    }
    this.cloudLocations.add(cloudLocationsItem);
    return this;
  }

   /**
   * Get cloudLocations
   * @return cloudLocations
  **/
  @javax.annotation.Nonnull
  public List<DataStoresSummaryCloudLocationsInner> getCloudLocations() {
    return cloudLocations;
  }

  public void setCloudLocations(List<DataStoresSummaryCloudLocationsInner> cloudLocations) {
    this.cloudLocations = cloudLocations;
  }


  public DataStoresSummary serviceProviders(List<DataStoresSummaryServiceProvidersInner> serviceProviders) {
    this.serviceProviders = serviceProviders;
    return this;
  }

  public DataStoresSummary addServiceProvidersItem(DataStoresSummaryServiceProvidersInner serviceProvidersItem) {
    if (this.serviceProviders == null) {
      this.serviceProviders = new ArrayList<>();
    }
    this.serviceProviders.add(serviceProvidersItem);
    return this;
  }

   /**
   * Get serviceProviders
   * @return serviceProviders
  **/
  @javax.annotation.Nonnull
  public List<DataStoresSummaryServiceProvidersInner> getServiceProviders() {
    return serviceProviders;
  }

  public void setServiceProviders(List<DataStoresSummaryServiceProvidersInner> serviceProviders) {
    this.serviceProviders = serviceProviders;
  }


  public DataStoresSummary totalSensitivities(BigDecimal totalSensitivities) {
    this.totalSensitivities = totalSensitivities;
    return this;
  }

   /**
   * Get totalSensitivities
   * @return totalSensitivities
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalSensitivities() {
    return totalSensitivities;
  }

  public void setTotalSensitivities(BigDecimal totalSensitivities) {
    this.totalSensitivities = totalSensitivities;
  }


  public DataStoresSummary sensitivities(List<SensitivitiesItemsInner> sensitivities) {
    this.sensitivities = sensitivities;
    return this;
  }

  public DataStoresSummary addSensitivitiesItem(SensitivitiesItemsInner sensitivitiesItem) {
    if (this.sensitivities == null) {
      this.sensitivities = new ArrayList<>();
    }
    this.sensitivities.add(sensitivitiesItem);
    return this;
  }

   /**
   * Get sensitivities
   * @return sensitivities
  **/
  @javax.annotation.Nonnull
  public List<SensitivitiesItemsInner> getSensitivities() {
    return sensitivities;
  }

  public void setSensitivities(List<SensitivitiesItemsInner> sensitivities) {
    this.sensitivities = sensitivities;
  }


  public DataStoresSummary totalPotentialFlows(BigDecimal totalPotentialFlows) {
    this.totalPotentialFlows = totalPotentialFlows;
    return this;
  }

   /**
   * Get totalPotentialFlows
   * @return totalPotentialFlows
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalPotentialFlows() {
    return totalPotentialFlows;
  }

  public void setTotalPotentialFlows(BigDecimal totalPotentialFlows) {
    this.totalPotentialFlows = totalPotentialFlows;
  }


  public DataStoresSummary totalActualFlows(BigDecimal totalActualFlows) {
    this.totalActualFlows = totalActualFlows;
    return this;
  }

   /**
   * Get totalActualFlows
   * @return totalActualFlows
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalActualFlows() {
    return totalActualFlows;
  }

  public void setTotalActualFlows(BigDecimal totalActualFlows) {
    this.totalActualFlows = totalActualFlows;
  }


  public DataStoresSummary totalSensitiveStores(BigDecimal totalSensitiveStores) {
    this.totalSensitiveStores = totalSensitiveStores;
    return this;
  }

   /**
   * Get totalSensitiveStores
   * @return totalSensitiveStores
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalSensitiveStores() {
    return totalSensitiveStores;
  }

  public void setTotalSensitiveStores(BigDecimal totalSensitiveStores) {
    this.totalSensitiveStores = totalSensitiveStores;
  }


  public DataStoresSummary accountsIds(List<String> accountsIds) {
    this.accountsIds = accountsIds;
    return this;
  }

  public DataStoresSummary addAccountsIdsItem(String accountsIdsItem) {
    if (this.accountsIds == null) {
      this.accountsIds = new ArrayList<>();
    }
    this.accountsIds.add(accountsIdsItem);
    return this;
  }

   /**
   * Get accountsIds
   * @return accountsIds
  **/
  @javax.annotation.Nonnull
  public List<String> getAccountsIds() {
    return accountsIds;
  }

  public void setAccountsIds(List<String> accountsIds) {
    this.accountsIds = accountsIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStoresSummary dataStoresSummary = (DataStoresSummary) o;
    return Objects.equals(this.totalStores, dataStoresSummary.totalStores) &&
        Objects.equals(this.storeTypes, dataStoresSummary.storeTypes) &&
        Objects.equals(this.cloudLocations, dataStoresSummary.cloudLocations) &&
        Objects.equals(this.serviceProviders, dataStoresSummary.serviceProviders) &&
        Objects.equals(this.totalSensitivities, dataStoresSummary.totalSensitivities) &&
        Objects.equals(this.sensitivities, dataStoresSummary.sensitivities) &&
        Objects.equals(this.totalPotentialFlows, dataStoresSummary.totalPotentialFlows) &&
        Objects.equals(this.totalActualFlows, dataStoresSummary.totalActualFlows) &&
        Objects.equals(this.totalSensitiveStores, dataStoresSummary.totalSensitiveStores) &&
        Objects.equals(this.accountsIds, dataStoresSummary.accountsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalStores, storeTypes, cloudLocations, serviceProviders, totalSensitivities, sensitivities, totalPotentialFlows, totalActualFlows, totalSensitiveStores, accountsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStoresSummary {\n");
    sb.append("    totalStores: ").append(toIndentedString(totalStores)).append("\n");
    sb.append("    storeTypes: ").append(toIndentedString(storeTypes)).append("\n");
    sb.append("    cloudLocations: ").append(toIndentedString(cloudLocations)).append("\n");
    sb.append("    serviceProviders: ").append(toIndentedString(serviceProviders)).append("\n");
    sb.append("    totalSensitivities: ").append(toIndentedString(totalSensitivities)).append("\n");
    sb.append("    sensitivities: ").append(toIndentedString(sensitivities)).append("\n");
    sb.append("    totalPotentialFlows: ").append(toIndentedString(totalPotentialFlows)).append("\n");
    sb.append("    totalActualFlows: ").append(toIndentedString(totalActualFlows)).append("\n");
    sb.append("    totalSensitiveStores: ").append(toIndentedString(totalSensitiveStores)).append("\n");
    sb.append("    accountsIds: ").append(toIndentedString(accountsIds)).append("\n");
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
    openapiFields.add("totalStores");
    openapiFields.add("storeTypes");
    openapiFields.add("cloudLocations");
    openapiFields.add("serviceProviders");
    openapiFields.add("totalSensitivities");
    openapiFields.add("sensitivities");
    openapiFields.add("totalPotentialFlows");
    openapiFields.add("totalActualFlows");
    openapiFields.add("totalSensitiveStores");
    openapiFields.add("accountsIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("totalStores");
    openapiRequiredFields.add("storeTypes");
    openapiRequiredFields.add("cloudLocations");
    openapiRequiredFields.add("serviceProviders");
    openapiRequiredFields.add("totalSensitivities");
    openapiRequiredFields.add("sensitivities");
    openapiRequiredFields.add("totalPotentialFlows");
    openapiRequiredFields.add("totalActualFlows");
    openapiRequiredFields.add("totalSensitiveStores");
    openapiRequiredFields.add("accountsIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStoresSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataStoresSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStoresSummary is not found in the empty JSON string", DataStoresSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataStoresSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStoresSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataStoresSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("storeTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeTypes` to be an array in the JSON string but got `%s`", jsonObj.get("storeTypes").toString()));
      }

      JsonArray jsonArraystoreTypes = jsonObj.getAsJsonArray("storeTypes");
      // validate the required field `storeTypes` (array)
      for (int i = 0; i < jsonArraystoreTypes.size(); i++) {
        DataStoresSummaryStoreTypesInner.validateJsonElement(jsonArraystoreTypes.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("cloudLocations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudLocations` to be an array in the JSON string but got `%s`", jsonObj.get("cloudLocations").toString()));
      }

      JsonArray jsonArraycloudLocations = jsonObj.getAsJsonArray("cloudLocations");
      // validate the required field `cloudLocations` (array)
      for (int i = 0; i < jsonArraycloudLocations.size(); i++) {
        DataStoresSummaryCloudLocationsInner.validateJsonElement(jsonArraycloudLocations.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("serviceProviders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceProviders` to be an array in the JSON string but got `%s`", jsonObj.get("serviceProviders").toString()));
      }

      JsonArray jsonArrayserviceProviders = jsonObj.getAsJsonArray("serviceProviders");
      // validate the required field `serviceProviders` (array)
      for (int i = 0; i < jsonArrayserviceProviders.size(); i++) {
        DataStoresSummaryServiceProvidersInner.validateJsonElement(jsonArrayserviceProviders.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("sensitivities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivities` to be an array in the JSON string but got `%s`", jsonObj.get("sensitivities").toString()));
      }

      JsonArray jsonArraysensitivities = jsonObj.getAsJsonArray("sensitivities");
      // validate the required field `sensitivities` (array)
      for (int i = 0; i < jsonArraysensitivities.size(); i++) {
        SensitivitiesItemsInner.validateJsonElement(jsonArraysensitivities.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("accountsIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accountsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountsIds` to be an array in the JSON string but got `%s`", jsonObj.get("accountsIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStoresSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStoresSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStoresSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStoresSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStoresSummary>() {
           @Override
           public void write(JsonWriter out, DataStoresSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStoresSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStoresSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStoresSummary
  * @throws IOException if the JSON string is invalid with respect to DataStoresSummary
  */
  public static DataStoresSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStoresSummary.class);
  }

 /**
  * Convert an instance of DataStoresSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

