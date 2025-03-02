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
import com.ibm.security.guardium.Healthcollectorv3InspectionEngineDetails;
import com.ibm.security.guardium.Healthcollectorv3StapDetailsObject;
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

import com.ibm.security.JSON;

/**
 * StapObject gets information about monitoring agents.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3StapObject {
  public static final String SERIALIZED_NAME_COLLECTOR_HOSTNAME = "collector_hostname";
  @SerializedName(SERIALIZED_NAME_COLLECTOR_HOSTNAME)
  private String collectorHostname;

  public static final String SERIALIZED_NAME_CONNECTIVITY = "connectivity";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY)
  private Integer connectivity;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Healthcollectorv3StapDetailsObject details;

  public static final String SERIALIZED_NAME_IE_COUNT = "ie_count";
  @SerializedName(SERIALIZED_NAME_IE_COUNT)
  private Integer ieCount;

  public static final String SERIALIZED_NAME_IE_DETAILS = "ie_details";
  @SerializedName(SERIALIZED_NAME_IE_DETAILS)
  private List<Healthcollectorv3InspectionEngineDetails> ieDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_KTAP = "ktap";
  @SerializedName(SERIALIZED_NAME_KTAP)
  private Integer ktap;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OS_TYPE = "os_type";
  @SerializedName(SERIALIZED_NAME_OS_TYPE)
  private String osType;

  public static final String SERIALIZED_NAME_OVERALL_IE_STATUS = "overall_ie_status";
  @SerializedName(SERIALIZED_NAME_OVERALL_IE_STATUS)
  private Integer overallIeStatus;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public static final String SERIALIZED_NAME_STAP_IP = "stap_ip";
  @SerializedName(SERIALIZED_NAME_STAP_IP)
  private String stapIp;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TRAFFIC = "traffic";
  @SerializedName(SERIALIZED_NAME_TRAFFIC)
  private Integer traffic;

  public Healthcollectorv3StapObject() {
  }

  public Healthcollectorv3StapObject collectorHostname(String collectorHostname) {
    this.collectorHostname = collectorHostname;
    return this;
  }

   /**
   * Host name of Guardium Data Protection system.
   * @return collectorHostname
  **/
  @javax.annotation.Nullable
  public String getCollectorHostname() {
    return collectorHostname;
  }

  public void setCollectorHostname(String collectorHostname) {
    this.collectorHostname = collectorHostname;
  }


  public Healthcollectorv3StapObject connectivity(Integer connectivity) {
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


  public Healthcollectorv3StapObject details(Healthcollectorv3StapDetailsObject details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3StapDetailsObject getDetails() {
    return details;
  }

  public void setDetails(Healthcollectorv3StapDetailsObject details) {
    this.details = details;
  }


  public Healthcollectorv3StapObject ieCount(Integer ieCount) {
    this.ieCount = ieCount;
    return this;
  }

   /**
   * Count of inspection engines.
   * @return ieCount
  **/
  @javax.annotation.Nullable
  public Integer getIeCount() {
    return ieCount;
  }

  public void setIeCount(Integer ieCount) {
    this.ieCount = ieCount;
  }


  public Healthcollectorv3StapObject ieDetails(List<Healthcollectorv3InspectionEngineDetails> ieDetails) {
    this.ieDetails = ieDetails;
    return this;
  }

  public Healthcollectorv3StapObject addIeDetailsItem(Healthcollectorv3InspectionEngineDetails ieDetailsItem) {
    if (this.ieDetails == null) {
      this.ieDetails = new ArrayList<>();
    }
    this.ieDetails.add(ieDetailsItem);
    return this;
  }

   /**
   * Details about inspection engines.
   * @return ieDetails
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3InspectionEngineDetails> getIeDetails() {
    return ieDetails;
  }

  public void setIeDetails(List<Healthcollectorv3InspectionEngineDetails> ieDetails) {
    this.ieDetails = ieDetails;
  }


  public Healthcollectorv3StapObject ktap(Integer ktap) {
    this.ktap = ktap;
    return this;
  }

   /**
   * K-TAP status.
   * @return ktap
  **/
  @javax.annotation.Nullable
  public Integer getKtap() {
    return ktap;
  }

  public void setKtap(Integer ktap) {
    this.ktap = ktap;
  }


  public Healthcollectorv3StapObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the S-TAP.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Healthcollectorv3StapObject osType(String osType) {
    this.osType = osType;
    return this;
  }

   /**
   * Operating system.
   * @return osType
  **/
  @javax.annotation.Nullable
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }


  public Healthcollectorv3StapObject overallIeStatus(Integer overallIeStatus) {
    this.overallIeStatus = overallIeStatus;
    return this;
  }

   /**
   * Overall status of inspection engines.
   * @return overallIeStatus
  **/
  @javax.annotation.Nullable
  public Integer getOverallIeStatus() {
    return overallIeStatus;
  }

  public void setOverallIeStatus(Integer overallIeStatus) {
    this.overallIeStatus = overallIeStatus;
  }


  public Healthcollectorv3StapObject revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision.
   * @return revision
  **/
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }


  public Healthcollectorv3StapObject stapIp(String stapIp) {
    this.stapIp = stapIp;
    return this;
  }

   /**
   * IP address.
   * @return stapIp
  **/
  @javax.annotation.Nullable
  public String getStapIp() {
    return stapIp;
  }

  public void setStapIp(String stapIp) {
    this.stapIp = stapIp;
  }


  public Healthcollectorv3StapObject status(Integer status) {
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


  public Healthcollectorv3StapObject traffic(Integer traffic) {
    this.traffic = traffic;
    return this;
  }

   /**
   * Traffic status.
   * @return traffic
  **/
  @javax.annotation.Nullable
  public Integer getTraffic() {
    return traffic;
  }

  public void setTraffic(Integer traffic) {
    this.traffic = traffic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3StapObject healthcollectorv3StapObject = (Healthcollectorv3StapObject) o;
    return Objects.equals(this.collectorHostname, healthcollectorv3StapObject.collectorHostname) &&
        Objects.equals(this.connectivity, healthcollectorv3StapObject.connectivity) &&
        Objects.equals(this.details, healthcollectorv3StapObject.details) &&
        Objects.equals(this.ieCount, healthcollectorv3StapObject.ieCount) &&
        Objects.equals(this.ieDetails, healthcollectorv3StapObject.ieDetails) &&
        Objects.equals(this.ktap, healthcollectorv3StapObject.ktap) &&
        Objects.equals(this.name, healthcollectorv3StapObject.name) &&
        Objects.equals(this.osType, healthcollectorv3StapObject.osType) &&
        Objects.equals(this.overallIeStatus, healthcollectorv3StapObject.overallIeStatus) &&
        Objects.equals(this.revision, healthcollectorv3StapObject.revision) &&
        Objects.equals(this.stapIp, healthcollectorv3StapObject.stapIp) &&
        Objects.equals(this.status, healthcollectorv3StapObject.status) &&
        Objects.equals(this.traffic, healthcollectorv3StapObject.traffic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectorHostname, connectivity, details, ieCount, ieDetails, ktap, name, osType, overallIeStatus, revision, stapIp, status, traffic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3StapObject {\n");
    sb.append("    collectorHostname: ").append(toIndentedString(collectorHostname)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    ieCount: ").append(toIndentedString(ieCount)).append("\n");
    sb.append("    ieDetails: ").append(toIndentedString(ieDetails)).append("\n");
    sb.append("    ktap: ").append(toIndentedString(ktap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    overallIeStatus: ").append(toIndentedString(overallIeStatus)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    stapIp: ").append(toIndentedString(stapIp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
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
    openapiFields.add("collector_hostname");
    openapiFields.add("connectivity");
    openapiFields.add("details");
    openapiFields.add("ie_count");
    openapiFields.add("ie_details");
    openapiFields.add("ktap");
    openapiFields.add("name");
    openapiFields.add("os_type");
    openapiFields.add("overall_ie_status");
    openapiFields.add("revision");
    openapiFields.add("stap_ip");
    openapiFields.add("status");
    openapiFields.add("traffic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3StapObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3StapObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3StapObject is not found in the empty JSON string", Healthcollectorv3StapObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3StapObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3StapObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("collector_hostname") != null && !jsonObj.get("collector_hostname").isJsonNull()) && !jsonObj.get("collector_hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collector_hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collector_hostname").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Healthcollectorv3StapDetailsObject.validateJsonElement(jsonObj.get("details"));
      }
      if (jsonObj.get("ie_details") != null && !jsonObj.get("ie_details").isJsonNull()) {
        JsonArray jsonArrayieDetails = jsonObj.getAsJsonArray("ie_details");
        if (jsonArrayieDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ie_details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ie_details` to be an array in the JSON string but got `%s`", jsonObj.get("ie_details").toString()));
          }

          // validate the optional field `ie_details` (array)
          for (int i = 0; i < jsonArrayieDetails.size(); i++) {
            Healthcollectorv3InspectionEngineDetails.validateJsonElement(jsonArrayieDetails.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("os_type") != null && !jsonObj.get("os_type").isJsonNull()) && !jsonObj.get("os_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os_type").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
      if ((jsonObj.get("stap_ip") != null && !jsonObj.get("stap_ip").isJsonNull()) && !jsonObj.get("stap_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stap_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stap_ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3StapObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3StapObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3StapObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3StapObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3StapObject>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3StapObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3StapObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3StapObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3StapObject
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3StapObject
  */
  public static Healthcollectorv3StapObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3StapObject.class);
  }

 /**
  * Convert an instance of Healthcollectorv3StapObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

