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
 * Resourcecontrollerk8v3EdgeTenantRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3EdgeTenantRequest {
  public static final String SERIALIZED_NAME_EDGE_ID = "edge_id";
  @SerializedName(SERIALIZED_NAME_EDGE_ID)
  private String edgeId;

  public static final String SERIALIZED_NAME_EDGE_NAME = "edge_name";
  @SerializedName(SERIALIZED_NAME_EDGE_NAME)
  private String edgeName;

  public static final String SERIALIZED_NAME_EDGE_VERSION = "edge_version";
  @SerializedName(SERIALIZED_NAME_EDGE_VERSION)
  private String edgeVersion;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";
  @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
  private String licenseType;

  public static final String SERIALIZED_NAME_RSYSLOG = "rsyslog";
  @SerializedName(SERIALIZED_NAME_RSYSLOG)
  private String rsyslog;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storage_class_name";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME_RWO = "storage_class_name_rwo";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME_RWO)
  private String storageClassNameRwo;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public Resourcecontrollerk8v3EdgeTenantRequest() {
  }

  public Resourcecontrollerk8v3EdgeTenantRequest edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }

   /**
   * Get edgeId
   * @return edgeId
  **/
  @javax.annotation.Nullable
  public String getEdgeId() {
    return edgeId;
  }

  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest edgeName(String edgeName) {
    this.edgeName = edgeName;
    return this;
  }

   /**
   * Get edgeName
   * @return edgeName
  **/
  @javax.annotation.Nullable
  public String getEdgeName() {
    return edgeName;
  }

  public void setEdgeName(String edgeName) {
    this.edgeName = edgeName;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest edgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
    return this;
  }

   /**
   * Get edgeVersion
   * @return edgeVersion
  **/
  @javax.annotation.Nullable
  public String getEdgeVersion() {
    return edgeVersion;
  }

  public void setEdgeVersion(String edgeVersion) {
    this.edgeVersion = edgeVersion;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @javax.annotation.Nullable
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest rsyslog(String rsyslog) {
    this.rsyslog = rsyslog;
    return this;
  }

   /**
   * Get rsyslog
   * @return rsyslog
  **/
  @javax.annotation.Nullable
  public String getRsyslog() {
    return rsyslog;
  }

  public void setRsyslog(String rsyslog) {
    this.rsyslog = rsyslog;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Get storageClassName
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest storageClassNameRwo(String storageClassNameRwo) {
    this.storageClassNameRwo = storageClassNameRwo;
    return this;
  }

   /**
   * Get storageClassNameRwo
   * @return storageClassNameRwo
  **/
  @javax.annotation.Nullable
  public String getStorageClassNameRwo() {
    return storageClassNameRwo;
  }

  public void setStorageClassNameRwo(String storageClassNameRwo) {
    this.storageClassNameRwo = storageClassNameRwo;
  }


  public Resourcecontrollerk8v3EdgeTenantRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3EdgeTenantRequest resourcecontrollerk8v3EdgeTenantRequest = (Resourcecontrollerk8v3EdgeTenantRequest) o;
    return Objects.equals(this.edgeId, resourcecontrollerk8v3EdgeTenantRequest.edgeId) &&
        Objects.equals(this.edgeName, resourcecontrollerk8v3EdgeTenantRequest.edgeName) &&
        Objects.equals(this.edgeVersion, resourcecontrollerk8v3EdgeTenantRequest.edgeVersion) &&
        Objects.equals(this.hostname, resourcecontrollerk8v3EdgeTenantRequest.hostname) &&
        Objects.equals(this.licenseType, resourcecontrollerk8v3EdgeTenantRequest.licenseType) &&
        Objects.equals(this.rsyslog, resourcecontrollerk8v3EdgeTenantRequest.rsyslog) &&
        Objects.equals(this.size, resourcecontrollerk8v3EdgeTenantRequest.size) &&
        Objects.equals(this.storageClassName, resourcecontrollerk8v3EdgeTenantRequest.storageClassName) &&
        Objects.equals(this.storageClassNameRwo, resourcecontrollerk8v3EdgeTenantRequest.storageClassNameRwo) &&
        Objects.equals(this.tenantId, resourcecontrollerk8v3EdgeTenantRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeId, edgeName, edgeVersion, hostname, licenseType, rsyslog, size, storageClassName, storageClassNameRwo, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3EdgeTenantRequest {\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    edgeName: ").append(toIndentedString(edgeName)).append("\n");
    sb.append("    edgeVersion: ").append(toIndentedString(edgeVersion)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    rsyslog: ").append(toIndentedString(rsyslog)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    storageClassNameRwo: ").append(toIndentedString(storageClassNameRwo)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("edge_id");
    openapiFields.add("edge_name");
    openapiFields.add("edge_version");
    openapiFields.add("hostname");
    openapiFields.add("license_type");
    openapiFields.add("rsyslog");
    openapiFields.add("size");
    openapiFields.add("storage_class_name");
    openapiFields.add("storage_class_name_rwo");
    openapiFields.add("tenant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3EdgeTenantRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3EdgeTenantRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3EdgeTenantRequest is not found in the empty JSON string", Resourcecontrollerk8v3EdgeTenantRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3EdgeTenantRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3EdgeTenantRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("edge_id") != null && !jsonObj.get("edge_id").isJsonNull()) && !jsonObj.get("edge_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_id").toString()));
      }
      if ((jsonObj.get("edge_name") != null && !jsonObj.get("edge_name").isJsonNull()) && !jsonObj.get("edge_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_name").toString()));
      }
      if ((jsonObj.get("edge_version") != null && !jsonObj.get("edge_version").isJsonNull()) && !jsonObj.get("edge_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_version").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      if ((jsonObj.get("license_type") != null && !jsonObj.get("license_type").isJsonNull()) && !jsonObj.get("license_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_type").toString()));
      }
      if ((jsonObj.get("rsyslog") != null && !jsonObj.get("rsyslog").isJsonNull()) && !jsonObj.get("rsyslog").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rsyslog` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rsyslog").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if ((jsonObj.get("storage_class_name") != null && !jsonObj.get("storage_class_name").isJsonNull()) && !jsonObj.get("storage_class_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage_class_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage_class_name").toString()));
      }
      if ((jsonObj.get("storage_class_name_rwo") != null && !jsonObj.get("storage_class_name_rwo").isJsonNull()) && !jsonObj.get("storage_class_name_rwo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage_class_name_rwo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage_class_name_rwo").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3EdgeTenantRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3EdgeTenantRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3EdgeTenantRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3EdgeTenantRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3EdgeTenantRequest>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3EdgeTenantRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3EdgeTenantRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3EdgeTenantRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3EdgeTenantRequest
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3EdgeTenantRequest
  */
  public static Resourcecontrollerk8v3EdgeTenantRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3EdgeTenantRequest.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3EdgeTenantRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

