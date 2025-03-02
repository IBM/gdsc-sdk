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
 * contains stats about the finding evidence.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3Statistics {
  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Float average;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public Riskanalyticscontrollerv3Statistics() {
  }

  public Riskanalyticscontrollerv3Statistics average(Float average) {
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @javax.annotation.Nullable
  public Float getAverage() {
    return average;
  }

  public void setAverage(Float average) {
    this.average = average;
  }


  public Riskanalyticscontrollerv3Statistics total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3Statistics riskanalyticscontrollerv3Statistics = (Riskanalyticscontrollerv3Statistics) o;
    return Objects.equals(this.average, riskanalyticscontrollerv3Statistics.average) &&
        Objects.equals(this.total, riskanalyticscontrollerv3Statistics.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3Statistics {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("average");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3Statistics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3Statistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3Statistics is not found in the empty JSON string", Riskanalyticscontrollerv3Statistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3Statistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3Statistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3Statistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3Statistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3Statistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3Statistics.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3Statistics>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3Statistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3Statistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3Statistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3Statistics
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3Statistics
  */
  public static Riskanalyticscontrollerv3Statistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3Statistics.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3Statistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

