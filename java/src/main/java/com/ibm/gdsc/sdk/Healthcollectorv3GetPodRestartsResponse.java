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
import com.ibm.gdsc.sdk.Healthcollectorv3Usage;
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
 * Healthcollectorv3GetPodRestartsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3GetPodRestartsResponse {
  public static final String SERIALIZED_NAME_POD_RESTARTS = "pod_restarts";
  @SerializedName(SERIALIZED_NAME_POD_RESTARTS)
  private List<Healthcollectorv3Usage> podRestarts = new ArrayList<>();

  public Healthcollectorv3GetPodRestartsResponse() {
  }

  public Healthcollectorv3GetPodRestartsResponse podRestarts(List<Healthcollectorv3Usage> podRestarts) {
    this.podRestarts = podRestarts;
    return this;
  }

  public Healthcollectorv3GetPodRestartsResponse addPodRestartsItem(Healthcollectorv3Usage podRestartsItem) {
    if (this.podRestarts == null) {
      this.podRestarts = new ArrayList<>();
    }
    this.podRestarts.add(podRestartsItem);
    return this;
  }

   /**
   * Get podRestarts
   * @return podRestarts
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3Usage> getPodRestarts() {
    return podRestarts;
  }

  public void setPodRestarts(List<Healthcollectorv3Usage> podRestarts) {
    this.podRestarts = podRestarts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3GetPodRestartsResponse healthcollectorv3GetPodRestartsResponse = (Healthcollectorv3GetPodRestartsResponse) o;
    return Objects.equals(this.podRestarts, healthcollectorv3GetPodRestartsResponse.podRestarts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podRestarts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3GetPodRestartsResponse {\n");
    sb.append("    podRestarts: ").append(toIndentedString(podRestarts)).append("\n");
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
    openapiFields.add("pod_restarts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3GetPodRestartsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3GetPodRestartsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3GetPodRestartsResponse is not found in the empty JSON string", Healthcollectorv3GetPodRestartsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3GetPodRestartsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3GetPodRestartsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("pod_restarts") != null && !jsonObj.get("pod_restarts").isJsonNull()) {
        JsonArray jsonArraypodRestarts = jsonObj.getAsJsonArray("pod_restarts");
        if (jsonArraypodRestarts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pod_restarts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pod_restarts` to be an array in the JSON string but got `%s`", jsonObj.get("pod_restarts").toString()));
          }

          // validate the optional field `pod_restarts` (array)
          for (int i = 0; i < jsonArraypodRestarts.size(); i++) {
            Healthcollectorv3Usage.validateJsonElement(jsonArraypodRestarts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3GetPodRestartsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3GetPodRestartsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3GetPodRestartsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3GetPodRestartsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3GetPodRestartsResponse>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3GetPodRestartsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3GetPodRestartsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3GetPodRestartsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3GetPodRestartsResponse
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3GetPodRestartsResponse
  */
  public static Healthcollectorv3GetPodRestartsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3GetPodRestartsResponse.class);
  }

 /**
  * Convert an instance of Healthcollectorv3GetPodRestartsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

