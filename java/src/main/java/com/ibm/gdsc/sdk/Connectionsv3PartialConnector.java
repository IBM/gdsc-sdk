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
import com.ibm.gdsc.sdk.Connectionsv3ConnectorColumn;
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
 * Partial connector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3PartialConnector {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<Connectionsv3ConnectorColumn> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_RESPONSE = "last_response";
  @SerializedName(SERIALIZED_NAME_LAST_RESPONSE)
  private String lastResponse;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public Connectionsv3PartialConnector() {
  }

  public Connectionsv3PartialConnector columns(List<Connectionsv3ConnectorColumn> columns) {
    this.columns = columns;
    return this;
  }

  public Connectionsv3PartialConnector addColumnsItem(Connectionsv3ConnectorColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * The updated columns.
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3ConnectorColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<Connectionsv3ConnectorColumn> columns) {
    this.columns = columns;
  }


  public Connectionsv3PartialConnector id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the connector.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Connectionsv3PartialConnector lastResponse(String lastResponse) {
    this.lastResponse = lastResponse;
    return this;
  }

   /**
   * The heartbeat.
   * @return lastResponse
  **/
  @javax.annotation.Nullable
  public String getLastResponse() {
    return lastResponse;
  }

  public void setLastResponse(String lastResponse) {
    this.lastResponse = lastResponse;
  }


  public Connectionsv3PartialConnector tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Connectionsv3PartialConnector addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The updated tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3PartialConnector connectionsv3PartialConnector = (Connectionsv3PartialConnector) o;
    return Objects.equals(this.columns, connectionsv3PartialConnector.columns) &&
        Objects.equals(this.id, connectionsv3PartialConnector.id) &&
        Objects.equals(this.lastResponse, connectionsv3PartialConnector.lastResponse) &&
        Objects.equals(this.tags, connectionsv3PartialConnector.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, id, lastResponse, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3PartialConnector {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("last_response");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3PartialConnector
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3PartialConnector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3PartialConnector is not found in the empty JSON string", Connectionsv3PartialConnector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3PartialConnector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3PartialConnector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Connectionsv3ConnectorColumn.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("last_response") != null && !jsonObj.get("last_response").isJsonNull()) && !jsonObj.get("last_response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_response").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3PartialConnector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3PartialConnector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3PartialConnector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3PartialConnector.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3PartialConnector>() {
           @Override
           public void write(JsonWriter out, Connectionsv3PartialConnector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3PartialConnector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3PartialConnector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3PartialConnector
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3PartialConnector
  */
  public static Connectionsv3PartialConnector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3PartialConnector.class);
  }

 /**
  * Convert an instance of Connectionsv3PartialConnector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

