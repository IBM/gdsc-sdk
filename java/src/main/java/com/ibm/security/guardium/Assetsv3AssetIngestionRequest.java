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
import com.ibm.security.guardium.Assetsv3AccountVertex;
import com.ibm.security.guardium.Assetsv3ApplicationVertex;
import com.ibm.security.guardium.Assetsv3DatabaseVertex;
import com.ibm.security.guardium.Assetsv3DeploymentVertex;
import com.ibm.security.guardium.Assetsv3EndpointVertex;
import com.ibm.security.guardium.Assetsv3HostVertex;
import com.ibm.security.guardium.Assetsv3IPVertex;
import com.ibm.security.guardium.Assetsv3ModelVertex;
import com.ibm.security.guardium.Assetsv3PortVertex;
import com.ibm.security.guardium.Assetsv3ResourcesVertex;
import com.ibm.security.guardium.Assetsv3StorageVertex;
import com.ibm.security.guardium.Assetsv3SubscriptionVertex;
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
 * Assetsv3AssetIngestionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetIngestionRequest {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Assetsv3AccountVertex> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<Assetsv3ApplicationVertex> applications = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATABASES = "databases";
  @SerializedName(SERIALIZED_NAME_DATABASES)
  private List<Assetsv3DatabaseVertex> databases = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPLOYMENTS = "deployments";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENTS)
  private List<Assetsv3DeploymentVertex> deployments = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<Assetsv3EndpointVertex> endpoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<Assetsv3HostVertex> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<Assetsv3IPVertex> ips = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODELS = "models";
  @SerializedName(SERIALIZED_NAME_MODELS)
  private List<Assetsv3ModelVertex> models = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<Assetsv3PortVertex> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<Assetsv3ResourcesVertex> resources = new ArrayList<>();

  public static final String SERIALIZED_NAME_STORAGES = "storages";
  @SerializedName(SERIALIZED_NAME_STORAGES)
  private List<Assetsv3StorageVertex> storages = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<Assetsv3SubscriptionVertex> subscriptions = new ArrayList<>();

  public Assetsv3AssetIngestionRequest() {
  }

  public Assetsv3AssetIngestionRequest accounts(List<Assetsv3AccountVertex> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Assetsv3AssetIngestionRequest addAccountsItem(Assetsv3AccountVertex accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  public List<Assetsv3AccountVertex> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Assetsv3AccountVertex> accounts) {
    this.accounts = accounts;
  }


  public Assetsv3AssetIngestionRequest applications(List<Assetsv3ApplicationVertex> applications) {
    this.applications = applications;
    return this;
  }

  public Assetsv3AssetIngestionRequest addApplicationsItem(Assetsv3ApplicationVertex applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ApplicationVertex> getApplications() {
    return applications;
  }

  public void setApplications(List<Assetsv3ApplicationVertex> applications) {
    this.applications = applications;
  }


  public Assetsv3AssetIngestionRequest databases(List<Assetsv3DatabaseVertex> databases) {
    this.databases = databases;
    return this;
  }

  public Assetsv3AssetIngestionRequest addDatabasesItem(Assetsv3DatabaseVertex databasesItem) {
    if (this.databases == null) {
      this.databases = new ArrayList<>();
    }
    this.databases.add(databasesItem);
    return this;
  }

   /**
   * Get databases
   * @return databases
  **/
  @javax.annotation.Nullable
  public List<Assetsv3DatabaseVertex> getDatabases() {
    return databases;
  }

  public void setDatabases(List<Assetsv3DatabaseVertex> databases) {
    this.databases = databases;
  }


  public Assetsv3AssetIngestionRequest deployments(List<Assetsv3DeploymentVertex> deployments) {
    this.deployments = deployments;
    return this;
  }

  public Assetsv3AssetIngestionRequest addDeploymentsItem(Assetsv3DeploymentVertex deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new ArrayList<>();
    }
    this.deployments.add(deploymentsItem);
    return this;
  }

   /**
   * Get deployments
   * @return deployments
  **/
  @javax.annotation.Nullable
  public List<Assetsv3DeploymentVertex> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<Assetsv3DeploymentVertex> deployments) {
    this.deployments = deployments;
  }


  public Assetsv3AssetIngestionRequest endpoints(List<Assetsv3EndpointVertex> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Assetsv3AssetIngestionRequest addEndpointsItem(Assetsv3EndpointVertex endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @javax.annotation.Nullable
  public List<Assetsv3EndpointVertex> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<Assetsv3EndpointVertex> endpoints) {
    this.endpoints = endpoints;
  }


  public Assetsv3AssetIngestionRequest hosts(List<Assetsv3HostVertex> hosts) {
    this.hosts = hosts;
    return this;
  }

  public Assetsv3AssetIngestionRequest addHostsItem(Assetsv3HostVertex hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  public List<Assetsv3HostVertex> getHosts() {
    return hosts;
  }

  public void setHosts(List<Assetsv3HostVertex> hosts) {
    this.hosts = hosts;
  }


  public Assetsv3AssetIngestionRequest ips(List<Assetsv3IPVertex> ips) {
    this.ips = ips;
    return this;
  }

  public Assetsv3AssetIngestionRequest addIpsItem(Assetsv3IPVertex ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @javax.annotation.Nullable
  public List<Assetsv3IPVertex> getIps() {
    return ips;
  }

  public void setIps(List<Assetsv3IPVertex> ips) {
    this.ips = ips;
  }


  public Assetsv3AssetIngestionRequest models(List<Assetsv3ModelVertex> models) {
    this.models = models;
    return this;
  }

  public Assetsv3AssetIngestionRequest addModelsItem(Assetsv3ModelVertex modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Get models
   * @return models
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ModelVertex> getModels() {
    return models;
  }

  public void setModels(List<Assetsv3ModelVertex> models) {
    this.models = models;
  }


  public Assetsv3AssetIngestionRequest origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public Assetsv3AssetIngestionRequest ports(List<Assetsv3PortVertex> ports) {
    this.ports = ports;
    return this;
  }

  public Assetsv3AssetIngestionRequest addPortsItem(Assetsv3PortVertex portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @javax.annotation.Nullable
  public List<Assetsv3PortVertex> getPorts() {
    return ports;
  }

  public void setPorts(List<Assetsv3PortVertex> ports) {
    this.ports = ports;
  }


  public Assetsv3AssetIngestionRequest resources(List<Assetsv3ResourcesVertex> resources) {
    this.resources = resources;
    return this;
  }

  public Assetsv3AssetIngestionRequest addResourcesItem(Assetsv3ResourcesVertex resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ResourcesVertex> getResources() {
    return resources;
  }

  public void setResources(List<Assetsv3ResourcesVertex> resources) {
    this.resources = resources;
  }


  public Assetsv3AssetIngestionRequest storages(List<Assetsv3StorageVertex> storages) {
    this.storages = storages;
    return this;
  }

  public Assetsv3AssetIngestionRequest addStoragesItem(Assetsv3StorageVertex storagesItem) {
    if (this.storages == null) {
      this.storages = new ArrayList<>();
    }
    this.storages.add(storagesItem);
    return this;
  }

   /**
   * Get storages
   * @return storages
  **/
  @javax.annotation.Nullable
  public List<Assetsv3StorageVertex> getStorages() {
    return storages;
  }

  public void setStorages(List<Assetsv3StorageVertex> storages) {
    this.storages = storages;
  }


  public Assetsv3AssetIngestionRequest subscriptions(List<Assetsv3SubscriptionVertex> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Assetsv3AssetIngestionRequest addSubscriptionsItem(Assetsv3SubscriptionVertex subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  public List<Assetsv3SubscriptionVertex> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<Assetsv3SubscriptionVertex> subscriptions) {
    this.subscriptions = subscriptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetIngestionRequest assetsv3AssetIngestionRequest = (Assetsv3AssetIngestionRequest) o;
    return Objects.equals(this.accounts, assetsv3AssetIngestionRequest.accounts) &&
        Objects.equals(this.applications, assetsv3AssetIngestionRequest.applications) &&
        Objects.equals(this.databases, assetsv3AssetIngestionRequest.databases) &&
        Objects.equals(this.deployments, assetsv3AssetIngestionRequest.deployments) &&
        Objects.equals(this.endpoints, assetsv3AssetIngestionRequest.endpoints) &&
        Objects.equals(this.hosts, assetsv3AssetIngestionRequest.hosts) &&
        Objects.equals(this.ips, assetsv3AssetIngestionRequest.ips) &&
        Objects.equals(this.models, assetsv3AssetIngestionRequest.models) &&
        Objects.equals(this.origin, assetsv3AssetIngestionRequest.origin) &&
        Objects.equals(this.ports, assetsv3AssetIngestionRequest.ports) &&
        Objects.equals(this.resources, assetsv3AssetIngestionRequest.resources) &&
        Objects.equals(this.storages, assetsv3AssetIngestionRequest.storages) &&
        Objects.equals(this.subscriptions, assetsv3AssetIngestionRequest.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, applications, databases, deployments, endpoints, hosts, ips, models, origin, ports, resources, storages, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetIngestionRequest {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
    openapiFields.add("accounts");
    openapiFields.add("applications");
    openapiFields.add("databases");
    openapiFields.add("deployments");
    openapiFields.add("endpoints");
    openapiFields.add("hosts");
    openapiFields.add("ips");
    openapiFields.add("models");
    openapiFields.add("origin");
    openapiFields.add("ports");
    openapiFields.add("resources");
    openapiFields.add("storages");
    openapiFields.add("subscriptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetIngestionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetIngestionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetIngestionRequest is not found in the empty JSON string", Assetsv3AssetIngestionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetIngestionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetIngestionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("accounts") != null && !jsonObj.get("accounts").isJsonNull()) {
        JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
        if (jsonArrayaccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
          }

          // validate the optional field `accounts` (array)
          for (int i = 0; i < jsonArrayaccounts.size(); i++) {
            Assetsv3AccountVertex.validateJsonElement(jsonArrayaccounts.get(i));
          };
        }
      }
      if (jsonObj.get("applications") != null && !jsonObj.get("applications").isJsonNull()) {
        JsonArray jsonArrayapplications = jsonObj.getAsJsonArray("applications");
        if (jsonArrayapplications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("applications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `applications` to be an array in the JSON string but got `%s`", jsonObj.get("applications").toString()));
          }

          // validate the optional field `applications` (array)
          for (int i = 0; i < jsonArrayapplications.size(); i++) {
            Assetsv3ApplicationVertex.validateJsonElement(jsonArrayapplications.get(i));
          };
        }
      }
      if (jsonObj.get("databases") != null && !jsonObj.get("databases").isJsonNull()) {
        JsonArray jsonArraydatabases = jsonObj.getAsJsonArray("databases");
        if (jsonArraydatabases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("databases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `databases` to be an array in the JSON string but got `%s`", jsonObj.get("databases").toString()));
          }

          // validate the optional field `databases` (array)
          for (int i = 0; i < jsonArraydatabases.size(); i++) {
            Assetsv3DatabaseVertex.validateJsonElement(jsonArraydatabases.get(i));
          };
        }
      }
      if (jsonObj.get("deployments") != null && !jsonObj.get("deployments").isJsonNull()) {
        JsonArray jsonArraydeployments = jsonObj.getAsJsonArray("deployments");
        if (jsonArraydeployments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deployments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deployments` to be an array in the JSON string but got `%s`", jsonObj.get("deployments").toString()));
          }

          // validate the optional field `deployments` (array)
          for (int i = 0; i < jsonArraydeployments.size(); i++) {
            Assetsv3DeploymentVertex.validateJsonElement(jsonArraydeployments.get(i));
          };
        }
      }
      if (jsonObj.get("endpoints") != null && !jsonObj.get("endpoints").isJsonNull()) {
        JsonArray jsonArrayendpoints = jsonObj.getAsJsonArray("endpoints");
        if (jsonArrayendpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("endpoints").toString()));
          }

          // validate the optional field `endpoints` (array)
          for (int i = 0; i < jsonArrayendpoints.size(); i++) {
            Assetsv3EndpointVertex.validateJsonElement(jsonArrayendpoints.get(i));
          };
        }
      }
      if (jsonObj.get("hosts") != null && !jsonObj.get("hosts").isJsonNull()) {
        JsonArray jsonArrayhosts = jsonObj.getAsJsonArray("hosts");
        if (jsonArrayhosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hosts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
          }

          // validate the optional field `hosts` (array)
          for (int i = 0; i < jsonArrayhosts.size(); i++) {
            Assetsv3HostVertex.validateJsonElement(jsonArrayhosts.get(i));
          };
        }
      }
      if (jsonObj.get("ips") != null && !jsonObj.get("ips").isJsonNull()) {
        JsonArray jsonArrayips = jsonObj.getAsJsonArray("ips");
        if (jsonArrayips != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ips` to be an array in the JSON string but got `%s`", jsonObj.get("ips").toString()));
          }

          // validate the optional field `ips` (array)
          for (int i = 0; i < jsonArrayips.size(); i++) {
            Assetsv3IPVertex.validateJsonElement(jsonArrayips.get(i));
          };
        }
      }
      if (jsonObj.get("models") != null && !jsonObj.get("models").isJsonNull()) {
        JsonArray jsonArraymodels = jsonObj.getAsJsonArray("models");
        if (jsonArraymodels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("models").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `models` to be an array in the JSON string but got `%s`", jsonObj.get("models").toString()));
          }

          // validate the optional field `models` (array)
          for (int i = 0; i < jsonArraymodels.size(); i++) {
            Assetsv3ModelVertex.validateJsonElement(jsonArraymodels.get(i));
          };
        }
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            Assetsv3PortVertex.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
          }

          // validate the optional field `resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            Assetsv3ResourcesVertex.validateJsonElement(jsonArrayresources.get(i));
          };
        }
      }
      if (jsonObj.get("storages") != null && !jsonObj.get("storages").isJsonNull()) {
        JsonArray jsonArraystorages = jsonObj.getAsJsonArray("storages");
        if (jsonArraystorages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("storages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `storages` to be an array in the JSON string but got `%s`", jsonObj.get("storages").toString()));
          }

          // validate the optional field `storages` (array)
          for (int i = 0; i < jsonArraystorages.size(); i++) {
            Assetsv3StorageVertex.validateJsonElement(jsonArraystorages.get(i));
          };
        }
      }
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull()) {
        JsonArray jsonArraysubscriptions = jsonObj.getAsJsonArray("subscriptions");
        if (jsonArraysubscriptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
          }

          // validate the optional field `subscriptions` (array)
          for (int i = 0; i < jsonArraysubscriptions.size(); i++) {
            Assetsv3SubscriptionVertex.validateJsonElement(jsonArraysubscriptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetIngestionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetIngestionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetIngestionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetIngestionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetIngestionRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetIngestionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetIngestionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetIngestionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetIngestionRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetIngestionRequest
  */
  public static Assetsv3AssetIngestionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetIngestionRequest.class);
  }

 /**
  * Convert an instance of Assetsv3AssetIngestionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

