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
 * TimestampMapping represents category related tables with level and timestamp.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3TimestampMapping {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_TIMESTAMP_HEADER_ID = "timestamp_header_id";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_HEADER_ID)
  private String timestampHeaderId;

  public static final String SERIALIZED_NAME_TIMESTAMP_HEADER_NAME = "timestamp_header_name";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_HEADER_NAME)
  private String timestampHeaderName;

  public Reportsv3TimestampMapping() {
  }

  public Reportsv3TimestampMapping level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Level of the table.
   * @return level
  **/
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public Reportsv3TimestampMapping tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Table name.
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public Reportsv3TimestampMapping timestampHeaderId(String timestampHeaderId) {
    this.timestampHeaderId = timestampHeaderId;
    return this;
  }

   /**
   * The header id.
   * @return timestampHeaderId
  **/
  @javax.annotation.Nullable
  public String getTimestampHeaderId() {
    return timestampHeaderId;
  }

  public void setTimestampHeaderId(String timestampHeaderId) {
    this.timestampHeaderId = timestampHeaderId;
  }


  public Reportsv3TimestampMapping timestampHeaderName(String timestampHeaderName) {
    this.timestampHeaderName = timestampHeaderName;
    return this;
  }

   /**
   * The table timestamp column.
   * @return timestampHeaderName
  **/
  @javax.annotation.Nullable
  public String getTimestampHeaderName() {
    return timestampHeaderName;
  }

  public void setTimestampHeaderName(String timestampHeaderName) {
    this.timestampHeaderName = timestampHeaderName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3TimestampMapping reportsv3TimestampMapping = (Reportsv3TimestampMapping) o;
    return Objects.equals(this.level, reportsv3TimestampMapping.level) &&
        Objects.equals(this.tableName, reportsv3TimestampMapping.tableName) &&
        Objects.equals(this.timestampHeaderId, reportsv3TimestampMapping.timestampHeaderId) &&
        Objects.equals(this.timestampHeaderName, reportsv3TimestampMapping.timestampHeaderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, tableName, timestampHeaderId, timestampHeaderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3TimestampMapping {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    timestampHeaderId: ").append(toIndentedString(timestampHeaderId)).append("\n");
    sb.append("    timestampHeaderName: ").append(toIndentedString(timestampHeaderName)).append("\n");
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
    openapiFields.add("level");
    openapiFields.add("table_name");
    openapiFields.add("timestamp_header_id");
    openapiFields.add("timestamp_header_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3TimestampMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3TimestampMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3TimestampMapping is not found in the empty JSON string", Reportsv3TimestampMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3TimestampMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3TimestampMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
      if ((jsonObj.get("timestamp_header_id") != null && !jsonObj.get("timestamp_header_id").isJsonNull()) && !jsonObj.get("timestamp_header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp_header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp_header_id").toString()));
      }
      if ((jsonObj.get("timestamp_header_name") != null && !jsonObj.get("timestamp_header_name").isJsonNull()) && !jsonObj.get("timestamp_header_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp_header_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp_header_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3TimestampMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3TimestampMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3TimestampMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3TimestampMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3TimestampMapping>() {
           @Override
           public void write(JsonWriter out, Reportsv3TimestampMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3TimestampMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3TimestampMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3TimestampMapping
  * @throws IOException if the JSON string is invalid with respect to Reportsv3TimestampMapping
  */
  public static Reportsv3TimestampMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3TimestampMapping.class);
  }

 /**
  * Convert an instance of Reportsv3TimestampMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

