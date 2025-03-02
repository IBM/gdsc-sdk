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
import org.openapitools.client.model.Reportsv3AggregationType;
import org.openapitools.client.model.Reportsv3OperatorType;

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
 * ReportAggFilterCondition represents a report aggregate filter condition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3ReportAggFilterCondition {
  public static final String SERIALIZED_NAME_AGGREGATION_TYPE = "aggregation_type";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_TYPE)
  private Reportsv3AggregationType aggregationType = Reportsv3AggregationType.UNDEFINED_AGG_TYPE;

  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_HEADER_NAME = "header_name";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_OPERATOR_TYPE = "operator_type";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TYPE)
  private Reportsv3OperatorType operatorType = Reportsv3OperatorType.UNDEFINED_OPERATOR_TYPE;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Reportsv3ReportAggFilterCondition() {
  }

  public Reportsv3ReportAggFilterCondition aggregationType(Reportsv3AggregationType aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Get aggregationType
   * @return aggregationType
  **/
  @javax.annotation.Nullable
  public Reportsv3AggregationType getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(Reportsv3AggregationType aggregationType) {
    this.aggregationType = aggregationType;
  }


  public Reportsv3ReportAggFilterCondition headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Get headerId
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Reportsv3ReportAggFilterCondition headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Get headerName
   * @return headerName
  **/
  @javax.annotation.Nullable
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  public Reportsv3ReportAggFilterCondition operatorType(Reportsv3OperatorType operatorType) {
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


  public Reportsv3ReportAggFilterCondition tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public Reportsv3ReportAggFilterCondition value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3ReportAggFilterCondition reportsv3ReportAggFilterCondition = (Reportsv3ReportAggFilterCondition) o;
    return Objects.equals(this.aggregationType, reportsv3ReportAggFilterCondition.aggregationType) &&
        Objects.equals(this.headerId, reportsv3ReportAggFilterCondition.headerId) &&
        Objects.equals(this.headerName, reportsv3ReportAggFilterCondition.headerName) &&
        Objects.equals(this.operatorType, reportsv3ReportAggFilterCondition.operatorType) &&
        Objects.equals(this.tableName, reportsv3ReportAggFilterCondition.tableName) &&
        Objects.equals(this.value, reportsv3ReportAggFilterCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationType, headerId, headerName, operatorType, tableName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3ReportAggFilterCondition {\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("aggregation_type");
    openapiFields.add("header_id");
    openapiFields.add("header_name");
    openapiFields.add("operator_type");
    openapiFields.add("table_name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3ReportAggFilterCondition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3ReportAggFilterCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3ReportAggFilterCondition is not found in the empty JSON string", Reportsv3ReportAggFilterCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3ReportAggFilterCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3ReportAggFilterCondition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `aggregation_type`
      if (jsonObj.get("aggregation_type") != null && !jsonObj.get("aggregation_type").isJsonNull()) {
        Reportsv3AggregationType.validateJsonElement(jsonObj.get("aggregation_type"));
      }
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("header_name") != null && !jsonObj.get("header_name").isJsonNull()) && !jsonObj.get("header_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_name").toString()));
      }
      // validate the optional field `operator_type`
      if (jsonObj.get("operator_type") != null && !jsonObj.get("operator_type").isJsonNull()) {
        Reportsv3OperatorType.validateJsonElement(jsonObj.get("operator_type"));
      }
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3ReportAggFilterCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3ReportAggFilterCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3ReportAggFilterCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3ReportAggFilterCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3ReportAggFilterCondition>() {
           @Override
           public void write(JsonWriter out, Reportsv3ReportAggFilterCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3ReportAggFilterCondition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3ReportAggFilterCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3ReportAggFilterCondition
  * @throws IOException if the JSON string is invalid with respect to Reportsv3ReportAggFilterCondition
  */
  public static Reportsv3ReportAggFilterCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3ReportAggFilterCondition.class);
  }

 /**
  * Convert an instance of Reportsv3ReportAggFilterCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

