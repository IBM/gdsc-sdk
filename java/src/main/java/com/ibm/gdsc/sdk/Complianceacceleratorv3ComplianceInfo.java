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
import com.ibm.gdsc.sdk.Complianceacceleratorv3Options;
import com.ibm.gdsc.sdk.Complianceacceleratorv3Workspace;
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

import com.ibm.gdsc.JSON;

/**
 * Compliance data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3ComplianceInfo {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Complianceacceleratorv3Options options;

  public static final String SERIALIZED_NAME_WORKSPACES = "workspaces";
  @SerializedName(SERIALIZED_NAME_WORKSPACES)
  private Map<String, Complianceacceleratorv3Workspace> workspaces = new HashMap<>();

  public Complianceacceleratorv3ComplianceInfo() {
  }

  public Complianceacceleratorv3ComplianceInfo options(Complianceacceleratorv3Options options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public Complianceacceleratorv3Options getOptions() {
    return options;
  }

  public void setOptions(Complianceacceleratorv3Options options) {
    this.options = options;
  }


  public Complianceacceleratorv3ComplianceInfo workspaces(Map<String, Complianceacceleratorv3Workspace> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public Complianceacceleratorv3ComplianceInfo putWorkspacesItem(String key, Complianceacceleratorv3Workspace workspacesItem) {
    if (this.workspaces == null) {
      this.workspaces = new HashMap<>();
    }
    this.workspaces.put(key, workspacesItem);
    return this;
  }

   /**
   * Get workspaces
   * @return workspaces
  **/
  @javax.annotation.Nullable
  public Map<String, Complianceacceleratorv3Workspace> getWorkspaces() {
    return workspaces;
  }

  public void setWorkspaces(Map<String, Complianceacceleratorv3Workspace> workspaces) {
    this.workspaces = workspaces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3ComplianceInfo complianceacceleratorv3ComplianceInfo = (Complianceacceleratorv3ComplianceInfo) o;
    return Objects.equals(this.options, complianceacceleratorv3ComplianceInfo.options) &&
        Objects.equals(this.workspaces, complianceacceleratorv3ComplianceInfo.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, workspaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3ComplianceInfo {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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
    openapiFields.add("options");
    openapiFields.add("workspaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3ComplianceInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3ComplianceInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3ComplianceInfo is not found in the empty JSON string", Complianceacceleratorv3ComplianceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3ComplianceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3ComplianceInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        Complianceacceleratorv3Options.validateJsonElement(jsonObj.get("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3ComplianceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3ComplianceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3ComplianceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3ComplianceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3ComplianceInfo>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3ComplianceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3ComplianceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3ComplianceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3ComplianceInfo
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3ComplianceInfo
  */
  public static Complianceacceleratorv3ComplianceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3ComplianceInfo.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3ComplianceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

