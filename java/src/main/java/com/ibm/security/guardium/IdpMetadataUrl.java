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
 * IdpMetadataUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class IdpMetadataUrl {
  public static final String SERIALIZED_NAME_IDP_METADATA_URL = "idpMetadataUrl";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_URL)
  private String idpMetadataUrl;

  public IdpMetadataUrl() {
  }

  public IdpMetadataUrl idpMetadataUrl(String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
    return this;
  }

   /**
   * Get idpMetadataUrl
   * @return idpMetadataUrl
  **/
  @javax.annotation.Nonnull
  public String getIdpMetadataUrl() {
    return idpMetadataUrl;
  }

  public void setIdpMetadataUrl(String idpMetadataUrl) {
    this.idpMetadataUrl = idpMetadataUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdpMetadataUrl idpMetadataUrl = (IdpMetadataUrl) o;
    return Objects.equals(this.idpMetadataUrl, idpMetadataUrl.idpMetadataUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpMetadataUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdpMetadataUrl {\n");
    sb.append("    idpMetadataUrl: ").append(toIndentedString(idpMetadataUrl)).append("\n");
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
    openapiFields.add("idpMetadataUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("idpMetadataUrl");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IdpMetadataUrl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdpMetadataUrl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdpMetadataUrl is not found in the empty JSON string", IdpMetadataUrl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IdpMetadataUrl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdpMetadataUrl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IdpMetadataUrl.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("idpMetadataUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idpMetadataUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idpMetadataUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdpMetadataUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdpMetadataUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdpMetadataUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdpMetadataUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<IdpMetadataUrl>() {
           @Override
           public void write(JsonWriter out, IdpMetadataUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdpMetadataUrl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdpMetadataUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdpMetadataUrl
  * @throws IOException if the JSON string is invalid with respect to IdpMetadataUrl
  */
  public static IdpMetadataUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdpMetadataUrl.class);
  }

 /**
  * Convert an instance of IdpMetadataUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

