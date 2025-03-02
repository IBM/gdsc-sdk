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
import com.ibm.security.guardium.Ecosystemv3ColumnDefinition;
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
 * DatasetDetail provides the detail of the definition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3DatasetDetail {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<Ecosystemv3ColumnDefinition> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_COUNT = "data_count";
  @SerializedName(SERIALIZED_NAME_DATA_COUNT)
  private Long dataCount;

  public static final String SERIALIZED_NAME_DATASET_NAME = "dataset_name";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;

  public Ecosystemv3DatasetDetail() {
  }

  public Ecosystemv3DatasetDetail columns(List<Ecosystemv3ColumnDefinition> columns) {
    this.columns = columns;
    return this;
  }

  public Ecosystemv3DatasetDetail addColumnsItem(Ecosystemv3ColumnDefinition columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns of the definition.
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<Ecosystemv3ColumnDefinition> getColumns() {
    return columns;
  }

  public void setColumns(List<Ecosystemv3ColumnDefinition> columns) {
    this.columns = columns;
  }


  public Ecosystemv3DatasetDetail dataCount(Long dataCount) {
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


  public Ecosystemv3DatasetDetail datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

   /**
   * The name of the definition.
   * @return datasetName
  **/
  @javax.annotation.Nullable
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }


  public Ecosystemv3DatasetDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description in detail.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Ecosystemv3DatasetDetail editable(Boolean editable) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3DatasetDetail ecosystemv3DatasetDetail = (Ecosystemv3DatasetDetail) o;
    return Objects.equals(this.columns, ecosystemv3DatasetDetail.columns) &&
        Objects.equals(this.dataCount, ecosystemv3DatasetDetail.dataCount) &&
        Objects.equals(this.datasetName, ecosystemv3DatasetDetail.datasetName) &&
        Objects.equals(this.description, ecosystemv3DatasetDetail.description) &&
        Objects.equals(this.editable, ecosystemv3DatasetDetail.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, dataCount, datasetName, description, editable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3DatasetDetail {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    dataCount: ").append(toIndentedString(dataCount)).append("\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("data_count");
    openapiFields.add("dataset_name");
    openapiFields.add("description");
    openapiFields.add("editable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3DatasetDetail
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3DatasetDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3DatasetDetail is not found in the empty JSON string", Ecosystemv3DatasetDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3DatasetDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3DatasetDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            Ecosystemv3ColumnDefinition.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if ((jsonObj.get("dataset_name") != null && !jsonObj.get("dataset_name").isJsonNull()) && !jsonObj.get("dataset_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3DatasetDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3DatasetDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3DatasetDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3DatasetDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3DatasetDetail>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3DatasetDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3DatasetDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3DatasetDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3DatasetDetail
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3DatasetDetail
  */
  public static Ecosystemv3DatasetDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3DatasetDetail.class);
  }

 /**
  * Convert an instance of Ecosystemv3DatasetDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

