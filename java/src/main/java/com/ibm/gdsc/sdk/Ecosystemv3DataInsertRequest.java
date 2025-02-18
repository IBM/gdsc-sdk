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
import com.ibm.gdsc.sdk.Ecosystemv3DataEntry;
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
 * Requires dataset name, fields and data to be inserted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3DataInsertRequest {
  public static final String SERIALIZED_NAME_DATASET_NAME = "dataset_name";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<Ecosystemv3DataEntry> entries = new ArrayList<>();

  public Ecosystemv3DataInsertRequest() {
  }

  public Ecosystemv3DataInsertRequest datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

   /**
   * Data set target name.
   * @return datasetName
  **/
  @javax.annotation.Nullable
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }


  public Ecosystemv3DataInsertRequest entries(List<Ecosystemv3DataEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Ecosystemv3DataInsertRequest addEntriesItem(Ecosystemv3DataEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Data set entries to insert.
   * @return entries
  **/
  @javax.annotation.Nullable
  public List<Ecosystemv3DataEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<Ecosystemv3DataEntry> entries) {
    this.entries = entries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3DataInsertRequest ecosystemv3DataInsertRequest = (Ecosystemv3DataInsertRequest) o;
    return Objects.equals(this.datasetName, ecosystemv3DataInsertRequest.datasetName) &&
        Objects.equals(this.entries, ecosystemv3DataInsertRequest.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3DataInsertRequest {\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
    openapiFields.add("dataset_name");
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3DataInsertRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3DataInsertRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3DataInsertRequest is not found in the empty JSON string", Ecosystemv3DataInsertRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3DataInsertRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3DataInsertRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dataset_name") != null && !jsonObj.get("dataset_name").isJsonNull()) && !jsonObj.get("dataset_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_name").toString()));
      }
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            Ecosystemv3DataEntry.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3DataInsertRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3DataInsertRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3DataInsertRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3DataInsertRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3DataInsertRequest>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3DataInsertRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3DataInsertRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3DataInsertRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3DataInsertRequest
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3DataInsertRequest
  */
  public static Ecosystemv3DataInsertRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3DataInsertRequest.class);
  }

 /**
  * Convert an instance of Ecosystemv3DataInsertRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

