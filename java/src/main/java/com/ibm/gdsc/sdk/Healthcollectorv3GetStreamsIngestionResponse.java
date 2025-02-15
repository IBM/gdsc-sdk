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
 * Healthcollectorv3GetStreamsIngestionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3GetStreamsIngestionResponse {
  public static final String SERIALIZED_NAME_STREAMS_INGESTION = "streams_ingestion";
  @SerializedName(SERIALIZED_NAME_STREAMS_INGESTION)
  private List<Healthcollectorv3Usage> streamsIngestion = new ArrayList<>();

  public Healthcollectorv3GetStreamsIngestionResponse() {
  }

  public Healthcollectorv3GetStreamsIngestionResponse streamsIngestion(List<Healthcollectorv3Usage> streamsIngestion) {
    this.streamsIngestion = streamsIngestion;
    return this;
  }

  public Healthcollectorv3GetStreamsIngestionResponse addStreamsIngestionItem(Healthcollectorv3Usage streamsIngestionItem) {
    if (this.streamsIngestion == null) {
      this.streamsIngestion = new ArrayList<>();
    }
    this.streamsIngestion.add(streamsIngestionItem);
    return this;
  }

   /**
   * Get streamsIngestion
   * @return streamsIngestion
  **/
  @javax.annotation.Nullable
  public List<Healthcollectorv3Usage> getStreamsIngestion() {
    return streamsIngestion;
  }

  public void setStreamsIngestion(List<Healthcollectorv3Usage> streamsIngestion) {
    this.streamsIngestion = streamsIngestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3GetStreamsIngestionResponse healthcollectorv3GetStreamsIngestionResponse = (Healthcollectorv3GetStreamsIngestionResponse) o;
    return Objects.equals(this.streamsIngestion, healthcollectorv3GetStreamsIngestionResponse.streamsIngestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamsIngestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3GetStreamsIngestionResponse {\n");
    sb.append("    streamsIngestion: ").append(toIndentedString(streamsIngestion)).append("\n");
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
    openapiFields.add("streams_ingestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3GetStreamsIngestionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3GetStreamsIngestionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3GetStreamsIngestionResponse is not found in the empty JSON string", Healthcollectorv3GetStreamsIngestionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3GetStreamsIngestionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3GetStreamsIngestionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("streams_ingestion") != null && !jsonObj.get("streams_ingestion").isJsonNull()) {
        JsonArray jsonArraystreamsIngestion = jsonObj.getAsJsonArray("streams_ingestion");
        if (jsonArraystreamsIngestion != null) {
          // ensure the json data is an array
          if (!jsonObj.get("streams_ingestion").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `streams_ingestion` to be an array in the JSON string but got `%s`", jsonObj.get("streams_ingestion").toString()));
          }

          // validate the optional field `streams_ingestion` (array)
          for (int i = 0; i < jsonArraystreamsIngestion.size(); i++) {
            Healthcollectorv3Usage.validateJsonElement(jsonArraystreamsIngestion.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3GetStreamsIngestionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3GetStreamsIngestionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3GetStreamsIngestionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3GetStreamsIngestionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3GetStreamsIngestionResponse>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3GetStreamsIngestionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3GetStreamsIngestionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3GetStreamsIngestionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3GetStreamsIngestionResponse
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3GetStreamsIngestionResponse
  */
  public static Healthcollectorv3GetStreamsIngestionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3GetStreamsIngestionResponse.class);
  }

 /**
  * Convert an instance of Healthcollectorv3GetStreamsIngestionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

