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
import com.ibm.gdsc.sdk.models.Reportsv3OperatorType;
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
 * ObservationReportFilter header id and value to apply as a report filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Riskanalyticscontrollerv3ObservationReportFilter {
  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_HEADER_VALUE = "header_value";
  @SerializedName(SERIALIZED_NAME_HEADER_VALUE)
  private String headerValue;

  public static final String SERIALIZED_NAME_OPERATOR_TYPE = "operator_type";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TYPE)
  private Reportsv3OperatorType operatorType = Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE;

  public Riskanalyticscontrollerv3ObservationReportFilter() {
  }

  public Riskanalyticscontrollerv3ObservationReportFilter headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * The header id to filter.
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Riskanalyticscontrollerv3ObservationReportFilter headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * The value to filter this header by.
   * @return headerValue
  **/
  @javax.annotation.Nullable
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }


  public Riskanalyticscontrollerv3ObservationReportFilter operatorType(Reportsv3OperatorType operatorType) {
    this.operatorType = operatorType;
    return this;
  }

   /**
   * Get operatorType
   * @return operatorType
  **/
  @javax.annotation.Nullable
  public Reportsv3OperatorType getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(Reportsv3OperatorType operatorType) {
    this.operatorType = operatorType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticscontrollerv3ObservationReportFilter riskanalyticscontrollerv3ObservationReportFilter = (Riskanalyticscontrollerv3ObservationReportFilter) o;
    return Objects.equals(this.headerId, riskanalyticscontrollerv3ObservationReportFilter.headerId) &&
        Objects.equals(this.headerValue, riskanalyticscontrollerv3ObservationReportFilter.headerValue) &&
        Objects.equals(this.operatorType, riskanalyticscontrollerv3ObservationReportFilter.operatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerId, headerValue, operatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticscontrollerv3ObservationReportFilter {\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
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
    openapiFields.add("header_id");
    openapiFields.add("header_value");
    openapiFields.add("operator_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticscontrollerv3ObservationReportFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticscontrollerv3ObservationReportFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticscontrollerv3ObservationReportFilter is not found in the empty JSON string", Riskanalyticscontrollerv3ObservationReportFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticscontrollerv3ObservationReportFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticscontrollerv3ObservationReportFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("header_value") != null && !jsonObj.get("header_value").isJsonNull()) && !jsonObj.get("header_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_value").toString()));
      }
      // validate the optional field `operator_type`
      if (jsonObj.get("operator_type") != null && !jsonObj.get("operator_type").isJsonNull()) {
        Reportsv3OperatorType.validateJsonElement(jsonObj.get("operator_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticscontrollerv3ObservationReportFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticscontrollerv3ObservationReportFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticscontrollerv3ObservationReportFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticscontrollerv3ObservationReportFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticscontrollerv3ObservationReportFilter>() {
           @Override
           public void write(JsonWriter out, Riskanalyticscontrollerv3ObservationReportFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticscontrollerv3ObservationReportFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticscontrollerv3ObservationReportFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticscontrollerv3ObservationReportFilter
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticscontrollerv3ObservationReportFilter
  */
  public static Riskanalyticscontrollerv3ObservationReportFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticscontrollerv3ObservationReportFilter.class);
  }

 /**
  * Convert an instance of Riskanalyticscontrollerv3ObservationReportFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

