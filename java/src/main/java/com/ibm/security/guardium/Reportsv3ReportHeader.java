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
import com.ibm.security.guardium.Reportsv3AggregationType;
import com.ibm.security.guardium.Reportsv3FieldName;
import com.ibm.security.guardium.Reportsv3HeaderDataType;
import com.ibm.security.guardium.Reportsv3HeaderDescription;
import com.ibm.security.guardium.Reportsv3HeaderType;
import com.ibm.security.guardium.Reportsv3Literal;
import com.ibm.security.guardium.Reportsv3OrderBy;
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
 * Report header.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3ReportHeader {
  public static final String SERIALIZED_NAME_AGGREGATION_TYPE = "aggregation_type";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_TYPE)
  private Reportsv3AggregationType aggregationType = Reportsv3AggregationType.UNDEFINED_AGG_TYPE;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private Reportsv3FieldName fieldName;

  public static final String SERIALIZED_NAME_GROUP_TYPE_ID = "group_type_id";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE_ID)
  private Integer groupTypeId;

  public static final String SERIALIZED_NAME_HEADER_DATA_TYPE = "header_data_type";
  @SerializedName(SERIALIZED_NAME_HEADER_DATA_TYPE)
  private Reportsv3HeaderDataType headerDataType = Reportsv3HeaderDataType.UNDEFINED_REPORT_HEADER_TYPE;

  public static final String SERIALIZED_NAME_HEADER_DESCRIPTION = "header_description";
  @SerializedName(SERIALIZED_NAME_HEADER_DESCRIPTION)
  private Reportsv3HeaderDescription headerDescription;

  public static final String SERIALIZED_NAME_HEADER_ID = "header_id";
  @SerializedName(SERIALIZED_NAME_HEADER_ID)
  private String headerId;

  public static final String SERIALIZED_NAME_HEADER_NAME = "header_name";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_HEADER_TYPE = "header_type";
  @SerializedName(SERIALIZED_NAME_HEADER_TYPE)
  private Reportsv3HeaderType headerType = Reportsv3HeaderType.UNDEFINED_TYPE;

  public static final String SERIALIZED_NAME_HEADER_TYPE_LENGTH = "header_type_length";
  @SerializedName(SERIALIZED_NAME_HEADER_TYPE_LENGTH)
  private Integer headerTypeLength;

  public static final String SERIALIZED_NAME_LITERAL = "literal";
  @SerializedName(SERIALIZED_NAME_LITERAL)
  private Reportsv3Literal literal;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private Reportsv3OrderBy orderBy = Reportsv3OrderBy.UNDEFINED_ORDER_BY;

  public static final String SERIALIZED_NAME_ORDER_BY_SEQ = "order_by_seq";
  @SerializedName(SERIALIZED_NAME_ORDER_BY_SEQ)
  private Integer orderBySeq;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public Reportsv3ReportHeader() {
  }

  public Reportsv3ReportHeader aggregationType(Reportsv3AggregationType aggregationType) {
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


  public Reportsv3ReportHeader fieldName(Reportsv3FieldName fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable
  public Reportsv3FieldName getFieldName() {
    return fieldName;
  }

  public void setFieldName(Reportsv3FieldName fieldName) {
    this.fieldName = fieldName;
  }


  public Reportsv3ReportHeader groupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
    return this;
  }

   /**
   * Group type id for the filter.
   * @return groupTypeId
  **/
  @javax.annotation.Nullable
  public Integer getGroupTypeId() {
    return groupTypeId;
  }

  public void setGroupTypeId(Integer groupTypeId) {
    this.groupTypeId = groupTypeId;
  }


  public Reportsv3ReportHeader headerDataType(Reportsv3HeaderDataType headerDataType) {
    this.headerDataType = headerDataType;
    return this;
  }

   /**
   * Get headerDataType
   * @return headerDataType
  **/
  @javax.annotation.Nullable
  public Reportsv3HeaderDataType getHeaderDataType() {
    return headerDataType;
  }

  public void setHeaderDataType(Reportsv3HeaderDataType headerDataType) {
    this.headerDataType = headerDataType;
  }


  public Reportsv3ReportHeader headerDescription(Reportsv3HeaderDescription headerDescription) {
    this.headerDescription = headerDescription;
    return this;
  }

   /**
   * Get headerDescription
   * @return headerDescription
  **/
  @javax.annotation.Nullable
  public Reportsv3HeaderDescription getHeaderDescription() {
    return headerDescription;
  }

  public void setHeaderDescription(Reportsv3HeaderDescription headerDescription) {
    this.headerDescription = headerDescription;
  }


  public Reportsv3ReportHeader headerId(String headerId) {
    this.headerId = headerId;
    return this;
  }

   /**
   * Header ID.
   * @return headerId
  **/
  @javax.annotation.Nullable
  public String getHeaderId() {
    return headerId;
  }

  public void setHeaderId(String headerId) {
    this.headerId = headerId;
  }


  public Reportsv3ReportHeader headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * The header name.
   * @return headerName
  **/
  @javax.annotation.Nullable
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  public Reportsv3ReportHeader headerType(Reportsv3HeaderType headerType) {
    this.headerType = headerType;
    return this;
  }

   /**
   * Get headerType
   * @return headerType
  **/
  @javax.annotation.Nullable
  public Reportsv3HeaderType getHeaderType() {
    return headerType;
  }

  public void setHeaderType(Reportsv3HeaderType headerType) {
    this.headerType = headerType;
  }


  public Reportsv3ReportHeader headerTypeLength(Integer headerTypeLength) {
    this.headerTypeLength = headerTypeLength;
    return this;
  }

   /**
   * Header type length.
   * @return headerTypeLength
  **/
  @javax.annotation.Nullable
  public Integer getHeaderTypeLength() {
    return headerTypeLength;
  }

  public void setHeaderTypeLength(Integer headerTypeLength) {
    this.headerTypeLength = headerTypeLength;
  }


  public Reportsv3ReportHeader literal(Reportsv3Literal literal) {
    this.literal = literal;
    return this;
  }

   /**
   * Get literal
   * @return literal
  **/
  @javax.annotation.Nullable
  public Reportsv3Literal getLiteral() {
    return literal;
  }

  public void setLiteral(Reportsv3Literal literal) {
    this.literal = literal;
  }


  public Reportsv3ReportHeader orderBy(Reportsv3OrderBy orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  public Reportsv3OrderBy getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(Reportsv3OrderBy orderBy) {
    this.orderBy = orderBy;
  }


  public Reportsv3ReportHeader orderBySeq(Integer orderBySeq) {
    this.orderBySeq = orderBySeq;
    return this;
  }

   /**
   * Order by sequence.
   * @return orderBySeq
  **/
  @javax.annotation.Nullable
  public Integer getOrderBySeq() {
    return orderBySeq;
  }

  public void setOrderBySeq(Integer orderBySeq) {
    this.orderBySeq = orderBySeq;
  }


  public Reportsv3ReportHeader schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

   /**
   * Schema name.
   * @return schemaName
  **/
  @javax.annotation.Nullable
  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public Reportsv3ReportHeader sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Column sequence number.
   * @return sequence
  **/
  @javax.annotation.Nullable
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public Reportsv3ReportHeader tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Table name.
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3ReportHeader reportsv3ReportHeader = (Reportsv3ReportHeader) o;
    return Objects.equals(this.aggregationType, reportsv3ReportHeader.aggregationType) &&
        Objects.equals(this.fieldName, reportsv3ReportHeader.fieldName) &&
        Objects.equals(this.groupTypeId, reportsv3ReportHeader.groupTypeId) &&
        Objects.equals(this.headerDataType, reportsv3ReportHeader.headerDataType) &&
        Objects.equals(this.headerDescription, reportsv3ReportHeader.headerDescription) &&
        Objects.equals(this.headerId, reportsv3ReportHeader.headerId) &&
        Objects.equals(this.headerName, reportsv3ReportHeader.headerName) &&
        Objects.equals(this.headerType, reportsv3ReportHeader.headerType) &&
        Objects.equals(this.headerTypeLength, reportsv3ReportHeader.headerTypeLength) &&
        Objects.equals(this.literal, reportsv3ReportHeader.literal) &&
        Objects.equals(this.orderBy, reportsv3ReportHeader.orderBy) &&
        Objects.equals(this.orderBySeq, reportsv3ReportHeader.orderBySeq) &&
        Objects.equals(this.schemaName, reportsv3ReportHeader.schemaName) &&
        Objects.equals(this.sequence, reportsv3ReportHeader.sequence) &&
        Objects.equals(this.tableName, reportsv3ReportHeader.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationType, fieldName, groupTypeId, headerDataType, headerDescription, headerId, headerName, headerType, headerTypeLength, literal, orderBy, orderBySeq, schemaName, sequence, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3ReportHeader {\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    groupTypeId: ").append(toIndentedString(groupTypeId)).append("\n");
    sb.append("    headerDataType: ").append(toIndentedString(headerDataType)).append("\n");
    sb.append("    headerDescription: ").append(toIndentedString(headerDescription)).append("\n");
    sb.append("    headerId: ").append(toIndentedString(headerId)).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerType: ").append(toIndentedString(headerType)).append("\n");
    sb.append("    headerTypeLength: ").append(toIndentedString(headerTypeLength)).append("\n");
    sb.append("    literal: ").append(toIndentedString(literal)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderBySeq: ").append(toIndentedString(orderBySeq)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
    openapiFields.add("field_name");
    openapiFields.add("group_type_id");
    openapiFields.add("header_data_type");
    openapiFields.add("header_description");
    openapiFields.add("header_id");
    openapiFields.add("header_name");
    openapiFields.add("header_type");
    openapiFields.add("header_type_length");
    openapiFields.add("literal");
    openapiFields.add("order_by");
    openapiFields.add("order_by_seq");
    openapiFields.add("schema_name");
    openapiFields.add("sequence");
    openapiFields.add("table_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3ReportHeader
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3ReportHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3ReportHeader is not found in the empty JSON string", Reportsv3ReportHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3ReportHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3ReportHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `aggregation_type`
      if (jsonObj.get("aggregation_type") != null && !jsonObj.get("aggregation_type").isJsonNull()) {
        Reportsv3AggregationType.validateJsonElement(jsonObj.get("aggregation_type"));
      }
      // validate the optional field `field_name`
      if (jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonNull()) {
        Reportsv3FieldName.validateJsonElement(jsonObj.get("field_name"));
      }
      // validate the optional field `header_data_type`
      if (jsonObj.get("header_data_type") != null && !jsonObj.get("header_data_type").isJsonNull()) {
        Reportsv3HeaderDataType.validateJsonElement(jsonObj.get("header_data_type"));
      }
      // validate the optional field `header_description`
      if (jsonObj.get("header_description") != null && !jsonObj.get("header_description").isJsonNull()) {
        Reportsv3HeaderDescription.validateJsonElement(jsonObj.get("header_description"));
      }
      if ((jsonObj.get("header_id") != null && !jsonObj.get("header_id").isJsonNull()) && !jsonObj.get("header_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_id").toString()));
      }
      if ((jsonObj.get("header_name") != null && !jsonObj.get("header_name").isJsonNull()) && !jsonObj.get("header_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_name").toString()));
      }
      // validate the optional field `header_type`
      if (jsonObj.get("header_type") != null && !jsonObj.get("header_type").isJsonNull()) {
        Reportsv3HeaderType.validateJsonElement(jsonObj.get("header_type"));
      }
      // validate the optional field `literal`
      if (jsonObj.get("literal") != null && !jsonObj.get("literal").isJsonNull()) {
        Reportsv3Literal.validateJsonElement(jsonObj.get("literal"));
      }
      // validate the optional field `order_by`
      if (jsonObj.get("order_by") != null && !jsonObj.get("order_by").isJsonNull()) {
        Reportsv3OrderBy.validateJsonElement(jsonObj.get("order_by"));
      }
      if ((jsonObj.get("schema_name") != null && !jsonObj.get("schema_name").isJsonNull()) && !jsonObj.get("schema_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_name").toString()));
      }
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3ReportHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3ReportHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3ReportHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3ReportHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3ReportHeader>() {
           @Override
           public void write(JsonWriter out, Reportsv3ReportHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3ReportHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3ReportHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3ReportHeader
  * @throws IOException if the JSON string is invalid with respect to Reportsv3ReportHeader
  */
  public static Reportsv3ReportHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3ReportHeader.class);
  }

 /**
  * Convert an instance of Reportsv3ReportHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

