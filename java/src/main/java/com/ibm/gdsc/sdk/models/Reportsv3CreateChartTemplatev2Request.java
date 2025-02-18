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


package com.ibm.gdsc.sdk.models;

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

import com.ibm.gdsc.sdk.JSON;

/**
 * CreateChartTemplatev2Request is the argument for CreateChartTemplatev2() api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Reportsv3CreateChartTemplatev2Request {
  public static final String SERIALIZED_NAME_VEGA_DEFINITION = "vega_definition";
  @SerializedName(SERIALIZED_NAME_VEGA_DEFINITION)
  private String vegaDefinition;

  public Reportsv3CreateChartTemplatev2Request() {
  }

  public Reportsv3CreateChartTemplatev2Request vegaDefinition(String vegaDefinition) {
    this.vegaDefinition = vegaDefinition;
    return this;
  }

   /**
   * The VEGA chart template, as a stringified JSON.
   * @return vegaDefinition
  **/
  @javax.annotation.Nullable
  public String getVegaDefinition() {
    return vegaDefinition;
  }

  public void setVegaDefinition(String vegaDefinition) {
    this.vegaDefinition = vegaDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3CreateChartTemplatev2Request reportsv3CreateChartTemplatev2Request = (Reportsv3CreateChartTemplatev2Request) o;
    return Objects.equals(this.vegaDefinition, reportsv3CreateChartTemplatev2Request.vegaDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegaDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3CreateChartTemplatev2Request {\n");
    sb.append("    vegaDefinition: ").append(toIndentedString(vegaDefinition)).append("\n");
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
    openapiFields.add("vega_definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3CreateChartTemplatev2Request
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3CreateChartTemplatev2Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3CreateChartTemplatev2Request is not found in the empty JSON string", Reportsv3CreateChartTemplatev2Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3CreateChartTemplatev2Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3CreateChartTemplatev2Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vega_definition") != null && !jsonObj.get("vega_definition").isJsonNull()) && !jsonObj.get("vega_definition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vega_definition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vega_definition").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3CreateChartTemplatev2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3CreateChartTemplatev2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3CreateChartTemplatev2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3CreateChartTemplatev2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3CreateChartTemplatev2Request>() {
           @Override
           public void write(JsonWriter out, Reportsv3CreateChartTemplatev2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3CreateChartTemplatev2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3CreateChartTemplatev2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3CreateChartTemplatev2Request
  * @throws IOException if the JSON string is invalid with respect to Reportsv3CreateChartTemplatev2Request
  */
  public static Reportsv3CreateChartTemplatev2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3CreateChartTemplatev2Request.class);
  }

 /**
  * Convert an instance of Reportsv3CreateChartTemplatev2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

