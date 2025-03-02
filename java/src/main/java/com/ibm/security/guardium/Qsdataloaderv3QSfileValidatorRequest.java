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
import com.ibm.security.guardium.Qsdataloaderv3QSfileValidatorExternalParamRequest;
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

import com.ibm.security.JSON;

/**
 * Qsdataloaderv3QSfileValidatorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Qsdataloaderv3QSfileValidatorRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_PARAM = "external_param";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PARAM)
  private Qsdataloaderv3QSfileValidatorExternalParamRequest externalParam;

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

  public Qsdataloaderv3QSfileValidatorRequest() {
  }

  public Qsdataloaderv3QSfileValidatorRequest externalParam(Qsdataloaderv3QSfileValidatorExternalParamRequest externalParam) {
    this.externalParam = externalParam;
    return this;
  }

   /**
   * Get externalParam
   * @return externalParam
  **/
  @javax.annotation.Nullable
  public Qsdataloaderv3QSfileValidatorExternalParamRequest getExternalParam() {
    return externalParam;
  }

  public void setExternalParam(Qsdataloaderv3QSfileValidatorExternalParamRequest externalParam) {
    this.externalParam = externalParam;
  }


  public Qsdataloaderv3QSfileValidatorRequest orgId(String orgId) {
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


  public Qsdataloaderv3QSfileValidatorRequest pluginId(String pluginId) {
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


  public Qsdataloaderv3QSfileValidatorRequest runForAllScans(Boolean runForAllScans) {
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


  public Qsdataloaderv3QSfileValidatorRequest scanDesc(String scanDesc) {
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


  public Qsdataloaderv3QSfileValidatorRequest scanId(String scanId) {
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


  public Qsdataloaderv3QSfileValidatorRequest userEmail(String userEmail) {
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
    Qsdataloaderv3QSfileValidatorRequest qsdataloaderv3QSfileValidatorRequest = (Qsdataloaderv3QSfileValidatorRequest) o;
    return Objects.equals(this.externalParam, qsdataloaderv3QSfileValidatorRequest.externalParam) &&
        Objects.equals(this.orgId, qsdataloaderv3QSfileValidatorRequest.orgId) &&
        Objects.equals(this.pluginId, qsdataloaderv3QSfileValidatorRequest.pluginId) &&
        Objects.equals(this.runForAllScans, qsdataloaderv3QSfileValidatorRequest.runForAllScans) &&
        Objects.equals(this.scanDesc, qsdataloaderv3QSfileValidatorRequest.scanDesc) &&
        Objects.equals(this.scanId, qsdataloaderv3QSfileValidatorRequest.scanId) &&
        Objects.equals(this.userEmail, qsdataloaderv3QSfileValidatorRequest.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalParam, orgId, pluginId, runForAllScans, scanDesc, scanId, userEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qsdataloaderv3QSfileValidatorRequest {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Qsdataloaderv3QSfileValidatorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qsdataloaderv3QSfileValidatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qsdataloaderv3QSfileValidatorRequest is not found in the empty JSON string", Qsdataloaderv3QSfileValidatorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qsdataloaderv3QSfileValidatorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qsdataloaderv3QSfileValidatorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `external_param`
      if (jsonObj.get("external_param") != null && !jsonObj.get("external_param").isJsonNull()) {
        Qsdataloaderv3QSfileValidatorExternalParamRequest.validateJsonElement(jsonObj.get("external_param"));
      }
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
       if (!Qsdataloaderv3QSfileValidatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qsdataloaderv3QSfileValidatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qsdataloaderv3QSfileValidatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qsdataloaderv3QSfileValidatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Qsdataloaderv3QSfileValidatorRequest>() {
           @Override
           public void write(JsonWriter out, Qsdataloaderv3QSfileValidatorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qsdataloaderv3QSfileValidatorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qsdataloaderv3QSfileValidatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qsdataloaderv3QSfileValidatorRequest
  * @throws IOException if the JSON string is invalid with respect to Qsdataloaderv3QSfileValidatorRequest
  */
  public static Qsdataloaderv3QSfileValidatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qsdataloaderv3QSfileValidatorRequest.class);
  }

 /**
  * Convert an instance of Qsdataloaderv3QSfileValidatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

