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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.AccessType;
import com.ibm.gdsc.sdk.FlowNode;
import java.io.IOException;
import java.math.BigDecimal;
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

import com.ibm.gdsc.JSON;

/**
 * ActualFlow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class ActualFlow {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FlowNode source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private FlowNode destination;

  public static final String SERIALIZED_NAME_ACCESS_TYPES = "accessTypes";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPES)
  private List<AccessType> accessTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private BigDecimal lastSeen;

  public static final String SERIALIZED_NAME_FIRST_SEEN = "firstSeen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private BigDecimal firstSeen;

  public ActualFlow() {
  }

  public ActualFlow id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ActualFlow source(FlowNode source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public FlowNode getSource() {
    return source;
  }

  public void setSource(FlowNode source) {
    this.source = source;
  }


  public ActualFlow destination(FlowNode destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  public FlowNode getDestination() {
    return destination;
  }

  public void setDestination(FlowNode destination) {
    this.destination = destination;
  }


  public ActualFlow accessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public ActualFlow addAccessTypesItem(AccessType accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * Get accessTypes
   * @return accessTypes
  **/
  @javax.annotation.Nonnull
  public List<AccessType> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
  }


  public ActualFlow lastSeen(BigDecimal lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Epoch timestamp of the last time this flow was seen
   * @return lastSeen
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(BigDecimal lastSeen) {
    this.lastSeen = lastSeen;
  }


  public ActualFlow firstSeen(BigDecimal firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

   /**
   * Epoch timestamp of the first time this flow was seen
   * @return firstSeen
  **/
  @javax.annotation.Nullable
  public BigDecimal getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(BigDecimal firstSeen) {
    this.firstSeen = firstSeen;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualFlow actualFlow = (ActualFlow) o;
    return Objects.equals(this.id, actualFlow.id) &&
        Objects.equals(this.source, actualFlow.source) &&
        Objects.equals(this.destination, actualFlow.destination) &&
        Objects.equals(this.accessTypes, actualFlow.accessTypes) &&
        Objects.equals(this.lastSeen, actualFlow.lastSeen) &&
        Objects.equals(this.firstSeen, actualFlow.firstSeen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, destination, accessTypes, lastSeen, firstSeen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualFlow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("source");
    openapiFields.add("destination");
    openapiFields.add("accessTypes");
    openapiFields.add("lastSeen");
    openapiFields.add("firstSeen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("accessTypes");
    openapiRequiredFields.add("lastSeen");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ActualFlow
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActualFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActualFlow is not found in the empty JSON string", ActualFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActualFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActualFlow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActualFlow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `source`
      FlowNode.validateJsonElement(jsonObj.get("source"));
      // validate the required field `destination`
      FlowNode.validateJsonElement(jsonObj.get("destination"));
      // ensure the required json array is present
      if (jsonObj.get("accessTypes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accessTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTypes` to be an array in the JSON string but got `%s`", jsonObj.get("accessTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActualFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActualFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActualFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActualFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<ActualFlow>() {
           @Override
           public void write(JsonWriter out, ActualFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActualFlow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActualFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActualFlow
  * @throws IOException if the JSON string is invalid with respect to ActualFlow
  */
  public static ActualFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActualFlow.class);
  }

 /**
  * Convert an instance of ActualFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

