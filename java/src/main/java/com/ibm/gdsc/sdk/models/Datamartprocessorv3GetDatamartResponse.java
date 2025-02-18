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
import com.ibm.gdsc.sdk.models.Datamartprocessorv3DatamartInfo;
import com.ibm.gdsc.sdk.models.Datamartprocessorv3StatusResponseBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * GetDatamartResponse is the response message which will have all the datamarts for a time period.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Datamartprocessorv3GetDatamartResponse {
  public static final String SERIALIZED_NAME_DATAMARTS = "datamarts";
  @SerializedName(SERIALIZED_NAME_DATAMARTS)
  private List<Datamartprocessorv3DatamartInfo> datamarts = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Datamartprocessorv3StatusResponseBase status;

  public Datamartprocessorv3GetDatamartResponse() {
  }

  public Datamartprocessorv3GetDatamartResponse datamarts(List<Datamartprocessorv3DatamartInfo> datamarts) {
    this.datamarts = datamarts;
    return this;
  }

  public Datamartprocessorv3GetDatamartResponse addDatamartsItem(Datamartprocessorv3DatamartInfo datamartsItem) {
    if (this.datamarts == null) {
      this.datamarts = new ArrayList<>();
    }
    this.datamarts.add(datamartsItem);
    return this;
  }

   /**
   * List of datamarts returned by GetDatamarts().
   * @return datamarts
  **/
  @javax.annotation.Nullable
  public List<Datamartprocessorv3DatamartInfo> getDatamarts() {
    return datamarts;
  }

  public void setDatamarts(List<Datamartprocessorv3DatamartInfo> datamarts) {
    this.datamarts = datamarts;
  }


  public Datamartprocessorv3GetDatamartResponse status(Datamartprocessorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Datamartprocessorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Datamartprocessorv3StatusResponseBase status) {
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
    Datamartprocessorv3GetDatamartResponse datamartprocessorv3GetDatamartResponse = (Datamartprocessorv3GetDatamartResponse) o;
    return Objects.equals(this.datamarts, datamartprocessorv3GetDatamartResponse.datamarts) &&
        Objects.equals(this.status, datamartprocessorv3GetDatamartResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datamarts, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datamartprocessorv3GetDatamartResponse {\n");
    sb.append("    datamarts: ").append(toIndentedString(datamarts)).append("\n");
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
    openapiFields.add("datamarts");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Datamartprocessorv3GetDatamartResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Datamartprocessorv3GetDatamartResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datamartprocessorv3GetDatamartResponse is not found in the empty JSON string", Datamartprocessorv3GetDatamartResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Datamartprocessorv3GetDatamartResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datamartprocessorv3GetDatamartResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("datamarts") != null && !jsonObj.get("datamarts").isJsonNull()) {
        JsonArray jsonArraydatamarts = jsonObj.getAsJsonArray("datamarts");
        if (jsonArraydatamarts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datamarts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datamarts` to be an array in the JSON string but got `%s`", jsonObj.get("datamarts").toString()));
          }

          // validate the optional field `datamarts` (array)
          for (int i = 0; i < jsonArraydatamarts.size(); i++) {
            Datamartprocessorv3DatamartInfo.validateJsonElement(jsonArraydatamarts.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Datamartprocessorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Datamartprocessorv3GetDatamartResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datamartprocessorv3GetDatamartResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datamartprocessorv3GetDatamartResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datamartprocessorv3GetDatamartResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Datamartprocessorv3GetDatamartResponse>() {
           @Override
           public void write(JsonWriter out, Datamartprocessorv3GetDatamartResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datamartprocessorv3GetDatamartResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datamartprocessorv3GetDatamartResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datamartprocessorv3GetDatamartResponse
  * @throws IOException if the JSON string is invalid with respect to Datamartprocessorv3GetDatamartResponse
  */
  public static Datamartprocessorv3GetDatamartResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datamartprocessorv3GetDatamartResponse.class);
  }

 /**
  * Convert an instance of Datamartprocessorv3GetDatamartResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

