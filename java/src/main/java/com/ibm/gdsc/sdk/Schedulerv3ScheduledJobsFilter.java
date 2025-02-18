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
import com.ibm.gdsc.sdk.Schedulerv3ExecutionStatus;
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

import com.ibm.gdsc.JSON;

/**
 * ScheduledJobsFilter includes all fields used to filter the set of desired scheduled jobs returned.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3ScheduledJobsFilter {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private String enabled;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_IGNORE_ACL = "ignore_acl";
  @SerializedName(SERIALIZED_NAME_IGNORE_ACL)
  private Boolean ignoreAcl;

  public static final String SERIALIZED_NAME_NAME_FILTER = "name_filter";
  @SerializedName(SERIALIZED_NAME_NAME_FILTER)
  private List<String> nameFilter = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATUS_FILTER = "status_filter";
  @SerializedName(SERIALIZED_NAME_STATUS_FILTER)
  private List<Schedulerv3ExecutionStatus> statusFilter = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAG_FILTER = "tag_filter";
  @SerializedName(SERIALIZED_NAME_TAG_FILTER)
  private String tagFilter;

  public Schedulerv3ScheduledJobsFilter() {
  }

  public Schedulerv3ScheduledJobsFilter enabled(String enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Optional: Enabled or not.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }


  public Schedulerv3ScheduledJobsFilter endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Optional: Return records ending time.
   * @return endTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public Schedulerv3ScheduledJobsFilter ignoreAcl(Boolean ignoreAcl) {
    this.ignoreAcl = ignoreAcl;
    return this;
  }

   /**
   * Get ignoreAcl
   * @return ignoreAcl
  **/
  @javax.annotation.Nullable
  public Boolean getIgnoreAcl() {
    return ignoreAcl;
  }

  public void setIgnoreAcl(Boolean ignoreAcl) {
    this.ignoreAcl = ignoreAcl;
  }


  public Schedulerv3ScheduledJobsFilter nameFilter(List<String> nameFilter) {
    this.nameFilter = nameFilter;
    return this;
  }

  public Schedulerv3ScheduledJobsFilter addNameFilterItem(String nameFilterItem) {
    if (this.nameFilter == null) {
      this.nameFilter = new ArrayList<>();
    }
    this.nameFilter.add(nameFilterItem);
    return this;
  }

   /**
   * Optional: Filter by report name.
   * @return nameFilter
  **/
  @javax.annotation.Nullable
  public List<String> getNameFilter() {
    return nameFilter;
  }

  public void setNameFilter(List<String> nameFilter) {
    this.nameFilter = nameFilter;
  }


  public Schedulerv3ScheduledJobsFilter startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Optional: Return records starting at this time (&gt;&#x3D;).
   * @return startTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public Schedulerv3ScheduledJobsFilter statusFilter(List<Schedulerv3ExecutionStatus> statusFilter) {
    this.statusFilter = statusFilter;
    return this;
  }

  public Schedulerv3ScheduledJobsFilter addStatusFilterItem(Schedulerv3ExecutionStatus statusFilterItem) {
    if (this.statusFilter == null) {
      this.statusFilter = new ArrayList<>();
    }
    this.statusFilter.add(statusFilterItem);
    return this;
  }

   /**
   * Optional: Filter by status.
   * @return statusFilter
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3ExecutionStatus> getStatusFilter() {
    return statusFilter;
  }

  public void setStatusFilter(List<Schedulerv3ExecutionStatus> statusFilter) {
    this.statusFilter = statusFilter;
  }


  public Schedulerv3ScheduledJobsFilter tagFilter(String tagFilter) {
    this.tagFilter = tagFilter;
    return this;
  }

   /**
   * Optional: Filter by tags.
   * @return tagFilter
  **/
  @javax.annotation.Nullable
  public String getTagFilter() {
    return tagFilter;
  }

  public void setTagFilter(String tagFilter) {
    this.tagFilter = tagFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3ScheduledJobsFilter schedulerv3ScheduledJobsFilter = (Schedulerv3ScheduledJobsFilter) o;
    return Objects.equals(this.enabled, schedulerv3ScheduledJobsFilter.enabled) &&
        Objects.equals(this.endTime, schedulerv3ScheduledJobsFilter.endTime) &&
        Objects.equals(this.ignoreAcl, schedulerv3ScheduledJobsFilter.ignoreAcl) &&
        Objects.equals(this.nameFilter, schedulerv3ScheduledJobsFilter.nameFilter) &&
        Objects.equals(this.startTime, schedulerv3ScheduledJobsFilter.startTime) &&
        Objects.equals(this.statusFilter, schedulerv3ScheduledJobsFilter.statusFilter) &&
        Objects.equals(this.tagFilter, schedulerv3ScheduledJobsFilter.tagFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, endTime, ignoreAcl, nameFilter, startTime, statusFilter, tagFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3ScheduledJobsFilter {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ignoreAcl: ").append(toIndentedString(ignoreAcl)).append("\n");
    sb.append("    nameFilter: ").append(toIndentedString(nameFilter)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    statusFilter: ").append(toIndentedString(statusFilter)).append("\n");
    sb.append("    tagFilter: ").append(toIndentedString(tagFilter)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("end_time");
    openapiFields.add("ignore_acl");
    openapiFields.add("name_filter");
    openapiFields.add("start_time");
    openapiFields.add("status_filter");
    openapiFields.add("tag_filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3ScheduledJobsFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3ScheduledJobsFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3ScheduledJobsFilter is not found in the empty JSON string", Schedulerv3ScheduledJobsFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3ScheduledJobsFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3ScheduledJobsFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("enabled") != null && !jsonObj.get("enabled").isJsonNull()) && !jsonObj.get("enabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enabled").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("name_filter") != null && !jsonObj.get("name_filter").isJsonNull() && !jsonObj.get("name_filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_filter` to be an array in the JSON string but got `%s`", jsonObj.get("name_filter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status_filter") != null && !jsonObj.get("status_filter").isJsonNull() && !jsonObj.get("status_filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_filter` to be an array in the JSON string but got `%s`", jsonObj.get("status_filter").toString()));
      }
      if ((jsonObj.get("tag_filter") != null && !jsonObj.get("tag_filter").isJsonNull()) && !jsonObj.get("tag_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_filter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3ScheduledJobsFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3ScheduledJobsFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3ScheduledJobsFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3ScheduledJobsFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3ScheduledJobsFilter>() {
           @Override
           public void write(JsonWriter out, Schedulerv3ScheduledJobsFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3ScheduledJobsFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3ScheduledJobsFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3ScheduledJobsFilter
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3ScheduledJobsFilter
  */
  public static Schedulerv3ScheduledJobsFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3ScheduledJobsFilter.class);
  }

 /**
  * Convert an instance of Schedulerv3ScheduledJobsFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

