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
import com.ibm.gdsc.sdk.Universalconnectormanagerv3ConnectionRoute;
import com.ibm.gdsc.sdk.Universalconnectormanagerv3ConnectionStatus;
import com.ibm.gdsc.sdk.Universalconnectormanagerv3User;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Structure for [Universal connector] Connection response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Universalconnectormanagerv3ConnectionSummary {
  public static final String SERIALIZED_NAME_CONNECTION_ALIAS = "connection_alias";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ALIAS)
  private String connectionAlias;

  public static final String SERIALIZED_NAME_CONNECTION_CHANGED = "connection_changed";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CHANGED)
  private OffsetDateTime connectionChanged;

  public static final String SERIALIZED_NAME_CONNECTION_CONFIG_ID = "connection_config_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CONFIG_ID)
  private String connectionConfigId;

  public static final String SERIALIZED_NAME_CONNECTION_CONFIGURATION_NOTE = "connection_configuration_note";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CONFIGURATION_NOTE)
  private String connectionConfigurationNote;

  public static final String SERIALIZED_NAME_CONNECTION_FILTER_ALIAS = "connection_filter_alias";
  @SerializedName(SERIALIZED_NAME_CONNECTION_FILTER_ALIAS)
  private String connectionFilterAlias;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_CONNECTION_INPUT_ALIAS = "connection_input_alias";
  @SerializedName(SERIALIZED_NAME_CONNECTION_INPUT_ALIAS)
  private String connectionInputAlias;

  public static final String SERIALIZED_NAME_CONNECTION_ROUTE = "connection_route";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ROUTE)
  private Universalconnectormanagerv3ConnectionRoute connectionRoute;

  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private Universalconnectormanagerv3ConnectionStatus connectionStatus;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Universalconnectormanagerv3User user;

  public Universalconnectormanagerv3ConnectionSummary() {
  }

  public Universalconnectormanagerv3ConnectionSummary connectionAlias(String connectionAlias) {
    this.connectionAlias = connectionAlias;
    return this;
  }

   /**
   * Connection configuration nickname, set by dev/user (optional).
   * @return connectionAlias
  **/
  @javax.annotation.Nullable
  public String getConnectionAlias() {
    return connectionAlias;
  }

  public void setConnectionAlias(String connectionAlias) {
    this.connectionAlias = connectionAlias;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionChanged(OffsetDateTime connectionChanged) {
    this.connectionChanged = connectionChanged;
    return this;
  }

   /**
   * Date changed; used to defer tenant status queries immediately after creation.
   * @return connectionChanged
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getConnectionChanged() {
    return connectionChanged;
  }

  public void setConnectionChanged(OffsetDateTime connectionChanged) {
    this.connectionChanged = connectionChanged;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionConfigId(String connectionConfigId) {
    this.connectionConfigId = connectionConfigId;
    return this;
  }

   /**
   * Foreign key to the saved connection configuration by the user.
   * @return connectionConfigId
  **/
  @javax.annotation.Nullable
  public String getConnectionConfigId() {
    return connectionConfigId;
  }

  public void setConnectionConfigId(String connectionConfigId) {
    this.connectionConfigId = connectionConfigId;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionConfigurationNote(String connectionConfigurationNote) {
    this.connectionConfigurationNote = connectionConfigurationNote;
    return this;
  }

   /**
   * Datasource configuration note, by plugin developers, intended for user.
   * @return connectionConfigurationNote
  **/
  @javax.annotation.Nullable
  public String getConnectionConfigurationNote() {
    return connectionConfigurationNote;
  }

  public void setConnectionConfigurationNote(String connectionConfigurationNote) {
    this.connectionConfigurationNote = connectionConfigurationNote;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionFilterAlias(String connectionFilterAlias) {
    this.connectionFilterAlias = connectionFilterAlias;
    return this;
  }

   /**
   * Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;).
   * @return connectionFilterAlias
  **/
  @javax.annotation.Nullable
  public String getConnectionFilterAlias() {
    return connectionFilterAlias;
  }

  public void setConnectionFilterAlias(String connectionFilterAlias) {
    this.connectionFilterAlias = connectionFilterAlias;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Connection configuration id.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionInputAlias(String connectionInputAlias) {
    this.connectionInputAlias = connectionInputAlias;
    return this;
  }

   /**
   * Connection input plugin alias, like \&quot;Filebeat\&quot;.
   * @return connectionInputAlias
  **/
  @javax.annotation.Nullable
  public String getConnectionInputAlias() {
    return connectionInputAlias;
  }

  public void setConnectionInputAlias(String connectionInputAlias) {
    this.connectionInputAlias = connectionInputAlias;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionRoute(Universalconnectormanagerv3ConnectionRoute connectionRoute) {
    this.connectionRoute = connectionRoute;
    return this;
  }

   /**
   * Get connectionRoute
   * @return connectionRoute
  **/
  @javax.annotation.Nullable
  public Universalconnectormanagerv3ConnectionRoute getConnectionRoute() {
    return connectionRoute;
  }

  public void setConnectionRoute(Universalconnectormanagerv3ConnectionRoute connectionRoute) {
    this.connectionRoute = connectionRoute;
  }


  public Universalconnectormanagerv3ConnectionSummary connectionStatus(Universalconnectormanagerv3ConnectionStatus connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  public Universalconnectormanagerv3ConnectionStatus getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(Universalconnectormanagerv3ConnectionStatus connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public Universalconnectormanagerv3ConnectionSummary user(Universalconnectormanagerv3User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public Universalconnectormanagerv3User getUser() {
    return user;
  }

  public void setUser(Universalconnectormanagerv3User user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Universalconnectormanagerv3ConnectionSummary universalconnectormanagerv3ConnectionSummary = (Universalconnectormanagerv3ConnectionSummary) o;
    return Objects.equals(this.connectionAlias, universalconnectormanagerv3ConnectionSummary.connectionAlias) &&
        Objects.equals(this.connectionChanged, universalconnectormanagerv3ConnectionSummary.connectionChanged) &&
        Objects.equals(this.connectionConfigId, universalconnectormanagerv3ConnectionSummary.connectionConfigId) &&
        Objects.equals(this.connectionConfigurationNote, universalconnectormanagerv3ConnectionSummary.connectionConfigurationNote) &&
        Objects.equals(this.connectionFilterAlias, universalconnectormanagerv3ConnectionSummary.connectionFilterAlias) &&
        Objects.equals(this.connectionId, universalconnectormanagerv3ConnectionSummary.connectionId) &&
        Objects.equals(this.connectionInputAlias, universalconnectormanagerv3ConnectionSummary.connectionInputAlias) &&
        Objects.equals(this.connectionRoute, universalconnectormanagerv3ConnectionSummary.connectionRoute) &&
        Objects.equals(this.connectionStatus, universalconnectormanagerv3ConnectionSummary.connectionStatus) &&
        Objects.equals(this.user, universalconnectormanagerv3ConnectionSummary.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionAlias, connectionChanged, connectionConfigId, connectionConfigurationNote, connectionFilterAlias, connectionId, connectionInputAlias, connectionRoute, connectionStatus, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Universalconnectormanagerv3ConnectionSummary {\n");
    sb.append("    connectionAlias: ").append(toIndentedString(connectionAlias)).append("\n");
    sb.append("    connectionChanged: ").append(toIndentedString(connectionChanged)).append("\n");
    sb.append("    connectionConfigId: ").append(toIndentedString(connectionConfigId)).append("\n");
    sb.append("    connectionConfigurationNote: ").append(toIndentedString(connectionConfigurationNote)).append("\n");
    sb.append("    connectionFilterAlias: ").append(toIndentedString(connectionFilterAlias)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connectionInputAlias: ").append(toIndentedString(connectionInputAlias)).append("\n");
    sb.append("    connectionRoute: ").append(toIndentedString(connectionRoute)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("connection_alias");
    openapiFields.add("connection_changed");
    openapiFields.add("connection_config_id");
    openapiFields.add("connection_configuration_note");
    openapiFields.add("connection_filter_alias");
    openapiFields.add("connection_id");
    openapiFields.add("connection_input_alias");
    openapiFields.add("connection_route");
    openapiFields.add("connection_status");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Universalconnectormanagerv3ConnectionSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Universalconnectormanagerv3ConnectionSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Universalconnectormanagerv3ConnectionSummary is not found in the empty JSON string", Universalconnectormanagerv3ConnectionSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Universalconnectormanagerv3ConnectionSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Universalconnectormanagerv3ConnectionSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("connection_alias") != null && !jsonObj.get("connection_alias").isJsonNull()) && !jsonObj.get("connection_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_alias").toString()));
      }
      if ((jsonObj.get("connection_config_id") != null && !jsonObj.get("connection_config_id").isJsonNull()) && !jsonObj.get("connection_config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_config_id").toString()));
      }
      if ((jsonObj.get("connection_configuration_note") != null && !jsonObj.get("connection_configuration_note").isJsonNull()) && !jsonObj.get("connection_configuration_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_configuration_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_configuration_note").toString()));
      }
      if ((jsonObj.get("connection_filter_alias") != null && !jsonObj.get("connection_filter_alias").isJsonNull()) && !jsonObj.get("connection_filter_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_filter_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_filter_alias").toString()));
      }
      if ((jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonNull()) && !jsonObj.get("connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_id").toString()));
      }
      if ((jsonObj.get("connection_input_alias") != null && !jsonObj.get("connection_input_alias").isJsonNull()) && !jsonObj.get("connection_input_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_input_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_input_alias").toString()));
      }
      // validate the optional field `connection_route`
      if (jsonObj.get("connection_route") != null && !jsonObj.get("connection_route").isJsonNull()) {
        Universalconnectormanagerv3ConnectionRoute.validateJsonElement(jsonObj.get("connection_route"));
      }
      // validate the optional field `connection_status`
      if (jsonObj.get("connection_status") != null && !jsonObj.get("connection_status").isJsonNull()) {
        Universalconnectormanagerv3ConnectionStatus.validateJsonElement(jsonObj.get("connection_status"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        Universalconnectormanagerv3User.validateJsonElement(jsonObj.get("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Universalconnectormanagerv3ConnectionSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Universalconnectormanagerv3ConnectionSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Universalconnectormanagerv3ConnectionSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Universalconnectormanagerv3ConnectionSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<Universalconnectormanagerv3ConnectionSummary>() {
           @Override
           public void write(JsonWriter out, Universalconnectormanagerv3ConnectionSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Universalconnectormanagerv3ConnectionSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Universalconnectormanagerv3ConnectionSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Universalconnectormanagerv3ConnectionSummary
  * @throws IOException if the JSON string is invalid with respect to Universalconnectormanagerv3ConnectionSummary
  */
  public static Universalconnectormanagerv3ConnectionSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Universalconnectormanagerv3ConnectionSummary.class);
  }

 /**
  * Convert an instance of Universalconnectormanagerv3ConnectionSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

