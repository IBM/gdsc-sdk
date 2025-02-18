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
import com.ibm.gdsc.sdk.Schedulerv3ScheduledJobsFilter;
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

import com.ibm.gdsc.JSON;

/**
 * SearchScheduledJobsRequest message for Post v3/schedules/search api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3SearchScheduledJobsRequest {
  public static final String SERIALIZED_NAME_LIMIT = "Limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "Offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private Schedulerv3ScheduledJobsFilter filter;

  public Schedulerv3SearchScheduledJobsRequest() {
  }

  public Schedulerv3SearchScheduledJobsRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Optional: the max amount of rows to return for pagination.
   * @return limit
  **/
  @javax.annotation.Nullable
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public Schedulerv3SearchScheduledJobsRequest offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Optional: the amount to offset the rows by for pagination.
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public Schedulerv3SearchScheduledJobsRequest filter(Schedulerv3ScheduledJobsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public Schedulerv3ScheduledJobsFilter getFilter() {
    return filter;
  }

  public void setFilter(Schedulerv3ScheduledJobsFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3SearchScheduledJobsRequest schedulerv3SearchScheduledJobsRequest = (Schedulerv3SearchScheduledJobsRequest) o;
    return Objects.equals(this.limit, schedulerv3SearchScheduledJobsRequest.limit) &&
        Objects.equals(this.offset, schedulerv3SearchScheduledJobsRequest.offset) &&
        Objects.equals(this.filter, schedulerv3SearchScheduledJobsRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3SearchScheduledJobsRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("Limit");
    openapiFields.add("Offset");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3SearchScheduledJobsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3SearchScheduledJobsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3SearchScheduledJobsRequest is not found in the empty JSON string", Schedulerv3SearchScheduledJobsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3SearchScheduledJobsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3SearchScheduledJobsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        Schedulerv3ScheduledJobsFilter.validateJsonElement(jsonObj.get("filter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3SearchScheduledJobsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3SearchScheduledJobsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3SearchScheduledJobsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3SearchScheduledJobsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3SearchScheduledJobsRequest>() {
           @Override
           public void write(JsonWriter out, Schedulerv3SearchScheduledJobsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3SearchScheduledJobsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3SearchScheduledJobsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3SearchScheduledJobsRequest
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3SearchScheduledJobsRequest
  */
  public static Schedulerv3SearchScheduledJobsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3SearchScheduledJobsRequest.class);
  }

 /**
  * Convert an instance of Schedulerv3SearchScheduledJobsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

