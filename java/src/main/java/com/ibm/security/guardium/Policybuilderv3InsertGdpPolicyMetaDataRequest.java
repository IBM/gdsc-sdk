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
import com.ibm.security.guardium.Policybuilderv3GdpPolicyObject;
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

import com.ibm.security.JSON;

/**
 * Request object containing a list of objects.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3InsertGdpPolicyMetaDataRequest {
  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Policybuilderv3GdpPolicyObject> data = new ArrayList<>();

  public Policybuilderv3InsertGdpPolicyMetaDataRequest() {
  }

  public Policybuilderv3InsertGdpPolicyMetaDataRequest centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * ID of central manager.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Policybuilderv3InsertGdpPolicyMetaDataRequest data(List<Policybuilderv3GdpPolicyObject> data) {
    this.data = data;
    return this;
  }

  public Policybuilderv3InsertGdpPolicyMetaDataRequest addDataItem(Policybuilderv3GdpPolicyObject dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3GdpPolicyObject> getData() {
    return data;
  }

  public void setData(List<Policybuilderv3GdpPolicyObject> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3InsertGdpPolicyMetaDataRequest policybuilderv3InsertGdpPolicyMetaDataRequest = (Policybuilderv3InsertGdpPolicyMetaDataRequest) o;
    return Objects.equals(this.centralManagerId, policybuilderv3InsertGdpPolicyMetaDataRequest.centralManagerId) &&
        Objects.equals(this.data, policybuilderv3InsertGdpPolicyMetaDataRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralManagerId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3InsertGdpPolicyMetaDataRequest {\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("central_manager_id");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3InsertGdpPolicyMetaDataRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3InsertGdpPolicyMetaDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3InsertGdpPolicyMetaDataRequest is not found in the empty JSON string", Policybuilderv3InsertGdpPolicyMetaDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3InsertGdpPolicyMetaDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3InsertGdpPolicyMetaDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            Policybuilderv3GdpPolicyObject.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3InsertGdpPolicyMetaDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3InsertGdpPolicyMetaDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3InsertGdpPolicyMetaDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3InsertGdpPolicyMetaDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3InsertGdpPolicyMetaDataRequest>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3InsertGdpPolicyMetaDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3InsertGdpPolicyMetaDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3InsertGdpPolicyMetaDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3InsertGdpPolicyMetaDataRequest
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3InsertGdpPolicyMetaDataRequest
  */
  public static Policybuilderv3InsertGdpPolicyMetaDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3InsertGdpPolicyMetaDataRequest.class);
  }

 /**
  * Convert an instance of Policybuilderv3InsertGdpPolicyMetaDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

