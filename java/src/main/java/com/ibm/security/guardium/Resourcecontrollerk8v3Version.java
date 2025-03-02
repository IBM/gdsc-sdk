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
 * Version contains the version.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3Version {
  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private String major;

  public static final String SERIALIZED_NAME_MICRO = "micro";
  @SerializedName(SERIALIZED_NAME_MICRO)
  private String micro;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private String minor;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public Resourcecontrollerk8v3Version() {
  }

  public Resourcecontrollerk8v3Version build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Optional: The build number. This value is read-only.
   * @return build
  **/
  @javax.annotation.Nullable
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }


  public Resourcecontrollerk8v3Version major(String major) {
    this.major = major;
    return this;
  }

   /**
   * Optional: The major version. This value is read-only.
   * @return major
  **/
  @javax.annotation.Nullable
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }


  public Resourcecontrollerk8v3Version micro(String micro) {
    this.micro = micro;
    return this;
  }

   /**
   * Optional: The micro version. This value is read-only.
   * @return micro
  **/
  @javax.annotation.Nullable
  public String getMicro() {
    return micro;
  }

  public void setMicro(String micro) {
    this.micro = micro;
  }


  public Resourcecontrollerk8v3Version minor(String minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Optional: The minor version. This value is read-only.
   * @return minor
  **/
  @javax.annotation.Nullable
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }


  public Resourcecontrollerk8v3Version version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Optional: The string representation of the version.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3Version resourcecontrollerk8v3Version = (Resourcecontrollerk8v3Version) o;
    return Objects.equals(this.build, resourcecontrollerk8v3Version.build) &&
        Objects.equals(this.major, resourcecontrollerk8v3Version.major) &&
        Objects.equals(this.micro, resourcecontrollerk8v3Version.micro) &&
        Objects.equals(this.minor, resourcecontrollerk8v3Version.minor) &&
        Objects.equals(this.version, resourcecontrollerk8v3Version.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, major, micro, minor, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3Version {\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    micro: ").append(toIndentedString(micro)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("build");
    openapiFields.add("major");
    openapiFields.add("micro");
    openapiFields.add("minor");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3Version
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3Version.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3Version is not found in the empty JSON string", Resourcecontrollerk8v3Version.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3Version.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3Version` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if ((jsonObj.get("major") != null && !jsonObj.get("major").isJsonNull()) && !jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if ((jsonObj.get("micro") != null && !jsonObj.get("micro").isJsonNull()) && !jsonObj.get("micro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `micro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("micro").toString()));
      }
      if ((jsonObj.get("minor") != null && !jsonObj.get("minor").isJsonNull()) && !jsonObj.get("minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minor").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3Version.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3Version' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3Version> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3Version.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3Version>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3Version value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3Version read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3Version given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3Version
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3Version
  */
  public static Resourcecontrollerk8v3Version fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3Version.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3Version to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

