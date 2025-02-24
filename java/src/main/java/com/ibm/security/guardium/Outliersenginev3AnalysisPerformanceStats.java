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
 * Performance statistics about the events analyzed per second, usually constrained to a specific time period.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3AnalysisPerformanceStats {
  public static final String SERIALIZED_NAME_DURATION_SECONDS = "duration_seconds";
  @SerializedName(SERIALIZED_NAME_DURATION_SECONDS)
  private Integer durationSeconds;

  public static final String SERIALIZED_NAME_EVENTS_ANALYZED = "events_analyzed";
  @SerializedName(SERIALIZED_NAME_EVENTS_ANALYZED)
  private Integer eventsAnalyzed;

  public static final String SERIALIZED_NAME_EVENTS_PER_SECOND = "events_per_second";
  @SerializedName(SERIALIZED_NAME_EVENTS_PER_SECOND)
  private Float eventsPerSecond;

  public Outliersenginev3AnalysisPerformanceStats() {
  }

  public Outliersenginev3AnalysisPerformanceStats durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

   /**
   * Sum of seconds spent in analysis (net).
   * @return durationSeconds
  **/
  @javax.annotation.Nullable
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }


  public Outliersenginev3AnalysisPerformanceStats eventsAnalyzed(Integer eventsAnalyzed) {
    this.eventsAnalyzed = eventsAnalyzed;
    return this;
  }

   /**
   * Sum of events analyzed.
   * @return eventsAnalyzed
  **/
  @javax.annotation.Nullable
  public Integer getEventsAnalyzed() {
    return eventsAnalyzed;
  }

  public void setEventsAnalyzed(Integer eventsAnalyzed) {
    this.eventsAnalyzed = eventsAnalyzed;
  }


  public Outliersenginev3AnalysisPerformanceStats eventsPerSecond(Float eventsPerSecond) {
    this.eventsPerSecond = eventsPerSecond;
    return this;
  }

   /**
   * Average events per second (EPS). Equals to events_analyzed/duration_seconds.
   * @return eventsPerSecond
  **/
  @javax.annotation.Nullable
  public Float getEventsPerSecond() {
    return eventsPerSecond;
  }

  public void setEventsPerSecond(Float eventsPerSecond) {
    this.eventsPerSecond = eventsPerSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3AnalysisPerformanceStats outliersenginev3AnalysisPerformanceStats = (Outliersenginev3AnalysisPerformanceStats) o;
    return Objects.equals(this.durationSeconds, outliersenginev3AnalysisPerformanceStats.durationSeconds) &&
        Objects.equals(this.eventsAnalyzed, outliersenginev3AnalysisPerformanceStats.eventsAnalyzed) &&
        Objects.equals(this.eventsPerSecond, outliersenginev3AnalysisPerformanceStats.eventsPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationSeconds, eventsAnalyzed, eventsPerSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3AnalysisPerformanceStats {\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    eventsAnalyzed: ").append(toIndentedString(eventsAnalyzed)).append("\n");
    sb.append("    eventsPerSecond: ").append(toIndentedString(eventsPerSecond)).append("\n");
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
    openapiFields.add("duration_seconds");
    openapiFields.add("events_analyzed");
    openapiFields.add("events_per_second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3AnalysisPerformanceStats
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3AnalysisPerformanceStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3AnalysisPerformanceStats is not found in the empty JSON string", Outliersenginev3AnalysisPerformanceStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3AnalysisPerformanceStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3AnalysisPerformanceStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3AnalysisPerformanceStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3AnalysisPerformanceStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3AnalysisPerformanceStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3AnalysisPerformanceStats.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3AnalysisPerformanceStats>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3AnalysisPerformanceStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3AnalysisPerformanceStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3AnalysisPerformanceStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3AnalysisPerformanceStats
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3AnalysisPerformanceStats
  */
  public static Outliersenginev3AnalysisPerformanceStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3AnalysisPerformanceStats.class);
  }

 /**
  * Convert an instance of Outliersenginev3AnalysisPerformanceStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

