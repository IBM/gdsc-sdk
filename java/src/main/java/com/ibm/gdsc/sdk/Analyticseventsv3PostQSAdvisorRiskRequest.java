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
import com.ibm.gdsc.sdk.Schedulerv3Recipient;
import com.ibm.gdsc.sdk.Templatesv3Origin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Analyticseventsv3PostQSAdvisorRiskRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Analyticseventsv3PostQSAdvisorRiskRequest {
  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private Templatesv3Origin origin = Templatesv3Origin.UNDEFINED_ORIGIN;

  public static final String SERIALIZED_NAME_ORIGIN_DATA = "origin_data";
  @SerializedName(SERIALIZED_NAME_ORIGIN_DATA)
  private String originData;

  public static final String SERIALIZED_NAME_TARGET_RECEIVERS = "target_receivers";
  @SerializedName(SERIALIZED_NAME_TARGET_RECEIVERS)
  private List<Schedulerv3Recipient> targetReceivers = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_DATA = "template_data";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA)
  private Map<String, String> templateData = new HashMap<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Analyticseventsv3PostQSAdvisorRiskRequest() {
  }

  public Analyticseventsv3PostQSAdvisorRiskRequest origin(Templatesv3Origin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public Templatesv3Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Templatesv3Origin origin) {
    this.origin = origin;
  }


  public Analyticseventsv3PostQSAdvisorRiskRequest originData(String originData) {
    this.originData = originData;
    return this;
  }

   /**
   * Get originData
   * @return originData
  **/
  @javax.annotation.Nullable
  public String getOriginData() {
    return originData;
  }

  public void setOriginData(String originData) {
    this.originData = originData;
  }


  public Analyticseventsv3PostQSAdvisorRiskRequest targetReceivers(List<Schedulerv3Recipient> targetReceivers) {
    this.targetReceivers = targetReceivers;
    return this;
  }

  public Analyticseventsv3PostQSAdvisorRiskRequest addTargetReceiversItem(Schedulerv3Recipient targetReceiversItem) {
    if (this.targetReceivers == null) {
      this.targetReceivers = new ArrayList<>();
    }
    this.targetReceivers.add(targetReceiversItem);
    return this;
  }

   /**
   * Get targetReceivers
   * @return targetReceivers
  **/
  @javax.annotation.Nullable
  public List<Schedulerv3Recipient> getTargetReceivers() {
    return targetReceivers;
  }

  public void setTargetReceivers(List<Schedulerv3Recipient> targetReceivers) {
    this.targetReceivers = targetReceivers;
  }


  public Analyticseventsv3PostQSAdvisorRiskRequest templateData(Map<String, String> templateData) {
    this.templateData = templateData;
    return this;
  }

  public Analyticseventsv3PostQSAdvisorRiskRequest putTemplateDataItem(String key, String templateDataItem) {
    if (this.templateData == null) {
      this.templateData = new HashMap<>();
    }
    this.templateData.put(key, templateDataItem);
    return this;
  }

   /**
   * Get templateData
   * @return templateData
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTemplateData() {
    return templateData;
  }

  public void setTemplateData(Map<String, String> templateData) {
    this.templateData = templateData;
  }


  public Analyticseventsv3PostQSAdvisorRiskRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Optional:Brief title used to quickly describe the notification.
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
    Analyticseventsv3PostQSAdvisorRiskRequest analyticseventsv3PostQSAdvisorRiskRequest = (Analyticseventsv3PostQSAdvisorRiskRequest) o;
    return Objects.equals(this.origin, analyticseventsv3PostQSAdvisorRiskRequest.origin) &&
        Objects.equals(this.originData, analyticseventsv3PostQSAdvisorRiskRequest.originData) &&
        Objects.equals(this.targetReceivers, analyticseventsv3PostQSAdvisorRiskRequest.targetReceivers) &&
        Objects.equals(this.templateData, analyticseventsv3PostQSAdvisorRiskRequest.templateData) &&
        Objects.equals(this.title, analyticseventsv3PostQSAdvisorRiskRequest.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, originData, targetReceivers, templateData, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analyticseventsv3PostQSAdvisorRiskRequest {\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originData: ").append(toIndentedString(originData)).append("\n");
    sb.append("    targetReceivers: ").append(toIndentedString(targetReceivers)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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
    openapiFields.add("origin");
    openapiFields.add("origin_data");
    openapiFields.add("target_receivers");
    openapiFields.add("template_data");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Analyticseventsv3PostQSAdvisorRiskRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Analyticseventsv3PostQSAdvisorRiskRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Analyticseventsv3PostQSAdvisorRiskRequest is not found in the empty JSON string", Analyticseventsv3PostQSAdvisorRiskRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Analyticseventsv3PostQSAdvisorRiskRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Analyticseventsv3PostQSAdvisorRiskRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `origin`
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) {
        Templatesv3Origin.validateJsonElement(jsonObj.get("origin"));
      }
      if ((jsonObj.get("origin_data") != null && !jsonObj.get("origin_data").isJsonNull()) && !jsonObj.get("origin_data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_data").toString()));
      }
      if (jsonObj.get("target_receivers") != null && !jsonObj.get("target_receivers").isJsonNull()) {
        JsonArray jsonArraytargetReceivers = jsonObj.getAsJsonArray("target_receivers");
        if (jsonArraytargetReceivers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("target_receivers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `target_receivers` to be an array in the JSON string but got `%s`", jsonObj.get("target_receivers").toString()));
          }

          // validate the optional field `target_receivers` (array)
          for (int i = 0; i < jsonArraytargetReceivers.size(); i++) {
            Schedulerv3Recipient.validateJsonElement(jsonArraytargetReceivers.get(i));
          };
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Analyticseventsv3PostQSAdvisorRiskRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Analyticseventsv3PostQSAdvisorRiskRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Analyticseventsv3PostQSAdvisorRiskRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Analyticseventsv3PostQSAdvisorRiskRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Analyticseventsv3PostQSAdvisorRiskRequest>() {
           @Override
           public void write(JsonWriter out, Analyticseventsv3PostQSAdvisorRiskRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Analyticseventsv3PostQSAdvisorRiskRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Analyticseventsv3PostQSAdvisorRiskRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Analyticseventsv3PostQSAdvisorRiskRequest
  * @throws IOException if the JSON string is invalid with respect to Analyticseventsv3PostQSAdvisorRiskRequest
  */
  public static Analyticseventsv3PostQSAdvisorRiskRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Analyticseventsv3PostQSAdvisorRiskRequest.class);
  }

 /**
  * Convert an instance of Analyticseventsv3PostQSAdvisorRiskRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

