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
import com.ibm.gdsc.sdk.Reportsv3TableNames;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Reportsv3CategoryVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3CategoryVersion {
  public static final String SERIALIZED_NAME_HEADER_MAP = "header_map";
  @SerializedName(SERIALIZED_NAME_HEADER_MAP)
  private Map<String, String> headerMap = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_SKIP_JOIN_ONLY = "skip_join_only";
  @SerializedName(SERIALIZED_NAME_SKIP_JOIN_ONLY)
  private Boolean skipJoinOnly;

  public static final String SERIALIZED_NAME_TABLE_MAP = "table_map";
  @SerializedName(SERIALIZED_NAME_TABLE_MAP)
  private Map<String, Reportsv3TableNames> tableMap = new HashMap<>();

  public Reportsv3CategoryVersion() {
  }

  public Reportsv3CategoryVersion headerMap(Map<String, String> headerMap) {
    this.headerMap = headerMap;
    return this;
  }

  public Reportsv3CategoryVersion putHeaderMapItem(String key, String headerMapItem) {
    if (this.headerMap == null) {
      this.headerMap = new HashMap<>();
    }
    this.headerMap.put(key, headerMapItem);
    return this;
  }

   /**
   * Get headerMap
   * @return headerMap
  **/
  @javax.annotation.Nullable
  public Map<String, String> getHeaderMap() {
    return headerMap;
  }

  public void setHeaderMap(Map<String, String> headerMap) {
    this.headerMap = headerMap;
  }


  public Reportsv3CategoryVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Reportsv3CategoryVersion primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public Reportsv3CategoryVersion skipJoinOnly(Boolean skipJoinOnly) {
    this.skipJoinOnly = skipJoinOnly;
    return this;
  }

   /**
   * Get skipJoinOnly
   * @return skipJoinOnly
  **/
  @javax.annotation.Nullable
  public Boolean getSkipJoinOnly() {
    return skipJoinOnly;
  }

  public void setSkipJoinOnly(Boolean skipJoinOnly) {
    this.skipJoinOnly = skipJoinOnly;
  }


  public Reportsv3CategoryVersion tableMap(Map<String, Reportsv3TableNames> tableMap) {
    this.tableMap = tableMap;
    return this;
  }

  public Reportsv3CategoryVersion putTableMapItem(String key, Reportsv3TableNames tableMapItem) {
    if (this.tableMap == null) {
      this.tableMap = new HashMap<>();
    }
    this.tableMap.put(key, tableMapItem);
    return this;
  }

   /**
   * Get tableMap
   * @return tableMap
  **/
  @javax.annotation.Nullable
  public Map<String, Reportsv3TableNames> getTableMap() {
    return tableMap;
  }

  public void setTableMap(Map<String, Reportsv3TableNames> tableMap) {
    this.tableMap = tableMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3CategoryVersion reportsv3CategoryVersion = (Reportsv3CategoryVersion) o;
    return Objects.equals(this.headerMap, reportsv3CategoryVersion.headerMap) &&
        Objects.equals(this.name, reportsv3CategoryVersion.name) &&
        Objects.equals(this.primary, reportsv3CategoryVersion.primary) &&
        Objects.equals(this.skipJoinOnly, reportsv3CategoryVersion.skipJoinOnly) &&
        Objects.equals(this.tableMap, reportsv3CategoryVersion.tableMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerMap, name, primary, skipJoinOnly, tableMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3CategoryVersion {\n");
    sb.append("    headerMap: ").append(toIndentedString(headerMap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    skipJoinOnly: ").append(toIndentedString(skipJoinOnly)).append("\n");
    sb.append("    tableMap: ").append(toIndentedString(tableMap)).append("\n");
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
    openapiFields.add("header_map");
    openapiFields.add("name");
    openapiFields.add("primary");
    openapiFields.add("skip_join_only");
    openapiFields.add("table_map");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3CategoryVersion
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3CategoryVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3CategoryVersion is not found in the empty JSON string", Reportsv3CategoryVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3CategoryVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3CategoryVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3CategoryVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3CategoryVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3CategoryVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3CategoryVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3CategoryVersion>() {
           @Override
           public void write(JsonWriter out, Reportsv3CategoryVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3CategoryVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3CategoryVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3CategoryVersion
  * @throws IOException if the JSON string is invalid with respect to Reportsv3CategoryVersion
  */
  public static Reportsv3CategoryVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3CategoryVersion.class);
  }

 /**
  * Convert an instance of Reportsv3CategoryVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

