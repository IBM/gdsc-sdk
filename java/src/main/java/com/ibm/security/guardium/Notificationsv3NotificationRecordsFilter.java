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
import com.ibm.security.guardium.NotificationRecordsFilterStateFilter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * NotificationRecordsFilter includes all fields used to filter the set of desired notification records returned. by a GET request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3NotificationRecordsFilter {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_ORIGIN_DATA = "origin_data";
  @SerializedName(SERIALIZED_NAME_ORIGIN_DATA)
  private String originData;

  public static final String SERIALIZED_NAME_ORIGINS = "origins";
  @SerializedName(SERIALIZED_NAME_ORIGINS)
  private List<String> origins = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private NotificationRecordsFilterStateFilter state = NotificationRecordsFilterStateFilter.INCLUDE_ALL;

  public Notificationsv3NotificationRecordsFilter() {
  }

  public Notificationsv3NotificationRecordsFilter endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Return records created before this time (&lt;).
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Notificationsv3NotificationRecordsFilter limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The max amount of rows to return for this single query.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public Notificationsv3NotificationRecordsFilter originData(String originData) {
    this.originData = originData;
    return this;
  }

   /**
   * Only return record that with the specified origin_data.
   * @return originData
  **/
  @javax.annotation.Nullable
  public String getOriginData() {
    return originData;
  }

  public void setOriginData(String originData) {
    this.originData = originData;
  }


  public Notificationsv3NotificationRecordsFilter origins(List<String> origins) {
    this.origins = origins;
    return this;
  }

  public Notificationsv3NotificationRecordsFilter addOriginsItem(String originsItem) {
    if (this.origins == null) {
      this.origins = new ArrayList<>();
    }
    this.origins.add(originsItem);
    return this;
  }

   /**
   * Only return record that includes the specified origins.
   * @return origins
  **/
  @javax.annotation.Nullable
  public List<String> getOrigins() {
    return origins;
  }

  public void setOrigins(List<String> origins) {
    this.origins = origins;
  }


  public Notificationsv3NotificationRecordsFilter startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Return records created at this time or later (&gt;&#x3D;).
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Notificationsv3NotificationRecordsFilter state(NotificationRecordsFilterStateFilter state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public NotificationRecordsFilterStateFilter getState() {
    return state;
  }

  public void setState(NotificationRecordsFilterStateFilter state) {
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
    Notificationsv3NotificationRecordsFilter notificationsv3NotificationRecordsFilter = (Notificationsv3NotificationRecordsFilter) o;
    return Objects.equals(this.endTime, notificationsv3NotificationRecordsFilter.endTime) &&
        Objects.equals(this.limit, notificationsv3NotificationRecordsFilter.limit) &&
        Objects.equals(this.originData, notificationsv3NotificationRecordsFilter.originData) &&
        Objects.equals(this.origins, notificationsv3NotificationRecordsFilter.origins) &&
        Objects.equals(this.startTime, notificationsv3NotificationRecordsFilter.startTime) &&
        Objects.equals(this.state, notificationsv3NotificationRecordsFilter.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, limit, originData, origins, startTime, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3NotificationRecordsFilter {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    originData: ").append(toIndentedString(originData)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("limit");
    openapiFields.add("origin_data");
    openapiFields.add("origins");
    openapiFields.add("start_time");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3NotificationRecordsFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3NotificationRecordsFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3NotificationRecordsFilter is not found in the empty JSON string", Notificationsv3NotificationRecordsFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3NotificationRecordsFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3NotificationRecordsFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("origin_data") != null && !jsonObj.get("origin_data").isJsonNull()) && !jsonObj.get("origin_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_data").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("origins") != null && !jsonObj.get("origins").isJsonNull() && !jsonObj.get("origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `origins` to be an array in the JSON string but got `%s`", jsonObj.get("origins").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        NotificationRecordsFilterStateFilter.validateJsonElement(jsonObj.get("state"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3NotificationRecordsFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3NotificationRecordsFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3NotificationRecordsFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3NotificationRecordsFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3NotificationRecordsFilter>() {
           @Override
           public void write(JsonWriter out, Notificationsv3NotificationRecordsFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3NotificationRecordsFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3NotificationRecordsFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3NotificationRecordsFilter
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3NotificationRecordsFilter
  */
  public static Notificationsv3NotificationRecordsFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3NotificationRecordsFilter.class);
  }

 /**
  * Convert an instance of Notificationsv3NotificationRecordsFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

