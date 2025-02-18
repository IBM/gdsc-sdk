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
import com.ibm.gdsc.sdk.Templatesv3Template;
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
 * Request to update the specified template, the id must be specified and exist for the update to complete.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Templatesv3UpdateTemplateRequest {
  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Templatesv3Template template;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public Templatesv3UpdateTemplateRequest() {
  }

  public Templatesv3UpdateTemplateRequest template(Templatesv3Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public Templatesv3Template getTemplate() {
    return template;
  }

  public void setTemplate(Templatesv3Template template) {
    this.template = template;
  }


  public Templatesv3UpdateTemplateRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The template id to update.
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templatesv3UpdateTemplateRequest templatesv3UpdateTemplateRequest = (Templatesv3UpdateTemplateRequest) o;
    return Objects.equals(this.template, templatesv3UpdateTemplateRequest.template) &&
        Objects.equals(this.templateId, templatesv3UpdateTemplateRequest.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templatesv3UpdateTemplateRequest {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("template");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Templatesv3UpdateTemplateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Templatesv3UpdateTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Templatesv3UpdateTemplateRequest is not found in the empty JSON string", Templatesv3UpdateTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Templatesv3UpdateTemplateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Templatesv3UpdateTemplateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        Templatesv3Template.validateJsonElement(jsonObj.get("template"));
      }
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Templatesv3UpdateTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Templatesv3UpdateTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Templatesv3UpdateTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Templatesv3UpdateTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Templatesv3UpdateTemplateRequest>() {
           @Override
           public void write(JsonWriter out, Templatesv3UpdateTemplateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Templatesv3UpdateTemplateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Templatesv3UpdateTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Templatesv3UpdateTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to Templatesv3UpdateTemplateRequest
  */
  public static Templatesv3UpdateTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Templatesv3UpdateTemplateRequest.class);
  }

 /**
  * Convert an instance of Templatesv3UpdateTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

