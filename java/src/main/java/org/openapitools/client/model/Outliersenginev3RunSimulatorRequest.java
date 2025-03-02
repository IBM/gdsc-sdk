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

import org.openapitools.client.JSON;

/**
 * RunSimulatorRequest message for RunSimulator.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Outliersenginev3RunSimulatorRequest {
  public static final String SERIALIZED_NAME_CONFIGURATION_FILE_PATH = "configuration_file_path";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_FILE_PATH)
  private String configurationFilePath;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_ENABLE_DEMO_MODE = "enable_demo_mode";
  @SerializedName(SERIALIZED_NAME_ENABLE_DEMO_MODE)
  private Boolean enableDemoMode;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public Outliersenginev3RunSimulatorRequest() {
  }

  public Outliersenginev3RunSimulatorRequest configurationFilePath(String configurationFilePath) {
    this.configurationFilePath = configurationFilePath;
    return this;
  }

   /**
   * Optional: path to configuration file - is null or empty use the default config file.
   * @return configurationFilePath
  **/
  @javax.annotation.Nullable
  public String getConfigurationFilePath() {
    return configurationFilePath;
  }

  public void setConfigurationFilePath(String configurationFilePath) {
    this.configurationFilePath = configurationFilePath;
  }


  public Outliersenginev3RunSimulatorRequest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date in the format dd/mm/yyyy.
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  public Outliersenginev3RunSimulatorRequest enableDemoMode(Boolean enableDemoMode) {
    this.enableDemoMode = enableDemoMode;
    return this;
  }

   /**
   * Optional: default false.
   * @return enableDemoMode
  **/
  @javax.annotation.Nullable
  public Boolean getEnableDemoMode() {
    return enableDemoMode;
  }

  public void setEnableDemoMode(Boolean enableDemoMode) {
    this.enableDemoMode = enableDemoMode;
  }


  public Outliersenginev3RunSimulatorRequest length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Number of periods.
   * @return length
  **/
  @javax.annotation.Nullable
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outliersenginev3RunSimulatorRequest outliersenginev3RunSimulatorRequest = (Outliersenginev3RunSimulatorRequest) o;
    return Objects.equals(this.configurationFilePath, outliersenginev3RunSimulatorRequest.configurationFilePath) &&
        Objects.equals(this.date, outliersenginev3RunSimulatorRequest.date) &&
        Objects.equals(this.enableDemoMode, outliersenginev3RunSimulatorRequest.enableDemoMode) &&
        Objects.equals(this.length, outliersenginev3RunSimulatorRequest.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationFilePath, date, enableDemoMode, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outliersenginev3RunSimulatorRequest {\n");
    sb.append("    configurationFilePath: ").append(toIndentedString(configurationFilePath)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    enableDemoMode: ").append(toIndentedString(enableDemoMode)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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
    openapiFields.add("configuration_file_path");
    openapiFields.add("date");
    openapiFields.add("enable_demo_mode");
    openapiFields.add("length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Outliersenginev3RunSimulatorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Outliersenginev3RunSimulatorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Outliersenginev3RunSimulatorRequest is not found in the empty JSON string", Outliersenginev3RunSimulatorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Outliersenginev3RunSimulatorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Outliersenginev3RunSimulatorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("configuration_file_path") != null && !jsonObj.get("configuration_file_path").isJsonNull()) && !jsonObj.get("configuration_file_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_file_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_file_path").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Outliersenginev3RunSimulatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Outliersenginev3RunSimulatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Outliersenginev3RunSimulatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Outliersenginev3RunSimulatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Outliersenginev3RunSimulatorRequest>() {
           @Override
           public void write(JsonWriter out, Outliersenginev3RunSimulatorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Outliersenginev3RunSimulatorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Outliersenginev3RunSimulatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Outliersenginev3RunSimulatorRequest
  * @throws IOException if the JSON string is invalid with respect to Outliersenginev3RunSimulatorRequest
  */
  public static Outliersenginev3RunSimulatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Outliersenginev3RunSimulatorRequest.class);
  }

 /**
  * Convert an instance of Outliersenginev3RunSimulatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

