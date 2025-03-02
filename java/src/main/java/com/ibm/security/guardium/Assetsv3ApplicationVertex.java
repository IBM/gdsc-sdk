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
import com.ibm.security.guardium.Assetsv3ConnectionEdge;
import com.ibm.security.guardium.Assetsv3CustomProperty;
import com.ibm.security.guardium.Assetsv3Level;
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

import com.ibm.security.JSON;

/**
 * Assetsv3ApplicationVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3ApplicationVertex {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APPLICATION_DATABASE = "application_database";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DATABASE)
  private List<Assetsv3ConnectionEdge> applicationDatabase = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_ENDPOINT = "application_endpoint";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ENDPOINT)
  private List<Assetsv3ConnectionEdge> applicationEndpoint = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_HOST = "application_host";
  @SerializedName(SERIALIZED_NAME_APPLICATION_HOST)
  private List<Assetsv3ConnectionEdge> applicationHost = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_IP = "application_ip";
  @SerializedName(SERIALIZED_NAME_APPLICATION_IP)
  private List<Assetsv3ConnectionEdge> applicationIp = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_APPLICATION_STORAGE = "application_storage";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STORAGE)
  private List<Assetsv3ConnectionEdge> applicationStorage = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_SUB_TYPE = "application_sub_type";
  @SerializedName(SERIALIZED_NAME_APPLICATION_SUB_TYPE)
  private String applicationSubType;

  public static final String SERIALIZED_NAME_APPLICATION_SUBSCRIPTION = "application_subscription";
  @SerializedName(SERIALIZED_NAME_APPLICATION_SUBSCRIPTION)
  private List<Assetsv3ConnectionEdge> applicationSubscription = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATION_TYPE = "application_type";
  @SerializedName(SERIALIZED_NAME_APPLICATION_TYPE)
  private String applicationType;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CRITICALITY = "criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Assetsv3Level criticality = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_USED = "last_used";
  @SerializedName(SERIALIZED_NAME_LAST_USED)
  private OffsetDateTime lastUsed;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private List<String> owner = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENT_APPLICATION = "parent_application";
  @SerializedName(SERIALIZED_NAME_PARENT_APPLICATION)
  private String parentApplication;

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private Assetsv3Level riskLevel = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "service_type";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Assetsv3ApplicationVertex() {
  }

  public Assetsv3ApplicationVertex appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  public Assetsv3ApplicationVertex applicationDatabase(List<Assetsv3ConnectionEdge> applicationDatabase) {
    this.applicationDatabase = applicationDatabase;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationDatabaseItem(Assetsv3ConnectionEdge applicationDatabaseItem) {
    if (this.applicationDatabase == null) {
      this.applicationDatabase = new ArrayList<>();
    }
    this.applicationDatabase.add(applicationDatabaseItem);
    return this;
  }

   /**
   * Get applicationDatabase
   * @return applicationDatabase
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationDatabase() {
    return applicationDatabase;
  }

  public void setApplicationDatabase(List<Assetsv3ConnectionEdge> applicationDatabase) {
    this.applicationDatabase = applicationDatabase;
  }


  public Assetsv3ApplicationVertex applicationEndpoint(List<Assetsv3ConnectionEdge> applicationEndpoint) {
    this.applicationEndpoint = applicationEndpoint;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationEndpointItem(Assetsv3ConnectionEdge applicationEndpointItem) {
    if (this.applicationEndpoint == null) {
      this.applicationEndpoint = new ArrayList<>();
    }
    this.applicationEndpoint.add(applicationEndpointItem);
    return this;
  }

   /**
   * Get applicationEndpoint
   * @return applicationEndpoint
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationEndpoint() {
    return applicationEndpoint;
  }

  public void setApplicationEndpoint(List<Assetsv3ConnectionEdge> applicationEndpoint) {
    this.applicationEndpoint = applicationEndpoint;
  }


  public Assetsv3ApplicationVertex applicationHost(List<Assetsv3ConnectionEdge> applicationHost) {
    this.applicationHost = applicationHost;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationHostItem(Assetsv3ConnectionEdge applicationHostItem) {
    if (this.applicationHost == null) {
      this.applicationHost = new ArrayList<>();
    }
    this.applicationHost.add(applicationHostItem);
    return this;
  }

   /**
   * Get applicationHost
   * @return applicationHost
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationHost() {
    return applicationHost;
  }

  public void setApplicationHost(List<Assetsv3ConnectionEdge> applicationHost) {
    this.applicationHost = applicationHost;
  }


  public Assetsv3ApplicationVertex applicationIp(List<Assetsv3ConnectionEdge> applicationIp) {
    this.applicationIp = applicationIp;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationIpItem(Assetsv3ConnectionEdge applicationIpItem) {
    if (this.applicationIp == null) {
      this.applicationIp = new ArrayList<>();
    }
    this.applicationIp.add(applicationIpItem);
    return this;
  }

   /**
   * Get applicationIp
   * @return applicationIp
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationIp() {
    return applicationIp;
  }

  public void setApplicationIp(List<Assetsv3ConnectionEdge> applicationIp) {
    this.applicationIp = applicationIp;
  }


  public Assetsv3ApplicationVertex applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @javax.annotation.Nullable
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public Assetsv3ApplicationVertex applicationStorage(List<Assetsv3ConnectionEdge> applicationStorage) {
    this.applicationStorage = applicationStorage;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationStorageItem(Assetsv3ConnectionEdge applicationStorageItem) {
    if (this.applicationStorage == null) {
      this.applicationStorage = new ArrayList<>();
    }
    this.applicationStorage.add(applicationStorageItem);
    return this;
  }

   /**
   * Get applicationStorage
   * @return applicationStorage
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationStorage() {
    return applicationStorage;
  }

  public void setApplicationStorage(List<Assetsv3ConnectionEdge> applicationStorage) {
    this.applicationStorage = applicationStorage;
  }


  public Assetsv3ApplicationVertex applicationSubType(String applicationSubType) {
    this.applicationSubType = applicationSubType;
    return this;
  }

   /**
   * Get applicationSubType
   * @return applicationSubType
  **/
  @javax.annotation.Nullable
  public String getApplicationSubType() {
    return applicationSubType;
  }

  public void setApplicationSubType(String applicationSubType) {
    this.applicationSubType = applicationSubType;
  }


  public Assetsv3ApplicationVertex applicationSubscription(List<Assetsv3ConnectionEdge> applicationSubscription) {
    this.applicationSubscription = applicationSubscription;
    return this;
  }

  public Assetsv3ApplicationVertex addApplicationSubscriptionItem(Assetsv3ConnectionEdge applicationSubscriptionItem) {
    if (this.applicationSubscription == null) {
      this.applicationSubscription = new ArrayList<>();
    }
    this.applicationSubscription.add(applicationSubscriptionItem);
    return this;
  }

   /**
   * Get applicationSubscription
   * @return applicationSubscription
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getApplicationSubscription() {
    return applicationSubscription;
  }

  public void setApplicationSubscription(List<Assetsv3ConnectionEdge> applicationSubscription) {
    this.applicationSubscription = applicationSubscription;
  }


  public Assetsv3ApplicationVertex applicationType(String applicationType) {
    this.applicationType = applicationType;
    return this;
  }

   /**
   * Get applicationType
   * @return applicationType
  **/
  @javax.annotation.Nullable
  public String getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }


  public Assetsv3ApplicationVertex category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public Assetsv3ApplicationVertex criticality(Assetsv3Level criticality) {
    this.criticality = criticality;
    return this;
  }

   /**
   * Get criticality
   * @return criticality
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getCriticality() {
    return criticality;
  }

  public void setCriticality(Assetsv3Level criticality) {
    this.criticality = criticality;
  }


  public Assetsv3ApplicationVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3ApplicationVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
    if (this.extendedProperties == null) {
      this.extendedProperties = new ArrayList<>();
    }
    this.extendedProperties.add(extendedPropertiesItem);
    return this;
  }

   /**
   * Get extendedProperties
   * @return extendedProperties
  **/
  @javax.annotation.Nullable
  public List<Assetsv3CustomProperty> getExtendedProperties() {
    return extendedProperties;
  }

  public void setExtendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public Assetsv3ApplicationVertex lastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * Get lastUsed
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
  }


  public Assetsv3ApplicationVertex owner(List<String> owner) {
    this.owner = owner;
    return this;
  }

  public Assetsv3ApplicationVertex addOwnerItem(String ownerItem) {
    if (this.owner == null) {
      this.owner = new ArrayList<>();
    }
    this.owner.add(ownerItem);
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  public List<String> getOwner() {
    return owner;
  }

  public void setOwner(List<String> owner) {
    this.owner = owner;
  }


  public Assetsv3ApplicationVertex parentApplication(String parentApplication) {
    this.parentApplication = parentApplication;
    return this;
  }

   /**
   * Get parentApplication
   * @return parentApplication
  **/
  @javax.annotation.Nullable
  public String getParentApplication() {
    return parentApplication;
  }

  public void setParentApplication(String parentApplication) {
    this.parentApplication = parentApplication;
  }


  public Assetsv3ApplicationVertex resolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
    return this;
  }

   /**
   * Get resolutionKey
   * @return resolutionKey
  **/
  @javax.annotation.Nullable
  public String getResolutionKey() {
    return resolutionKey;
  }

  public void setResolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
  }


  public Assetsv3ApplicationVertex riskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
  }


  public Assetsv3ApplicationVertex serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public Assetsv3ApplicationVertex version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3ApplicationVertex assetsv3ApplicationVertex = (Assetsv3ApplicationVertex) o;
    return Objects.equals(this.appId, assetsv3ApplicationVertex.appId) &&
        Objects.equals(this.applicationDatabase, assetsv3ApplicationVertex.applicationDatabase) &&
        Objects.equals(this.applicationEndpoint, assetsv3ApplicationVertex.applicationEndpoint) &&
        Objects.equals(this.applicationHost, assetsv3ApplicationVertex.applicationHost) &&
        Objects.equals(this.applicationIp, assetsv3ApplicationVertex.applicationIp) &&
        Objects.equals(this.applicationName, assetsv3ApplicationVertex.applicationName) &&
        Objects.equals(this.applicationStorage, assetsv3ApplicationVertex.applicationStorage) &&
        Objects.equals(this.applicationSubType, assetsv3ApplicationVertex.applicationSubType) &&
        Objects.equals(this.applicationSubscription, assetsv3ApplicationVertex.applicationSubscription) &&
        Objects.equals(this.applicationType, assetsv3ApplicationVertex.applicationType) &&
        Objects.equals(this.category, assetsv3ApplicationVertex.category) &&
        Objects.equals(this.criticality, assetsv3ApplicationVertex.criticality) &&
        Objects.equals(this.extendedProperties, assetsv3ApplicationVertex.extendedProperties) &&
        Objects.equals(this.lastUsed, assetsv3ApplicationVertex.lastUsed) &&
        Objects.equals(this.owner, assetsv3ApplicationVertex.owner) &&
        Objects.equals(this.parentApplication, assetsv3ApplicationVertex.parentApplication) &&
        Objects.equals(this.resolutionKey, assetsv3ApplicationVertex.resolutionKey) &&
        Objects.equals(this.riskLevel, assetsv3ApplicationVertex.riskLevel) &&
        Objects.equals(this.serviceType, assetsv3ApplicationVertex.serviceType) &&
        Objects.equals(this.version, assetsv3ApplicationVertex.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, applicationDatabase, applicationEndpoint, applicationHost, applicationIp, applicationName, applicationStorage, applicationSubType, applicationSubscription, applicationType, category, criticality, extendedProperties, lastUsed, owner, parentApplication, resolutionKey, riskLevel, serviceType, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3ApplicationVertex {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    applicationDatabase: ").append(toIndentedString(applicationDatabase)).append("\n");
    sb.append("    applicationEndpoint: ").append(toIndentedString(applicationEndpoint)).append("\n");
    sb.append("    applicationHost: ").append(toIndentedString(applicationHost)).append("\n");
    sb.append("    applicationIp: ").append(toIndentedString(applicationIp)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationStorage: ").append(toIndentedString(applicationStorage)).append("\n");
    sb.append("    applicationSubType: ").append(toIndentedString(applicationSubType)).append("\n");
    sb.append("    applicationSubscription: ").append(toIndentedString(applicationSubscription)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentApplication: ").append(toIndentedString(parentApplication)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("application_database");
    openapiFields.add("application_endpoint");
    openapiFields.add("application_host");
    openapiFields.add("application_ip");
    openapiFields.add("application_name");
    openapiFields.add("application_storage");
    openapiFields.add("application_sub_type");
    openapiFields.add("application_subscription");
    openapiFields.add("application_type");
    openapiFields.add("category");
    openapiFields.add("criticality");
    openapiFields.add("extended_properties");
    openapiFields.add("last_used");
    openapiFields.add("owner");
    openapiFields.add("parent_application");
    openapiFields.add("resolution_key");
    openapiFields.add("risk_level");
    openapiFields.add("service_type");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3ApplicationVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3ApplicationVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3ApplicationVertex is not found in the empty JSON string", Assetsv3ApplicationVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3ApplicationVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3ApplicationVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("app_id") != null && !jsonObj.get("app_id").isJsonNull()) && !jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      if (jsonObj.get("application_database") != null && !jsonObj.get("application_database").isJsonNull()) {
        JsonArray jsonArrayapplicationDatabase = jsonObj.getAsJsonArray("application_database");
        if (jsonArrayapplicationDatabase != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_database").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_database` to be an array in the JSON string but got `%s`", jsonObj.get("application_database").toString()));
          }

          // validate the optional field `application_database` (array)
          for (int i = 0; i < jsonArrayapplicationDatabase.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationDatabase.get(i));
          };
        }
      }
      if (jsonObj.get("application_endpoint") != null && !jsonObj.get("application_endpoint").isJsonNull()) {
        JsonArray jsonArrayapplicationEndpoint = jsonObj.getAsJsonArray("application_endpoint");
        if (jsonArrayapplicationEndpoint != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_endpoint").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_endpoint` to be an array in the JSON string but got `%s`", jsonObj.get("application_endpoint").toString()));
          }

          // validate the optional field `application_endpoint` (array)
          for (int i = 0; i < jsonArrayapplicationEndpoint.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationEndpoint.get(i));
          };
        }
      }
      if (jsonObj.get("application_host") != null && !jsonObj.get("application_host").isJsonNull()) {
        JsonArray jsonArrayapplicationHost = jsonObj.getAsJsonArray("application_host");
        if (jsonArrayapplicationHost != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_host").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_host` to be an array in the JSON string but got `%s`", jsonObj.get("application_host").toString()));
          }

          // validate the optional field `application_host` (array)
          for (int i = 0; i < jsonArrayapplicationHost.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationHost.get(i));
          };
        }
      }
      if (jsonObj.get("application_ip") != null && !jsonObj.get("application_ip").isJsonNull()) {
        JsonArray jsonArrayapplicationIp = jsonObj.getAsJsonArray("application_ip");
        if (jsonArrayapplicationIp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_ip").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_ip` to be an array in the JSON string but got `%s`", jsonObj.get("application_ip").toString()));
          }

          // validate the optional field `application_ip` (array)
          for (int i = 0; i < jsonArrayapplicationIp.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationIp.get(i));
          };
        }
      }
      if ((jsonObj.get("application_name") != null && !jsonObj.get("application_name").isJsonNull()) && !jsonObj.get("application_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_name").toString()));
      }
      if (jsonObj.get("application_storage") != null && !jsonObj.get("application_storage").isJsonNull()) {
        JsonArray jsonArrayapplicationStorage = jsonObj.getAsJsonArray("application_storage");
        if (jsonArrayapplicationStorage != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_storage").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_storage` to be an array in the JSON string but got `%s`", jsonObj.get("application_storage").toString()));
          }

          // validate the optional field `application_storage` (array)
          for (int i = 0; i < jsonArrayapplicationStorage.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationStorage.get(i));
          };
        }
      }
      if ((jsonObj.get("application_sub_type") != null && !jsonObj.get("application_sub_type").isJsonNull()) && !jsonObj.get("application_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_sub_type").toString()));
      }
      if (jsonObj.get("application_subscription") != null && !jsonObj.get("application_subscription").isJsonNull()) {
        JsonArray jsonArrayapplicationSubscription = jsonObj.getAsJsonArray("application_subscription");
        if (jsonArrayapplicationSubscription != null) {
          // ensure the json data is an array
          if (!jsonObj.get("application_subscription").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `application_subscription` to be an array in the JSON string but got `%s`", jsonObj.get("application_subscription").toString()));
          }

          // validate the optional field `application_subscription` (array)
          for (int i = 0; i < jsonArrayapplicationSubscription.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayapplicationSubscription.get(i));
          };
        }
      }
      if ((jsonObj.get("application_type") != null && !jsonObj.get("application_type").isJsonNull()) && !jsonObj.get("application_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_type").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // validate the optional field `criticality`
      if (jsonObj.get("criticality") != null && !jsonObj.get("criticality").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("criticality"));
      }
      if (jsonObj.get("extended_properties") != null && !jsonObj.get("extended_properties").isJsonNull()) {
        JsonArray jsonArrayextendedProperties = jsonObj.getAsJsonArray("extended_properties");
        if (jsonArrayextendedProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extended_properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extended_properties` to be an array in the JSON string but got `%s`", jsonObj.get("extended_properties").toString()));
          }

          // validate the optional field `extended_properties` (array)
          for (int i = 0; i < jsonArrayextendedProperties.size(); i++) {
            Assetsv3CustomProperty.validateJsonElement(jsonArrayextendedProperties.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull() && !jsonObj.get("owner").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be an array in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("parent_application") != null && !jsonObj.get("parent_application").isJsonNull()) && !jsonObj.get("parent_application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_application").toString()));
      }
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("risk_level"));
      }
      if ((jsonObj.get("service_type") != null && !jsonObj.get("service_type").isJsonNull()) && !jsonObj.get("service_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_type").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3ApplicationVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3ApplicationVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3ApplicationVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3ApplicationVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3ApplicationVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3ApplicationVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3ApplicationVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3ApplicationVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3ApplicationVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3ApplicationVertex
  */
  public static Assetsv3ApplicationVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3ApplicationVertex.class);
  }

 /**
  * Convert an instance of Assetsv3ApplicationVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

