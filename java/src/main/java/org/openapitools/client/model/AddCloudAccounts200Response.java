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
 * AddCloudAccounts200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class AddCloudAccounts200Response {
  public static final String SERIALIZED_NAME_INSTALLATION_URL = "installationUrl";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_URL)
  private String installationUrl;

  public static final String SERIALIZED_NAME_INSTALLATION_SCRIPT = "installationScript";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_SCRIPT)
  private String installationScript;

  public AddCloudAccounts200Response() {
  }

  public AddCloudAccounts200Response installationUrl(String installationUrl) {
    this.installationUrl = installationUrl;
    return this;
  }

   /**
   * Use this URL to download the installation script.
   * @return installationUrl
  **/
  @javax.annotation.Nullable
  public String getInstallationUrl() {
    return installationUrl;
  }

  public void setInstallationUrl(String installationUrl) {
    this.installationUrl = installationUrl;
  }


  public AddCloudAccounts200Response installationScript(String installationScript) {
    this.installationScript = installationScript;
    return this;
  }

   /**
   * Use this URL to download the installation script
   * @return installationScript
  **/
  @javax.annotation.Nullable
  public String getInstallationScript() {
    return installationScript;
  }

  public void setInstallationScript(String installationScript) {
    this.installationScript = installationScript;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCloudAccounts200Response addCloudAccounts200Response = (AddCloudAccounts200Response) o;
    return Objects.equals(this.installationUrl, addCloudAccounts200Response.installationUrl) &&
        Objects.equals(this.installationScript, addCloudAccounts200Response.installationScript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installationUrl, installationScript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCloudAccounts200Response {\n");
    sb.append("    installationUrl: ").append(toIndentedString(installationUrl)).append("\n");
    sb.append("    installationScript: ").append(toIndentedString(installationScript)).append("\n");
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
    openapiFields.add("installationUrl");
    openapiFields.add("installationScript");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddCloudAccounts200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddCloudAccounts200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddCloudAccounts200Response is not found in the empty JSON string", AddCloudAccounts200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddCloudAccounts200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddCloudAccounts200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("installationUrl") != null && !jsonObj.get("installationUrl").isJsonNull()) && !jsonObj.get("installationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installationUrl").toString()));
      }
      if ((jsonObj.get("installationScript") != null && !jsonObj.get("installationScript").isJsonNull()) && !jsonObj.get("installationScript").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installationScript` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installationScript").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddCloudAccounts200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddCloudAccounts200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddCloudAccounts200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddCloudAccounts200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AddCloudAccounts200Response>() {
           @Override
           public void write(JsonWriter out, AddCloudAccounts200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddCloudAccounts200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddCloudAccounts200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddCloudAccounts200Response
  * @throws IOException if the JSON string is invalid with respect to AddCloudAccounts200Response
  */
  public static AddCloudAccounts200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddCloudAccounts200Response.class);
  }

 /**
  * Convert an instance of AddCloudAccounts200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

