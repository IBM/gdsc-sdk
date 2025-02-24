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
import com.ibm.security.guardium.Assetsv3MappedEntities;
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
 * GetAssetTopologyResponse - Response to get list of topology for a parent asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3GetAssetTopologyResponse {
  public static final String SERIALIZED_NAME_MAPPED_ENTITIES = "mappedEntities";
  @SerializedName(SERIALIZED_NAME_MAPPED_ENTITIES)
  private Assetsv3MappedEntities mappedEntities;

  public Assetsv3GetAssetTopologyResponse() {
  }

  public Assetsv3GetAssetTopologyResponse mappedEntities(Assetsv3MappedEntities mappedEntities) {
    this.mappedEntities = mappedEntities;
    return this;
  }

   /**
   * Get mappedEntities
   * @return mappedEntities
  **/
  @javax.annotation.Nullable
  public Assetsv3MappedEntities getMappedEntities() {
    return mappedEntities;
  }

  public void setMappedEntities(Assetsv3MappedEntities mappedEntities) {
    this.mappedEntities = mappedEntities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3GetAssetTopologyResponse assetsv3GetAssetTopologyResponse = (Assetsv3GetAssetTopologyResponse) o;
    return Objects.equals(this.mappedEntities, assetsv3GetAssetTopologyResponse.mappedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3GetAssetTopologyResponse {\n");
    sb.append("    mappedEntities: ").append(toIndentedString(mappedEntities)).append("\n");
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
    openapiFields.add("mappedEntities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3GetAssetTopologyResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3GetAssetTopologyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3GetAssetTopologyResponse is not found in the empty JSON string", Assetsv3GetAssetTopologyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3GetAssetTopologyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3GetAssetTopologyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `mappedEntities`
      if (jsonObj.get("mappedEntities") != null && !jsonObj.get("mappedEntities").isJsonNull()) {
        Assetsv3MappedEntities.validateJsonElement(jsonObj.get("mappedEntities"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3GetAssetTopologyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3GetAssetTopologyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3GetAssetTopologyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3GetAssetTopologyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3GetAssetTopologyResponse>() {
           @Override
           public void write(JsonWriter out, Assetsv3GetAssetTopologyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3GetAssetTopologyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3GetAssetTopologyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3GetAssetTopologyResponse
  * @throws IOException if the JSON string is invalid with respect to Assetsv3GetAssetTopologyResponse
  */
  public static Assetsv3GetAssetTopologyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3GetAssetTopologyResponse.class);
  }

 /**
  * Convert an instance of Assetsv3GetAssetTopologyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

