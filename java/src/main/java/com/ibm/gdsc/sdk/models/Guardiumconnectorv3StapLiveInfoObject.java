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

import com.ibm.gdsc.sdk.JSON;

/**
 * Additional information about S-TAP liveliness.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3StapLiveInfoObject {
  public static final String SERIALIZED_NAME_HAS_EVENT = "has_event";
  @SerializedName(SERIALIZED_NAME_HAS_EVENT)
  private Boolean hasEvent;

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  private Integer healthStatus;

  public static final String SERIALIZED_NAME_LIVELINESS_STATE = "liveliness_state";
  @SerializedName(SERIALIZED_NAME_LIVELINESS_STATE)
  private String livelinessState;

  public static final String SERIALIZED_NAME_STAP = "stap";
  @SerializedName(SERIALIZED_NAME_STAP)
  private String stap;

  public Guardiumconnectorv3StapLiveInfoObject() {
  }

  public Guardiumconnectorv3StapLiveInfoObject hasEvent(Boolean hasEvent) {
    this.hasEvent = hasEvent;
    return this;
  }

   /**
   * Event flag.
   * @return hasEvent
  **/
  @javax.annotation.Nullable
  public Boolean getHasEvent() {
    return hasEvent;
  }

  public void setHasEvent(Boolean hasEvent) {
    this.hasEvent = hasEvent;
  }


  public Guardiumconnectorv3StapLiveInfoObject healthStatus(Integer healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Health status.
   * @return healthStatus
  **/
  @javax.annotation.Nullable
  public Integer getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(Integer healthStatus) {
    this.healthStatus = healthStatus;
  }


  public Guardiumconnectorv3StapLiveInfoObject livelinessState(String livelinessState) {
    this.livelinessState = livelinessState;
    return this;
  }

   /**
   * Liveliness state.
   * @return livelinessState
  **/
  @javax.annotation.Nullable
  public String getLivelinessState() {
    return livelinessState;
  }

  public void setLivelinessState(String livelinessState) {
    this.livelinessState = livelinessState;
  }


  public Guardiumconnectorv3StapLiveInfoObject stap(String stap) {
    this.stap = stap;
    return this;
  }

   /**
   * S-TAP host name or IP address.
   * @return stap
  **/
  @javax.annotation.Nullable
  public String getStap() {
    return stap;
  }

  public void setStap(String stap) {
    this.stap = stap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3StapLiveInfoObject guardiumconnectorv3StapLiveInfoObject = (Guardiumconnectorv3StapLiveInfoObject) o;
    return Objects.equals(this.hasEvent, guardiumconnectorv3StapLiveInfoObject.hasEvent) &&
        Objects.equals(this.healthStatus, guardiumconnectorv3StapLiveInfoObject.healthStatus) &&
        Objects.equals(this.livelinessState, guardiumconnectorv3StapLiveInfoObject.livelinessState) &&
        Objects.equals(this.stap, guardiumconnectorv3StapLiveInfoObject.stap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasEvent, healthStatus, livelinessState, stap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3StapLiveInfoObject {\n");
    sb.append("    hasEvent: ").append(toIndentedString(hasEvent)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    livelinessState: ").append(toIndentedString(livelinessState)).append("\n");
    sb.append("    stap: ").append(toIndentedString(stap)).append("\n");
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
    openapiFields.add("has_event");
    openapiFields.add("health_status");
    openapiFields.add("liveliness_state");
    openapiFields.add("stap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3StapLiveInfoObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3StapLiveInfoObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3StapLiveInfoObject is not found in the empty JSON string", Guardiumconnectorv3StapLiveInfoObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3StapLiveInfoObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3StapLiveInfoObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("liveliness_state") != null && !jsonObj.get("liveliness_state").isJsonNull()) && !jsonObj.get("liveliness_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liveliness_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liveliness_state").toString()));
      }
      if ((jsonObj.get("stap") != null && !jsonObj.get("stap").isJsonNull()) && !jsonObj.get("stap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stap").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3StapLiveInfoObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3StapLiveInfoObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3StapLiveInfoObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3StapLiveInfoObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3StapLiveInfoObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3StapLiveInfoObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3StapLiveInfoObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3StapLiveInfoObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3StapLiveInfoObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3StapLiveInfoObject
  */
  public static Guardiumconnectorv3StapLiveInfoObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3StapLiveInfoObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3StapLiveInfoObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

