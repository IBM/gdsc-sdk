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
import com.ibm.gdsc.sdk.Tenantuserv3ExternalMetadata;
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

import com.ibm.gdsc.JSON;

/**
 * UpdateTenantRequest message for PUT v3/tenants/{tenant_id} api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Jumpboxv3UpdateTenantRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_METADATA = "external_metadata";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_METADATA)
  private Map<String, Tenantuserv3ExternalMetadata> externalMetadata = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_INACTIVE = "is_inactive";
  @SerializedName(SERIALIZED_NAME_IS_INACTIVE)
  private Boolean isInactive;

  public static final String SERIALIZED_NAME_IS_READY = "is_ready";
  @SerializedName(SERIALIZED_NAME_IS_READY)
  private Boolean isReady;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public Jumpboxv3UpdateTenantRequest() {
  }

  public Jumpboxv3UpdateTenantRequest externalMetadata(Map<String, Tenantuserv3ExternalMetadata> externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public Jumpboxv3UpdateTenantRequest putExternalMetadataItem(String key, Tenantuserv3ExternalMetadata externalMetadataItem) {
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


  public Jumpboxv3UpdateTenantRequest isInactive(Boolean isInactive) {
    this.isInactive = isInactive;
    return this;
  }

   /**
   * Is inactive.
   * @return isInactive
  **/
  @javax.annotation.Nullable
  public Boolean getIsInactive() {
    return isInactive;
  }

  public void setIsInactive(Boolean isInactive) {
    this.isInactive = isInactive;
  }


  public Jumpboxv3UpdateTenantRequest isReady(Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

   /**
   * Is ready.
   * @return isReady
  **/
  @javax.annotation.Nullable
  public Boolean getIsReady() {
    return isReady;
  }

  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public Jumpboxv3UpdateTenantRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Jumpboxv3UpdateTenantRequest partNumber(String partNumber) {
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


  public Jumpboxv3UpdateTenantRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant id.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public Jumpboxv3UpdateTenantRequest uid(String uid) {
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
    Jumpboxv3UpdateTenantRequest jumpboxv3UpdateTenantRequest = (Jumpboxv3UpdateTenantRequest) o;
    return Objects.equals(this.externalMetadata, jumpboxv3UpdateTenantRequest.externalMetadata) &&
        Objects.equals(this.isInactive, jumpboxv3UpdateTenantRequest.isInactive) &&
        Objects.equals(this.isReady, jumpboxv3UpdateTenantRequest.isReady) &&
        Objects.equals(this.name, jumpboxv3UpdateTenantRequest.name) &&
        Objects.equals(this.partNumber, jumpboxv3UpdateTenantRequest.partNumber) &&
        Objects.equals(this.tenantId, jumpboxv3UpdateTenantRequest.tenantId) &&
        Objects.equals(this.uid, jumpboxv3UpdateTenantRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMetadata, isInactive, isReady, name, partNumber, tenantId, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3UpdateTenantRequest {\n");
    sb.append("    externalMetadata: ").append(toIndentedString(externalMetadata)).append("\n");
    sb.append("    isInactive: ").append(toIndentedString(isInactive)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("external_metadata");
    openapiFields.add("is_inactive");
    openapiFields.add("is_ready");
    openapiFields.add("name");
    openapiFields.add("part_number");
    openapiFields.add("tenant_id");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3UpdateTenantRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3UpdateTenantRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3UpdateTenantRequest is not found in the empty JSON string", Jumpboxv3UpdateTenantRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3UpdateTenantRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3UpdateTenantRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("part_number") != null && !jsonObj.get("part_number").isJsonNull()) && !jsonObj.get("part_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_number").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3UpdateTenantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3UpdateTenantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3UpdateTenantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3UpdateTenantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3UpdateTenantRequest>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3UpdateTenantRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3UpdateTenantRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3UpdateTenantRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3UpdateTenantRequest
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3UpdateTenantRequest
  */
  public static Jumpboxv3UpdateTenantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3UpdateTenantRequest.class);
  }

 /**
  * Convert an instance of Jumpboxv3UpdateTenantRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

