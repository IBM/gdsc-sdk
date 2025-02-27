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
import com.ibm.security.guardium.Assetsv3StatusType;
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

import com.ibm.security.JSON;

/**
 * Attributes - Entity data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3Attributes {
  public static final String SERIALIZED_NAME_CRITICAL_VULNERABILITY_COUNT = "critical_vulnerability_count";
  @SerializedName(SERIALIZED_NAME_CRITICAL_VULNERABILITY_COUNT)
  private String criticalVulnerabilityCount;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entity_name";
  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_GROUPER_ID = "grouper_id";
  @SerializedName(SERIALIZED_NAME_GROUPER_ID)
  private String grouperId;

  public static final String SERIALIZED_NAME_HAS_TRAINING_DATA = "has_training_data";
  @SerializedName(SERIALIZED_NAME_HAS_TRAINING_DATA)
  private Boolean hasTrainingData;

  public static final String SERIALIZED_NAME_MAJOR_VULNERABILITY_COUNT = "major_vulnerability_count";
  @SerializedName(SERIALIZED_NAME_MAJOR_VULNERABILITY_COUNT)
  private String majorVulnerabilityCount;

  public static final String SERIALIZED_NAME_SENSITIVE_DATA_COUNT = "sensitive_data_count";
  @SerializedName(SERIALIZED_NAME_SENSITIVE_DATA_COUNT)
  private String sensitiveDataCount;

  public static final String SERIALIZED_NAME_STATUS_TYPE = "statusType";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE)
  private Assetsv3StatusType statusType = Assetsv3StatusType.NA;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Assetsv3Attributes() {
  }

  public Assetsv3Attributes criticalVulnerabilityCount(String criticalVulnerabilityCount) {
    this.criticalVulnerabilityCount = criticalVulnerabilityCount;
    return this;
  }

   /**
   * Get criticalVulnerabilityCount
   * @return criticalVulnerabilityCount
  **/
  @javax.annotation.Nullable
  public String getCriticalVulnerabilityCount() {
    return criticalVulnerabilityCount;
  }

  public void setCriticalVulnerabilityCount(String criticalVulnerabilityCount) {
    this.criticalVulnerabilityCount = criticalVulnerabilityCount;
  }


  public Assetsv3Attributes entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public Assetsv3Attributes entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @javax.annotation.Nullable
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public Assetsv3Attributes grouperId(String grouperId) {
    this.grouperId = grouperId;
    return this;
  }

   /**
   * Get grouperId
   * @return grouperId
  **/
  @javax.annotation.Nullable
  public String getGrouperId() {
    return grouperId;
  }

  public void setGrouperId(String grouperId) {
    this.grouperId = grouperId;
  }


  public Assetsv3Attributes hasTrainingData(Boolean hasTrainingData) {
    this.hasTrainingData = hasTrainingData;
    return this;
  }

   /**
   * Get hasTrainingData
   * @return hasTrainingData
  **/
  @javax.annotation.Nullable
  public Boolean getHasTrainingData() {
    return hasTrainingData;
  }

  public void setHasTrainingData(Boolean hasTrainingData) {
    this.hasTrainingData = hasTrainingData;
  }


  public Assetsv3Attributes majorVulnerabilityCount(String majorVulnerabilityCount) {
    this.majorVulnerabilityCount = majorVulnerabilityCount;
    return this;
  }

   /**
   * Get majorVulnerabilityCount
   * @return majorVulnerabilityCount
  **/
  @javax.annotation.Nullable
  public String getMajorVulnerabilityCount() {
    return majorVulnerabilityCount;
  }

  public void setMajorVulnerabilityCount(String majorVulnerabilityCount) {
    this.majorVulnerabilityCount = majorVulnerabilityCount;
  }


  public Assetsv3Attributes sensitiveDataCount(String sensitiveDataCount) {
    this.sensitiveDataCount = sensitiveDataCount;
    return this;
  }

   /**
   * Get sensitiveDataCount
   * @return sensitiveDataCount
  **/
  @javax.annotation.Nullable
  public String getSensitiveDataCount() {
    return sensitiveDataCount;
  }

  public void setSensitiveDataCount(String sensitiveDataCount) {
    this.sensitiveDataCount = sensitiveDataCount;
  }


  public Assetsv3Attributes statusType(Assetsv3StatusType statusType) {
    this.statusType = statusType;
    return this;
  }

   /**
   * Get statusType
   * @return statusType
  **/
  @javax.annotation.Nullable
  public Assetsv3StatusType getStatusType() {
    return statusType;
  }

  public void setStatusType(Assetsv3StatusType statusType) {
    this.statusType = statusType;
  }


  public Assetsv3Attributes type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3Attributes assetsv3Attributes = (Assetsv3Attributes) o;
    return Objects.equals(this.criticalVulnerabilityCount, assetsv3Attributes.criticalVulnerabilityCount) &&
        Objects.equals(this.entityId, assetsv3Attributes.entityId) &&
        Objects.equals(this.entityName, assetsv3Attributes.entityName) &&
        Objects.equals(this.grouperId, assetsv3Attributes.grouperId) &&
        Objects.equals(this.hasTrainingData, assetsv3Attributes.hasTrainingData) &&
        Objects.equals(this.majorVulnerabilityCount, assetsv3Attributes.majorVulnerabilityCount) &&
        Objects.equals(this.sensitiveDataCount, assetsv3Attributes.sensitiveDataCount) &&
        Objects.equals(this.statusType, assetsv3Attributes.statusType) &&
        Objects.equals(this.type, assetsv3Attributes.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticalVulnerabilityCount, entityId, entityName, grouperId, hasTrainingData, majorVulnerabilityCount, sensitiveDataCount, statusType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3Attributes {\n");
    sb.append("    criticalVulnerabilityCount: ").append(toIndentedString(criticalVulnerabilityCount)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    grouperId: ").append(toIndentedString(grouperId)).append("\n");
    sb.append("    hasTrainingData: ").append(toIndentedString(hasTrainingData)).append("\n");
    sb.append("    majorVulnerabilityCount: ").append(toIndentedString(majorVulnerabilityCount)).append("\n");
    sb.append("    sensitiveDataCount: ").append(toIndentedString(sensitiveDataCount)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("critical_vulnerability_count");
    openapiFields.add("entity_id");
    openapiFields.add("entity_name");
    openapiFields.add("grouper_id");
    openapiFields.add("has_training_data");
    openapiFields.add("major_vulnerability_count");
    openapiFields.add("sensitive_data_count");
    openapiFields.add("statusType");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3Attributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3Attributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3Attributes is not found in the empty JSON string", Assetsv3Attributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3Attributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3Attributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("critical_vulnerability_count") != null && !jsonObj.get("critical_vulnerability_count").isJsonNull()) && !jsonObj.get("critical_vulnerability_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `critical_vulnerability_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("critical_vulnerability_count").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if ((jsonObj.get("entity_name") != null && !jsonObj.get("entity_name").isJsonNull()) && !jsonObj.get("entity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_name").toString()));
      }
      if ((jsonObj.get("grouper_id") != null && !jsonObj.get("grouper_id").isJsonNull()) && !jsonObj.get("grouper_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grouper_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grouper_id").toString()));
      }
      if ((jsonObj.get("major_vulnerability_count") != null && !jsonObj.get("major_vulnerability_count").isJsonNull()) && !jsonObj.get("major_vulnerability_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major_vulnerability_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major_vulnerability_count").toString()));
      }
      if ((jsonObj.get("sensitive_data_count") != null && !jsonObj.get("sensitive_data_count").isJsonNull()) && !jsonObj.get("sensitive_data_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sensitive_data_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sensitive_data_count").toString()));
      }
      // validate the optional field `statusType`
      if (jsonObj.get("statusType") != null && !jsonObj.get("statusType").isJsonNull()) {
        Assetsv3StatusType.validateJsonElement(jsonObj.get("statusType"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3Attributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3Attributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3Attributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3Attributes.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3Attributes>() {
           @Override
           public void write(JsonWriter out, Assetsv3Attributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3Attributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3Attributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3Attributes
  * @throws IOException if the JSON string is invalid with respect to Assetsv3Attributes
  */
  public static Assetsv3Attributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3Attributes.class);
  }

 /**
  * Convert an instance of Assetsv3Attributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

