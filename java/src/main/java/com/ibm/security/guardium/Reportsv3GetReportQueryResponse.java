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
import com.ibm.security.guardium.Reportsv3ReportDisplayLayout;
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
 * GetReportQueryResponse is the return type of the GetQueryByReportID() and GetQueryByReportDefinition() apis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3GetReportQueryResponse {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_REPORT_LAYOUT = "report_layout";
  @SerializedName(SERIALIZED_NAME_REPORT_LAYOUT)
  private Reportsv3ReportDisplayLayout reportLayout;

  public Reportsv3GetReportQueryResponse() {
  }

  public Reportsv3GetReportQueryResponse query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The report&#39;s query.
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public Reportsv3GetReportQueryResponse reportLayout(Reportsv3ReportDisplayLayout reportLayout) {
    this.reportLayout = reportLayout;
    return this;
  }

   /**
   * Get reportLayout
   * @return reportLayout
  **/
  @javax.annotation.Nullable
  public Reportsv3ReportDisplayLayout getReportLayout() {
    return reportLayout;
  }

  public void setReportLayout(Reportsv3ReportDisplayLayout reportLayout) {
    this.reportLayout = reportLayout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetReportQueryResponse reportsv3GetReportQueryResponse = (Reportsv3GetReportQueryResponse) o;
    return Objects.equals(this.query, reportsv3GetReportQueryResponse.query) &&
        Objects.equals(this.reportLayout, reportsv3GetReportQueryResponse.reportLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, reportLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetReportQueryResponse {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    reportLayout: ").append(toIndentedString(reportLayout)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("report_layout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetReportQueryResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetReportQueryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetReportQueryResponse is not found in the empty JSON string", Reportsv3GetReportQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetReportQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetReportQueryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // validate the optional field `report_layout`
      if (jsonObj.get("report_layout") != null && !jsonObj.get("report_layout").isJsonNull()) {
        Reportsv3ReportDisplayLayout.validateJsonElement(jsonObj.get("report_layout"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetReportQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetReportQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetReportQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetReportQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetReportQueryResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetReportQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetReportQueryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetReportQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetReportQueryResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetReportQueryResponse
  */
  public static Reportsv3GetReportQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetReportQueryResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetReportQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

