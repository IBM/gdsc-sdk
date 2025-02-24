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
import java.time.OffsetDateTime;
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
 * Tenant contains id, name, and settings for the specified tenant.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3Tenant {
  public static final String SERIALIZED_NAME_ACTIVATION_DATE = "activation_date";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_DATE)
  private OffsetDateTime activationDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

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

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Map<String, String> settings = new HashMap<>();

  public static final String SERIALIZED_NAME_TENANT_CAPABILITIES = "tenant_capabilities";
  @SerializedName(SERIALIZED_NAME_TENANT_CAPABILITIES)
  private Map<String, Boolean> tenantCapabilities = new HashMap<>();

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public Tenantuserv3Tenant() {
  }

  public Tenantuserv3Tenant activationDate(OffsetDateTime activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Date tenant was activated.
   * @return activationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(OffsetDateTime activationDate) {
    this.activationDate = activationDate;
  }


  public Tenantuserv3Tenant externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Extrenal id.
   * @return externalId
  **/
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Tenantuserv3Tenant externalMetadata(Map<String, Tenantuserv3ExternalMetadata> externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public Tenantuserv3Tenant putExternalMetadataItem(String key, Tenantuserv3ExternalMetadata externalMetadataItem) {
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


  public Tenantuserv3Tenant isInactive(Boolean isInactive) {
    this.isInactive = isInactive;
    return this;
  }

   /**
   * Whether or not the tenant is disabled.
   * @return isInactive
  **/
  @javax.annotation.Nullable
  public Boolean getIsInactive() {
    return isInactive;
  }

  public void setIsInactive(Boolean isInactive) {
    this.isInactive = isInactive;
  }


  public Tenantuserv3Tenant isReady(Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

   /**
   * Boolean is ready.
   * @return isReady
  **/
  @javax.annotation.Nullable
  public Boolean getIsReady() {
    return isReady;
  }

  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public Tenantuserv3Tenant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Tenantuserv3Tenant partNumber(String partNumber) {
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


  public Tenantuserv3Tenant settings(Map<String, String> settings) {
    this.settings = settings;
    return this;
  }

  public Tenantuserv3Tenant putSettingsItem(String key, String settingsItem) {
    if (this.settings == null) {
      this.settings = new HashMap<>();
    }
    this.settings.put(key, settingsItem);
    return this;
  }

   /**
   * Settings pertaining to all users of this tenant.
   * @return settings
  **/
  @javax.annotation.Nullable
  public Map<String, String> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, String> settings) {
    this.settings = settings;
  }


  public Tenantuserv3Tenant tenantCapabilities(Map<String, Boolean> tenantCapabilities) {
    this.tenantCapabilities = tenantCapabilities;
    return this;
  }

  public Tenantuserv3Tenant putTenantCapabilitiesItem(String key, Boolean tenantCapabilitiesItem) {
    if (this.tenantCapabilities == null) {
      this.tenantCapabilities = new HashMap<>();
    }
    this.tenantCapabilities.put(key, tenantCapabilitiesItem);
    return this;
  }

   /**
   * Get tenantCapabilities
   * @return tenantCapabilities
  **/
  @javax.annotation.Nullable
  public Map<String, Boolean> getTenantCapabilities() {
    return tenantCapabilities;
  }

  public void setTenantCapabilities(Map<String, Boolean> tenantCapabilities) {
    this.tenantCapabilities = tenantCapabilities;
  }


  public Tenantuserv3Tenant tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The unique id for the tenant object.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public Tenantuserv3Tenant uid(String uid) {
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
    Tenantuserv3Tenant tenantuserv3Tenant = (Tenantuserv3Tenant) o;
    return Objects.equals(this.activationDate, tenantuserv3Tenant.activationDate) &&
        Objects.equals(this.externalId, tenantuserv3Tenant.externalId) &&
        Objects.equals(this.externalMetadata, tenantuserv3Tenant.externalMetadata) &&
        Objects.equals(this.isInactive, tenantuserv3Tenant.isInactive) &&
        Objects.equals(this.isReady, tenantuserv3Tenant.isReady) &&
        Objects.equals(this.name, tenantuserv3Tenant.name) &&
        Objects.equals(this.partNumber, tenantuserv3Tenant.partNumber) &&
        Objects.equals(this.settings, tenantuserv3Tenant.settings) &&
        Objects.equals(this.tenantCapabilities, tenantuserv3Tenant.tenantCapabilities) &&
        Objects.equals(this.tenantId, tenantuserv3Tenant.tenantId) &&
        Objects.equals(this.uid, tenantuserv3Tenant.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationDate, externalId, externalMetadata, isInactive, isReady, name, partNumber, settings, tenantCapabilities, tenantId, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3Tenant {\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalMetadata: ").append(toIndentedString(externalMetadata)).append("\n");
    sb.append("    isInactive: ").append(toIndentedString(isInactive)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    tenantCapabilities: ").append(toIndentedString(tenantCapabilities)).append("\n");
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
    openapiFields.add("activation_date");
    openapiFields.add("external_id");
    openapiFields.add("external_metadata");
    openapiFields.add("is_inactive");
    openapiFields.add("is_ready");
    openapiFields.add("name");
    openapiFields.add("part_number");
    openapiFields.add("settings");
    openapiFields.add("tenant_capabilities");
    openapiFields.add("tenant_id");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3Tenant
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3Tenant.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3Tenant is not found in the empty JSON string", Tenantuserv3Tenant.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3Tenant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3Tenant` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!Tenantuserv3Tenant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3Tenant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3Tenant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3Tenant.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3Tenant>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3Tenant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3Tenant read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3Tenant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3Tenant
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3Tenant
  */
  public static Tenantuserv3Tenant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3Tenant.class);
  }

 /**
  * Convert an instance of Tenantuserv3Tenant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

