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
import com.ibm.security.guardium.Tenantuserv3ExternalMetadata;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * PostTenantsRequest message for POST v3/tenants api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Jumpboxv3PostTenantsRequest {
  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_EXTERNAL_METADATA = "external_metadata";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_METADATA)
  private Map<String, Tenantuserv3ExternalMetadata> externalMetadata = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public Jumpboxv3PostTenantsRequest() {
  }

  public Jumpboxv3PostTenantsRequest async(Boolean async) {
    this.async = async;
    return this;
  }

   /**
   * Async.
   * @return async
  **/
  @javax.annotation.Nullable
  public Boolean getAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }


  public Jumpboxv3PostTenantsRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External id.
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Jumpboxv3PostTenantsRequest externalMetadata(Map<String, Tenantuserv3ExternalMetadata> externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public Jumpboxv3PostTenantsRequest putExternalMetadataItem(String key, Tenantuserv3ExternalMetadata externalMetadataItem) {
    if (this.externalMetadata == null) {
      this.externalMetadata = new HashMap<>();
    }
    this.externalMetadata.put(key, externalMetadataItem);
    return this;
  }

   /**
   * External metadata.
   * @return externalMetadata
  **/
  @javax.annotation.Nullable
  public Map<String, Tenantuserv3ExternalMetadata> getExternalMetadata() {
    return externalMetadata;
  }

  public void setExternalMetadata(Map<String, Tenantuserv3ExternalMetadata> externalMetadata) {
    this.externalMetadata = externalMetadata;
  }


  public Jumpboxv3PostTenantsRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tenant name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Jumpboxv3PostTenantsRequest partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Part number.
   * @return partNumber
  **/
  @javax.annotation.Nullable
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }


  public Jumpboxv3PostTenantsRequest uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Email.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jumpboxv3PostTenantsRequest jumpboxv3PostTenantsRequest = (Jumpboxv3PostTenantsRequest) o;
    return Objects.equals(this.async, jumpboxv3PostTenantsRequest.async) &&
        Objects.equals(this.externalId, jumpboxv3PostTenantsRequest.externalId) &&
        Objects.equals(this.externalMetadata, jumpboxv3PostTenantsRequest.externalMetadata) &&
        Objects.equals(this.name, jumpboxv3PostTenantsRequest.name) &&
        Objects.equals(this.partNumber, jumpboxv3PostTenantsRequest.partNumber) &&
        Objects.equals(this.uid, jumpboxv3PostTenantsRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, externalId, externalMetadata, name, partNumber, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3PostTenantsRequest {\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalMetadata: ").append(toIndentedString(externalMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("async");
    openapiFields.add("external_id");
    openapiFields.add("external_metadata");
    openapiFields.add("name");
    openapiFields.add("part_number");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3PostTenantsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3PostTenantsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3PostTenantsRequest is not found in the empty JSON string", Jumpboxv3PostTenantsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3PostTenantsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3PostTenantsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("part_number") != null && !jsonObj.get("part_number").isJsonNull()) && !jsonObj.get("part_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_number").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3PostTenantsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3PostTenantsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3PostTenantsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3PostTenantsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3PostTenantsRequest>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3PostTenantsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3PostTenantsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3PostTenantsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3PostTenantsRequest
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3PostTenantsRequest
  */
  public static Jumpboxv3PostTenantsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3PostTenantsRequest.class);
  }

 /**
  * Convert an instance of Jumpboxv3PostTenantsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

