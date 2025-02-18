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
import com.ibm.gdsc.sdk.Connectionsv3Status;
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
 * Structure for AWS/Azure Connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3StreamConnection {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_CLUSTER_RESOURCE_ID = "cluster_resource_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_RESOURCE_ID)
  private String clusterResourceId;

  public static final String SERIALIZED_NAME_CONSUMER_GROUP_NAME = "consumer_group_name";
  @SerializedName(SERIALIZED_NAME_CONSUMER_GROUP_NAME)
  private String consumerGroupName;

  public static final String SERIALIZED_NAME_DB_DNS_ENDPOINT = "db_dns_endpoint";
  @SerializedName(SERIALIZED_NAME_DB_DNS_ENDPOINT)
  private String dbDnsEndpoint;

  public static final String SERIALIZED_NAME_DB_NAME = "db_name";
  @SerializedName(SERIALIZED_NAME_DB_NAME)
  private String dbName;

  public static final String SERIALIZED_NAME_DB_TYPE = "db_type";
  @SerializedName(SERIALIZED_NAME_DB_TYPE)
  private String dbType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_START_MONITOR = "start_monitor";
  @SerializedName(SERIALIZED_NAME_START_MONITOR)
  private String startMonitor;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Connectionsv3Status status = Connectionsv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_STATUS_TEXT = "status_text";
  @SerializedName(SERIALIZED_NAME_STATUS_TEXT)
  private String statusText;

  public static final String SERIALIZED_NAME_STATUS_TIMESTAMP = "status_timestamp";
  @SerializedName(SERIALIZED_NAME_STATUS_TIMESTAMP)
  private String statusTimestamp;

  public static final String SERIALIZED_NAME_STORAGE_CONNECTION_STRING = "storage_connection_string";
  @SerializedName(SERIALIZED_NAME_STORAGE_CONNECTION_STRING)
  private String storageConnectionString;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public Connectionsv3StreamConnection() {
  }

  public Connectionsv3StreamConnection accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Account id.
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Connectionsv3StreamConnection accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name.
   * @return accountName
  **/
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public Connectionsv3StreamConnection clusterResourceId(String clusterResourceId) {
    this.clusterResourceId = clusterResourceId;
    return this;
  }

   /**
   * Cluster resource ID.
   * @return clusterResourceId
  **/
  @javax.annotation.Nullable
  public String getClusterResourceId() {
    return clusterResourceId;
  }

  public void setClusterResourceId(String clusterResourceId) {
    this.clusterResourceId = clusterResourceId;
  }


  public Connectionsv3StreamConnection consumerGroupName(String consumerGroupName) {
    this.consumerGroupName = consumerGroupName;
    return this;
  }

   /**
   * Consumer group name.
   * @return consumerGroupName
  **/
  @javax.annotation.Nullable
  public String getConsumerGroupName() {
    return consumerGroupName;
  }

  public void setConsumerGroupName(String consumerGroupName) {
    this.consumerGroupName = consumerGroupName;
  }


  public Connectionsv3StreamConnection dbDnsEndpoint(String dbDnsEndpoint) {
    this.dbDnsEndpoint = dbDnsEndpoint;
    return this;
  }

   /**
   * Database DNS endpoint OR Database host.
   * @return dbDnsEndpoint
  **/
  @javax.annotation.Nullable
  public String getDbDnsEndpoint() {
    return dbDnsEndpoint;
  }

  public void setDbDnsEndpoint(String dbDnsEndpoint) {
    this.dbDnsEndpoint = dbDnsEndpoint;
  }


  public Connectionsv3StreamConnection dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Database name.
   * @return dbName
  **/
  @javax.annotation.Nullable
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }


  public Connectionsv3StreamConnection dbType(String dbType) {
    this.dbType = dbType;
    return this;
  }

   /**
   * Database type.
   * @return dbType
  **/
  @javax.annotation.Nullable
  public String getDbType() {
    return dbType;
  }

  public void setDbType(String dbType) {
    this.dbType = dbType;
  }


  public Connectionsv3StreamConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Event Hub name || Stream name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Connectionsv3StreamConnection namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Optional: Namespace provided if the coonnection type is Azure.
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public Connectionsv3StreamConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Database credential password.
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public Connectionsv3StreamConnection port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port.
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public Connectionsv3StreamConnection provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Optional: the provider provided if the coonnection type is Azure.
   * @return provider
  **/
  @javax.annotation.Nullable
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public Connectionsv3StreamConnection region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Optional: the region provided if the coonnection type is AWS.
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public Connectionsv3StreamConnection startMonitor(String startMonitor) {
    this.startMonitor = startMonitor;
    return this;
  }

   /**
   * Connection Monitoring.
   * @return startMonitor
  **/
  @javax.annotation.Nullable
  public String getStartMonitor() {
    return startMonitor;
  }

  public void setStartMonitor(String startMonitor) {
    this.startMonitor = startMonitor;
  }


  public Connectionsv3StreamConnection status(Connectionsv3Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Connectionsv3Status getStatus() {
    return status;
  }

  public void setStatus(Connectionsv3Status status) {
    this.status = status;
  }


  public Connectionsv3StreamConnection statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * If status is not OK, details what&#39;s wrong (non-localized).
   * @return statusText
  **/
  @javax.annotation.Nullable
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }


  public Connectionsv3StreamConnection statusTimestamp(String statusTimestamp) {
    this.statusTimestamp = statusTimestamp;
    return this;
  }

   /**
   * The time stamp of status.
   * @return statusTimestamp
  **/
  @javax.annotation.Nullable
  public String getStatusTimestamp() {
    return statusTimestamp;
  }

  public void setStatusTimestamp(String statusTimestamp) {
    this.statusTimestamp = statusTimestamp;
  }


  public Connectionsv3StreamConnection storageConnectionString(String storageConnectionString) {
    this.storageConnectionString = storageConnectionString;
    return this;
  }

   /**
   * Optional: Storage connection string must be proovided if the coonnection type is Azure.
   * @return storageConnectionString
  **/
  @javax.annotation.Nullable
  public String getStorageConnectionString() {
    return storageConnectionString;
  }

  public void setStorageConnectionString(String storageConnectionString) {
    this.storageConnectionString = storageConnectionString;
  }


  public Connectionsv3StreamConnection username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Database credential username.
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3StreamConnection connectionsv3StreamConnection = (Connectionsv3StreamConnection) o;
    return Objects.equals(this.accountId, connectionsv3StreamConnection.accountId) &&
        Objects.equals(this.accountName, connectionsv3StreamConnection.accountName) &&
        Objects.equals(this.clusterResourceId, connectionsv3StreamConnection.clusterResourceId) &&
        Objects.equals(this.consumerGroupName, connectionsv3StreamConnection.consumerGroupName) &&
        Objects.equals(this.dbDnsEndpoint, connectionsv3StreamConnection.dbDnsEndpoint) &&
        Objects.equals(this.dbName, connectionsv3StreamConnection.dbName) &&
        Objects.equals(this.dbType, connectionsv3StreamConnection.dbType) &&
        Objects.equals(this.name, connectionsv3StreamConnection.name) &&
        Objects.equals(this.namespace, connectionsv3StreamConnection.namespace) &&
        Objects.equals(this.password, connectionsv3StreamConnection.password) &&
        Objects.equals(this.port, connectionsv3StreamConnection.port) &&
        Objects.equals(this.provider, connectionsv3StreamConnection.provider) &&
        Objects.equals(this.region, connectionsv3StreamConnection.region) &&
        Objects.equals(this.startMonitor, connectionsv3StreamConnection.startMonitor) &&
        Objects.equals(this.status, connectionsv3StreamConnection.status) &&
        Objects.equals(this.statusText, connectionsv3StreamConnection.statusText) &&
        Objects.equals(this.statusTimestamp, connectionsv3StreamConnection.statusTimestamp) &&
        Objects.equals(this.storageConnectionString, connectionsv3StreamConnection.storageConnectionString) &&
        Objects.equals(this.username, connectionsv3StreamConnection.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, clusterResourceId, consumerGroupName, dbDnsEndpoint, dbName, dbType, name, namespace, password, port, provider, region, startMonitor, status, statusText, statusTimestamp, storageConnectionString, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3StreamConnection {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    clusterResourceId: ").append(toIndentedString(clusterResourceId)).append("\n");
    sb.append("    consumerGroupName: ").append(toIndentedString(consumerGroupName)).append("\n");
    sb.append("    dbDnsEndpoint: ").append(toIndentedString(dbDnsEndpoint)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    startMonitor: ").append(toIndentedString(startMonitor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusTimestamp: ").append(toIndentedString(statusTimestamp)).append("\n");
    sb.append("    storageConnectionString: ").append(toIndentedString(storageConnectionString)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_name");
    openapiFields.add("cluster_resource_id");
    openapiFields.add("consumer_group_name");
    openapiFields.add("db_dns_endpoint");
    openapiFields.add("db_name");
    openapiFields.add("db_type");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("password");
    openapiFields.add("port");
    openapiFields.add("provider");
    openapiFields.add("region");
    openapiFields.add("start_monitor");
    openapiFields.add("status");
    openapiFields.add("status_text");
    openapiFields.add("status_timestamp");
    openapiFields.add("storage_connection_string");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3StreamConnection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3StreamConnection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3StreamConnection is not found in the empty JSON string", Connectionsv3StreamConnection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3StreamConnection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3StreamConnection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("account_name") != null && !jsonObj.get("account_name").isJsonNull()) && !jsonObj.get("account_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_name").toString()));
      }
      if ((jsonObj.get("cluster_resource_id") != null && !jsonObj.get("cluster_resource_id").isJsonNull()) && !jsonObj.get("cluster_resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_resource_id").toString()));
      }
      if ((jsonObj.get("consumer_group_name") != null && !jsonObj.get("consumer_group_name").isJsonNull()) && !jsonObj.get("consumer_group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_group_name").toString()));
      }
      if ((jsonObj.get("db_dns_endpoint") != null && !jsonObj.get("db_dns_endpoint").isJsonNull()) && !jsonObj.get("db_dns_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `db_dns_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("db_dns_endpoint").toString()));
      }
      if ((jsonObj.get("db_name") != null && !jsonObj.get("db_name").isJsonNull()) && !jsonObj.get("db_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `db_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("db_name").toString()));
      }
      if ((jsonObj.get("db_type") != null && !jsonObj.get("db_type").isJsonNull()) && !jsonObj.get("db_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `db_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("db_type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) && !jsonObj.get("provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("start_monitor") != null && !jsonObj.get("start_monitor").isJsonNull()) && !jsonObj.get("start_monitor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_monitor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_monitor").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Connectionsv3Status.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("status_text") != null && !jsonObj.get("status_text").isJsonNull()) && !jsonObj.get("status_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_text").toString()));
      }
      if ((jsonObj.get("status_timestamp") != null && !jsonObj.get("status_timestamp").isJsonNull()) && !jsonObj.get("status_timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_timestamp").toString()));
      }
      if ((jsonObj.get("storage_connection_string") != null && !jsonObj.get("storage_connection_string").isJsonNull()) && !jsonObj.get("storage_connection_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage_connection_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage_connection_string").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3StreamConnection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3StreamConnection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3StreamConnection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3StreamConnection.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3StreamConnection>() {
           @Override
           public void write(JsonWriter out, Connectionsv3StreamConnection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3StreamConnection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3StreamConnection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3StreamConnection
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3StreamConnection
  */
  public static Connectionsv3StreamConnection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3StreamConnection.class);
  }

 /**
  * Convert an instance of Connectionsv3StreamConnection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

