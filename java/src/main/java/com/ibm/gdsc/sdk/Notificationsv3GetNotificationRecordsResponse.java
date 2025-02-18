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
import com.ibm.gdsc.sdk.Notificationsv3FilterField;
import com.ibm.gdsc.sdk.Notificationsv3NotificationRecord;
import com.ibm.gdsc.sdk.RpcStatus;
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
 * Returns the notifications that match the specified filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3GetNotificationRecordsResponse {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Notificationsv3FilterField> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECORD_COUNT = "record_count";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Long recordCount;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<Notificationsv3NotificationRecord> records = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RpcStatus status;

  public Notificationsv3GetNotificationRecordsResponse() {
  }

  public Notificationsv3GetNotificationRecordsResponse filters(List<Notificationsv3FilterField> filters) {
    this.filters = filters;
    return this;
  }

  public Notificationsv3GetNotificationRecordsResponse addFiltersItem(Notificationsv3FilterField filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filter counts associated with the search.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Notificationsv3FilterField> getFilters() {
    return filters;
  }

  public void setFilters(List<Notificationsv3FilterField> filters) {
    this.filters = filters;
  }


  public Notificationsv3GetNotificationRecordsResponse recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Total number of records associated with the filter (ignoring Limit &amp; Offset).
   * @return recordCount
  **/
  @javax.annotation.Nullable
  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }


  public Notificationsv3GetNotificationRecordsResponse records(List<Notificationsv3NotificationRecord> records) {
    this.records = records;
    return this;
  }

  public Notificationsv3GetNotificationRecordsResponse addRecordsItem(Notificationsv3NotificationRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Records associated with the specified filter.
   * @return records
  **/
  @javax.annotation.Nullable
  public List<Notificationsv3NotificationRecord> getRecords() {
    return records;
  }

  public void setRecords(List<Notificationsv3NotificationRecord> records) {
    this.records = records;
  }


  public Notificationsv3GetNotificationRecordsResponse status(RpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RpcStatus getStatus() {
    return status;
  }

  public void setStatus(RpcStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsv3GetNotificationRecordsResponse notificationsv3GetNotificationRecordsResponse = (Notificationsv3GetNotificationRecordsResponse) o;
    return Objects.equals(this.filters, notificationsv3GetNotificationRecordsResponse.filters) &&
        Objects.equals(this.recordCount, notificationsv3GetNotificationRecordsResponse.recordCount) &&
        Objects.equals(this.records, notificationsv3GetNotificationRecordsResponse.records) &&
        Objects.equals(this.status, notificationsv3GetNotificationRecordsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, recordCount, records, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3GetNotificationRecordsResponse {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("record_count");
    openapiFields.add("records");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3GetNotificationRecordsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3GetNotificationRecordsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3GetNotificationRecordsResponse is not found in the empty JSON string", Notificationsv3GetNotificationRecordsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3GetNotificationRecordsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3GetNotificationRecordsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            Notificationsv3FilterField.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if (jsonObj.get("records") != null && !jsonObj.get("records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
          }

          // validate the optional field `records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            Notificationsv3NotificationRecord.validateJsonElement(jsonArrayrecords.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3GetNotificationRecordsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3GetNotificationRecordsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3GetNotificationRecordsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3GetNotificationRecordsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3GetNotificationRecordsResponse>() {
           @Override
           public void write(JsonWriter out, Notificationsv3GetNotificationRecordsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3GetNotificationRecordsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3GetNotificationRecordsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3GetNotificationRecordsResponse
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3GetNotificationRecordsResponse
  */
  public static Notificationsv3GetNotificationRecordsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3GetNotificationRecordsResponse.class);
  }

 /**
  * Convert an instance of Notificationsv3GetNotificationRecordsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

