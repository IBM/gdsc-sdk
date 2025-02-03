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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Connectionsv3DataSource;

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
 * Connectionsv3GetDataSourcesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3GetDataSourcesResponse {
  public static final String SERIALIZED_NAME_DATA_SOURCES = "data_sources";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCES)
  private List<Connectionsv3DataSource> dataSources = new ArrayList<>();

  public Connectionsv3GetDataSourcesResponse() {
  }

  public Connectionsv3GetDataSourcesResponse dataSources(List<Connectionsv3DataSource> dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  public Connectionsv3GetDataSourcesResponse addDataSourcesItem(Connectionsv3DataSource dataSourcesItem) {
    if (this.dataSources == null) {
      this.dataSources = new ArrayList<>();
    }
    this.dataSources.add(dataSourcesItem);
    return this;
  }

   /**
   * Get dataSources
   * @return dataSources
  **/
  @javax.annotation.Nullable
  public List<Connectionsv3DataSource> getDataSources() {
    return dataSources;
  }

  public void setDataSources(List<Connectionsv3DataSource> dataSources) {
    this.dataSources = dataSources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3GetDataSourcesResponse connectionsv3GetDataSourcesResponse = (Connectionsv3GetDataSourcesResponse) o;
    return Objects.equals(this.dataSources, connectionsv3GetDataSourcesResponse.dataSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3GetDataSourcesResponse {\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
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
    openapiFields.add("data_sources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3GetDataSourcesResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3GetDataSourcesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3GetDataSourcesResponse is not found in the empty JSON string", Connectionsv3GetDataSourcesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3GetDataSourcesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3GetDataSourcesResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data_sources") != null && !jsonObj.get("data_sources").isJsonNull()) {
        JsonArray jsonArraydataSources = jsonObj.getAsJsonArray("data_sources");
        if (jsonArraydataSources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data_sources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data_sources` to be an array in the JSON string but got `%s`", jsonObj.get("data_sources").toString()));
          }

          // validate the optional field `data_sources` (array)
          for (int i = 0; i < jsonArraydataSources.size(); i++) {
            Connectionsv3DataSource.validateJsonElement(jsonArraydataSources.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3GetDataSourcesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3GetDataSourcesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3GetDataSourcesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3GetDataSourcesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3GetDataSourcesResponse>() {
           @Override
           public void write(JsonWriter out, Connectionsv3GetDataSourcesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3GetDataSourcesResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3GetDataSourcesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3GetDataSourcesResponse
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3GetDataSourcesResponse
  */
  public static Connectionsv3GetDataSourcesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3GetDataSourcesResponse.class);
  }

 /**
  * Convert an instance of Connectionsv3GetDataSourcesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

