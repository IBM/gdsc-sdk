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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Assetsv3ConnectionEdge;
import org.openapitools.client.model.Assetsv3CustomProperty;

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
 * Assetsv3SubscriptionVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3SubscriptionVertex {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ACCOUNT = "subscription_account";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ACCOUNT)
  private List<Assetsv3ConnectionEdge> subscriptionAccount = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Assetsv3SubscriptionVertex() {
  }

  public Assetsv3SubscriptionVertex duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Assetsv3SubscriptionVertex endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Assetsv3SubscriptionVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3SubscriptionVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
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


  public Assetsv3SubscriptionVertex name(String name) {
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


  public Assetsv3SubscriptionVertex resolutionKey(String resolutionKey) {
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


  public Assetsv3SubscriptionVertex startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Assetsv3SubscriptionVertex subscriptionAccount(List<Assetsv3ConnectionEdge> subscriptionAccount) {
    this.subscriptionAccount = subscriptionAccount;
    return this;
  }

  public Assetsv3SubscriptionVertex addSubscriptionAccountItem(Assetsv3ConnectionEdge subscriptionAccountItem) {
    if (this.subscriptionAccount == null) {
      this.subscriptionAccount = new ArrayList<>();
    }
    this.subscriptionAccount.add(subscriptionAccountItem);
    return this;
  }

   /**
   * Get subscriptionAccount
   * @return subscriptionAccount
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getSubscriptionAccount() {
    return subscriptionAccount;
  }

  public void setSubscriptionAccount(List<Assetsv3ConnectionEdge> subscriptionAccount) {
    this.subscriptionAccount = subscriptionAccount;
  }


  public Assetsv3SubscriptionVertex subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public Assetsv3SubscriptionVertex type(String type) {
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
    Assetsv3SubscriptionVertex assetsv3SubscriptionVertex = (Assetsv3SubscriptionVertex) o;
    return Objects.equals(this.duration, assetsv3SubscriptionVertex.duration) &&
        Objects.equals(this.endTime, assetsv3SubscriptionVertex.endTime) &&
        Objects.equals(this.extendedProperties, assetsv3SubscriptionVertex.extendedProperties) &&
        Objects.equals(this.name, assetsv3SubscriptionVertex.name) &&
        Objects.equals(this.resolutionKey, assetsv3SubscriptionVertex.resolutionKey) &&
        Objects.equals(this.startTime, assetsv3SubscriptionVertex.startTime) &&
        Objects.equals(this.subscriptionAccount, assetsv3SubscriptionVertex.subscriptionAccount) &&
        Objects.equals(this.subscriptionId, assetsv3SubscriptionVertex.subscriptionId) &&
        Objects.equals(this.type, assetsv3SubscriptionVertex.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, endTime, extendedProperties, name, resolutionKey, startTime, subscriptionAccount, subscriptionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3SubscriptionVertex {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subscriptionAccount: ").append(toIndentedString(subscriptionAccount)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("end_time");
    openapiFields.add("extended_properties");
    openapiFields.add("name");
    openapiFields.add("resolution_key");
    openapiFields.add("start_time");
    openapiFields.add("subscription_account");
    openapiFields.add("subscription_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3SubscriptionVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3SubscriptionVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3SubscriptionVertex is not found in the empty JSON string", Assetsv3SubscriptionVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3SubscriptionVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3SubscriptionVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
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
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      if (jsonObj.get("subscription_account") != null && !jsonObj.get("subscription_account").isJsonNull()) {
        JsonArray jsonArraysubscriptionAccount = jsonObj.getAsJsonArray("subscription_account");
        if (jsonArraysubscriptionAccount != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscription_account").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscription_account` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_account").toString()));
          }

          // validate the optional field `subscription_account` (array)
          for (int i = 0; i < jsonArraysubscriptionAccount.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraysubscriptionAccount.get(i));
          };
        }
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3SubscriptionVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3SubscriptionVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3SubscriptionVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3SubscriptionVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3SubscriptionVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3SubscriptionVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3SubscriptionVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3SubscriptionVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3SubscriptionVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3SubscriptionVertex
  */
  public static Assetsv3SubscriptionVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3SubscriptionVertex.class);
  }

 /**
  * Convert an instance of Assetsv3SubscriptionVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

