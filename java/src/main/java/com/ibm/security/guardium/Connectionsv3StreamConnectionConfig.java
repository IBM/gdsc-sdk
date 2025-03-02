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
import com.ibm.security.guardium.Connectionsv3StreamConnection;
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

import com.ibm.security.JSON;

/**
 * Stream connection config with connecion id.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3StreamConnectionConfig {
  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_STREAM_CONNECTION = "stream_connection";
  @SerializedName(SERIALIZED_NAME_STREAM_CONNECTION)
  private Connectionsv3StreamConnection streamConnection;

  public Connectionsv3StreamConnectionConfig() {
  }

  public Connectionsv3StreamConnectionConfig connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Connection id.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public Connectionsv3StreamConnectionConfig streamConnection(Connectionsv3StreamConnection streamConnection) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3StreamConnectionConfig connectionsv3StreamConnectionConfig = (Connectionsv3StreamConnectionConfig) o;
    return Objects.equals(this.connectionId, connectionsv3StreamConnectionConfig.connectionId) &&
        Objects.equals(this.streamConnection, connectionsv3StreamConnectionConfig.streamConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, streamConnection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3StreamConnectionConfig {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    streamConnection: ").append(toIndentedString(streamConnection)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3StreamConnectionConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3StreamConnectionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3StreamConnectionConfig is not found in the empty JSON string", Connectionsv3StreamConnectionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3StreamConnectionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3StreamConnectionConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3StreamConnectionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3StreamConnectionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3StreamConnectionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3StreamConnectionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3StreamConnectionConfig>() {
           @Override
           public void write(JsonWriter out, Connectionsv3StreamConnectionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3StreamConnectionConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3StreamConnectionConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3StreamConnectionConfig
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3StreamConnectionConfig
  */
  public static Connectionsv3StreamConnectionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3StreamConnectionConfig.class);
  }

 /**
  * Convert an instance of Connectionsv3StreamConnectionConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

