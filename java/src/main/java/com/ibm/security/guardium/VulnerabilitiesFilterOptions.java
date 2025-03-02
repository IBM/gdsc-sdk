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
import com.ibm.security.guardium.Compliance;
import com.ibm.security.guardium.VulnerabilityAffectedDataStoreFilterOptions;
import com.ibm.security.guardium.VulnerabilityCriticality;
import com.ibm.security.guardium.VulnerabilityStatusType;
import com.ibm.security.guardium.VulnerabilityStatusTypeFamily;
import com.ibm.security.guardium.VulnerabilityThreatCategory;
import com.ibm.security.guardium.VulnerabilityType;
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

import com.ibm.security.JSON;

/**
 * VulnerabilitiesFilterOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class VulnerabilitiesFilterOptions {
  public static final String SERIALIZED_NAME_VULNERABILITY_TYPES = "vulnerabilityTypes";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY_TYPES)
  private List<VulnerabilityType> vulnerabilityTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CRITICALITIES = "criticalities";
  @SerializedName(SERIALIZED_NAME_CRITICALITIES)
  private List<VulnerabilityCriticality> criticalities = new ArrayList<>();

  /**
   * Gets or Sets threats
   */
  @JsonAdapter(ThreatsEnum.Adapter.class)
  public enum ThreatsEnum {
    DATA_LEAKAGE("Data Leakage"),
    
    RANSOMWARE("Ransomware"),
    
    COMPLIANCE_VIOLATION("Compliance Violation"),
    
    MALWARE("Malware"),
    
    EXTERNAL_SHARING("External Sharing");

    private String value;

    ThreatsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThreatsEnum fromValue(String value) {
      for (ThreatsEnum b : ThreatsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ThreatsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThreatsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThreatsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ThreatsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ThreatsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_THREATS = "threats";
  @SerializedName(SERIALIZED_NAME_THREATS)
  private List<ThreatsEnum> threats = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPLIANCE = "compliance";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE)
  private List<Compliance> compliance = new ArrayList<>();

  public static final String SERIALIZED_NAME_THREAT_CATEGORIES = "threatCategories";
  @SerializedName(SERIALIZED_NAME_THREAT_CATEGORIES)
  private List<VulnerabilityThreatCategory> threatCategories = new ArrayList<>();

  public static final String SERIALIZED_NAME_AFFECTED_DATA_STORE = "affectedDataStore";
  @SerializedName(SERIALIZED_NAME_AFFECTED_DATA_STORE)
  private VulnerabilityAffectedDataStoreFilterOptions affectedDataStore;

  public static final String SERIALIZED_NAME_STATUS_TYPES = "statusTypes";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPES)
  private List<VulnerabilityStatusType> statusTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_TYPE_FAMILIES = "statusTypeFamilies";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE_FAMILIES)
  private List<VulnerabilityStatusTypeFamily> statusTypeFamilies = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISCOVERED_SINCE = "discoveredSince";
  @SerializedName(SERIALIZED_NAME_DISCOVERED_SINCE)
  private BigDecimal discoveredSince;

  public VulnerabilitiesFilterOptions() {
  }

  public VulnerabilitiesFilterOptions vulnerabilityTypes(List<VulnerabilityType> vulnerabilityTypes) {
    this.vulnerabilityTypes = vulnerabilityTypes;
    return this;
  }

  public VulnerabilitiesFilterOptions addVulnerabilityTypesItem(VulnerabilityType vulnerabilityTypesItem) {
    if (this.vulnerabilityTypes == null) {
      this.vulnerabilityTypes = new ArrayList<>();
    }
    this.vulnerabilityTypes.add(vulnerabilityTypesItem);
    return this;
  }

   /**
   * Get vulnerabilityTypes
   * @return vulnerabilityTypes
  **/
  @javax.annotation.Nullable
  public List<VulnerabilityType> getVulnerabilityTypes() {
    return vulnerabilityTypes;
  }

  public void setVulnerabilityTypes(List<VulnerabilityType> vulnerabilityTypes) {
    this.vulnerabilityTypes = vulnerabilityTypes;
  }


  public VulnerabilitiesFilterOptions criticalities(List<VulnerabilityCriticality> criticalities) {
    this.criticalities = criticalities;
    return this;
  }

  public VulnerabilitiesFilterOptions addCriticalitiesItem(VulnerabilityCriticality criticalitiesItem) {
    if (this.criticalities == null) {
      this.criticalities = new ArrayList<>();
    }
    this.criticalities.add(criticalitiesItem);
    return this;
  }

   /**
   * Get criticalities
   * @return criticalities
  **/
  @javax.annotation.Nullable
  public List<VulnerabilityCriticality> getCriticalities() {
    return criticalities;
  }

  public void setCriticalities(List<VulnerabilityCriticality> criticalities) {
    this.criticalities = criticalities;
  }


  public VulnerabilitiesFilterOptions threats(List<ThreatsEnum> threats) {
    this.threats = threats;
    return this;
  }

  public VulnerabilitiesFilterOptions addThreatsItem(ThreatsEnum threatsItem) {
    if (this.threats == null) {
      this.threats = new ArrayList<>();
    }
    this.threats.add(threatsItem);
    return this;
  }

   /**
   * Get threats
   * @return threats
  **/
  @javax.annotation.Nullable
  public List<ThreatsEnum> getThreats() {
    return threats;
  }

  public void setThreats(List<ThreatsEnum> threats) {
    this.threats = threats;
  }


  public VulnerabilitiesFilterOptions compliance(List<Compliance> compliance) {
    this.compliance = compliance;
    return this;
  }

  public VulnerabilitiesFilterOptions addComplianceItem(Compliance complianceItem) {
    if (this.compliance == null) {
      this.compliance = new ArrayList<>();
    }
    this.compliance.add(complianceItem);
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @javax.annotation.Nullable
  public List<Compliance> getCompliance() {
    return compliance;
  }

  public void setCompliance(List<Compliance> compliance) {
    this.compliance = compliance;
  }


  public VulnerabilitiesFilterOptions threatCategories(List<VulnerabilityThreatCategory> threatCategories) {
    this.threatCategories = threatCategories;
    return this;
  }

  public VulnerabilitiesFilterOptions addThreatCategoriesItem(VulnerabilityThreatCategory threatCategoriesItem) {
    if (this.threatCategories == null) {
      this.threatCategories = new ArrayList<>();
    }
    this.threatCategories.add(threatCategoriesItem);
    return this;
  }

   /**
   * Get threatCategories
   * @return threatCategories
  **/
  @javax.annotation.Nullable
  public List<VulnerabilityThreatCategory> getThreatCategories() {
    return threatCategories;
  }

  public void setThreatCategories(List<VulnerabilityThreatCategory> threatCategories) {
    this.threatCategories = threatCategories;
  }


  public VulnerabilitiesFilterOptions affectedDataStore(VulnerabilityAffectedDataStoreFilterOptions affectedDataStore) {
    this.affectedDataStore = affectedDataStore;
    return this;
  }

   /**
   * Get affectedDataStore
   * @return affectedDataStore
  **/
  @javax.annotation.Nullable
  public VulnerabilityAffectedDataStoreFilterOptions getAffectedDataStore() {
    return affectedDataStore;
  }

  public void setAffectedDataStore(VulnerabilityAffectedDataStoreFilterOptions affectedDataStore) {
    this.affectedDataStore = affectedDataStore;
  }


  public VulnerabilitiesFilterOptions statusTypes(List<VulnerabilityStatusType> statusTypes) {
    this.statusTypes = statusTypes;
    return this;
  }

  public VulnerabilitiesFilterOptions addStatusTypesItem(VulnerabilityStatusType statusTypesItem) {
    if (this.statusTypes == null) {
      this.statusTypes = new ArrayList<>();
    }
    this.statusTypes.add(statusTypesItem);
    return this;
  }

   /**
   * Get statusTypes
   * @return statusTypes
  **/
  @javax.annotation.Nullable
  public List<VulnerabilityStatusType> getStatusTypes() {
    return statusTypes;
  }

  public void setStatusTypes(List<VulnerabilityStatusType> statusTypes) {
    this.statusTypes = statusTypes;
  }


  public VulnerabilitiesFilterOptions statusTypeFamilies(List<VulnerabilityStatusTypeFamily> statusTypeFamilies) {
    this.statusTypeFamilies = statusTypeFamilies;
    return this;
  }

  public VulnerabilitiesFilterOptions addStatusTypeFamiliesItem(VulnerabilityStatusTypeFamily statusTypeFamiliesItem) {
    if (this.statusTypeFamilies == null) {
      this.statusTypeFamilies = new ArrayList<>();
    }
    this.statusTypeFamilies.add(statusTypeFamiliesItem);
    return this;
  }

   /**
   * Get statusTypeFamilies
   * @return statusTypeFamilies
  **/
  @javax.annotation.Nullable
  public List<VulnerabilityStatusTypeFamily> getStatusTypeFamilies() {
    return statusTypeFamilies;
  }

  public void setStatusTypeFamilies(List<VulnerabilityStatusTypeFamily> statusTypeFamilies) {
    this.statusTypeFamilies = statusTypeFamilies;
  }


  public VulnerabilitiesFilterOptions discoveredSince(BigDecimal discoveredSince) {
    this.discoveredSince = discoveredSince;
    return this;
  }

   /**
   * as epoch timestamp
   * @return discoveredSince
  **/
  @javax.annotation.Nullable
  public BigDecimal getDiscoveredSince() {
    return discoveredSince;
  }

  public void setDiscoveredSince(BigDecimal discoveredSince) {
    this.discoveredSince = discoveredSince;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VulnerabilitiesFilterOptions vulnerabilitiesFilterOptions = (VulnerabilitiesFilterOptions) o;
    return Objects.equals(this.vulnerabilityTypes, vulnerabilitiesFilterOptions.vulnerabilityTypes) &&
        Objects.equals(this.criticalities, vulnerabilitiesFilterOptions.criticalities) &&
        Objects.equals(this.threats, vulnerabilitiesFilterOptions.threats) &&
        Objects.equals(this.compliance, vulnerabilitiesFilterOptions.compliance) &&
        Objects.equals(this.threatCategories, vulnerabilitiesFilterOptions.threatCategories) &&
        Objects.equals(this.affectedDataStore, vulnerabilitiesFilterOptions.affectedDataStore) &&
        Objects.equals(this.statusTypes, vulnerabilitiesFilterOptions.statusTypes) &&
        Objects.equals(this.statusTypeFamilies, vulnerabilitiesFilterOptions.statusTypeFamilies) &&
        Objects.equals(this.discoveredSince, vulnerabilitiesFilterOptions.discoveredSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vulnerabilityTypes, criticalities, threats, compliance, threatCategories, affectedDataStore, statusTypes, statusTypeFamilies, discoveredSince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VulnerabilitiesFilterOptions {\n");
    sb.append("    vulnerabilityTypes: ").append(toIndentedString(vulnerabilityTypes)).append("\n");
    sb.append("    criticalities: ").append(toIndentedString(criticalities)).append("\n");
    sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    threatCategories: ").append(toIndentedString(threatCategories)).append("\n");
    sb.append("    affectedDataStore: ").append(toIndentedString(affectedDataStore)).append("\n");
    sb.append("    statusTypes: ").append(toIndentedString(statusTypes)).append("\n");
    sb.append("    statusTypeFamilies: ").append(toIndentedString(statusTypeFamilies)).append("\n");
    sb.append("    discoveredSince: ").append(toIndentedString(discoveredSince)).append("\n");
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
    openapiFields.add("vulnerabilityTypes");
    openapiFields.add("criticalities");
    openapiFields.add("threats");
    openapiFields.add("compliance");
    openapiFields.add("threatCategories");
    openapiFields.add("affectedDataStore");
    openapiFields.add("statusTypes");
    openapiFields.add("statusTypeFamilies");
    openapiFields.add("discoveredSince");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VulnerabilitiesFilterOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VulnerabilitiesFilterOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VulnerabilitiesFilterOptions is not found in the empty JSON string", VulnerabilitiesFilterOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VulnerabilitiesFilterOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VulnerabilitiesFilterOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("vulnerabilityTypes") != null && !jsonObj.get("vulnerabilityTypes").isJsonNull() && !jsonObj.get("vulnerabilityTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vulnerabilityTypes` to be an array in the JSON string but got `%s`", jsonObj.get("vulnerabilityTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("criticalities") != null && !jsonObj.get("criticalities").isJsonNull() && !jsonObj.get("criticalities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `criticalities` to be an array in the JSON string but got `%s`", jsonObj.get("criticalities").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("threats") != null && !jsonObj.get("threats").isJsonNull() && !jsonObj.get("threats").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `threats` to be an array in the JSON string but got `%s`", jsonObj.get("threats").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("compliance") != null && !jsonObj.get("compliance").isJsonNull() && !jsonObj.get("compliance").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `compliance` to be an array in the JSON string but got `%s`", jsonObj.get("compliance").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("threatCategories") != null && !jsonObj.get("threatCategories").isJsonNull() && !jsonObj.get("threatCategories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `threatCategories` to be an array in the JSON string but got `%s`", jsonObj.get("threatCategories").toString()));
      }
      // validate the optional field `affectedDataStore`
      if (jsonObj.get("affectedDataStore") != null && !jsonObj.get("affectedDataStore").isJsonNull()) {
        VulnerabilityAffectedDataStoreFilterOptions.validateJsonElement(jsonObj.get("affectedDataStore"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusTypes") != null && !jsonObj.get("statusTypes").isJsonNull() && !jsonObj.get("statusTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusTypes` to be an array in the JSON string but got `%s`", jsonObj.get("statusTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("statusTypeFamilies") != null && !jsonObj.get("statusTypeFamilies").isJsonNull() && !jsonObj.get("statusTypeFamilies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusTypeFamilies` to be an array in the JSON string but got `%s`", jsonObj.get("statusTypeFamilies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VulnerabilitiesFilterOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VulnerabilitiesFilterOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VulnerabilitiesFilterOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VulnerabilitiesFilterOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<VulnerabilitiesFilterOptions>() {
           @Override
           public void write(JsonWriter out, VulnerabilitiesFilterOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VulnerabilitiesFilterOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VulnerabilitiesFilterOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VulnerabilitiesFilterOptions
  * @throws IOException if the JSON string is invalid with respect to VulnerabilitiesFilterOptions
  */
  public static VulnerabilitiesFilterOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VulnerabilitiesFilterOptions.class);
  }

 /**
  * Convert an instance of VulnerabilitiesFilterOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

