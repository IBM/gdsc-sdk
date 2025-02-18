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
import com.ibm.gdsc.sdk.Reportsv3BriefReport;
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

import com.ibm.gdsc.JSON;

/**
 * GetReportSynopsisResponse containes a brief report and is the return type of GetReportSynopsis() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3GetReportSynopsisResponse {
  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private Reportsv3BriefReport report;

  public Reportsv3GetReportSynopsisResponse() {
  }

  public Reportsv3GetReportSynopsisResponse report(Reportsv3BriefReport report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @javax.annotation.Nullable
  public Reportsv3BriefReport getReport() {
    return report;
  }

  public void setReport(Reportsv3BriefReport report) {
    this.report = report;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetReportSynopsisResponse reportsv3GetReportSynopsisResponse = (Reportsv3GetReportSynopsisResponse) o;
    return Objects.equals(this.report, reportsv3GetReportSynopsisResponse.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetReportSynopsisResponse {\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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
    openapiFields.add("report");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetReportSynopsisResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetReportSynopsisResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetReportSynopsisResponse is not found in the empty JSON string", Reportsv3GetReportSynopsisResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetReportSynopsisResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetReportSynopsisResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `report`
      if (jsonObj.get("report") != null && !jsonObj.get("report").isJsonNull()) {
        Reportsv3BriefReport.validateJsonElement(jsonObj.get("report"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetReportSynopsisResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetReportSynopsisResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetReportSynopsisResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetReportSynopsisResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetReportSynopsisResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetReportSynopsisResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetReportSynopsisResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetReportSynopsisResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetReportSynopsisResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetReportSynopsisResponse
  */
  public static Reportsv3GetReportSynopsisResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetReportSynopsisResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetReportSynopsisResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

