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
import com.ibm.security.guardium.Auditv3ActivityRecord;
import com.ibm.security.guardium.Auditv3FilterField;
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
 * GetActivityResponse returns the requested activity log records.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Auditv3GetActivityRecordsResponse {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Auditv3FilterField> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<Auditv3ActivityRecord> records = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_RECORDS = "total_records";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORDS)
  private String totalRecords;

  public Auditv3GetActivityRecordsResponse() {
  }

  public Auditv3GetActivityRecordsResponse filters(List<Auditv3FilterField> filters) {
    this.filters = filters;
    return this;
  }

  public Auditv3GetActivityRecordsResponse addFiltersItem(Auditv3FilterField filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * All of the eligible filters based on the passed in parameters.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Auditv3FilterField> getFilters() {
    return filters;
  }

  public void setFilters(List<Auditv3FilterField> filters) {
    this.filters = filters;
  }


  public Auditv3GetActivityRecordsResponse records(List<Auditv3ActivityRecord> records) {
    this.records = records;
    return this;
  }

  public Auditv3GetActivityRecordsResponse addRecordsItem(Auditv3ActivityRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * All of the activity log records based on the passed in parameters.
   * @return records
  **/
  @javax.annotation.Nullable
  public List<Auditv3ActivityRecord> getRecords() {
    return records;
  }

  public void setRecords(List<Auditv3ActivityRecord> records) {
    this.records = records;
  }


  public Auditv3GetActivityRecordsResponse totalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Total number of Activity records.
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  public String getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(String totalRecords) {
    this.totalRecords = totalRecords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auditv3GetActivityRecordsResponse auditv3GetActivityRecordsResponse = (Auditv3GetActivityRecordsResponse) o;
    return Objects.equals(this.filters, auditv3GetActivityRecordsResponse.filters) &&
        Objects.equals(this.records, auditv3GetActivityRecordsResponse.records) &&
        Objects.equals(this.totalRecords, auditv3GetActivityRecordsResponse.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, records, totalRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditv3GetActivityRecordsResponse {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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
    openapiFields.add("records");
    openapiFields.add("total_records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Auditv3GetActivityRecordsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Auditv3GetActivityRecordsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Auditv3GetActivityRecordsResponse is not found in the empty JSON string", Auditv3GetActivityRecordsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Auditv3GetActivityRecordsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Auditv3GetActivityRecordsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Auditv3FilterField.validateJsonElement(jsonArrayfilters.get(i));
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
            Auditv3ActivityRecord.validateJsonElement(jsonArrayrecords.get(i));
          };
        }
      }
      if ((jsonObj.get("total_records") != null && !jsonObj.get("total_records").isJsonNull()) && !jsonObj.get("total_records").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_records` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_records").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Auditv3GetActivityRecordsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Auditv3GetActivityRecordsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Auditv3GetActivityRecordsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Auditv3GetActivityRecordsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Auditv3GetActivityRecordsResponse>() {
           @Override
           public void write(JsonWriter out, Auditv3GetActivityRecordsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Auditv3GetActivityRecordsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Auditv3GetActivityRecordsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Auditv3GetActivityRecordsResponse
  * @throws IOException if the JSON string is invalid with respect to Auditv3GetActivityRecordsResponse
  */
  public static Auditv3GetActivityRecordsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Auditv3GetActivityRecordsResponse.class);
  }

 /**
  * Convert an instance of Auditv3GetActivityRecordsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

