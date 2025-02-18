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
import com.ibm.gdsc.sdk.Reportsrunnerv3Filter;
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
 * Reportsrunnerv3FilterHeaders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsrunnerv3FilterHeaders {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Reportsrunnerv3Filter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADER_SEQUENCE = "header_sequence";
  @SerializedName(SERIALIZED_NAME_HEADER_SEQUENCE)
  private String headerSequence;

  public static final String SERIALIZED_NAME_NLS_TRANSLATION = "nls_translation";
  @SerializedName(SERIALIZED_NAME_NLS_TRANSLATION)
  private String nlsTranslation;

  public Reportsrunnerv3FilterHeaders() {
  }

  public Reportsrunnerv3FilterHeaders filters(List<Reportsrunnerv3Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Reportsrunnerv3FilterHeaders addFiltersItem(Reportsrunnerv3Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * A list of filters.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Reportsrunnerv3Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Reportsrunnerv3Filter> filters) {
    this.filters = filters;
  }


  public Reportsrunnerv3FilterHeaders headerSequence(String headerSequence) {
    this.headerSequence = headerSequence;
    return this;
  }

   /**
   * The filter header sequence corresponding to the header.
   * @return headerSequence
  **/
  @javax.annotation.Nullable
  public String getHeaderSequence() {
    return headerSequence;
  }

  public void setHeaderSequence(String headerSequence) {
    this.headerSequence = headerSequence;
  }


  public Reportsrunnerv3FilterHeaders nlsTranslation(String nlsTranslation) {
    this.nlsTranslation = nlsTranslation;
    return this;
  }

   /**
   * The translated header.
   * @return nlsTranslation
  **/
  @javax.annotation.Nullable
  public String getNlsTranslation() {
    return nlsTranslation;
  }

  public void setNlsTranslation(String nlsTranslation) {
    this.nlsTranslation = nlsTranslation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsrunnerv3FilterHeaders reportsrunnerv3FilterHeaders = (Reportsrunnerv3FilterHeaders) o;
    return Objects.equals(this.filters, reportsrunnerv3FilterHeaders.filters) &&
        Objects.equals(this.headerSequence, reportsrunnerv3FilterHeaders.headerSequence) &&
        Objects.equals(this.nlsTranslation, reportsrunnerv3FilterHeaders.nlsTranslation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, headerSequence, nlsTranslation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsrunnerv3FilterHeaders {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    headerSequence: ").append(toIndentedString(headerSequence)).append("\n");
    sb.append("    nlsTranslation: ").append(toIndentedString(nlsTranslation)).append("\n");
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
    openapiFields.add("header_sequence");
    openapiFields.add("nls_translation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsrunnerv3FilterHeaders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsrunnerv3FilterHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsrunnerv3FilterHeaders is not found in the empty JSON string", Reportsrunnerv3FilterHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsrunnerv3FilterHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsrunnerv3FilterHeaders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Reportsrunnerv3Filter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      if ((jsonObj.get("header_sequence") != null && !jsonObj.get("header_sequence").isJsonNull()) && !jsonObj.get("header_sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_sequence").toString()));
      }
      if ((jsonObj.get("nls_translation") != null && !jsonObj.get("nls_translation").isJsonNull()) && !jsonObj.get("nls_translation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nls_translation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nls_translation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsrunnerv3FilterHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsrunnerv3FilterHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsrunnerv3FilterHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsrunnerv3FilterHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsrunnerv3FilterHeaders>() {
           @Override
           public void write(JsonWriter out, Reportsrunnerv3FilterHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsrunnerv3FilterHeaders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsrunnerv3FilterHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsrunnerv3FilterHeaders
  * @throws IOException if the JSON string is invalid with respect to Reportsrunnerv3FilterHeaders
  */
  public static Reportsrunnerv3FilterHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsrunnerv3FilterHeaders.class);
  }

 /**
  * Convert an instance of Reportsrunnerv3FilterHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

