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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Workflowv3OperatorType;

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
 * FilterColumn represents a column field filter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Workflowv3FilterColumn {
  public static final String SERIALIZED_NAME_HEADER_NAME = "header_name";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_OPERATOR_TYPE = "operator_type";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TYPE)
  private Workflowv3OperatorType operatorType = Workflowv3OperatorType.UNDEFINED_OPERATOR_TYPE;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public Workflowv3FilterColumn() {
  }

  public Workflowv3FilterColumn headerName(String headerName) {
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


  public Workflowv3FilterColumn operatorType(Workflowv3OperatorType operatorType) {
    this.operatorType = operatorType;
    return this;
  }

   /**
   * Get operatorType
   * @return operatorType
  **/
  @javax.annotation.Nullable
  public Workflowv3OperatorType getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(Workflowv3OperatorType operatorType) {
    this.operatorType = operatorType;
  }


  public Workflowv3FilterColumn values(List<String> values) {
    this.values = values;
    return this;
  }

  public Workflowv3FilterColumn addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflowv3FilterColumn workflowv3FilterColumn = (Workflowv3FilterColumn) o;
    return Objects.equals(this.headerName, workflowv3FilterColumn.headerName) &&
        Objects.equals(this.operatorType, workflowv3FilterColumn.operatorType) &&
        Objects.equals(this.values, workflowv3FilterColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, operatorType, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflowv3FilterColumn {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("header_name");
    openapiFields.add("operator_type");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workflowv3FilterColumn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workflowv3FilterColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflowv3FilterColumn is not found in the empty JSON string", Workflowv3FilterColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workflowv3FilterColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workflowv3FilterColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header_name") != null && !jsonObj.get("header_name").isJsonNull()) && !jsonObj.get("header_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header_name").toString()));
      }
      // validate the optional field `operator_type`
      if (jsonObj.get("operator_type") != null && !jsonObj.get("operator_type").isJsonNull()) {
        Workflowv3OperatorType.validateJsonElement(jsonObj.get("operator_type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull() && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflowv3FilterColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflowv3FilterColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflowv3FilterColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflowv3FilterColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflowv3FilterColumn>() {
           @Override
           public void write(JsonWriter out, Workflowv3FilterColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workflowv3FilterColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workflowv3FilterColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflowv3FilterColumn
  * @throws IOException if the JSON string is invalid with respect to Workflowv3FilterColumn
  */
  public static Workflowv3FilterColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflowv3FilterColumn.class);
  }

 /**
  * Convert an instance of Workflowv3FilterColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

