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
 * Assetsv3AssetsForMergeSplitResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetsForMergeSplitResponse {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Integer assetId;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DSDEF_KEY = "dsdef_key";
  @SerializedName(SERIALIZED_NAME_DSDEF_KEY)
  private String dsdefKey;

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_HOST_PORT = "host_port";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private String hostPort;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_PORT = "ip_port";
  @SerializedName(SERIALIZED_NAME_IP_PORT)
  private String ipPort;

  public static final String SERIALIZED_NAME_IS_MERGEABLE = "is_mergeable";
  @SerializedName(SERIALIZED_NAME_IS_MERGEABLE)
  private Boolean isMergeable;

  public static final String SERIALIZED_NAME_IS_SPLITTABLE = "is_splittable";
  @SerializedName(SERIALIZED_NAME_IS_SPLITTABLE)
  private Boolean isSplittable;

  public Assetsv3AssetsForMergeSplitResponse() {
  }

  public Assetsv3AssetsForMergeSplitResponse assetId(Integer assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Integer getAssetId() {
    return assetId;
  }

  public void setAssetId(Integer assetId) {
    this.assetId = assetId;
  }


  public Assetsv3AssetsForMergeSplitResponse assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public Assetsv3AssetsForMergeSplitResponse databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public Assetsv3AssetsForMergeSplitResponse dsdefKey(String dsdefKey) {
    this.dsdefKey = dsdefKey;
    return this;
  }

   /**
   * Get dsdefKey
   * @return dsdefKey
  **/
  @javax.annotation.Nullable
  public String getDsdefKey() {
    return dsdefKey;
  }

  public void setDsdefKey(String dsdefKey) {
    this.dsdefKey = dsdefKey;
  }


  public Assetsv3AssetsForMergeSplitResponse hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @javax.annotation.Nullable
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public Assetsv3AssetsForMergeSplitResponse hostPort(String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  @javax.annotation.Nullable
  public String getHostPort() {
    return hostPort;
  }

  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }


  public Assetsv3AssetsForMergeSplitResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public Assetsv3AssetsForMergeSplitResponse ipPort(String ipPort) {
    this.ipPort = ipPort;
    return this;
  }

   /**
   * Get ipPort
   * @return ipPort
  **/
  @javax.annotation.Nullable
  public String getIpPort() {
    return ipPort;
  }

  public void setIpPort(String ipPort) {
    this.ipPort = ipPort;
  }


  public Assetsv3AssetsForMergeSplitResponse isMergeable(Boolean isMergeable) {
    this.isMergeable = isMergeable;
    return this;
  }

   /**
   * Get isMergeable
   * @return isMergeable
  **/
  @javax.annotation.Nullable
  public Boolean getIsMergeable() {
    return isMergeable;
  }

  public void setIsMergeable(Boolean isMergeable) {
    this.isMergeable = isMergeable;
  }


  public Assetsv3AssetsForMergeSplitResponse isSplittable(Boolean isSplittable) {
    this.isSplittable = isSplittable;
    return this;
  }

   /**
   * Get isSplittable
   * @return isSplittable
  **/
  @javax.annotation.Nullable
  public Boolean getIsSplittable() {
    return isSplittable;
  }

  public void setIsSplittable(Boolean isSplittable) {
    this.isSplittable = isSplittable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetsForMergeSplitResponse assetsv3AssetsForMergeSplitResponse = (Assetsv3AssetsForMergeSplitResponse) o;
    return Objects.equals(this.assetId, assetsv3AssetsForMergeSplitResponse.assetId) &&
        Objects.equals(this.assetName, assetsv3AssetsForMergeSplitResponse.assetName) &&
        Objects.equals(this.databaseName, assetsv3AssetsForMergeSplitResponse.databaseName) &&
        Objects.equals(this.dsdefKey, assetsv3AssetsForMergeSplitResponse.dsdefKey) &&
        Objects.equals(this.hostName, assetsv3AssetsForMergeSplitResponse.hostName) &&
        Objects.equals(this.hostPort, assetsv3AssetsForMergeSplitResponse.hostPort) &&
        Objects.equals(this.ipAddress, assetsv3AssetsForMergeSplitResponse.ipAddress) &&
        Objects.equals(this.ipPort, assetsv3AssetsForMergeSplitResponse.ipPort) &&
        Objects.equals(this.isMergeable, assetsv3AssetsForMergeSplitResponse.isMergeable) &&
        Objects.equals(this.isSplittable, assetsv3AssetsForMergeSplitResponse.isSplittable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, databaseName, dsdefKey, hostName, hostPort, ipAddress, ipPort, isMergeable, isSplittable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetsForMergeSplitResponse {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    dsdefKey: ").append(toIndentedString(dsdefKey)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPort: ").append(toIndentedString(ipPort)).append("\n");
    sb.append("    isMergeable: ").append(toIndentedString(isMergeable)).append("\n");
    sb.append("    isSplittable: ").append(toIndentedString(isSplittable)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("database_name");
    openapiFields.add("dsdef_key");
    openapiFields.add("host_name");
    openapiFields.add("host_port");
    openapiFields.add("ip_address");
    openapiFields.add("ip_port");
    openapiFields.add("is_mergeable");
    openapiFields.add("is_splittable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetsForMergeSplitResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetsForMergeSplitResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetsForMergeSplitResponse is not found in the empty JSON string", Assetsv3AssetsForMergeSplitResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetsForMergeSplitResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetsForMergeSplitResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_name") != null && !jsonObj.get("asset_name").isJsonNull()) && !jsonObj.get("asset_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_name").toString()));
      }
      if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull()) && !jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("dsdef_key") != null && !jsonObj.get("dsdef_key").isJsonNull()) && !jsonObj.get("dsdef_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsdef_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsdef_key").toString()));
      }
      if ((jsonObj.get("host_name") != null && !jsonObj.get("host_name").isJsonNull()) && !jsonObj.get("host_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_name").toString()));
      }
      if ((jsonObj.get("host_port") != null && !jsonObj.get("host_port").isJsonNull()) && !jsonObj.get("host_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_port").toString()));
      }
      if ((jsonObj.get("ip_address") != null && !jsonObj.get("ip_address").isJsonNull()) && !jsonObj.get("ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_address").toString()));
      }
      if ((jsonObj.get("ip_port") != null && !jsonObj.get("ip_port").isJsonNull()) && !jsonObj.get("ip_port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_port").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetsForMergeSplitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetsForMergeSplitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetsForMergeSplitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetsForMergeSplitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetsForMergeSplitResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetsForMergeSplitResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetsForMergeSplitResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetsForMergeSplitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetsForMergeSplitResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetsForMergeSplitResponse
  */
  public static Assetsv3AssetsForMergeSplitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetsForMergeSplitResponse.class);
  }

 /**
  * Convert an instance of Assetsv3AssetsForMergeSplitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

