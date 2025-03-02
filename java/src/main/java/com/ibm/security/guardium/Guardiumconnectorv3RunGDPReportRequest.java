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
import com.ibm.security.guardium.Guardiumconnectorv3GDPReportParameter;
import com.ibm.security.guardium.RunGDPReportRequestSortOrder;
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
 * Runs specified report.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3RunGDPReportRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_MAX_FETCH_SIZE = "max_fetch_size";
  @SerializedName(SERIALIZED_NAME_MAX_FETCH_SIZE)
  private Integer maxFetchSize;

  public static final String SERIALIZED_NAME_REPORT_NAME = "report_name";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "report_parameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private List<Guardiumconnectorv3GDPReportParameter> reportParameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT_COLUMN = "sort_column";
  @SerializedName(SERIALIZED_NAME_SORT_COLUMN)
  private String sortColumn;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sort_order";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private RunGDPReportRequestSortOrder sortOrder = RunGDPReportRequestSortOrder.ACS;

  public static final String SERIALIZED_NAME_START_FROM = "start_from";
  @SerializedName(SERIALIZED_NAME_START_FROM)
  private Integer startFrom;

  public Guardiumconnectorv3RunGDPReportRequest() {
  }

  public Guardiumconnectorv3RunGDPReportRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * Central Manager ID.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Guardiumconnectorv3RunGDPReportRequest maxFetchSize(Integer maxFetchSize) {
    this.maxFetchSize = maxFetchSize;
    return this;
  }

   /**
   * Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can&#39;t be larger than the configured maximum number of rows for CSV export on specified central manager.
   * @return maxFetchSize
  **/
  @javax.annotation.Nullable
  public Integer getMaxFetchSize() {
    return maxFetchSize;
  }

  public void setMaxFetchSize(Integer maxFetchSize) {
    this.maxFetchSize = maxFetchSize;
  }


  public Guardiumconnectorv3RunGDPReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the report.
   * @return reportName
  **/
  @javax.annotation.Nullable
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public Guardiumconnectorv3RunGDPReportRequest reportParameters(List<Guardiumconnectorv3GDPReportParameter> reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public Guardiumconnectorv3RunGDPReportRequest addReportParametersItem(Guardiumconnectorv3GDPReportParameter reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Report parameters.
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3GDPReportParameter> getReportParameters() {
    return reportParameters;
  }

  public void setReportParameters(List<Guardiumconnectorv3GDPReportParameter> reportParameters) {
    this.reportParameters = reportParameters;
  }


  public Guardiumconnectorv3RunGDPReportRequest sortColumn(String sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

   /**
   * Column to sort on if not specified returns rows in default sort order of the report.
   * @return sortColumn
  **/
  @javax.annotation.Nullable
  public String getSortColumn() {
    return sortColumn;
  }

  public void setSortColumn(String sortColumn) {
    this.sortColumn = sortColumn;
  }


  public Guardiumconnectorv3RunGDPReportRequest sortOrder(RunGDPReportRequestSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public RunGDPReportRequestSortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(RunGDPReportRequestSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }


  public Guardiumconnectorv3RunGDPReportRequest startFrom(Integer startFrom) {
    this.startFrom = startFrom;
    return this;
  }

   /**
   * Result row index to retrieve from if not specified returns results from the beginning.
   * @return startFrom
  **/
  @javax.annotation.Nullable
  public Integer getStartFrom() {
    return startFrom;
  }

  public void setStartFrom(Integer startFrom) {
    this.startFrom = startFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3RunGDPReportRequest guardiumconnectorv3RunGDPReportRequest = (Guardiumconnectorv3RunGDPReportRequest) o;
    return Objects.equals(this.centralManagerId, guardiumconnectorv3RunGDPReportRequest.centralManagerId) &&
        Objects.equals(this.maxFetchSize, guardiumconnectorv3RunGDPReportRequest.maxFetchSize) &&
        Objects.equals(this.reportName, guardiumconnectorv3RunGDPReportRequest.reportName) &&
        Objects.equals(this.reportParameters, guardiumconnectorv3RunGDPReportRequest.reportParameters) &&
        Objects.equals(this.sortColumn, guardiumconnectorv3RunGDPReportRequest.sortColumn) &&
        Objects.equals(this.sortOrder, guardiumconnectorv3RunGDPReportRequest.sortOrder) &&
        Objects.equals(this.startFrom, guardiumconnectorv3RunGDPReportRequest.startFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, maxFetchSize, reportName, reportParameters, sortColumn, sortOrder, startFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3RunGDPReportRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    maxFetchSize: ").append(toIndentedString(maxFetchSize)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
    sb.append("    sortColumn: ").append(toIndentedString(sortColumn)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    startFrom: ").append(toIndentedString(startFrom)).append("\n");
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
    openapiFields.add("central_manager_id");
    openapiFields.add("max_fetch_size");
    openapiFields.add("report_name");
    openapiFields.add("report_parameters");
    openapiFields.add("sort_column");
    openapiFields.add("sort_order");
    openapiFields.add("start_from");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3RunGDPReportRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3RunGDPReportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3RunGDPReportRequest is not found in the empty JSON string", Guardiumconnectorv3RunGDPReportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3RunGDPReportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3RunGDPReportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if ((jsonObj.get("report_name") != null && !jsonObj.get("report_name").isJsonNull()) && !jsonObj.get("report_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_name").toString()));
      }
      if (jsonObj.get("report_parameters") != null && !jsonObj.get("report_parameters").isJsonNull()) {
        JsonArray jsonArrayreportParameters = jsonObj.getAsJsonArray("report_parameters");
        if (jsonArrayreportParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("report_parameters").toString()));
          }

          // validate the optional field `report_parameters` (array)
          for (int i = 0; i < jsonArrayreportParameters.size(); i++) {
            Guardiumconnectorv3GDPReportParameter.validateJsonElement(jsonArrayreportParameters.get(i));
          };
        }
      }
      if ((jsonObj.get("sort_column") != null && !jsonObj.get("sort_column").isJsonNull()) && !jsonObj.get("sort_column").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_column` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_column").toString()));
      }
      // validate the optional field `sort_order`
      if (jsonObj.get("sort_order") != null && !jsonObj.get("sort_order").isJsonNull()) {
        RunGDPReportRequestSortOrder.validateJsonElement(jsonObj.get("sort_order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3RunGDPReportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3RunGDPReportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3RunGDPReportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3RunGDPReportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3RunGDPReportRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3RunGDPReportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3RunGDPReportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3RunGDPReportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3RunGDPReportRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3RunGDPReportRequest
  */
  public static Guardiumconnectorv3RunGDPReportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3RunGDPReportRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3RunGDPReportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

