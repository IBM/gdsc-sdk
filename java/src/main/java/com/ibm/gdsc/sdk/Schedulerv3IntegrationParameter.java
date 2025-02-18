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

import com.ibm.gdsc.JSON;

/**
 * IntegrationParameter includes all the parameters needed to import data from a csv file or other integration task parameters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3IntegrationParameter {
  public static final String SERIALIZED_NAME_EXTRA_DETAIL = "extra_detail";
  @SerializedName(SERIALIZED_NAME_EXTRA_DETAIL)
  private String extraDetail;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integration_id";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Schedulerv3IntegrationParameter() {
  }

  public Schedulerv3IntegrationParameter extraDetail(String extraDetail) {
    this.extraDetail = extraDetail;
    return this;
  }

   /**
   * Get extraDetail
   * @return extraDetail
  **/
  @javax.annotation.Nullable
  public String getExtraDetail() {
    return extraDetail;
  }

  public void setExtraDetail(String extraDetail) {
    this.extraDetail = extraDetail;
  }


  public Schedulerv3IntegrationParameter integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * SFTP or SMB connection record in integrations.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Schedulerv3IntegrationParameter templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Optional: SFTP or SMB mapping record.
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public Schedulerv3IntegrationParameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * SFTP or SMB value.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedulerv3IntegrationParameter schedulerv3IntegrationParameter = (Schedulerv3IntegrationParameter) o;
    return Objects.equals(this.extraDetail, schedulerv3IntegrationParameter.extraDetail) &&
        Objects.equals(this.integrationId, schedulerv3IntegrationParameter.integrationId) &&
        Objects.equals(this.templateId, schedulerv3IntegrationParameter.templateId) &&
        Objects.equals(this.value, schedulerv3IntegrationParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraDetail, integrationId, templateId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3IntegrationParameter {\n");
    sb.append("    extraDetail: ").append(toIndentedString(extraDetail)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("extra_detail");
    openapiFields.add("integration_id");
    openapiFields.add("template_id");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3IntegrationParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3IntegrationParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3IntegrationParameter is not found in the empty JSON string", Schedulerv3IntegrationParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3IntegrationParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3IntegrationParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("extra_detail") != null && !jsonObj.get("extra_detail").isJsonNull()) && !jsonObj.get("extra_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra_detail").toString()));
      }
      if ((jsonObj.get("integration_id") != null && !jsonObj.get("integration_id").isJsonNull()) && !jsonObj.get("integration_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_id").toString()));
      }
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3IntegrationParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3IntegrationParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3IntegrationParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3IntegrationParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3IntegrationParameter>() {
           @Override
           public void write(JsonWriter out, Schedulerv3IntegrationParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3IntegrationParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3IntegrationParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3IntegrationParameter
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3IntegrationParameter
  */
  public static Schedulerv3IntegrationParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3IntegrationParameter.class);
  }

 /**
  * Convert an instance of Schedulerv3IntegrationParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

