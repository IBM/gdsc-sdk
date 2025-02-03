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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Assetsv3AssetClassification;
import org.openapitools.client.model.Assetsv3AssetControl;
import org.openapitools.client.model.Assetsv3AssetEndpoint;
import org.openapitools.client.model.Assetsv3AssetInformation;
import org.openapitools.client.model.Assetsv3AssetResourcesInfo;
import org.openapitools.client.model.Assetsv3AssetRiskEvents;
import org.openapitools.client.model.Assetsv3AssetSubscription;
import org.openapitools.client.model.Assetsv3AssetTags;
import org.openapitools.client.model.Assetsv3AssetVa;
import org.openapitools.client.model.Assetsv3ExtendedProp;
import org.openapitools.client.model.Assetsv3ModelApplication;
import org.openapitools.client.model.Assetsv3ModelData;
import org.openapitools.client.model.Assetsv3OverviewParameter;

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
 * Assetsv3AssetOverviewResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetOverviewResponse {
  public static final String SERIALIZED_NAME_ASSET_CLASSIFICATION = "asset_classification";
  @SerializedName(SERIALIZED_NAME_ASSET_CLASSIFICATION)
  private Assetsv3AssetClassification assetClassification;

  public static final String SERIALIZED_NAME_ASSET_CONTROL = "asset_control";
  @SerializedName(SERIALIZED_NAME_ASSET_CONTROL)
  private Assetsv3AssetControl assetControl;

  public static final String SERIALIZED_NAME_ASSET_ENDPOINTS = "asset_endpoints";
  @SerializedName(SERIALIZED_NAME_ASSET_ENDPOINTS)
  private List<Assetsv3AssetEndpoint> assetEndpoints = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSET_INFORMATION = "asset_information";
  @SerializedName(SERIALIZED_NAME_ASSET_INFORMATION)
  private Assetsv3AssetInformation assetInformation;

  public static final String SERIALIZED_NAME_ASSET_RESOURCE = "asset_resource";
  @SerializedName(SERIALIZED_NAME_ASSET_RESOURCE)
  private Assetsv3AssetResourcesInfo assetResource;

  public static final String SERIALIZED_NAME_ASSET_RISK_EVENTS = "asset_risk_events";
  @SerializedName(SERIALIZED_NAME_ASSET_RISK_EVENTS)
  private Assetsv3AssetRiskEvents assetRiskEvents;

  public static final String SERIALIZED_NAME_ASSET_SUBSCRIPTIONS = "asset_subscriptions";
  @SerializedName(SERIALIZED_NAME_ASSET_SUBSCRIPTIONS)
  private List<Assetsv3AssetSubscription> assetSubscriptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSET_TAGS = "asset_tags";
  @SerializedName(SERIALIZED_NAME_ASSET_TAGS)
  private List<Assetsv3AssetTags> assetTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASSET_VA = "asset_va";
  @SerializedName(SERIALIZED_NAME_ASSET_VA)
  private Assetsv3AssetVa assetVa;

  public static final String SERIALIZED_NAME_DROPDOWN_FLAG = "dropdown_flag";
  @SerializedName(SERIALIZED_NAME_DROPDOWN_FLAG)
  private Integer dropdownFlag;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_EXTENDED_PROPERTIES = "extended_properties";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PROPERTIES)
  private List<Assetsv3ExtendedProp> extendedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_APPLICATION = "model_application";
  @SerializedName(SERIALIZED_NAME_MODEL_APPLICATION)
  private List<Assetsv3ModelApplication> modelApplication = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODEL_DATA = "model_data";
  @SerializedName(SERIALIZED_NAME_MODEL_DATA)
  private List<Assetsv3ModelData> modelData = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERVIEW_PARAMETERS = "overview_parameters";
  @SerializedName(SERIALIZED_NAME_OVERVIEW_PARAMETERS)
  private List<Assetsv3OverviewParameter> overviewParameters = new ArrayList<>();

  public Assetsv3AssetOverviewResponse() {
  }

  public Assetsv3AssetOverviewResponse assetClassification(Assetsv3AssetClassification assetClassification) {
    this.assetClassification = assetClassification;
    return this;
  }

   /**
   * Get assetClassification
   * @return assetClassification
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetClassification getAssetClassification() {
    return assetClassification;
  }

  public void setAssetClassification(Assetsv3AssetClassification assetClassification) {
    this.assetClassification = assetClassification;
  }


  public Assetsv3AssetOverviewResponse assetControl(Assetsv3AssetControl assetControl) {
    this.assetControl = assetControl;
    return this;
  }

   /**
   * Get assetControl
   * @return assetControl
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetControl getAssetControl() {
    return assetControl;
  }

  public void setAssetControl(Assetsv3AssetControl assetControl) {
    this.assetControl = assetControl;
  }


  public Assetsv3AssetOverviewResponse assetEndpoints(List<Assetsv3AssetEndpoint> assetEndpoints) {
    this.assetEndpoints = assetEndpoints;
    return this;
  }

  public Assetsv3AssetOverviewResponse addAssetEndpointsItem(Assetsv3AssetEndpoint assetEndpointsItem) {
    if (this.assetEndpoints == null) {
      this.assetEndpoints = new ArrayList<>();
    }
    this.assetEndpoints.add(assetEndpointsItem);
    return this;
  }

   /**
   * Get assetEndpoints
   * @return assetEndpoints
  **/
  @javax.annotation.Nullable
  public List<Assetsv3AssetEndpoint> getAssetEndpoints() {
    return assetEndpoints;
  }

  public void setAssetEndpoints(List<Assetsv3AssetEndpoint> assetEndpoints) {
    this.assetEndpoints = assetEndpoints;
  }


  public Assetsv3AssetOverviewResponse assetInformation(Assetsv3AssetInformation assetInformation) {
    this.assetInformation = assetInformation;
    return this;
  }

   /**
   * Get assetInformation
   * @return assetInformation
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetInformation getAssetInformation() {
    return assetInformation;
  }

  public void setAssetInformation(Assetsv3AssetInformation assetInformation) {
    this.assetInformation = assetInformation;
  }


  public Assetsv3AssetOverviewResponse assetResource(Assetsv3AssetResourcesInfo assetResource) {
    this.assetResource = assetResource;
    return this;
  }

   /**
   * Get assetResource
   * @return assetResource
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetResourcesInfo getAssetResource() {
    return assetResource;
  }

  public void setAssetResource(Assetsv3AssetResourcesInfo assetResource) {
    this.assetResource = assetResource;
  }


  public Assetsv3AssetOverviewResponse assetRiskEvents(Assetsv3AssetRiskEvents assetRiskEvents) {
    this.assetRiskEvents = assetRiskEvents;
    return this;
  }

   /**
   * Get assetRiskEvents
   * @return assetRiskEvents
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetRiskEvents getAssetRiskEvents() {
    return assetRiskEvents;
  }

  public void setAssetRiskEvents(Assetsv3AssetRiskEvents assetRiskEvents) {
    this.assetRiskEvents = assetRiskEvents;
  }


  public Assetsv3AssetOverviewResponse assetSubscriptions(List<Assetsv3AssetSubscription> assetSubscriptions) {
    this.assetSubscriptions = assetSubscriptions;
    return this;
  }

  public Assetsv3AssetOverviewResponse addAssetSubscriptionsItem(Assetsv3AssetSubscription assetSubscriptionsItem) {
    if (this.assetSubscriptions == null) {
      this.assetSubscriptions = new ArrayList<>();
    }
    this.assetSubscriptions.add(assetSubscriptionsItem);
    return this;
  }

   /**
   * Get assetSubscriptions
   * @return assetSubscriptions
  **/
  @javax.annotation.Nullable
  public List<Assetsv3AssetSubscription> getAssetSubscriptions() {
    return assetSubscriptions;
  }

  public void setAssetSubscriptions(List<Assetsv3AssetSubscription> assetSubscriptions) {
    this.assetSubscriptions = assetSubscriptions;
  }


  public Assetsv3AssetOverviewResponse assetTags(List<Assetsv3AssetTags> assetTags) {
    this.assetTags = assetTags;
    return this;
  }

  public Assetsv3AssetOverviewResponse addAssetTagsItem(Assetsv3AssetTags assetTagsItem) {
    if (this.assetTags == null) {
      this.assetTags = new ArrayList<>();
    }
    this.assetTags.add(assetTagsItem);
    return this;
  }

   /**
   * Get assetTags
   * @return assetTags
  **/
  @javax.annotation.Nullable
  public List<Assetsv3AssetTags> getAssetTags() {
    return assetTags;
  }

  public void setAssetTags(List<Assetsv3AssetTags> assetTags) {
    this.assetTags = assetTags;
  }


  public Assetsv3AssetOverviewResponse assetVa(Assetsv3AssetVa assetVa) {
    this.assetVa = assetVa;
    return this;
  }

   /**
   * Get assetVa
   * @return assetVa
  **/
  @javax.annotation.Nullable
  public Assetsv3AssetVa getAssetVa() {
    return assetVa;
  }

  public void setAssetVa(Assetsv3AssetVa assetVa) {
    this.assetVa = assetVa;
  }


  public Assetsv3AssetOverviewResponse dropdownFlag(Integer dropdownFlag) {
    this.dropdownFlag = dropdownFlag;
    return this;
  }

   /**
   * Get dropdownFlag
   * @return dropdownFlag
  **/
  @javax.annotation.Nullable
  public Integer getDropdownFlag() {
    return dropdownFlag;
  }

  public void setDropdownFlag(Integer dropdownFlag) {
    this.dropdownFlag = dropdownFlag;
  }


  public Assetsv3AssetOverviewResponse entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public Assetsv3AssetOverviewResponse extendedProperties(List<Assetsv3ExtendedProp> extendedProperties) {
    this.extendedProperties = extendedProperties;
    return this;
  }

  public Assetsv3AssetOverviewResponse addExtendedPropertiesItem(Assetsv3ExtendedProp extendedPropertiesItem) {
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
  public List<Assetsv3ExtendedProp> getExtendedProperties() {
    return extendedProperties;
  }

  public void setExtendedProperties(List<Assetsv3ExtendedProp> extendedProperties) {
    this.extendedProperties = extendedProperties;
  }


  public Assetsv3AssetOverviewResponse modelApplication(List<Assetsv3ModelApplication> modelApplication) {
    this.modelApplication = modelApplication;
    return this;
  }

  public Assetsv3AssetOverviewResponse addModelApplicationItem(Assetsv3ModelApplication modelApplicationItem) {
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
  public List<Assetsv3ModelApplication> getModelApplication() {
    return modelApplication;
  }

  public void setModelApplication(List<Assetsv3ModelApplication> modelApplication) {
    this.modelApplication = modelApplication;
  }


  public Assetsv3AssetOverviewResponse modelData(List<Assetsv3ModelData> modelData) {
    this.modelData = modelData;
    return this;
  }

  public Assetsv3AssetOverviewResponse addModelDataItem(Assetsv3ModelData modelDataItem) {
    if (this.modelData == null) {
      this.modelData = new ArrayList<>();
    }
    this.modelData.add(modelDataItem);
    return this;
  }

   /**
   * Get modelData
   * @return modelData
  **/
  @javax.annotation.Nullable
  public List<Assetsv3ModelData> getModelData() {
    return modelData;
  }

  public void setModelData(List<Assetsv3ModelData> modelData) {
    this.modelData = modelData;
  }


  public Assetsv3AssetOverviewResponse overviewParameters(List<Assetsv3OverviewParameter> overviewParameters) {
    this.overviewParameters = overviewParameters;
    return this;
  }

  public Assetsv3AssetOverviewResponse addOverviewParametersItem(Assetsv3OverviewParameter overviewParametersItem) {
    if (this.overviewParameters == null) {
      this.overviewParameters = new ArrayList<>();
    }
    this.overviewParameters.add(overviewParametersItem);
    return this;
  }

   /**
   * Get overviewParameters
   * @return overviewParameters
  **/
  @javax.annotation.Nullable
  public List<Assetsv3OverviewParameter> getOverviewParameters() {
    return overviewParameters;
  }

  public void setOverviewParameters(List<Assetsv3OverviewParameter> overviewParameters) {
    this.overviewParameters = overviewParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetOverviewResponse assetsv3AssetOverviewResponse = (Assetsv3AssetOverviewResponse) o;
    return Objects.equals(this.assetClassification, assetsv3AssetOverviewResponse.assetClassification) &&
        Objects.equals(this.assetControl, assetsv3AssetOverviewResponse.assetControl) &&
        Objects.equals(this.assetEndpoints, assetsv3AssetOverviewResponse.assetEndpoints) &&
        Objects.equals(this.assetInformation, assetsv3AssetOverviewResponse.assetInformation) &&
        Objects.equals(this.assetResource, assetsv3AssetOverviewResponse.assetResource) &&
        Objects.equals(this.assetRiskEvents, assetsv3AssetOverviewResponse.assetRiskEvents) &&
        Objects.equals(this.assetSubscriptions, assetsv3AssetOverviewResponse.assetSubscriptions) &&
        Objects.equals(this.assetTags, assetsv3AssetOverviewResponse.assetTags) &&
        Objects.equals(this.assetVa, assetsv3AssetOverviewResponse.assetVa) &&
        Objects.equals(this.dropdownFlag, assetsv3AssetOverviewResponse.dropdownFlag) &&
        Objects.equals(this.entityType, assetsv3AssetOverviewResponse.entityType) &&
        Objects.equals(this.extendedProperties, assetsv3AssetOverviewResponse.extendedProperties) &&
        Objects.equals(this.modelApplication, assetsv3AssetOverviewResponse.modelApplication) &&
        Objects.equals(this.modelData, assetsv3AssetOverviewResponse.modelData) &&
        Objects.equals(this.overviewParameters, assetsv3AssetOverviewResponse.overviewParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetClassification, assetControl, assetEndpoints, assetInformation, assetResource, assetRiskEvents, assetSubscriptions, assetTags, assetVa, dropdownFlag, entityType, extendedProperties, modelApplication, modelData, overviewParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetOverviewResponse {\n");
    sb.append("    assetClassification: ").append(toIndentedString(assetClassification)).append("\n");
    sb.append("    assetControl: ").append(toIndentedString(assetControl)).append("\n");
    sb.append("    assetEndpoints: ").append(toIndentedString(assetEndpoints)).append("\n");
    sb.append("    assetInformation: ").append(toIndentedString(assetInformation)).append("\n");
    sb.append("    assetResource: ").append(toIndentedString(assetResource)).append("\n");
    sb.append("    assetRiskEvents: ").append(toIndentedString(assetRiskEvents)).append("\n");
    sb.append("    assetSubscriptions: ").append(toIndentedString(assetSubscriptions)).append("\n");
    sb.append("    assetTags: ").append(toIndentedString(assetTags)).append("\n");
    sb.append("    assetVa: ").append(toIndentedString(assetVa)).append("\n");
    sb.append("    dropdownFlag: ").append(toIndentedString(dropdownFlag)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    extendedProperties: ").append(toIndentedString(extendedProperties)).append("\n");
    sb.append("    modelApplication: ").append(toIndentedString(modelApplication)).append("\n");
    sb.append("    modelData: ").append(toIndentedString(modelData)).append("\n");
    sb.append("    overviewParameters: ").append(toIndentedString(overviewParameters)).append("\n");
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
    openapiFields.add("asset_classification");
    openapiFields.add("asset_control");
    openapiFields.add("asset_endpoints");
    openapiFields.add("asset_information");
    openapiFields.add("asset_resource");
    openapiFields.add("asset_risk_events");
    openapiFields.add("asset_subscriptions");
    openapiFields.add("asset_tags");
    openapiFields.add("asset_va");
    openapiFields.add("dropdown_flag");
    openapiFields.add("entity_type");
    openapiFields.add("extended_properties");
    openapiFields.add("model_application");
    openapiFields.add("model_data");
    openapiFields.add("overview_parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetOverviewResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetOverviewResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetOverviewResponse is not found in the empty JSON string", Assetsv3AssetOverviewResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetOverviewResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetOverviewResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `asset_classification`
      if (jsonObj.get("asset_classification") != null && !jsonObj.get("asset_classification").isJsonNull()) {
        Assetsv3AssetClassification.validateJsonElement(jsonObj.get("asset_classification"));
      }
      // validate the optional field `asset_control`
      if (jsonObj.get("asset_control") != null && !jsonObj.get("asset_control").isJsonNull()) {
        Assetsv3AssetControl.validateJsonElement(jsonObj.get("asset_control"));
      }
      if (jsonObj.get("asset_endpoints") != null && !jsonObj.get("asset_endpoints").isJsonNull()) {
        JsonArray jsonArrayassetEndpoints = jsonObj.getAsJsonArray("asset_endpoints");
        if (jsonArrayassetEndpoints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("asset_endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `asset_endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("asset_endpoints").toString()));
          }

          // validate the optional field `asset_endpoints` (array)
          for (int i = 0; i < jsonArrayassetEndpoints.size(); i++) {
            Assetsv3AssetEndpoint.validateJsonElement(jsonArrayassetEndpoints.get(i));
          };
        }
      }
      // validate the optional field `asset_information`
      if (jsonObj.get("asset_information") != null && !jsonObj.get("asset_information").isJsonNull()) {
        Assetsv3AssetInformation.validateJsonElement(jsonObj.get("asset_information"));
      }
      // validate the optional field `asset_resource`
      if (jsonObj.get("asset_resource") != null && !jsonObj.get("asset_resource").isJsonNull()) {
        Assetsv3AssetResourcesInfo.validateJsonElement(jsonObj.get("asset_resource"));
      }
      // validate the optional field `asset_risk_events`
      if (jsonObj.get("asset_risk_events") != null && !jsonObj.get("asset_risk_events").isJsonNull()) {
        Assetsv3AssetRiskEvents.validateJsonElement(jsonObj.get("asset_risk_events"));
      }
      if (jsonObj.get("asset_subscriptions") != null && !jsonObj.get("asset_subscriptions").isJsonNull()) {
        JsonArray jsonArrayassetSubscriptions = jsonObj.getAsJsonArray("asset_subscriptions");
        if (jsonArrayassetSubscriptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("asset_subscriptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `asset_subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("asset_subscriptions").toString()));
          }

          // validate the optional field `asset_subscriptions` (array)
          for (int i = 0; i < jsonArrayassetSubscriptions.size(); i++) {
            Assetsv3AssetSubscription.validateJsonElement(jsonArrayassetSubscriptions.get(i));
          };
        }
      }
      if (jsonObj.get("asset_tags") != null && !jsonObj.get("asset_tags").isJsonNull()) {
        JsonArray jsonArrayassetTags = jsonObj.getAsJsonArray("asset_tags");
        if (jsonArrayassetTags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("asset_tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `asset_tags` to be an array in the JSON string but got `%s`", jsonObj.get("asset_tags").toString()));
          }

          // validate the optional field `asset_tags` (array)
          for (int i = 0; i < jsonArrayassetTags.size(); i++) {
            Assetsv3AssetTags.validateJsonElement(jsonArrayassetTags.get(i));
          };
        }
      }
      // validate the optional field `asset_va`
      if (jsonObj.get("asset_va") != null && !jsonObj.get("asset_va").isJsonNull()) {
        Assetsv3AssetVa.validateJsonElement(jsonObj.get("asset_va"));
      }
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
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
            Assetsv3ExtendedProp.validateJsonElement(jsonArrayextendedProperties.get(i));
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
            Assetsv3ModelApplication.validateJsonElement(jsonArraymodelApplication.get(i));
          };
        }
      }
      if (jsonObj.get("model_data") != null && !jsonObj.get("model_data").isJsonNull()) {
        JsonArray jsonArraymodelData = jsonObj.getAsJsonArray("model_data");
        if (jsonArraymodelData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_data` to be an array in the JSON string but got `%s`", jsonObj.get("model_data").toString()));
          }

          // validate the optional field `model_data` (array)
          for (int i = 0; i < jsonArraymodelData.size(); i++) {
            Assetsv3ModelData.validateJsonElement(jsonArraymodelData.get(i));
          };
        }
      }
      if (jsonObj.get("overview_parameters") != null && !jsonObj.get("overview_parameters").isJsonNull()) {
        JsonArray jsonArrayoverviewParameters = jsonObj.getAsJsonArray("overview_parameters");
        if (jsonArrayoverviewParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("overview_parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `overview_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("overview_parameters").toString()));
          }

          // validate the optional field `overview_parameters` (array)
          for (int i = 0; i < jsonArrayoverviewParameters.size(); i++) {
            Assetsv3OverviewParameter.validateJsonElement(jsonArrayoverviewParameters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetOverviewResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetOverviewResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetOverviewResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetOverviewResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetOverviewResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetOverviewResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetOverviewResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetOverviewResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetOverviewResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetOverviewResponse
  */
  public static Assetsv3AssetOverviewResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetOverviewResponse.class);
  }

 /**
  * Convert an instance of Assetsv3AssetOverviewResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

