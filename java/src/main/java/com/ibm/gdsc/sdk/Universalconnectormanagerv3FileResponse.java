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
 * A file response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Universalconnectormanagerv3FileResponse {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private byte[] _file;

  public Universalconnectormanagerv3FileResponse() {
  }

  public Universalconnectormanagerv3FileResponse _file(byte[] _file) {
    this._file = _file;
    return this;
  }

   /**
   * File bytes.
   * @return _file
  **/
  @javax.annotation.Nullable
  public byte[] getFile() {
    return _file;
  }

  public void setFile(byte[] _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Universalconnectormanagerv3FileResponse universalconnectormanagerv3FileResponse = (Universalconnectormanagerv3FileResponse) o;
    return Arrays.equals(this._file, universalconnectormanagerv3FileResponse._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(_file));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Universalconnectormanagerv3FileResponse {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Universalconnectormanagerv3FileResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Universalconnectormanagerv3FileResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Universalconnectormanagerv3FileResponse is not found in the empty JSON string", Universalconnectormanagerv3FileResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Universalconnectormanagerv3FileResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Universalconnectormanagerv3FileResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Universalconnectormanagerv3FileResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Universalconnectormanagerv3FileResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Universalconnectormanagerv3FileResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Universalconnectormanagerv3FileResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Universalconnectormanagerv3FileResponse>() {
           @Override
           public void write(JsonWriter out, Universalconnectormanagerv3FileResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Universalconnectormanagerv3FileResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Universalconnectormanagerv3FileResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Universalconnectormanagerv3FileResponse
  * @throws IOException if the JSON string is invalid with respect to Universalconnectormanagerv3FileResponse
  */
  public static Universalconnectormanagerv3FileResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Universalconnectormanagerv3FileResponse.class);
  }

 /**
  * Convert an instance of Universalconnectormanagerv3FileResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

