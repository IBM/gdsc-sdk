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
 * Information about aggregation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3AggregationViewListObject {
  public static final String SERIALIZED_NAME_AGG_ACTION_ERROR = "agg_action_error";
  @SerializedName(SERIALIZED_NAME_AGG_ACTION_ERROR)
  private String aggActionError;

  public static final String SERIALIZED_NAME_AGG_ACTION_HEALTH_STATUS = "agg_action_health_status";
  @SerializedName(SERIALIZED_NAME_AGG_ACTION_HEALTH_STATUS)
  private Integer aggActionHealthStatus;

  public static final String SERIALIZED_NAME_AGG_TYPE = "agg_type";
  @SerializedName(SERIALIZED_NAME_AGG_TYPE)
  private String aggType;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Integer error;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public Guardiumconnectorv3AggregationViewListObject() {
  }

  public Guardiumconnectorv3AggregationViewListObject aggActionError(String aggActionError) {
    this.aggActionError = aggActionError;
    return this;
  }

   /**
   * Aggregation action error.
   * @return aggActionError
  **/
  @javax.annotation.Nullable
  public String getAggActionError() {
    return aggActionError;
  }

  public void setAggActionError(String aggActionError) {
    this.aggActionError = aggActionError;
  }


  public Guardiumconnectorv3AggregationViewListObject aggActionHealthStatus(Integer aggActionHealthStatus) {
    this.aggActionHealthStatus = aggActionHealthStatus;
    return this;
  }

   /**
   * Aggregation health status.
   * @return aggActionHealthStatus
  **/
  @javax.annotation.Nullable
  public Integer getAggActionHealthStatus() {
    return aggActionHealthStatus;
  }

  public void setAggActionHealthStatus(Integer aggActionHealthStatus) {
    this.aggActionHealthStatus = aggActionHealthStatus;
  }


  public Guardiumconnectorv3AggregationViewListObject aggType(String aggType) {
    this.aggType = aggType;
    return this;
  }

   /**
   * Aggregation type.
   * @return aggType
  **/
  @javax.annotation.Nullable
  public String getAggType() {
    return aggType;
  }

  public void setAggType(String aggType) {
    this.aggType = aggType;
  }


  public Guardiumconnectorv3AggregationViewListObject error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Error code.
   * @return error
  **/
  @javax.annotation.Nullable
  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }


  public Guardiumconnectorv3AggregationViewListObject unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Aggregator host name or IP address.
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3AggregationViewListObject guardiumconnectorv3AggregationViewListObject = (Guardiumconnectorv3AggregationViewListObject) o;
    return Objects.equals(this.aggActionError, guardiumconnectorv3AggregationViewListObject.aggActionError) &&
        Objects.equals(this.aggActionHealthStatus, guardiumconnectorv3AggregationViewListObject.aggActionHealthStatus) &&
        Objects.equals(this.aggType, guardiumconnectorv3AggregationViewListObject.aggType) &&
        Objects.equals(this.error, guardiumconnectorv3AggregationViewListObject.error) &&
        Objects.equals(this.unit, guardiumconnectorv3AggregationViewListObject.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggActionError, aggActionHealthStatus, aggType, error, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3AggregationViewListObject {\n");
    sb.append("    aggActionError: ").append(toIndentedString(aggActionError)).append("\n");
    sb.append("    aggActionHealthStatus: ").append(toIndentedString(aggActionHealthStatus)).append("\n");
    sb.append("    aggType: ").append(toIndentedString(aggType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("agg_action_error");
    openapiFields.add("agg_action_health_status");
    openapiFields.add("agg_type");
    openapiFields.add("error");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3AggregationViewListObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3AggregationViewListObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3AggregationViewListObject is not found in the empty JSON string", Guardiumconnectorv3AggregationViewListObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3AggregationViewListObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3AggregationViewListObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agg_action_error") != null && !jsonObj.get("agg_action_error").isJsonNull()) && !jsonObj.get("agg_action_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agg_action_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agg_action_error").toString()));
      }
      if ((jsonObj.get("agg_type") != null && !jsonObj.get("agg_type").isJsonNull()) && !jsonObj.get("agg_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agg_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agg_type").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3AggregationViewListObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3AggregationViewListObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3AggregationViewListObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3AggregationViewListObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3AggregationViewListObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3AggregationViewListObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3AggregationViewListObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3AggregationViewListObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3AggregationViewListObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3AggregationViewListObject
  */
  public static Guardiumconnectorv3AggregationViewListObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3AggregationViewListObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3AggregationViewListObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

