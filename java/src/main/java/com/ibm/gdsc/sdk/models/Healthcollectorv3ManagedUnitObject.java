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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Healthcollectorv3MUDetailsObj;
import com.ibm.gdsc.sdk.models.Healthcollectorv3StapObject;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * ManagedUnitObject gets information about managed units.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3ManagedUnitObject {
  public static final String SERIALIZED_NAME_AGGREGATION_HEALTH_STATUS = "aggregation_health_status";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_HEALTH_STATUS)
  private Integer aggregationHealthStatus;

  public static final String SERIALIZED_NAME_CONNECTIVITY = "connectivity";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY)
  private Integer connectivity;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Healthcollectorv3MUDetailsObj details;

  public static final String SERIALIZED_NAME_EXPORTS_TO = "exports_to";
  @SerializedName(SERIALIZED_NAME_EXPORTS_TO)
  private List<String> exportsTo = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPORTS_FROM = "imports_from";
  @SerializedName(SERIALIZED_NAME_IMPORTS_FROM)
  private List<String> importsFrom = new ArrayList<>();

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_OVERALL_STAP_STATUS_FOR_MU = "overall_stap_status_for_mu";
  @SerializedName(SERIALIZED_NAME_OVERALL_STAP_STATUS_FOR_MU)
  private Integer overallStapStatusForMu;

  public static final String SERIALIZED_NAME_OVERALL_STATUS = "overall_status";
  @SerializedName(SERIALIZED_NAME_OVERALL_STATUS)
  private Integer overallStatus;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private String patch;

  public static final String SERIALIZED_NAME_STAPS = "staps";
  @SerializedName(SERIALIZED_NAME_STAPS)
  private List<Healthcollectorv3StapObject> staps = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNIT_HOSTNAME = "unit_hostname";
  @SerializedName(SERIALIZED_NAME_UNIT_HOSTNAME)
  private String unitHostname;

  public static final String SERIALIZED_NAME_UNIT_IP = "unit_ip";
  @SerializedName(SERIALIZED_NAME_UNIT_IP)
  private String unitIp;

  public static final String SERIALIZED_NAME_UNIT_UTILIZATION_HEALTH_STATUS = "unit_utilization_health_status";
  @SerializedName(SERIALIZED_NAME_UNIT_UTILIZATION_HEALTH_STATUS)
  private Integer unitUtilizationHealthStatus;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Healthcollectorv3ManagedUnitObject() {
  }

  public Healthcollectorv3ManagedUnitObject aggregationHealthStatus(Integer aggregationHealthStatus) {
    this.aggregationHealthStatus = aggregationHealthStatus;
    return this;
  }

   /**
   * Aggregation health status.
   * @return aggregationHealthStatus
  **/
  @javax.annotation.Nullable
  public Integer getAggregationHealthStatus() {
    return aggregationHealthStatus;
  }

  public void setAggregationHealthStatus(Integer aggregationHealthStatus) {
    this.aggregationHealthStatus = aggregationHealthStatus;
  }


  public Healthcollectorv3ManagedUnitObject connectivity(Integer connectivity) {
    this.connectivity = connectivity;
    return this;
  }

   /**
   * Connectivity status.
   * @return connectivity
  **/
  @javax.annotation.Nullable
  public Integer getConnectivity() {
    return connectivity;
  }

  public void setConnectivity(Integer connectivity) {
    this.connectivity = connectivity;
  }


  public Healthcollectorv3ManagedUnitObject details(Healthcollectorv3MUDetailsObj details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3MUDetailsObj getDetails() {
    return details;
  }

  public void setDetails(Healthcollectorv3MUDetailsObj details) {
    this.details = details;
  }


  public Healthcollectorv3ManagedUnitObject exportsTo(List<String> exportsTo) {
    this.exportsTo = exportsTo;
    return this;
  }

  public Healthcollectorv3ManagedUnitObject addExportsToItem(String exportsToItem) {
    if (this.exportsTo == null) {
      this.exportsTo = new ArrayList<>();
    }
    this.exportsTo.add(exportsToItem);
    return this;
  }

   /**
   * Aggregator the collector exports data to.
   * @return exportsTo
  **/
  @javax.annotation.Nullable
  public List<String> getExportsTo() {
    return exportsTo;
  }

  public void setExportsTo(List<String> exportsTo) {
    this.exportsTo = exportsTo;
  }


  public Healthcollectorv3ManagedUnitObject importsFrom(List<String> importsFrom) {
    this.importsFrom = importsFrom;
    return this;
  }

  public Healthcollectorv3ManagedUnitObject addImportsFromItem(String importsFromItem) {
    if (this.importsFrom == null) {
      this.importsFrom = new ArrayList<>();
    }
    this.importsFrom.add(importsFromItem);
    return this;
  }

   /**
   * Collectors the aggregator imports data from.
   * @return importsFrom
  **/
  @javax.annotation.Nullable
  public List<String> getImportsFrom() {
    return importsFrom;
  }

  public void setImportsFrom(List<String> importsFrom) {
    this.importsFrom = importsFrom;
  }


  public Healthcollectorv3ManagedUnitObject osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Operating system version.
   * @return osVersion
  **/
  @javax.annotation.Nullable
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public Healthcollectorv3ManagedUnitObject overallStapStatusForMu(Integer overallStapStatusForMu) {
    this.overallStapStatusForMu = overallStapStatusForMu;
    return this;
  }

   /**
   * Overall status of S-TAPs for the system.
   * @return overallStapStatusForMu
  **/
  @javax.annotation.Nullable
  public Integer getOverallStapStatusForMu() {
    return overallStapStatusForMu;
  }

  public void setOverallStapStatusForMu(Integer overallStapStatusForMu) {
    this.overallStapStatusForMu = overallStapStatusForMu;
  }


  public Healthcollectorv3ManagedUnitObject overallStatus(Integer overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

   /**
   * Overall system status.
   * @return overallStatus
  **/
  @javax.annotation.Nullable
  public Integer getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(Integer overallStatus) {
    this.overallStatus = overallStatus;
  }


  public Healthcollectorv3ManagedUnitObject patch(String patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Patch number.
   * @return patch
  **/
  @javax.annotation.Nullable
  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }


  public Healthcollectorv3ManagedUnitObject staps(List<Healthcollectorv3StapObject> staps) {
    this.staps = staps;
    return this;
  }

  public Healthcollectorv3ManagedUnitObject addStapsItem(Healthcollectorv3StapObject stapsItem) {
    if (this.staps == null) {
      this.staps = new ArrayList<>();
    }
    this.staps.add(stapsItem);
    return this;
  }

   /**
   * Details of S-TAPs for the system.
   * @return staps
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3StapObject> getStaps() {
    return staps;
  }

  public void setStaps(List<Healthcollectorv3StapObject> staps) {
    this.staps = staps;
  }


  public Healthcollectorv3ManagedUnitObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Unit type.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Healthcollectorv3ManagedUnitObject unitHostname(String unitHostname) {
    this.unitHostname = unitHostname;
    return this;
  }

   /**
   * Name of the Guardium Data Protection system.
   * @return unitHostname
  **/
  @javax.annotation.Nullable
  public String getUnitHostname() {
    return unitHostname;
  }

  public void setUnitHostname(String unitHostname) {
    this.unitHostname = unitHostname;
  }


  public Healthcollectorv3ManagedUnitObject unitIp(String unitIp) {
    this.unitIp = unitIp;
    return this;
  }

   /**
   * IP address.
   * @return unitIp
  **/
  @javax.annotation.Nullable
  public String getUnitIp() {
    return unitIp;
  }

  public void setUnitIp(String unitIp) {
    this.unitIp = unitIp;
  }


  public Healthcollectorv3ManagedUnitObject unitUtilizationHealthStatus(Integer unitUtilizationHealthStatus) {
    this.unitUtilizationHealthStatus = unitUtilizationHealthStatus;
    return this;
  }

   /**
   * Unit utilization status.
   * @return unitUtilizationHealthStatus
  **/
  @javax.annotation.Nullable
  public Integer getUnitUtilizationHealthStatus() {
    return unitUtilizationHealthStatus;
  }

  public void setUnitUtilizationHealthStatus(Integer unitUtilizationHealthStatus) {
    this.unitUtilizationHealthStatus = unitUtilizationHealthStatus;
  }


  public Healthcollectorv3ManagedUnitObject version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Guardium Data Protection version.
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
    Healthcollectorv3ManagedUnitObject healthcollectorv3ManagedUnitObject = (Healthcollectorv3ManagedUnitObject) o;
    return Objects.equals(this.aggregationHealthStatus, healthcollectorv3ManagedUnitObject.aggregationHealthStatus) &&
        Objects.equals(this.connectivity, healthcollectorv3ManagedUnitObject.connectivity) &&
        Objects.equals(this.details, healthcollectorv3ManagedUnitObject.details) &&
        Objects.equals(this.exportsTo, healthcollectorv3ManagedUnitObject.exportsTo) &&
        Objects.equals(this.importsFrom, healthcollectorv3ManagedUnitObject.importsFrom) &&
        Objects.equals(this.osVersion, healthcollectorv3ManagedUnitObject.osVersion) &&
        Objects.equals(this.overallStapStatusForMu, healthcollectorv3ManagedUnitObject.overallStapStatusForMu) &&
        Objects.equals(this.overallStatus, healthcollectorv3ManagedUnitObject.overallStatus) &&
        Objects.equals(this.patch, healthcollectorv3ManagedUnitObject.patch) &&
        Objects.equals(this.staps, healthcollectorv3ManagedUnitObject.staps) &&
        Objects.equals(this.type, healthcollectorv3ManagedUnitObject.type) &&
        Objects.equals(this.unitHostname, healthcollectorv3ManagedUnitObject.unitHostname) &&
        Objects.equals(this.unitIp, healthcollectorv3ManagedUnitObject.unitIp) &&
        Objects.equals(this.unitUtilizationHealthStatus, healthcollectorv3ManagedUnitObject.unitUtilizationHealthStatus) &&
        Objects.equals(this.version, healthcollectorv3ManagedUnitObject.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationHealthStatus, connectivity, details, exportsTo, importsFrom, osVersion, overallStapStatusForMu, overallStatus, patch, staps, type, unitHostname, unitIp, unitUtilizationHealthStatus, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3ManagedUnitObject {\n");
    sb.append("    aggregationHealthStatus: ").append(toIndentedString(aggregationHealthStatus)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    exportsTo: ").append(toIndentedString(exportsTo)).append("\n");
    sb.append("    importsFrom: ").append(toIndentedString(importsFrom)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    overallStapStatusForMu: ").append(toIndentedString(overallStapStatusForMu)).append("\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    staps: ").append(toIndentedString(staps)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitHostname: ").append(toIndentedString(unitHostname)).append("\n");
    sb.append("    unitIp: ").append(toIndentedString(unitIp)).append("\n");
    sb.append("    unitUtilizationHealthStatus: ").append(toIndentedString(unitUtilizationHealthStatus)).append("\n");
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
    openapiFields.add("aggregation_health_status");
    openapiFields.add("connectivity");
    openapiFields.add("details");
    openapiFields.add("exports_to");
    openapiFields.add("imports_from");
    openapiFields.add("os_version");
    openapiFields.add("overall_stap_status_for_mu");
    openapiFields.add("overall_status");
    openapiFields.add("patch");
    openapiFields.add("staps");
    openapiFields.add("type");
    openapiFields.add("unit_hostname");
    openapiFields.add("unit_ip");
    openapiFields.add("unit_utilization_health_status");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3ManagedUnitObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3ManagedUnitObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3ManagedUnitObject is not found in the empty JSON string", Healthcollectorv3ManagedUnitObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3ManagedUnitObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3ManagedUnitObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Healthcollectorv3MUDetailsObj.validateJsonElement(jsonObj.get("details"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("exports_to") != null && !jsonObj.get("exports_to").isJsonNull() && !jsonObj.get("exports_to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exports_to` to be an array in the JSON string but got `%s`", jsonObj.get("exports_to").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("imports_from") != null && !jsonObj.get("imports_from").isJsonNull() && !jsonObj.get("imports_from").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imports_from` to be an array in the JSON string but got `%s`", jsonObj.get("imports_from").toString()));
      }
      if ((jsonObj.get("os_version") != null && !jsonObj.get("os_version").isJsonNull()) && !jsonObj.get("os_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_version").toString()));
      }
      if ((jsonObj.get("patch") != null && !jsonObj.get("patch").isJsonNull()) && !jsonObj.get("patch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch").toString()));
      }
      if (jsonObj.get("staps") != null && !jsonObj.get("staps").isJsonNull()) {
        JsonArray jsonArraystaps = jsonObj.getAsJsonArray("staps");
        if (jsonArraystaps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("staps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `staps` to be an array in the JSON string but got `%s`", jsonObj.get("staps").toString()));
          }

          // validate the optional field `staps` (array)
          for (int i = 0; i < jsonArraystaps.size(); i++) {
            Healthcollectorv3StapObject.validateJsonElement(jsonArraystaps.get(i));
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("unit_hostname") != null && !jsonObj.get("unit_hostname").isJsonNull()) && !jsonObj.get("unit_hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_hostname").toString()));
      }
      if ((jsonObj.get("unit_ip") != null && !jsonObj.get("unit_ip").isJsonNull()) && !jsonObj.get("unit_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_ip").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3ManagedUnitObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3ManagedUnitObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3ManagedUnitObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3ManagedUnitObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3ManagedUnitObject>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3ManagedUnitObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3ManagedUnitObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3ManagedUnitObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3ManagedUnitObject
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3ManagedUnitObject
  */
  public static Healthcollectorv3ManagedUnitObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3ManagedUnitObject.class);
  }

 /**
  * Convert an instance of Healthcollectorv3ManagedUnitObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

