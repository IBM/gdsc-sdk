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
import java.time.OffsetDateTime;
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

import org.openapitools.client.JSON;

/**
 * Outliersenginev3AttributeStatistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3AttributeStatistics {
  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private String attribute;

  public static final String SERIALIZED_NAME_HOURLY_AVERAGE_ACTIVITY = "hourly_average_activity";
  @SerializedName(SERIALIZED_NAME_HOURLY_AVERAGE_ACTIVITY)
  private Double hourlyAverageActivity;

  public static final String SERIALIZED_NAME_SEEN_SINCE = "seen_since";
  @SerializedName(SERIALIZED_NAME_SEEN_SINCE)
  private OffsetDateTime seenSince;

  public Outliersenginev3AttributeStatistics() {
  }

  public Outliersenginev3AttributeStatistics attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * attribute - the actual verb/ source program/ working hours etc.
   * @return attribute
  **/
  @javax.annotation.Nullable
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  public Outliersenginev3AttributeStatistics hourlyAverageActivity(Double hourlyAverageActivity) {
    this.hourlyAverageActivity = hourlyAverageActivity;
    return this;
  }

   /**
   * Get hourlyAverageActivity
   * @return hourlyAverageActivity
  **/
  @javax.annotation.Nullable
  public Double getHourlyAverageActivity() {
    return hourlyAverageActivity;
  }

  public void setHourlyAverageActivity(Double hourlyAverageActivity) {
    this.hourlyAverageActivity = hourlyAverageActivity;
  }


  public Outliersenginev3AttributeStatistics seenSince(OffsetDateTime seenSince) {
    this.seenSince = seenSince;
    return this;
  }

   /**
   * Get seenSince
   * @return seenSince
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSeenSince() {
    return seenSince;
  }

  public void setSeenSince(OffsetDateTime seenSince) {
    this.seenSince = seenSince;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3AttributeStatistics outliersenginev3AttributeStatistics = (Outliersenginev3AttributeStatistics) o;
    return Objects.equals(this.attribute, outliersenginev3AttributeStatistics.attribute) &&
        Objects.equals(this.hourlyAverageActivity, outliersenginev3AttributeStatistics.hourlyAverageActivity) &&
        Objects.equals(this.seenSince, outliersenginev3AttributeStatistics.seenSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, hourlyAverageActivity, seenSince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3AttributeStatistics {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    hourlyAverageActivity: ").append(toIndentedString(hourlyAverageActivity)).append("\n");
    sb.append("    seenSince: ").append(toIndentedString(seenSince)).append("\n");
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
    openapiFields.add("attribute");
    openapiFields.add("hourly_average_activity");
    openapiFields.add("seen_since");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3AttributeStatistics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3AttributeStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3AttributeStatistics is not found in the empty JSON string", Outliersenginev3AttributeStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3AttributeStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3AttributeStatistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonNull()) && !jsonObj.get("attribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attribute").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3AttributeStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3AttributeStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3AttributeStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3AttributeStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3AttributeStatistics>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3AttributeStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3AttributeStatistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3AttributeStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3AttributeStatistics
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3AttributeStatistics
  */
  public static Outliersenginev3AttributeStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3AttributeStatistics.class);
  }

 /**
  * Convert an instance of Outliersenginev3AttributeStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

