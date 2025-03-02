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
import com.ibm.security.guardium.Ecosystemv3DatasetDetail;
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
 * All the details to save a dataset definition into the database.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3CreateDatasetRequest {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private Ecosystemv3DatasetDetail detail;

  public static final String SERIALIZED_NAME_IS_NEW = "is_new";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private Boolean isNew;

  public Ecosystemv3CreateDatasetRequest() {
  }

  public Ecosystemv3CreateDatasetRequest detail(Ecosystemv3DatasetDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  public Ecosystemv3DatasetDetail getDetail() {
    return detail;
  }

  public void setDetail(Ecosystemv3DatasetDetail detail) {
    this.detail = detail;
  }


  public Ecosystemv3CreateDatasetRequest isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

   /**
   * If it is a new dataset or existing one.
   * @return isNew
  **/
  @javax.annotation.Nullable
  public Boolean getIsNew() {
    return isNew;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3CreateDatasetRequest ecosystemv3CreateDatasetRequest = (Ecosystemv3CreateDatasetRequest) o;
    return Objects.equals(this.detail, ecosystemv3CreateDatasetRequest.detail) &&
        Objects.equals(this.isNew, ecosystemv3CreateDatasetRequest.isNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, isNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3CreateDatasetRequest {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
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
    openapiFields.add("detail");
    openapiFields.add("is_new");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3CreateDatasetRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3CreateDatasetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3CreateDatasetRequest is not found in the empty JSON string", Ecosystemv3CreateDatasetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3CreateDatasetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3CreateDatasetRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `detail`
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) {
        Ecosystemv3DatasetDetail.validateJsonElement(jsonObj.get("detail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3CreateDatasetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3CreateDatasetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3CreateDatasetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3CreateDatasetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3CreateDatasetRequest>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3CreateDatasetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3CreateDatasetRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3CreateDatasetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3CreateDatasetRequest
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3CreateDatasetRequest
  */
  public static Ecosystemv3CreateDatasetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3CreateDatasetRequest.class);
  }

 /**
  * Convert an instance of Ecosystemv3CreateDatasetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

