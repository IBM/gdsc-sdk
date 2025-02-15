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


package com.ibm.gdsc.sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.Notificationsv3NotificationSeverity;
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
 * Notificationsv3CreateTicketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Notificationsv3CreateTicketRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additional_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private String contents;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integration_id";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Notificationsv3NotificationSeverity severity = Notificationsv3NotificationSeverity.UNDEFINED;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Notificationsv3CreateTicketRequest() {
  }

  public Notificationsv3CreateTicketRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public Notificationsv3CreateTicketRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  @javax.annotation.Nullable
  public Map<String, String> getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public Notificationsv3CreateTicketRequest contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }


  public Notificationsv3CreateTicketRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Get integrationId
   * @return integrationId
  **/
  @javax.annotation.Nullable
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Notificationsv3CreateTicketRequest severity(Notificationsv3NotificationSeverity severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  public Notificationsv3NotificationSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(Notificationsv3NotificationSeverity severity) {
    this.severity = severity;
  }


  public Notificationsv3CreateTicketRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsv3CreateTicketRequest notificationsv3CreateTicketRequest = (Notificationsv3CreateTicketRequest) o;
    return Objects.equals(this.additionalData, notificationsv3CreateTicketRequest.additionalData) &&
        Objects.equals(this.contents, notificationsv3CreateTicketRequest.contents) &&
        Objects.equals(this.integrationId, notificationsv3CreateTicketRequest.integrationId) &&
        Objects.equals(this.severity, notificationsv3CreateTicketRequest.severity) &&
        Objects.equals(this.title, notificationsv3CreateTicketRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, contents, integrationId, severity, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsv3CreateTicketRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("additional_data");
    openapiFields.add("contents");
    openapiFields.add("integration_id");
    openapiFields.add("severity");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Notificationsv3CreateTicketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Notificationsv3CreateTicketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Notificationsv3CreateTicketRequest is not found in the empty JSON string", Notificationsv3CreateTicketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Notificationsv3CreateTicketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Notificationsv3CreateTicketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonNull()) && !jsonObj.get("contents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contents").toString()));
      }
      if ((jsonObj.get("integration_id") != null && !jsonObj.get("integration_id").isJsonNull()) && !jsonObj.get("integration_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_id").toString()));
      }
      // validate the optional field `severity`
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonNull()) {
        Notificationsv3NotificationSeverity.validateJsonElement(jsonObj.get("severity"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Notificationsv3CreateTicketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Notificationsv3CreateTicketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Notificationsv3CreateTicketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Notificationsv3CreateTicketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Notificationsv3CreateTicketRequest>() {
           @Override
           public void write(JsonWriter out, Notificationsv3CreateTicketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Notificationsv3CreateTicketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Notificationsv3CreateTicketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Notificationsv3CreateTicketRequest
  * @throws IOException if the JSON string is invalid with respect to Notificationsv3CreateTicketRequest
  */
  public static Notificationsv3CreateTicketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Notificationsv3CreateTicketRequest.class);
  }

 /**
  * Convert an instance of Notificationsv3CreateTicketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

