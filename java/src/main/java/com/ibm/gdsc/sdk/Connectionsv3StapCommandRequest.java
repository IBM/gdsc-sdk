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
import com.ibm.gdsc.sdk.Connectionsv3StapOperation;
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

import com.ibm.gdsc.JSON;

/**
 * StapCommandRequest defines the message structure for STAP command request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Connectionsv3StapCommandRequest {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private Connectionsv3StapOperation operation = Connectionsv3StapOperation.REINITIALIZE_BUFFER;

  public static final String SERIALIZED_NAME_STAP_ID = "stap_id";
  @SerializedName(SERIALIZED_NAME_STAP_ID)
  private String stapId;

  public Connectionsv3StapCommandRequest() {
  }

  public Connectionsv3StapCommandRequest command(String command) {
    this.command = command;
    return this;
  }

   /**
   * Specify STAP command.
   * @return command
  **/
  @javax.annotation.Nullable
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public Connectionsv3StapCommandRequest operation(Connectionsv3StapOperation operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  public Connectionsv3StapOperation getOperation() {
    return operation;
  }

  public void setOperation(Connectionsv3StapOperation operation) {
    this.operation = operation;
  }


  public Connectionsv3StapCommandRequest stapId(String stapId) {
    this.stapId = stapId;
    return this;
  }

   /**
   * Provide STAP identifier.
   * @return stapId
  **/
  @javax.annotation.Nullable
  public String getStapId() {
    return stapId;
  }

  public void setStapId(String stapId) {
    this.stapId = stapId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connectionsv3StapCommandRequest connectionsv3StapCommandRequest = (Connectionsv3StapCommandRequest) o;
    return Objects.equals(this.command, connectionsv3StapCommandRequest.command) &&
        Objects.equals(this.operation, connectionsv3StapCommandRequest.operation) &&
        Objects.equals(this.stapId, connectionsv3StapCommandRequest.stapId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, operation, stapId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connectionsv3StapCommandRequest {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    stapId: ").append(toIndentedString(stapId)).append("\n");
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
    openapiFields.add("command");
    openapiFields.add("operation");
    openapiFields.add("stap_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Connectionsv3StapCommandRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Connectionsv3StapCommandRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Connectionsv3StapCommandRequest is not found in the empty JSON string", Connectionsv3StapCommandRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Connectionsv3StapCommandRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Connectionsv3StapCommandRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("command") != null && !jsonObj.get("command").isJsonNull()) && !jsonObj.get("command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        Connectionsv3StapOperation.validateJsonElement(jsonObj.get("operation"));
      }
      if ((jsonObj.get("stap_id") != null && !jsonObj.get("stap_id").isJsonNull()) && !jsonObj.get("stap_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stap_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stap_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Connectionsv3StapCommandRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Connectionsv3StapCommandRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Connectionsv3StapCommandRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Connectionsv3StapCommandRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Connectionsv3StapCommandRequest>() {
           @Override
           public void write(JsonWriter out, Connectionsv3StapCommandRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Connectionsv3StapCommandRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Connectionsv3StapCommandRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Connectionsv3StapCommandRequest
  * @throws IOException if the JSON string is invalid with respect to Connectionsv3StapCommandRequest
  */
  public static Connectionsv3StapCommandRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Connectionsv3StapCommandRequest.class);
  }

 /**
  * Convert an instance of Connectionsv3StapCommandRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

