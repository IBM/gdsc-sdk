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
import com.ibm.gdsc.sdk.Connectionsv3ConnectorType;
import com.ibm.gdsc.sdk.Connectionsv3StreamConnection;
import com.ibm.gdsc.sdk.Connectionsv3UCConnectionSummary;
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
 * Request parameters for create connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3CreateConnectionsConfigsRequest {
  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_STREAM_CONNECTION = "stream_connection";
  @SerializedName(SERIALIZED_NAME_STREAM_CONNECTION)
  private Connectionsv3StreamConnection streamConnection;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Connectionsv3ConnectorType type = Connectionsv3ConnectorType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_UC_CONNECTION = "uc_connection";
  @SerializedName(SERIALIZED_NAME_UC_CONNECTION)
  private Connectionsv3UCConnectionSummary ucConnection;

  public Connectionsv3CreateConnectionsConfigsRequest() {
  }

  public Connectionsv3CreateConnectionsConfigsRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Optional: connection id.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public Connectionsv3CreateConnectionsConfigsRequest streamConnection(Connectionsv3StreamConnection streamConnection) {
    this.streamConnection = streamConnection;
    return this;
  }

   /**
   * Get streamConnection
   * @return streamConnection
  **/
  @javax.annotation.Nullable
  public Connectionsv3StreamConnection getStreamConnection() {
    return streamConnection;
  }

  public void setStreamConnection(Connectionsv3StreamConnection streamConnection) {
    this.streamConnection = streamConnection;
  }


  public Connectionsv3CreateConnectionsConfigsRequest type(Connectionsv3ConnectorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Connectionsv3ConnectorType getType() {
    return type;
  }

  public void setType(Connectionsv3ConnectorType type) {
    this.type = type;
  }


  public Connectionsv3CreateConnectionsConfigsRequest ucConnection(Connectionsv3UCConnectionSummary ucConnection) {
    this.ucConnection = ucConnection;
    return this;
  }

   /**
   * Get ucConnection
   * @return ucConnection
  **/
  @javax.annotation.Nullable
  public Connectionsv3UCConnectionSummary getUcConnection() {
    return ucConnection;
  }

  public void setUcConnection(Connectionsv3UCConnectionSummary ucConnection) {
    this.ucConnection = ucConnection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3CreateConnectionsConfigsRequest connectionsv3CreateConnectionsConfigsRequest = (Connectionsv3CreateConnectionsConfigsRequest) o;
    return Objects.equals(this.connectionId, connectionsv3CreateConnectionsConfigsRequest.connectionId) &&
        Objects.equals(this.streamConnection, connectionsv3CreateConnectionsConfigsRequest.streamConnection) &&
        Objects.equals(this.type, connectionsv3CreateConnectionsConfigsRequest.type) &&
        Objects.equals(this.ucConnection, connectionsv3CreateConnectionsConfigsRequest.ucConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, streamConnection, type, ucConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3CreateConnectionsConfigsRequest {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    streamConnection: ").append(toIndentedString(streamConnection)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ucConnection: ").append(toIndentedString(ucConnection)).append("\n");
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
    openapiFields.add("connection_id");
    openapiFields.add("stream_connection");
    openapiFields.add("type");
    openapiFields.add("uc_connection");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3CreateConnectionsConfigsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3CreateConnectionsConfigsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3CreateConnectionsConfigsRequest is not found in the empty JSON string", Connectionsv3CreateConnectionsConfigsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3CreateConnectionsConfigsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3CreateConnectionsConfigsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonNull()) && !jsonObj.get("connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_id").toString()));
      }
      // validate the optional field `stream_connection`
      if (jsonObj.get("stream_connection") != null && !jsonObj.get("stream_connection").isJsonNull()) {
        Connectionsv3StreamConnection.validateJsonElement(jsonObj.get("stream_connection"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Connectionsv3ConnectorType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `uc_connection`
      if (jsonObj.get("uc_connection") != null && !jsonObj.get("uc_connection").isJsonNull()) {
        Connectionsv3UCConnectionSummary.validateJsonElement(jsonObj.get("uc_connection"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3CreateConnectionsConfigsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3CreateConnectionsConfigsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3CreateConnectionsConfigsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3CreateConnectionsConfigsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3CreateConnectionsConfigsRequest>() {
           @Override
           public void write(JsonWriter out, Connectionsv3CreateConnectionsConfigsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3CreateConnectionsConfigsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3CreateConnectionsConfigsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3CreateConnectionsConfigsRequest
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3CreateConnectionsConfigsRequest
  */
  public static Connectionsv3CreateConnectionsConfigsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3CreateConnectionsConfigsRequest.class);
  }

 /**
  * Convert an instance of Connectionsv3CreateConnectionsConfigsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

