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


package com.ibm.gdsc.sdk.models;

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

import com.ibm.gdsc.sdk.JSON;

/**
 * IdpMetadataContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class IdpMetadataContent {
  public static final String SERIALIZED_NAME_IDP_METADATA_CONTENT = "idpMetadataContent";
  @SerializedName(SERIALIZED_NAME_IDP_METADATA_CONTENT)
  private String idpMetadataContent;

  public IdpMetadataContent() {
  }

  public IdpMetadataContent idpMetadataContent(String idpMetadataContent) {
    this.idpMetadataContent = idpMetadataContent;
    return this;
  }

   /**
   * Get idpMetadataContent
   * @return idpMetadataContent
  **/
  @javax.annotation.Nonnull
  public String getIdpMetadataContent() {
    return idpMetadataContent;
  }

  public void setIdpMetadataContent(String idpMetadataContent) {
    this.idpMetadataContent = idpMetadataContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdpMetadataContent idpMetadataContent = (IdpMetadataContent) o;
    return Objects.equals(this.idpMetadataContent, idpMetadataContent.idpMetadataContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idpMetadataContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdpMetadataContent {\n");
    sb.append("    idpMetadataContent: ").append(toIndentedString(idpMetadataContent)).append("\n");
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
    openapiFields.add("idpMetadataContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("idpMetadataContent");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IdpMetadataContent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdpMetadataContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdpMetadataContent is not found in the empty JSON string", IdpMetadataContent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IdpMetadataContent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdpMetadataContent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IdpMetadataContent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("idpMetadataContent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idpMetadataContent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idpMetadataContent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdpMetadataContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdpMetadataContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdpMetadataContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdpMetadataContent.class));

       return (TypeAdapter<T>) new TypeAdapter<IdpMetadataContent>() {
           @Override
           public void write(JsonWriter out, IdpMetadataContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdpMetadataContent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdpMetadataContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdpMetadataContent
  * @throws IOException if the JSON string is invalid with respect to IdpMetadataContent
  */
  public static IdpMetadataContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdpMetadataContent.class);
  }

 /**
  * Convert an instance of IdpMetadataContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

