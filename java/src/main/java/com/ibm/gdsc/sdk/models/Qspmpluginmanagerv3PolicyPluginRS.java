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

import com.ibm.gdsc.sdk.JSON;

/**
 * PolicyPluginRS is the response object for InvokePolicy API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Qspmpluginmanagerv3PolicyPluginRS {
  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_SCAN_DESC = "scan_desc";
  @SerializedName(SERIALIZED_NAME_SCAN_DESC)
  private String scanDesc;

  public static final String SERIALIZED_NAME_SCANNED_IDS = "scanned_ids";
  @SerializedName(SERIALIZED_NAME_SCANNED_IDS)
  private String scannedIds;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public Qspmpluginmanagerv3PolicyPluginRS() {
  }

  public Qspmpluginmanagerv3PolicyPluginRS orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public Qspmpluginmanagerv3PolicyPluginRS pluginId(String pluginId) {
    this.pluginId = pluginId;
    return this;
  }

   /**
   * Get pluginId
   * @return pluginId
  **/
  @javax.annotation.Nullable
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public Qspmpluginmanagerv3PolicyPluginRS scanDesc(String scanDesc) {
    this.scanDesc = scanDesc;
    return this;
  }

   /**
   * Get scanDesc
   * @return scanDesc
  **/
  @javax.annotation.Nullable
  public String getScanDesc() {
    return scanDesc;
  }

  public void setScanDesc(String scanDesc) {
    this.scanDesc = scanDesc;
  }


  public Qspmpluginmanagerv3PolicyPluginRS scannedIds(String scannedIds) {
    this.scannedIds = scannedIds;
    return this;
  }

   /**
   * Get scannedIds
   * @return scannedIds
  **/
  @javax.annotation.Nullable
  public String getScannedIds() {
    return scannedIds;
  }

  public void setScannedIds(String scannedIds) {
    this.scannedIds = scannedIds;
  }


  public Qspmpluginmanagerv3PolicyPluginRS userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @javax.annotation.Nullable
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpluginmanagerv3PolicyPluginRS qspmpluginmanagerv3PolicyPluginRS = (Qspmpluginmanagerv3PolicyPluginRS) o;
    return Objects.equals(this.orgId, qspmpluginmanagerv3PolicyPluginRS.orgId) &&
        Objects.equals(this.pluginId, qspmpluginmanagerv3PolicyPluginRS.pluginId) &&
        Objects.equals(this.scanDesc, qspmpluginmanagerv3PolicyPluginRS.scanDesc) &&
        Objects.equals(this.scannedIds, qspmpluginmanagerv3PolicyPluginRS.scannedIds) &&
        Objects.equals(this.userEmail, qspmpluginmanagerv3PolicyPluginRS.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, pluginId, scanDesc, scannedIds, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpluginmanagerv3PolicyPluginRS {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    scanDesc: ").append(toIndentedString(scanDesc)).append("\n");
    sb.append("    scannedIds: ").append(toIndentedString(scannedIds)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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
    openapiFields.add("org_id");
    openapiFields.add("plugin_id");
    openapiFields.add("scan_desc");
    openapiFields.add("scanned_ids");
    openapiFields.add("user_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpluginmanagerv3PolicyPluginRS
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpluginmanagerv3PolicyPluginRS.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpluginmanagerv3PolicyPluginRS is not found in the empty JSON string", Qspmpluginmanagerv3PolicyPluginRS.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpluginmanagerv3PolicyPluginRS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpluginmanagerv3PolicyPluginRS` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("org_id") != null && !jsonObj.get("org_id").isJsonNull()) && !jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
      if ((jsonObj.get("plugin_id") != null && !jsonObj.get("plugin_id").isJsonNull()) && !jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      if ((jsonObj.get("scan_desc") != null && !jsonObj.get("scan_desc").isJsonNull()) && !jsonObj.get("scan_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scan_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scan_desc").toString()));
      }
      if ((jsonObj.get("scanned_ids") != null && !jsonObj.get("scanned_ids").isJsonNull()) && !jsonObj.get("scanned_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scanned_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scanned_ids").toString()));
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpluginmanagerv3PolicyPluginRS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpluginmanagerv3PolicyPluginRS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpluginmanagerv3PolicyPluginRS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpluginmanagerv3PolicyPluginRS.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpluginmanagerv3PolicyPluginRS>() {
           @Override
           public void write(JsonWriter out, Qspmpluginmanagerv3PolicyPluginRS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpluginmanagerv3PolicyPluginRS read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpluginmanagerv3PolicyPluginRS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpluginmanagerv3PolicyPluginRS
  * @throws IOException if the JSON string is invalid with respect to Qspmpluginmanagerv3PolicyPluginRS
  */
  public static Qspmpluginmanagerv3PolicyPluginRS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpluginmanagerv3PolicyPluginRS.class);
  }

 /**
  * Convert an instance of Qspmpluginmanagerv3PolicyPluginRS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

