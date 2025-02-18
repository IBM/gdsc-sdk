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
import com.ibm.gdsc.sdk.Schedulerv3FileFormat;
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
 * DeliveryMethod configures who receives the report and how they receive it.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3DeliveryMethod {
  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private Schedulerv3FileFormat fileFormat = Schedulerv3FileFormat.UNDEFINED_FORMAT;

  public static final String SERIALIZED_NAME_REPORT_TIME_ZONE = "report_time_zone";
  @SerializedName(SERIALIZED_NAME_REPORT_TIME_ZONE)
  private String reportTimeZone;

  public Schedulerv3DeliveryMethod() {
  }

  public Schedulerv3DeliveryMethod fileFormat(Schedulerv3FileFormat fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Get fileFormat
   * @return fileFormat
  **/
  @javax.annotation.Nullable
  public Schedulerv3FileFormat getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(Schedulerv3FileFormat fileFormat) {
    this.fileFormat = fileFormat;
  }


  public Schedulerv3DeliveryMethod reportTimeZone(String reportTimeZone) {
    this.reportTimeZone = reportTimeZone;
    return this;
  }

   /**
   * Optional: Preferred time zone to have all timestamps in.
   * @return reportTimeZone
  **/
  @javax.annotation.Nullable
  public String getReportTimeZone() {
    return reportTimeZone;
  }

  public void setReportTimeZone(String reportTimeZone) {
    this.reportTimeZone = reportTimeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3DeliveryMethod schedulerv3DeliveryMethod = (Schedulerv3DeliveryMethod) o;
    return Objects.equals(this.fileFormat, schedulerv3DeliveryMethod.fileFormat) &&
        Objects.equals(this.reportTimeZone, schedulerv3DeliveryMethod.reportTimeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileFormat, reportTimeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3DeliveryMethod {\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    reportTimeZone: ").append(toIndentedString(reportTimeZone)).append("\n");
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
    openapiFields.add("file_format");
    openapiFields.add("report_time_zone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3DeliveryMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3DeliveryMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3DeliveryMethod is not found in the empty JSON string", Schedulerv3DeliveryMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3DeliveryMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3DeliveryMethod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `file_format`
      if (jsonObj.get("file_format") != null && !jsonObj.get("file_format").isJsonNull()) {
        Schedulerv3FileFormat.validateJsonElement(jsonObj.get("file_format"));
      }
      if ((jsonObj.get("report_time_zone") != null && !jsonObj.get("report_time_zone").isJsonNull()) && !jsonObj.get("report_time_zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_time_zone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3DeliveryMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3DeliveryMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3DeliveryMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3DeliveryMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3DeliveryMethod>() {
           @Override
           public void write(JsonWriter out, Schedulerv3DeliveryMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3DeliveryMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3DeliveryMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3DeliveryMethod
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3DeliveryMethod
  */
  public static Schedulerv3DeliveryMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3DeliveryMethod.class);
  }

 /**
  * Convert an instance of Schedulerv3DeliveryMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

