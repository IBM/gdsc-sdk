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
 * WorkingHoursPeriod represents a classification of hours of the day.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3WorkingHoursPeriod {
  public static final String SERIALIZED_NAME_CONTIGUOUS = "contiguous";
  @SerializedName(SERIALIZED_NAME_CONTIGUOUS)
  private Boolean contiguous;

  public static final String SERIALIZED_NAME_DATETIME_CODE_DESCRIPTION = "datetime_code_description";
  @SerializedName(SERIALIZED_NAME_DATETIME_CODE_DESCRIPTION)
  private String datetimeCodeDescription;

  public static final String SERIALIZED_NAME_DATETIME_CODE_ID = "datetime_code_id";
  @SerializedName(SERIALIZED_NAME_DATETIME_CODE_ID)
  private Integer datetimeCodeId;

  public static final String SERIALIZED_NAME_HOUR_FROM = "hour_from";
  @SerializedName(SERIALIZED_NAME_HOUR_FROM)
  private String hourFrom;

  public static final String SERIALIZED_NAME_HOUR_TO = "hour_to";
  @SerializedName(SERIALIZED_NAME_HOUR_TO)
  private String hourTo;

  public static final String SERIALIZED_NAME_WEEKDAY_FROM = "weekday_from";
  @SerializedName(SERIALIZED_NAME_WEEKDAY_FROM)
  private Integer weekdayFrom;

  public static final String SERIALIZED_NAME_WEEKDAY_TO = "weekday_to";
  @SerializedName(SERIALIZED_NAME_WEEKDAY_TO)
  private Integer weekdayTo;

  public Outliersenginev3WorkingHoursPeriod() {
  }

  public Outliersenginev3WorkingHoursPeriod contiguous(Boolean contiguous) {
    this.contiguous = contiguous;
    return this;
  }

   /**
   * Specify whether the period is contiguous or not.
   * @return contiguous
  **/
  @javax.annotation.Nullable
  public Boolean getContiguous() {
    return contiguous;
  }

  public void setContiguous(Boolean contiguous) {
    this.contiguous = contiguous;
  }


  public Outliersenginev3WorkingHoursPeriod datetimeCodeDescription(String datetimeCodeDescription) {
    this.datetimeCodeDescription = datetimeCodeDescription;
    return this;
  }

   /**
   * Period description.
   * @return datetimeCodeDescription
  **/
  @javax.annotation.Nullable
  public String getDatetimeCodeDescription() {
    return datetimeCodeDescription;
  }

  public void setDatetimeCodeDescription(String datetimeCodeDescription) {
    this.datetimeCodeDescription = datetimeCodeDescription;
  }


  public Outliersenginev3WorkingHoursPeriod datetimeCodeId(Integer datetimeCodeId) {
    this.datetimeCodeId = datetimeCodeId;
    return this;
  }

   /**
   * Period id.
   * @return datetimeCodeId
  **/
  @javax.annotation.Nullable
  public Integer getDatetimeCodeId() {
    return datetimeCodeId;
  }

  public void setDatetimeCodeId(Integer datetimeCodeId) {
    this.datetimeCodeId = datetimeCodeId;
  }


  public Outliersenginev3WorkingHoursPeriod hourFrom(String hourFrom) {
    this.hourFrom = hourFrom;
    return this;
  }

   /**
   * The hour that the period starts, format HH:mm.
   * @return hourFrom
  **/
  @javax.annotation.Nullable
  public String getHourFrom() {
    return hourFrom;
  }

  public void setHourFrom(String hourFrom) {
    this.hourFrom = hourFrom;
  }


  public Outliersenginev3WorkingHoursPeriod hourTo(String hourTo) {
    this.hourTo = hourTo;
    return this;
  }

   /**
   * The hour that the period ends, format HH:mm.
   * @return hourTo
  **/
  @javax.annotation.Nullable
  public String getHourTo() {
    return hourTo;
  }

  public void setHourTo(String hourTo) {
    this.hourTo = hourTo;
  }


  public Outliersenginev3WorkingHoursPeriod weekdayFrom(Integer weekdayFrom) {
    this.weekdayFrom = weekdayFrom;
    return this;
  }

   /**
   * The number of day that the period starts.
   * @return weekdayFrom
  **/
  @javax.annotation.Nullable
  public Integer getWeekdayFrom() {
    return weekdayFrom;
  }

  public void setWeekdayFrom(Integer weekdayFrom) {
    this.weekdayFrom = weekdayFrom;
  }


  public Outliersenginev3WorkingHoursPeriod weekdayTo(Integer weekdayTo) {
    this.weekdayTo = weekdayTo;
    return this;
  }

   /**
   * The number of day that the period ends.
   * @return weekdayTo
  **/
  @javax.annotation.Nullable
  public Integer getWeekdayTo() {
    return weekdayTo;
  }

  public void setWeekdayTo(Integer weekdayTo) {
    this.weekdayTo = weekdayTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3WorkingHoursPeriod outliersenginev3WorkingHoursPeriod = (Outliersenginev3WorkingHoursPeriod) o;
    return Objects.equals(this.contiguous, outliersenginev3WorkingHoursPeriod.contiguous) &&
        Objects.equals(this.datetimeCodeDescription, outliersenginev3WorkingHoursPeriod.datetimeCodeDescription) &&
        Objects.equals(this.datetimeCodeId, outliersenginev3WorkingHoursPeriod.datetimeCodeId) &&
        Objects.equals(this.hourFrom, outliersenginev3WorkingHoursPeriod.hourFrom) &&
        Objects.equals(this.hourTo, outliersenginev3WorkingHoursPeriod.hourTo) &&
        Objects.equals(this.weekdayFrom, outliersenginev3WorkingHoursPeriod.weekdayFrom) &&
        Objects.equals(this.weekdayTo, outliersenginev3WorkingHoursPeriod.weekdayTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contiguous, datetimeCodeDescription, datetimeCodeId, hourFrom, hourTo, weekdayFrom, weekdayTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3WorkingHoursPeriod {\n");
    sb.append("    contiguous: ").append(toIndentedString(contiguous)).append("\n");
    sb.append("    datetimeCodeDescription: ").append(toIndentedString(datetimeCodeDescription)).append("\n");
    sb.append("    datetimeCodeId: ").append(toIndentedString(datetimeCodeId)).append("\n");
    sb.append("    hourFrom: ").append(toIndentedString(hourFrom)).append("\n");
    sb.append("    hourTo: ").append(toIndentedString(hourTo)).append("\n");
    sb.append("    weekdayFrom: ").append(toIndentedString(weekdayFrom)).append("\n");
    sb.append("    weekdayTo: ").append(toIndentedString(weekdayTo)).append("\n");
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
    openapiFields.add("contiguous");
    openapiFields.add("datetime_code_description");
    openapiFields.add("datetime_code_id");
    openapiFields.add("hour_from");
    openapiFields.add("hour_to");
    openapiFields.add("weekday_from");
    openapiFields.add("weekday_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3WorkingHoursPeriod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3WorkingHoursPeriod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3WorkingHoursPeriod is not found in the empty JSON string", Outliersenginev3WorkingHoursPeriod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3WorkingHoursPeriod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3WorkingHoursPeriod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datetime_code_description") != null && !jsonObj.get("datetime_code_description").isJsonNull()) && !jsonObj.get("datetime_code_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetime_code_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetime_code_description").toString()));
      }
      if ((jsonObj.get("hour_from") != null && !jsonObj.get("hour_from").isJsonNull()) && !jsonObj.get("hour_from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hour_from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hour_from").toString()));
      }
      if ((jsonObj.get("hour_to") != null && !jsonObj.get("hour_to").isJsonNull()) && !jsonObj.get("hour_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hour_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hour_to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3WorkingHoursPeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3WorkingHoursPeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3WorkingHoursPeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3WorkingHoursPeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3WorkingHoursPeriod>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3WorkingHoursPeriod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3WorkingHoursPeriod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3WorkingHoursPeriod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3WorkingHoursPeriod
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3WorkingHoursPeriod
  */
  public static Outliersenginev3WorkingHoursPeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3WorkingHoursPeriod.class);
  }

 /**
  * Convert an instance of Outliersenginev3WorkingHoursPeriod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

