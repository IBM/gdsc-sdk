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
import com.ibm.gdsc.sdk.CloudServiceProvider;
import com.ibm.gdsc.sdk.FlowNodeResource;
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
 * FlowNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class FlowNode {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CLOUD_ACCOUNT_ID = "cloudAccountId";
  @SerializedName(SERIALIZED_NAME_CLOUD_ACCOUNT_ID)
  private String cloudAccountId;

  public static final String SERIALIZED_NAME_CLOUD_REGION = "cloudRegion";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGION)
  private String cloudRegion;

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloudProvider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private CloudServiceProvider cloudProvider;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private FlowNodeResource resource;

  public static final String SERIALIZED_NAME_VENDOR_ID = "vendorId";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public FlowNode() {
  }

  public FlowNode id(String id) {
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


  public FlowNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public FlowNode type(String type) {
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


  public FlowNode cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nonnull
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public FlowNode cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

   /**
   * Get cloudRegion
   * @return cloudRegion
  **/
  @javax.annotation.Nullable
  public String getCloudRegion() {
    return cloudRegion;
  }

  public void setCloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  public FlowNode cloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Get cloudProvider
   * @return cloudProvider
  **/
  @javax.annotation.Nonnull
  public CloudServiceProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudServiceProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public FlowNode resource(FlowNodeResource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  public FlowNodeResource getResource() {
    return resource;
  }

  public void setResource(FlowNodeResource resource) {
    this.resource = resource;
  }


  public FlowNode vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @javax.annotation.Nullable
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowNode flowNode = (FlowNode) o;
    return Objects.equals(this.id, flowNode.id) &&
        Objects.equals(this.name, flowNode.name) &&
        Objects.equals(this.type, flowNode.type) &&
        Objects.equals(this.cloudAccountId, flowNode.cloudAccountId) &&
        Objects.equals(this.cloudRegion, flowNode.cloudRegion) &&
        Objects.equals(this.cloudProvider, flowNode.cloudProvider) &&
        Objects.equals(this.resource, flowNode.resource) &&
        Objects.equals(this.vendorId, flowNode.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, cloudAccountId, cloudRegion, cloudProvider, resource, vendorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowNode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("cloudAccountId");
    openapiFields.add("cloudRegion");
    openapiFields.add("cloudProvider");
    openapiFields.add("resource");
    openapiFields.add("vendorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("cloudAccountId");
    openapiRequiredFields.add("cloudProvider");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FlowNode
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FlowNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FlowNode is not found in the empty JSON string", FlowNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FlowNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FlowNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FlowNode.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("cloudAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudAccountId").toString()));
      }
      if ((jsonObj.get("cloudRegion") != null && !jsonObj.get("cloudRegion").isJsonNull()) && !jsonObj.get("cloudRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudRegion").toString()));
      }
      // validate the required field `cloudProvider`
      CloudServiceProvider.validateJsonElement(jsonObj.get("cloudProvider"));
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        FlowNodeResource.validateJsonElement(jsonObj.get("resource"));
      }
      if ((jsonObj.get("vendorId") != null && !jsonObj.get("vendorId").isJsonNull()) && !jsonObj.get("vendorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FlowNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FlowNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FlowNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FlowNode.class));

       return (TypeAdapter<T>) new TypeAdapter<FlowNode>() {
           @Override
           public void write(JsonWriter out, FlowNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FlowNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FlowNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FlowNode
  * @throws IOException if the JSON string is invalid with respect to FlowNode
  */
  public static FlowNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FlowNode.class);
  }

 /**
  * Convert an instance of FlowNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

