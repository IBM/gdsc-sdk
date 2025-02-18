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
 * PutActivityRecord creates an activity log record.  All fields are optional.  Specified fields will be used to included in the persisted ActivityRecord.  If no fields are specified then no activity log record is persisted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Auditv3PutActivityRecordRequest {
  public static final String SERIALIZED_NAME_ACTION_TAKEN = "action_taken";
  @SerializedName(SERIALIZED_NAME_ACTION_TAKEN)
  private String actionTaken;

  public static final String SERIALIZED_NAME_CHANGES_MADE = "changes_made";
  @SerializedName(SERIALIZED_NAME_CHANGES_MADE)
  private String changesMade;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private String context;

  public static final String SERIALIZED_NAME_CONTEXT_DESCRIPTION = "context_description";
  @SerializedName(SERIALIZED_NAME_CONTEXT_DESCRIPTION)
  private String contextDescription;

  public static final String SERIALIZED_NAME_PERFORMED_BY = "performed_by";
  @SerializedName(SERIALIZED_NAME_PERFORMED_BY)
  private String performedBy;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public Auditv3PutActivityRecordRequest() {
  }

  public Auditv3PutActivityRecordRequest actionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
    return this;
  }

   /**
   * The operation associated with the persisted Activity record (CRUD or other).
   * @return actionTaken
  **/
  @javax.annotation.Nullable
  public String getActionTaken() {
    return actionTaken;
  }

  public void setActionTaken(String actionTaken) {
    this.actionTaken = actionTaken;
  }


  public Auditv3PutActivityRecordRequest changesMade(String changesMade) {
    this.changesMade = changesMade;
    return this;
  }

   /**
   * The reason the operation was performed (details about the operation).
   * @return changesMade
  **/
  @javax.annotation.Nullable
  public String getChangesMade() {
    return changesMade;
  }

  public void setChangesMade(String changesMade) {
    this.changesMade = changesMade;
  }


  public Auditv3PutActivityRecordRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The service/collection on which the operation was performed.
   * @return context
  **/
  @javax.annotation.Nullable
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  public Auditv3PutActivityRecordRequest contextDescription(String contextDescription) {
    this.contextDescription = contextDescription;
    return this;
  }

   /**
   * The label of the Activity record.
   * @return contextDescription
  **/
  @javax.annotation.Nullable
  public String getContextDescription() {
    return contextDescription;
  }

  public void setContextDescription(String contextDescription) {
    this.contextDescription = contextDescription;
  }


  public Auditv3PutActivityRecordRequest performedBy(String performedBy) {
    this.performedBy = performedBy;
    return this;
  }

   /**
   * The user id of the active user at the time the action was performed.
   * @return performedBy
  **/
  @javax.annotation.Nullable
  public String getPerformedBy() {
    return performedBy;
  }

  public void setPerformedBy(String performedBy) {
    this.performedBy = performedBy;
  }


  public Auditv3PutActivityRecordRequest uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * The record ID with the persisted Activity record.
   * @return uid
  **/
  @javax.annotation.Nullable
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auditv3PutActivityRecordRequest auditv3PutActivityRecordRequest = (Auditv3PutActivityRecordRequest) o;
    return Objects.equals(this.actionTaken, auditv3PutActivityRecordRequest.actionTaken) &&
        Objects.equals(this.changesMade, auditv3PutActivityRecordRequest.changesMade) &&
        Objects.equals(this.context, auditv3PutActivityRecordRequest.context) &&
        Objects.equals(this.contextDescription, auditv3PutActivityRecordRequest.contextDescription) &&
        Objects.equals(this.performedBy, auditv3PutActivityRecordRequest.performedBy) &&
        Objects.equals(this.uid, auditv3PutActivityRecordRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTaken, changesMade, context, contextDescription, performedBy, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auditv3PutActivityRecordRequest {\n");
    sb.append("    actionTaken: ").append(toIndentedString(actionTaken)).append("\n");
    sb.append("    changesMade: ").append(toIndentedString(changesMade)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextDescription: ").append(toIndentedString(contextDescription)).append("\n");
    sb.append("    performedBy: ").append(toIndentedString(performedBy)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("action_taken");
    openapiFields.add("changes_made");
    openapiFields.add("context");
    openapiFields.add("context_description");
    openapiFields.add("performed_by");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Auditv3PutActivityRecordRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Auditv3PutActivityRecordRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Auditv3PutActivityRecordRequest is not found in the empty JSON string", Auditv3PutActivityRecordRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Auditv3PutActivityRecordRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Auditv3PutActivityRecordRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action_taken") != null && !jsonObj.get("action_taken").isJsonNull()) && !jsonObj.get("action_taken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_taken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_taken").toString()));
      }
      if ((jsonObj.get("changes_made") != null && !jsonObj.get("changes_made").isJsonNull()) && !jsonObj.get("changes_made").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changes_made` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changes_made").toString()));
      }
      if ((jsonObj.get("context") != null && !jsonObj.get("context").isJsonNull()) && !jsonObj.get("context").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context").toString()));
      }
      if ((jsonObj.get("context_description") != null && !jsonObj.get("context_description").isJsonNull()) && !jsonObj.get("context_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context_description").toString()));
      }
      if ((jsonObj.get("performed_by") != null && !jsonObj.get("performed_by").isJsonNull()) && !jsonObj.get("performed_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performed_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performed_by").toString()));
      }
      if ((jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Auditv3PutActivityRecordRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Auditv3PutActivityRecordRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Auditv3PutActivityRecordRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Auditv3PutActivityRecordRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Auditv3PutActivityRecordRequest>() {
           @Override
           public void write(JsonWriter out, Auditv3PutActivityRecordRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Auditv3PutActivityRecordRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Auditv3PutActivityRecordRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Auditv3PutActivityRecordRequest
  * @throws IOException if the JSON string is invalid with respect to Auditv3PutActivityRecordRequest
  */
  public static Auditv3PutActivityRecordRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Auditv3PutActivityRecordRequest.class);
  }

 /**
  * Convert an instance of Auditv3PutActivityRecordRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

