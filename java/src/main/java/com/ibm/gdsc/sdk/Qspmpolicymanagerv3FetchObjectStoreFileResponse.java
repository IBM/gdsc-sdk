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
 * Qspmpolicymanagerv3FetchObjectStoreFileResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmpolicymanagerv3FetchObjectStoreFileResponse {
  public static final String SERIALIZED_NAME_BUCKET_NAME = "BucketName";
  @SerializedName(SERIALIZED_NAME_BUCKET_NAME)
  private String bucketName;

  public static final String SERIALIZED_NAME_FOLDER_NAME = "FolderName";
  @SerializedName(SERIALIZED_NAME_FOLDER_NAME)
  private String folderName;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private List<String> fileName = new ArrayList<>();

  public Qspmpolicymanagerv3FetchObjectStoreFileResponse() {
  }

  public Qspmpolicymanagerv3FetchObjectStoreFileResponse bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @javax.annotation.Nullable
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  public Qspmpolicymanagerv3FetchObjectStoreFileResponse folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

   /**
   * Get folderName
   * @return folderName
  **/
  @javax.annotation.Nullable
  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }


  public Qspmpolicymanagerv3FetchObjectStoreFileResponse fileName(List<String> fileName) {
    this.fileName = fileName;
    return this;
  }

  public Qspmpolicymanagerv3FetchObjectStoreFileResponse addFileNameItem(String fileNameItem) {
    if (this.fileName == null) {
      this.fileName = new ArrayList<>();
    }
    this.fileName.add(fileNameItem);
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  public List<String> getFileName() {
    return fileName;
  }

  public void setFileName(List<String> fileName) {
    this.fileName = fileName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpolicymanagerv3FetchObjectStoreFileResponse qspmpolicymanagerv3FetchObjectStoreFileResponse = (Qspmpolicymanagerv3FetchObjectStoreFileResponse) o;
    return Objects.equals(this.bucketName, qspmpolicymanagerv3FetchObjectStoreFileResponse.bucketName) &&
        Objects.equals(this.folderName, qspmpolicymanagerv3FetchObjectStoreFileResponse.folderName) &&
        Objects.equals(this.fileName, qspmpolicymanagerv3FetchObjectStoreFileResponse.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, folderName, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpolicymanagerv3FetchObjectStoreFileResponse {\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
    openapiFields.add("BucketName");
    openapiFields.add("FolderName");
    openapiFields.add("fileName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpolicymanagerv3FetchObjectStoreFileResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpolicymanagerv3FetchObjectStoreFileResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpolicymanagerv3FetchObjectStoreFileResponse is not found in the empty JSON string", Qspmpolicymanagerv3FetchObjectStoreFileResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpolicymanagerv3FetchObjectStoreFileResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpolicymanagerv3FetchObjectStoreFileResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("BucketName") != null && !jsonObj.get("BucketName").isJsonNull()) && !jsonObj.get("BucketName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BucketName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BucketName").toString()));
      }
      if ((jsonObj.get("FolderName") != null && !jsonObj.get("FolderName").isJsonNull()) && !jsonObj.get("FolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FolderName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull() && !jsonObj.get("fileName").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be an array in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpolicymanagerv3FetchObjectStoreFileResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpolicymanagerv3FetchObjectStoreFileResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpolicymanagerv3FetchObjectStoreFileResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpolicymanagerv3FetchObjectStoreFileResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpolicymanagerv3FetchObjectStoreFileResponse>() {
           @Override
           public void write(JsonWriter out, Qspmpolicymanagerv3FetchObjectStoreFileResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpolicymanagerv3FetchObjectStoreFileResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpolicymanagerv3FetchObjectStoreFileResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpolicymanagerv3FetchObjectStoreFileResponse
  * @throws IOException if the JSON string is invalid with respect to Qspmpolicymanagerv3FetchObjectStoreFileResponse
  */
  public static Qspmpolicymanagerv3FetchObjectStoreFileResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpolicymanagerv3FetchObjectStoreFileResponse.class);
  }

 /**
  * Convert an instance of Qspmpolicymanagerv3FetchObjectStoreFileResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

