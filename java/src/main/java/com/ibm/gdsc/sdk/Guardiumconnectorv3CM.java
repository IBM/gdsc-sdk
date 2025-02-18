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
import com.ibm.gdsc.sdk.Guardiumconnectorv3Attribute;
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
 * Central Manager definition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3CM {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Guardiumconnectorv3Attribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CENTRAL_MANAGER_ID = "central_manager_id";
  @SerializedName(SERIALIZED_NAME_CENTRAL_MANAGER_ID)
  private String centralManagerId;

  public static final String SERIALIZED_NAME_CM_DATE_PARAM_AVAILABLE = "cm_date_param_available";
  @SerializedName(SERIALIZED_NAME_CM_DATE_PARAM_AVAILABLE)
  private String cmDateParamAvailable;

  public static final String SERIALIZED_NAME_DATAMART_END_DATE_AGGREGATOR = "datamart_end_date_aggregator";
  @SerializedName(SERIALIZED_NAME_DATAMART_END_DATE_AGGREGATOR)
  private String datamartEndDateAggregator;

  public static final String SERIALIZED_NAME_DATAMART_START_DATE_AGGREGATOR = "datamart_start_date_aggregator";
  @SerializedName(SERIALIZED_NAME_DATAMART_START_DATE_AGGREGATOR)
  private String datamartStartDateAggregator;

  public static final String SERIALIZED_NAME_DATAMART_START_DATE_COLLECTOR = "datamart_start_date_collector";
  @SerializedName(SERIALIZED_NAME_DATAMART_START_DATE_COLLECTOR)
  private String datamartStartDateCollector;

  public static final String SERIALIZED_NAME_MAX_SUPPORTED_DM_VERSION = "max_supported_dm_version";
  @SerializedName(SERIALIZED_NAME_MAX_SUPPORTED_DM_VERSION)
  private String maxSupportedDmVersion;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUPPORT_CUSTOM_DM_TYPE_SETUP = "support_custom_dm_type_setup";
  @SerializedName(SERIALIZED_NAME_SUPPORT_CUSTOM_DM_TYPE_SETUP)
  private String supportCustomDmTypeSetup;

  public Guardiumconnectorv3CM() {
  }

  public Guardiumconnectorv3CM attributes(List<Guardiumconnectorv3Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Guardiumconnectorv3CM addAttributesItem(Guardiumconnectorv3Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Central Manager attributes.
   * @return attributes
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Guardiumconnectorv3Attribute> attributes) {
    this.attributes = attributes;
  }


  public Guardiumconnectorv3CM centralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
    return this;
  }

   /**
   * Central Manager hostname or ip.
   * @return centralManagerId
  **/
  @javax.annotation.Nullable
  public String getCentralManagerId() {
    return centralManagerId;
  }

  public void setCentralManagerId(String centralManagerId) {
    this.centralManagerId = centralManagerId;
  }


  public Guardiumconnectorv3CM cmDateParamAvailable(String cmDateParamAvailable) {
    this.cmDateParamAvailable = cmDateParamAvailable;
    return this;
  }

   /**
   * Flag check if CM can handle setting start end date for aggregator dm export.
   * @return cmDateParamAvailable
  **/
  @javax.annotation.Nullable
  public String getCmDateParamAvailable() {
    return cmDateParamAvailable;
  }

  public void setCmDateParamAvailable(String cmDateParamAvailable) {
    this.cmDateParamAvailable = cmDateParamAvailable;
  }


  public Guardiumconnectorv3CM datamartEndDateAggregator(String datamartEndDateAggregator) {
    this.datamartEndDateAggregator = datamartEndDateAggregator;
    return this;
  }

   /**
   * Initial start date for streaming historical datamart from GDP aggregator.
   * @return datamartEndDateAggregator
  **/
  @javax.annotation.Nullable
  public String getDatamartEndDateAggregator() {
    return datamartEndDateAggregator;
  }

  public void setDatamartEndDateAggregator(String datamartEndDateAggregator) {
    this.datamartEndDateAggregator = datamartEndDateAggregator;
  }


  public Guardiumconnectorv3CM datamartStartDateAggregator(String datamartStartDateAggregator) {
    this.datamartStartDateAggregator = datamartStartDateAggregator;
    return this;
  }

   /**
   * Initial start date for streaming historical datamart from GDP aggregator.
   * @return datamartStartDateAggregator
  **/
  @javax.annotation.Nullable
  public String getDatamartStartDateAggregator() {
    return datamartStartDateAggregator;
  }

  public void setDatamartStartDateAggregator(String datamartStartDateAggregator) {
    this.datamartStartDateAggregator = datamartStartDateAggregator;
  }


  public Guardiumconnectorv3CM datamartStartDateCollector(String datamartStartDateCollector) {
    this.datamartStartDateCollector = datamartStartDateCollector;
    return this;
  }

   /**
   * Initial start date for streaming historical datamart from GDP.
   * @return datamartStartDateCollector
  **/
  @javax.annotation.Nullable
  public String getDatamartStartDateCollector() {
    return datamartStartDateCollector;
  }

  public void setDatamartStartDateCollector(String datamartStartDateCollector) {
    this.datamartStartDateCollector = datamartStartDateCollector;
  }


  public Guardiumconnectorv3CM maxSupportedDmVersion(String maxSupportedDmVersion) {
    this.maxSupportedDmVersion = maxSupportedDmVersion;
    return this;
  }

   /**
   * Get maxSupportedDmVersion
   * @return maxSupportedDmVersion
  **/
  @javax.annotation.Nullable
  public String getMaxSupportedDmVersion() {
    return maxSupportedDmVersion;
  }

  public void setMaxSupportedDmVersion(String maxSupportedDmVersion) {
    this.maxSupportedDmVersion = maxSupportedDmVersion;
  }


  public Guardiumconnectorv3CM mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Flag to determine if GI supports push or pull mode.
   * @return mode
  **/
  @javax.annotation.Nullable
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public Guardiumconnectorv3CM name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Central Manager name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Guardiumconnectorv3CM port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port used to communicate with the Central Manager.
   * @return port
  **/
  @javax.annotation.Nullable
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }


  public Guardiumconnectorv3CM status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Central Manager status.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Guardiumconnectorv3CM supportCustomDmTypeSetup(String supportCustomDmTypeSetup) {
    this.supportCustomDmTypeSetup = supportCustomDmTypeSetup;
    return this;
  }

   /**
   * Get supportCustomDmTypeSetup
   * @return supportCustomDmTypeSetup
  **/
  @javax.annotation.Nullable
  public String getSupportCustomDmTypeSetup() {
    return supportCustomDmTypeSetup;
  }

  public void setSupportCustomDmTypeSetup(String supportCustomDmTypeSetup) {
    this.supportCustomDmTypeSetup = supportCustomDmTypeSetup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3CM guardiumconnectorv3CM = (Guardiumconnectorv3CM) o;
    return Objects.equals(this.attributes, guardiumconnectorv3CM.attributes) &&
        Objects.equals(this.centralManagerId, guardiumconnectorv3CM.centralManagerId) &&
        Objects.equals(this.cmDateParamAvailable, guardiumconnectorv3CM.cmDateParamAvailable) &&
        Objects.equals(this.datamartEndDateAggregator, guardiumconnectorv3CM.datamartEndDateAggregator) &&
        Objects.equals(this.datamartStartDateAggregator, guardiumconnectorv3CM.datamartStartDateAggregator) &&
        Objects.equals(this.datamartStartDateCollector, guardiumconnectorv3CM.datamartStartDateCollector) &&
        Objects.equals(this.maxSupportedDmVersion, guardiumconnectorv3CM.maxSupportedDmVersion) &&
        Objects.equals(this.mode, guardiumconnectorv3CM.mode) &&
        Objects.equals(this.name, guardiumconnectorv3CM.name) &&
        Objects.equals(this.port, guardiumconnectorv3CM.port) &&
        Objects.equals(this.status, guardiumconnectorv3CM.status) &&
        Objects.equals(this.supportCustomDmTypeSetup, guardiumconnectorv3CM.supportCustomDmTypeSetup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, centralManagerId, cmDateParamAvailable, datamartEndDateAggregator, datamartStartDateAggregator, datamartStartDateCollector, maxSupportedDmVersion, mode, name, port, status, supportCustomDmTypeSetup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3CM {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    centralManagerId: ").append(toIndentedString(centralManagerId)).append("\n");
    sb.append("    cmDateParamAvailable: ").append(toIndentedString(cmDateParamAvailable)).append("\n");
    sb.append("    datamartEndDateAggregator: ").append(toIndentedString(datamartEndDateAggregator)).append("\n");
    sb.append("    datamartStartDateAggregator: ").append(toIndentedString(datamartStartDateAggregator)).append("\n");
    sb.append("    datamartStartDateCollector: ").append(toIndentedString(datamartStartDateCollector)).append("\n");
    sb.append("    maxSupportedDmVersion: ").append(toIndentedString(maxSupportedDmVersion)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportCustomDmTypeSetup: ").append(toIndentedString(supportCustomDmTypeSetup)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("central_manager_id");
    openapiFields.add("cm_date_param_available");
    openapiFields.add("datamart_end_date_aggregator");
    openapiFields.add("datamart_start_date_aggregator");
    openapiFields.add("datamart_start_date_collector");
    openapiFields.add("max_supported_dm_version");
    openapiFields.add("mode");
    openapiFields.add("name");
    openapiFields.add("port");
    openapiFields.add("status");
    openapiFields.add("support_custom_dm_type_setup");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3CM
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3CM.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3CM is not found in the empty JSON string", Guardiumconnectorv3CM.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3CM.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3CM` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            Guardiumconnectorv3Attribute.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if ((jsonObj.get("central_manager_id") != null && !jsonObj.get("central_manager_id").isJsonNull()) && !jsonObj.get("central_manager_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `central_manager_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("central_manager_id").toString()));
      }
      if ((jsonObj.get("cm_date_param_available") != null && !jsonObj.get("cm_date_param_available").isJsonNull()) && !jsonObj.get("cm_date_param_available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm_date_param_available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm_date_param_available").toString()));
      }
      if ((jsonObj.get("datamart_end_date_aggregator") != null && !jsonObj.get("datamart_end_date_aggregator").isJsonNull()) && !jsonObj.get("datamart_end_date_aggregator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_end_date_aggregator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_end_date_aggregator").toString()));
      }
      if ((jsonObj.get("datamart_start_date_aggregator") != null && !jsonObj.get("datamart_start_date_aggregator").isJsonNull()) && !jsonObj.get("datamart_start_date_aggregator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_start_date_aggregator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_start_date_aggregator").toString()));
      }
      if ((jsonObj.get("datamart_start_date_collector") != null && !jsonObj.get("datamart_start_date_collector").isJsonNull()) && !jsonObj.get("datamart_start_date_collector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_start_date_collector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datamart_start_date_collector").toString()));
      }
      if ((jsonObj.get("max_supported_dm_version") != null && !jsonObj.get("max_supported_dm_version").isJsonNull()) && !jsonObj.get("max_supported_dm_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_supported_dm_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_supported_dm_version").toString()));
      }
      if ((jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) && !jsonObj.get("port").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `port` to be a primitive type in the JSON string but got `%s`", jsonObj.get("port").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("support_custom_dm_type_setup") != null && !jsonObj.get("support_custom_dm_type_setup").isJsonNull()) && !jsonObj.get("support_custom_dm_type_setup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `support_custom_dm_type_setup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("support_custom_dm_type_setup").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3CM.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3CM' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3CM> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3CM.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3CM>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3CM value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3CM read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3CM given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3CM
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3CM
  */
  public static Guardiumconnectorv3CM fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3CM.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3CM to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

