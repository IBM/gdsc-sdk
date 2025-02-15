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
 * Collector configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3CollectorConfig {
  public static final String SERIALIZED_NAME_DATAMART_START_DATE_COLLECTOR = "datamart_start_date_collector";
  @SerializedName(SERIALIZED_NAME_DATAMART_START_DATE_COLLECTOR)
  private String datamartStartDateCollector;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unit_type";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public Guardiumconnectorv3CollectorConfig() {
  }

  public Guardiumconnectorv3CollectorConfig datamartStartDateCollector(String datamartStartDateCollector) {
    this.datamartStartDateCollector = datamartStartDateCollector;
    return this;
  }

   /**
   * Datamart start date.
   * @return datamartStartDateCollector
  **/
  @javax.annotation.Nullable
  public String getDatamartStartDateCollector() {
    return datamartStartDateCollector;
  }

  public void setDatamartStartDateCollector(String datamartStartDateCollector) {
    this.datamartStartDateCollector = datamartStartDateCollector;
  }


  public Guardiumconnectorv3CollectorConfig host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Hostname of collector.
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public Guardiumconnectorv3CollectorConfig unitType(String unitType) {
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
    Guardiumconnectorv3CollectorConfig guardiumconnectorv3CollectorConfig = (Guardiumconnectorv3CollectorConfig) o;
    return Objects.equals(this.datamartStartDateCollector, guardiumconnectorv3CollectorConfig.datamartStartDateCollector) &&
        Objects.equals(this.host, guardiumconnectorv3CollectorConfig.host) &&
        Objects.equals(this.unitType, guardiumconnectorv3CollectorConfig.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datamartStartDateCollector, host, unitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3CollectorConfig {\n");
    sb.append("    datamartStartDateCollector: ").append(toIndentedString(datamartStartDateCollector)).append("\n");
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
    openapiFields.add("datamart_start_date_collector");
    openapiFields.add("host");
    openapiFields.add("unit_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3CollectorConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3CollectorConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3CollectorConfig is not found in the empty JSON string", Guardiumconnectorv3CollectorConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3CollectorConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3CollectorConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datamart_start_date_collector") != null && !jsonObj.get("datamart_start_date_collector").isJsonNull()) && !jsonObj.get("datamart_start_date_collector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_start_date_collector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_start_date_collector").toString()));
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
       if (!Guardiumconnectorv3CollectorConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3CollectorConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3CollectorConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3CollectorConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3CollectorConfig>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3CollectorConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3CollectorConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3CollectorConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3CollectorConfig
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3CollectorConfig
  */
  public static Guardiumconnectorv3CollectorConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3CollectorConfig.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3CollectorConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

