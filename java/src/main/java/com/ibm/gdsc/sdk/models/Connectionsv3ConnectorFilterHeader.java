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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Connectionsv3ConnectorFilter;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Connector filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Connectionsv3ConnectorFilterHeader {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Connectionsv3ConnectorFilter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public Connectionsv3ConnectorFilterHeader() {
  }

  public Connectionsv3ConnectorFilterHeader filters(List<Connectionsv3ConnectorFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Connectionsv3ConnectorFilterHeader addFiltersItem(Connectionsv3ConnectorFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The number.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3ConnectorFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<Connectionsv3ConnectorFilter> filters) {
    this.filters = filters;
  }


  public Connectionsv3ConnectorFilterHeader header(String header) {
    this.header = header;
    return this;
  }

   /**
   * The header id.
   * @return header
  **/
  @javax.annotation.Nullable
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3ConnectorFilterHeader connectionsv3ConnectorFilterHeader = (Connectionsv3ConnectorFilterHeader) o;
    return Objects.equals(this.filters, connectionsv3ConnectorFilterHeader.filters) &&
        Objects.equals(this.header, connectionsv3ConnectorFilterHeader.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3ConnectorFilterHeader {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
    openapiFields.add("header");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3ConnectorFilterHeader
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3ConnectorFilterHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3ConnectorFilterHeader is not found in the empty JSON string", Connectionsv3ConnectorFilterHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3ConnectorFilterHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3ConnectorFilterHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Connectionsv3ConnectorFilter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if ((jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) && !jsonObj.get("header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3ConnectorFilterHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3ConnectorFilterHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3ConnectorFilterHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3ConnectorFilterHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3ConnectorFilterHeader>() {
           @Override
           public void write(JsonWriter out, Connectionsv3ConnectorFilterHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3ConnectorFilterHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3ConnectorFilterHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3ConnectorFilterHeader
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3ConnectorFilterHeader
  */
  public static Connectionsv3ConnectorFilterHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3ConnectorFilterHeader.class);
  }

 /**
  * Convert an instance of Connectionsv3ConnectorFilterHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

