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
 * Connectionsv3ValidateAwsConnectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3ValidateAwsConnectionRequest {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "access_key";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private String accessKey;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_INPUT_PLUGIN_TYPE = "input_plugin_type";
  @SerializedName(SERIALIZED_NAME_INPUT_PLUGIN_TYPE)
  private String inputPluginType;

  public static final String SERIALIZED_NAME_LOG_STREAM = "log_stream";
  @SerializedName(SERIALIZED_NAME_LOG_STREAM)
  private String logStream;

  public static final String SERIALIZED_NAME_QUEUE_URL = "queue_url";
  @SerializedName(SERIALIZED_NAME_QUEUE_URL)
  private String queueUrl;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secret_key";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public Connectionsv3ValidateAwsConnectionRequest() {
  }

  public Connectionsv3ValidateAwsConnectionRequest accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public Connectionsv3ValidateAwsConnectionRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public Connectionsv3ValidateAwsConnectionRequest inputPluginType(String inputPluginType) {
    this.inputPluginType = inputPluginType;
    return this;
  }

   /**
   * aws connection input type as Cloudwatch, SQS, ...
   * @return inputPluginType
  **/
  @javax.annotation.Nullable
  public String getInputPluginType() {
    return inputPluginType;
  }

  public void setInputPluginType(String inputPluginType) {
    this.inputPluginType = inputPluginType;
  }


  public Connectionsv3ValidateAwsConnectionRequest logStream(String logStream) {
    this.logStream = logStream;
    return this;
  }

   /**
   * Get logStream
   * @return logStream
  **/
  @javax.annotation.Nullable
  public String getLogStream() {
    return logStream;
  }

  public void setLogStream(String logStream) {
    this.logStream = logStream;
  }


  public Connectionsv3ValidateAwsConnectionRequest queueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
    return this;
  }

   /**
   * Get queueUrl
   * @return queueUrl
  **/
  @javax.annotation.Nullable
  public String getQueueUrl() {
    return queueUrl;
  }

  public void setQueueUrl(String queueUrl) {
    this.queueUrl = queueUrl;
  }


  public Connectionsv3ValidateAwsConnectionRequest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public Connectionsv3ValidateAwsConnectionRequest secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nullable
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3ValidateAwsConnectionRequest connectionsv3ValidateAwsConnectionRequest = (Connectionsv3ValidateAwsConnectionRequest) o;
    return Objects.equals(this.accessKey, connectionsv3ValidateAwsConnectionRequest.accessKey) &&
        Objects.equals(this.groupName, connectionsv3ValidateAwsConnectionRequest.groupName) &&
        Objects.equals(this.inputPluginType, connectionsv3ValidateAwsConnectionRequest.inputPluginType) &&
        Objects.equals(this.logStream, connectionsv3ValidateAwsConnectionRequest.logStream) &&
        Objects.equals(this.queueUrl, connectionsv3ValidateAwsConnectionRequest.queueUrl) &&
        Objects.equals(this.region, connectionsv3ValidateAwsConnectionRequest.region) &&
        Objects.equals(this.secretKey, connectionsv3ValidateAwsConnectionRequest.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, groupName, inputPluginType, logStream, queueUrl, region, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3ValidateAwsConnectionRequest {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    inputPluginType: ").append(toIndentedString(inputPluginType)).append("\n");
    sb.append("    logStream: ").append(toIndentedString(logStream)).append("\n");
    sb.append("    queueUrl: ").append(toIndentedString(queueUrl)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
    openapiFields.add("access_key");
    openapiFields.add("group_name");
    openapiFields.add("input_plugin_type");
    openapiFields.add("log_stream");
    openapiFields.add("queue_url");
    openapiFields.add("region");
    openapiFields.add("secret_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3ValidateAwsConnectionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3ValidateAwsConnectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3ValidateAwsConnectionRequest is not found in the empty JSON string", Connectionsv3ValidateAwsConnectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3ValidateAwsConnectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3ValidateAwsConnectionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("access_key") != null && !jsonObj.get("access_key").isJsonNull()) && !jsonObj.get("access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_key").toString()));
      }
      if ((jsonObj.get("group_name") != null && !jsonObj.get("group_name").isJsonNull()) && !jsonObj.get("group_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_name").toString()));
      }
      if ((jsonObj.get("input_plugin_type") != null && !jsonObj.get("input_plugin_type").isJsonNull()) && !jsonObj.get("input_plugin_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_plugin_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_plugin_type").toString()));
      }
      if ((jsonObj.get("log_stream") != null && !jsonObj.get("log_stream").isJsonNull()) && !jsonObj.get("log_stream").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_stream` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_stream").toString()));
      }
      if ((jsonObj.get("queue_url") != null && !jsonObj.get("queue_url").isJsonNull()) && !jsonObj.get("queue_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queue_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queue_url").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("secret_key") != null && !jsonObj.get("secret_key").isJsonNull()) && !jsonObj.get("secret_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3ValidateAwsConnectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3ValidateAwsConnectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3ValidateAwsConnectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3ValidateAwsConnectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3ValidateAwsConnectionRequest>() {
           @Override
           public void write(JsonWriter out, Connectionsv3ValidateAwsConnectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3ValidateAwsConnectionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3ValidateAwsConnectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3ValidateAwsConnectionRequest
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3ValidateAwsConnectionRequest
  */
  public static Connectionsv3ValidateAwsConnectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3ValidateAwsConnectionRequest.class);
  }

 /**
  * Convert an instance of Connectionsv3ValidateAwsConnectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

