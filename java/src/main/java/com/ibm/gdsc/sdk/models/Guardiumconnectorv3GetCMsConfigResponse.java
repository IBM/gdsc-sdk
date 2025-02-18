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
import com.ibm.gdsc.sdk.models.Guardiumconnectorv3CM;
import com.ibm.gdsc.sdk.models.Guardiumconnectorv3StatusResponseBase;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * Retrieves the list of Central Managers registered to Guardium Insights.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GetCMsConfigResponse {
  public static final String SERIALIZED_NAME_CMS = "cms";
  @SerializedName(SERIALIZED_NAME_CMS)
  private List<Guardiumconnectorv3CM> cms = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Guardiumconnectorv3StatusResponseBase status;

  public Guardiumconnectorv3GetCMsConfigResponse() {
  }

  public Guardiumconnectorv3GetCMsConfigResponse cms(List<Guardiumconnectorv3CM> cms) {
    this.cms = cms;
    return this;
  }

  public Guardiumconnectorv3GetCMsConfigResponse addCmsItem(Guardiumconnectorv3CM cmsItem) {
    if (this.cms == null) {
      this.cms = new ArrayList<>();
    }
    this.cms.add(cmsItem);
    return this;
  }

   /**
   * List of Central Managers.
   * @return cms
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3CM> getCms() {
    return cms;
  }

  public void setCms(List<Guardiumconnectorv3CM> cms) {
    this.cms = cms;
  }


  public Guardiumconnectorv3GetCMsConfigResponse status(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Guardiumconnectorv3StatusResponseBase status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GetCMsConfigResponse guardiumconnectorv3GetCMsConfigResponse = (Guardiumconnectorv3GetCMsConfigResponse) o;
    return Objects.equals(this.cms, guardiumconnectorv3GetCMsConfigResponse.cms) &&
        Objects.equals(this.status, guardiumconnectorv3GetCMsConfigResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cms, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GetCMsConfigResponse {\n");
    sb.append("    cms: ").append(toIndentedString(cms)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cms");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GetCMsConfigResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GetCMsConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GetCMsConfigResponse is not found in the empty JSON string", Guardiumconnectorv3GetCMsConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GetCMsConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GetCMsConfigResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cms") != null && !jsonObj.get("cms").isJsonNull()) {
        JsonArray jsonArraycms = jsonObj.getAsJsonArray("cms");
        if (jsonArraycms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cms` to be an array in the JSON string but got `%s`", jsonObj.get("cms").toString()));
          }

          // validate the optional field `cms` (array)
          for (int i = 0; i < jsonArraycms.size(); i++) {
            Guardiumconnectorv3CM.validateJsonElement(jsonArraycms.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Guardiumconnectorv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3GetCMsConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GetCMsConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GetCMsConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GetCMsConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GetCMsConfigResponse>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GetCMsConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GetCMsConfigResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GetCMsConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GetCMsConfigResponse
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GetCMsConfigResponse
  */
  public static Guardiumconnectorv3GetCMsConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GetCMsConfigResponse.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GetCMsConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

