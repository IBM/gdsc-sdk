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
import com.ibm.gdsc.sdk.Auditv3Filter;
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
 * A filter field indicates what types are able to be filtered on. It contains the overall name of the filter as well as the sub categories that can be filtered on.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Auditv3FilterField {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Auditv3Filter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public Auditv3FilterField() {
  }

  public Auditv3FilterField filters(List<Auditv3Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Auditv3FilterField addFiltersItem(Auditv3Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The filters that are eligable to be filtered on.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Auditv3Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Auditv3Filter> filters) {
    this.filters = filters;
  }


  public Auditv3FilterField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the filter field.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auditv3FilterField auditv3FilterField = (Auditv3FilterField) o;
    return Objects.equals(this.filters, auditv3FilterField.filters) &&
        Objects.equals(this.name, auditv3FilterField.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditv3FilterField {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Auditv3FilterField
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Auditv3FilterField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Auditv3FilterField is not found in the empty JSON string", Auditv3FilterField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Auditv3FilterField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Auditv3FilterField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Auditv3Filter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Auditv3FilterField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Auditv3FilterField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Auditv3FilterField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Auditv3FilterField.class));

       return (TypeAdapter<T>) new TypeAdapter<Auditv3FilterField>() {
           @Override
           public void write(JsonWriter out, Auditv3FilterField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Auditv3FilterField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Auditv3FilterField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Auditv3FilterField
  * @throws IOException if the JSON string is invalid with respect to Auditv3FilterField
  */
  public static Auditv3FilterField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Auditv3FilterField.class);
  }

 /**
  * Convert an instance of Auditv3FilterField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

