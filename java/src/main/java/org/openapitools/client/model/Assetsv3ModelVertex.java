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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Assetsv3ConnectionEdge;
import org.openapitools.client.model.Assetsv3CustomProperty;
import org.openapitools.client.model.Assetsv3Level;

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
 * Assetsv3ModelVertex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3ModelVertex {
  public static final String SERIALIZED_NAME_CRITICALITY = "criticality";
  @SerializedName(SERIALIZED_NAME_CRITICALITY)
  private Assetsv3Level criticality = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3CustomProperty> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_TRAINING_DATA = "has_training_data";
  @SerializedName(SERIALIZED_NAME_HAS_TRAINING_DATA)
  private Boolean hasTrainingData;

  public static final String SERIALIZED_NAME_LAST_TRAINED = "last_trained";
  @SerializedName(SERIALIZED_NAME_LAST_TRAINED)
  private OffsetDateTime lastTrained;

  public static final String SERIALIZED_NAME_MODEL_APPLICATION = "model_application";
  @SerializedName(SERIALIZED_NAME_MODEL_APPLICATION)
  private List<Assetsv3ConnectionEdge> modelApplication = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_DEPLOYMENT = "model_deployment";
  @SerializedName(SERIALIZED_NAME_MODEL_DEPLOYMENT)
  private List<Assetsv3ConnectionEdge> modelDeployment = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId;

  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  private String modelName;

  public static final String SERIALIZED_NAME_MODEL_RESOURCES = "model_resources";
  @SerializedName(SERIALIZED_NAME_MODEL_RESOURCES)
  private List<Assetsv3ConnectionEdge> modelResources = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_SUB_TYPE = "model_sub_type";
  @SerializedName(SERIALIZED_NAME_MODEL_SUB_TYPE)
  private String modelSubType;

  public static final String SERIALIZED_NAME_MODEL_TYPE = "model_type";
  @SerializedName(SERIALIZED_NAME_MODEL_TYPE)
  private String modelType;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private String publisher;

  public static final String SERIALIZED_NAME_RESOLUTION_KEY = "resolution_key";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_KEY)
  private String resolutionKey;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private Assetsv3Level riskLevel = Assetsv3Level.UNKNOWN;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Assetsv3ModelVertex() {
  }

  public Assetsv3ModelVertex criticality(Assetsv3Level criticality) {
    this.criticality = criticality;
    return this;
  }

   /**
   * Get criticality
   * @return criticality
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getCriticality() {
    return criticality;
  }

  public void setCriticality(Assetsv3Level criticality) {
    this.criticality = criticality;
  }


  public Assetsv3ModelVertex extendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3ModelVertex addExtendedPropertiesItem(Assetsv3CustomProperty extendedPropertiesItem) {
    if (this.extendedProperties == null) {
      this.extendedProperties = new ArrayList<>();
    }
    this.extendedProperties.add(extendedPropertiesItem);
    return this;
  }

   /**
   * Get extendedProperties
   * @return extendedProperties
  **/
  @javax.annotation.Nullable
  public List<Assetsv3CustomProperty> getExtendedProperties() {
    return extendedProperties;
  }

  public void setExtendedProperties(List<Assetsv3CustomProperty> extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public Assetsv3ModelVertex hasTrainingData(Boolean hasTrainingData) {
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


  public Assetsv3ModelVertex lastTrained(OffsetDateTime lastTrained) {
    this.lastTrained = lastTrained;
    return this;
  }

   /**
   * Get lastTrained
   * @return lastTrained
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastTrained() {
    return lastTrained;
  }

  public void setLastTrained(OffsetDateTime lastTrained) {
    this.lastTrained = lastTrained;
  }


  public Assetsv3ModelVertex modelApplication(List<Assetsv3ConnectionEdge> modelApplication) {
    this.modelApplication = modelApplication;
    return this;
  }

  public Assetsv3ModelVertex addModelApplicationItem(Assetsv3ConnectionEdge modelApplicationItem) {
    if (this.modelApplication == null) {
      this.modelApplication = new ArrayList<>();
    }
    this.modelApplication.add(modelApplicationItem);
    return this;
  }

   /**
   * Get modelApplication
   * @return modelApplication
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getModelApplication() {
    return modelApplication;
  }

  public void setModelApplication(List<Assetsv3ConnectionEdge> modelApplication) {
    this.modelApplication = modelApplication;
  }


  public Assetsv3ModelVertex modelDeployment(List<Assetsv3ConnectionEdge> modelDeployment) {
    this.modelDeployment = modelDeployment;
    return this;
  }

  public Assetsv3ModelVertex addModelDeploymentItem(Assetsv3ConnectionEdge modelDeploymentItem) {
    if (this.modelDeployment == null) {
      this.modelDeployment = new ArrayList<>();
    }
    this.modelDeployment.add(modelDeploymentItem);
    return this;
  }

   /**
   * Get modelDeployment
   * @return modelDeployment
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getModelDeployment() {
    return modelDeployment;
  }

  public void setModelDeployment(List<Assetsv3ConnectionEdge> modelDeployment) {
    this.modelDeployment = modelDeployment;
  }


  public Assetsv3ModelVertex modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @javax.annotation.Nullable
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public Assetsv3ModelVertex modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @javax.annotation.Nullable
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public Assetsv3ModelVertex modelResources(List<Assetsv3ConnectionEdge> modelResources) {
    this.modelResources = modelResources;
    return this;
  }

  public Assetsv3ModelVertex addModelResourcesItem(Assetsv3ConnectionEdge modelResourcesItem) {
    if (this.modelResources == null) {
      this.modelResources = new ArrayList<>();
    }
    this.modelResources.add(modelResourcesItem);
    return this;
  }

   /**
   * Get modelResources
   * @return modelResources
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ConnectionEdge> getModelResources() {
    return modelResources;
  }

  public void setModelResources(List<Assetsv3ConnectionEdge> modelResources) {
    this.modelResources = modelResources;
  }


  public Assetsv3ModelVertex modelSubType(String modelSubType) {
    this.modelSubType = modelSubType;
    return this;
  }

   /**
   * Get modelSubType
   * @return modelSubType
  **/
  @javax.annotation.Nullable
  public String getModelSubType() {
    return modelSubType;
  }

  public void setModelSubType(String modelSubType) {
    this.modelSubType = modelSubType;
  }


  public Assetsv3ModelVertex modelType(String modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @javax.annotation.Nullable
  public String getModelType() {
    return modelType;
  }

  public void setModelType(String modelType) {
    this.modelType = modelType;
  }


  public Assetsv3ModelVertex publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public Assetsv3ModelVertex resolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
    return this;
  }

   /**
   * Get resolutionKey
   * @return resolutionKey
  **/
  @javax.annotation.Nullable
  public String getResolutionKey() {
    return resolutionKey;
  }

  public void setResolutionKey(String resolutionKey) {
    this.resolutionKey = resolutionKey;
  }


  public Assetsv3ModelVertex riskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  public Assetsv3Level getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(Assetsv3Level riskLevel) {
    this.riskLevel = riskLevel;
  }


  public Assetsv3ModelVertex version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3ModelVertex assetsv3ModelVertex = (Assetsv3ModelVertex) o;
    return Objects.equals(this.criticality, assetsv3ModelVertex.criticality) &&
        Objects.equals(this.extendedProperties, assetsv3ModelVertex.extendedProperties) &&
        Objects.equals(this.hasTrainingData, assetsv3ModelVertex.hasTrainingData) &&
        Objects.equals(this.lastTrained, assetsv3ModelVertex.lastTrained) &&
        Objects.equals(this.modelApplication, assetsv3ModelVertex.modelApplication) &&
        Objects.equals(this.modelDeployment, assetsv3ModelVertex.modelDeployment) &&
        Objects.equals(this.modelId, assetsv3ModelVertex.modelId) &&
        Objects.equals(this.modelName, assetsv3ModelVertex.modelName) &&
        Objects.equals(this.modelResources, assetsv3ModelVertex.modelResources) &&
        Objects.equals(this.modelSubType, assetsv3ModelVertex.modelSubType) &&
        Objects.equals(this.modelType, assetsv3ModelVertex.modelType) &&
        Objects.equals(this.publisher, assetsv3ModelVertex.publisher) &&
        Objects.equals(this.resolutionKey, assetsv3ModelVertex.resolutionKey) &&
        Objects.equals(this.riskLevel, assetsv3ModelVertex.riskLevel) &&
        Objects.equals(this.version, assetsv3ModelVertex.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticality, extendedProperties, hasTrainingData, lastTrained, modelApplication, modelDeployment, modelId, modelName, modelResources, modelSubType, modelType, publisher, resolutionKey, riskLevel, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3ModelVertex {\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    hasTrainingData: ").append(toIndentedString(hasTrainingData)).append("\n");
    sb.append("    lastTrained: ").append(toIndentedString(lastTrained)).append("\n");
    sb.append("    modelApplication: ").append(toIndentedString(modelApplication)).append("\n");
    sb.append("    modelDeployment: ").append(toIndentedString(modelDeployment)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelResources: ").append(toIndentedString(modelResources)).append("\n");
    sb.append("    modelSubType: ").append(toIndentedString(modelSubType)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    resolutionKey: ").append(toIndentedString(resolutionKey)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("criticality");
    openapiFields.add("extended_properties");
    openapiFields.add("has_training_data");
    openapiFields.add("last_trained");
    openapiFields.add("model_application");
    openapiFields.add("model_deployment");
    openapiFields.add("model_id");
    openapiFields.add("model_name");
    openapiFields.add("model_resources");
    openapiFields.add("model_sub_type");
    openapiFields.add("model_type");
    openapiFields.add("publisher");
    openapiFields.add("resolution_key");
    openapiFields.add("risk_level");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3ModelVertex
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3ModelVertex.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3ModelVertex is not found in the empty JSON string", Assetsv3ModelVertex.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3ModelVertex.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3ModelVertex` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `criticality`
      if (jsonObj.get("criticality") != null && !jsonObj.get("criticality").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("criticality"));
      }
      if (jsonObj.get("extended_properties") != null && !jsonObj.get("extended_properties").isJsonNull()) {
        JsonArray jsonArrayextendedProperties = jsonObj.getAsJsonArray("extended_properties");
        if (jsonArrayextendedProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extended_properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extended_properties` to be an array in the JSON string but got `%s`", jsonObj.get("extended_properties").toString()));
          }

          // validate the optional field `extended_properties` (array)
          for (int i = 0; i < jsonArrayextendedProperties.size(); i++) {
            Assetsv3CustomProperty.validateJsonElement(jsonArrayextendedProperties.get(i));
          };
        }
      }
      if (jsonObj.get("model_application") != null && !jsonObj.get("model_application").isJsonNull()) {
        JsonArray jsonArraymodelApplication = jsonObj.getAsJsonArray("model_application");
        if (jsonArraymodelApplication != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_application").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_application` to be an array in the JSON string but got `%s`", jsonObj.get("model_application").toString()));
          }

          // validate the optional field `model_application` (array)
          for (int i = 0; i < jsonArraymodelApplication.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraymodelApplication.get(i));
          };
        }
      }
      if (jsonObj.get("model_deployment") != null && !jsonObj.get("model_deployment").isJsonNull()) {
        JsonArray jsonArraymodelDeployment = jsonObj.getAsJsonArray("model_deployment");
        if (jsonArraymodelDeployment != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_deployment").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_deployment` to be an array in the JSON string but got `%s`", jsonObj.get("model_deployment").toString()));
          }

          // validate the optional field `model_deployment` (array)
          for (int i = 0; i < jsonArraymodelDeployment.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraymodelDeployment.get(i));
          };
        }
      }
      if ((jsonObj.get("model_id") != null && !jsonObj.get("model_id").isJsonNull()) && !jsonObj.get("model_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_id").toString()));
      }
      if ((jsonObj.get("model_name") != null && !jsonObj.get("model_name").isJsonNull()) && !jsonObj.get("model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_name").toString()));
      }
      if (jsonObj.get("model_resources") != null && !jsonObj.get("model_resources").isJsonNull()) {
        JsonArray jsonArraymodelResources = jsonObj.getAsJsonArray("model_resources");
        if (jsonArraymodelResources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_resources` to be an array in the JSON string but got `%s`", jsonObj.get("model_resources").toString()));
          }

          // validate the optional field `model_resources` (array)
          for (int i = 0; i < jsonArraymodelResources.size(); i++) {
            Assetsv3ConnectionEdge.validateJsonElement(jsonArraymodelResources.get(i));
          };
        }
      }
      if ((jsonObj.get("model_sub_type") != null && !jsonObj.get("model_sub_type").isJsonNull()) && !jsonObj.get("model_sub_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_sub_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_sub_type").toString()));
      }
      if ((jsonObj.get("model_type") != null && !jsonObj.get("model_type").isJsonNull()) && !jsonObj.get("model_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_type").toString()));
      }
      if ((jsonObj.get("publisher") != null && !jsonObj.get("publisher").isJsonNull()) && !jsonObj.get("publisher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publisher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publisher").toString()));
      }
      if ((jsonObj.get("resolution_key") != null && !jsonObj.get("resolution_key").isJsonNull()) && !jsonObj.get("resolution_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolution_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolution_key").toString()));
      }
      // validate the optional field `risk_level`
      if (jsonObj.get("risk_level") != null && !jsonObj.get("risk_level").isJsonNull()) {
        Assetsv3Level.validateJsonElement(jsonObj.get("risk_level"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3ModelVertex.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3ModelVertex' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3ModelVertex> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3ModelVertex.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3ModelVertex>() {
           @Override
           public void write(JsonWriter out, Assetsv3ModelVertex value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3ModelVertex read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3ModelVertex given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3ModelVertex
  * @throws IOException if the JSON string is invalid with respect to Assetsv3ModelVertex
  */
  public static Assetsv3ModelVertex fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3ModelVertex.class);
  }

 /**
  * Convert an instance of Assetsv3ModelVertex to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

