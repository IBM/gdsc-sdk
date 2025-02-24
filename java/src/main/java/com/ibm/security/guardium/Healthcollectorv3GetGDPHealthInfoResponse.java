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
import com.ibm.security.guardium.Healthcollectorv3CMNodeObject;
import com.ibm.security.guardium.Healthcollectorv3StatusResponseBase;
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
 * Healthcollectorv3GetGDPHealthInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3GetGDPHealthInfoResponse {
  public static final String SERIALIZED_NAME_ALL_NODES = "all_nodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  private List<Healthcollectorv3CMNodeObject> allNodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Healthcollectorv3StatusResponseBase status;

  public Healthcollectorv3GetGDPHealthInfoResponse() {
  }

  public Healthcollectorv3GetGDPHealthInfoResponse allNodes(List<Healthcollectorv3CMNodeObject> allNodes) {
    this.allNodes = allNodes;
    return this;
  }

  public Healthcollectorv3GetGDPHealthInfoResponse addAllNodesItem(Healthcollectorv3CMNodeObject allNodesItem) {
    if (this.allNodes == null) {
      this.allNodes = new ArrayList<>();
    }
    this.allNodes.add(allNodesItem);
    return this;
  }

   /**
   * List of managed units and monitoring agents associated with the central manager.
   * @return allNodes
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3CMNodeObject> getAllNodes() {
    return allNodes;
  }

  public void setAllNodes(List<Healthcollectorv3CMNodeObject> allNodes) {
    this.allNodes = allNodes;
  }


  public Healthcollectorv3GetGDPHealthInfoResponse status(Healthcollectorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Healthcollectorv3StatusResponseBase status) {
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
    Healthcollectorv3GetGDPHealthInfoResponse healthcollectorv3GetGDPHealthInfoResponse = (Healthcollectorv3GetGDPHealthInfoResponse) o;
    return Objects.equals(this.allNodes, healthcollectorv3GetGDPHealthInfoResponse.allNodes) &&
        Objects.equals(this.status, healthcollectorv3GetGDPHealthInfoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNodes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3GetGDPHealthInfoResponse {\n");
    sb.append("    allNodes: ").append(toIndentedString(allNodes)).append("\n");
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
    openapiFields.add("all_nodes");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3GetGDPHealthInfoResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3GetGDPHealthInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3GetGDPHealthInfoResponse is not found in the empty JSON string", Healthcollectorv3GetGDPHealthInfoResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3GetGDPHealthInfoResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3GetGDPHealthInfoResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("all_nodes") != null && !jsonObj.get("all_nodes").isJsonNull()) {
        JsonArray jsonArrayallNodes = jsonObj.getAsJsonArray("all_nodes");
        if (jsonArrayallNodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("all_nodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `all_nodes` to be an array in the JSON string but got `%s`", jsonObj.get("all_nodes").toString()));
          }

          // validate the optional field `all_nodes` (array)
          for (int i = 0; i < jsonArrayallNodes.size(); i++) {
            Healthcollectorv3CMNodeObject.validateJsonElement(jsonArrayallNodes.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Healthcollectorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3GetGDPHealthInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3GetGDPHealthInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3GetGDPHealthInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3GetGDPHealthInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3GetGDPHealthInfoResponse>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3GetGDPHealthInfoResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3GetGDPHealthInfoResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3GetGDPHealthInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3GetGDPHealthInfoResponse
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3GetGDPHealthInfoResponse
  */
  public static Healthcollectorv3GetGDPHealthInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3GetGDPHealthInfoResponse.class);
  }

 /**
  * Convert an instance of Healthcollectorv3GetGDPHealthInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

