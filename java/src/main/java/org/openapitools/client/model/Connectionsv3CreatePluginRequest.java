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
import org.openapitools.client.model.Connectionsv3PluginRecord;

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
 * Connectionsv3CreatePluginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3CreatePluginRequest {
  public static final String SERIALIZED_NAME_DATASOURCE_TYPE = "datasource_type";
  @SerializedName(SERIALIZED_NAME_DATASOURCE_TYPE)
  private String datasourceType;

  public static final String SERIALIZED_NAME_DEVELOPER_NAME = "developer_name";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_NAME)
  private String developerName;

  public static final String SERIALIZED_NAME_LOGFILE = "logfile";
  @SerializedName(SERIALIZED_NAME_LOGFILE)
  private String logfile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_README = "readme";
  @SerializedName(SERIALIZED_NAME_README)
  private String readme;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<Connectionsv3PluginRecord> records = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_INPUTS = "supported_inputs";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_INPUTS)
  private List<String> supportedInputs = new ArrayList<>();

  public Connectionsv3CreatePluginRequest() {
  }

  public Connectionsv3CreatePluginRequest datasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
    return this;
  }

   /**
   * Get datasourceType
   * @return datasourceType
  **/
  @javax.annotation.Nullable
  public String getDatasourceType() {
    return datasourceType;
  }

  public void setDatasourceType(String datasourceType) {
    this.datasourceType = datasourceType;
  }


  public Connectionsv3CreatePluginRequest developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Get developerName
   * @return developerName
  **/
  @javax.annotation.Nullable
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }


  public Connectionsv3CreatePluginRequest logfile(String logfile) {
    this.logfile = logfile;
    return this;
  }

   /**
   * Get logfile
   * @return logfile
  **/
  @javax.annotation.Nullable
  public String getLogfile() {
    return logfile;
  }

  public void setLogfile(String logfile) {
    this.logfile = logfile;
  }


  public Connectionsv3CreatePluginRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Connectionsv3CreatePluginRequest readme(String readme) {
    this.readme = readme;
    return this;
  }

   /**
   * Get readme
   * @return readme
  **/
  @javax.annotation.Nullable
  public String getReadme() {
    return readme;
  }

  public void setReadme(String readme) {
    this.readme = readme;
  }


  public Connectionsv3CreatePluginRequest records(List<Connectionsv3PluginRecord> records) {
    this.records = records;
    return this;
  }

  public Connectionsv3CreatePluginRequest addRecordsItem(Connectionsv3PluginRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3PluginRecord> getRecords() {
    return records;
  }

  public void setRecords(List<Connectionsv3PluginRecord> records) {
    this.records = records;
  }


  public Connectionsv3CreatePluginRequest supportedInputs(List<String> supportedInputs) {
    this.supportedInputs = supportedInputs;
    return this;
  }

  public Connectionsv3CreatePluginRequest addSupportedInputsItem(String supportedInputsItem) {
    if (this.supportedInputs == null) {
      this.supportedInputs = new ArrayList<>();
    }
    this.supportedInputs.add(supportedInputsItem);
    return this;
  }

   /**
   * Get supportedInputs
   * @return supportedInputs
  **/
  @javax.annotation.Nullable
  public List<String> getSupportedInputs() {
    return supportedInputs;
  }

  public void setSupportedInputs(List<String> supportedInputs) {
    this.supportedInputs = supportedInputs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3CreatePluginRequest connectionsv3CreatePluginRequest = (Connectionsv3CreatePluginRequest) o;
    return Objects.equals(this.datasourceType, connectionsv3CreatePluginRequest.datasourceType) &&
        Objects.equals(this.developerName, connectionsv3CreatePluginRequest.developerName) &&
        Objects.equals(this.logfile, connectionsv3CreatePluginRequest.logfile) &&
        Objects.equals(this.name, connectionsv3CreatePluginRequest.name) &&
        Objects.equals(this.readme, connectionsv3CreatePluginRequest.readme) &&
        Objects.equals(this.records, connectionsv3CreatePluginRequest.records) &&
        Objects.equals(this.supportedInputs, connectionsv3CreatePluginRequest.supportedInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceType, developerName, logfile, name, readme, records, supportedInputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3CreatePluginRequest {\n");
    sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
    sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
    sb.append("    logfile: ").append(toIndentedString(logfile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    supportedInputs: ").append(toIndentedString(supportedInputs)).append("\n");
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
    openapiFields.add("datasource_type");
    openapiFields.add("developer_name");
    openapiFields.add("logfile");
    openapiFields.add("name");
    openapiFields.add("readme");
    openapiFields.add("records");
    openapiFields.add("supported_inputs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3CreatePluginRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3CreatePluginRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3CreatePluginRequest is not found in the empty JSON string", Connectionsv3CreatePluginRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3CreatePluginRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3CreatePluginRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("datasource_type") != null && !jsonObj.get("datasource_type").isJsonNull()) && !jsonObj.get("datasource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasource_type").toString()));
      }
      if ((jsonObj.get("developer_name") != null && !jsonObj.get("developer_name").isJsonNull()) && !jsonObj.get("developer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developer_name").toString()));
      }
      if ((jsonObj.get("logfile") != null && !jsonObj.get("logfile").isJsonNull()) && !jsonObj.get("logfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logfile").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("readme") != null && !jsonObj.get("readme").isJsonNull()) && !jsonObj.get("readme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `readme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("readme").toString()));
      }
      if (jsonObj.get("records") != null && !jsonObj.get("records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
          }

          // validate the optional field `records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            Connectionsv3PluginRecord.validateJsonElement(jsonArrayrecords.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supported_inputs") != null && !jsonObj.get("supported_inputs").isJsonNull() && !jsonObj.get("supported_inputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_inputs` to be an array in the JSON string but got `%s`", jsonObj.get("supported_inputs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3CreatePluginRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3CreatePluginRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3CreatePluginRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3CreatePluginRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3CreatePluginRequest>() {
           @Override
           public void write(JsonWriter out, Connectionsv3CreatePluginRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3CreatePluginRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3CreatePluginRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3CreatePluginRequest
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3CreatePluginRequest
  */
  public static Connectionsv3CreatePluginRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3CreatePluginRequest.class);
  }

 /**
  * Convert an instance of Connectionsv3CreatePluginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

