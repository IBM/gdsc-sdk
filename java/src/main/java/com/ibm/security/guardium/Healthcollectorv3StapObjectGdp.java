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
import com.ibm.security.guardium.Healthcollectorv3InspectionEngineObjectGdp;
import com.ibm.security.guardium.Healthcollectorv3StapDetailsObjectGdp;
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
public class Healthcollectorv3StapObjectGdp {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<Healthcollectorv3InspectionEngineObjectGdp> children = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLLECTOR_HOST_NAME = "collector_host_name";
  @SerializedName(SERIALIZED_NAME_COLLECTOR_HOST_NAME)
  private String collectorHostName;

  public static final String SERIALIZED_NAME_CONNECTIVITY = "connectivity";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY)
  private Integer connectivity;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Healthcollectorv3StapDetailsObjectGdp details;

  public static final String SERIALIZED_NAME_IE_STATUS = "ie_status";
  @SerializedName(SERIALIZED_NAME_IE_STATUS)
  private Integer ieStatus;

  public static final String SERIALIZED_NAME_INSPECTION_ENGINE = "inspection_engine";
  @SerializedName(SERIALIZED_NAME_INSPECTION_ENGINE)
  private String inspectionEngine;

  public static final String SERIALIZED_NAME_KTAP = "ktap";
  @SerializedName(SERIALIZED_NAME_KTAP)
  private Integer ktap;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OS_TYPE = "os_type";
  @SerializedName(SERIALIZED_NAME_OS_TYPE)
  private String osType;

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

  public Healthcollectorv3StapObjectGdp() {
  }

  public Healthcollectorv3StapObjectGdp children(List<Healthcollectorv3InspectionEngineObjectGdp> children) {
    this.children = children;
    return this;
  }

  public Healthcollectorv3StapObjectGdp addChildrenItem(Healthcollectorv3InspectionEngineObjectGdp childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Details about inspection engines.
   * @return children
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3InspectionEngineObjectGdp> getChildren() {
    return children;
  }

  public void setChildren(List<Healthcollectorv3InspectionEngineObjectGdp> children) {
    this.children = children;
  }


  public Healthcollectorv3StapObjectGdp collectorHostName(String collectorHostName) {
    this.collectorHostName = collectorHostName;
    return this;
  }

   /**
   * Host name of Guardium Data Protection system.
   * @return collectorHostName
  **/
  @javax.annotation.Nullable
  public String getCollectorHostName() {
    return collectorHostName;
  }

  public void setCollectorHostName(String collectorHostName) {
    this.collectorHostName = collectorHostName;
  }


  public Healthcollectorv3StapObjectGdp connectivity(Integer connectivity) {
    this.connectivity = connectivity;
    return this;
  }

   /**
   * Connectivity status of the S-TAP.
   * @return connectivity
  **/
  @javax.annotation.Nullable
  public Integer getConnectivity() {
    return connectivity;
  }

  public void setConnectivity(Integer connectivity) {
    this.connectivity = connectivity;
  }


  public Healthcollectorv3StapObjectGdp details(Healthcollectorv3StapDetailsObjectGdp details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public Healthcollectorv3StapDetailsObjectGdp getDetails() {
    return details;
  }

  public void setDetails(Healthcollectorv3StapDetailsObjectGdp details) {
    this.details = details;
  }


  public Healthcollectorv3StapObjectGdp ieStatus(Integer ieStatus) {
    this.ieStatus = ieStatus;
    return this;
  }

   /**
   * Overall status of inspection engines.
   * @return ieStatus
  **/
  @javax.annotation.Nullable
  public Integer getIeStatus() {
    return ieStatus;
  }

  public void setIeStatus(Integer ieStatus) {
    this.ieStatus = ieStatus;
  }


  public Healthcollectorv3StapObjectGdp inspectionEngine(String inspectionEngine) {
    this.inspectionEngine = inspectionEngine;
    return this;
  }

   /**
   * Name of inspection engine.
   * @return inspectionEngine
  **/
  @javax.annotation.Nullable
  public String getInspectionEngine() {
    return inspectionEngine;
  }

  public void setInspectionEngine(String inspectionEngine) {
    this.inspectionEngine = inspectionEngine;
  }


  public Healthcollectorv3StapObjectGdp ktap(Integer ktap) {
    this.ktap = ktap;
    return this;
  }

   /**
   * Status of the K-TAP.
   * @return ktap
  **/
  @javax.annotation.Nullable
  public Integer getKtap() {
    return ktap;
  }

  public void setKtap(Integer ktap) {
    this.ktap = ktap;
  }


  public Healthcollectorv3StapObjectGdp name(String name) {
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


  public Healthcollectorv3StapObjectGdp osType(String osType) {
    this.osType = osType;
    return this;
  }

   /**
   * Operating system of the S-TAP.
   * @return osType
  **/
  @javax.annotation.Nullable
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }


  public Healthcollectorv3StapObjectGdp revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The OS revision of the S-TAP.
   * @return revision
  **/
  @javax.annotation.Nullable
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }


  public Healthcollectorv3StapObjectGdp stapIp(String stapIp) {
    this.stapIp = stapIp;
    return this;
  }

   /**
   * IP address of the S-TAP.
   * @return stapIp
  **/
  @javax.annotation.Nullable
  public String getStapIp() {
    return stapIp;
  }

  public void setStapIp(String stapIp) {
    this.stapIp = stapIp;
  }


  public Healthcollectorv3StapObjectGdp status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Overall status of the S-TAP.
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  public Healthcollectorv3StapObjectGdp traffic(Integer traffic) {
    this.traffic = traffic;
    return this;
  }

   /**
   * Traffic status from inspection engine for the S-TAP.
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
    Healthcollectorv3StapObjectGdp healthcollectorv3StapObjectGdp = (Healthcollectorv3StapObjectGdp) o;
    return Objects.equals(this.children, healthcollectorv3StapObjectGdp.children) &&
        Objects.equals(this.collectorHostName, healthcollectorv3StapObjectGdp.collectorHostName) &&
        Objects.equals(this.connectivity, healthcollectorv3StapObjectGdp.connectivity) &&
        Objects.equals(this.details, healthcollectorv3StapObjectGdp.details) &&
        Objects.equals(this.ieStatus, healthcollectorv3StapObjectGdp.ieStatus) &&
        Objects.equals(this.inspectionEngine, healthcollectorv3StapObjectGdp.inspectionEngine) &&
        Objects.equals(this.ktap, healthcollectorv3StapObjectGdp.ktap) &&
        Objects.equals(this.name, healthcollectorv3StapObjectGdp.name) &&
        Objects.equals(this.osType, healthcollectorv3StapObjectGdp.osType) &&
        Objects.equals(this.revision, healthcollectorv3StapObjectGdp.revision) &&
        Objects.equals(this.stapIp, healthcollectorv3StapObjectGdp.stapIp) &&
        Objects.equals(this.status, healthcollectorv3StapObjectGdp.status) &&
        Objects.equals(this.traffic, healthcollectorv3StapObjectGdp.traffic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, collectorHostName, connectivity, details, ieStatus, inspectionEngine, ktap, name, osType, revision, stapIp, status, traffic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3StapObjectGdp {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    collectorHostName: ").append(toIndentedString(collectorHostName)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    ieStatus: ").append(toIndentedString(ieStatus)).append("\n");
    sb.append("    inspectionEngine: ").append(toIndentedString(inspectionEngine)).append("\n");
    sb.append("    ktap: ").append(toIndentedString(ktap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("collector_host_name");
    openapiFields.add("connectivity");
    openapiFields.add("details");
    openapiFields.add("ie_status");
    openapiFields.add("inspection_engine");
    openapiFields.add("ktap");
    openapiFields.add("name");
    openapiFields.add("os_type");
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
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3StapObjectGdp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3StapObjectGdp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3StapObjectGdp is not found in the empty JSON string", Healthcollectorv3StapObjectGdp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3StapObjectGdp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3StapObjectGdp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            Healthcollectorv3InspectionEngineObjectGdp.validateJsonElement(jsonArraychildren.get(i));
          };
        }
      }
      if ((jsonObj.get("collector_host_name") != null && !jsonObj.get("collector_host_name").isJsonNull()) && !jsonObj.get("collector_host_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collector_host_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collector_host_name").toString()));
      }
      // validate the optional field `details`
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        Healthcollectorv3StapDetailsObjectGdp.validateJsonElement(jsonObj.get("details"));
      }
      if ((jsonObj.get("inspection_engine") != null && !jsonObj.get("inspection_engine").isJsonNull()) && !jsonObj.get("inspection_engine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inspection_engine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inspection_engine").toString()));
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
       if (!Healthcollectorv3StapObjectGdp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3StapObjectGdp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3StapObjectGdp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3StapObjectGdp.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3StapObjectGdp>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3StapObjectGdp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3StapObjectGdp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3StapObjectGdp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3StapObjectGdp
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3StapObjectGdp
  */
  public static Healthcollectorv3StapObjectGdp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3StapObjectGdp.class);
  }

 /**
  * Convert an instance of Healthcollectorv3StapObjectGdp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

