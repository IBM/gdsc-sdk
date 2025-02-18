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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Assetsv3ConnectionEdge;
import com.ibm.gdsc.sdk.models.Assetsv3CustomProperty;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Assetsv3HostVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Assetsv3HostVertex {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DATA_CENTER = "data_center";
  @SerializedName(SERIALIZED_NAME_DATA_CENTER)
  private String dataCenter;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private String dns;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_IP = "host_ip";
  @SerializedName(SERIALIZED_NAME_HOST_IP)
  private List<Assetsv3ConnectionEdge> hostIp = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_HOST_PORT = "host_port";
  @SerializedName(SERIALIZED_NAME_HOST_PORT)
  private List<Assetsv3ConnectionEdge> hostPort = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public Assetsv3HostVertex() {
  }

  public Assetsv3HostVertex city(String city) {
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


  public Assetsv3HostVertex country(String country) {
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


  public Assetsv3HostVertex dataCenter(String dataCenter) {
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


  public Assetsv3HostVertex description(String description) {
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


  public Assetsv3HostVertex dns(String dns) {
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


  public Assetsv3HostVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3HostVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
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


  public Assetsv3HostVertex hostIp(List<Assetsv3ConnectionEdge> hostIp) {
    this.hostIp = hostIp;
    return this;
  }

  public Assetsv3HostVertex addHostIpItem(Assetsv3ConnectionEdge hostIpItem) {
    if (this.hostIp == null) {
      this.hostIp = new ArrayList<>();
    }
    this.hostIp.add(hostIpItem);
    return this;
  }

   /**
   * Get hostIp
   * @return hostIp
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getHostIp() {
    return hostIp;
  }

  public void setHostIp(List<Assetsv3ConnectionEdge> hostIp) {
    this.hostIp = hostIp;
  }


  public Assetsv3HostVertex hostName(String hostName) {
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


  public Assetsv3HostVertex hostPort(List<Assetsv3ConnectionEdge> hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  public Assetsv3HostVertex addHostPortItem(Assetsv3ConnectionEdge hostPortItem) {
    if (this.hostPort == null) {
      this.hostPort = new ArrayList<>();
    }
    this.hostPort.add(hostPortItem);
    return this;
  }

   /**
   * Get hostPort
   * @return hostPort
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getHostPort() {
    return hostPort;
  }

  public void setHostPort(List<Assetsv3ConnectionEdge> hostPort) {
    this.hostPort = hostPort;
  }


  public Assetsv3HostVertex region(String region) {
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


  public Assetsv3HostVertex resolutionKey(String resolutionKey) {
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


  public Assetsv3HostVertex state(String state) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3HostVertex assetsv3HostVertex = (Assetsv3HostVertex) o;
    return Objects.equals(this.city, assetsv3HostVertex.city) &&
        Objects.equals(this.country, assetsv3HostVertex.country) &&
        Objects.equals(this.dataCenter, assetsv3HostVertex.dataCenter) &&
        Objects.equals(this.description, assetsv3HostVertex.description) &&
        Objects.equals(this.dns, assetsv3HostVertex.dns) &&
        Objects.equals(this.extendedProperties, assetsv3HostVertex.extendedProperties) &&
        Objects.equals(this.hostIp, assetsv3HostVertex.hostIp) &&
        Objects.equals(this.hostName, assetsv3HostVertex.hostName) &&
        Objects.equals(this.hostPort, assetsv3HostVertex.hostPort) &&
        Objects.equals(this.region, assetsv3HostVertex.region) &&
        Objects.equals(this.resolutionKey, assetsv3HostVertex.resolutionKey) &&
        Objects.equals(this.state, assetsv3HostVertex.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, dataCenter, description, dns, extendedProperties, hostIp, hostName, hostPort, region, resolutionKey, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3HostVertex {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("data_center");
    openapiFields.add("description");
    openapiFields.add("dns");
    openapiFields.add("extended_properties");
    openapiFields.add("host_ip");
    openapiFields.add("host_name");
    openapiFields.add("host_port");
    openapiFields.add("region");
    openapiFields.add("resolution_key");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3HostVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3HostVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3HostVertex is not found in the empty JSON string", Assetsv3HostVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3HostVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3HostVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("data_center") != null && !jsonObj.get("data_center").isJsonNull()) && !jsonObj.get("data_center").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_center` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_center").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("dns") != null && !jsonObj.get("dns").isJsonNull()) && !jsonObj.get("dns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dns").toString()));
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
      if (jsonObj.get("host_ip") != null && !jsonObj.get("host_ip").isJsonNull()) {
        JsonArray jsonArrayhostIp = jsonObj.getAsJsonArray("host_ip");
        if (jsonArrayhostIp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("host_ip").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `host_ip` to be an array in the JSON string but got `%s`", jsonObj.get("host_ip").toString()));
          }

          // validate the optional field `host_ip` (array)
          for (int i = 0; i < jsonArrayhostIp.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayhostIp.get(i));
          };
        }
      }
      if ((jsonObj.get("host_name") != null && !jsonObj.get("host_name").isJsonNull()) && !jsonObj.get("host_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host_name").toString()));
      }
      if (jsonObj.get("host_port") != null && !jsonObj.get("host_port").isJsonNull()) {
        JsonArray jsonArrayhostPort = jsonObj.getAsJsonArray("host_port");
        if (jsonArrayhostPort != null) {
          // ensure the json data is an array
          if (!jsonObj.get("host_port").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `host_port` to be an array in the JSON string but got `%s`", jsonObj.get("host_port").toString()));
          }

          // validate the optional field `host_port` (array)
          for (int i = 0; i < jsonArrayhostPort.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayhostPort.get(i));
          };
        }
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3HostVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3HostVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3HostVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3HostVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3HostVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3HostVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3HostVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3HostVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3HostVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3HostVertex
  */
  public static Assetsv3HostVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3HostVertex.class);
  }

 /**
  * Convert an instance of Assetsv3HostVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

