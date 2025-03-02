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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Reportsv3Filter;

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

import org.openapitools.client.JSON;

/**
 * FilterHeaders is the column for which each of the filters can be selected.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3FilterHeaders {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Reportsv3Filter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADER_SEQUENCE = "header_sequence";
  @SerializedName(SERIALIZED_NAME_HEADER_SEQUENCE)
  private String headerSequence;

  public static final String SERIALIZED_NAME_NLS_TRANSLATION = "nls_translation";
  @SerializedName(SERIALIZED_NAME_NLS_TRANSLATION)
  private String nlsTranslation;

  public Reportsv3FilterHeaders() {
  }

  public Reportsv3FilterHeaders filters(List<Reportsv3Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Reportsv3FilterHeaders addFiltersItem(Reportsv3Filter filtersItem) {
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
  public List<Reportsv3Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Reportsv3Filter> filters) {
    this.filters = filters;
  }


  public Reportsv3FilterHeaders headerSequence(String headerSequence) {
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


  public Reportsv3FilterHeaders nlsTranslation(String nlsTranslation) {
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
    Reportsv3FilterHeaders reportsv3FilterHeaders = (Reportsv3FilterHeaders) o;
    return Objects.equals(this.filters, reportsv3FilterHeaders.filters) &&
        Objects.equals(this.headerSequence, reportsv3FilterHeaders.headerSequence) &&
        Objects.equals(this.nlsTranslation, reportsv3FilterHeaders.nlsTranslation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, headerSequence, nlsTranslation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3FilterHeaders {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3FilterHeaders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3FilterHeaders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3FilterHeaders is not found in the empty JSON string", Reportsv3FilterHeaders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3FilterHeaders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3FilterHeaders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Reportsv3Filter.validateJsonElement(jsonArrayfilters.get(i));
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
       if (!Reportsv3FilterHeaders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3FilterHeaders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3FilterHeaders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3FilterHeaders.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3FilterHeaders>() {
           @Override
           public void write(JsonWriter out, Reportsv3FilterHeaders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3FilterHeaders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3FilterHeaders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3FilterHeaders
  * @throws IOException if the JSON string is invalid with respect to Reportsv3FilterHeaders
  */
  public static Reportsv3FilterHeaders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3FilterHeaders.class);
  }

 /**
  * Convert an instance of Reportsv3FilterHeaders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

