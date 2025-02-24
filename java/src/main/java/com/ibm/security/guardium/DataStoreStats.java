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
import com.ibm.security.guardium.SensitivitySummary;
import com.ibm.security.guardium.VulnerabilitiesCriticalityCountInner;
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
 * DataStoreStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class DataStoreStats {
  public static final String SERIALIZED_NAME_RESOURCES_COUNT = "resourcesCount";
  @SerializedName(SERIALIZED_NAME_RESOURCES_COUNT)
  private BigDecimal resourcesCount;

  public static final String SERIALIZED_NAME_APP_FLOWS_COUNT = "appFlowsCount";
  @SerializedName(SERIALIZED_NAME_APP_FLOWS_COUNT)
  private BigDecimal appFlowsCount;

  public static final String SERIALIZED_NAME_CONFIG_FLOWS_COUNT = "configFlowsCount";
  @SerializedName(SERIALIZED_NAME_CONFIG_FLOWS_COUNT)
  private BigDecimal configFlowsCount;

  public static final String SERIALIZED_NAME_SENSITIVITIES_COUNT = "sensitivitiesCount";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES_COUNT)
  private BigDecimal sensitivitiesCount;

  public static final String SERIALIZED_NAME_USER_ACCESS_COUNT = "userAccessCount";
  @SerializedName(SERIALIZED_NAME_USER_ACCESS_COUNT)
  private BigDecimal userAccessCount;

  public static final String SERIALIZED_NAME_SENSITIVITIES_SUMMARY = "sensitivitiesSummary";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES_SUMMARY)
  private List<SensitivitySummary> sensitivitiesSummary = new ArrayList<>();

  public static final String SERIALIZED_NAME_VULNERABILITIES_SUMMARY = "vulnerabilitiesSummary";
  @SerializedName(SERIALIZED_NAME_VULNERABILITIES_SUMMARY)
  private List<VulnerabilitiesCriticalityCountInner> vulnerabilitiesSummary = new ArrayList<>();

  public DataStoreStats() {
  }

  public DataStoreStats resourcesCount(BigDecimal resourcesCount) {
    this.resourcesCount = resourcesCount;
    return this;
  }

   /**
   * Get resourcesCount
   * @return resourcesCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getResourcesCount() {
    return resourcesCount;
  }

  public void setResourcesCount(BigDecimal resourcesCount) {
    this.resourcesCount = resourcesCount;
  }


  public DataStoreStats appFlowsCount(BigDecimal appFlowsCount) {
    this.appFlowsCount = appFlowsCount;
    return this;
  }

   /**
   * Get appFlowsCount
   * @return appFlowsCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getAppFlowsCount() {
    return appFlowsCount;
  }

  public void setAppFlowsCount(BigDecimal appFlowsCount) {
    this.appFlowsCount = appFlowsCount;
  }


  public DataStoreStats configFlowsCount(BigDecimal configFlowsCount) {
    this.configFlowsCount = configFlowsCount;
    return this;
  }

   /**
   * Get configFlowsCount
   * @return configFlowsCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getConfigFlowsCount() {
    return configFlowsCount;
  }

  public void setConfigFlowsCount(BigDecimal configFlowsCount) {
    this.configFlowsCount = configFlowsCount;
  }


  public DataStoreStats sensitivitiesCount(BigDecimal sensitivitiesCount) {
    this.sensitivitiesCount = sensitivitiesCount;
    return this;
  }

   /**
   * Get sensitivitiesCount
   * @return sensitivitiesCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getSensitivitiesCount() {
    return sensitivitiesCount;
  }

  public void setSensitivitiesCount(BigDecimal sensitivitiesCount) {
    this.sensitivitiesCount = sensitivitiesCount;
  }


  public DataStoreStats userAccessCount(BigDecimal userAccessCount) {
    this.userAccessCount = userAccessCount;
    return this;
  }

   /**
   * number of users entitled to access the data store
   * @return userAccessCount
  **/
  @javax.annotation.Nullable
  public BigDecimal getUserAccessCount() {
    return userAccessCount;
  }

  public void setUserAccessCount(BigDecimal userAccessCount) {
    this.userAccessCount = userAccessCount;
  }


  public DataStoreStats sensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
    return this;
  }

  public DataStoreStats addSensitivitiesSummaryItem(SensitivitySummary sensitivitiesSummaryItem) {
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
  @javax.annotation.Nullable
  public List<SensitivitySummary> getSensitivitiesSummary() {
    return sensitivitiesSummary;
  }

  public void setSensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
  }


  public DataStoreStats vulnerabilitiesSummary(List<VulnerabilitiesCriticalityCountInner> vulnerabilitiesSummary) {
    this.vulnerabilitiesSummary = vulnerabilitiesSummary;
    return this;
  }

  public DataStoreStats addVulnerabilitiesSummaryItem(VulnerabilitiesCriticalityCountInner vulnerabilitiesSummaryItem) {
    if (this.vulnerabilitiesSummary == null) {
      this.vulnerabilitiesSummary = new ArrayList<>();
    }
    this.vulnerabilitiesSummary.add(vulnerabilitiesSummaryItem);
    return this;
  }

   /**
   * Get vulnerabilitiesSummary
   * @return vulnerabilitiesSummary
  **/
  @javax.annotation.Nullable
  public List<VulnerabilitiesCriticalityCountInner> getVulnerabilitiesSummary() {
    return vulnerabilitiesSummary;
  }

  public void setVulnerabilitiesSummary(List<VulnerabilitiesCriticalityCountInner> vulnerabilitiesSummary) {
    this.vulnerabilitiesSummary = vulnerabilitiesSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStoreStats dataStoreStats = (DataStoreStats) o;
    return Objects.equals(this.resourcesCount, dataStoreStats.resourcesCount) &&
        Objects.equals(this.appFlowsCount, dataStoreStats.appFlowsCount) &&
        Objects.equals(this.configFlowsCount, dataStoreStats.configFlowsCount) &&
        Objects.equals(this.sensitivitiesCount, dataStoreStats.sensitivitiesCount) &&
        Objects.equals(this.userAccessCount, dataStoreStats.userAccessCount) &&
        Objects.equals(this.sensitivitiesSummary, dataStoreStats.sensitivitiesSummary) &&
        Objects.equals(this.vulnerabilitiesSummary, dataStoreStats.vulnerabilitiesSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcesCount, appFlowsCount, configFlowsCount, sensitivitiesCount, userAccessCount, sensitivitiesSummary, vulnerabilitiesSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStoreStats {\n");
    sb.append("    resourcesCount: ").append(toIndentedString(resourcesCount)).append("\n");
    sb.append("    appFlowsCount: ").append(toIndentedString(appFlowsCount)).append("\n");
    sb.append("    configFlowsCount: ").append(toIndentedString(configFlowsCount)).append("\n");
    sb.append("    sensitivitiesCount: ").append(toIndentedString(sensitivitiesCount)).append("\n");
    sb.append("    userAccessCount: ").append(toIndentedString(userAccessCount)).append("\n");
    sb.append("    sensitivitiesSummary: ").append(toIndentedString(sensitivitiesSummary)).append("\n");
    sb.append("    vulnerabilitiesSummary: ").append(toIndentedString(vulnerabilitiesSummary)).append("\n");
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
    openapiFields.add("resourcesCount");
    openapiFields.add("appFlowsCount");
    openapiFields.add("configFlowsCount");
    openapiFields.add("sensitivitiesCount");
    openapiFields.add("userAccessCount");
    openapiFields.add("sensitivitiesSummary");
    openapiFields.add("vulnerabilitiesSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStoreStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataStoreStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStoreStats is not found in the empty JSON string", DataStoreStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataStoreStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStoreStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("sensitivitiesSummary") != null && !jsonObj.get("sensitivitiesSummary").isJsonNull()) {
        JsonArray jsonArraysensitivitiesSummary = jsonObj.getAsJsonArray("sensitivitiesSummary");
        if (jsonArraysensitivitiesSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sensitivitiesSummary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sensitivitiesSummary` to be an array in the JSON string but got `%s`", jsonObj.get("sensitivitiesSummary").toString()));
          }

          // validate the optional field `sensitivitiesSummary` (array)
          for (int i = 0; i < jsonArraysensitivitiesSummary.size(); i++) {
            SensitivitySummary.validateJsonElement(jsonArraysensitivitiesSummary.get(i));
          };
        }
      }
      if (jsonObj.get("vulnerabilitiesSummary") != null && !jsonObj.get("vulnerabilitiesSummary").isJsonNull()) {
        JsonArray jsonArrayvulnerabilitiesSummary = jsonObj.getAsJsonArray("vulnerabilitiesSummary");
        if (jsonArrayvulnerabilitiesSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vulnerabilitiesSummary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vulnerabilitiesSummary` to be an array in the JSON string but got `%s`", jsonObj.get("vulnerabilitiesSummary").toString()));
          }

          // validate the optional field `vulnerabilitiesSummary` (array)
          for (int i = 0; i < jsonArrayvulnerabilitiesSummary.size(); i++) {
            VulnerabilitiesCriticalityCountInner.validateJsonElement(jsonArrayvulnerabilitiesSummary.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStoreStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStoreStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStoreStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStoreStats.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStoreStats>() {
           @Override
           public void write(JsonWriter out, DataStoreStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStoreStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStoreStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStoreStats
  * @throws IOException if the JSON string is invalid with respect to DataStoreStats
  */
  public static DataStoreStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStoreStats.class);
  }

 /**
  * Convert an instance of DataStoreStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

