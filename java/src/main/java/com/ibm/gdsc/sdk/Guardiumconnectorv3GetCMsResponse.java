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
import com.ibm.gdsc.sdk.Guardiumconnectorv3CM;
import com.ibm.gdsc.sdk.Guardiumconnectorv3StatusResponseBase;
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
 * Retrieves the list of Central Managers and number of Managed Units.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3GetCMsResponse {
  public static final String SERIALIZED_NAME_CMS = "cms";
  @SerializedName(SERIALIZED_NAME_CMS)
  private List<Guardiumconnectorv3CM> cms = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Guardiumconnectorv3StatusResponseBase status;

  public static final String SERIALIZED_NAME_TOTAL_MUS = "total_mus";
  @SerializedName(SERIALIZED_NAME_TOTAL_MUS)
  private Integer totalMus;

  public Guardiumconnectorv3GetCMsResponse() {
  }

  public Guardiumconnectorv3GetCMsResponse cms(List<Guardiumconnectorv3CM> cms) {
    this.cms = cms;
    return this;
  }

  public Guardiumconnectorv3GetCMsResponse addCmsItem(Guardiumconnectorv3CM cmsItem) {
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


  public Guardiumconnectorv3GetCMsResponse status(Guardiumconnectorv3StatusResponseBase status) {
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


  public Guardiumconnectorv3GetCMsResponse totalMus(Integer totalMus) {
    this.totalMus = totalMus;
    return this;
  }

   /**
   * Total list of Managed Units.
   * @return totalMus
  **/
  @javax.annotation.Nullable
  public Integer getTotalMus() {
    return totalMus;
  }

  public void setTotalMus(Integer totalMus) {
    this.totalMus = totalMus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3GetCMsResponse guardiumconnectorv3GetCMsResponse = (Guardiumconnectorv3GetCMsResponse) o;
    return Objects.equals(this.cms, guardiumconnectorv3GetCMsResponse.cms) &&
        Objects.equals(this.status, guardiumconnectorv3GetCMsResponse.status) &&
        Objects.equals(this.totalMus, guardiumconnectorv3GetCMsResponse.totalMus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cms, status, totalMus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3GetCMsResponse {\n");
    sb.append("    cms: ").append(toIndentedString(cms)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalMus: ").append(toIndentedString(totalMus)).append("\n");
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
    openapiFields.add("total_mus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3GetCMsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3GetCMsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3GetCMsResponse is not found in the empty JSON string", Guardiumconnectorv3GetCMsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3GetCMsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3GetCMsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!Guardiumconnectorv3GetCMsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3GetCMsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3GetCMsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3GetCMsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3GetCMsResponse>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3GetCMsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3GetCMsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3GetCMsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3GetCMsResponse
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3GetCMsResponse
  */
  public static Guardiumconnectorv3GetCMsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3GetCMsResponse.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3GetCMsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

