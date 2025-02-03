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
 * ResetModelToDefaultsResponse message for the ResetModelToDefaults api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse() {
  }

  public Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Response message.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse riskanalyticsmlclassificationv3ResetModelToDefaultsResponse = (Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse) o;
    return Objects.equals(this.message, riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse is not found in the empty JSON string", Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse
  */
  public static Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

