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
import org.openapitools.client.model.Qspmpluginmanagerv3EntityNewSchema;
import org.openapitools.client.model.Qspmpluginmanagerv3ValidationResult;

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
 * PluginRS is the response object for InvokePlugin,InvokeAppProv,InvokeExplorerV1,InvokeExplorerV2 API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmpluginmanagerv3PluginRS {
  public static final String SERIALIZED_NAME_DIMS = "dims";
  @SerializedName(SERIALIZED_NAME_DIMS)
  private List<Qspmpluginmanagerv3EntityNewSchema> dims = new ArrayList<>();

  public static final String SERIALIZED_NAME_FACTS = "facts";
  @SerializedName(SERIALIZED_NAME_FACTS)
  private List<Qspmpluginmanagerv3EntityNewSchema> facts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_SCAN_DESC = "scan_desc";
  @SerializedName(SERIALIZED_NAME_SCAN_DESC)
  private String scanDesc;

  public static final String SERIALIZED_NAME_SCAN_ID = "scan_id";
  @SerializedName(SERIALIZED_NAME_SCAN_ID)
  private String scanId;

  public static final String SERIALIZED_NAME_USER_EMAIL = "user_email";
  @SerializedName(SERIALIZED_NAME_USER_EMAIL)
  private String userEmail;

  public static final String SERIALIZED_NAME_VALIDATION_RESULT = "validation_result";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULT)
  private Qspmpluginmanagerv3ValidationResult validationResult;

  public Qspmpluginmanagerv3PluginRS() {
  }

  public Qspmpluginmanagerv3PluginRS dims(List<Qspmpluginmanagerv3EntityNewSchema> dims) {
    this.dims = dims;
    return this;
  }

  public Qspmpluginmanagerv3PluginRS addDimsItem(Qspmpluginmanagerv3EntityNewSchema dimsItem) {
    if (this.dims == null) {
      this.dims = new ArrayList<>();
    }
    this.dims.add(dimsItem);
    return this;
  }

   /**
   * Get dims
   * @return dims
  **/
  @javax.annotation.Nullable
  public List<Qspmpluginmanagerv3EntityNewSchema> getDims() {
    return dims;
  }

  public void setDims(List<Qspmpluginmanagerv3EntityNewSchema> dims) {
    this.dims = dims;
  }


  public Qspmpluginmanagerv3PluginRS facts(List<Qspmpluginmanagerv3EntityNewSchema> facts) {
    this.facts = facts;
    return this;
  }

  public Qspmpluginmanagerv3PluginRS addFactsItem(Qspmpluginmanagerv3EntityNewSchema factsItem) {
    if (this.facts == null) {
      this.facts = new ArrayList<>();
    }
    this.facts.add(factsItem);
    return this;
  }

   /**
   * Get facts
   * @return facts
  **/
  @javax.annotation.Nullable
  public List<Qspmpluginmanagerv3EntityNewSchema> getFacts() {
    return facts;
  }

  public void setFacts(List<Qspmpluginmanagerv3EntityNewSchema> facts) {
    this.facts = facts;
  }


  public Qspmpluginmanagerv3PluginRS orgId(String orgId) {
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


  public Qspmpluginmanagerv3PluginRS pluginId(String pluginId) {
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


  public Qspmpluginmanagerv3PluginRS scanDesc(String scanDesc) {
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


  public Qspmpluginmanagerv3PluginRS scanId(String scanId) {
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


  public Qspmpluginmanagerv3PluginRS userEmail(String userEmail) {
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


  public Qspmpluginmanagerv3PluginRS validationResult(Qspmpluginmanagerv3ValidationResult validationResult) {
    this.validationResult = validationResult;
    return this;
  }

   /**
   * Get validationResult
   * @return validationResult
  **/
  @javax.annotation.Nullable
  public Qspmpluginmanagerv3ValidationResult getValidationResult() {
    return validationResult;
  }

  public void setValidationResult(Qspmpluginmanagerv3ValidationResult validationResult) {
    this.validationResult = validationResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpluginmanagerv3PluginRS qspmpluginmanagerv3PluginRS = (Qspmpluginmanagerv3PluginRS) o;
    return Objects.equals(this.dims, qspmpluginmanagerv3PluginRS.dims) &&
        Objects.equals(this.facts, qspmpluginmanagerv3PluginRS.facts) &&
        Objects.equals(this.orgId, qspmpluginmanagerv3PluginRS.orgId) &&
        Objects.equals(this.pluginId, qspmpluginmanagerv3PluginRS.pluginId) &&
        Objects.equals(this.scanDesc, qspmpluginmanagerv3PluginRS.scanDesc) &&
        Objects.equals(this.scanId, qspmpluginmanagerv3PluginRS.scanId) &&
        Objects.equals(this.userEmail, qspmpluginmanagerv3PluginRS.userEmail) &&
        Objects.equals(this.validationResult, qspmpluginmanagerv3PluginRS.validationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dims, facts, orgId, pluginId, scanDesc, scanId, userEmail, validationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpluginmanagerv3PluginRS {\n");
    sb.append("    dims: ").append(toIndentedString(dims)).append("\n");
    sb.append("    facts: ").append(toIndentedString(facts)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    scanDesc: ").append(toIndentedString(scanDesc)).append("\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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
    openapiFields.add("dims");
    openapiFields.add("facts");
    openapiFields.add("org_id");
    openapiFields.add("plugin_id");
    openapiFields.add("scan_desc");
    openapiFields.add("scan_id");
    openapiFields.add("user_email");
    openapiFields.add("validation_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpluginmanagerv3PluginRS
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpluginmanagerv3PluginRS.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpluginmanagerv3PluginRS is not found in the empty JSON string", Qspmpluginmanagerv3PluginRS.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpluginmanagerv3PluginRS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpluginmanagerv3PluginRS` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dims") != null && !jsonObj.get("dims").isJsonNull()) {
        JsonArray jsonArraydims = jsonObj.getAsJsonArray("dims");
        if (jsonArraydims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dims` to be an array in the JSON string but got `%s`", jsonObj.get("dims").toString()));
          }

          // validate the optional field `dims` (array)
          for (int i = 0; i < jsonArraydims.size(); i++) {
            Qspmpluginmanagerv3EntityNewSchema.validateJsonElement(jsonArraydims.get(i));
          };
        }
      }
      if (jsonObj.get("facts") != null && !jsonObj.get("facts").isJsonNull()) {
        JsonArray jsonArrayfacts = jsonObj.getAsJsonArray("facts");
        if (jsonArrayfacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("facts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `facts` to be an array in the JSON string but got `%s`", jsonObj.get("facts").toString()));
          }

          // validate the optional field `facts` (array)
          for (int i = 0; i < jsonArrayfacts.size(); i++) {
            Qspmpluginmanagerv3EntityNewSchema.validateJsonElement(jsonArrayfacts.get(i));
          };
        }
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
      // validate the optional field `validation_result`
      if (jsonObj.get("validation_result") != null && !jsonObj.get("validation_result").isJsonNull()) {
        Qspmpluginmanagerv3ValidationResult.validateJsonElement(jsonObj.get("validation_result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpluginmanagerv3PluginRS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpluginmanagerv3PluginRS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpluginmanagerv3PluginRS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpluginmanagerv3PluginRS.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpluginmanagerv3PluginRS>() {
           @Override
           public void write(JsonWriter out, Qspmpluginmanagerv3PluginRS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpluginmanagerv3PluginRS read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpluginmanagerv3PluginRS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpluginmanagerv3PluginRS
  * @throws IOException if the JSON string is invalid with respect to Qspmpluginmanagerv3PluginRS
  */
  public static Qspmpluginmanagerv3PluginRS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpluginmanagerv3PluginRS.class);
  }

 /**
  * Convert an instance of Qspmpluginmanagerv3PluginRS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

