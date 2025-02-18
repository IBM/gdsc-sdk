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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.RpcStatus;
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

import com.ibm.gdsc.JSON;

/**
 * DatasourceResponse is a return type of CRUD operation on UC datasource configuration (as it saved in mongo / configuration service).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Universalconnectormanagerv3DatasourceResponse {
  public static final String SERIALIZED_NAME_DATASOURCE_ID = "datasource_id";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_ID)
  private String datasourceId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RpcStatus status;

  public Universalconnectormanagerv3DatasourceResponse() {
  }

  public Universalconnectormanagerv3DatasourceResponse datasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * Configuration id of datasource.
   * @return datasourceId
  **/
  @javax.annotation.Nullable
  public String getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
  }


  public Universalconnectormanagerv3DatasourceResponse status(RpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RpcStatus getStatus() {
    return status;
  }

  public void setStatus(RpcStatus status) {
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
    Universalconnectormanagerv3DatasourceResponse universalconnectormanagerv3DatasourceResponse = (Universalconnectormanagerv3DatasourceResponse) o;
    return Objects.equals(this.datasourceId, universalconnectormanagerv3DatasourceResponse.datasourceId) &&
        Objects.equals(this.status, universalconnectormanagerv3DatasourceResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Universalconnectormanagerv3DatasourceResponse {\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
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
    openapiFields.add("datasource_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Universalconnectormanagerv3DatasourceResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Universalconnectormanagerv3DatasourceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Universalconnectormanagerv3DatasourceResponse is not found in the empty JSON string", Universalconnectormanagerv3DatasourceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Universalconnectormanagerv3DatasourceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Universalconnectormanagerv3DatasourceResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datasource_id") != null && !jsonObj.get("datasource_id").isJsonNull()) && !jsonObj.get("datasource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasource_id").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Universalconnectormanagerv3DatasourceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Universalconnectormanagerv3DatasourceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Universalconnectormanagerv3DatasourceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Universalconnectormanagerv3DatasourceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Universalconnectormanagerv3DatasourceResponse>() {
           @Override
           public void write(JsonWriter out, Universalconnectormanagerv3DatasourceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Universalconnectormanagerv3DatasourceResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Universalconnectormanagerv3DatasourceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Universalconnectormanagerv3DatasourceResponse
  * @throws IOException if the JSON string is invalid with respect to Universalconnectormanagerv3DatasourceResponse
  */
  public static Universalconnectormanagerv3DatasourceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Universalconnectormanagerv3DatasourceResponse.class);
  }

 /**
  * Convert an instance of Universalconnectormanagerv3DatasourceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

