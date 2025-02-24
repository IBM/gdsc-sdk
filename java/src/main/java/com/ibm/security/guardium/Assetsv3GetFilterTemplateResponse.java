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
 * GetFilterTemplateResponse - Get all filters query template as list.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3GetFilterTemplateResponse {
  public static final String SERIALIZED_NAME_HIDE_ASSETS_BANNER = "hide_assets_banner";
  @SerializedName(SERIALIZED_NAME_HIDE_ASSETS_BANNER)
  private Boolean hideAssetsBanner;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<Assetsv3FilterTemplate> templates = new ArrayList<>();

  public Assetsv3GetFilterTemplateResponse() {
  }

  public Assetsv3GetFilterTemplateResponse hideAssetsBanner(Boolean hideAssetsBanner) {
    this.hideAssetsBanner = hideAssetsBanner;
    return this;
  }

   /**
   * bool to control if asests banner is going to be hidden.
   * @return hideAssetsBanner
  **/
  @javax.annotation.Nullable
  public Boolean getHideAssetsBanner() {
    return hideAssetsBanner;
  }

  public void setHideAssetsBanner(Boolean hideAssetsBanner) {
    this.hideAssetsBanner = hideAssetsBanner;
  }


  public Assetsv3GetFilterTemplateResponse templates(List<Assetsv3FilterTemplate> templates) {
    this.templates = templates;
    return this;
  }

  public Assetsv3GetFilterTemplateResponse addTemplatesItem(Assetsv3FilterTemplate templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  public List<Assetsv3FilterTemplate> getTemplates() {
    return templates;
  }

  public void setTemplates(List<Assetsv3FilterTemplate> templates) {
    this.templates = templates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3GetFilterTemplateResponse assetsv3GetFilterTemplateResponse = (Assetsv3GetFilterTemplateResponse) o;
    return Objects.equals(this.hideAssetsBanner, assetsv3GetFilterTemplateResponse.hideAssetsBanner) &&
        Objects.equals(this.templates, assetsv3GetFilterTemplateResponse.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideAssetsBanner, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3GetFilterTemplateResponse {\n");
    sb.append("    hideAssetsBanner: ").append(toIndentedString(hideAssetsBanner)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
    openapiFields.add("hide_assets_banner");
    openapiFields.add("templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3GetFilterTemplateResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3GetFilterTemplateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3GetFilterTemplateResponse is not found in the empty JSON string", Assetsv3GetFilterTemplateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3GetFilterTemplateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3GetFilterTemplateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("templates") != null && !jsonObj.get("templates").isJsonNull()) {
        JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
        if (jsonArraytemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
          }

          // validate the optional field `templates` (array)
          for (int i = 0; i < jsonArraytemplates.size(); i++) {
            Assetsv3FilterTemplate.validateJsonElement(jsonArraytemplates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3GetFilterTemplateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3GetFilterTemplateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3GetFilterTemplateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3GetFilterTemplateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3GetFilterTemplateResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3GetFilterTemplateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3GetFilterTemplateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3GetFilterTemplateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3GetFilterTemplateResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3GetFilterTemplateResponse
  */
  public static Assetsv3GetFilterTemplateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3GetFilterTemplateResponse.class);
  }

 /**
  * Convert an instance of Assetsv3GetFilterTemplateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

