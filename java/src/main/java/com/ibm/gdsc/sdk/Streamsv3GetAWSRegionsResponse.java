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
 * GetAWSRegionsResponse defines response of GetAWSRegionsRequest call.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Streamsv3GetAWSRegionsResponse {
  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private List<String> region = new ArrayList<>();

  public Streamsv3GetAWSRegionsResponse() {
  }

  public Streamsv3GetAWSRegionsResponse region(List<String> region) {
    this.region = region;
    return this;
  }

  public Streamsv3GetAWSRegionsResponse addRegionItem(String regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<>();
    }
    this.region.add(regionItem);
    return this;
  }

   /**
   * Array of regions.
   * @return region
  **/
  @javax.annotation.Nullable
  public List<String> getRegion() {
    return region;
  }

  public void setRegion(List<String> region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Streamsv3GetAWSRegionsResponse streamsv3GetAWSRegionsResponse = (Streamsv3GetAWSRegionsResponse) o;
    return Objects.equals(this.region, streamsv3GetAWSRegionsResponse.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Streamsv3GetAWSRegionsResponse {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Streamsv3GetAWSRegionsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Streamsv3GetAWSRegionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Streamsv3GetAWSRegionsResponse is not found in the empty JSON string", Streamsv3GetAWSRegionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Streamsv3GetAWSRegionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Streamsv3GetAWSRegionsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull() && !jsonObj.get("region").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be an array in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Streamsv3GetAWSRegionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Streamsv3GetAWSRegionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Streamsv3GetAWSRegionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Streamsv3GetAWSRegionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Streamsv3GetAWSRegionsResponse>() {
           @Override
           public void write(JsonWriter out, Streamsv3GetAWSRegionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Streamsv3GetAWSRegionsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Streamsv3GetAWSRegionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Streamsv3GetAWSRegionsResponse
  * @throws IOException if the JSON string is invalid with respect to Streamsv3GetAWSRegionsResponse
  */
  public static Streamsv3GetAWSRegionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Streamsv3GetAWSRegionsResponse.class);
  }

 /**
  * Convert an instance of Streamsv3GetAWSRegionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

