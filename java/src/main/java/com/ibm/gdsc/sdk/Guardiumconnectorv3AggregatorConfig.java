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
 * Return the Aggregator configuration information from tenant database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3AggregatorConfig {
  public static final String SERIALIZED_NAME_DATAMART_END_DATE_AGGREGATOR = "datamart_end_date_aggregator";
  @SerializedName(SERIALIZED_NAME_DATAMART_END_DATE_AGGREGATOR)
  private String datamartEndDateAggregator;

  public static final String SERIALIZED_NAME_DATAMART_START_DATE_AGGREGATOR = "datamart_start_date_aggregator";
  @SerializedName(SERIALIZED_NAME_DATAMART_START_DATE_AGGREGATOR)
  private String datamartStartDateAggregator;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unit_type";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public Guardiumconnectorv3AggregatorConfig() {
  }

  public Guardiumconnectorv3AggregatorConfig datamartEndDateAggregator(String datamartEndDateAggregator) {
    this.datamartEndDateAggregator = datamartEndDateAggregator;
    return this;
  }

   /**
   * End date for Datamart export.
   * @return datamartEndDateAggregator
  **/
  @javax.annotation.Nullable
  public String getDatamartEndDateAggregator() {
    return datamartEndDateAggregator;
  }

  public void setDatamartEndDateAggregator(String datamartEndDateAggregator) {
    this.datamartEndDateAggregator = datamartEndDateAggregator;
  }


  public Guardiumconnectorv3AggregatorConfig datamartStartDateAggregator(String datamartStartDateAggregator) {
    this.datamartStartDateAggregator = datamartStartDateAggregator;
    return this;
  }

   /**
   * Start date for Datamart export.
   * @return datamartStartDateAggregator
  **/
  @javax.annotation.Nullable
  public String getDatamartStartDateAggregator() {
    return datamartStartDateAggregator;
  }

  public void setDatamartStartDateAggregator(String datamartStartDateAggregator) {
    this.datamartStartDateAggregator = datamartStartDateAggregator;
  }


  public Guardiumconnectorv3AggregatorConfig host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Hostname of Aggregator.
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public Guardiumconnectorv3AggregatorConfig unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Unit type.
   * @return unitType
  **/
  @javax.annotation.Nullable
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3AggregatorConfig guardiumconnectorv3AggregatorConfig = (Guardiumconnectorv3AggregatorConfig) o;
    return Objects.equals(this.datamartEndDateAggregator, guardiumconnectorv3AggregatorConfig.datamartEndDateAggregator) &&
        Objects.equals(this.datamartStartDateAggregator, guardiumconnectorv3AggregatorConfig.datamartStartDateAggregator) &&
        Objects.equals(this.host, guardiumconnectorv3AggregatorConfig.host) &&
        Objects.equals(this.unitType, guardiumconnectorv3AggregatorConfig.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datamartEndDateAggregator, datamartStartDateAggregator, host, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3AggregatorConfig {\n");
    sb.append("    datamartEndDateAggregator: ").append(toIndentedString(datamartEndDateAggregator)).append("\n");
    sb.append("    datamartStartDateAggregator: ").append(toIndentedString(datamartStartDateAggregator)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
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
    openapiFields.add("datamart_end_date_aggregator");
    openapiFields.add("datamart_start_date_aggregator");
    openapiFields.add("host");
    openapiFields.add("unit_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3AggregatorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3AggregatorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3AggregatorConfig is not found in the empty JSON string", Guardiumconnectorv3AggregatorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3AggregatorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3AggregatorConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datamart_end_date_aggregator") != null && !jsonObj.get("datamart_end_date_aggregator").isJsonNull()) && !jsonObj.get("datamart_end_date_aggregator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_end_date_aggregator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_end_date_aggregator").toString()));
      }
      if ((jsonObj.get("datamart_start_date_aggregator") != null && !jsonObj.get("datamart_start_date_aggregator").isJsonNull()) && !jsonObj.get("datamart_start_date_aggregator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_start_date_aggregator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_start_date_aggregator").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("unit_type") != null && !jsonObj.get("unit_type").isJsonNull()) && !jsonObj.get("unit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3AggregatorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3AggregatorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3AggregatorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3AggregatorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3AggregatorConfig>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3AggregatorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3AggregatorConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3AggregatorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3AggregatorConfig
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3AggregatorConfig
  */
  public static Guardiumconnectorv3AggregatorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3AggregatorConfig.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3AggregatorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

