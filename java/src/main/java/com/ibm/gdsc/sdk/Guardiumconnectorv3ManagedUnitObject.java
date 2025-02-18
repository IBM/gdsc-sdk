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
import com.ibm.gdsc.sdk.Guardiumconnectorv3MUDetailsObj;
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

import com.ibm.gdsc.JSON;

/**
 * Information about managed units.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3ManagedUnitObject {
  public static final String SERIALIZED_NAME_AGG_HEALTH_STATUS = "agg_health_status";
  @SerializedName(SERIALIZED_NAME_AGG_HEALTH_STATUS)
  private Integer aggHealthStatus;

  public static final String SERIALIZED_NAME_CONNECTIVITY = "connectivity";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY)
  private Integer connectivity;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Guardiumconnectorv3MUDetailsObj details;

  public static final String SERIALIZED_NAME_EXPORTS_TO = "exports_to";
  @SerializedName(SERIALIZED_NAME_EXPORTS_TO)
  private List<String> exportsTo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IMPORTS_FROM = "imports_from";
  @SerializedName(SERIALIZED_NAME_IMPORTS_FROM)
  private List<String> importsFrom = new ArrayList<>();

  public static final String SERIALIZED_NAME_MUS_STAPS_HEALTH_STATUS = "mus_staps_health_status";
  @SerializedName(SERIALIZED_NAME_MUS_STAPS_HEALTH_STATUS)
  private Integer musStapsHealthStatus;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private String patch;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

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

  public Guardiumconnectorv3ManagedUnitObject() {
  }

  public Guardiumconnectorv3ManagedUnitObject aggHealthStatus(Integer aggHealthStatus) {
    this.aggHealthStatus = aggHealthStatus;
    return this;
  }

   /**
   * Aggregation health status.
   * @return aggHealthStatus
  **/
  @javax.annotation.Nullable
  public Integer getAggHealthStatus() {
    return aggHealthStatus;
  }

  public void setAggHealthStatus(Integer aggHealthStatus) {
    this.aggHealthStatus = aggHealthStatus;
  }


  public Guardiumconnectorv3ManagedUnitObject connectivity(Integer connectivity) {
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


  public Guardiumconnectorv3ManagedUnitObject details(Guardiumconnectorv3MUDetailsObj details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3MUDetailsObj getDetails() {
    return details;
  }

  public void setDetails(Guardiumconnectorv3MUDetailsObj details) {
    this.details = details;
  }


  public Guardiumconnectorv3ManagedUnitObject exportsTo(List<String> exportsTo) {
    this.exportsTo = exportsTo;
    return this;
  }

  public Guardiumconnectorv3ManagedUnitObject addExportsToItem(String exportsToItem) {
    if (this.exportsTo == null) {
      this.exportsTo = new ArrayList<>();
    }
    this.exportsTo.add(exportsToItem);
    return this;
  }

   /**
   * Aggregator the Managed Unit exports data to.
   * @return exportsTo
  **/
  @javax.annotation.Nullable
  public List<String> getExportsTo() {
    return exportsTo;
  }

  public void setExportsTo(List<String> exportsTo) {
    this.exportsTo = exportsTo;
  }


  public Guardiumconnectorv3ManagedUnitObject id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Guardiumconnectorv3ManagedUnitObject importsFrom(List<String> importsFrom) {
    this.importsFrom = importsFrom;
    return this;
  }

  public Guardiumconnectorv3ManagedUnitObject addImportsFromItem(String importsFromItem) {
    if (this.importsFrom == null) {
      this.importsFrom = new ArrayList<>();
    }
    this.importsFrom.add(importsFromItem);
    return this;
  }

   /**
   * Managed Units the aggregator imports data from.
   * @return importsFrom
  **/
  @javax.annotation.Nullable
  public List<String> getImportsFrom() {
    return importsFrom;
  }

  public void setImportsFrom(List<String> importsFrom) {
    this.importsFrom = importsFrom;
  }


  public Guardiumconnectorv3ManagedUnitObject musStapsHealthStatus(Integer musStapsHealthStatus) {
    this.musStapsHealthStatus = musStapsHealthStatus;
    return this;
  }

   /**
   * Monitoring agent health status.
   * @return musStapsHealthStatus
  **/
  @javax.annotation.Nullable
  public Integer getMusStapsHealthStatus() {
    return musStapsHealthStatus;
  }

  public void setMusStapsHealthStatus(Integer musStapsHealthStatus) {
    this.musStapsHealthStatus = musStapsHealthStatus;
  }


  public Guardiumconnectorv3ManagedUnitObject osVersion(String osVersion) {
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


  public Guardiumconnectorv3ManagedUnitObject patch(String patch) {
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


  public Guardiumconnectorv3ManagedUnitObject status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Overall status.
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public Guardiumconnectorv3ManagedUnitObject type(String type) {
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


  public Guardiumconnectorv3ManagedUnitObject unitHostname(String unitHostname) {
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


  public Guardiumconnectorv3ManagedUnitObject unitIp(String unitIp) {
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


  public Guardiumconnectorv3ManagedUnitObject unitUtilizationHealthStatus(Integer unitUtilizationHealthStatus) {
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


  public Guardiumconnectorv3ManagedUnitObject version(String version) {
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
    Guardiumconnectorv3ManagedUnitObject guardiumconnectorv3ManagedUnitObject = (Guardiumconnectorv3ManagedUnitObject) o;
    return Objects.equals(this.aggHealthStatus, guardiumconnectorv3ManagedUnitObject.aggHealthStatus) &&
        Objects.equals(this.connectivity, guardiumconnectorv3ManagedUnitObject.connectivity) &&
        Objects.equals(this.details, guardiumconnectorv3ManagedUnitObject.details) &&
        Objects.equals(this.exportsTo, guardiumconnectorv3ManagedUnitObject.exportsTo) &&
        Objects.equals(this.id, guardiumconnectorv3ManagedUnitObject.id) &&
        Objects.equals(this.importsFrom, guardiumconnectorv3ManagedUnitObject.importsFrom) &&
        Objects.equals(this.musStapsHealthStatus, guardiumconnectorv3ManagedUnitObject.musStapsHealthStatus) &&
        Objects.equals(this.osVersion, guardiumconnectorv3ManagedUnitObject.osVersion) &&
        Objects.equals(this.patch, guardiumconnectorv3ManagedUnitObject.patch) &&
        Objects.equals(this.status, guardiumconnectorv3ManagedUnitObject.status) &&
        Objects.equals(this.type, guardiumconnectorv3ManagedUnitObject.type) &&
        Objects.equals(this.unitHostname, guardiumconnectorv3ManagedUnitObject.unitHostname) &&
        Objects.equals(this.unitIp, guardiumconnectorv3ManagedUnitObject.unitIp) &&
        Objects.equals(this.unitUtilizationHealthStatus, guardiumconnectorv3ManagedUnitObject.unitUtilizationHealthStatus) &&
        Objects.equals(this.version, guardiumconnectorv3ManagedUnitObject.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggHealthStatus, connectivity, details, exportsTo, id, importsFrom, musStapsHealthStatus, osVersion, patch, status, type, unitHostname, unitIp, unitUtilizationHealthStatus, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3ManagedUnitObject {\n");
    sb.append("    aggHealthStatus: ").append(toIndentedString(aggHealthStatus)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    exportsTo: ").append(toIndentedString(exportsTo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importsFrom: ").append(toIndentedString(importsFrom)).append("\n");
    sb.append("    musStapsHealthStatus: ").append(toIndentedString(musStapsHealthStatus)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("agg_health_status");
    openapiFields.add("connectivity");
    openapiFields.add("details");
    openapiFields.add("exports_to");
    openapiFields.add("id");
    openapiFields.add("imports_from");
    openapiFields.add("mus_staps_health_status");
    openapiFields.add("os_version");
    openapiFields.add("patch");
    openapiFields.add("status");
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
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3ManagedUnitObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3ManagedUnitObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3ManagedUnitObject is not found in the empty JSON string", Guardiumconnectorv3ManagedUnitObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3ManagedUnitObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3ManagedUnitObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Guardiumconnectorv3MUDetailsObj.validateJsonElement(jsonObj.get("details"));
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
       if (!Guardiumconnectorv3ManagedUnitObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3ManagedUnitObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3ManagedUnitObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3ManagedUnitObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3ManagedUnitObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3ManagedUnitObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3ManagedUnitObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3ManagedUnitObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3ManagedUnitObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3ManagedUnitObject
  */
  public static Guardiumconnectorv3ManagedUnitObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3ManagedUnitObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3ManagedUnitObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

