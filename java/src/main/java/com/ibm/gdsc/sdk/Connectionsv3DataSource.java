/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
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
import com.ibm.gdsc.sdk.Connectionsv3ConnectorType;
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
 * Data source.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3DataSource {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LAST_USED = "last_used";
  @SerializedName(SERIALIZED_NAME_LAST_USED)
  private OffsetDateTime lastUsed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OTHER_TYPES = "other_types";
  @SerializedName(SERIALIZED_NAME_OTHER_TYPES)
  private List<String> otherTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STREAM_TYPE = "stream_type";
  @SerializedName(SERIALIZED_NAME_STREAM_TYPE)
  private String streamType;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<Connectionsv3ConnectorType> types = new ArrayList<>();

  public Connectionsv3DataSource() {
  }

  public Connectionsv3DataSource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the data source.
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Connectionsv3DataSource lastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

   /**
   * The last time it was used.
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
  }


  public Connectionsv3DataSource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the data source.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Connectionsv3DataSource otherTypes(List<String> otherTypes) {
    this.otherTypes = otherTypes;
    return this;
  }

  public Connectionsv3DataSource addOtherTypesItem(String otherTypesItem) {
    if (this.otherTypes == null) {
      this.otherTypes = new ArrayList<>();
    }
    this.otherTypes.add(otherTypesItem);
    return this;
  }

   /**
   * Other types.
   * @return otherTypes
  **/
  @javax.annotation.Nullable
  public List<String> getOtherTypes() {
    return otherTypes;
  }

  public void setOtherTypes(List<String> otherTypes) {
    this.otherTypes = otherTypes;
  }


  public Connectionsv3DataSource streamType(String streamType) {
    this.streamType = streamType;
    return this;
  }

   /**
   * The stream type of the data source.
   * @return streamType
  **/
  @javax.annotation.Nullable
  public String getStreamType() {
    return streamType;
  }

  public void setStreamType(String streamType) {
    this.streamType = streamType;
  }


  public Connectionsv3DataSource types(List<Connectionsv3ConnectorType> types) {
    this.types = types;
    return this;
  }

  public Connectionsv3DataSource addTypesItem(Connectionsv3ConnectorType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * The type of the environment.
   * @return types
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3ConnectorType> getTypes() {
    return types;
  }

  public void setTypes(List<Connectionsv3ConnectorType> types) {
    this.types = types;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3DataSource connectionsv3DataSource = (Connectionsv3DataSource) o;
    return Objects.equals(this.key, connectionsv3DataSource.key) &&
        Objects.equals(this.lastUsed, connectionsv3DataSource.lastUsed) &&
        Objects.equals(this.name, connectionsv3DataSource.name) &&
        Objects.equals(this.otherTypes, connectionsv3DataSource.otherTypes) &&
        Objects.equals(this.streamType, connectionsv3DataSource.streamType) &&
        Objects.equals(this.types, connectionsv3DataSource.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, lastUsed, name, otherTypes, streamType, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3DataSource {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherTypes: ").append(toIndentedString(otherTypes)).append("\n");
    sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("last_used");
    openapiFields.add("name");
    openapiFields.add("other_types");
    openapiFields.add("stream_type");
    openapiFields.add("types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3DataSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3DataSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3DataSource is not found in the empty JSON string", Connectionsv3DataSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3DataSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3DataSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("other_types") != null && !jsonObj.get("other_types").isJsonNull() && !jsonObj.get("other_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_types` to be an array in the JSON string but got `%s`", jsonObj.get("other_types").toString()));
      }
      if ((jsonObj.get("stream_type") != null && !jsonObj.get("stream_type").isJsonNull()) && !jsonObj.get("stream_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull() && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3DataSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3DataSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3DataSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3DataSource.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3DataSource>() {
           @Override
           public void write(JsonWriter out, Connectionsv3DataSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3DataSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3DataSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3DataSource
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3DataSource
  */
  public static Connectionsv3DataSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3DataSource.class);
  }

 /**
  * Convert an instance of Connectionsv3DataSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

