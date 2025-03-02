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
import org.openapitools.client.model.Assetsv3ConnectionEdge;
import org.openapitools.client.model.Assetsv3CustomProperty;
import org.openapitools.client.model.Assetsv3Level;

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
 * Assetsv3EndpointVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3EndpointVertex {
  public static final String SERIALIZED_NAME_CRITICALITY = "criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Assetsv3Level criticality = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_ENDPOINT_HOST = "endpoint_host";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_HOST)
  private List<Assetsv3ConnectionEdge> endpointHost = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENDPOINT_IP = "endpoint_ip";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_IP)
  private List<Assetsv3ConnectionEdge> endpointIp = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENDPOINT_NAME = "endpoint_name";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_NAME)
  private String endpointName;

  public static final String SERIALIZED_NAME_ENDPOINT_SUB_TYPE = "endpoint_sub_type";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_SUB_TYPE)
  private String endpointSubType;

  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpoint_type";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_ACCESS_URL = "is_access_url";
  @SerializedName(SERIALIZED_NAME_IS_ACCESS_URL)
  private Boolean isAccessUrl;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private List<String> owner = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private Assetsv3Level riskLevel = Assetsv3Level.UNKNOWN;

  public Assetsv3EndpointVertex() {
  }

  public Assetsv3EndpointVertex criticality(Assetsv3Level criticality) {
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


  public Assetsv3EndpointVertex endpointHost(List<Assetsv3ConnectionEdge> endpointHost) {
    this.endpointHost = endpointHost;
    return this;
  }

  public Assetsv3EndpointVertex addEndpointHostItem(Assetsv3ConnectionEdge endpointHostItem) {
    if (this.endpointHost == null) {
      this.endpointHost = new ArrayList<>();
    }
    this.endpointHost.add(endpointHostItem);
    return this;
  }

   /**
   * Get endpointHost
   * @return endpointHost
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getEndpointHost() {
    return endpointHost;
  }

  public void setEndpointHost(List<Assetsv3ConnectionEdge> endpointHost) {
    this.endpointHost = endpointHost;
  }


  public Assetsv3EndpointVertex endpointIp(List<Assetsv3ConnectionEdge> endpointIp) {
    this.endpointIp = endpointIp;
    return this;
  }

  public Assetsv3EndpointVertex addEndpointIpItem(Assetsv3ConnectionEdge endpointIpItem) {
    if (this.endpointIp == null) {
      this.endpointIp = new ArrayList<>();
    }
    this.endpointIp.add(endpointIpItem);
    return this;
  }

   /**
   * Get endpointIp
   * @return endpointIp
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getEndpointIp() {
    return endpointIp;
  }

  public void setEndpointIp(List<Assetsv3ConnectionEdge> endpointIp) {
    this.endpointIp = endpointIp;
  }


  public Assetsv3EndpointVertex endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * Get endpointName
   * @return endpointName
  **/
  @javax.annotation.Nullable
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }


  public Assetsv3EndpointVertex endpointSubType(String endpointSubType) {
    this.endpointSubType = endpointSubType;
    return this;
  }

   /**
   * Get endpointSubType
   * @return endpointSubType
  **/
  @javax.annotation.Nullable
  public String getEndpointSubType() {
    return endpointSubType;
  }

  public void setEndpointSubType(String endpointSubType) {
    this.endpointSubType = endpointSubType;
  }


  public Assetsv3EndpointVertex endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @javax.annotation.Nullable
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }


  public Assetsv3EndpointVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3EndpointVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
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


  public Assetsv3EndpointVertex isAccessUrl(Boolean isAccessUrl) {
    this.isAccessUrl = isAccessUrl;
    return this;
  }

   /**
   * to check if this entry is for access url. Used as an access url for application.
   * @return isAccessUrl
  **/
  @javax.annotation.Nullable
  public Boolean getIsAccessUrl() {
    return isAccessUrl;
  }

  public void setIsAccessUrl(Boolean isAccessUrl) {
    this.isAccessUrl = isAccessUrl;
  }


  public Assetsv3EndpointVertex os(String os) {
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }


  public Assetsv3EndpointVertex owner(List<String> owner) {
    this.owner = owner;
    return this;
  }

  public Assetsv3EndpointVertex addOwnerItem(String ownerItem) {
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


  public Assetsv3EndpointVertex resolutionKey(String resolutionKey) {
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


  public Assetsv3EndpointVertex riskLevel(Assetsv3Level riskLevel) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3EndpointVertex assetsv3EndpointVertex = (Assetsv3EndpointVertex) o;
    return Objects.equals(this.criticality, assetsv3EndpointVertex.criticality) &&
        Objects.equals(this.endpointHost, assetsv3EndpointVertex.endpointHost) &&
        Objects.equals(this.endpointIp, assetsv3EndpointVertex.endpointIp) &&
        Objects.equals(this.endpointName, assetsv3EndpointVertex.endpointName) &&
        Objects.equals(this.endpointSubType, assetsv3EndpointVertex.endpointSubType) &&
        Objects.equals(this.endpointType, assetsv3EndpointVertex.endpointType) &&
        Objects.equals(this.extendedProperties, assetsv3EndpointVertex.extendedProperties) &&
        Objects.equals(this.isAccessUrl, assetsv3EndpointVertex.isAccessUrl) &&
        Objects.equals(this.os, assetsv3EndpointVertex.os) &&
        Objects.equals(this.owner, assetsv3EndpointVertex.owner) &&
        Objects.equals(this.resolutionKey, assetsv3EndpointVertex.resolutionKey) &&
        Objects.equals(this.riskLevel, assetsv3EndpointVertex.riskLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticality, endpointHost, endpointIp, endpointName, endpointSubType, endpointType, extendedProperties, isAccessUrl, os, owner, resolutionKey, riskLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3EndpointVertex {\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    endpointHost: ").append(toIndentedString(endpointHost)).append("\n");
    sb.append("    endpointIp: ").append(toIndentedString(endpointIp)).append("\n");
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    endpointSubType: ").append(toIndentedString(endpointSubType)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    isAccessUrl: ").append(toIndentedString(isAccessUrl)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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
    openapiFields.add("criticality");
    openapiFields.add("endpoint_host");
    openapiFields.add("endpoint_ip");
    openapiFields.add("endpoint_name");
    openapiFields.add("endpoint_sub_type");
    openapiFields.add("endpoint_type");
    openapiFields.add("extended_properties");
    openapiFields.add("is_access_url");
    openapiFields.add("os");
    openapiFields.add("owner");
    openapiFields.add("resolution_key");
    openapiFields.add("risk_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3EndpointVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3EndpointVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3EndpointVertex is not found in the empty JSON string", Assetsv3EndpointVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3EndpointVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3EndpointVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `criticality`
      if (jsonObj.get("criticality") != null && !jsonObj.get("criticality").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("criticality"));
      }
      if (jsonObj.get("endpoint_host") != null && !jsonObj.get("endpoint_host").isJsonNull()) {
        JsonArray jsonArrayendpointHost = jsonObj.getAsJsonArray("endpoint_host");
        if (jsonArrayendpointHost != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoint_host").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoint_host` to be an array in the JSON string but got `%s`", jsonObj.get("endpoint_host").toString()));
          }

          // validate the optional field `endpoint_host` (array)
          for (int i = 0; i < jsonArrayendpointHost.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayendpointHost.get(i));
          };
        }
      }
      if (jsonObj.get("endpoint_ip") != null && !jsonObj.get("endpoint_ip").isJsonNull()) {
        JsonArray jsonArrayendpointIp = jsonObj.getAsJsonArray("endpoint_ip");
        if (jsonArrayendpointIp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endpoint_ip").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endpoint_ip` to be an array in the JSON string but got `%s`", jsonObj.get("endpoint_ip").toString()));
          }

          // validate the optional field `endpoint_ip` (array)
          for (int i = 0; i < jsonArrayendpointIp.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArrayendpointIp.get(i));
          };
        }
      }
      if ((jsonObj.get("endpoint_name") != null && !jsonObj.get("endpoint_name").isJsonNull()) && !jsonObj.get("endpoint_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_name").toString()));
      }
      if ((jsonObj.get("endpoint_sub_type") != null && !jsonObj.get("endpoint_sub_type").isJsonNull()) && !jsonObj.get("endpoint_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_sub_type").toString()));
      }
      if ((jsonObj.get("endpoint_type") != null && !jsonObj.get("endpoint_type").isJsonNull()) && !jsonObj.get("endpoint_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_type").toString()));
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
      if ((jsonObj.get("os") != null && !jsonObj.get("os").isJsonNull()) && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3EndpointVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3EndpointVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3EndpointVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3EndpointVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3EndpointVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3EndpointVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3EndpointVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3EndpointVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3EndpointVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3EndpointVertex
  */
  public static Assetsv3EndpointVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3EndpointVertex.class);
  }

 /**
  * Convert an instance of Assetsv3EndpointVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

