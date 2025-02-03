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
import org.openapitools.client.model.Riskanalyticscontrollerv3ObservationType;

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
 * Short observation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3ShortObservation {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Riskanalyticscontrollerv3ObservationType type = Riskanalyticscontrollerv3ObservationType.UNDEFINED_OBSERVATION_TYPE;

  public Riskanalyticscontrollerv3ShortObservation() {
  }

  public Riskanalyticscontrollerv3ShortObservation count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of observation.
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public Riskanalyticscontrollerv3ShortObservation type(Riskanalyticscontrollerv3ObservationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Riskanalyticscontrollerv3ObservationType getType() {
    return type;
  }

  public void setType(Riskanalyticscontrollerv3ObservationType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3ShortObservation riskanalyticscontrollerv3ShortObservation = (Riskanalyticscontrollerv3ShortObservation) o;
    return Objects.equals(this.count, riskanalyticscontrollerv3ShortObservation.count) &&
        Objects.equals(this.type, riskanalyticscontrollerv3ShortObservation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3ShortObservation {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3ShortObservation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3ShortObservation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3ShortObservation is not found in the empty JSON string", Riskanalyticscontrollerv3ShortObservation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3ShortObservation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3ShortObservation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Riskanalyticscontrollerv3ObservationType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3ShortObservation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3ShortObservation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3ShortObservation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3ShortObservation.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3ShortObservation>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3ShortObservation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3ShortObservation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3ShortObservation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3ShortObservation
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3ShortObservation
  */
  public static Riskanalyticscontrollerv3ShortObservation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3ShortObservation.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3ShortObservation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

