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
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * PolicyPluginRQ is the request object for InvokePolicy API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmpluginmanagerv3PolicyPluginRQ {
  public static final String SERIALIZED_NAME_EXTERNAL_PARAM = "external_param";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PARAM)
  private Map<String, String> externalParam = new HashMap<>();

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_RUN_FOR_ALL_SCANS = "run_for_all_scans";
  @SerializedName(SERIALIZED_NAME_RUN_FOR_ALL_SCANS)
  private Boolean runForAllScans;

  public static final String SERIALIZED_NAME_SCAN_DESC = "scan_desc";
  @SerializedName(SERIALIZED_NAME_SCAN_DESC)
  private String scanDesc;

  public static final String SERIALIZED_NAME_SCAN_ID = "scan_id";
  @SerializedName(SERIALIZED_NAME_SCAN_ID)
  private String scanId;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public Qspmpluginmanagerv3PolicyPluginRQ() {
  }

  public Qspmpluginmanagerv3PolicyPluginRQ externalParam(Map<String, String> externalParam) {
    this.externalParam = externalParam;
    return this;
  }

  public Qspmpluginmanagerv3PolicyPluginRQ putExternalParamItem(String key, String externalParamItem) {
    if (this.externalParam == null) {
      this.externalParam = new HashMap<>();
    }
    this.externalParam.put(key, externalParamItem);
    return this;
  }

   /**
   * Get externalParam
   * @return externalParam
  **/
  @javax.annotation.Nullable
  public Map<String, String> getExternalParam() {
    return externalParam;
  }

  public void setExternalParam(Map<String, String> externalParam) {
    this.externalParam = externalParam;
  }


  public Qspmpluginmanagerv3PolicyPluginRQ orgId(String orgId) {
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


  public Qspmpluginmanagerv3PolicyPluginRQ pluginId(String pluginId) {
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


  public Qspmpluginmanagerv3PolicyPluginRQ runForAllScans(Boolean runForAllScans) {
    this.runForAllScans = runForAllScans;
    return this;
  }

   /**
   * Get runForAllScans
   * @return runForAllScans
  **/
  @javax.annotation.Nullable
  public Boolean getRunForAllScans() {
    return runForAllScans;
  }

  public void setRunForAllScans(Boolean runForAllScans) {
    this.runForAllScans = runForAllScans;
  }


  public Qspmpluginmanagerv3PolicyPluginRQ scanDesc(String scanDesc) {
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


  public Qspmpluginmanagerv3PolicyPluginRQ scanId(String scanId) {
    this.scanId = scanId;
    return this;
  }

   /**
   * Get scanId
   * @return scanId
  **/
  @javax.annotation.Nullable
  public String getScanId() {
    return scanId;
  }

  public void setScanId(String scanId) {
    this.scanId = scanId;
  }


  public Qspmpluginmanagerv3PolicyPluginRQ userEmail(String userEmail) {
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
    Qspmpluginmanagerv3PolicyPluginRQ qspmpluginmanagerv3PolicyPluginRQ = (Qspmpluginmanagerv3PolicyPluginRQ) o;
    return Objects.equals(this.externalParam, qspmpluginmanagerv3PolicyPluginRQ.externalParam) &&
        Objects.equals(this.orgId, qspmpluginmanagerv3PolicyPluginRQ.orgId) &&
        Objects.equals(this.pluginId, qspmpluginmanagerv3PolicyPluginRQ.pluginId) &&
        Objects.equals(this.runForAllScans, qspmpluginmanagerv3PolicyPluginRQ.runForAllScans) &&
        Objects.equals(this.scanDesc, qspmpluginmanagerv3PolicyPluginRQ.scanDesc) &&
        Objects.equals(this.scanId, qspmpluginmanagerv3PolicyPluginRQ.scanId) &&
        Objects.equals(this.userEmail, qspmpluginmanagerv3PolicyPluginRQ.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalParam, orgId, pluginId, runForAllScans, scanDesc, scanId, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpluginmanagerv3PolicyPluginRQ {\n");
    sb.append("    externalParam: ").append(toIndentedString(externalParam)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    runForAllScans: ").append(toIndentedString(runForAllScans)).append("\n");
    sb.append("    scanDesc: ").append(toIndentedString(scanDesc)).append("\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
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
    openapiFields.add("external_param");
    openapiFields.add("org_id");
    openapiFields.add("plugin_id");
    openapiFields.add("run_for_all_scans");
    openapiFields.add("scan_desc");
    openapiFields.add("scan_id");
    openapiFields.add("user_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpluginmanagerv3PolicyPluginRQ
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpluginmanagerv3PolicyPluginRQ.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpluginmanagerv3PolicyPluginRQ is not found in the empty JSON string", Qspmpluginmanagerv3PolicyPluginRQ.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpluginmanagerv3PolicyPluginRQ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpluginmanagerv3PolicyPluginRQ` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("scan_id") != null && !jsonObj.get("scan_id").isJsonNull()) && !jsonObj.get("scan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scan_id").toString()));
      }
      if ((jsonObj.get("user_email") != null && !jsonObj.get("user_email").isJsonNull()) && !jsonObj.get("user_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpluginmanagerv3PolicyPluginRQ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpluginmanagerv3PolicyPluginRQ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpluginmanagerv3PolicyPluginRQ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpluginmanagerv3PolicyPluginRQ.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpluginmanagerv3PolicyPluginRQ>() {
           @Override
           public void write(JsonWriter out, Qspmpluginmanagerv3PolicyPluginRQ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpluginmanagerv3PolicyPluginRQ read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpluginmanagerv3PolicyPluginRQ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpluginmanagerv3PolicyPluginRQ
  * @throws IOException if the JSON string is invalid with respect to Qspmpluginmanagerv3PolicyPluginRQ
  */
  public static Qspmpluginmanagerv3PolicyPluginRQ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpluginmanagerv3PolicyPluginRQ.class);
  }

 /**
  * Convert an instance of Qspmpluginmanagerv3PolicyPluginRQ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

