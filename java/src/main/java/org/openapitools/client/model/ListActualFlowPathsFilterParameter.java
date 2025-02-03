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
import org.openapitools.client.model.AccessType;
import org.openapitools.client.model.CloudServiceProvider;
import org.openapitools.client.model.Comparator;

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
 * ListActualFlowPathsFilterParameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class ListActualFlowPathsFilterParameter {
  public static final String SERIALIZED_NAME_FLOW_IDS = "flowIds";
  @SerializedName(SERIALIZED_NAME_FLOW_IDS)
  private List<String> flowIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_IDS = "sourceIds";
  @SerializedName(SERIALIZED_NAME_SOURCE_IDS)
  private List<String> sourceIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_TYPES = "sourceTypes";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPES)
  private List<String> sourceTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_CLOUD_ACCOUNT_IDS = "sourceCloudAccountIds";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLOUD_ACCOUNT_IDS)
  private List<String> sourceCloudAccountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_CLOUD_REGIONS = "sourceCloudRegions";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLOUD_REGIONS)
  private List<String> sourceCloudRegions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_CLOUD_PROVIDERS = "sourceCloudProviders";
  @SerializedName(SERIALIZED_NAME_SOURCE_CLOUD_PROVIDERS)
  private List<CloudServiceProvider> sourceCloudProviders = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESTINATION_IDS = "destinationIds";
  @SerializedName(SERIALIZED_NAME_DESTINATION_IDS)
  private List<String> destinationIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESTINATION_TYPES = "destinationTypes";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPES)
  private List<String> destinationTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESTINATION_CLOUD_ACCOUNT_IDS = "destinationCloudAccountIds";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CLOUD_ACCOUNT_IDS)
  private List<String> destinationCloudAccountIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESTINATION_CLOUD_REGIONS = "destinationCloudRegions";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CLOUD_REGIONS)
  private List<String> destinationCloudRegions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESTINATION_CLOUD_PROVIDERS = "destinationCloudProviders";
  @SerializedName(SERIALIZED_NAME_DESTINATION_CLOUD_PROVIDERS)
  private List<CloudServiceProvider> destinationCloudProviders = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCESS_TYPES = "accessTypes";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPES)
  private List<AccessType> accessTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERNAMES = "usernames";
  @SerializedName(SERIALIZED_NAME_USERNAMES)
  private List<String> usernames = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRUSTEE_IDS = "trusteeIds";
  @SerializedName(SERIALIZED_NAME_TRUSTEE_IDS)
  private List<String> trusteeIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private Comparator lastSeen;

  public static final String SERIALIZED_NAME_FIRST_SEEN = "firstSeen";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN)
  private Comparator firstSeen;

  public ListActualFlowPathsFilterParameter() {
  }

  public ListActualFlowPathsFilterParameter flowIds(List<String> flowIds) {
    this.flowIds = flowIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addFlowIdsItem(String flowIdsItem) {
    if (this.flowIds == null) {
      this.flowIds = new ArrayList<>();
    }
    this.flowIds.add(flowIdsItem);
    return this;
  }

   /**
   * Get flowIds
   * @return flowIds
  **/
  @javax.annotation.Nullable
  public List<String> getFlowIds() {
    return flowIds;
  }

  public void setFlowIds(List<String> flowIds) {
    this.flowIds = flowIds;
  }


  public ListActualFlowPathsFilterParameter sourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addSourceIdsItem(String sourceIdsItem) {
    if (this.sourceIds == null) {
      this.sourceIds = new ArrayList<>();
    }
    this.sourceIds.add(sourceIdsItem);
    return this;
  }

   /**
   * Get sourceIds
   * @return sourceIds
  **/
  @javax.annotation.Nullable
  public List<String> getSourceIds() {
    return sourceIds;
  }

  public void setSourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
  }


  public ListActualFlowPathsFilterParameter sourceTypes(List<String> sourceTypes) {
    this.sourceTypes = sourceTypes;
    return this;
  }

  public ListActualFlowPathsFilterParameter addSourceTypesItem(String sourceTypesItem) {
    if (this.sourceTypes == null) {
      this.sourceTypes = new ArrayList<>();
    }
    this.sourceTypes.add(sourceTypesItem);
    return this;
  }

   /**
   * Get sourceTypes
   * @return sourceTypes
  **/
  @javax.annotation.Nullable
  public List<String> getSourceTypes() {
    return sourceTypes;
  }

  public void setSourceTypes(List<String> sourceTypes) {
    this.sourceTypes = sourceTypes;
  }


  public ListActualFlowPathsFilterParameter sourceCloudAccountIds(List<String> sourceCloudAccountIds) {
    this.sourceCloudAccountIds = sourceCloudAccountIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addSourceCloudAccountIdsItem(String sourceCloudAccountIdsItem) {
    if (this.sourceCloudAccountIds == null) {
      this.sourceCloudAccountIds = new ArrayList<>();
    }
    this.sourceCloudAccountIds.add(sourceCloudAccountIdsItem);
    return this;
  }

   /**
   * Get sourceCloudAccountIds
   * @return sourceCloudAccountIds
  **/
  @javax.annotation.Nullable
  public List<String> getSourceCloudAccountIds() {
    return sourceCloudAccountIds;
  }

  public void setSourceCloudAccountIds(List<String> sourceCloudAccountIds) {
    this.sourceCloudAccountIds = sourceCloudAccountIds;
  }


  public ListActualFlowPathsFilterParameter sourceCloudRegions(List<String> sourceCloudRegions) {
    this.sourceCloudRegions = sourceCloudRegions;
    return this;
  }

  public ListActualFlowPathsFilterParameter addSourceCloudRegionsItem(String sourceCloudRegionsItem) {
    if (this.sourceCloudRegions == null) {
      this.sourceCloudRegions = new ArrayList<>();
    }
    this.sourceCloudRegions.add(sourceCloudRegionsItem);
    return this;
  }

   /**
   * Get sourceCloudRegions
   * @return sourceCloudRegions
  **/
  @javax.annotation.Nullable
  public List<String> getSourceCloudRegions() {
    return sourceCloudRegions;
  }

  public void setSourceCloudRegions(List<String> sourceCloudRegions) {
    this.sourceCloudRegions = sourceCloudRegions;
  }


  public ListActualFlowPathsFilterParameter sourceCloudProviders(List<CloudServiceProvider> sourceCloudProviders) {
    this.sourceCloudProviders = sourceCloudProviders;
    return this;
  }

  public ListActualFlowPathsFilterParameter addSourceCloudProvidersItem(CloudServiceProvider sourceCloudProvidersItem) {
    if (this.sourceCloudProviders == null) {
      this.sourceCloudProviders = new ArrayList<>();
    }
    this.sourceCloudProviders.add(sourceCloudProvidersItem);
    return this;
  }

   /**
   * Get sourceCloudProviders
   * @return sourceCloudProviders
  **/
  @javax.annotation.Nullable
  public List<CloudServiceProvider> getSourceCloudProviders() {
    return sourceCloudProviders;
  }

  public void setSourceCloudProviders(List<CloudServiceProvider> sourceCloudProviders) {
    this.sourceCloudProviders = sourceCloudProviders;
  }


  public ListActualFlowPathsFilterParameter destinationIds(List<String> destinationIds) {
    this.destinationIds = destinationIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addDestinationIdsItem(String destinationIdsItem) {
    if (this.destinationIds == null) {
      this.destinationIds = new ArrayList<>();
    }
    this.destinationIds.add(destinationIdsItem);
    return this;
  }

   /**
   * Get destinationIds
   * @return destinationIds
  **/
  @javax.annotation.Nullable
  public List<String> getDestinationIds() {
    return destinationIds;
  }

  public void setDestinationIds(List<String> destinationIds) {
    this.destinationIds = destinationIds;
  }


  public ListActualFlowPathsFilterParameter destinationTypes(List<String> destinationTypes) {
    this.destinationTypes = destinationTypes;
    return this;
  }

  public ListActualFlowPathsFilterParameter addDestinationTypesItem(String destinationTypesItem) {
    if (this.destinationTypes == null) {
      this.destinationTypes = new ArrayList<>();
    }
    this.destinationTypes.add(destinationTypesItem);
    return this;
  }

   /**
   * Get destinationTypes
   * @return destinationTypes
  **/
  @javax.annotation.Nullable
  public List<String> getDestinationTypes() {
    return destinationTypes;
  }

  public void setDestinationTypes(List<String> destinationTypes) {
    this.destinationTypes = destinationTypes;
  }


  public ListActualFlowPathsFilterParameter destinationCloudAccountIds(List<String> destinationCloudAccountIds) {
    this.destinationCloudAccountIds = destinationCloudAccountIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addDestinationCloudAccountIdsItem(String destinationCloudAccountIdsItem) {
    if (this.destinationCloudAccountIds == null) {
      this.destinationCloudAccountIds = new ArrayList<>();
    }
    this.destinationCloudAccountIds.add(destinationCloudAccountIdsItem);
    return this;
  }

   /**
   * Get destinationCloudAccountIds
   * @return destinationCloudAccountIds
  **/
  @javax.annotation.Nullable
  public List<String> getDestinationCloudAccountIds() {
    return destinationCloudAccountIds;
  }

  public void setDestinationCloudAccountIds(List<String> destinationCloudAccountIds) {
    this.destinationCloudAccountIds = destinationCloudAccountIds;
  }


  public ListActualFlowPathsFilterParameter destinationCloudRegions(List<String> destinationCloudRegions) {
    this.destinationCloudRegions = destinationCloudRegions;
    return this;
  }

  public ListActualFlowPathsFilterParameter addDestinationCloudRegionsItem(String destinationCloudRegionsItem) {
    if (this.destinationCloudRegions == null) {
      this.destinationCloudRegions = new ArrayList<>();
    }
    this.destinationCloudRegions.add(destinationCloudRegionsItem);
    return this;
  }

   /**
   * Get destinationCloudRegions
   * @return destinationCloudRegions
  **/
  @javax.annotation.Nullable
  public List<String> getDestinationCloudRegions() {
    return destinationCloudRegions;
  }

  public void setDestinationCloudRegions(List<String> destinationCloudRegions) {
    this.destinationCloudRegions = destinationCloudRegions;
  }


  public ListActualFlowPathsFilterParameter destinationCloudProviders(List<CloudServiceProvider> destinationCloudProviders) {
    this.destinationCloudProviders = destinationCloudProviders;
    return this;
  }

  public ListActualFlowPathsFilterParameter addDestinationCloudProvidersItem(CloudServiceProvider destinationCloudProvidersItem) {
    if (this.destinationCloudProviders == null) {
      this.destinationCloudProviders = new ArrayList<>();
    }
    this.destinationCloudProviders.add(destinationCloudProvidersItem);
    return this;
  }

   /**
   * Get destinationCloudProviders
   * @return destinationCloudProviders
  **/
  @javax.annotation.Nullable
  public List<CloudServiceProvider> getDestinationCloudProviders() {
    return destinationCloudProviders;
  }

  public void setDestinationCloudProviders(List<CloudServiceProvider> destinationCloudProviders) {
    this.destinationCloudProviders = destinationCloudProviders;
  }


  public ListActualFlowPathsFilterParameter accessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public ListActualFlowPathsFilterParameter addAccessTypesItem(AccessType accessTypesItem) {
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
  @javax.annotation.Nullable
  public List<AccessType> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<AccessType> accessTypes) {
    this.accessTypes = accessTypes;
  }


  public ListActualFlowPathsFilterParameter usernames(List<String> usernames) {
    this.usernames = usernames;
    return this;
  }

  public ListActualFlowPathsFilterParameter addUsernamesItem(String usernamesItem) {
    if (this.usernames == null) {
      this.usernames = new ArrayList<>();
    }
    this.usernames.add(usernamesItem);
    return this;
  }

   /**
   * Get usernames
   * @return usernames
  **/
  @javax.annotation.Nullable
  public List<String> getUsernames() {
    return usernames;
  }

  public void setUsernames(List<String> usernames) {
    this.usernames = usernames;
  }


  public ListActualFlowPathsFilterParameter trusteeIds(List<String> trusteeIds) {
    this.trusteeIds = trusteeIds;
    return this;
  }

  public ListActualFlowPathsFilterParameter addTrusteeIdsItem(String trusteeIdsItem) {
    if (this.trusteeIds == null) {
      this.trusteeIds = new ArrayList<>();
    }
    this.trusteeIds.add(trusteeIdsItem);
    return this;
  }

   /**
   * Identifiers of access granting cloud assets (aws ARN, Azure resource id, etc.)
   * @return trusteeIds
  **/
  @javax.annotation.Nullable
  public List<String> getTrusteeIds() {
    return trusteeIds;
  }

  public void setTrusteeIds(List<String> trusteeIds) {
    this.trusteeIds = trusteeIds;
  }


  public ListActualFlowPathsFilterParameter lastSeen(Comparator lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public Comparator getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Comparator lastSeen) {
    this.lastSeen = lastSeen;
  }


  public ListActualFlowPathsFilterParameter firstSeen(Comparator firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

   /**
   * Get firstSeen
   * @return firstSeen
  **/
  @javax.annotation.Nullable
  public Comparator getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(Comparator firstSeen) {
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
    ListActualFlowPathsFilterParameter listActualFlowPathsFilterParameter = (ListActualFlowPathsFilterParameter) o;
    return Objects.equals(this.flowIds, listActualFlowPathsFilterParameter.flowIds) &&
        Objects.equals(this.sourceIds, listActualFlowPathsFilterParameter.sourceIds) &&
        Objects.equals(this.sourceTypes, listActualFlowPathsFilterParameter.sourceTypes) &&
        Objects.equals(this.sourceCloudAccountIds, listActualFlowPathsFilterParameter.sourceCloudAccountIds) &&
        Objects.equals(this.sourceCloudRegions, listActualFlowPathsFilterParameter.sourceCloudRegions) &&
        Objects.equals(this.sourceCloudProviders, listActualFlowPathsFilterParameter.sourceCloudProviders) &&
        Objects.equals(this.destinationIds, listActualFlowPathsFilterParameter.destinationIds) &&
        Objects.equals(this.destinationTypes, listActualFlowPathsFilterParameter.destinationTypes) &&
        Objects.equals(this.destinationCloudAccountIds, listActualFlowPathsFilterParameter.destinationCloudAccountIds) &&
        Objects.equals(this.destinationCloudRegions, listActualFlowPathsFilterParameter.destinationCloudRegions) &&
        Objects.equals(this.destinationCloudProviders, listActualFlowPathsFilterParameter.destinationCloudProviders) &&
        Objects.equals(this.accessTypes, listActualFlowPathsFilterParameter.accessTypes) &&
        Objects.equals(this.usernames, listActualFlowPathsFilterParameter.usernames) &&
        Objects.equals(this.trusteeIds, listActualFlowPathsFilterParameter.trusteeIds) &&
        Objects.equals(this.lastSeen, listActualFlowPathsFilterParameter.lastSeen) &&
        Objects.equals(this.firstSeen, listActualFlowPathsFilterParameter.firstSeen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowIds, sourceIds, sourceTypes, sourceCloudAccountIds, sourceCloudRegions, sourceCloudProviders, destinationIds, destinationTypes, destinationCloudAccountIds, destinationCloudRegions, destinationCloudProviders, accessTypes, usernames, trusteeIds, lastSeen, firstSeen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListActualFlowPathsFilterParameter {\n");
    sb.append("    flowIds: ").append(toIndentedString(flowIds)).append("\n");
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
    sb.append("    sourceTypes: ").append(toIndentedString(sourceTypes)).append("\n");
    sb.append("    sourceCloudAccountIds: ").append(toIndentedString(sourceCloudAccountIds)).append("\n");
    sb.append("    sourceCloudRegions: ").append(toIndentedString(sourceCloudRegions)).append("\n");
    sb.append("    sourceCloudProviders: ").append(toIndentedString(sourceCloudProviders)).append("\n");
    sb.append("    destinationIds: ").append(toIndentedString(destinationIds)).append("\n");
    sb.append("    destinationTypes: ").append(toIndentedString(destinationTypes)).append("\n");
    sb.append("    destinationCloudAccountIds: ").append(toIndentedString(destinationCloudAccountIds)).append("\n");
    sb.append("    destinationCloudRegions: ").append(toIndentedString(destinationCloudRegions)).append("\n");
    sb.append("    destinationCloudProviders: ").append(toIndentedString(destinationCloudProviders)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
    sb.append("    trusteeIds: ").append(toIndentedString(trusteeIds)).append("\n");
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
    openapiFields.add("flowIds");
    openapiFields.add("sourceIds");
    openapiFields.add("sourceTypes");
    openapiFields.add("sourceCloudAccountIds");
    openapiFields.add("sourceCloudRegions");
    openapiFields.add("sourceCloudProviders");
    openapiFields.add("destinationIds");
    openapiFields.add("destinationTypes");
    openapiFields.add("destinationCloudAccountIds");
    openapiFields.add("destinationCloudRegions");
    openapiFields.add("destinationCloudProviders");
    openapiFields.add("accessTypes");
    openapiFields.add("usernames");
    openapiFields.add("trusteeIds");
    openapiFields.add("lastSeen");
    openapiFields.add("firstSeen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListActualFlowPathsFilterParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListActualFlowPathsFilterParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListActualFlowPathsFilterParameter is not found in the empty JSON string", ListActualFlowPathsFilterParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListActualFlowPathsFilterParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListActualFlowPathsFilterParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("flowIds") != null && !jsonObj.get("flowIds").isJsonNull() && !jsonObj.get("flowIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `flowIds` to be an array in the JSON string but got `%s`", jsonObj.get("flowIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourceIds") != null && !jsonObj.get("sourceIds").isJsonNull() && !jsonObj.get("sourceIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceIds` to be an array in the JSON string but got `%s`", jsonObj.get("sourceIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourceTypes") != null && !jsonObj.get("sourceTypes").isJsonNull() && !jsonObj.get("sourceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("sourceTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourceCloudAccountIds") != null && !jsonObj.get("sourceCloudAccountIds").isJsonNull() && !jsonObj.get("sourceCloudAccountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceCloudAccountIds` to be an array in the JSON string but got `%s`", jsonObj.get("sourceCloudAccountIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourceCloudRegions") != null && !jsonObj.get("sourceCloudRegions").isJsonNull() && !jsonObj.get("sourceCloudRegions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceCloudRegions` to be an array in the JSON string but got `%s`", jsonObj.get("sourceCloudRegions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sourceCloudProviders") != null && !jsonObj.get("sourceCloudProviders").isJsonNull() && !jsonObj.get("sourceCloudProviders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceCloudProviders` to be an array in the JSON string but got `%s`", jsonObj.get("sourceCloudProviders").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destinationIds") != null && !jsonObj.get("destinationIds").isJsonNull() && !jsonObj.get("destinationIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationIds` to be an array in the JSON string but got `%s`", jsonObj.get("destinationIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destinationTypes") != null && !jsonObj.get("destinationTypes").isJsonNull() && !jsonObj.get("destinationTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationTypes` to be an array in the JSON string but got `%s`", jsonObj.get("destinationTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destinationCloudAccountIds") != null && !jsonObj.get("destinationCloudAccountIds").isJsonNull() && !jsonObj.get("destinationCloudAccountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationCloudAccountIds` to be an array in the JSON string but got `%s`", jsonObj.get("destinationCloudAccountIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destinationCloudRegions") != null && !jsonObj.get("destinationCloudRegions").isJsonNull() && !jsonObj.get("destinationCloudRegions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationCloudRegions` to be an array in the JSON string but got `%s`", jsonObj.get("destinationCloudRegions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("destinationCloudProviders") != null && !jsonObj.get("destinationCloudProviders").isJsonNull() && !jsonObj.get("destinationCloudProviders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationCloudProviders` to be an array in the JSON string but got `%s`", jsonObj.get("destinationCloudProviders").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessTypes") != null && !jsonObj.get("accessTypes").isJsonNull() && !jsonObj.get("accessTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTypes` to be an array in the JSON string but got `%s`", jsonObj.get("accessTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("usernames") != null && !jsonObj.get("usernames").isJsonNull() && !jsonObj.get("usernames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `usernames` to be an array in the JSON string but got `%s`", jsonObj.get("usernames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("trusteeIds") != null && !jsonObj.get("trusteeIds").isJsonNull() && !jsonObj.get("trusteeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `trusteeIds` to be an array in the JSON string but got `%s`", jsonObj.get("trusteeIds").toString()));
      }
      // validate the optional field `lastSeen`
      if (jsonObj.get("lastSeen") != null && !jsonObj.get("lastSeen").isJsonNull()) {
        Comparator.validateJsonElement(jsonObj.get("lastSeen"));
      }
      // validate the optional field `firstSeen`
      if (jsonObj.get("firstSeen") != null && !jsonObj.get("firstSeen").isJsonNull()) {
        Comparator.validateJsonElement(jsonObj.get("firstSeen"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListActualFlowPathsFilterParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListActualFlowPathsFilterParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListActualFlowPathsFilterParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListActualFlowPathsFilterParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<ListActualFlowPathsFilterParameter>() {
           @Override
           public void write(JsonWriter out, ListActualFlowPathsFilterParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListActualFlowPathsFilterParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListActualFlowPathsFilterParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListActualFlowPathsFilterParameter
  * @throws IOException if the JSON string is invalid with respect to ListActualFlowPathsFilterParameter
  */
  public static ListActualFlowPathsFilterParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListActualFlowPathsFilterParameter.class);
  }

 /**
  * Convert an instance of ListActualFlowPathsFilterParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

