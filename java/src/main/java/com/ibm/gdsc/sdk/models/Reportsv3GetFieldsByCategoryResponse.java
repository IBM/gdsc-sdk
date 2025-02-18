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
import com.ibm.gdsc.sdk.models.Reportsv3Header;
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
 * GetFieldsByCategoryResponse is the return type of the GetFieldsByCategory() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Reportsv3GetFieldsByCategoryResponse {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Reportsv3Header> headers = new ArrayList<>();

  public Reportsv3GetFieldsByCategoryResponse() {
  }

  public Reportsv3GetFieldsByCategoryResponse headers(List<Reportsv3Header> headers) {
    this.headers = headers;
    return this;
  }

  public Reportsv3GetFieldsByCategoryResponse addHeadersItem(Reportsv3Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Category fields.
   * @return headers
  **/
  @javax.annotation.Nullable
  public List<Reportsv3Header> getHeaders() {
    return headers;
  }

  public void setHeaders(List<Reportsv3Header> headers) {
    this.headers = headers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetFieldsByCategoryResponse reportsv3GetFieldsByCategoryResponse = (Reportsv3GetFieldsByCategoryResponse) o;
    return Objects.equals(this.headers, reportsv3GetFieldsByCategoryResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetFieldsByCategoryResponse {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
    openapiFields.add("headers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetFieldsByCategoryResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetFieldsByCategoryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetFieldsByCategoryResponse is not found in the empty JSON string", Reportsv3GetFieldsByCategoryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetFieldsByCategoryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetFieldsByCategoryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        JsonArray jsonArrayheaders = jsonObj.getAsJsonArray("headers");
        if (jsonArrayheaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("headers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `headers` to be an array in the JSON string but got `%s`", jsonObj.get("headers").toString()));
          }

          // validate the optional field `headers` (array)
          for (int i = 0; i < jsonArrayheaders.size(); i++) {
            Reportsv3Header.validateJsonElement(jsonArrayheaders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetFieldsByCategoryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetFieldsByCategoryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetFieldsByCategoryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetFieldsByCategoryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetFieldsByCategoryResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetFieldsByCategoryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetFieldsByCategoryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetFieldsByCategoryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetFieldsByCategoryResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetFieldsByCategoryResponse
  */
  public static Reportsv3GetFieldsByCategoryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetFieldsByCategoryResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetFieldsByCategoryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

