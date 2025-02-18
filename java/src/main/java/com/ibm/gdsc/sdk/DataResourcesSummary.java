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
import com.ibm.gdsc.sdk.DataResourcesSummaryResourceOwnersInner;
import com.ibm.gdsc.sdk.DataResourcesSummaryResourceTypesInner;
import com.ibm.gdsc.sdk.SensitivitiesItemsInner;
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

import com.ibm.gdsc.JSON;

/**
 * DataResourcesSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class DataResourcesSummary {
  public static final String SERIALIZED_NAME_REVIEWED_RESOURCES = "reviewedResources";
  @SerializedName(SERIALIZED_NAME_REVIEWED_RESOURCES)
  private BigDecimal reviewedResources;

  public static final String SERIALIZED_NAME_TOTAL_RESOURCES = "totalResources";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESOURCES)
  private BigDecimal totalResources;

  public static final String SERIALIZED_NAME_RESOURCE_TYPES = "resourceTypes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPES)
  private List<DataResourcesSummaryResourceTypesInner> resourceTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_OWNERS = "resourceOwners";
  @SerializedName(SERIALIZED_NAME_RESOURCE_OWNERS)
  private List<DataResourcesSummaryResourceOwnersInner> resourceOwners = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_SENSITIVITIES = "totalSensitivities";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENSITIVITIES)
  private BigDecimal totalSensitivities;

  public static final String SERIALIZED_NAME_SENSITIVITIES = "sensitivities";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES)
  private List<SensitivitiesItemsInner> sensitivities = new ArrayList<>();

  public DataResourcesSummary() {
  }

  public DataResourcesSummary reviewedResources(BigDecimal reviewedResources) {
    this.reviewedResources = reviewedResources;
    return this;
  }

   /**
   * Get reviewedResources
   * @return reviewedResources
  **/
  @javax.annotation.Nonnull
  public BigDecimal getReviewedResources() {
    return reviewedResources;
  }

  public void setReviewedResources(BigDecimal reviewedResources) {
    this.reviewedResources = reviewedResources;
  }


  public DataResourcesSummary totalResources(BigDecimal totalResources) {
    this.totalResources = totalResources;
    return this;
  }

   /**
   * Get totalResources
   * @return totalResources
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotalResources() {
    return totalResources;
  }

  public void setTotalResources(BigDecimal totalResources) {
    this.totalResources = totalResources;
  }


  public DataResourcesSummary resourceTypes(List<DataResourcesSummaryResourceTypesInner> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public DataResourcesSummary addResourceTypesItem(DataResourcesSummaryResourceTypesInner resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new ArrayList<>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * Get resourceTypes
   * @return resourceTypes
  **/
  @javax.annotation.Nonnull
  public List<DataResourcesSummaryResourceTypesInner> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<DataResourcesSummaryResourceTypesInner> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  public DataResourcesSummary resourceOwners(List<DataResourcesSummaryResourceOwnersInner> resourceOwners) {
    this.resourceOwners = resourceOwners;
    return this;
  }

  public DataResourcesSummary addResourceOwnersItem(DataResourcesSummaryResourceOwnersInner resourceOwnersItem) {
    if (this.resourceOwners == null) {
      this.resourceOwners = new ArrayList<>();
    }
    this.resourceOwners.add(resourceOwnersItem);
    return this;
  }

   /**
   * Get resourceOwners
   * @return resourceOwners
  **/
  @javax.annotation.Nullable
  public List<DataResourcesSummaryResourceOwnersInner> getResourceOwners() {
    return resourceOwners;
  }

  public void setResourceOwners(List<DataResourcesSummaryResourceOwnersInner> resourceOwners) {
    this.resourceOwners = resourceOwners;
  }


  public DataResourcesSummary totalSensitivities(BigDecimal totalSensitivities) {
    this.totalSensitivities = totalSensitivities;
    return this;
  }

   /**
   * Get totalSensitivities
   * @return totalSensitivities
  **/
  @javax.annotation.Nullable
  public BigDecimal getTotalSensitivities() {
    return totalSensitivities;
  }

  public void setTotalSensitivities(BigDecimal totalSensitivities) {
    this.totalSensitivities = totalSensitivities;
  }


  public DataResourcesSummary sensitivities(List<SensitivitiesItemsInner> sensitivities) {
    this.sensitivities = sensitivities;
    return this;
  }

  public DataResourcesSummary addSensitivitiesItem(SensitivitiesItemsInner sensitivitiesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataResourcesSummary dataResourcesSummary = (DataResourcesSummary) o;
    return Objects.equals(this.reviewedResources, dataResourcesSummary.reviewedResources) &&
        Objects.equals(this.totalResources, dataResourcesSummary.totalResources) &&
        Objects.equals(this.resourceTypes, dataResourcesSummary.resourceTypes) &&
        Objects.equals(this.resourceOwners, dataResourcesSummary.resourceOwners) &&
        Objects.equals(this.totalSensitivities, dataResourcesSummary.totalSensitivities) &&
        Objects.equals(this.sensitivities, dataResourcesSummary.sensitivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewedResources, totalResources, resourceTypes, resourceOwners, totalSensitivities, sensitivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataResourcesSummary {\n");
    sb.append("    reviewedResources: ").append(toIndentedString(reviewedResources)).append("\n");
    sb.append("    totalResources: ").append(toIndentedString(totalResources)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    resourceOwners: ").append(toIndentedString(resourceOwners)).append("\n");
    sb.append("    totalSensitivities: ").append(toIndentedString(totalSensitivities)).append("\n");
    sb.append("    sensitivities: ").append(toIndentedString(sensitivities)).append("\n");
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
    openapiFields.add("reviewedResources");
    openapiFields.add("totalResources");
    openapiFields.add("resourceTypes");
    openapiFields.add("resourceOwners");
    openapiFields.add("totalSensitivities");
    openapiFields.add("sensitivities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reviewedResources");
    openapiRequiredFields.add("totalResources");
    openapiRequiredFields.add("resourceTypes");
    openapiRequiredFields.add("sensitivities");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataResourcesSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataResourcesSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataResourcesSummary is not found in the empty JSON string", DataResourcesSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataResourcesSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataResourcesSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataResourcesSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("resourceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("resourceTypes").toString()));
      }

      JsonArray jsonArrayresourceTypes = jsonObj.getAsJsonArray("resourceTypes");
      // validate the required field `resourceTypes` (array)
      for (int i = 0; i < jsonArrayresourceTypes.size(); i++) {
        DataResourcesSummaryResourceTypesInner.validateJsonElement(jsonArrayresourceTypes.get(i));
      };
      if (jsonObj.get("resourceOwners") != null && !jsonObj.get("resourceOwners").isJsonNull()) {
        JsonArray jsonArrayresourceOwners = jsonObj.getAsJsonArray("resourceOwners");
        if (jsonArrayresourceOwners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceOwners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourceOwners` to be an array in the JSON string but got `%s`", jsonObj.get("resourceOwners").toString()));
          }

          // validate the optional field `resourceOwners` (array)
          for (int i = 0; i < jsonArrayresourceOwners.size(); i++) {
            DataResourcesSummaryResourceOwnersInner.validateJsonElement(jsonArrayresourceOwners.get(i));
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("sensitivities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivities` to be an array in the JSON string but got `%s`", jsonObj.get("sensitivities").toString()));
      }

      JsonArray jsonArraysensitivities = jsonObj.getAsJsonArray("sensitivities");
      // validate the required field `sensitivities` (array)
      for (int i = 0; i < jsonArraysensitivities.size(); i++) {
        SensitivitiesItemsInner.validateJsonElement(jsonArraysensitivities.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataResourcesSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataResourcesSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataResourcesSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataResourcesSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DataResourcesSummary>() {
           @Override
           public void write(JsonWriter out, DataResourcesSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataResourcesSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataResourcesSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataResourcesSummary
  * @throws IOException if the JSON string is invalid with respect to DataResourcesSummary
  */
  public static DataResourcesSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataResourcesSummary.class);
  }

 /**
  * Convert an instance of DataResourcesSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

