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
import com.ibm.security.guardium.GooglerpcStatus;
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
 * Returns the number of rows that can be purged.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Ecosystemv3GetPurgableRowsResponse {
  public static final String SERIALIZED_NAME_PURGABLE_ROWS = "purgable_rows";
  @SerializedName(SERIALIZED_NAME_PURGABLE_ROWS)
  private Integer purgableRows;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GooglerpcStatus status;

  public Ecosystemv3GetPurgableRowsResponse() {
  }

  public Ecosystemv3GetPurgableRowsResponse purgableRows(Integer purgableRows) {
    this.purgableRows = purgableRows;
    return this;
  }

   /**
   * Number of rows that can be purged.
   * @return purgableRows
  **/
  @javax.annotation.Nullable
  public Integer getPurgableRows() {
    return purgableRows;
  }

  public void setPurgableRows(Integer purgableRows) {
    this.purgableRows = purgableRows;
  }


  public Ecosystemv3GetPurgableRowsResponse status(GooglerpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public GooglerpcStatus getStatus() {
    return status;
  }

  public void setStatus(GooglerpcStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecosystemv3GetPurgableRowsResponse ecosystemv3GetPurgableRowsResponse = (Ecosystemv3GetPurgableRowsResponse) o;
    return Objects.equals(this.purgableRows, ecosystemv3GetPurgableRowsResponse.purgableRows) &&
        Objects.equals(this.status, ecosystemv3GetPurgableRowsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purgableRows, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecosystemv3GetPurgableRowsResponse {\n");
    sb.append("    purgableRows: ").append(toIndentedString(purgableRows)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("purgable_rows");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Ecosystemv3GetPurgableRowsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Ecosystemv3GetPurgableRowsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Ecosystemv3GetPurgableRowsResponse is not found in the empty JSON string", Ecosystemv3GetPurgableRowsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Ecosystemv3GetPurgableRowsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Ecosystemv3GetPurgableRowsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        GooglerpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Ecosystemv3GetPurgableRowsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Ecosystemv3GetPurgableRowsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Ecosystemv3GetPurgableRowsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Ecosystemv3GetPurgableRowsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Ecosystemv3GetPurgableRowsResponse>() {
           @Override
           public void write(JsonWriter out, Ecosystemv3GetPurgableRowsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Ecosystemv3GetPurgableRowsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Ecosystemv3GetPurgableRowsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Ecosystemv3GetPurgableRowsResponse
  * @throws IOException if the JSON string is invalid with respect to Ecosystemv3GetPurgableRowsResponse
  */
  public static Ecosystemv3GetPurgableRowsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Ecosystemv3GetPurgableRowsResponse.class);
  }

 /**
  * Convert an instance of Ecosystemv3GetPurgableRowsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

