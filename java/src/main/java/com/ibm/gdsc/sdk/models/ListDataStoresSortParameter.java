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
import com.ibm.gdsc.sdk.models.SortOrder;
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
 * ListDataStoresSortParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class ListDataStoresSortParameter {
  /**
   * Gets or Sets sortBy
   */
  @JsonAdapter(SortByEnum.Adapter.class)
  public enum SortByEnum {
    NAME("name"),
    
    STORETYPE("storeType"),
    
    CLOUDREGION("cloudRegion"),
    
    CLOUDACCOUNTID("cloudAccountId"),
    
    SENSITIVITIESCOUNT("sensitivitiesCount"),
    
    RESOURCESCOUNT("resourcesCount"),
    
    APPFLOWSCOUNT("appFlowsCount"),
    
    CONFIGFLOWSCOUNT("configFlowsCount");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortByEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SortByEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private SortByEnum sortBy;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrder sortOrder;

  public ListDataStoresSortParameter() {
  }

  public ListDataStoresSortParameter sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nonnull
  public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  public ListDataStoresSortParameter sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  public SortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDataStoresSortParameter listDataStoresSortParameter = (ListDataStoresSortParameter) o;
    return Objects.equals(this.sortBy, listDataStoresSortParameter.sortBy) &&
        Objects.equals(this.sortOrder, listDataStoresSortParameter.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataStoresSortParameter {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
    openapiFields.add("sortBy");
    openapiFields.add("sortOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sortBy");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListDataStoresSortParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListDataStoresSortParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDataStoresSortParameter is not found in the empty JSON string", ListDataStoresSortParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListDataStoresSortParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDataStoresSortParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListDataStoresSortParameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sortBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortBy").toString()));
      }
      // validate the required field `sortBy`
      SortByEnum.validateJsonElement(jsonObj.get("sortBy"));
      // validate the optional field `sortOrder`
      if (jsonObj.get("sortOrder") != null && !jsonObj.get("sortOrder").isJsonNull()) {
        SortOrder.validateJsonElement(jsonObj.get("sortOrder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListDataStoresSortParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDataStoresSortParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDataStoresSortParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDataStoresSortParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDataStoresSortParameter>() {
           @Override
           public void write(JsonWriter out, ListDataStoresSortParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDataStoresSortParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDataStoresSortParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDataStoresSortParameter
  * @throws IOException if the JSON string is invalid with respect to ListDataStoresSortParameter
  */
  public static ListDataStoresSortParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDataStoresSortParameter.class);
  }

 /**
  * Convert an instance of ListDataStoresSortParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

