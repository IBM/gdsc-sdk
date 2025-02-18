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
import com.ibm.gdsc.sdk.Universalconnectormanagerv3DatasourceType;
import com.ibm.gdsc.sdk.Universalconnectormanagerv3PluginDefinition;
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

import com.ibm.gdsc.JSON;

/**
 * Part of GetConnectors response. Contains details about a Universal connector connection configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Universalconnectormanagerv3ConnectorSummary {
  public static final String SERIALIZED_NAME_COMBINED_CONFIGURATION = "combined_configuration";
  @SerializedName(SERIALIZED_NAME_COMBINED_CONFIGURATION)
  private String combinedConfiguration;

  public static final String SERIALIZED_NAME_COMBINED_CONFIGURATION_STRINGS = "combined_configuration_strings";
  @SerializedName(SERIALIZED_NAME_COMBINED_CONFIGURATION_STRINGS)
  private String combinedConfigurationStrings;

  public static final String SERIALIZED_NAME_CONNECTOR_NAME = "connector_name";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_NAME)
  private String connectorName;

  public static final String SERIALIZED_NAME_DEVELOPER = "developer";
  @SerializedName(SERIALIZED_NAME_DEVELOPER)
  private String developer;

  public static final String SERIALIZED_NAME_FILTER_PLUGIN = "filter_plugin";
  @SerializedName(SERIALIZED_NAME_FILTER_PLUGIN)
  private Universalconnectormanagerv3PluginDefinition filterPlugin;

  public static final String SERIALIZED_NAME_FILTER_PLUGIN_NAME = "filter_plugin_name";
  @SerializedName(SERIALIZED_NAME_FILTER_PLUGIN_NAME)
  private String filterPluginName;

  public static final String SERIALIZED_NAME_INPUT_PLUGIN = "input_plugin";
  @SerializedName(SERIALIZED_NAME_INPUT_PLUGIN)
  private Universalconnectormanagerv3PluginDefinition inputPlugin;

  public static final String SERIALIZED_NAME_INPUT_PLUGIN_NAME = "input_plugin_name";
  @SerializedName(SERIALIZED_NAME_INPUT_PLUGIN_NAME)
  private String inputPluginName;

  public static final String SERIALIZED_NAME_SUPPORTED_DATASOURCES = "supported_datasources";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DATASOURCES)
  private List<Universalconnectormanagerv3DatasourceType> supportedDatasources = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_PLATFORMS = "supported_platforms";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_PLATFORMS)
  private List<String> supportedPlatforms = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPLOAD_DATE = "upload_date";
  @SerializedName(SERIALIZED_NAME_UPLOAD_DATE)
  private OffsetDateTime uploadDate;

  public static final String SERIALIZED_NAME_UPLOAD_USER = "upload_user";
  @SerializedName(SERIALIZED_NAME_UPLOAD_USER)
  private String uploadUser;

  public Universalconnectormanagerv3ConnectorSummary() {
  }

  public Universalconnectormanagerv3ConnectorSummary combinedConfiguration(String combinedConfiguration) {
    this.combinedConfiguration = combinedConfiguration;
    return this;
  }

   /**
   * Connector configuration parameters. A union of Input and Filter parameters.
   * @return combinedConfiguration
  **/
  @javax.annotation.Nullable
  public String getCombinedConfiguration() {
    return combinedConfiguration;
  }

  public void setCombinedConfiguration(String combinedConfiguration) {
    this.combinedConfiguration = combinedConfiguration;
  }


  public Universalconnectormanagerv3ConnectorSummary combinedConfigurationStrings(String combinedConfigurationStrings) {
    this.combinedConfigurationStrings = combinedConfigurationStrings;
    return this;
  }

   /**
   * Connector configuration parameters strings, for UI.
   * @return combinedConfigurationStrings
  **/
  @javax.annotation.Nullable
  public String getCombinedConfigurationStrings() {
    return combinedConfigurationStrings;
  }

  public void setCombinedConfigurationStrings(String combinedConfigurationStrings) {
    this.combinedConfigurationStrings = combinedConfigurationStrings;
  }


  public Universalconnectormanagerv3ConnectorSummary connectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

   /**
   * ID of connector.
   * @return connectorName
  **/
  @javax.annotation.Nullable
  public String getConnectorName() {
    return connectorName;
  }

  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }


  public Universalconnectormanagerv3ConnectorSummary developer(String developer) {
    this.developer = developer;
    return this;
  }

   /**
   * The developer who developed the manifest.
   * @return developer
  **/
  @javax.annotation.Nullable
  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }


  public Universalconnectormanagerv3ConnectorSummary filterPlugin(Universalconnectormanagerv3PluginDefinition filterPlugin) {
    this.filterPlugin = filterPlugin;
    return this;
  }

   /**
   * Get filterPlugin
   * @return filterPlugin
  **/
  @javax.annotation.Nullable
  public Universalconnectormanagerv3PluginDefinition getFilterPlugin() {
    return filterPlugin;
  }

  public void setFilterPlugin(Universalconnectormanagerv3PluginDefinition filterPlugin) {
    this.filterPlugin = filterPlugin;
  }


  public Universalconnectormanagerv3ConnectorSummary filterPluginName(String filterPluginName) {
    this.filterPluginName = filterPluginName;
    return this;
  }

   /**
   * ID of filter plugin.
   * @return filterPluginName
  **/
  @javax.annotation.Nullable
  public String getFilterPluginName() {
    return filterPluginName;
  }

  public void setFilterPluginName(String filterPluginName) {
    this.filterPluginName = filterPluginName;
  }


  public Universalconnectormanagerv3ConnectorSummary inputPlugin(Universalconnectormanagerv3PluginDefinition inputPlugin) {
    this.inputPlugin = inputPlugin;
    return this;
  }

   /**
   * Get inputPlugin
   * @return inputPlugin
  **/
  @javax.annotation.Nullable
  public Universalconnectormanagerv3PluginDefinition getInputPlugin() {
    return inputPlugin;
  }

  public void setInputPlugin(Universalconnectormanagerv3PluginDefinition inputPlugin) {
    this.inputPlugin = inputPlugin;
  }


  public Universalconnectormanagerv3ConnectorSummary inputPluginName(String inputPluginName) {
    this.inputPluginName = inputPluginName;
    return this;
  }

   /**
   * ID of input plugin.
   * @return inputPluginName
  **/
  @javax.annotation.Nullable
  public String getInputPluginName() {
    return inputPluginName;
  }

  public void setInputPluginName(String inputPluginName) {
    this.inputPluginName = inputPluginName;
  }


  public Universalconnectormanagerv3ConnectorSummary supportedDatasources(List<Universalconnectormanagerv3DatasourceType> supportedDatasources) {
    this.supportedDatasources = supportedDatasources;
    return this;
  }

  public Universalconnectormanagerv3ConnectorSummary addSupportedDatasourcesItem(Universalconnectormanagerv3DatasourceType supportedDatasourcesItem) {
    if (this.supportedDatasources == null) {
      this.supportedDatasources = new ArrayList<>();
    }
    this.supportedDatasources.add(supportedDatasourcesItem);
    return this;
  }

   /**
   * Supported data source types, according to the Filter plugin.
   * @return supportedDatasources
  **/
  @javax.annotation.Nullable
  public List<Universalconnectormanagerv3DatasourceType> getSupportedDatasources() {
    return supportedDatasources;
  }

  public void setSupportedDatasources(List<Universalconnectormanagerv3DatasourceType> supportedDatasources) {
    this.supportedDatasources = supportedDatasources;
  }


  public Universalconnectormanagerv3ConnectorSummary supportedPlatforms(List<String> supportedPlatforms) {
    this.supportedPlatforms = supportedPlatforms;
    return this;
  }

  public Universalconnectormanagerv3ConnectorSummary addSupportedPlatformsItem(String supportedPlatformsItem) {
    if (this.supportedPlatforms == null) {
      this.supportedPlatforms = new ArrayList<>();
    }
    this.supportedPlatforms.add(supportedPlatformsItem);
    return this;
  }

   /**
   * Array of supported platforms/environments. Examples: \&quot;on-premise\&quot;, \&quot;AWS\&quot;, \&quot;Azure\&quot;, \&quot;GCP\&quot;.
   * @return supportedPlatforms
  **/
  @javax.annotation.Nullable
  public List<String> getSupportedPlatforms() {
    return supportedPlatforms;
  }

  public void setSupportedPlatforms(List<String> supportedPlatforms) {
    this.supportedPlatforms = supportedPlatforms;
  }


  public Universalconnectormanagerv3ConnectorSummary uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Date connector manifest was uploaded.
   * @return uploadDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }


  public Universalconnectormanagerv3ConnectorSummary uploadUser(String uploadUser) {
    this.uploadUser = uploadUser;
    return this;
  }

   /**
   * User who uploaded the manifest.
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
    Universalconnectormanagerv3ConnectorSummary universalconnectormanagerv3ConnectorSummary = (Universalconnectormanagerv3ConnectorSummary) o;
    return Objects.equals(this.combinedConfiguration, universalconnectormanagerv3ConnectorSummary.combinedConfiguration) &&
        Objects.equals(this.combinedConfigurationStrings, universalconnectormanagerv3ConnectorSummary.combinedConfigurationStrings) &&
        Objects.equals(this.connectorName, universalconnectormanagerv3ConnectorSummary.connectorName) &&
        Objects.equals(this.developer, universalconnectormanagerv3ConnectorSummary.developer) &&
        Objects.equals(this.filterPlugin, universalconnectormanagerv3ConnectorSummary.filterPlugin) &&
        Objects.equals(this.filterPluginName, universalconnectormanagerv3ConnectorSummary.filterPluginName) &&
        Objects.equals(this.inputPlugin, universalconnectormanagerv3ConnectorSummary.inputPlugin) &&
        Objects.equals(this.inputPluginName, universalconnectormanagerv3ConnectorSummary.inputPluginName) &&
        Objects.equals(this.supportedDatasources, universalconnectormanagerv3ConnectorSummary.supportedDatasources) &&
        Objects.equals(this.supportedPlatforms, universalconnectormanagerv3ConnectorSummary.supportedPlatforms) &&
        Objects.equals(this.uploadDate, universalconnectormanagerv3ConnectorSummary.uploadDate) &&
        Objects.equals(this.uploadUser, universalconnectormanagerv3ConnectorSummary.uploadUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinedConfiguration, combinedConfigurationStrings, connectorName, developer, filterPlugin, filterPluginName, inputPlugin, inputPluginName, supportedDatasources, supportedPlatforms, uploadDate, uploadUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Universalconnectormanagerv3ConnectorSummary {\n");
    sb.append("    combinedConfiguration: ").append(toIndentedString(combinedConfiguration)).append("\n");
    sb.append("    combinedConfigurationStrings: ").append(toIndentedString(combinedConfigurationStrings)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    filterPlugin: ").append(toIndentedString(filterPlugin)).append("\n");
    sb.append("    filterPluginName: ").append(toIndentedString(filterPluginName)).append("\n");
    sb.append("    inputPlugin: ").append(toIndentedString(inputPlugin)).append("\n");
    sb.append("    inputPluginName: ").append(toIndentedString(inputPluginName)).append("\n");
    sb.append("    supportedDatasources: ").append(toIndentedString(supportedDatasources)).append("\n");
    sb.append("    supportedPlatforms: ").append(toIndentedString(supportedPlatforms)).append("\n");
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
    openapiFields.add("combined_configuration");
    openapiFields.add("combined_configuration_strings");
    openapiFields.add("connector_name");
    openapiFields.add("developer");
    openapiFields.add("filter_plugin");
    openapiFields.add("filter_plugin_name");
    openapiFields.add("input_plugin");
    openapiFields.add("input_plugin_name");
    openapiFields.add("supported_datasources");
    openapiFields.add("supported_platforms");
    openapiFields.add("upload_date");
    openapiFields.add("upload_user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Universalconnectormanagerv3ConnectorSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Universalconnectormanagerv3ConnectorSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Universalconnectormanagerv3ConnectorSummary is not found in the empty JSON string", Universalconnectormanagerv3ConnectorSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Universalconnectormanagerv3ConnectorSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Universalconnectormanagerv3ConnectorSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("combined_configuration") != null && !jsonObj.get("combined_configuration").isJsonNull()) && !jsonObj.get("combined_configuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `combined_configuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("combined_configuration").toString()));
      }
      if ((jsonObj.get("combined_configuration_strings") != null && !jsonObj.get("combined_configuration_strings").isJsonNull()) && !jsonObj.get("combined_configuration_strings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `combined_configuration_strings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("combined_configuration_strings").toString()));
      }
      if ((jsonObj.get("connector_name") != null && !jsonObj.get("connector_name").isJsonNull()) && !jsonObj.get("connector_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connector_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connector_name").toString()));
      }
      if ((jsonObj.get("developer") != null && !jsonObj.get("developer").isJsonNull()) && !jsonObj.get("developer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developer").toString()));
      }
      // validate the optional field `filter_plugin`
      if (jsonObj.get("filter_plugin") != null && !jsonObj.get("filter_plugin").isJsonNull()) {
        Universalconnectormanagerv3PluginDefinition.validateJsonElement(jsonObj.get("filter_plugin"));
      }
      if ((jsonObj.get("filter_plugin_name") != null && !jsonObj.get("filter_plugin_name").isJsonNull()) && !jsonObj.get("filter_plugin_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_plugin_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_plugin_name").toString()));
      }
      // validate the optional field `input_plugin`
      if (jsonObj.get("input_plugin") != null && !jsonObj.get("input_plugin").isJsonNull()) {
        Universalconnectormanagerv3PluginDefinition.validateJsonElement(jsonObj.get("input_plugin"));
      }
      if ((jsonObj.get("input_plugin_name") != null && !jsonObj.get("input_plugin_name").isJsonNull()) && !jsonObj.get("input_plugin_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_plugin_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_plugin_name").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("supported_platforms") != null && !jsonObj.get("supported_platforms").isJsonNull() && !jsonObj.get("supported_platforms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_platforms` to be an array in the JSON string but got `%s`", jsonObj.get("supported_platforms").toString()));
      }
      if ((jsonObj.get("upload_user") != null && !jsonObj.get("upload_user").isJsonNull()) && !jsonObj.get("upload_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Universalconnectormanagerv3ConnectorSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Universalconnectormanagerv3ConnectorSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Universalconnectormanagerv3ConnectorSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Universalconnectormanagerv3ConnectorSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<Universalconnectormanagerv3ConnectorSummary>() {
           @Override
           public void write(JsonWriter out, Universalconnectormanagerv3ConnectorSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Universalconnectormanagerv3ConnectorSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Universalconnectormanagerv3ConnectorSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Universalconnectormanagerv3ConnectorSummary
  * @throws IOException if the JSON string is invalid with respect to Universalconnectormanagerv3ConnectorSummary
  */
  public static Universalconnectormanagerv3ConnectorSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Universalconnectormanagerv3ConnectorSummary.class);
  }

 /**
  * Convert an instance of Universalconnectormanagerv3ConnectorSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

