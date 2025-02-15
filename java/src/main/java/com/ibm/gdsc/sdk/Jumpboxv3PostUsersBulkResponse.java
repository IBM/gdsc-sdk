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
 * PostUsersBulkResponse message for POST v3/users api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Jumpboxv3PostUsersBulkResponse {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = new ArrayList<>();

  public Jumpboxv3PostUsersBulkResponse() {
  }

  public Jumpboxv3PostUsersBulkResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Path for user get.
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public Jumpboxv3PostUsersBulkResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * User creation message.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Jumpboxv3PostUsersBulkResponse userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Jumpboxv3PostUsersBulkResponse addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * List of created users.
   * @return userIds
  **/
  @javax.annotation.Nullable
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Jumpboxv3PostUsersBulkResponse jumpboxv3PostUsersBulkResponse = (Jumpboxv3PostUsersBulkResponse) o;
    return Objects.equals(this.location, jumpboxv3PostUsersBulkResponse.location) &&
        Objects.equals(this.message, jumpboxv3PostUsersBulkResponse.message) &&
        Objects.equals(this.userIds, jumpboxv3PostUsersBulkResponse.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, message, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Jumpboxv3PostUsersBulkResponse {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("message");
    openapiFields.add("user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Jumpboxv3PostUsersBulkResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Jumpboxv3PostUsersBulkResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Jumpboxv3PostUsersBulkResponse is not found in the empty JSON string", Jumpboxv3PostUsersBulkResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Jumpboxv3PostUsersBulkResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Jumpboxv3PostUsersBulkResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("user_ids") != null && !jsonObj.get("user_ids").isJsonNull() && !jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Jumpboxv3PostUsersBulkResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Jumpboxv3PostUsersBulkResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Jumpboxv3PostUsersBulkResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Jumpboxv3PostUsersBulkResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Jumpboxv3PostUsersBulkResponse>() {
           @Override
           public void write(JsonWriter out, Jumpboxv3PostUsersBulkResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Jumpboxv3PostUsersBulkResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Jumpboxv3PostUsersBulkResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Jumpboxv3PostUsersBulkResponse
  * @throws IOException if the JSON string is invalid with respect to Jumpboxv3PostUsersBulkResponse
  */
  public static Jumpboxv3PostUsersBulkResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Jumpboxv3PostUsersBulkResponse.class);
  }

 /**
  * Convert an instance of Jumpboxv3PostUsersBulkResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

