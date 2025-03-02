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
import com.ibm.security.guardium.Schedulerv3RecipientType;
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

import com.ibm.security.JSON;

/**
 * Recipient includes the receiver data for this job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Schedulerv3Recipient {
  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integration_id";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Schedulerv3RecipientType type = Schedulerv3RecipientType.UNDEFINED_RECTYPE;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Schedulerv3Recipient() {
  }

  public Schedulerv3Recipient integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Optional: The integration unique id (configuration object id).
   * @return integrationId
  **/
  @javax.annotation.Nullable
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public Schedulerv3Recipient label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Schedulerv3Recipient templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Optional: Id of the template to use when sending e-mail.
   * @return templateId
  **/
  @javax.annotation.Nullable
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public Schedulerv3Recipient type(Schedulerv3RecipientType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Schedulerv3RecipientType getType() {
    return type;
  }

  public void setType(Schedulerv3RecipientType type) {
    this.type = type;
  }


  public Schedulerv3Recipient value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Who to assign as the report result reviewer.
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
    Schedulerv3Recipient schedulerv3Recipient = (Schedulerv3Recipient) o;
    return Objects.equals(this.integrationId, schedulerv3Recipient.integrationId) &&
        Objects.equals(this.label, schedulerv3Recipient.label) &&
        Objects.equals(this.templateId, schedulerv3Recipient.templateId) &&
        Objects.equals(this.type, schedulerv3Recipient.type) &&
        Objects.equals(this.value, schedulerv3Recipient.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, label, templateId, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedulerv3Recipient {\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("integration_id");
    openapiFields.add("label");
    openapiFields.add("template_id");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Schedulerv3Recipient
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Schedulerv3Recipient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Schedulerv3Recipient is not found in the empty JSON string", Schedulerv3Recipient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Schedulerv3Recipient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Schedulerv3Recipient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("integration_id") != null && !jsonObj.get("integration_id").isJsonNull()) && !jsonObj.get("integration_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integration_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integration_id").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonNull()) && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Schedulerv3RecipientType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Schedulerv3Recipient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Schedulerv3Recipient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Schedulerv3Recipient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Schedulerv3Recipient.class));

       return (TypeAdapter<T>) new TypeAdapter<Schedulerv3Recipient>() {
           @Override
           public void write(JsonWriter out, Schedulerv3Recipient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Schedulerv3Recipient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Schedulerv3Recipient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Schedulerv3Recipient
  * @throws IOException if the JSON string is invalid with respect to Schedulerv3Recipient
  */
  public static Schedulerv3Recipient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Schedulerv3Recipient.class);
  }

 /**
  * Convert an instance of Schedulerv3Recipient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

