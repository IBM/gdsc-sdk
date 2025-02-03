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

import org.openapitools.client.JSON;

/**
 * UpdateNetLocRequest is the request object for UpdateNetLocation API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmdatamanagerv3UpdateNetLocRequest {
  public static final String SERIALIZED_NAME_NETLOC_CITY = "netloc_city";
  @SerializedName(SERIALIZED_NAME_NETLOC_CITY)
  private String netlocCity;

  public static final String SERIALIZED_NAME_NETLOC_COUNTRY = "netloc_country";
  @SerializedName(SERIALIZED_NAME_NETLOC_COUNTRY)
  private String netlocCountry;

  public static final String SERIALIZED_NAME_NETLOC_DATA_CENTER = "netloc_data_center";
  @SerializedName(SERIALIZED_NAME_NETLOC_DATA_CENTER)
  private String netlocDataCenter;

  public static final String SERIALIZED_NAME_NETLOC_REGION = "netloc_region";
  @SerializedName(SERIALIZED_NAME_NETLOC_REGION)
  private String netlocRegion;

  public static final String SERIALIZED_NAME_NETLOC_STATE_PROV = "netloc_state_prov";
  @SerializedName(SERIALIZED_NAME_NETLOC_STATE_PROV)
  private String netlocStateProv;

  public static final String SERIALIZED_NAME_NETLOC_UUID = "netloc_uuid";
  @SerializedName(SERIALIZED_NAME_NETLOC_UUID)
  private String netlocUuid;

  public Qspmdatamanagerv3UpdateNetLocRequest() {
  }

  public Qspmdatamanagerv3UpdateNetLocRequest netlocCity(String netlocCity) {
    this.netlocCity = netlocCity;
    return this;
  }

   /**
   * Get netlocCity
   * @return netlocCity
  **/
  @javax.annotation.Nullable
  public String getNetlocCity() {
    return netlocCity;
  }

  public void setNetlocCity(String netlocCity) {
    this.netlocCity = netlocCity;
  }


  public Qspmdatamanagerv3UpdateNetLocRequest netlocCountry(String netlocCountry) {
    this.netlocCountry = netlocCountry;
    return this;
  }

   /**
   * Get netlocCountry
   * @return netlocCountry
  **/
  @javax.annotation.Nullable
  public String getNetlocCountry() {
    return netlocCountry;
  }

  public void setNetlocCountry(String netlocCountry) {
    this.netlocCountry = netlocCountry;
  }


  public Qspmdatamanagerv3UpdateNetLocRequest netlocDataCenter(String netlocDataCenter) {
    this.netlocDataCenter = netlocDataCenter;
    return this;
  }

   /**
   * Get netlocDataCenter
   * @return netlocDataCenter
  **/
  @javax.annotation.Nullable
  public String getNetlocDataCenter() {
    return netlocDataCenter;
  }

  public void setNetlocDataCenter(String netlocDataCenter) {
    this.netlocDataCenter = netlocDataCenter;
  }


  public Qspmdatamanagerv3UpdateNetLocRequest netlocRegion(String netlocRegion) {
    this.netlocRegion = netlocRegion;
    return this;
  }

   /**
   * Get netlocRegion
   * @return netlocRegion
  **/
  @javax.annotation.Nullable
  public String getNetlocRegion() {
    return netlocRegion;
  }

  public void setNetlocRegion(String netlocRegion) {
    this.netlocRegion = netlocRegion;
  }


  public Qspmdatamanagerv3UpdateNetLocRequest netlocStateProv(String netlocStateProv) {
    this.netlocStateProv = netlocStateProv;
    return this;
  }

   /**
   * Get netlocStateProv
   * @return netlocStateProv
  **/
  @javax.annotation.Nullable
  public String getNetlocStateProv() {
    return netlocStateProv;
  }

  public void setNetlocStateProv(String netlocStateProv) {
    this.netlocStateProv = netlocStateProv;
  }


  public Qspmdatamanagerv3UpdateNetLocRequest netlocUuid(String netlocUuid) {
    this.netlocUuid = netlocUuid;
    return this;
  }

   /**
   * Get netlocUuid
   * @return netlocUuid
  **/
  @javax.annotation.Nullable
  public String getNetlocUuid() {
    return netlocUuid;
  }

  public void setNetlocUuid(String netlocUuid) {
    this.netlocUuid = netlocUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmdatamanagerv3UpdateNetLocRequest qspmdatamanagerv3UpdateNetLocRequest = (Qspmdatamanagerv3UpdateNetLocRequest) o;
    return Objects.equals(this.netlocCity, qspmdatamanagerv3UpdateNetLocRequest.netlocCity) &&
        Objects.equals(this.netlocCountry, qspmdatamanagerv3UpdateNetLocRequest.netlocCountry) &&
        Objects.equals(this.netlocDataCenter, qspmdatamanagerv3UpdateNetLocRequest.netlocDataCenter) &&
        Objects.equals(this.netlocRegion, qspmdatamanagerv3UpdateNetLocRequest.netlocRegion) &&
        Objects.equals(this.netlocStateProv, qspmdatamanagerv3UpdateNetLocRequest.netlocStateProv) &&
        Objects.equals(this.netlocUuid, qspmdatamanagerv3UpdateNetLocRequest.netlocUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netlocCity, netlocCountry, netlocDataCenter, netlocRegion, netlocStateProv, netlocUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmdatamanagerv3UpdateNetLocRequest {\n");
    sb.append("    netlocCity: ").append(toIndentedString(netlocCity)).append("\n");
    sb.append("    netlocCountry: ").append(toIndentedString(netlocCountry)).append("\n");
    sb.append("    netlocDataCenter: ").append(toIndentedString(netlocDataCenter)).append("\n");
    sb.append("    netlocRegion: ").append(toIndentedString(netlocRegion)).append("\n");
    sb.append("    netlocStateProv: ").append(toIndentedString(netlocStateProv)).append("\n");
    sb.append("    netlocUuid: ").append(toIndentedString(netlocUuid)).append("\n");
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
    openapiFields.add("netloc_city");
    openapiFields.add("netloc_country");
    openapiFields.add("netloc_data_center");
    openapiFields.add("netloc_region");
    openapiFields.add("netloc_state_prov");
    openapiFields.add("netloc_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmdatamanagerv3UpdateNetLocRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmdatamanagerv3UpdateNetLocRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmdatamanagerv3UpdateNetLocRequest is not found in the empty JSON string", Qspmdatamanagerv3UpdateNetLocRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmdatamanagerv3UpdateNetLocRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmdatamanagerv3UpdateNetLocRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("netloc_city") != null && !jsonObj.get("netloc_city").isJsonNull()) && !jsonObj.get("netloc_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_city").toString()));
      }
      if ((jsonObj.get("netloc_country") != null && !jsonObj.get("netloc_country").isJsonNull()) && !jsonObj.get("netloc_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_country").toString()));
      }
      if ((jsonObj.get("netloc_data_center") != null && !jsonObj.get("netloc_data_center").isJsonNull()) && !jsonObj.get("netloc_data_center").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_data_center` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_data_center").toString()));
      }
      if ((jsonObj.get("netloc_region") != null && !jsonObj.get("netloc_region").isJsonNull()) && !jsonObj.get("netloc_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_region").toString()));
      }
      if ((jsonObj.get("netloc_state_prov") != null && !jsonObj.get("netloc_state_prov").isJsonNull()) && !jsonObj.get("netloc_state_prov").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_state_prov` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_state_prov").toString()));
      }
      if ((jsonObj.get("netloc_uuid") != null && !jsonObj.get("netloc_uuid").isJsonNull()) && !jsonObj.get("netloc_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netloc_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netloc_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmdatamanagerv3UpdateNetLocRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmdatamanagerv3UpdateNetLocRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmdatamanagerv3UpdateNetLocRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmdatamanagerv3UpdateNetLocRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmdatamanagerv3UpdateNetLocRequest>() {
           @Override
           public void write(JsonWriter out, Qspmdatamanagerv3UpdateNetLocRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmdatamanagerv3UpdateNetLocRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmdatamanagerv3UpdateNetLocRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmdatamanagerv3UpdateNetLocRequest
  * @throws IOException if the JSON string is invalid with respect to Qspmdatamanagerv3UpdateNetLocRequest
  */
  public static Qspmdatamanagerv3UpdateNetLocRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmdatamanagerv3UpdateNetLocRequest.class);
  }

 /**
  * Convert an instance of Qspmdatamanagerv3UpdateNetLocRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

