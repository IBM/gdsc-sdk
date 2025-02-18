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
import com.ibm.gdsc.sdk.Reportsv3ReportTag;
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
 * GetReportsTagsResponse containes all distinct tags list and is the return type of GetReportsTags() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3GetReportsTagsResponse {
  public static final String SERIALIZED_NAME_REPORT_TAGS = "report_tags";
  @SerializedName(SERIALIZED_NAME_REPORT_TAGS)
  private List<Reportsv3ReportTag> reportTags = new ArrayList<>();

  public Reportsv3GetReportsTagsResponse() {
  }

  public Reportsv3GetReportsTagsResponse reportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
    return this;
  }

  public Reportsv3GetReportsTagsResponse addReportTagsItem(Reportsv3ReportTag reportTagsItem) {
    if (this.reportTags == null) {
      this.reportTags = new ArrayList<>();
    }
    this.reportTags.add(reportTagsItem);
    return this;
  }

   /**
   * The reports tags.
   * @return reportTags
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportTag> getReportTags() {
    return reportTags;
  }

  public void setReportTags(List<Reportsv3ReportTag> reportTags) {
    this.reportTags = reportTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetReportsTagsResponse reportsv3GetReportsTagsResponse = (Reportsv3GetReportsTagsResponse) o;
    return Objects.equals(this.reportTags, reportsv3GetReportsTagsResponse.reportTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetReportsTagsResponse {\n");
    sb.append("    reportTags: ").append(toIndentedString(reportTags)).append("\n");
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
    openapiFields.add("report_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetReportsTagsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetReportsTagsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetReportsTagsResponse is not found in the empty JSON string", Reportsv3GetReportsTagsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetReportsTagsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetReportsTagsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("report_tags") != null && !jsonObj.get("report_tags").isJsonNull()) {
        JsonArray jsonArrayreportTags = jsonObj.getAsJsonArray("report_tags");
        if (jsonArrayreportTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("report_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `report_tags` to be an array in the JSON string but got `%s`", jsonObj.get("report_tags").toString()));
          }

          // validate the optional field `report_tags` (array)
          for (int i = 0; i < jsonArrayreportTags.size(); i++) {
            Reportsv3ReportTag.validateJsonElement(jsonArrayreportTags.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetReportsTagsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetReportsTagsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetReportsTagsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetReportsTagsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetReportsTagsResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetReportsTagsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetReportsTagsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetReportsTagsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetReportsTagsResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetReportsTagsResponse
  */
  public static Reportsv3GetReportsTagsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetReportsTagsResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetReportsTagsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

