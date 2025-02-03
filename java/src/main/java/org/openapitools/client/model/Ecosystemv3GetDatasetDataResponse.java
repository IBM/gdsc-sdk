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
import java.util.Arrays;
import org.openapitools.client.model.Workflowv3ReportResult;

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
 * GetDatasetDataResponse returns the data report on a dataset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3GetDatasetDataResponse {
  public static final String SERIALIZED_NAME_RECORD_COUNT = "record_count";
  @SerializedName(SERIALIZED_NAME_RECORD_COUNT)
  private Long recordCount;

  public static final String SERIALIZED_NAME_REPORT_RESULT = "report_result";
  @SerializedName(SERIALIZED_NAME_REPORT_RESULT)
  private Workflowv3ReportResult reportResult;

  public Ecosystemv3GetDatasetDataResponse() {
  }

  public Ecosystemv3GetDatasetDataResponse recordCount(Long recordCount) {
    this.recordCount = recordCount;
    return this;
  }

   /**
   * Total number of records associated with the filter.
   * @return recordCount
  **/
  @javax.annotation.Nullable
  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }


  public Ecosystemv3GetDatasetDataResponse reportResult(Workflowv3ReportResult reportResult) {
    this.reportResult = reportResult;
    return this;
  }

   /**
   * Get reportResult
   * @return reportResult
  **/
  @javax.annotation.Nullable
  public Workflowv3ReportResult getReportResult() {
    return reportResult;
  }

  public void setReportResult(Workflowv3ReportResult reportResult) {
    this.reportResult = reportResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3GetDatasetDataResponse ecosystemv3GetDatasetDataResponse = (Ecosystemv3GetDatasetDataResponse) o;
    return Objects.equals(this.recordCount, ecosystemv3GetDatasetDataResponse.recordCount) &&
        Objects.equals(this.reportResult, ecosystemv3GetDatasetDataResponse.reportResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordCount, reportResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3GetDatasetDataResponse {\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
    sb.append("    reportResult: ").append(toIndentedString(reportResult)).append("\n");
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
    openapiFields.add("record_count");
    openapiFields.add("report_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3GetDatasetDataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3GetDatasetDataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3GetDatasetDataResponse is not found in the empty JSON string", Ecosystemv3GetDatasetDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3GetDatasetDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3GetDatasetDataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `report_result`
      if (jsonObj.get("report_result") != null && !jsonObj.get("report_result").isJsonNull()) {
        Workflowv3ReportResult.validateJsonElement(jsonObj.get("report_result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3GetDatasetDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3GetDatasetDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3GetDatasetDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3GetDatasetDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3GetDatasetDataResponse>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3GetDatasetDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3GetDatasetDataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3GetDatasetDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3GetDatasetDataResponse
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3GetDatasetDataResponse
  */
  public static Ecosystemv3GetDatasetDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3GetDatasetDataResponse.class);
  }

 /**
  * Convert an instance of Ecosystemv3GetDatasetDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

