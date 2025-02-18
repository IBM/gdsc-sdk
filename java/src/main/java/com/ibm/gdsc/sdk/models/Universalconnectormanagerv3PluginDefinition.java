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
import com.ibm.gdsc.sdk.models.Universalconnectormanagerv3DatasourceType;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Plugin definition based on UCPluginDefinition.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Universalconnectormanagerv3PluginDefinition {
  public static final String SERIALIZED_NAME_PLUGIN_ALIAS = "plugin_alias";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ALIAS)
  private String pluginAlias;

  public static final String SERIALIZED_NAME_PLUGIN_CONFIGURATION_NOTES = "plugin_configuration_notes";
  @SerializedName(SERIALIZED_NAME_PLUGIN_CONFIGURATION_NOTES)
  private String pluginConfigurationNotes;

  public static final String SERIALIZED_NAME_PLUGIN_DESCRIPTION = "plugin_description";
  @SerializedName(SERIALIZED_NAME_PLUGIN_DESCRIPTION)
  private String pluginDescription;

  public static final String SERIALIZED_NAME_PLUGIN_DEVELOPER = "plugin_developer";
  @SerializedName(SERIALIZED_NAME_PLUGIN_DEVELOPER)
  private String pluginDeveloper;

  public static final String SERIALIZED_NAME_PLUGIN_DOCUMENTATION_PATH = "plugin_documentation_path";
  @SerializedName(SERIALIZED_NAME_PLUGIN_DOCUMENTATION_PATH)
  private String pluginDocumentationPath;

  public static final String SERIALIZED_NAME_PLUGIN_LICENSE = "plugin_license";
  @SerializedName(SERIALIZED_NAME_PLUGIN_LICENSE)
  private String pluginLicense;

  public static final String SERIALIZED_NAME_PLUGIN_NAME = "plugin_name";
  @SerializedName(SERIALIZED_NAME_PLUGIN_NAME)
  private String pluginName;

  public static final String SERIALIZED_NAME_PLUGIN_PIPELINE_TYPE = "plugin_pipeline_type";
  @SerializedName(SERIALIZED_NAME_PLUGIN_PIPELINE_TYPE)
  private String pluginPipelineType;

  public static final String SERIALIZED_NAME_PLUGIN_TYPE = "plugin_type";
  @SerializedName(SERIALIZED_NAME_PLUGIN_TYPE)
  private String pluginType;

  public static final String SERIALIZED_NAME_PLUGIN_VERSION = "plugin_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_VERSION)
  private String pluginVersion;

  public static final String SERIALIZED_NAME_SUPPORTED_INPUT_PLUGINS = "supportedInputPlugins";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_INPUT_PLUGINS)
  private List<String> supportedInputPlugins = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_DATASOURCES = "supported_datasources";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DATASOURCES)
  private List<Universalconnectormanagerv3DatasourceType> supportedDatasources = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPLOAD_DATE = "upload_date";
  @SerializedName(SERIALIZED_NAME_UPLOAD_DATE)
  private OffsetDateTime uploadDate;

  public static final String SERIALIZED_NAME_UPLOAD_USER = "upload_user";
  @SerializedName(SERIALIZED_NAME_UPLOAD_USER)
  private String uploadUser;

  public Universalconnectormanagerv3PluginDefinition() {
  }

  public Universalconnectormanagerv3PluginDefinition pluginAlias(String pluginAlias) {
    this.pluginAlias = pluginAlias;
    return this;
  }

   /**
   * mongoDB.
   * @return pluginAlias
  **/
  @javax.annotation.Nullable
  public String getPluginAlias() {
    return pluginAlias;
  }

  public void setPluginAlias(String pluginAlias) {
    this.pluginAlias = pluginAlias;
  }


  public Universalconnectormanagerv3PluginDefinition pluginConfigurationNotes(String pluginConfigurationNotes) {
    this.pluginConfigurationNotes = pluginConfigurationNotes;
    return this;
  }

   /**
   * Config noted.
   * @return pluginConfigurationNotes
  **/
  @javax.annotation.Nullable
  public String getPluginConfigurationNotes() {
    return pluginConfigurationNotes;
  }

  public void setPluginConfigurationNotes(String pluginConfigurationNotes) {
    this.pluginConfigurationNotes = pluginConfigurationNotes;
  }


  public Universalconnectormanagerv3PluginDefinition pluginDescription(String pluginDescription) {
    this.pluginDescription = pluginDescription;
    return this;
  }

   /**
   * Description.
   * @return pluginDescription
  **/
  @javax.annotation.Nullable
  public String getPluginDescription() {
    return pluginDescription;
  }

  public void setPluginDescription(String pluginDescription) {
    this.pluginDescription = pluginDescription;
  }


  public Universalconnectormanagerv3PluginDefinition pluginDeveloper(String pluginDeveloper) {
    this.pluginDeveloper = pluginDeveloper;
    return this;
  }

   /**
   * Developer.
   * @return pluginDeveloper
  **/
  @javax.annotation.Nullable
  public String getPluginDeveloper() {
    return pluginDeveloper;
  }

  public void setPluginDeveloper(String pluginDeveloper) {
    this.pluginDeveloper = pluginDeveloper;
  }


  public Universalconnectormanagerv3PluginDefinition pluginDocumentationPath(String pluginDocumentationPath) {
    this.pluginDocumentationPath = pluginDocumentationPath;
    return this;
  }

   /**
   * Documentation path.
   * @return pluginDocumentationPath
  **/
  @javax.annotation.Nullable
  public String getPluginDocumentationPath() {
    return pluginDocumentationPath;
  }

  public void setPluginDocumentationPath(String pluginDocumentationPath) {
    this.pluginDocumentationPath = pluginDocumentationPath;
  }


  public Universalconnectormanagerv3PluginDefinition pluginLicense(String pluginLicense) {
    this.pluginLicense = pluginLicense;
    return this;
  }

   /**
   * License.
   * @return pluginLicense
  **/
  @javax.annotation.Nullable
  public String getPluginLicense() {
    return pluginLicense;
  }

  public void setPluginLicense(String pluginLicense) {
    this.pluginLicense = pluginLicense;
  }


  public Universalconnectormanagerv3PluginDefinition pluginName(String pluginName) {
    this.pluginName = pluginName;
    return this;
  }

   /**
   * Name.
   * @return pluginName
  **/
  @javax.annotation.Nullable
  public String getPluginName() {
    return pluginName;
  }

  public void setPluginName(String pluginName) {
    this.pluginName = pluginName;
  }


  public Universalconnectormanagerv3PluginDefinition pluginPipelineType(String pluginPipelineType) {
    this.pluginPipelineType = pluginPipelineType;
    return this;
  }

   /**
   * Pipeline type.
   * @return pluginPipelineType
  **/
  @javax.annotation.Nullable
  public String getPluginPipelineType() {
    return pluginPipelineType;
  }

  public void setPluginPipelineType(String pluginPipelineType) {
    this.pluginPipelineType = pluginPipelineType;
  }


  public Universalconnectormanagerv3PluginDefinition pluginType(String pluginType) {
    this.pluginType = pluginType;
    return this;
  }

   /**
   * Filter/input.
   * @return pluginType
  **/
  @javax.annotation.Nullable
  public String getPluginType() {
    return pluginType;
  }

  public void setPluginType(String pluginType) {
    this.pluginType = pluginType;
  }


  public Universalconnectormanagerv3PluginDefinition pluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * Plugin version.
   * @return pluginVersion
  **/
  @javax.annotation.Nullable
  public String getPluginVersion() {
    return pluginVersion;
  }

  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }


  public Universalconnectormanagerv3PluginDefinition supportedInputPlugins(List<String> supportedInputPlugins) {
    this.supportedInputPlugins = supportedInputPlugins;
    return this;
  }

  public Universalconnectormanagerv3PluginDefinition addSupportedInputPluginsItem(String supportedInputPluginsItem) {
    if (this.supportedInputPlugins == null) {
      this.supportedInputPlugins = new ArrayList<>();
    }
    this.supportedInputPlugins.add(supportedInputPluginsItem);
    return this;
  }

   /**
   * Collection of supported input plugins.
   * @return supportedInputPlugins
  **/
  @javax.annotation.Nullable
  public List<String> getSupportedInputPlugins() {
    return supportedInputPlugins;
  }

  public void setSupportedInputPlugins(List<String> supportedInputPlugins) {
    this.supportedInputPlugins = supportedInputPlugins;
  }


  public Universalconnectormanagerv3PluginDefinition supportedDatasources(List<Universalconnectormanagerv3DatasourceType> supportedDatasources) {
    this.supportedDatasources = supportedDatasources;
    return this;
  }

  public Universalconnectormanagerv3PluginDefinition addSupportedDatasourcesItem(Universalconnectormanagerv3DatasourceType supportedDatasourcesItem) {
    if (this.supportedDatasources == null) {
      this.supportedDatasources = new ArrayList<>();
    }
    this.supportedDatasources.add(supportedDatasourcesItem);
    return this;
  }

   /**
   * Collection of DatasourceType.
   * @return supportedDatasources
  **/
  @javax.annotation.Nullable
  public List<Universalconnectormanagerv3DatasourceType> getSupportedDatasources() {
    return supportedDatasources;
  }

  public void setSupportedDatasources(List<Universalconnectormanagerv3DatasourceType> supportedDatasources) {
    this.supportedDatasources = supportedDatasources;
  }


  public Universalconnectormanagerv3PluginDefinition uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Datetime of plugin upload.
   * @return uploadDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }


  public Universalconnectormanagerv3PluginDefinition uploadUser(String uploadUser) {
    this.uploadUser = uploadUser;
    return this;
  }

   /**
   * Plugin user upload.
   * @return uploadUser
  **/
  @javax.annotation.Nullable
  public String getUploadUser() {
    return uploadUser;
  }

  public void setUploadUser(String uploadUser) {
    this.uploadUser = uploadUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Universalconnectormanagerv3PluginDefinition universalconnectormanagerv3PluginDefinition = (Universalconnectormanagerv3PluginDefinition) o;
    return Objects.equals(this.pluginAlias, universalconnectormanagerv3PluginDefinition.pluginAlias) &&
        Objects.equals(this.pluginConfigurationNotes, universalconnectormanagerv3PluginDefinition.pluginConfigurationNotes) &&
        Objects.equals(this.pluginDescription, universalconnectormanagerv3PluginDefinition.pluginDescription) &&
        Objects.equals(this.pluginDeveloper, universalconnectormanagerv3PluginDefinition.pluginDeveloper) &&
        Objects.equals(this.pluginDocumentationPath, universalconnectormanagerv3PluginDefinition.pluginDocumentationPath) &&
        Objects.equals(this.pluginLicense, universalconnectormanagerv3PluginDefinition.pluginLicense) &&
        Objects.equals(this.pluginName, universalconnectormanagerv3PluginDefinition.pluginName) &&
        Objects.equals(this.pluginPipelineType, universalconnectormanagerv3PluginDefinition.pluginPipelineType) &&
        Objects.equals(this.pluginType, universalconnectormanagerv3PluginDefinition.pluginType) &&
        Objects.equals(this.pluginVersion, universalconnectormanagerv3PluginDefinition.pluginVersion) &&
        Objects.equals(this.supportedInputPlugins, universalconnectormanagerv3PluginDefinition.supportedInputPlugins) &&
        Objects.equals(this.supportedDatasources, universalconnectormanagerv3PluginDefinition.supportedDatasources) &&
        Objects.equals(this.uploadDate, universalconnectormanagerv3PluginDefinition.uploadDate) &&
        Objects.equals(this.uploadUser, universalconnectormanagerv3PluginDefinition.uploadUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginAlias, pluginConfigurationNotes, pluginDescription, pluginDeveloper, pluginDocumentationPath, pluginLicense, pluginName, pluginPipelineType, pluginType, pluginVersion, supportedInputPlugins, supportedDatasources, uploadDate, uploadUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Universalconnectormanagerv3PluginDefinition {\n");
    sb.append("    pluginAlias: ").append(toIndentedString(pluginAlias)).append("\n");
    sb.append("    pluginConfigurationNotes: ").append(toIndentedString(pluginConfigurationNotes)).append("\n");
    sb.append("    pluginDescription: ").append(toIndentedString(pluginDescription)).append("\n");
    sb.append("    pluginDeveloper: ").append(toIndentedString(pluginDeveloper)).append("\n");
    sb.append("    pluginDocumentationPath: ").append(toIndentedString(pluginDocumentationPath)).append("\n");
    sb.append("    pluginLicense: ").append(toIndentedString(pluginLicense)).append("\n");
    sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
    sb.append("    pluginPipelineType: ").append(toIndentedString(pluginPipelineType)).append("\n");
    sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
    sb.append("    supportedInputPlugins: ").append(toIndentedString(supportedInputPlugins)).append("\n");
    sb.append("    supportedDatasources: ").append(toIndentedString(supportedDatasources)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    uploadUser: ").append(toIndentedString(uploadUser)).append("\n");
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
    openapiFields.add("plugin_alias");
    openapiFields.add("plugin_configuration_notes");
    openapiFields.add("plugin_description");
    openapiFields.add("plugin_developer");
    openapiFields.add("plugin_documentation_path");
    openapiFields.add("plugin_license");
    openapiFields.add("plugin_name");
    openapiFields.add("plugin_pipeline_type");
    openapiFields.add("plugin_type");
    openapiFields.add("plugin_version");
    openapiFields.add("supportedInputPlugins");
    openapiFields.add("supported_datasources");
    openapiFields.add("upload_date");
    openapiFields.add("upload_user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Universalconnectormanagerv3PluginDefinition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Universalconnectormanagerv3PluginDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Universalconnectormanagerv3PluginDefinition is not found in the empty JSON string", Universalconnectormanagerv3PluginDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Universalconnectormanagerv3PluginDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Universalconnectormanagerv3PluginDefinition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plugin_alias") != null && !jsonObj.get("plugin_alias").isJsonNull()) && !jsonObj.get("plugin_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_alias").toString()));
      }
      if ((jsonObj.get("plugin_configuration_notes") != null && !jsonObj.get("plugin_configuration_notes").isJsonNull()) && !jsonObj.get("plugin_configuration_notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_configuration_notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_configuration_notes").toString()));
      }
      if ((jsonObj.get("plugin_description") != null && !jsonObj.get("plugin_description").isJsonNull()) && !jsonObj.get("plugin_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_description").toString()));
      }
      if ((jsonObj.get("plugin_developer") != null && !jsonObj.get("plugin_developer").isJsonNull()) && !jsonObj.get("plugin_developer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_developer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_developer").toString()));
      }
      if ((jsonObj.get("plugin_documentation_path") != null && !jsonObj.get("plugin_documentation_path").isJsonNull()) && !jsonObj.get("plugin_documentation_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_documentation_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_documentation_path").toString()));
      }
      if ((jsonObj.get("plugin_license") != null && !jsonObj.get("plugin_license").isJsonNull()) && !jsonObj.get("plugin_license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_license").toString()));
      }
      if ((jsonObj.get("plugin_name") != null && !jsonObj.get("plugin_name").isJsonNull()) && !jsonObj.get("plugin_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_name").toString()));
      }
      if ((jsonObj.get("plugin_pipeline_type") != null && !jsonObj.get("plugin_pipeline_type").isJsonNull()) && !jsonObj.get("plugin_pipeline_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_pipeline_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_pipeline_type").toString()));
      }
      if ((jsonObj.get("plugin_type") != null && !jsonObj.get("plugin_type").isJsonNull()) && !jsonObj.get("plugin_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_type").toString()));
      }
      if ((jsonObj.get("plugin_version") != null && !jsonObj.get("plugin_version").isJsonNull()) && !jsonObj.get("plugin_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_version").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supportedInputPlugins") != null && !jsonObj.get("supportedInputPlugins").isJsonNull() && !jsonObj.get("supportedInputPlugins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedInputPlugins` to be an array in the JSON string but got `%s`", jsonObj.get("supportedInputPlugins").toString()));
      }
      if (jsonObj.get("supported_datasources") != null && !jsonObj.get("supported_datasources").isJsonNull()) {
        JsonArray jsonArraysupportedDatasources = jsonObj.getAsJsonArray("supported_datasources");
        if (jsonArraysupportedDatasources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supported_datasources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supported_datasources` to be an array in the JSON string but got `%s`", jsonObj.get("supported_datasources").toString()));
          }

          // validate the optional field `supported_datasources` (array)
          for (int i = 0; i < jsonArraysupportedDatasources.size(); i++) {
            Universalconnectormanagerv3DatasourceType.validateJsonElement(jsonArraysupportedDatasources.get(i));
          };
        }
      }
      if ((jsonObj.get("upload_user") != null && !jsonObj.get("upload_user").isJsonNull()) && !jsonObj.get("upload_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Universalconnectormanagerv3PluginDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Universalconnectormanagerv3PluginDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Universalconnectormanagerv3PluginDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Universalconnectormanagerv3PluginDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<Universalconnectormanagerv3PluginDefinition>() {
           @Override
           public void write(JsonWriter out, Universalconnectormanagerv3PluginDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Universalconnectormanagerv3PluginDefinition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Universalconnectormanagerv3PluginDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Universalconnectormanagerv3PluginDefinition
  * @throws IOException if the JSON string is invalid with respect to Universalconnectormanagerv3PluginDefinition
  */
  public static Universalconnectormanagerv3PluginDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Universalconnectormanagerv3PluginDefinition.class);
  }

 /**
  * Convert an instance of Universalconnectormanagerv3PluginDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

