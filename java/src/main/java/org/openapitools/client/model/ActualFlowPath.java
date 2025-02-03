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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccessType;
import org.openapitools.client.model.FlowNode;

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
 * ActualFlowPath
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class ActualFlowPath {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FLOW_ID = "flowId";
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private String flowId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FlowNode source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private FlowNode destination;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "accessType";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private AccessType accessType;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_TRUSTEE_ID = "trusteeId";
  @SerializedName(SERIALIZED_NAME_TRUSTEE_ID)
  private String trusteeId;

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private BigDecimal lastSeen;

  public static final String SERIALIZED_NAME_FIRST_SEEN = "firstSeen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private BigDecimal firstSeen;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private List<FlowNode> path = new ArrayList<>();

  public ActualFlowPath() {
  }

  public ActualFlowPath id(String id) {
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


  public ActualFlowPath flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }

   /**
   * Get flowId
   * @return flowId
  **/
  @javax.annotation.Nonnull
  public String getFlowId() {
    return flowId;
  }

  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public ActualFlowPath source(FlowNode source) {
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


  public ActualFlowPath destination(FlowNode destination) {
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


  public ActualFlowPath accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @javax.annotation.Nonnull
  public AccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


  public ActualFlowPath username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public ActualFlowPath trusteeId(String trusteeId) {
    this.trusteeId = trusteeId;
    return this;
  }

   /**
   * Get trusteeId
   * @return trusteeId
  **/
  @javax.annotation.Nullable
  public String getTrusteeId() {
    return trusteeId;
  }

  public void setTrusteeId(String trusteeId) {
    this.trusteeId = trusteeId;
  }


  public ActualFlowPath lastSeen(BigDecimal lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Epoch timestamp of the last time this path was seen
   * @return lastSeen
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(BigDecimal lastSeen) {
    this.lastSeen = lastSeen;
  }


  public ActualFlowPath firstSeen(BigDecimal firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

   /**
   * Epoch timestamp of the first time this flow was seen
   * @return firstSeen
  **/
  @javax.annotation.Nonnull
  public BigDecimal getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(BigDecimal firstSeen) {
    this.firstSeen = firstSeen;
  }


  public ActualFlowPath path(List<FlowNode> path) {
    this.path = path;
    return this;
  }

  public ActualFlowPath addPathItem(FlowNode pathItem) {
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
    ActualFlowPath actualFlowPath = (ActualFlowPath) o;
    return Objects.equals(this.id, actualFlowPath.id) &&
        Objects.equals(this.flowId, actualFlowPath.flowId) &&
        Objects.equals(this.source, actualFlowPath.source) &&
        Objects.equals(this.destination, actualFlowPath.destination) &&
        Objects.equals(this.accessType, actualFlowPath.accessType) &&
        Objects.equals(this.username, actualFlowPath.username) &&
        Objects.equals(this.trusteeId, actualFlowPath.trusteeId) &&
        Objects.equals(this.lastSeen, actualFlowPath.lastSeen) &&
        Objects.equals(this.firstSeen, actualFlowPath.firstSeen) &&
        Objects.equals(this.path, actualFlowPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flowId, source, destination, accessType, username, trusteeId, lastSeen, firstSeen, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualFlowPath {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    trusteeId: ").append(toIndentedString(trusteeId)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
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
    openapiFields.add("flowId");
    openapiFields.add("source");
    openapiFields.add("destination");
    openapiFields.add("accessType");
    openapiFields.add("username");
    openapiFields.add("trusteeId");
    openapiFields.add("lastSeen");
    openapiFields.add("firstSeen");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("flowId");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("destination");
    openapiRequiredFields.add("accessType");
    openapiRequiredFields.add("lastSeen");
    openapiRequiredFields.add("firstSeen");
    openapiRequiredFields.add("path");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ActualFlowPath
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ActualFlowPath.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActualFlowPath is not found in the empty JSON string", ActualFlowPath.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ActualFlowPath.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActualFlowPath` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ActualFlowPath.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("flowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flowId").toString()));
      }
      // validate the required field `source`
      FlowNode.validateJsonElement(jsonObj.get("source"));
      // validate the required field `destination`
      FlowNode.validateJsonElement(jsonObj.get("destination"));
      // validate the required field `accessType`
      AccessType.validateJsonElement(jsonObj.get("accessType"));
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("trusteeId") != null && !jsonObj.get("trusteeId").isJsonNull()) && !jsonObj.get("trusteeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trusteeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trusteeId").toString()));
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
       if (!ActualFlowPath.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActualFlowPath' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActualFlowPath> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActualFlowPath.class));

       return (TypeAdapter<T>) new TypeAdapter<ActualFlowPath>() {
           @Override
           public void write(JsonWriter out, ActualFlowPath value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActualFlowPath read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActualFlowPath given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActualFlowPath
  * @throws IOException if the JSON string is invalid with respect to ActualFlowPath
  */
  public static ActualFlowPath fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActualFlowPath.class);
  }

 /**
  * Convert an instance of ActualFlowPath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

