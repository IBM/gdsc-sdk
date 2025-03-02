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
import com.ibm.security.guardium.Guardiumconnectorv3GeneralDetailsObject;
import com.ibm.security.guardium.Guardiumconnectorv3InspectionEngineDetails;
import com.ibm.security.guardium.Guardiumconnectorv3StapLiveInfoObject;
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
 * Additional information for an S-TAP.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3StapDetailsObject {
  public static final String SERIALIZED_NAME_CONNECTIVITY_DETAILS = "connectivity_details";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_DETAILS)
  private Guardiumconnectorv3GeneralDetailsObject connectivityDetails;

  public static final String SERIALIZED_NAME_GENERAL_ERR_MESSAGES = "general_err_messages";
  @SerializedName(SERIALIZED_NAME_GENERAL_ERR_MESSAGES)
  private List<String> generalErrMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_KTAP_DETAILS = "ktap_details";
  @SerializedName(SERIALIZED_NAME_KTAP_DETAILS)
  private Guardiumconnectorv3GeneralDetailsObject ktapDetails;

  public static final String SERIALIZED_NAME_STAP_LIVELINESS_INFO = "stap_liveliness_info";
  @SerializedName(SERIALIZED_NAME_STAP_LIVELINESS_INFO)
  private Guardiumconnectorv3StapLiveInfoObject stapLivelinessInfo;

  public static final String SERIALIZED_NAME_STAP_VER_INFO_LIST = "stap_ver_info_list";
  @SerializedName(SERIALIZED_NAME_STAP_VER_INFO_LIST)
  private List<Guardiumconnectorv3InspectionEngineDetails> stapVerInfoList = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRAFFIC_DETAILS = "traffic_details";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_DETAILS)
  private Guardiumconnectorv3GeneralDetailsObject trafficDetails;

  public Guardiumconnectorv3StapDetailsObject() {
  }

  public Guardiumconnectorv3StapDetailsObject connectivityDetails(Guardiumconnectorv3GeneralDetailsObject connectivityDetails) {
    this.connectivityDetails = connectivityDetails;
    return this;
  }

   /**
   * Get connectivityDetails
   * @return connectivityDetails
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3GeneralDetailsObject getConnectivityDetails() {
    return connectivityDetails;
  }

  public void setConnectivityDetails(Guardiumconnectorv3GeneralDetailsObject connectivityDetails) {
    this.connectivityDetails = connectivityDetails;
  }


  public Guardiumconnectorv3StapDetailsObject generalErrMessages(List<String> generalErrMessages) {
    this.generalErrMessages = generalErrMessages;
    return this;
  }

  public Guardiumconnectorv3StapDetailsObject addGeneralErrMessagesItem(String generalErrMessagesItem) {
    if (this.generalErrMessages == null) {
      this.generalErrMessages = new ArrayList<>();
    }
    this.generalErrMessages.add(generalErrMessagesItem);
    return this;
  }

   /**
   * General error messages.
   * @return generalErrMessages
  **/
  @javax.annotation.Nullable
  public List<String> getGeneralErrMessages() {
    return generalErrMessages;
  }

  public void setGeneralErrMessages(List<String> generalErrMessages) {
    this.generalErrMessages = generalErrMessages;
  }


  public Guardiumconnectorv3StapDetailsObject ktapDetails(Guardiumconnectorv3GeneralDetailsObject ktapDetails) {
    this.ktapDetails = ktapDetails;
    return this;
  }

   /**
   * Get ktapDetails
   * @return ktapDetails
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3GeneralDetailsObject getKtapDetails() {
    return ktapDetails;
  }

  public void setKtapDetails(Guardiumconnectorv3GeneralDetailsObject ktapDetails) {
    this.ktapDetails = ktapDetails;
  }


  public Guardiumconnectorv3StapDetailsObject stapLivelinessInfo(Guardiumconnectorv3StapLiveInfoObject stapLivelinessInfo) {
    this.stapLivelinessInfo = stapLivelinessInfo;
    return this;
  }

   /**
   * Get stapLivelinessInfo
   * @return stapLivelinessInfo
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3StapLiveInfoObject getStapLivelinessInfo() {
    return stapLivelinessInfo;
  }

  public void setStapLivelinessInfo(Guardiumconnectorv3StapLiveInfoObject stapLivelinessInfo) {
    this.stapLivelinessInfo = stapLivelinessInfo;
  }


  public Guardiumconnectorv3StapDetailsObject stapVerInfoList(List<Guardiumconnectorv3InspectionEngineDetails> stapVerInfoList) {
    this.stapVerInfoList = stapVerInfoList;
    return this;
  }

  public Guardiumconnectorv3StapDetailsObject addStapVerInfoListItem(Guardiumconnectorv3InspectionEngineDetails stapVerInfoListItem) {
    if (this.stapVerInfoList == null) {
      this.stapVerInfoList = new ArrayList<>();
    }
    this.stapVerInfoList.add(stapVerInfoListItem);
    return this;
  }

   /**
   * Inspection engine details.
   * @return stapVerInfoList
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3InspectionEngineDetails> getStapVerInfoList() {
    return stapVerInfoList;
  }

  public void setStapVerInfoList(List<Guardiumconnectorv3InspectionEngineDetails> stapVerInfoList) {
    this.stapVerInfoList = stapVerInfoList;
  }


  public Guardiumconnectorv3StapDetailsObject trafficDetails(Guardiumconnectorv3GeneralDetailsObject trafficDetails) {
    this.trafficDetails = trafficDetails;
    return this;
  }

   /**
   * Get trafficDetails
   * @return trafficDetails
  **/
  @javax.annotation.Nullable
  public Guardiumconnectorv3GeneralDetailsObject getTrafficDetails() {
    return trafficDetails;
  }

  public void setTrafficDetails(Guardiumconnectorv3GeneralDetailsObject trafficDetails) {
    this.trafficDetails = trafficDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3StapDetailsObject guardiumconnectorv3StapDetailsObject = (Guardiumconnectorv3StapDetailsObject) o;
    return Objects.equals(this.connectivityDetails, guardiumconnectorv3StapDetailsObject.connectivityDetails) &&
        Objects.equals(this.generalErrMessages, guardiumconnectorv3StapDetailsObject.generalErrMessages) &&
        Objects.equals(this.ktapDetails, guardiumconnectorv3StapDetailsObject.ktapDetails) &&
        Objects.equals(this.stapLivelinessInfo, guardiumconnectorv3StapDetailsObject.stapLivelinessInfo) &&
        Objects.equals(this.stapVerInfoList, guardiumconnectorv3StapDetailsObject.stapVerInfoList) &&
        Objects.equals(this.trafficDetails, guardiumconnectorv3StapDetailsObject.trafficDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityDetails, generalErrMessages, ktapDetails, stapLivelinessInfo, stapVerInfoList, trafficDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3StapDetailsObject {\n");
    sb.append("    connectivityDetails: ").append(toIndentedString(connectivityDetails)).append("\n");
    sb.append("    generalErrMessages: ").append(toIndentedString(generalErrMessages)).append("\n");
    sb.append("    ktapDetails: ").append(toIndentedString(ktapDetails)).append("\n");
    sb.append("    stapLivelinessInfo: ").append(toIndentedString(stapLivelinessInfo)).append("\n");
    sb.append("    stapVerInfoList: ").append(toIndentedString(stapVerInfoList)).append("\n");
    sb.append("    trafficDetails: ").append(toIndentedString(trafficDetails)).append("\n");
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
    openapiFields.add("connectivity_details");
    openapiFields.add("general_err_messages");
    openapiFields.add("ktap_details");
    openapiFields.add("stap_liveliness_info");
    openapiFields.add("stap_ver_info_list");
    openapiFields.add("traffic_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3StapDetailsObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3StapDetailsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3StapDetailsObject is not found in the empty JSON string", Guardiumconnectorv3StapDetailsObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3StapDetailsObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3StapDetailsObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `connectivity_details`
      if (jsonObj.get("connectivity_details") != null && !jsonObj.get("connectivity_details").isJsonNull()) {
        Guardiumconnectorv3GeneralDetailsObject.validateJsonElement(jsonObj.get("connectivity_details"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("general_err_messages") != null && !jsonObj.get("general_err_messages").isJsonNull() && !jsonObj.get("general_err_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `general_err_messages` to be an array in the JSON string but got `%s`", jsonObj.get("general_err_messages").toString()));
      }
      // validate the optional field `ktap_details`
      if (jsonObj.get("ktap_details") != null && !jsonObj.get("ktap_details").isJsonNull()) {
        Guardiumconnectorv3GeneralDetailsObject.validateJsonElement(jsonObj.get("ktap_details"));
      }
      // validate the optional field `stap_liveliness_info`
      if (jsonObj.get("stap_liveliness_info") != null && !jsonObj.get("stap_liveliness_info").isJsonNull()) {
        Guardiumconnectorv3StapLiveInfoObject.validateJsonElement(jsonObj.get("stap_liveliness_info"));
      }
      if (jsonObj.get("stap_ver_info_list") != null && !jsonObj.get("stap_ver_info_list").isJsonNull()) {
        JsonArray jsonArraystapVerInfoList = jsonObj.getAsJsonArray("stap_ver_info_list");
        if (jsonArraystapVerInfoList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stap_ver_info_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stap_ver_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("stap_ver_info_list").toString()));
          }

          // validate the optional field `stap_ver_info_list` (array)
          for (int i = 0; i < jsonArraystapVerInfoList.size(); i++) {
            Guardiumconnectorv3InspectionEngineDetails.validateJsonElement(jsonArraystapVerInfoList.get(i));
          };
        }
      }
      // validate the optional field `traffic_details`
      if (jsonObj.get("traffic_details") != null && !jsonObj.get("traffic_details").isJsonNull()) {
        Guardiumconnectorv3GeneralDetailsObject.validateJsonElement(jsonObj.get("traffic_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3StapDetailsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3StapDetailsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3StapDetailsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3StapDetailsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3StapDetailsObject>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3StapDetailsObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3StapDetailsObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3StapDetailsObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3StapDetailsObject
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3StapDetailsObject
  */
  public static Guardiumconnectorv3StapDetailsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3StapDetailsObject.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3StapDetailsObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

