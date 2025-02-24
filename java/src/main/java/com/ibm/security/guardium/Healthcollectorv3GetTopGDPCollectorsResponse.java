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
import com.ibm.security.guardium.Healthcollectorv3Usage;
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

import com.ibm.security.JSON;

/**
 * Healthcollectorv3GetTopGDPCollectorsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3GetTopGDPCollectorsResponse {
  public static final String SERIALIZED_NAME_TOP_GDP_COLLECTORS = "top_gdp_collectors";
  @SerializedName(SERIALIZED_NAME_TOP_GDP_COLLECTORS)
  private List<Healthcollectorv3Usage> topGdpCollectors = new ArrayList<>();

  public Healthcollectorv3GetTopGDPCollectorsResponse() {
  }

  public Healthcollectorv3GetTopGDPCollectorsResponse topGdpCollectors(List<Healthcollectorv3Usage> topGdpCollectors) {
    this.topGdpCollectors = topGdpCollectors;
    return this;
  }

  public Healthcollectorv3GetTopGDPCollectorsResponse addTopGdpCollectorsItem(Healthcollectorv3Usage topGdpCollectorsItem) {
    if (this.topGdpCollectors == null) {
      this.topGdpCollectors = new ArrayList<>();
    }
    this.topGdpCollectors.add(topGdpCollectorsItem);
    return this;
  }

   /**
   * Get topGdpCollectors
   * @return topGdpCollectors
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3Usage> getTopGdpCollectors() {
    return topGdpCollectors;
  }

  public void setTopGdpCollectors(List<Healthcollectorv3Usage> topGdpCollectors) {
    this.topGdpCollectors = topGdpCollectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3GetTopGDPCollectorsResponse healthcollectorv3GetTopGDPCollectorsResponse = (Healthcollectorv3GetTopGDPCollectorsResponse) o;
    return Objects.equals(this.topGdpCollectors, healthcollectorv3GetTopGDPCollectorsResponse.topGdpCollectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topGdpCollectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3GetTopGDPCollectorsResponse {\n");
    sb.append("    topGdpCollectors: ").append(toIndentedString(topGdpCollectors)).append("\n");
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
    openapiFields.add("top_gdp_collectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3GetTopGDPCollectorsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3GetTopGDPCollectorsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3GetTopGDPCollectorsResponse is not found in the empty JSON string", Healthcollectorv3GetTopGDPCollectorsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3GetTopGDPCollectorsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3GetTopGDPCollectorsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("top_gdp_collectors") != null && !jsonObj.get("top_gdp_collectors").isJsonNull()) {
        JsonArray jsonArraytopGdpCollectors = jsonObj.getAsJsonArray("top_gdp_collectors");
        if (jsonArraytopGdpCollectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("top_gdp_collectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `top_gdp_collectors` to be an array in the JSON string but got `%s`", jsonObj.get("top_gdp_collectors").toString()));
          }

          // validate the optional field `top_gdp_collectors` (array)
          for (int i = 0; i < jsonArraytopGdpCollectors.size(); i++) {
            Healthcollectorv3Usage.validateJsonElement(jsonArraytopGdpCollectors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3GetTopGDPCollectorsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3GetTopGDPCollectorsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3GetTopGDPCollectorsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3GetTopGDPCollectorsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3GetTopGDPCollectorsResponse>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3GetTopGDPCollectorsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3GetTopGDPCollectorsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3GetTopGDPCollectorsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3GetTopGDPCollectorsResponse
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3GetTopGDPCollectorsResponse
  */
  public static Healthcollectorv3GetTopGDPCollectorsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3GetTopGDPCollectorsResponse.class);
  }

 /**
  * Convert an instance of Healthcollectorv3GetTopGDPCollectorsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

