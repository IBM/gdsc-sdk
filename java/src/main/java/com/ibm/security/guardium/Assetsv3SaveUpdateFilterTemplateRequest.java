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


package com.ibm.security.guardium;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.security.guardium.Assetsv3FilterTemplate;
import java.io.IOException;
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

import com.ibm.security.JSON;

/**
 * SaveUpdateFilterTemplateRequest - Save Filter Template request for save filters query as template.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3SaveUpdateFilterTemplateRequest {
  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Assetsv3FilterTemplate template;

  public static final String SERIALIZED_NAME_TEMPLATE_IDS_LIST = "template_ids_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS_LIST)
  private List<String> templateIdsList = new ArrayList<>();

  public Assetsv3SaveUpdateFilterTemplateRequest() {
  }

  public Assetsv3SaveUpdateFilterTemplateRequest isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public Assetsv3SaveUpdateFilterTemplateRequest template(Assetsv3FilterTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public Assetsv3FilterTemplate getTemplate() {
    return template;
  }

  public void setTemplate(Assetsv3FilterTemplate template) {
    this.template = template;
  }


  public Assetsv3SaveUpdateFilterTemplateRequest templateIdsList(List<String> templateIdsList) {
    this.templateIdsList = templateIdsList;
    return this;
  }

  public Assetsv3SaveUpdateFilterTemplateRequest addTemplateIdsListItem(String templateIdsListItem) {
    if (this.templateIdsList == null) {
      this.templateIdsList = new ArrayList<>();
    }
    this.templateIdsList.add(templateIdsListItem);
    return this;
  }

   /**
   * Get templateIdsList
   * @return templateIdsList
  **/
  @javax.annotation.Nullable
  public List<String> getTemplateIdsList() {
    return templateIdsList;
  }

  public void setTemplateIdsList(List<String> templateIdsList) {
    this.templateIdsList = templateIdsList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3SaveUpdateFilterTemplateRequest assetsv3SaveUpdateFilterTemplateRequest = (Assetsv3SaveUpdateFilterTemplateRequest) o;
    return Objects.equals(this.isDefault, assetsv3SaveUpdateFilterTemplateRequest.isDefault) &&
        Objects.equals(this.template, assetsv3SaveUpdateFilterTemplateRequest.template) &&
        Objects.equals(this.templateIdsList, assetsv3SaveUpdateFilterTemplateRequest.templateIdsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, template, templateIdsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3SaveUpdateFilterTemplateRequest {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateIdsList: ").append(toIndentedString(templateIdsList)).append("\n");
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
    openapiFields.add("is_default");
    openapiFields.add("template");
    openapiFields.add("template_ids_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3SaveUpdateFilterTemplateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3SaveUpdateFilterTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3SaveUpdateFilterTemplateRequest is not found in the empty JSON string", Assetsv3SaveUpdateFilterTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3SaveUpdateFilterTemplateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3SaveUpdateFilterTemplateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        Assetsv3FilterTemplate.validateJsonElement(jsonObj.get("template"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("template_ids_list") != null && !jsonObj.get("template_ids_list").isJsonNull() && !jsonObj.get("template_ids_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_ids_list` to be an array in the JSON string but got `%s`", jsonObj.get("template_ids_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3SaveUpdateFilterTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3SaveUpdateFilterTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3SaveUpdateFilterTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3SaveUpdateFilterTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3SaveUpdateFilterTemplateRequest>() {
           @Override
           public void write(JsonWriter out, Assetsv3SaveUpdateFilterTemplateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3SaveUpdateFilterTemplateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3SaveUpdateFilterTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3SaveUpdateFilterTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to Assetsv3SaveUpdateFilterTemplateRequest
  */
  public static Assetsv3SaveUpdateFilterTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3SaveUpdateFilterTemplateRequest.class);
  }

 /**
  * Convert an instance of Assetsv3SaveUpdateFilterTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

