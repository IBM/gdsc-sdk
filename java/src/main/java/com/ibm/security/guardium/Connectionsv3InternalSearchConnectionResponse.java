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
import com.ibm.security.guardium.Connectionsv3Connector;
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
 * Connectionsv3InternalSearchConnectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3InternalSearchConnectionResponse {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_CONNECTORS = "connectors";
  @SerializedName(SERIALIZED_NAME_CONNECTORS)
  private List<Connectionsv3Connector> connectors = new ArrayList<>();

  public Connectionsv3InternalSearchConnectionResponse() {
  }

  public Connectionsv3InternalSearchConnectionResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public Connectionsv3InternalSearchConnectionResponse connectors(List<Connectionsv3Connector> connectors) {
    this.connectors = connectors;
    return this;
  }

  public Connectionsv3InternalSearchConnectionResponse addConnectorsItem(Connectionsv3Connector connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

   /**
   * Get connectors
   * @return connectors
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3Connector> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<Connectionsv3Connector> connectors) {
    this.connectors = connectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3InternalSearchConnectionResponse connectionsv3InternalSearchConnectionResponse = (Connectionsv3InternalSearchConnectionResponse) o;
    return Objects.equals(this.status, connectionsv3InternalSearchConnectionResponse.status) &&
        Objects.equals(this.connectors, connectionsv3InternalSearchConnectionResponse.connectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, connectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3InternalSearchConnectionResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("connectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3InternalSearchConnectionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3InternalSearchConnectionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3InternalSearchConnectionResponse is not found in the empty JSON string", Connectionsv3InternalSearchConnectionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3InternalSearchConnectionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3InternalSearchConnectionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("connectors") != null && !jsonObj.get("connectors").isJsonNull()) {
        JsonArray jsonArrayconnectors = jsonObj.getAsJsonArray("connectors");
        if (jsonArrayconnectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("connectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connectors` to be an array in the JSON string but got `%s`", jsonObj.get("connectors").toString()));
          }

          // validate the optional field `connectors` (array)
          for (int i = 0; i < jsonArrayconnectors.size(); i++) {
            Connectionsv3Connector.validateJsonElement(jsonArrayconnectors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3InternalSearchConnectionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3InternalSearchConnectionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3InternalSearchConnectionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3InternalSearchConnectionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3InternalSearchConnectionResponse>() {
           @Override
           public void write(JsonWriter out, Connectionsv3InternalSearchConnectionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3InternalSearchConnectionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3InternalSearchConnectionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3InternalSearchConnectionResponse
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3InternalSearchConnectionResponse
  */
  public static Connectionsv3InternalSearchConnectionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3InternalSearchConnectionResponse.class);
  }

 /**
  * Convert an instance of Connectionsv3InternalSearchConnectionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

