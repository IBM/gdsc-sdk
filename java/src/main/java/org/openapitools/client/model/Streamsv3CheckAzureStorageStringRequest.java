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
 * CheckAzureStorageStringRequest defines a request to verify Azure storage connection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Streamsv3CheckAzureStorageStringRequest {
  public static final String SERIALIZED_NAME_CONNECTION_STRING = "connection_string";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STRING)
  private String connectionString;

  public Streamsv3CheckAzureStorageStringRequest() {
  }

  public Streamsv3CheckAzureStorageStringRequest connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * Storage connection string.
   * @return connectionString
  **/
  @javax.annotation.Nullable
  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest = (Streamsv3CheckAzureStorageStringRequest) o;
    return Objects.equals(this.connectionString, streamsv3CheckAzureStorageStringRequest.connectionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Streamsv3CheckAzureStorageStringRequest {\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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
    openapiFields.add("connection_string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Streamsv3CheckAzureStorageStringRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Streamsv3CheckAzureStorageStringRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Streamsv3CheckAzureStorageStringRequest is not found in the empty JSON string", Streamsv3CheckAzureStorageStringRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Streamsv3CheckAzureStorageStringRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Streamsv3CheckAzureStorageStringRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("connection_string") != null && !jsonObj.get("connection_string").isJsonNull()) && !jsonObj.get("connection_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_string").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Streamsv3CheckAzureStorageStringRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Streamsv3CheckAzureStorageStringRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Streamsv3CheckAzureStorageStringRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Streamsv3CheckAzureStorageStringRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Streamsv3CheckAzureStorageStringRequest>() {
           @Override
           public void write(JsonWriter out, Streamsv3CheckAzureStorageStringRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Streamsv3CheckAzureStorageStringRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Streamsv3CheckAzureStorageStringRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Streamsv3CheckAzureStorageStringRequest
  * @throws IOException if the JSON string is invalid with respect to Streamsv3CheckAzureStorageStringRequest
  */
  public static Streamsv3CheckAzureStorageStringRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Streamsv3CheckAzureStorageStringRequest.class);
  }

 /**
  * Convert an instance of Streamsv3CheckAzureStorageStringRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

