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
import com.ibm.security.guardium.Connectionsv3HeaderFilter;
import com.ibm.security.guardium.Connectionsv3OrderType;
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
 * Connectionsv3GetConnectionsWithFiltersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3GetConnectionsWithFiltersRequest {
  public static final String SERIALIZED_NAME_CALCULATE_FACETS = "calculate_facets";
  @SerializedName(SERIALIZED_NAME_CALCULATE_FACETS)
  private Boolean calculateFacets;

  public static final String SERIALIZED_NAME_CALCULATE_PRESET_STATS = "calculate_preset_stats";
  @SerializedName(SERIALIZED_NAME_CALCULATE_PRESET_STATS)
  private Boolean calculatePresetStats;

  public static final String SERIALIZED_NAME_CALCULATE_TOTAL = "calculate_total";
  @SerializedName(SERIALIZED_NAME_CALCULATE_TOTAL)
  private Boolean calculateTotal;

  public static final String SERIALIZED_NAME_FETCH_SIZE = "fetch_size";
  @SerializedName(SERIALIZED_NAME_FETCH_SIZE)
  private Integer fetchSize;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<Connectionsv3HeaderFilter> filters = new ArrayList<>();

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<String> headers = new ArrayList<>();

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Connectionsv3OrderType order = Connectionsv3OrderType.NONE;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search;

  public static final String SERIALIZED_NAME_SORT_BY = "sort_by";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public Connectionsv3GetConnectionsWithFiltersRequest() {
  }

  public Connectionsv3GetConnectionsWithFiltersRequest calculateFacets(Boolean calculateFacets) {
    this.calculateFacets = calculateFacets;
    return this;
  }

   /**
   * Whether or not to calculate facets.
   * @return calculateFacets
  **/
  @javax.annotation.Nullable
  public Boolean getCalculateFacets() {
    return calculateFacets;
  }

  public void setCalculateFacets(Boolean calculateFacets) {
    this.calculateFacets = calculateFacets;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest calculatePresetStats(Boolean calculatePresetStats) {
    this.calculatePresetStats = calculatePresetStats;
    return this;
  }

   /**
   * Whether or not to calculate preset stats.
   * @return calculatePresetStats
  **/
  @javax.annotation.Nullable
  public Boolean getCalculatePresetStats() {
    return calculatePresetStats;
  }

  public void setCalculatePresetStats(Boolean calculatePresetStats) {
    this.calculatePresetStats = calculatePresetStats;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest calculateTotal(Boolean calculateTotal) {
    this.calculateTotal = calculateTotal;
    return this;
  }

   /**
   * Whether or not to calculate total.
   * @return calculateTotal
  **/
  @javax.annotation.Nullable
  public Boolean getCalculateTotal() {
    return calculateTotal;
  }

  public void setCalculateTotal(Boolean calculateTotal) {
    this.calculateTotal = calculateTotal;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest fetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
    return this;
  }

   /**
   * The max amount of rows to return for pagination.
   * @return fetchSize
  **/
  @javax.annotation.Nullable
  public Integer getFetchSize() {
    return fetchSize;
  }

  public void setFetchSize(Integer fetchSize) {
    this.fetchSize = fetchSize;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest filters(List<Connectionsv3HeaderFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Connectionsv3GetConnectionsWithFiltersRequest addFiltersItem(Connectionsv3HeaderFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * The filters to apply.
   * @return filters
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3HeaderFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<Connectionsv3HeaderFilter> filters) {
    this.filters = filters;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest headers(List<String> headers) {
    this.headers = headers;
    return this;
  }

  public Connectionsv3GetConnectionsWithFiltersRequest addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * The headers used.
   * @return headers
  **/
  @javax.annotation.Nullable
  public List<String> getHeaders() {
    return headers;
  }

  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The amount to offset the rows by for pagination.
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest order(Connectionsv3OrderType order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Connectionsv3OrderType getOrder() {
    return order;
  }

  public void setOrder(Connectionsv3OrderType order) {
    this.order = order;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest search(String search) {
    this.search = search;
    return this;
  }

   /**
   * The text to search.
   * @return search
  **/
  @javax.annotation.Nullable
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }


  public Connectionsv3GetConnectionsWithFiltersRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * The header key used for sorting.
   * @return sortBy
  **/
  @javax.annotation.Nullable
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3GetConnectionsWithFiltersRequest connectionsv3GetConnectionsWithFiltersRequest = (Connectionsv3GetConnectionsWithFiltersRequest) o;
    return Objects.equals(this.calculateFacets, connectionsv3GetConnectionsWithFiltersRequest.calculateFacets) &&
        Objects.equals(this.calculatePresetStats, connectionsv3GetConnectionsWithFiltersRequest.calculatePresetStats) &&
        Objects.equals(this.calculateTotal, connectionsv3GetConnectionsWithFiltersRequest.calculateTotal) &&
        Objects.equals(this.fetchSize, connectionsv3GetConnectionsWithFiltersRequest.fetchSize) &&
        Objects.equals(this.filters, connectionsv3GetConnectionsWithFiltersRequest.filters) &&
        Objects.equals(this.headers, connectionsv3GetConnectionsWithFiltersRequest.headers) &&
        Objects.equals(this.offset, connectionsv3GetConnectionsWithFiltersRequest.offset) &&
        Objects.equals(this.order, connectionsv3GetConnectionsWithFiltersRequest.order) &&
        Objects.equals(this.search, connectionsv3GetConnectionsWithFiltersRequest.search) &&
        Objects.equals(this.sortBy, connectionsv3GetConnectionsWithFiltersRequest.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculateFacets, calculatePresetStats, calculateTotal, fetchSize, filters, headers, offset, order, search, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3GetConnectionsWithFiltersRequest {\n");
    sb.append("    calculateFacets: ").append(toIndentedString(calculateFacets)).append("\n");
    sb.append("    calculatePresetStats: ").append(toIndentedString(calculatePresetStats)).append("\n");
    sb.append("    calculateTotal: ").append(toIndentedString(calculateTotal)).append("\n");
    sb.append("    fetchSize: ").append(toIndentedString(fetchSize)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    openapiFields.add("calculate_facets");
    openapiFields.add("calculate_preset_stats");
    openapiFields.add("calculate_total");
    openapiFields.add("fetch_size");
    openapiFields.add("filters");
    openapiFields.add("headers");
    openapiFields.add("offset");
    openapiFields.add("order");
    openapiFields.add("search");
    openapiFields.add("sort_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3GetConnectionsWithFiltersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3GetConnectionsWithFiltersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3GetConnectionsWithFiltersRequest is not found in the empty JSON string", Connectionsv3GetConnectionsWithFiltersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3GetConnectionsWithFiltersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3GetConnectionsWithFiltersRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            Connectionsv3HeaderFilter.validateJsonElement(jsonArrayfilters.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull() && !jsonObj.get("headers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Connectionsv3OrderType.validateJsonElement(jsonObj.get("order"));
      }
      if ((jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) && !jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
      if ((jsonObj.get("sort_by") != null && !jsonObj.get("sort_by").isJsonNull()) && !jsonObj.get("sort_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3GetConnectionsWithFiltersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3GetConnectionsWithFiltersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3GetConnectionsWithFiltersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3GetConnectionsWithFiltersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3GetConnectionsWithFiltersRequest>() {
           @Override
           public void write(JsonWriter out, Connectionsv3GetConnectionsWithFiltersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3GetConnectionsWithFiltersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3GetConnectionsWithFiltersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3GetConnectionsWithFiltersRequest
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3GetConnectionsWithFiltersRequest
  */
  public static Connectionsv3GetConnectionsWithFiltersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3GetConnectionsWithFiltersRequest.class);
  }

 /**
  * Convert an instance of Connectionsv3GetConnectionsWithFiltersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

