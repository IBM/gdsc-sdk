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
import java.io.IOException;
import java.math.BigDecimal;
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
 * DataStoresSummaryStoreTypesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class DataStoresSummaryStoreTypesInner {
  public static final String SERIALIZED_NAME_STORE_TYPE = "storeType";
  @SerializedName(SERIALIZED_NAME_STORE_TYPE)
  private String storeType;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private BigDecimal count;

  public DataStoresSummaryStoreTypesInner() {
  }

  public DataStoresSummaryStoreTypesInner storeType(String storeType) {
    this.storeType = storeType;
    return this;
  }

   /**
   * Get storeType
   * @return storeType
  **/
  @javax.annotation.Nonnull
  public String getStoreType() {
    return storeType;
  }

  public void setStoreType(String storeType) {
    this.storeType = storeType;
  }


  public DataStoresSummaryStoreTypesInner count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStoresSummaryStoreTypesInner dataStoresSummaryStoreTypesInner = (DataStoresSummaryStoreTypesInner) o;
    return Objects.equals(this.storeType, dataStoresSummaryStoreTypesInner.storeType) &&
        Objects.equals(this.count, dataStoresSummaryStoreTypesInner.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStoresSummaryStoreTypesInner {\n");
    sb.append("    storeType: ").append(toIndentedString(storeType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("storeType");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("storeType");
    openapiRequiredFields.add("count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataStoresSummaryStoreTypesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataStoresSummaryStoreTypesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataStoresSummaryStoreTypesInner is not found in the empty JSON string", DataStoresSummaryStoreTypesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataStoresSummaryStoreTypesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataStoresSummaryStoreTypesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataStoresSummaryStoreTypesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("storeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataStoresSummaryStoreTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataStoresSummaryStoreTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataStoresSummaryStoreTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataStoresSummaryStoreTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DataStoresSummaryStoreTypesInner>() {
           @Override
           public void write(JsonWriter out, DataStoresSummaryStoreTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataStoresSummaryStoreTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataStoresSummaryStoreTypesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataStoresSummaryStoreTypesInner
  * @throws IOException if the JSON string is invalid with respect to DataStoresSummaryStoreTypesInner
  */
  public static DataStoresSummaryStoreTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataStoresSummaryStoreTypesInner.class);
  }

 /**
  * Convert an instance of DataStoresSummaryStoreTypesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

