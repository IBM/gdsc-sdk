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
import com.ibm.gdsc.sdk.Templatesv3Integration;
import com.ibm.gdsc.sdk.Templatesv3MIMEType;
import com.ibm.gdsc.sdk.Templatesv3Origin;
import com.ibm.gdsc.sdk.Templatesv3SimpleRecipient;
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

import com.ibm.gdsc.JSON;

/**
 * The contents of a specific template.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Templatesv3Template {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DEFAULT_RECIPIENT = "default_recipient";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RECIPIENT)
  private Templatesv3SimpleRecipient defaultRecipient;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private Templatesv3Integration integration = Templatesv3Integration.UNDEFINED_INTEGRATION;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integration_id";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_INTEGRATION_NAME = "integration_name";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_NAME)
  private String integrationName;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private Templatesv3MIMEType mimeType = Templatesv3MIMEType.PLAIN_TEXT;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private Templatesv3Origin origin = Templatesv3Origin.UNDEFINED_ORIGIN;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public Templatesv3Template() {
  }

  public Templatesv3Template content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content of the message with field substitution sequences.
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Templatesv3Template defaultRecipient(Templatesv3SimpleRecipient defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
    return this;
  }

   /**
   * Get defaultRecipient
   * @return defaultRecipient
  **/
  @javax.annotation.Nullable
  public Templatesv3SimpleRecipient getDefaultRecipient() {
    return defaultRecipient;
  }

  public void setDefaultRecipient(Templatesv3SimpleRecipient defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }


  public Templatesv3Template integration(Templatesv3Integration integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  public Templatesv3Integration getIntegration() {
    return integration;
  }

  public void setIntegration(Templatesv3Integration integration) {
    this.integration = integration;
  }


  public Templatesv3Template integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Integration ID specifies the specific integration this template is associated.
   * @return integrationId
  **/
  @javax.annotation.Nullable
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Templatesv3Template integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Name associated with the integration; optionally added based on need and performance.
   * @return integrationName
  **/
  @javax.annotation.Nullable
  public String getIntegrationName() {
    return integrationName;
  }

  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  public Templatesv3Template isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Specifies the default template for the associated data source.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public Templatesv3Template isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Enabled defines the set of templates that are actively used.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public Templatesv3Template mimeType(Templatesv3MIMEType mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nullable
  public Templatesv3MIMEType getMimeType() {
    return mimeType;
  }

  public void setMimeType(Templatesv3MIMEType mimeType) {
    this.mimeType = mimeType;
  }


  public Templatesv3Template name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User friendly name associated with the template.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Templatesv3Template order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Order by most significant origin.
   * @return order
  **/
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public Templatesv3Template origin(Templatesv3Origin origin) {
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


  public Templatesv3Template tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Templatesv3Template addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * User defined tags that can be used to filter templates.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Templatesv3Template templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template unique ID.
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public Templatesv3Template title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title is a brief summary of the data; may be empty based on integration type.
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
    Templatesv3Template templatesv3Template = (Templatesv3Template) o;
    return Objects.equals(this.content, templatesv3Template.content) &&
        Objects.equals(this.defaultRecipient, templatesv3Template.defaultRecipient) &&
        Objects.equals(this.integration, templatesv3Template.integration) &&
        Objects.equals(this.integrationId, templatesv3Template.integrationId) &&
        Objects.equals(this.integrationName, templatesv3Template.integrationName) &&
        Objects.equals(this.isDefault, templatesv3Template.isDefault) &&
        Objects.equals(this.isEnabled, templatesv3Template.isEnabled) &&
        Objects.equals(this.mimeType, templatesv3Template.mimeType) &&
        Objects.equals(this.name, templatesv3Template.name) &&
        Objects.equals(this.order, templatesv3Template.order) &&
        Objects.equals(this.origin, templatesv3Template.origin) &&
        Objects.equals(this.tags, templatesv3Template.tags) &&
        Objects.equals(this.templateId, templatesv3Template.templateId) &&
        Objects.equals(this.title, templatesv3Template.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, defaultRecipient, integration, integrationId, integrationName, isDefault, isEnabled, mimeType, name, order, origin, tags, templateId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templatesv3Template {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("default_recipient");
    openapiFields.add("integration");
    openapiFields.add("integration_id");
    openapiFields.add("integration_name");
    openapiFields.add("is_default");
    openapiFields.add("is_enabled");
    openapiFields.add("mime_type");
    openapiFields.add("name");
    openapiFields.add("order");
    openapiFields.add("origin");
    openapiFields.add("tags");
    openapiFields.add("template_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Templatesv3Template
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Templatesv3Template.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Templatesv3Template is not found in the empty JSON string", Templatesv3Template.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Templatesv3Template.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Templatesv3Template` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the optional field `default_recipient`
      if (jsonObj.get("default_recipient") != null && !jsonObj.get("default_recipient").isJsonNull()) {
        Templatesv3SimpleRecipient.validateJsonElement(jsonObj.get("default_recipient"));
      }
      // validate the optional field `integration`
      if (jsonObj.get("integration") != null && !jsonObj.get("integration").isJsonNull()) {
        Templatesv3Integration.validateJsonElement(jsonObj.get("integration"));
      }
      if ((jsonObj.get("integration_id") != null && !jsonObj.get("integration_id").isJsonNull()) && !jsonObj.get("integration_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_id").toString()));
      }
      if ((jsonObj.get("integration_name") != null && !jsonObj.get("integration_name").isJsonNull()) && !jsonObj.get("integration_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_name").toString()));
      }
      // validate the optional field `mime_type`
      if (jsonObj.get("mime_type") != null && !jsonObj.get("mime_type").isJsonNull()) {
        Templatesv3MIMEType.validateJsonElement(jsonObj.get("mime_type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `origin`
      if (jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) {
        Templatesv3Origin.validateJsonElement(jsonObj.get("origin"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Templatesv3Template.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Templatesv3Template' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Templatesv3Template> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Templatesv3Template.class));

       return (TypeAdapter<T>) new TypeAdapter<Templatesv3Template>() {
           @Override
           public void write(JsonWriter out, Templatesv3Template value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Templatesv3Template read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Templatesv3Template given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Templatesv3Template
  * @throws IOException if the JSON string is invalid with respect to Templatesv3Template
  */
  public static Templatesv3Template fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Templatesv3Template.class);
  }

 /**
  * Convert an instance of Templatesv3Template to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

