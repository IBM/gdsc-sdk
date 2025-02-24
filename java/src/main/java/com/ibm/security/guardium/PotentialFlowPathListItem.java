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
import com.ibm.security.guardium.AccessType;
import com.ibm.security.guardium.FlowNode;
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
 * PotentialFlowPathListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class PotentialFlowPathListItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_POTENTIAL_FLOW_ID = "potentialFlowId";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_FLOW_ID)
  private String potentialFlowId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FlowNode source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private FlowNode destination;

  public static final String SERIALIZED_NAME_ACCESS_TYPES = "accessTypes";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPES)
  private List<AccessType> accessTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private List<FlowNode> path = new ArrayList<>();

  public PotentialFlowPathListItem() {
  }

  public PotentialFlowPathListItem id(String id) {
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


  public PotentialFlowPathListItem potentialFlowId(String potentialFlowId) {
    this.potentialFlowId = potentialFlowId;
    return this;
  }

   /**
   * Get potentialFlowId
   * @return potentialFlowId
  **/
  @javax.annotation.Nonnull
  public String getPotentialFlowId() {
    return potentialFlowId;
  }

  public void setPotentialFlowId(String potentialFlowId) {
    this.potentialFlowId = potentialFlowId;
  }


  public PotentialFlowPathListItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PotentialFlowPathListItem source(FlowNode source) {
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


  public PotentialFlowPathListItem destination(FlowNode destination) {
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


  public PotentialFlowPathListItem accessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public PotentialFlowPathListItem addAccessTypesItem(AccessType accessTypesItem) {
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


  public PotentialFlowPathListItem path(List<FlowNode> path) {
    this.path = path;
    return this;
  }

  public PotentialFlowPathListItem addPathItem(FlowNode pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  public List<FlowNode> getPath() {
    return path;
  }

  public void setPath(List<FlowNode> path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotentialFlowPathListItem potentialFlowPathListItem = (PotentialFlowPathListItem) o;
    return Objects.equals(this.id, potentialFlowPathListItem.id) &&
        Objects.equals(this.potentialFlowId, potentialFlowPathListItem.potentialFlowId) &&
        Objects.equals(this.type, potentialFlowPathListItem.type) &&
        Objects.equals(this.source, potentialFlowPathListItem.source) &&
        Objects.equals(this.destination, potentialFlowPathListItem.destination) &&
        Objects.equals(this.accessTypes, potentialFlowPathListItem.accessTypes) &&
        Objects.equals(this.path, potentialFlowPathListItem.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, potentialFlowId, type, source, destination, accessTypes, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotentialFlowPathListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    potentialFlowId: ").append(toIndentedString(potentialFlowId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("potentialFlowId");
    openapiFields.add("type");
    openapiFields.add("source");
    openapiFields.add("destination");
    openapiFields.add("accessTypes");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("potentialFlowId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("accessTypes");
    openapiRequiredFields.add("path");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PotentialFlowPathListItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PotentialFlowPathListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PotentialFlowPathListItem is not found in the empty JSON string", PotentialFlowPathListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PotentialFlowPathListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PotentialFlowPathListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PotentialFlowPathListItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("potentialFlowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `potentialFlowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("potentialFlowId").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
      // ensure the json data is an array
      if (!jsonObj.get("path").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be an array in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }

      JsonArray jsonArraypath = jsonObj.getAsJsonArray("path");
      // validate the required field `path` (array)
      for (int i = 0; i < jsonArraypath.size(); i++) {
        FlowNode.validateJsonElement(jsonArraypath.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PotentialFlowPathListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PotentialFlowPathListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PotentialFlowPathListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PotentialFlowPathListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PotentialFlowPathListItem>() {
           @Override
           public void write(JsonWriter out, PotentialFlowPathListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PotentialFlowPathListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PotentialFlowPathListItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PotentialFlowPathListItem
  * @throws IOException if the JSON string is invalid with respect to PotentialFlowPathListItem
  */
  public static PotentialFlowPathListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PotentialFlowPathListItem.class);
  }

 /**
  * Convert an instance of PotentialFlowPathListItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

