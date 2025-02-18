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
import com.ibm.gdsc.sdk.Assetsv3ConnectionEdge;
import com.ibm.gdsc.sdk.Assetsv3CustomProperty;
import com.ibm.gdsc.sdk.Assetsv3Level;
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

import com.ibm.gdsc.JSON;

/**
 * Assetsv3DatabaseVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3DatabaseVertex {
  public static final String SERIALIZED_NAME_CATALOG = "catalog";
  @SerializedName(SERIALIZED_NAME_CATALOG)
  private String catalog;

  public static final String SERIALIZED_NAME_CRITICALITY = "criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Assetsv3Level criticality = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_DATABASE_HOST = "database_host";
  @SerializedName(SERIALIZED_NAME_DATABASE_HOST)
  private List<Assetsv3ConnectionEdge> databaseHost = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATABASE_IP = "database_ip";
  @SerializedName(SERIALIZED_NAME_DATABASE_IP)
  private List<Assetsv3ConnectionEdge> databaseIp = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATABASE_NAME = "database_name";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_DATABASE_SUB_TYPE = "database_sub_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_SUB_TYPE)
  private String databaseSubType;

  public static final String SERIALIZED_NAME_DATABASE_SUBSCRIPTION = "database_subscription";
  @SerializedName(SERIALIZED_NAME_DATABASE_SUBSCRIPTION)
  private List<Assetsv3ConnectionEdge> databaseSubscription = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATABASE_TYPE = "database_type";
  @SerializedName(SERIALIZED_NAME_DATABASE_TYPE)
  private String databaseType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private List<String> owner = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private Assetsv3Level riskLevel = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public Assetsv3DatabaseVertex() {
  }

  public Assetsv3DatabaseVertex catalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

   /**
   * Get catalog
   * @return catalog
  **/
  @javax.annotation.Nullable
  public String getCatalog() {
    return catalog;
  }

  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }


  public Assetsv3DatabaseVertex criticality(Assetsv3Level criticality) {
    this.criticality = criticality;
    return this;
  }

   /**
   * Get criticality
   * @return criticality
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getCriticality() {
    return criticality;
  }

  public void setCriticality(Assetsv3Level criticality) {
    this.criticality = criticality;
  }


  public Assetsv3DatabaseVertex databaseHost(List<Assetsv3ConnectionEdge> databaseHost) {
    this.databaseHost = databaseHost;
    return this;
  }

  public Assetsv3DatabaseVertex addDatabaseHostItem(Assetsv3ConnectionEdge databaseHostItem) {
    if (this.databaseHost == null) {
      this.databaseHost = new ArrayList<>();
    }
    this.databaseHost.add(databaseHostItem);
    return this;
  }

   /**
   * Get databaseHost
   * @return databaseHost
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getDatabaseHost() {
    return databaseHost;
  }

  public void setDatabaseHost(List<Assetsv3ConnectionEdge> databaseHost) {
    this.databaseHost = databaseHost;
  }


  public Assetsv3DatabaseVertex databaseIp(List<Assetsv3ConnectionEdge> databaseIp) {
    this.databaseIp = databaseIp;
    return this;
  }

  public Assetsv3DatabaseVertex addDatabaseIpItem(Assetsv3ConnectionEdge databaseIpItem) {
    if (this.databaseIp == null) {
      this.databaseIp = new ArrayList<>();
    }
    this.databaseIp.add(databaseIpItem);
    return this;
  }

   /**
   * Get databaseIp
   * @return databaseIp
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getDatabaseIp() {
    return databaseIp;
  }

  public void setDatabaseIp(List<Assetsv3ConnectionEdge> databaseIp) {
    this.databaseIp = databaseIp;
  }


  public Assetsv3DatabaseVertex databaseName(String databaseName) {
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


  public Assetsv3DatabaseVertex databaseSubType(String databaseSubType) {
    this.databaseSubType = databaseSubType;
    return this;
  }

   /**
   * Get databaseSubType
   * @return databaseSubType
  **/
  @javax.annotation.Nullable
  public String getDatabaseSubType() {
    return databaseSubType;
  }

  public void setDatabaseSubType(String databaseSubType) {
    this.databaseSubType = databaseSubType;
  }


  public Assetsv3DatabaseVertex databaseSubscription(List<Assetsv3ConnectionEdge> databaseSubscription) {
    this.databaseSubscription = databaseSubscription;
    return this;
  }

  public Assetsv3DatabaseVertex addDatabaseSubscriptionItem(Assetsv3ConnectionEdge databaseSubscriptionItem) {
    if (this.databaseSubscription == null) {
      this.databaseSubscription = new ArrayList<>();
    }
    this.databaseSubscription.add(databaseSubscriptionItem);
    return this;
  }

   /**
   * Get databaseSubscription
   * @return databaseSubscription
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getDatabaseSubscription() {
    return databaseSubscription;
  }

  public void setDatabaseSubscription(List<Assetsv3ConnectionEdge> databaseSubscription) {
    this.databaseSubscription = databaseSubscription;
  }


  public Assetsv3DatabaseVertex databaseType(String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

   /**
   * Get databaseType
   * @return databaseType
  **/
  @javax.annotation.Nullable
  public String getDatabaseType() {
    return databaseType;
  }

  public void setDatabaseType(String databaseType) {
    this.databaseType = databaseType;
  }


  public Assetsv3DatabaseVertex description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Assetsv3DatabaseVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3DatabaseVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
    if (this.extendedProperties == null) {
      this.extendedProperties = new ArrayList<>();
    }
    this.extendedProperties.add(extendedPropertiesItem);
    return this;
  }

   /**
   * Get extendedProperties
   * @return extendedProperties
  **/
  @javax.annotation.Nullable
  public List<Assetsv3CustomProperty> getExtendedProperties() {
    return extendedProperties;
  }

  public void setExtendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public Assetsv3DatabaseVertex owner(List<String> owner) {
    this.owner = owner;
    return this;
  }

  public Assetsv3DatabaseVertex addOwnerItem(String ownerItem) {
    if (this.owner == null) {
      this.owner = new ArrayList<>();
    }
    this.owner.add(ownerItem);
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  public List<String> getOwner() {
    return owner;
  }

  public void setOwner(List<String> owner) {
    this.owner = owner;
  }


  public Assetsv3DatabaseVertex resolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
    return this;
  }

   /**
   * Get resolutionKey
   * @return resolutionKey
  **/
  @javax.annotation.Nullable
  public String getResolutionKey() {
    return resolutionKey;
  }

  public void setResolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
  }


  public Assetsv3DatabaseVertex riskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
  }


  public Assetsv3DatabaseVertex schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Get schemaName
   * @return schemaName
  **/
  @javax.annotation.Nullable
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public Assetsv3DatabaseVertex serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3DatabaseVertex assetsv3DatabaseVertex = (Assetsv3DatabaseVertex) o;
    return Objects.equals(this.catalog, assetsv3DatabaseVertex.catalog) &&
        Objects.equals(this.criticality, assetsv3DatabaseVertex.criticality) &&
        Objects.equals(this.databaseHost, assetsv3DatabaseVertex.databaseHost) &&
        Objects.equals(this.databaseIp, assetsv3DatabaseVertex.databaseIp) &&
        Objects.equals(this.databaseName, assetsv3DatabaseVertex.databaseName) &&
        Objects.equals(this.databaseSubType, assetsv3DatabaseVertex.databaseSubType) &&
        Objects.equals(this.databaseSubscription, assetsv3DatabaseVertex.databaseSubscription) &&
        Objects.equals(this.databaseType, assetsv3DatabaseVertex.databaseType) &&
        Objects.equals(this.description, assetsv3DatabaseVertex.description) &&
        Objects.equals(this.extendedProperties, assetsv3DatabaseVertex.extendedProperties) &&
        Objects.equals(this.owner, assetsv3DatabaseVertex.owner) &&
        Objects.equals(this.resolutionKey, assetsv3DatabaseVertex.resolutionKey) &&
        Objects.equals(this.riskLevel, assetsv3DatabaseVertex.riskLevel) &&
        Objects.equals(this.schemaName, assetsv3DatabaseVertex.schemaName) &&
        Objects.equals(this.serviceName, assetsv3DatabaseVertex.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, criticality, databaseHost, databaseIp, databaseName, databaseSubType, databaseSubscription, databaseType, description, extendedProperties, owner, resolutionKey, riskLevel, schemaName, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3DatabaseVertex {\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    databaseHost: ").append(toIndentedString(databaseHost)).append("\n");
    sb.append("    databaseIp: ").append(toIndentedString(databaseIp)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    databaseSubType: ").append(toIndentedString(databaseSubType)).append("\n");
    sb.append("    databaseSubscription: ").append(toIndentedString(databaseSubscription)).append("\n");
    sb.append("    databaseType: ").append(toIndentedString(databaseType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
    openapiFields.add("catalog");
    openapiFields.add("criticality");
    openapiFields.add("database_host");
    openapiFields.add("database_ip");
    openapiFields.add("database_name");
    openapiFields.add("database_sub_type");
    openapiFields.add("database_subscription");
    openapiFields.add("database_type");
    openapiFields.add("description");
    openapiFields.add("extended_properties");
    openapiFields.add("owner");
    openapiFields.add("resolution_key");
    openapiFields.add("risk_level");
    openapiFields.add("schema_name");
    openapiFields.add("service_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3DatabaseVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3DatabaseVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3DatabaseVertex is not found in the empty JSON string", Assetsv3DatabaseVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3DatabaseVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3DatabaseVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("catalog") != null && !jsonObj.get("catalog").isJsonNull()) && !jsonObj.get("catalog").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog").toString()));
      }
      // validate the optional field `criticality`
      if (jsonObj.get("criticality") != null && !jsonObj.get("criticality").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("criticality"));
      }
      if (jsonObj.get("database_host") != null && !jsonObj.get("database_host").isJsonNull()) {
        JsonArray jsonArraydatabaseHost = jsonObj.getAsJsonArray("database_host");
        if (jsonArraydatabaseHost != null) {
          // ensure the json data is an array
          if (!jsonObj.get("database_host").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `database_host` to be an array in the JSON string but got `%s`", jsonObj.get("database_host").toString()));
          }

          // validate the optional field `database_host` (array)
          for (int i = 0; i < jsonArraydatabaseHost.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraydatabaseHost.get(i));
          };
        }
      }
      if (jsonObj.get("database_ip") != null && !jsonObj.get("database_ip").isJsonNull()) {
        JsonArray jsonArraydatabaseIp = jsonObj.getAsJsonArray("database_ip");
        if (jsonArraydatabaseIp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("database_ip").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `database_ip` to be an array in the JSON string but got `%s`", jsonObj.get("database_ip").toString()));
          }

          // validate the optional field `database_ip` (array)
          for (int i = 0; i < jsonArraydatabaseIp.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraydatabaseIp.get(i));
          };
        }
      }
      if ((jsonObj.get("database_name") != null && !jsonObj.get("database_name").isJsonNull()) && !jsonObj.get("database_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_name").toString()));
      }
      if ((jsonObj.get("database_sub_type") != null && !jsonObj.get("database_sub_type").isJsonNull()) && !jsonObj.get("database_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_sub_type").toString()));
      }
      if (jsonObj.get("database_subscription") != null && !jsonObj.get("database_subscription").isJsonNull()) {
        JsonArray jsonArraydatabaseSubscription = jsonObj.getAsJsonArray("database_subscription");
        if (jsonArraydatabaseSubscription != null) {
          // ensure the json data is an array
          if (!jsonObj.get("database_subscription").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `database_subscription` to be an array in the JSON string but got `%s`", jsonObj.get("database_subscription").toString()));
          }

          // validate the optional field `database_subscription` (array)
          for (int i = 0; i < jsonArraydatabaseSubscription.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraydatabaseSubscription.get(i));
          };
        }
      }
      if ((jsonObj.get("database_type") != null && !jsonObj.get("database_type").isJsonNull()) && !jsonObj.get("database_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database_type").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("extended_properties") != null && !jsonObj.get("extended_properties").isJsonNull()) {
        JsonArray jsonArrayextendedProperties = jsonObj.getAsJsonArray("extended_properties");
        if (jsonArrayextendedProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extended_properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extended_properties` to be an array in the JSON string but got `%s`", jsonObj.get("extended_properties").toString()));
          }

          // validate the optional field `extended_properties` (array)
          for (int i = 0; i < jsonArrayextendedProperties.size(); i++) {
            Assetsv3CustomProperty.validateJsonElement(jsonArrayextendedProperties.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull() && !jsonObj.get("owner").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be an array in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("risk_level"));
      }
      if ((jsonObj.get("schema_name") != null && !jsonObj.get("schema_name").isJsonNull()) && !jsonObj.get("schema_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_name").toString()));
      }
      if ((jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonNull()) && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3DatabaseVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3DatabaseVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3DatabaseVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3DatabaseVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3DatabaseVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3DatabaseVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3DatabaseVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3DatabaseVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3DatabaseVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3DatabaseVertex
  */
  public static Assetsv3DatabaseVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3DatabaseVertex.class);
  }

 /**
  * Convert an instance of Assetsv3DatabaseVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

