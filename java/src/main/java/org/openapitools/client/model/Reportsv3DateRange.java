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
import org.openapitools.client.model.Reportsv3DateRangeType;
import org.openapitools.client.model.Reportsv3DateRangeUnit;

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
 * DateRange represents a date range type - from an enum and if its custom / relative - the start and the end date.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3DateRange {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_END_NUMBER = "end_number";
  @SerializedName(SERIALIZED_NAME_END_NUMBER)
  private Integer endNumber;

  public static final String SERIALIZED_NAME_END_UNIT = "end_unit";
  @SerializedName(SERIALIZED_NAME_END_UNIT)
  private Reportsv3DateRangeUnit endUnit = Reportsv3DateRangeUnit.UNDEFINED_UINT_TYPE;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_START_NUMBER = "start_number";
  @SerializedName(SERIALIZED_NAME_START_NUMBER)
  private Integer startNumber;

  public static final String SERIALIZED_NAME_START_UNIT = "start_unit";
  @SerializedName(SERIALIZED_NAME_START_UNIT)
  private Reportsv3DateRangeUnit startUnit = Reportsv3DateRangeUnit.UNDEFINED_UINT_TYPE;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Reportsv3DateRangeType type = Reportsv3DateRangeType.UNDEFINED_DATE_RANGE_TYPE;

  public Reportsv3DateRange() {
  }

  public Reportsv3DateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * If custom holds the date string.
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Reportsv3DateRange endNumber(Integer endNumber) {
    this.endNumber = endNumber;
    return this;
  }

   /**
   * If custom-relative -  holds the end number.
   * @return endNumber
  **/
  @javax.annotation.Nullable
  public Integer getEndNumber() {
    return endNumber;
  }

  public void setEndNumber(Integer endNumber) {
    this.endNumber = endNumber;
  }


  public Reportsv3DateRange endUnit(Reportsv3DateRangeUnit endUnit) {
    this.endUnit = endUnit;
    return this;
  }

   /**
   * Get endUnit
   * @return endUnit
  **/
  @javax.annotation.Nullable
  public Reportsv3DateRangeUnit getEndUnit() {
    return endUnit;
  }

  public void setEndUnit(Reportsv3DateRangeUnit endUnit) {
    this.endUnit = endUnit;
  }


  public Reportsv3DateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * If custom holds the date string.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Reportsv3DateRange startNumber(Integer startNumber) {
    this.startNumber = startNumber;
    return this;
  }

   /**
   * If custom-relative -  holds the start number.
   * @return startNumber
  **/
  @javax.annotation.Nullable
  public Integer getStartNumber() {
    return startNumber;
  }

  public void setStartNumber(Integer startNumber) {
    this.startNumber = startNumber;
  }


  public Reportsv3DateRange startUnit(Reportsv3DateRangeUnit startUnit) {
    this.startUnit = startUnit;
    return this;
  }

   /**
   * Get startUnit
   * @return startUnit
  **/
  @javax.annotation.Nullable
  public Reportsv3DateRangeUnit getStartUnit() {
    return startUnit;
  }

  public void setStartUnit(Reportsv3DateRangeUnit startUnit) {
    this.startUnit = startUnit;
  }


  public Reportsv3DateRange type(Reportsv3DateRangeType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Reportsv3DateRangeType getType() {
    return type;
  }

  public void setType(Reportsv3DateRangeType type) {
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
    Reportsv3DateRange reportsv3DateRange = (Reportsv3DateRange) o;
    return Objects.equals(this.endDate, reportsv3DateRange.endDate) &&
        Objects.equals(this.endNumber, reportsv3DateRange.endNumber) &&
        Objects.equals(this.endUnit, reportsv3DateRange.endUnit) &&
        Objects.equals(this.startDate, reportsv3DateRange.startDate) &&
        Objects.equals(this.startNumber, reportsv3DateRange.startNumber) &&
        Objects.equals(this.startUnit, reportsv3DateRange.startUnit) &&
        Objects.equals(this.type, reportsv3DateRange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, endNumber, endUnit, startDate, startNumber, startUnit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3DateRange {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endNumber: ").append(toIndentedString(endNumber)).append("\n");
    sb.append("    endUnit: ").append(toIndentedString(endUnit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
    sb.append("    startUnit: ").append(toIndentedString(startUnit)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("end_number");
    openapiFields.add("end_unit");
    openapiFields.add("start_date");
    openapiFields.add("start_number");
    openapiFields.add("start_unit");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3DateRange
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3DateRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3DateRange is not found in the empty JSON string", Reportsv3DateRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3DateRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3DateRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // validate the optional field `end_unit`
      if (jsonObj.get("end_unit") != null && !jsonObj.get("end_unit").isJsonNull()) {
        Reportsv3DateRangeUnit.validateJsonElement(jsonObj.get("end_unit"));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      // validate the optional field `start_unit`
      if (jsonObj.get("start_unit") != null && !jsonObj.get("start_unit").isJsonNull()) {
        Reportsv3DateRangeUnit.validateJsonElement(jsonObj.get("start_unit"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Reportsv3DateRangeType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3DateRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3DateRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3DateRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3DateRange.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3DateRange>() {
           @Override
           public void write(JsonWriter out, Reportsv3DateRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3DateRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3DateRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3DateRange
  * @throws IOException if the JSON string is invalid with respect to Reportsv3DateRange
  */
  public static Reportsv3DateRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3DateRange.class);
  }

 /**
  * Convert an instance of Reportsv3DateRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

