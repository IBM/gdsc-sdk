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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Outliersenginev3WorkingHoursPeriod;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * UpdateWorkingHoursPeriodsRequest is the request object for UpdateWorkingHoursPeriods API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Outliersenginev3UpdateWorkingHoursPeriodsRequest {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Outliersenginev3WorkingHoursPeriod period;

  public Outliersenginev3UpdateWorkingHoursPeriodsRequest() {
  }

  public Outliersenginev3UpdateWorkingHoursPeriodsRequest period(Outliersenginev3WorkingHoursPeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nullable
  public Outliersenginev3WorkingHoursPeriod getPeriod() {
    return period;
  }

  public void setPeriod(Outliersenginev3WorkingHoursPeriod period) {
    this.period = period;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3UpdateWorkingHoursPeriodsRequest outliersenginev3UpdateWorkingHoursPeriodsRequest = (Outliersenginev3UpdateWorkingHoursPeriodsRequest) o;
    return Objects.equals(this.period, outliersenginev3UpdateWorkingHoursPeriodsRequest.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3UpdateWorkingHoursPeriodsRequest {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
    openapiFields.add("period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3UpdateWorkingHoursPeriodsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3UpdateWorkingHoursPeriodsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3UpdateWorkingHoursPeriodsRequest is not found in the empty JSON string", Outliersenginev3UpdateWorkingHoursPeriodsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3UpdateWorkingHoursPeriodsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3UpdateWorkingHoursPeriodsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `period`
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) {
        Outliersenginev3WorkingHoursPeriod.validateJsonElement(jsonObj.get("period"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3UpdateWorkingHoursPeriodsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3UpdateWorkingHoursPeriodsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3UpdateWorkingHoursPeriodsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3UpdateWorkingHoursPeriodsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3UpdateWorkingHoursPeriodsRequest>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3UpdateWorkingHoursPeriodsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3UpdateWorkingHoursPeriodsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3UpdateWorkingHoursPeriodsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3UpdateWorkingHoursPeriodsRequest
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3UpdateWorkingHoursPeriodsRequest
  */
  public static Outliersenginev3UpdateWorkingHoursPeriodsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3UpdateWorkingHoursPeriodsRequest.class);
  }

 /**
  * Convert an instance of Outliersenginev3UpdateWorkingHoursPeriodsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

