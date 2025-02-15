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
 * Structure for [Universal connector] Connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3UCConnectionSummary {
  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_DATASOURCE_TYPE = "datasource_type";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_TYPE)
  private String datasourceType;

  public static final String SERIALIZED_NAME_FILTER_ALIAS = "filter_alias";
  @SerializedName(SERIALIZED_NAME_FILTER_ALIAS)
  private String filterAlias;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_INPUT_ALIAS = "input_alias";
  @SerializedName(SERIALIZED_NAME_INPUT_ALIAS)
  private String inputAlias;

  public static final String SERIALIZED_NAME_LAST_RESPONSE = "last_response";
  @SerializedName(SERIALIZED_NAME_LAST_RESPONSE)
  private String lastResponse;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Connectionsv3Status status = Connectionsv3Status.UNDEFINED_STATUS;

  public static final String SERIALIZED_NAME_STATUS_TEXT = "status_text";
  @SerializedName(SERIALIZED_NAME_STATUS_TEXT)
  private String statusText;

  public static final String SERIALIZED_NAME_UC_CONNECTION_ID = "uc_connection_id";
  @SerializedName(SERIALIZED_NAME_UC_CONNECTION_ID)
  private String ucConnectionId;

  public Connectionsv3UCConnectionSummary() {
  }

  public Connectionsv3UCConnectionSummary alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Connection configuration nickname, set by dev/user (optional).
   * @return alias
  **/
  @javax.annotation.Nullable
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public Connectionsv3UCConnectionSummary configId(String configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Foreign key to the saved connection configuration by the user.
   * @return configId
  **/
  @javax.annotation.Nullable
  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public Connectionsv3UCConnectionSummary datasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
    return this;
  }

   /**
   * Datasource type.
   * @return datasourceType
  **/
  @javax.annotation.Nullable
  public String getDatasourceType() {
    return datasourceType;
  }

  public void setDatasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
  }


  public Connectionsv3UCConnectionSummary filterAlias(String filterAlias) {
    this.filterAlias = filterAlias;
    return this;
  }

   /**
   * Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;).
   * @return filterAlias
  **/
  @javax.annotation.Nullable
  public String getFilterAlias() {
    return filterAlias;
  }

  public void setFilterAlias(String filterAlias) {
    this.filterAlias = filterAlias;
  }


  public Connectionsv3UCConnectionSummary host(String host) {
    this.host = host;
    return this;
  }

   /**
   * URI where related Universal connector service is running/listening.
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public Connectionsv3UCConnectionSummary inputAlias(String inputAlias) {
    this.inputAlias = inputAlias;
    return this;
  }

   /**
   * Connection input plugin alias, like \&quot;Filebeat\&quot;.
   * @return inputAlias
  **/
  @javax.annotation.Nullable
  public String getInputAlias() {
    return inputAlias;
  }

  public void setInputAlias(String inputAlias) {
    this.inputAlias = inputAlias;
  }


  public Connectionsv3UCConnectionSummary lastResponse(String lastResponse) {
    this.lastResponse = lastResponse;
    return this;
  }

   /**
   * The heartbeat.
   * @return lastResponse
  **/
  @javax.annotation.Nullable
  public String getLastResponse() {
    return lastResponse;
  }

  public void setLastResponse(String lastResponse) {
    this.lastResponse = lastResponse;
  }


  public Connectionsv3UCConnectionSummary port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port where the related Universal connector service is running/listening.
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public Connectionsv3UCConnectionSummary status(Connectionsv3Status status) {
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


  public Connectionsv3UCConnectionSummary statusText(String statusText) {
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


  public Connectionsv3UCConnectionSummary ucConnectionId(String ucConnectionId) {
    this.ucConnectionId = ucConnectionId;
    return this;
  }

   /**
   * UC connection id.
   * @return ucConnectionId
  **/
  @javax.annotation.Nullable
  public String getUcConnectionId() {
    return ucConnectionId;
  }

  public void setUcConnectionId(String ucConnectionId) {
    this.ucConnectionId = ucConnectionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3UCConnectionSummary connectionsv3UCConnectionSummary = (Connectionsv3UCConnectionSummary) o;
    return Objects.equals(this.alias, connectionsv3UCConnectionSummary.alias) &&
        Objects.equals(this.configId, connectionsv3UCConnectionSummary.configId) &&
        Objects.equals(this.datasourceType, connectionsv3UCConnectionSummary.datasourceType) &&
        Objects.equals(this.filterAlias, connectionsv3UCConnectionSummary.filterAlias) &&
        Objects.equals(this.host, connectionsv3UCConnectionSummary.host) &&
        Objects.equals(this.inputAlias, connectionsv3UCConnectionSummary.inputAlias) &&
        Objects.equals(this.lastResponse, connectionsv3UCConnectionSummary.lastResponse) &&
        Objects.equals(this.port, connectionsv3UCConnectionSummary.port) &&
        Objects.equals(this.status, connectionsv3UCConnectionSummary.status) &&
        Objects.equals(this.statusText, connectionsv3UCConnectionSummary.statusText) &&
        Objects.equals(this.ucConnectionId, connectionsv3UCConnectionSummary.ucConnectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, configId, datasourceType, filterAlias, host, inputAlias, lastResponse, port, status, statusText, ucConnectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3UCConnectionSummary {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
    sb.append("    filterAlias: ").append(toIndentedString(filterAlias)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    inputAlias: ").append(toIndentedString(inputAlias)).append("\n");
    sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    ucConnectionId: ").append(toIndentedString(ucConnectionId)).append("\n");
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
    openapiFields.add("alias");
    openapiFields.add("config_id");
    openapiFields.add("datasource_type");
    openapiFields.add("filter_alias");
    openapiFields.add("host");
    openapiFields.add("input_alias");
    openapiFields.add("last_response");
    openapiFields.add("port");
    openapiFields.add("status");
    openapiFields.add("status_text");
    openapiFields.add("uc_connection_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3UCConnectionSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3UCConnectionSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3UCConnectionSummary is not found in the empty JSON string", Connectionsv3UCConnectionSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3UCConnectionSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3UCConnectionSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alias") != null && !jsonObj.get("alias").isJsonNull()) && !jsonObj.get("alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias").toString()));
      }
      if ((jsonObj.get("config_id") != null && !jsonObj.get("config_id").isJsonNull()) && !jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      if ((jsonObj.get("datasource_type") != null && !jsonObj.get("datasource_type").isJsonNull()) && !jsonObj.get("datasource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasource_type").toString()));
      }
      if ((jsonObj.get("filter_alias") != null && !jsonObj.get("filter_alias").isJsonNull()) && !jsonObj.get("filter_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_alias").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("input_alias") != null && !jsonObj.get("input_alias").isJsonNull()) && !jsonObj.get("input_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_alias").toString()));
      }
      if ((jsonObj.get("last_response") != null && !jsonObj.get("last_response").isJsonNull()) && !jsonObj.get("last_response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_response").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Connectionsv3Status.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("status_text") != null && !jsonObj.get("status_text").isJsonNull()) && !jsonObj.get("status_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_text").toString()));
      }
      if ((jsonObj.get("uc_connection_id") != null && !jsonObj.get("uc_connection_id").isJsonNull()) && !jsonObj.get("uc_connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uc_connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uc_connection_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3UCConnectionSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3UCConnectionSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3UCConnectionSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3UCConnectionSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3UCConnectionSummary>() {
           @Override
           public void write(JsonWriter out, Connectionsv3UCConnectionSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3UCConnectionSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3UCConnectionSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3UCConnectionSummary
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3UCConnectionSummary
  */
  public static Connectionsv3UCConnectionSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3UCConnectionSummary.class);
  }

 /**
  * Convert an instance of Connectionsv3UCConnectionSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

