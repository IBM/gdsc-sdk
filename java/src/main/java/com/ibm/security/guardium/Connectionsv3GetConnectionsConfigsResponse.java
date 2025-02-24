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
import com.ibm.security.guardium.Connectionsv3StreamConnectionConfig;
import com.ibm.security.guardium.Connectionsv3UCConnectionConfig;
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
 * Response parameters for get connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3GetConnectionsConfigsResponse {
  public static final String SERIALIZED_NAME_STREAM_CONNECTION_CONFIGS = "stream_connection_configs";
  @SerializedName(SERIALIZED_NAME_STREAM_CONNECTION_CONFIGS)
  private List<Connectionsv3StreamConnectionConfig> streamConnectionConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_UC_CONNECTION_CONFIGS = "uc_connection_configs";
  @SerializedName(SERIALIZED_NAME_UC_CONNECTION_CONFIGS)
  private List<Connectionsv3UCConnectionConfig> ucConnectionConfigs = new ArrayList<>();

  public Connectionsv3GetConnectionsConfigsResponse() {
  }

  public Connectionsv3GetConnectionsConfigsResponse streamConnectionConfigs(List<Connectionsv3StreamConnectionConfig> streamConnectionConfigs) {
    this.streamConnectionConfigs = streamConnectionConfigs;
    return this;
  }

  public Connectionsv3GetConnectionsConfigsResponse addStreamConnectionConfigsItem(Connectionsv3StreamConnectionConfig streamConnectionConfigsItem) {
    if (this.streamConnectionConfigs == null) {
      this.streamConnectionConfigs = new ArrayList<>();
    }
    this.streamConnectionConfigs.add(streamConnectionConfigsItem);
    return this;
  }

   /**
   * List of streaming connections.
   * @return streamConnectionConfigs
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3StreamConnectionConfig> getStreamConnectionConfigs() {
    return streamConnectionConfigs;
  }

  public void setStreamConnectionConfigs(List<Connectionsv3StreamConnectionConfig> streamConnectionConfigs) {
    this.streamConnectionConfigs = streamConnectionConfigs;
  }


  public Connectionsv3GetConnectionsConfigsResponse ucConnectionConfigs(List<Connectionsv3UCConnectionConfig> ucConnectionConfigs) {
    this.ucConnectionConfigs = ucConnectionConfigs;
    return this;
  }

  public Connectionsv3GetConnectionsConfigsResponse addUcConnectionConfigsItem(Connectionsv3UCConnectionConfig ucConnectionConfigsItem) {
    if (this.ucConnectionConfigs == null) {
      this.ucConnectionConfigs = new ArrayList<>();
    }
    this.ucConnectionConfigs.add(ucConnectionConfigsItem);
    return this;
  }

   /**
   * List of UC connections.
   * @return ucConnectionConfigs
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3UCConnectionConfig> getUcConnectionConfigs() {
    return ucConnectionConfigs;
  }

  public void setUcConnectionConfigs(List<Connectionsv3UCConnectionConfig> ucConnectionConfigs) {
    this.ucConnectionConfigs = ucConnectionConfigs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3GetConnectionsConfigsResponse connectionsv3GetConnectionsConfigsResponse = (Connectionsv3GetConnectionsConfigsResponse) o;
    return Objects.equals(this.streamConnectionConfigs, connectionsv3GetConnectionsConfigsResponse.streamConnectionConfigs) &&
        Objects.equals(this.ucConnectionConfigs, connectionsv3GetConnectionsConfigsResponse.ucConnectionConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamConnectionConfigs, ucConnectionConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3GetConnectionsConfigsResponse {\n");
    sb.append("    streamConnectionConfigs: ").append(toIndentedString(streamConnectionConfigs)).append("\n");
    sb.append("    ucConnectionConfigs: ").append(toIndentedString(ucConnectionConfigs)).append("\n");
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
    openapiFields.add("stream_connection_configs");
    openapiFields.add("uc_connection_configs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3GetConnectionsConfigsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3GetConnectionsConfigsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3GetConnectionsConfigsResponse is not found in the empty JSON string", Connectionsv3GetConnectionsConfigsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3GetConnectionsConfigsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3GetConnectionsConfigsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("stream_connection_configs") != null && !jsonObj.get("stream_connection_configs").isJsonNull()) {
        JsonArray jsonArraystreamConnectionConfigs = jsonObj.getAsJsonArray("stream_connection_configs");
        if (jsonArraystreamConnectionConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stream_connection_configs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stream_connection_configs` to be an array in the JSON string but got `%s`", jsonObj.get("stream_connection_configs").toString()));
          }

          // validate the optional field `stream_connection_configs` (array)
          for (int i = 0; i < jsonArraystreamConnectionConfigs.size(); i++) {
            Connectionsv3StreamConnectionConfig.validateJsonElement(jsonArraystreamConnectionConfigs.get(i));
          };
        }
      }
      if (jsonObj.get("uc_connection_configs") != null && !jsonObj.get("uc_connection_configs").isJsonNull()) {
        JsonArray jsonArrayucConnectionConfigs = jsonObj.getAsJsonArray("uc_connection_configs");
        if (jsonArrayucConnectionConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("uc_connection_configs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `uc_connection_configs` to be an array in the JSON string but got `%s`", jsonObj.get("uc_connection_configs").toString()));
          }

          // validate the optional field `uc_connection_configs` (array)
          for (int i = 0; i < jsonArrayucConnectionConfigs.size(); i++) {
            Connectionsv3UCConnectionConfig.validateJsonElement(jsonArrayucConnectionConfigs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3GetConnectionsConfigsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3GetConnectionsConfigsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3GetConnectionsConfigsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3GetConnectionsConfigsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3GetConnectionsConfigsResponse>() {
           @Override
           public void write(JsonWriter out, Connectionsv3GetConnectionsConfigsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3GetConnectionsConfigsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3GetConnectionsConfigsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3GetConnectionsConfigsResponse
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3GetConnectionsConfigsResponse
  */
  public static Connectionsv3GetConnectionsConfigsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3GetConnectionsConfigsResponse.class);
  }

 /**
  * Convert an instance of Connectionsv3GetConnectionsConfigsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

