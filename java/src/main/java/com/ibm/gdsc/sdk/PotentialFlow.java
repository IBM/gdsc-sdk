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
 * PotentialFlow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class PotentialFlow {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_PATHS_COUNT = "pathsCount";
  @SerializedName(SERIALIZED_NAME_PATHS_COUNT)
  private BigDecimal pathsCount;

  public static final String SERIALIZED_NAME_PERMITTED_OPERATIONS = "permittedOperations";
  @SerializedName(SERIALIZED_NAME_PERMITTED_OPERATIONS)
  private List<String> permittedOperations = new ArrayList<>();

  public PotentialFlow() {
  }

  public PotentialFlow id(String id) {
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


  public PotentialFlow type(String type) {
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


  public PotentialFlow source(FlowNode source) {
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


  public PotentialFlow destination(FlowNode destination) {
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


  public PotentialFlow accessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public PotentialFlow addAccessTypesItem(AccessType accessTypesItem) {
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


  public PotentialFlow pathsCount(BigDecimal pathsCount) {
    this.pathsCount = pathsCount;
    return this;
  }

   /**
   * Get pathsCount
   * @return pathsCount
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPathsCount() {
    return pathsCount;
  }

  public void setPathsCount(BigDecimal pathsCount) {
    this.pathsCount = pathsCount;
  }


  public PotentialFlow permittedOperations(List<String> permittedOperations) {
    this.permittedOperations = permittedOperations;
    return this;
  }

  public PotentialFlow addPermittedOperationsItem(String permittedOperationsItem) {
    if (this.permittedOperations == null) {
      this.permittedOperations = new ArrayList<>();
    }
    this.permittedOperations.add(permittedOperationsItem);
    return this;
  }

   /**
   * Get permittedOperations
   * @return permittedOperations
  **/
  @javax.annotation.Nonnull
  public List<String> getPermittedOperations() {
    return permittedOperations;
  }

  public void setPermittedOperations(List<String> permittedOperations) {
    this.permittedOperations = permittedOperations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotentialFlow potentialFlow = (PotentialFlow) o;
    return Objects.equals(this.id, potentialFlow.id) &&
        Objects.equals(this.type, potentialFlow.type) &&
        Objects.equals(this.source, potentialFlow.source) &&
        Objects.equals(this.destination, potentialFlow.destination) &&
        Objects.equals(this.accessTypes, potentialFlow.accessTypes) &&
        Objects.equals(this.pathsCount, potentialFlow.pathsCount) &&
        Objects.equals(this.permittedOperations, potentialFlow.permittedOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, source, destination, accessTypes, pathsCount, permittedOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotentialFlow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    pathsCount: ").append(toIndentedString(pathsCount)).append("\n");
    sb.append("    permittedOperations: ").append(toIndentedString(permittedOperations)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("source");
    openapiFields.add("destination");
    openapiFields.add("accessTypes");
    openapiFields.add("pathsCount");
    openapiFields.add("permittedOperations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("accessTypes");
    openapiRequiredFields.add("pathsCount");
    openapiRequiredFields.add("permittedOperations");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PotentialFlow
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PotentialFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PotentialFlow is not found in the empty JSON string", PotentialFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PotentialFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PotentialFlow` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PotentialFlow.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      // ensure the required json array is present
      if (jsonObj.get("permittedOperations") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("permittedOperations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permittedOperations` to be an array in the JSON string but got `%s`", jsonObj.get("permittedOperations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PotentialFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PotentialFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PotentialFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PotentialFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<PotentialFlow>() {
           @Override
           public void write(JsonWriter out, PotentialFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PotentialFlow read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PotentialFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PotentialFlow
  * @throws IOException if the JSON string is invalid with respect to PotentialFlow
  */
  public static PotentialFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PotentialFlow.class);
  }

 /**
  * Convert an instance of PotentialFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

