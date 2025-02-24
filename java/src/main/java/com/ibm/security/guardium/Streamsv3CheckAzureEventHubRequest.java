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
import com.ibm.security.guardium.Streamsv3StreamType;
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
 * CheckAzureEventHubRequest defines a request to check Azure event hub.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Streamsv3CheckAzureEventHubRequest {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access_key_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SECRET_KEY_ID = "secret_key_id";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_ID)
  private String secretKeyId;

  public static final String SERIALIZED_NAME_STREAM_NAME = "stream_name";
  @SerializedName(SERIALIZED_NAME_STREAM_NAME)
  private String streamName;

  public static final String SERIALIZED_NAME_STREAM_TYPE = "stream_type";
  @SerializedName(SERIALIZED_NAME_STREAM_TYPE)
  private Streamsv3StreamType streamType = Streamsv3StreamType.AWS_KINESIS;

  public Streamsv3CheckAzureEventHubRequest() {
  }

  public Streamsv3CheckAzureEventHubRequest accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * AWS access key ID.
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public Streamsv3CheckAzureEventHubRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Indetifier.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Streamsv3CheckAzureEventHubRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Azure namespace.
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public Streamsv3CheckAzureEventHubRequest secretKeyId(String secretKeyId) {
    this.secretKeyId = secretKeyId;
    return this;
  }

   /**
   * AWS secret key ID.
   * @return secretKeyId
  **/
  @javax.annotation.Nullable
  public String getSecretKeyId() {
    return secretKeyId;
  }

  public void setSecretKeyId(String secretKeyId) {
    this.secretKeyId = secretKeyId;
  }


  public Streamsv3CheckAzureEventHubRequest streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * Name of stream.
   * @return streamName
  **/
  @javax.annotation.Nullable
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }


  public Streamsv3CheckAzureEventHubRequest streamType(Streamsv3StreamType streamType) {
    this.streamType = streamType;
    return this;
  }

   /**
   * Get streamType
   * @return streamType
  **/
  @javax.annotation.Nullable
  public Streamsv3StreamType getStreamType() {
    return streamType;
  }

  public void setStreamType(Streamsv3StreamType streamType) {
    this.streamType = streamType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest = (Streamsv3CheckAzureEventHubRequest) o;
    return Objects.equals(this.accessKeyId, streamsv3CheckAzureEventHubRequest.accessKeyId) &&
        Objects.equals(this.id, streamsv3CheckAzureEventHubRequest.id) &&
        Objects.equals(this.namespace, streamsv3CheckAzureEventHubRequest.namespace) &&
        Objects.equals(this.secretKeyId, streamsv3CheckAzureEventHubRequest.secretKeyId) &&
        Objects.equals(this.streamName, streamsv3CheckAzureEventHubRequest.streamName) &&
        Objects.equals(this.streamType, streamsv3CheckAzureEventHubRequest.streamType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, id, namespace, secretKeyId, streamName, streamType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Streamsv3CheckAzureEventHubRequest {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    secretKeyId: ").append(toIndentedString(secretKeyId)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
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
    openapiFields.add("access_key_id");
    openapiFields.add("id");
    openapiFields.add("namespace");
    openapiFields.add("secret_key_id");
    openapiFields.add("stream_name");
    openapiFields.add("stream_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Streamsv3CheckAzureEventHubRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Streamsv3CheckAzureEventHubRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Streamsv3CheckAzureEventHubRequest is not found in the empty JSON string", Streamsv3CheckAzureEventHubRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Streamsv3CheckAzureEventHubRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Streamsv3CheckAzureEventHubRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_key_id") != null && !jsonObj.get("access_key_id").isJsonNull()) && !jsonObj.get("access_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_key_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("secret_key_id") != null && !jsonObj.get("secret_key_id").isJsonNull()) && !jsonObj.get("secret_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_key_id").toString()));
      }
      if ((jsonObj.get("stream_name") != null && !jsonObj.get("stream_name").isJsonNull()) && !jsonObj.get("stream_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_name").toString()));
      }
      // validate the optional field `stream_type`
      if (jsonObj.get("stream_type") != null && !jsonObj.get("stream_type").isJsonNull()) {
        Streamsv3StreamType.validateJsonElement(jsonObj.get("stream_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Streamsv3CheckAzureEventHubRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Streamsv3CheckAzureEventHubRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Streamsv3CheckAzureEventHubRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Streamsv3CheckAzureEventHubRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Streamsv3CheckAzureEventHubRequest>() {
           @Override
           public void write(JsonWriter out, Streamsv3CheckAzureEventHubRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Streamsv3CheckAzureEventHubRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Streamsv3CheckAzureEventHubRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Streamsv3CheckAzureEventHubRequest
  * @throws IOException if the JSON string is invalid with respect to Streamsv3CheckAzureEventHubRequest
  */
  public static Streamsv3CheckAzureEventHubRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Streamsv3CheckAzureEventHubRequest.class);
  }

 /**
  * Convert an instance of Streamsv3CheckAzureEventHubRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

