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
import com.ibm.security.guardium.AnalyzedRegion;
import com.ibm.security.guardium.Environment;
import com.ibm.security.guardium.InstallationStatus;
import com.ibm.security.guardium.ServiceProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * LinkedAccounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class LinkedAccounts {
  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_ID = "cloudAccountId";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_ID)
  private String cloudAccountId;

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_NAME = "cloudAccountName";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_NAME)
  private String cloudAccountName;

  public static final String SERIALIZED_NAME_IS_MAIN_CLOUD_ACCOUNT = "isMainCloudAccount";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_CLOUD_ACCOUNT)
  private Boolean isMainCloudAccount;

  public static final String SERIALIZED_NAME_INSTALLATION_STATUS = "installationStatus";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_STATUS)
  private InstallationStatus installationStatus;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER = "serviceProvider";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER)
  private ServiceProvider serviceProvider;

  public static final String SERIALIZED_NAME_REGION_AVAILABILITY = "regionAvailability";
  @SerializedName(SERIALIZED_NAME_REGION_AVAILABILITY)
  private Map<String, Boolean> regionAvailability = new HashMap<>();

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<AnalyzedRegion> regions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATION_TIME = "creationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private BigDecimal creationTime;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private Environment environment;

  public LinkedAccounts() {
  }

  public LinkedAccounts cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nonnull
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public LinkedAccounts cloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @javax.annotation.Nonnull
  public String getCloudAccountName() {
    return cloudAccountName;
  }

  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }


  public LinkedAccounts isMainCloudAccount(Boolean isMainCloudAccount) {
    this.isMainCloudAccount = isMainCloudAccount;
    return this;
  }

   /**
   * Get isMainCloudAccount
   * @return isMainCloudAccount
  **/
  @javax.annotation.Nonnull
  public Boolean getIsMainCloudAccount() {
    return isMainCloudAccount;
  }

  public void setIsMainCloudAccount(Boolean isMainCloudAccount) {
    this.isMainCloudAccount = isMainCloudAccount;
  }


  public LinkedAccounts installationStatus(InstallationStatus installationStatus) {
    this.installationStatus = installationStatus;
    return this;
  }

   /**
   * Get installationStatus
   * @return installationStatus
  **/
  @javax.annotation.Nonnull
  public InstallationStatus getInstallationStatus() {
    return installationStatus;
  }

  public void setInstallationStatus(InstallationStatus installationStatus) {
    this.installationStatus = installationStatus;
  }


  public LinkedAccounts serviceProvider(ServiceProvider serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @javax.annotation.Nonnull
  public ServiceProvider getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(ServiceProvider serviceProvider) {
    this.serviceProvider = serviceProvider;
  }


  public LinkedAccounts regionAvailability(Map<String, Boolean> regionAvailability) {
    this.regionAvailability = regionAvailability;
    return this;
  }

  public LinkedAccounts putRegionAvailabilityItem(String key, Boolean regionAvailabilityItem) {
    if (this.regionAvailability == null) {
      this.regionAvailability = new HashMap<>();
    }
    this.regionAvailability.put(key, regionAvailabilityItem);
    return this;
  }

   /**
   * Get regionAvailability
   * @return regionAvailability
  **/
  @javax.annotation.Nullable
  public Map<String, Boolean> getRegionAvailability() {
    return regionAvailability;
  }

  public void setRegionAvailability(Map<String, Boolean> regionAvailability) {
    this.regionAvailability = regionAvailability;
  }


  public LinkedAccounts regions(List<AnalyzedRegion> regions) {
    this.regions = regions;
    return this;
  }

  public LinkedAccounts addRegionsItem(AnalyzedRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nonnull
  public List<AnalyzedRegion> getRegions() {
    return regions;
  }

  public void setRegions(List<AnalyzedRegion> regions) {
    this.regions = regions;
  }


  public LinkedAccounts creationTime(BigDecimal creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public BigDecimal getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(BigDecimal creationTime) {
    this.creationTime = creationTime;
  }


  public LinkedAccounts environment(Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedAccounts linkedAccounts = (LinkedAccounts) o;
    return Objects.equals(this.cloudAccountId, linkedAccounts.cloudAccountId) &&
        Objects.equals(this.cloudAccountName, linkedAccounts.cloudAccountName) &&
        Objects.equals(this.isMainCloudAccount, linkedAccounts.isMainCloudAccount) &&
        Objects.equals(this.installationStatus, linkedAccounts.installationStatus) &&
        Objects.equals(this.serviceProvider, linkedAccounts.serviceProvider) &&
        Objects.equals(this.regionAvailability, linkedAccounts.regionAvailability) &&
        Objects.equals(this.regions, linkedAccounts.regions) &&
        Objects.equals(this.creationTime, linkedAccounts.creationTime) &&
        Objects.equals(this.environment, linkedAccounts.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cloudAccountName, isMainCloudAccount, installationStatus, serviceProvider, regionAvailability, regions, creationTime, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedAccounts {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    isMainCloudAccount: ").append(toIndentedString(isMainCloudAccount)).append("\n");
    sb.append("    installationStatus: ").append(toIndentedString(installationStatus)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    regionAvailability: ").append(toIndentedString(regionAvailability)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
    openapiFields.add("cloudAccountName");
    openapiFields.add("isMainCloudAccount");
    openapiFields.add("installationStatus");
    openapiFields.add("serviceProvider");
    openapiFields.add("regionAvailability");
    openapiFields.add("regions");
    openapiFields.add("creationTime");
    openapiFields.add("environment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cloudAccountId");
    openapiRequiredFields.add("cloudAccountName");
    openapiRequiredFields.add("isMainCloudAccount");
    openapiRequiredFields.add("installationStatus");
    openapiRequiredFields.add("serviceProvider");
    openapiRequiredFields.add("regions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LinkedAccounts
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LinkedAccounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkedAccounts is not found in the empty JSON string", LinkedAccounts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LinkedAccounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkedAccounts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkedAccounts.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cloudAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountId").toString()));
      }
      if (!jsonObj.get("cloudAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountName").toString()));
      }
      // validate the required field `installationStatus`
      InstallationStatus.validateJsonElement(jsonObj.get("installationStatus"));
      // validate the required field `serviceProvider`
      ServiceProvider.validateJsonElement(jsonObj.get("serviceProvider"));
      // ensure the json data is an array
      if (!jsonObj.get("regions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions").toString()));
      }

      JsonArray jsonArrayregions = jsonObj.getAsJsonArray("regions");
      // validate the required field `regions` (array)
      for (int i = 0; i < jsonArrayregions.size(); i++) {
        AnalyzedRegion.validateJsonElement(jsonArrayregions.get(i));
      };
      // validate the optional field `environment`
      if (jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) {
        Environment.validateJsonElement(jsonObj.get("environment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkedAccounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkedAccounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkedAccounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkedAccounts.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkedAccounts>() {
           @Override
           public void write(JsonWriter out, LinkedAccounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkedAccounts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkedAccounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkedAccounts
  * @throws IOException if the JSON string is invalid with respect to LinkedAccounts
  */
  public static LinkedAccounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkedAccounts.class);
  }

 /**
  * Convert an instance of LinkedAccounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

