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
import com.ibm.gdsc.sdk.Snifassistv3Feedback;
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
 * PostSnifFeedbackRequest is the request message to post sniffer feedback for the installed policies.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-11T14:56:28.892451Z[UTC]", comments = "Generator version: 7.6.0")
public class Snifassistv3PostSnifFeedbackRequest {
  public static final String SERIALIZED_NAME_EDGE_ID = "edge_id";
  @SerializedName(SERIALIZED_NAME_EDGE_ID)
  private String edgeId;

  public static final String SERIALIZED_NAME_SNIF_FEEDBACK = "snif_feedback";
  @SerializedName(SERIALIZED_NAME_SNIF_FEEDBACK)
  private Snifassistv3Feedback snifFeedback;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public Snifassistv3PostSnifFeedbackRequest() {
  }

  public Snifassistv3PostSnifFeedbackRequest edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }

   /**
   * Specify edge_id if known.
   * @return edgeId
  **/
  @javax.annotation.Nullable
  public String getEdgeId() {
    return edgeId;
  }

  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }


  public Snifassistv3PostSnifFeedbackRequest snifFeedback(Snifassistv3Feedback snifFeedback) {
    this.snifFeedback = snifFeedback;
    return this;
  }

   /**
   * Get snifFeedback
   * @return snifFeedback
  **/
  @javax.annotation.Nullable
  public Snifassistv3Feedback getSnifFeedback() {
    return snifFeedback;
  }

  public void setSnifFeedback(Snifassistv3Feedback snifFeedback) {
    this.snifFeedback = snifFeedback;
  }


  public Snifassistv3PostSnifFeedbackRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Specify tenant_id.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snifassistv3PostSnifFeedbackRequest snifassistv3PostSnifFeedbackRequest = (Snifassistv3PostSnifFeedbackRequest) o;
    return Objects.equals(this.edgeId, snifassistv3PostSnifFeedbackRequest.edgeId) &&
        Objects.equals(this.snifFeedback, snifassistv3PostSnifFeedbackRequest.snifFeedback) &&
        Objects.equals(this.tenantId, snifassistv3PostSnifFeedbackRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeId, snifFeedback, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snifassistv3PostSnifFeedbackRequest {\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    snifFeedback: ").append(toIndentedString(snifFeedback)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
    openapiFields.add("edge_id");
    openapiFields.add("snif_feedback");
    openapiFields.add("tenant_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Snifassistv3PostSnifFeedbackRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Snifassistv3PostSnifFeedbackRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Snifassistv3PostSnifFeedbackRequest is not found in the empty JSON string", Snifassistv3PostSnifFeedbackRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Snifassistv3PostSnifFeedbackRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Snifassistv3PostSnifFeedbackRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("edge_id") != null && !jsonObj.get("edge_id").isJsonNull()) && !jsonObj.get("edge_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_id").toString()));
      }
      // validate the optional field `snif_feedback`
      if (jsonObj.get("snif_feedback") != null && !jsonObj.get("snif_feedback").isJsonNull()) {
        Snifassistv3Feedback.validateJsonElement(jsonObj.get("snif_feedback"));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Snifassistv3PostSnifFeedbackRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Snifassistv3PostSnifFeedbackRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Snifassistv3PostSnifFeedbackRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Snifassistv3PostSnifFeedbackRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Snifassistv3PostSnifFeedbackRequest>() {
           @Override
           public void write(JsonWriter out, Snifassistv3PostSnifFeedbackRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Snifassistv3PostSnifFeedbackRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Snifassistv3PostSnifFeedbackRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Snifassistv3PostSnifFeedbackRequest
  * @throws IOException if the JSON string is invalid with respect to Snifassistv3PostSnifFeedbackRequest
  */
  public static Snifassistv3PostSnifFeedbackRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Snifassistv3PostSnifFeedbackRequest.class);
  }

 /**
  * Convert an instance of Snifassistv3PostSnifFeedbackRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

