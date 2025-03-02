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
import org.openapitools.client.model.Datamartprocessorv3DatamartInfo;
import org.openapitools.client.model.Datamartprocessorv3StatusResponseBase;

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
 * GetDatamartInfoResponse is the response message which will have all file info in datamart.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Datamartprocessorv3GetDatamartInfoResponse {
  public static final String SERIALIZED_NAME_DATAMART = "datamart";
  @SerializedName(SERIALIZED_NAME_DATAMART)
  private Datamartprocessorv3DatamartInfo datamart;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Datamartprocessorv3StatusResponseBase status;

  public Datamartprocessorv3GetDatamartInfoResponse() {
  }

  public Datamartprocessorv3GetDatamartInfoResponse datamart(Datamartprocessorv3DatamartInfo datamart) {
    this.datamart = datamart;
    return this;
  }

   /**
   * Get datamart
   * @return datamart
  **/
  @javax.annotation.Nullable
  public Datamartprocessorv3DatamartInfo getDatamart() {
    return datamart;
  }

  public void setDatamart(Datamartprocessorv3DatamartInfo datamart) {
    this.datamart = datamart;
  }


  public Datamartprocessorv3GetDatamartInfoResponse status(Datamartprocessorv3StatusResponseBase status) {
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
    Datamartprocessorv3GetDatamartInfoResponse datamartprocessorv3GetDatamartInfoResponse = (Datamartprocessorv3GetDatamartInfoResponse) o;
    return Objects.equals(this.datamart, datamartprocessorv3GetDatamartInfoResponse.datamart) &&
        Objects.equals(this.status, datamartprocessorv3GetDatamartInfoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datamart, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Datamartprocessorv3GetDatamartInfoResponse {\n");
    sb.append("    datamart: ").append(toIndentedString(datamart)).append("\n");
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
    openapiFields.add("datamart");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Datamartprocessorv3GetDatamartInfoResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Datamartprocessorv3GetDatamartInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Datamartprocessorv3GetDatamartInfoResponse is not found in the empty JSON string", Datamartprocessorv3GetDatamartInfoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Datamartprocessorv3GetDatamartInfoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Datamartprocessorv3GetDatamartInfoResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `datamart`
      if (jsonObj.get("datamart") != null && !jsonObj.get("datamart").isJsonNull()) {
        Datamartprocessorv3DatamartInfo.validateJsonElement(jsonObj.get("datamart"));
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
       if (!Datamartprocessorv3GetDatamartInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Datamartprocessorv3GetDatamartInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Datamartprocessorv3GetDatamartInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Datamartprocessorv3GetDatamartInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Datamartprocessorv3GetDatamartInfoResponse>() {
           @Override
           public void write(JsonWriter out, Datamartprocessorv3GetDatamartInfoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Datamartprocessorv3GetDatamartInfoResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Datamartprocessorv3GetDatamartInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Datamartprocessorv3GetDatamartInfoResponse
  * @throws IOException if the JSON string is invalid with respect to Datamartprocessorv3GetDatamartInfoResponse
  */
  public static Datamartprocessorv3GetDatamartInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Datamartprocessorv3GetDatamartInfoResponse.class);
  }

 /**
  * Convert an instance of Datamartprocessorv3GetDatamartInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

