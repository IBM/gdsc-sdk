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
import com.ibm.security.guardium.Assetsv3ConnectionEdge;
import com.ibm.security.guardium.Assetsv3CustomProperty;
import com.ibm.security.guardium.Assetsv3Level;
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
 * Assetsv3DeploymentVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3DeploymentVertex {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CRITICALITY = "criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Assetsv3Level criticality = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_DATA_CENTER = "data_center";
  @SerializedName(SERIALIZED_NAME_DATA_CENTER)
  private String dataCenter;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ACCOUNT = "deployment_account";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ACCOUNT)
  private List<Assetsv3ConnectionEdge> deploymentAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "deployment_id";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private String deploymentId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_SUBSCRIPTION = "deployment_subscription";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_SUBSCRIPTION)
  private List<Assetsv3ConnectionEdge> deploymentSubscription = new ArrayList<>();

  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private String dns;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private Assetsv3Level riskLevel = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Assetsv3DeploymentVertex() {
  }

  public Assetsv3DeploymentVertex city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Assetsv3DeploymentVertex country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public Assetsv3DeploymentVertex criticality(Assetsv3Level criticality) {
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


  public Assetsv3DeploymentVertex dataCenter(String dataCenter) {
    this.dataCenter = dataCenter;
    return this;
  }

   /**
   * Get dataCenter
   * @return dataCenter
  **/
  @javax.annotation.Nullable
  public String getDataCenter() {
    return dataCenter;
  }

  public void setDataCenter(String dataCenter) {
    this.dataCenter = dataCenter;
  }


  public Assetsv3DeploymentVertex deploymentAccount(List<Assetsv3ConnectionEdge> deploymentAccount) {
    this.deploymentAccount = deploymentAccount;
    return this;
  }

  public Assetsv3DeploymentVertex addDeploymentAccountItem(Assetsv3ConnectionEdge deploymentAccountItem) {
    if (this.deploymentAccount == null) {
      this.deploymentAccount = new ArrayList<>();
    }
    this.deploymentAccount.add(deploymentAccountItem);
    return this;
  }

   /**
   * Get deploymentAccount
   * @return deploymentAccount
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getDeploymentAccount() {
    return deploymentAccount;
  }

  public void setDeploymentAccount(List<Assetsv3ConnectionEdge> deploymentAccount) {
    this.deploymentAccount = deploymentAccount;
  }


  public Assetsv3DeploymentVertex deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Get deploymentId
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public Assetsv3DeploymentVertex deploymentSubscription(List<Assetsv3ConnectionEdge> deploymentSubscription) {
    this.deploymentSubscription = deploymentSubscription;
    return this;
  }

  public Assetsv3DeploymentVertex addDeploymentSubscriptionItem(Assetsv3ConnectionEdge deploymentSubscriptionItem) {
    if (this.deploymentSubscription == null) {
      this.deploymentSubscription = new ArrayList<>();
    }
    this.deploymentSubscription.add(deploymentSubscriptionItem);
    return this;
  }

   /**
   * Get deploymentSubscription
   * @return deploymentSubscription
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getDeploymentSubscription() {
    return deploymentSubscription;
  }

  public void setDeploymentSubscription(List<Assetsv3ConnectionEdge> deploymentSubscription) {
    this.deploymentSubscription = deploymentSubscription;
  }


  public Assetsv3DeploymentVertex dns(String dns) {
    this.dns = dns;
    return this;
  }

   /**
   * Get dns
   * @return dns
  **/
  @javax.annotation.Nullable
  public String getDns() {
    return dns;
  }

  public void setDns(String dns) {
    this.dns = dns;
  }


  public Assetsv3DeploymentVertex environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public Assetsv3DeploymentVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3DeploymentVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
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


  public Assetsv3DeploymentVertex name(String name) {
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


  public Assetsv3DeploymentVertex region(String region) {
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


  public Assetsv3DeploymentVertex resolutionKey(String resolutionKey) {
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


  public Assetsv3DeploymentVertex riskLevel(Assetsv3Level riskLevel) {
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


  public Assetsv3DeploymentVertex service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }


  public Assetsv3DeploymentVertex state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Assetsv3DeploymentVertex type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3DeploymentVertex assetsv3DeploymentVertex = (Assetsv3DeploymentVertex) o;
    return Objects.equals(this.city, assetsv3DeploymentVertex.city) &&
        Objects.equals(this.country, assetsv3DeploymentVertex.country) &&
        Objects.equals(this.criticality, assetsv3DeploymentVertex.criticality) &&
        Objects.equals(this.dataCenter, assetsv3DeploymentVertex.dataCenter) &&
        Objects.equals(this.deploymentAccount, assetsv3DeploymentVertex.deploymentAccount) &&
        Objects.equals(this.deploymentId, assetsv3DeploymentVertex.deploymentId) &&
        Objects.equals(this.deploymentSubscription, assetsv3DeploymentVertex.deploymentSubscription) &&
        Objects.equals(this.dns, assetsv3DeploymentVertex.dns) &&
        Objects.equals(this.environment, assetsv3DeploymentVertex.environment) &&
        Objects.equals(this.extendedProperties, assetsv3DeploymentVertex.extendedProperties) &&
        Objects.equals(this.name, assetsv3DeploymentVertex.name) &&
        Objects.equals(this.region, assetsv3DeploymentVertex.region) &&
        Objects.equals(this.resolutionKey, assetsv3DeploymentVertex.resolutionKey) &&
        Objects.equals(this.riskLevel, assetsv3DeploymentVertex.riskLevel) &&
        Objects.equals(this.service, assetsv3DeploymentVertex.service) &&
        Objects.equals(this.state, assetsv3DeploymentVertex.state) &&
        Objects.equals(this.type, assetsv3DeploymentVertex.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, criticality, dataCenter, deploymentAccount, deploymentId, deploymentSubscription, dns, environment, extendedProperties, name, region, resolutionKey, riskLevel, service, state, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3DeploymentVertex {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
    sb.append("    deploymentAccount: ").append(toIndentedString(deploymentAccount)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    deploymentSubscription: ").append(toIndentedString(deploymentSubscription)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("criticality");
    openapiFields.add("data_center");
    openapiFields.add("deployment_account");
    openapiFields.add("deployment_id");
    openapiFields.add("deployment_subscription");
    openapiFields.add("dns");
    openapiFields.add("environment");
    openapiFields.add("extended_properties");
    openapiFields.add("name");
    openapiFields.add("region");
    openapiFields.add("resolution_key");
    openapiFields.add("risk_level");
    openapiFields.add("service");
    openapiFields.add("state");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3DeploymentVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3DeploymentVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3DeploymentVertex is not found in the empty JSON string", Assetsv3DeploymentVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3DeploymentVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3DeploymentVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field `criticality`
      if (jsonObj.get("criticality") != null && !jsonObj.get("criticality").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("criticality"));
      }
      if ((jsonObj.get("data_center") != null && !jsonObj.get("data_center").isJsonNull()) && !jsonObj.get("data_center").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_center` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_center").toString()));
      }
      if (jsonObj.get("deployment_account") != null && !jsonObj.get("deployment_account").isJsonNull()) {
        JsonArray jsonArraydeploymentAccount = jsonObj.getAsJsonArray("deployment_account");
        if (jsonArraydeploymentAccount != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deployment_account").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deployment_account` to be an array in the JSON string but got `%s`", jsonObj.get("deployment_account").toString()));
          }

          // validate the optional field `deployment_account` (array)
          for (int i = 0; i < jsonArraydeploymentAccount.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraydeploymentAccount.get(i));
          };
        }
      }
      if ((jsonObj.get("deployment_id") != null && !jsonObj.get("deployment_id").isJsonNull()) && !jsonObj.get("deployment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deployment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deployment_id").toString()));
      }
      if (jsonObj.get("deployment_subscription") != null && !jsonObj.get("deployment_subscription").isJsonNull()) {
        JsonArray jsonArraydeploymentSubscription = jsonObj.getAsJsonArray("deployment_subscription");
        if (jsonArraydeploymentSubscription != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deployment_subscription").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deployment_subscription` to be an array in the JSON string but got `%s`", jsonObj.get("deployment_subscription").toString()));
          }

          // validate the optional field `deployment_subscription` (array)
          for (int i = 0; i < jsonArraydeploymentSubscription.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraydeploymentSubscription.get(i));
          };
        }
      }
      if ((jsonObj.get("dns") != null && !jsonObj.get("dns").isJsonNull()) && !jsonObj.get("dns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dns").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
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
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("risk_level"));
      }
      if ((jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3DeploymentVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3DeploymentVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3DeploymentVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3DeploymentVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3DeploymentVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3DeploymentVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3DeploymentVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3DeploymentVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3DeploymentVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3DeploymentVertex
  */
  public static Assetsv3DeploymentVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3DeploymentVertex.class);
  }

 /**
  * Convert an instance of Assetsv3DeploymentVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

