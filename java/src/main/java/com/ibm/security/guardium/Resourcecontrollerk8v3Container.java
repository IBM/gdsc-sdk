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
import com.ibm.security.guardium.Resourcecontrollerk8v3ContainerResources;
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
 * Container contains the information about a container image.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3Container {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_FULLY_QUALIFIED = "image_fully_qualified";
  @SerializedName(SERIALIZED_NAME_IMAGE_FULLY_QUALIFIED)
  private Boolean imageFullyQualified;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Resourcecontrollerk8v3ContainerResources resources;

  public Resourcecontrollerk8v3Container() {
  }

  public Resourcecontrollerk8v3Container image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The container image.
   * @return image
  **/
  @javax.annotation.Nullable
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public Resourcecontrollerk8v3Container imageFullyQualified(Boolean imageFullyQualified) {
    this.imageFullyQualified = imageFullyQualified;
    return this;
  }

   /**
   * Optional: Is the container image fully qualified? i.e. it contains the registry in the path. If this value is false, then the image will be assumed to come from the configured registry on the app controller. If unspecified, the value will remain unchanged.
   * @return imageFullyQualified
  **/
  @javax.annotation.Nullable
  public Boolean getImageFullyQualified() {
    return imageFullyQualified;
  }

  public void setImageFullyQualified(Boolean imageFullyQualified) {
    this.imageFullyQualified = imageFullyQualified;
  }


  public Resourcecontrollerk8v3Container resources(Resourcecontrollerk8v3ContainerResources resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public Resourcecontrollerk8v3ContainerResources getResources() {
    return resources;
  }

  public void setResources(Resourcecontrollerk8v3ContainerResources resources) {
    this.resources = resources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3Container resourcecontrollerk8v3Container = (Resourcecontrollerk8v3Container) o;
    return Objects.equals(this.image, resourcecontrollerk8v3Container.image) &&
        Objects.equals(this.imageFullyQualified, resourcecontrollerk8v3Container.imageFullyQualified) &&
        Objects.equals(this.resources, resourcecontrollerk8v3Container.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, imageFullyQualified, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3Container {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageFullyQualified: ").append(toIndentedString(imageFullyQualified)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("image_fully_qualified");
    openapiFields.add("resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3Container
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3Container.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3Container is not found in the empty JSON string", Resourcecontrollerk8v3Container.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3Container.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3Container` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        Resourcecontrollerk8v3ContainerResources.validateJsonElement(jsonObj.get("resources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3Container.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3Container' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3Container> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3Container.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3Container>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3Container value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3Container read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3Container given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3Container
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3Container
  */
  public static Resourcecontrollerk8v3Container fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3Container.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3Container to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

