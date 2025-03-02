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
import com.ibm.security.guardium.Policybuilderv3ActivationStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Policybuilderv3EdgeActivationObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3EdgeActivationObject {
  public static final String SERIALIZED_NAME_ACTIVATION_ORDER = "activation_order";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_ORDER)
  private Integer activationOrder;

  public static final String SERIALIZED_NAME_ACTIVATION_STATUS = "activation_status";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_STATUS)
  private Policybuilderv3ActivationStatus activationStatus = Policybuilderv3ActivationStatus.NOT_ACTIVATED;

  public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP = "activation_timestamp";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP)
  private OffsetDateTime activationTimestamp;

  public static final String SERIALIZED_NAME_EDGE_ID = "edge_id";
  @SerializedName(SERIALIZED_NAME_EDGE_ID)
  private String edgeId;

  public Policybuilderv3EdgeActivationObject() {
  }

  public Policybuilderv3EdgeActivationObject activationOrder(Integer activationOrder) {
    this.activationOrder = activationOrder;
    return this;
  }

   /**
   * Get activationOrder
   * @return activationOrder
  **/
  @javax.annotation.Nullable
  public Integer getActivationOrder() {
    return activationOrder;
  }

  public void setActivationOrder(Integer activationOrder) {
    this.activationOrder = activationOrder;
  }


  public Policybuilderv3EdgeActivationObject activationStatus(Policybuilderv3ActivationStatus activationStatus) {
    this.activationStatus = activationStatus;
    return this;
  }

   /**
   * Get activationStatus
   * @return activationStatus
  **/
  @javax.annotation.Nullable
  public Policybuilderv3ActivationStatus getActivationStatus() {
    return activationStatus;
  }

  public void setActivationStatus(Policybuilderv3ActivationStatus activationStatus) {
    this.activationStatus = activationStatus;
  }


  public Policybuilderv3EdgeActivationObject activationTimestamp(OffsetDateTime activationTimestamp) {
    this.activationTimestamp = activationTimestamp;
    return this;
  }

   /**
   * Get activationTimestamp
   * @return activationTimestamp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getActivationTimestamp() {
    return activationTimestamp;
  }

  public void setActivationTimestamp(OffsetDateTime activationTimestamp) {
    this.activationTimestamp = activationTimestamp;
  }


  public Policybuilderv3EdgeActivationObject edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }

   /**
   * Get edgeId
   * @return edgeId
  **/
  @javax.annotation.Nullable
  public String getEdgeId() {
    return edgeId;
  }

  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3EdgeActivationObject policybuilderv3EdgeActivationObject = (Policybuilderv3EdgeActivationObject) o;
    return Objects.equals(this.activationOrder, policybuilderv3EdgeActivationObject.activationOrder) &&
        Objects.equals(this.activationStatus, policybuilderv3EdgeActivationObject.activationStatus) &&
        Objects.equals(this.activationTimestamp, policybuilderv3EdgeActivationObject.activationTimestamp) &&
        Objects.equals(this.edgeId, policybuilderv3EdgeActivationObject.edgeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationOrder, activationStatus, activationTimestamp, edgeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3EdgeActivationObject {\n");
    sb.append("    activationOrder: ").append(toIndentedString(activationOrder)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
    sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
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
    openapiFields.add("activation_order");
    openapiFields.add("activation_status");
    openapiFields.add("activation_timestamp");
    openapiFields.add("edge_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3EdgeActivationObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3EdgeActivationObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3EdgeActivationObject is not found in the empty JSON string", Policybuilderv3EdgeActivationObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3EdgeActivationObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3EdgeActivationObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `activation_status`
      if (jsonObj.get("activation_status") != null && !jsonObj.get("activation_status").isJsonNull()) {
        Policybuilderv3ActivationStatus.validateJsonElement(jsonObj.get("activation_status"));
      }
      if ((jsonObj.get("edge_id") != null && !jsonObj.get("edge_id").isJsonNull()) && !jsonObj.get("edge_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3EdgeActivationObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3EdgeActivationObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3EdgeActivationObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3EdgeActivationObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3EdgeActivationObject>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3EdgeActivationObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3EdgeActivationObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3EdgeActivationObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3EdgeActivationObject
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3EdgeActivationObject
  */
  public static Policybuilderv3EdgeActivationObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3EdgeActivationObject.class);
  }

 /**
  * Convert an instance of Policybuilderv3EdgeActivationObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

