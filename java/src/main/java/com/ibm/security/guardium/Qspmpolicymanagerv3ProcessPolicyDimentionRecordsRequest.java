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
 * Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest {
  public static final String SERIALIZED_NAME_PROVISON_ID_LIST = "ProvisonIdList";
  @SerializedName(SERIALIZED_NAME_PROVISON_ID_LIST)
  private List<String> provisonIdList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCAN_ID_LIST = "ScanIdList";
  @SerializedName(SERIALIZED_NAME_SCAN_ID_LIST)
  private List<String> scanIdList = new ArrayList<>();

  public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest() {
  }

  public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest provisonIdList(List<String> provisonIdList) {
    this.provisonIdList = provisonIdList;
    return this;
  }

  public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest addProvisonIdListItem(String provisonIdListItem) {
    if (this.provisonIdList == null) {
      this.provisonIdList = new ArrayList<>();
    }
    this.provisonIdList.add(provisonIdListItem);
    return this;
  }

   /**
   * Get provisonIdList
   * @return provisonIdList
  **/
  @javax.annotation.Nullable
  public List<String> getProvisonIdList() {
    return provisonIdList;
  }

  public void setProvisonIdList(List<String> provisonIdList) {
    this.provisonIdList = provisonIdList;
  }


  public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest scanIdList(List<String> scanIdList) {
    this.scanIdList = scanIdList;
    return this;
  }

  public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest addScanIdListItem(String scanIdListItem) {
    if (this.scanIdList == null) {
      this.scanIdList = new ArrayList<>();
    }
    this.scanIdList.add(scanIdListItem);
    return this;
  }

   /**
   * Get scanIdList
   * @return scanIdList
  **/
  @javax.annotation.Nullable
  public List<String> getScanIdList() {
    return scanIdList;
  }

  public void setScanIdList(List<String> scanIdList) {
    this.scanIdList = scanIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest = (Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest) o;
    return Objects.equals(this.provisonIdList, qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.provisonIdList) &&
        Objects.equals(this.scanIdList, qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.scanIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisonIdList, scanIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest {\n");
    sb.append("    provisonIdList: ").append(toIndentedString(provisonIdList)).append("\n");
    sb.append("    scanIdList: ").append(toIndentedString(scanIdList)).append("\n");
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
    openapiFields.add("ProvisonIdList");
    openapiFields.add("ScanIdList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest is not found in the empty JSON string", Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ProvisonIdList") != null && !jsonObj.get("ProvisonIdList").isJsonNull() && !jsonObj.get("ProvisonIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProvisonIdList` to be an array in the JSON string but got `%s`", jsonObj.get("ProvisonIdList").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ScanIdList") != null && !jsonObj.get("ScanIdList").isJsonNull() && !jsonObj.get("ScanIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ScanIdList` to be an array in the JSON string but got `%s`", jsonObj.get("ScanIdList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest>() {
           @Override
           public void write(JsonWriter out, Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
  * @throws IOException if the JSON string is invalid with respect to Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
  */
  public static Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.class);
  }

 /**
  * Convert an instance of Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

