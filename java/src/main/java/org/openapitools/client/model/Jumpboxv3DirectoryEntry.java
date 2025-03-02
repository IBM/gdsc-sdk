/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

import org.openapitools.client.JSON;

/**
 * DirectoryEntry message for ICP directory search result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Jumpboxv3DirectoryEntry {
  public static final String SERIALIZED_NAME_DIRECTORY_ID = "directory_id";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_ID)
  private String directoryId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DISTINGUISHED_NAME = "distinguished_name";
  @SerializedName(SERIALIZED_NAME_DISTINGUISHED_NAME)
  private String distinguishedName;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public Jumpboxv3DirectoryEntry() {
  }

  public Jumpboxv3DirectoryEntry directoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

   /**
   * Which directory did this user come from.
   * @return directoryId
  **/
  @javax.annotation.Nullable
  public String getDirectoryId() {
    return directoryId;
  }

  public void setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
  }


  public Jumpboxv3DirectoryEntry displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * LDAP cn.
   * @return displayName
  **/
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Jumpboxv3DirectoryEntry distinguishedName(String distinguishedName) {
    this.distinguishedName = distinguishedName;
    return this;
  }

   /**
   * LDAP dn&#x3D;  (needed to import user from LDAP into TenantUser).
   * @return distinguishedName
  **/
  @javax.annotation.Nullable
  public String getDistinguishedName() {
    return distinguishedName;
  }

  public void setDistinguishedName(String distinguishedName) {
    this.distinguishedName = distinguishedName;
  }


  public Jumpboxv3DirectoryEntry metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Jumpboxv3DirectoryEntry putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata will contain extra attributes returned from LDAP search.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jumpboxv3DirectoryEntry jumpboxv3DirectoryEntry = (Jumpboxv3DirectoryEntry) o;
    return Objects.equals(this.directoryId, jumpboxv3DirectoryEntry.directoryId) &&
        Objects.equals(this.displayName, jumpboxv3DirectoryEntry.displayName) &&
        Objects.equals(this.distinguishedName, jumpboxv3DirectoryEntry.distinguishedName) &&
        Objects.equals(this.metadata, jumpboxv3DirectoryEntry.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryId, displayName, distinguishedName, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3DirectoryEntry {\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("directory_id");
    openapiFields.add("display_name");
    openapiFields.add("distinguished_name");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3DirectoryEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3DirectoryEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3DirectoryEntry is not found in the empty JSON string", Jumpboxv3DirectoryEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3DirectoryEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3DirectoryEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("directory_id") != null && !jsonObj.get("directory_id").isJsonNull()) && !jsonObj.get("directory_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directory_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directory_id").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("distinguished_name") != null && !jsonObj.get("distinguished_name").isJsonNull()) && !jsonObj.get("distinguished_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distinguished_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distinguished_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3DirectoryEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3DirectoryEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3DirectoryEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3DirectoryEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3DirectoryEntry>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3DirectoryEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3DirectoryEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3DirectoryEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3DirectoryEntry
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3DirectoryEntry
  */
  public static Jumpboxv3DirectoryEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3DirectoryEntry.class);
  }

 /**
  * Convert an instance of Jumpboxv3DirectoryEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

