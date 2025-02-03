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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccessType;
import org.openapitools.client.model.CloudServiceProvider;
import org.openapitools.client.model.SensitivitySummary;

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

import org.openapitools.client.JSON;

/**
 * AccessibleDataStores
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class AccessibleDataStores {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_CLOUD_LOCATION = "cloudLocation";
  @SerializedName(SERIALIZED_NAME_CLOUD_LOCATION)
  private String cloudLocation;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<AccessType> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENSITIVITIES_SUMMARY = "sensitivitiesSummary";
  @SerializedName(SERIALIZED_NAME_SENSITIVITIES_SUMMARY)
  private List<SensitivitySummary> sensitivitiesSummary = new ArrayList<>();

  public AccessibleDataStores() {
  }

  public AccessibleDataStores id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AccessibleDataStores name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessibleDataStores type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public AccessibleDataStores cloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  public CloudServiceProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public AccessibleDataStores cloudLocation(String cloudLocation) {
    this.cloudLocation = cloudLocation;
    return this;
  }

   /**
   * Get cloudLocation
   * @return cloudLocation
  **/
  @javax.annotation.Nonnull
  public String getCloudLocation() {
    return cloudLocation;
  }

  public void setCloudLocation(String cloudLocation) {
    this.cloudLocation = cloudLocation;
  }


  public AccessibleDataStores permissions(List<AccessType> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AccessibleDataStores addPermissionsItem(AccessType permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nonnull
  public List<AccessType> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<AccessType> permissions) {
    this.permissions = permissions;
  }


  public AccessibleDataStores sensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
    return this;
  }

  public AccessibleDataStores addSensitivitiesSummaryItem(SensitivitySummary sensitivitiesSummaryItem) {
    if (this.sensitivitiesSummary == null) {
      this.sensitivitiesSummary = new ArrayList<>();
    }
    this.sensitivitiesSummary.add(sensitivitiesSummaryItem);
    return this;
  }

   /**
   * Get sensitivitiesSummary
   * @return sensitivitiesSummary
  **/
  @javax.annotation.Nonnull
  public List<SensitivitySummary> getSensitivitiesSummary() {
    return sensitivitiesSummary;
  }

  public void setSensitivitiesSummary(List<SensitivitySummary> sensitivitiesSummary) {
    this.sensitivitiesSummary = sensitivitiesSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessibleDataStores accessibleDataStores = (AccessibleDataStores) o;
    return Objects.equals(this.id, accessibleDataStores.id) &&
        Objects.equals(this.name, accessibleDataStores.name) &&
        Objects.equals(this.type, accessibleDataStores.type) &&
        Objects.equals(this.cloudProvider, accessibleDataStores.cloudProvider) &&
        Objects.equals(this.cloudLocation, accessibleDataStores.cloudLocation) &&
        Objects.equals(this.permissions, accessibleDataStores.permissions) &&
        Objects.equals(this.sensitivitiesSummary, accessibleDataStores.sensitivitiesSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, cloudProvider, cloudLocation, permissions, sensitivitiesSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessibleDataStores {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudLocation: ").append(toIndentedString(cloudLocation)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    sensitivitiesSummary: ").append(toIndentedString(sensitivitiesSummary)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("cloudProvider");
    openapiFields.add("cloudLocation");
    openapiFields.add("permissions");
    openapiFields.add("sensitivitiesSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("cloudProvider");
    openapiRequiredFields.add("cloudLocation");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("sensitivitiesSummary");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessibleDataStores
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessibleDataStores.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessibleDataStores is not found in the empty JSON string", AccessibleDataStores.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessibleDataStores.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessibleDataStores` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessibleDataStores.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      if (!jsonObj.get("cloudLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudLocation").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("permissions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sensitivitiesSummary").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitivitiesSummary` to be an array in the JSON string but got `%s`", jsonObj.get("sensitivitiesSummary").toString()));
      }

      JsonArray jsonArraysensitivitiesSummary = jsonObj.getAsJsonArray("sensitivitiesSummary");
      // validate the required field `sensitivitiesSummary` (array)
      for (int i = 0; i < jsonArraysensitivitiesSummary.size(); i++) {
        SensitivitySummary.validateJsonElement(jsonArraysensitivitiesSummary.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessibleDataStores.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessibleDataStores' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessibleDataStores> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessibleDataStores.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessibleDataStores>() {
           @Override
           public void write(JsonWriter out, AccessibleDataStores value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessibleDataStores read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessibleDataStores given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessibleDataStores
  * @throws IOException if the JSON string is invalid with respect to AccessibleDataStores
  */
  public static AccessibleDataStores fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessibleDataStores.class);
  }

 /**
  * Convert an instance of AccessibleDataStores to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

