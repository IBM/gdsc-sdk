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
 * Connector header.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3ConnectorHeader {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_IS_EDITABLE = "is_editable";
  @SerializedName(SERIALIZED_NAME_IS_EDITABLE)
  private Boolean isEditable;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "is_hidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_NLS_KEY = "nls_key";
  @SerializedName(SERIALIZED_NAME_NLS_KEY)
  private String nlsKey;

  public Connectionsv3ConnectorHeader() {
  }

  public Connectionsv3ConnectorHeader id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The header id.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Connectionsv3ConnectorHeader isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is the header displayed by default.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public Connectionsv3ConnectorHeader isEditable(Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }

   /**
   * Is editable.
   * @return isEditable
  **/
  @javax.annotation.Nullable
  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }


  public Connectionsv3ConnectorHeader isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Visible in the UI.
   * @return isHidden
  **/
  @javax.annotation.Nullable
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public Connectionsv3ConnectorHeader nlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
    return this;
  }

   /**
   * The header nls_key.
   * @return nlsKey
  **/
  @javax.annotation.Nullable
  public String getNlsKey() {
    return nlsKey;
  }

  public void setNlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3ConnectorHeader connectionsv3ConnectorHeader = (Connectionsv3ConnectorHeader) o;
    return Objects.equals(this.id, connectionsv3ConnectorHeader.id) &&
        Objects.equals(this.isDefault, connectionsv3ConnectorHeader.isDefault) &&
        Objects.equals(this.isEditable, connectionsv3ConnectorHeader.isEditable) &&
        Objects.equals(this.isHidden, connectionsv3ConnectorHeader.isHidden) &&
        Objects.equals(this.nlsKey, connectionsv3ConnectorHeader.nlsKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDefault, isEditable, isHidden, nlsKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3ConnectorHeader {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    nlsKey: ").append(toIndentedString(nlsKey)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("is_default");
    openapiFields.add("is_editable");
    openapiFields.add("is_hidden");
    openapiFields.add("nls_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3ConnectorHeader
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3ConnectorHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3ConnectorHeader is not found in the empty JSON string", Connectionsv3ConnectorHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3ConnectorHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3ConnectorHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("nls_key") != null && !jsonObj.get("nls_key").isJsonNull()) && !jsonObj.get("nls_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nls_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nls_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3ConnectorHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3ConnectorHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3ConnectorHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3ConnectorHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3ConnectorHeader>() {
           @Override
           public void write(JsonWriter out, Connectionsv3ConnectorHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3ConnectorHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3ConnectorHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3ConnectorHeader
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3ConnectorHeader
  */
  public static Connectionsv3ConnectorHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3ConnectorHeader.class);
  }

 /**
  * Convert an instance of Connectionsv3ConnectorHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

