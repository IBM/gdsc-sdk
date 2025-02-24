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
 * ReportArray is an array of report names for ScheduledJobSummaryResponse.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3ReportArray {
  public static final String SERIALIZED_NAME_REPORT_NAME = "report_name";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private List<String> reportName = new ArrayList<>();

  public Schedulerv3ReportArray() {
  }

  public Schedulerv3ReportArray reportName(List<String> reportName) {
    this.reportName = reportName;
    return this;
  }

  public Schedulerv3ReportArray addReportNameItem(String reportNameItem) {
    if (this.reportName == null) {
      this.reportName = new ArrayList<>();
    }
    this.reportName.add(reportNameItem);
    return this;
  }

   /**
   * Array of the name needed.
   * @return reportName
  **/
  @javax.annotation.Nullable
  public List<String> getReportName() {
    return reportName;
  }

  public void setReportName(List<String> reportName) {
    this.reportName = reportName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3ReportArray schedulerv3ReportArray = (Schedulerv3ReportArray) o;
    return Objects.equals(this.reportName, schedulerv3ReportArray.reportName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3ReportArray {\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
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
    openapiFields.add("report_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3ReportArray
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3ReportArray.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3ReportArray is not found in the empty JSON string", Schedulerv3ReportArray.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3ReportArray.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3ReportArray` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("report_name") != null && !jsonObj.get("report_name").isJsonNull() && !jsonObj.get("report_name").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_name` to be an array in the JSON string but got `%s`", jsonObj.get("report_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3ReportArray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3ReportArray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3ReportArray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3ReportArray.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3ReportArray>() {
           @Override
           public void write(JsonWriter out, Schedulerv3ReportArray value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3ReportArray read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3ReportArray given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3ReportArray
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3ReportArray
  */
  public static Schedulerv3ReportArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3ReportArray.class);
  }

 /**
  * Convert an instance of Schedulerv3ReportArray to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

