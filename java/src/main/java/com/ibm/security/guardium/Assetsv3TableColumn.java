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
 * Assetsv3TableColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3TableColumn {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_DEFAULT_ORDER = "default_order";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ORDER)
  private Integer defaultOrder;

  public static final String SERIALIZED_NAME_FIXED = "fixed";
  @SerializedName(SERIALIZED_NAME_FIXED)
  private Boolean fixed;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NLS_KEY = "nls_key";
  @SerializedName(SERIALIZED_NAME_NLS_KEY)
  private String nlsKey;

  public static final String SERIALIZED_NAME_SELECT = "select";
  @SerializedName(SERIALIZED_NAME_SELECT)
  private Boolean select;

  public Assetsv3TableColumn() {
  }

  public Assetsv3TableColumn _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public Assetsv3TableColumn defaultOrder(Integer defaultOrder) {
    this.defaultOrder = defaultOrder;
    return this;
  }

   /**
   * Get defaultOrder
   * @return defaultOrder
  **/
  @javax.annotation.Nullable
  public Integer getDefaultOrder() {
    return defaultOrder;
  }

  public void setDefaultOrder(Integer defaultOrder) {
    this.defaultOrder = defaultOrder;
  }


  public Assetsv3TableColumn fixed(Boolean fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Get fixed
   * @return fixed
  **/
  @javax.annotation.Nullable
  public Boolean getFixed() {
    return fixed;
  }

  public void setFixed(Boolean fixed) {
    this.fixed = fixed;
  }


  public Assetsv3TableColumn header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  public Assetsv3TableColumn id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Assetsv3TableColumn nlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
    return this;
  }

   /**
   * Get nlsKey
   * @return nlsKey
  **/
  @javax.annotation.Nullable
  public String getNlsKey() {
    return nlsKey;
  }

  public void setNlsKey(String nlsKey) {
    this.nlsKey = nlsKey;
  }


  public Assetsv3TableColumn select(Boolean select) {
    this.select = select;
    return this;
  }

   /**
   * Get select
   * @return select
  **/
  @javax.annotation.Nullable
  public Boolean getSelect() {
    return select;
  }

  public void setSelect(Boolean select) {
    this.select = select;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3TableColumn assetsv3TableColumn = (Assetsv3TableColumn) o;
    return Objects.equals(this._default, assetsv3TableColumn._default) &&
        Objects.equals(this.defaultOrder, assetsv3TableColumn.defaultOrder) &&
        Objects.equals(this.fixed, assetsv3TableColumn.fixed) &&
        Objects.equals(this.header, assetsv3TableColumn.header) &&
        Objects.equals(this.id, assetsv3TableColumn.id) &&
        Objects.equals(this.nlsKey, assetsv3TableColumn.nlsKey) &&
        Objects.equals(this.select, assetsv3TableColumn.select);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultOrder, fixed, header, id, nlsKey, select);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3TableColumn {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultOrder: ").append(toIndentedString(defaultOrder)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nlsKey: ").append(toIndentedString(nlsKey)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("default_order");
    openapiFields.add("fixed");
    openapiFields.add("header");
    openapiFields.add("id");
    openapiFields.add("nls_key");
    openapiFields.add("select");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3TableColumn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3TableColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3TableColumn is not found in the empty JSON string", Assetsv3TableColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3TableColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3TableColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) && !jsonObj.get("header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header").toString()));
      }
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
       if (!Assetsv3TableColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3TableColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3TableColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3TableColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3TableColumn>() {
           @Override
           public void write(JsonWriter out, Assetsv3TableColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3TableColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3TableColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3TableColumn
  * @throws IOException if the JSON string is invalid with respect to Assetsv3TableColumn
  */
  public static Assetsv3TableColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3TableColumn.class);
  }

 /**
  * Convert an instance of Assetsv3TableColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

