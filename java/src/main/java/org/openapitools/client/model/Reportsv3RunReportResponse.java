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
import org.openapitools.client.model.Reportsv3FilterHeaders;
import org.openapitools.client.model.Reportsv3ReportDisplayLayout;
import org.openapitools.client.model.Reportsv3ReportResult;

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
 * RunReportResponse is the return type of the RunReportByID(), RunImmediateReport() and Transpose() apis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3RunReportResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Reportsv3ReportResult> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_FACETS = "facets";
  @SerializedName(SERIALIZED_NAME_FACETS)
  private List<Reportsv3FilterHeaders> facets = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPORT_LAYOUT = "report_layout";
  @SerializedName(SERIALIZED_NAME_REPORT_LAYOUT)
  private Reportsv3ReportDisplayLayout reportLayout;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_ROWS = "total_number_of_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_ROWS)
  private Integer totalNumberOfRows;

  public Reportsv3RunReportResponse() {
  }

  public Reportsv3RunReportResponse data(List<Reportsv3ReportResult> data) {
    this.data = data;
    return this;
  }

  public Reportsv3RunReportResponse addDataItem(Reportsv3ReportResult dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Report data.
   * @return data
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportResult> getData() {
    return data;
  }

  public void setData(List<Reportsv3ReportResult> data) {
    this.data = data;
  }


  public Reportsv3RunReportResponse facets(List<Reportsv3FilterHeaders> facets) {
    this.facets = facets;
    return this;
  }

  public Reportsv3RunReportResponse addFacetsItem(Reportsv3FilterHeaders facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Facets.
   * @return facets
  **/
  @javax.annotation.Nullable
  public List<Reportsv3FilterHeaders> getFacets() {
    return facets;
  }

  public void setFacets(List<Reportsv3FilterHeaders> facets) {
    this.facets = facets;
  }


  public Reportsv3RunReportResponse reportLayout(Reportsv3ReportDisplayLayout reportLayout) {
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


  public Reportsv3RunReportResponse totalNumberOfRows(Integer totalNumberOfRows) {
    this.totalNumberOfRows = totalNumberOfRows;
    return this;
  }

   /**
   * Total Rows Count.
   * @return totalNumberOfRows
  **/
  @javax.annotation.Nullable
  public Integer getTotalNumberOfRows() {
    return totalNumberOfRows;
  }

  public void setTotalNumberOfRows(Integer totalNumberOfRows) {
    this.totalNumberOfRows = totalNumberOfRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3RunReportResponse reportsv3RunReportResponse = (Reportsv3RunReportResponse) o;
    return Objects.equals(this.data, reportsv3RunReportResponse.data) &&
        Objects.equals(this.facets, reportsv3RunReportResponse.facets) &&
        Objects.equals(this.reportLayout, reportsv3RunReportResponse.reportLayout) &&
        Objects.equals(this.totalNumberOfRows, reportsv3RunReportResponse.totalNumberOfRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, facets, reportLayout, totalNumberOfRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3RunReportResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    reportLayout: ").append(toIndentedString(reportLayout)).append("\n");
    sb.append("    totalNumberOfRows: ").append(toIndentedString(totalNumberOfRows)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("facets");
    openapiFields.add("report_layout");
    openapiFields.add("total_number_of_rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3RunReportResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3RunReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3RunReportResponse is not found in the empty JSON string", Reportsv3RunReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3RunReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3RunReportResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            Reportsv3ReportResult.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      if (jsonObj.get("facets") != null && !jsonObj.get("facets").isJsonNull()) {
        JsonArray jsonArrayfacets = jsonObj.getAsJsonArray("facets");
        if (jsonArrayfacets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("facets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `facets` to be an array in the JSON string but got `%s`", jsonObj.get("facets").toString()));
          }

          // validate the optional field `facets` (array)
          for (int i = 0; i < jsonArrayfacets.size(); i++) {
            Reportsv3FilterHeaders.validateJsonElement(jsonArrayfacets.get(i));
          };
        }
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
       if (!Reportsv3RunReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3RunReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3RunReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3RunReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3RunReportResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3RunReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3RunReportResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3RunReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3RunReportResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3RunReportResponse
  */
  public static Reportsv3RunReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3RunReportResponse.class);
  }

 /**
  * Convert an instance of Reportsv3RunReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

