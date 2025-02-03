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
 * Request to update datamart exclusion list.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3UpdateDmExclusionRequest {
  public static final String SERIALIZED_NAME_DATAMART_LIST = "datamart_list";
  @SerializedName(SERIALIZED_NAME_DATAMART_LIST)
  private List<String> datamartList = new ArrayList<>();

  public Guardiumconnectorv3UpdateDmExclusionRequest() {
  }

  public Guardiumconnectorv3UpdateDmExclusionRequest datamartList(List<String> datamartList) {
    this.datamartList = datamartList;
    return this;
  }

  public Guardiumconnectorv3UpdateDmExclusionRequest addDatamartListItem(String datamartListItem) {
    if (this.datamartList == null) {
      this.datamartList = new ArrayList<>();
    }
    this.datamartList.add(datamartListItem);
    return this;
  }

   /**
   * List of datamarts.
   * @return datamartList
  **/
  @javax.annotation.Nullable
  public List<String> getDatamartList() {
    return datamartList;
  }

  public void setDatamartList(List<String> datamartList) {
    this.datamartList = datamartList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3UpdateDmExclusionRequest guardiumconnectorv3UpdateDmExclusionRequest = (Guardiumconnectorv3UpdateDmExclusionRequest) o;
    return Objects.equals(this.datamartList, guardiumconnectorv3UpdateDmExclusionRequest.datamartList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datamartList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3UpdateDmExclusionRequest {\n");
    sb.append("    datamartList: ").append(toIndentedString(datamartList)).append("\n");
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
    openapiFields.add("datamart_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3UpdateDmExclusionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3UpdateDmExclusionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3UpdateDmExclusionRequest is not found in the empty JSON string", Guardiumconnectorv3UpdateDmExclusionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3UpdateDmExclusionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3UpdateDmExclusionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("datamart_list") != null && !jsonObj.get("datamart_list").isJsonNull() && !jsonObj.get("datamart_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datamart_list` to be an array in the JSON string but got `%s`", jsonObj.get("datamart_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3UpdateDmExclusionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3UpdateDmExclusionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3UpdateDmExclusionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3UpdateDmExclusionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3UpdateDmExclusionRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3UpdateDmExclusionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3UpdateDmExclusionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3UpdateDmExclusionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3UpdateDmExclusionRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3UpdateDmExclusionRequest
  */
  public static Guardiumconnectorv3UpdateDmExclusionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3UpdateDmExclusionRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3UpdateDmExclusionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

