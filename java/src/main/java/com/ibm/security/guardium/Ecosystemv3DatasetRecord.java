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
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.ibm.security.JSON;

/**
 * A dataset record indicates the dataset name and creation time.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3DatasetRecord {
  public static final String SERIALIZED_NAME_CREATION_TIME = "creation_time";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_DATA_COUNT = "data_count";
  @SerializedName(SERIALIZED_NAME_DATA_COUNT)
  private Long dataCount;

  public static final String SERIALIZED_NAME_DATASET_NAME = "dataset_name";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public Ecosystemv3DatasetRecord() {
  }

  public Ecosystemv3DatasetRecord creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The time the dataset definition was created.
   * @return creationTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Ecosystemv3DatasetRecord dataCount(Long dataCount) {
    this.dataCount = dataCount;
    return this;
  }

   /**
   * Row count on a dataset.
   * @return dataCount
  **/
  @javax.annotation.Nullable
  public Long getDataCount() {
    return dataCount;
  }

  public void setDataCount(Long dataCount) {
    this.dataCount = dataCount;
  }


  public Ecosystemv3DatasetRecord datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

   /**
   * Dataset name, unique,  \&quot;\&quot; for new records, required for update.
   * @return datasetName
  **/
  @javax.annotation.Nullable
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }


  public Ecosystemv3DatasetRecord editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Can this data set schema be edited.
   * @return editable
  **/
  @javax.annotation.Nullable
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  public Ecosystemv3DatasetRecord lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The last time the data is updated.
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3DatasetRecord ecosystemv3DatasetRecord = (Ecosystemv3DatasetRecord) o;
    return Objects.equals(this.creationTime, ecosystemv3DatasetRecord.creationTime) &&
        Objects.equals(this.dataCount, ecosystemv3DatasetRecord.dataCount) &&
        Objects.equals(this.datasetName, ecosystemv3DatasetRecord.datasetName) &&
        Objects.equals(this.editable, ecosystemv3DatasetRecord.editable) &&
        Objects.equals(this.lastUpdated, ecosystemv3DatasetRecord.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, dataCount, datasetName, editable, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3DatasetRecord {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    dataCount: ").append(toIndentedString(dataCount)).append("\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
    openapiFields.add("creation_time");
    openapiFields.add("data_count");
    openapiFields.add("dataset_name");
    openapiFields.add("editable");
    openapiFields.add("last_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3DatasetRecord
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3DatasetRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3DatasetRecord is not found in the empty JSON string", Ecosystemv3DatasetRecord.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3DatasetRecord.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3DatasetRecord` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataset_name") != null && !jsonObj.get("dataset_name").isJsonNull()) && !jsonObj.get("dataset_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3DatasetRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3DatasetRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3DatasetRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3DatasetRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3DatasetRecord>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3DatasetRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3DatasetRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3DatasetRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3DatasetRecord
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3DatasetRecord
  */
  public static Ecosystemv3DatasetRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3DatasetRecord.class);
  }

 /**
  * Convert an instance of Ecosystemv3DatasetRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

