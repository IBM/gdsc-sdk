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

import com.ibm.security.JSON;

/**
 * Contains the command information to be executed by a controller.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3ControllerCommand {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Resourcecontrollerk8v3ControllerCommand() {
  }

  public Resourcecontrollerk8v3ControllerCommand args(Object args) {
    this.args = args;
    return this;
  }

   /**
   * The command arguments.
   * @return args
  **/
  @javax.annotation.Nullable
  public Object getArgs() {
    return args;
  }

  public void setArgs(Object args) {
    this.args = args;
  }


  public Resourcecontrollerk8v3ControllerCommand created(String created) {
    this.created = created;
    return this;
  }

   /**
   * The date this command was created (ms since epoch).
   * @return created
  **/
  @javax.annotation.Nullable
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }


  public Resourcecontrollerk8v3ControllerCommand id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the command.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Resourcecontrollerk8v3ControllerCommand modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date this command was modified (ms since epoch).
   * @return modified
  **/
  @javax.annotation.Nullable
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  public Resourcecontrollerk8v3ControllerCommand result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the command. This value is write-only and can only be written once.
   * @return result
  **/
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public Resourcecontrollerk8v3ControllerCommand status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the command. The current valid values are pending, success, error.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Resourcecontrollerk8v3ControllerCommand type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of command. The current valid values are get_app_logs.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3ControllerCommand resourcecontrollerk8v3ControllerCommand = (Resourcecontrollerk8v3ControllerCommand) o;
    return Objects.equals(this.args, resourcecontrollerk8v3ControllerCommand.args) &&
        Objects.equals(this.created, resourcecontrollerk8v3ControllerCommand.created) &&
        Objects.equals(this.id, resourcecontrollerk8v3ControllerCommand.id) &&
        Objects.equals(this.modified, resourcecontrollerk8v3ControllerCommand.modified) &&
        Objects.equals(this.result, resourcecontrollerk8v3ControllerCommand.result) &&
        Objects.equals(this.status, resourcecontrollerk8v3ControllerCommand.status) &&
        Objects.equals(this.type, resourcecontrollerk8v3ControllerCommand.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, created, id, modified, result, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3ControllerCommand {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("args");
    openapiFields.add("created");
    openapiFields.add("id");
    openapiFields.add("modified");
    openapiFields.add("result");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3ControllerCommand
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3ControllerCommand.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3ControllerCommand is not found in the empty JSON string", Resourcecontrollerk8v3ControllerCommand.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3ControllerCommand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3ControllerCommand` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull()) && !jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3ControllerCommand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3ControllerCommand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3ControllerCommand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3ControllerCommand.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3ControllerCommand>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3ControllerCommand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3ControllerCommand read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3ControllerCommand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3ControllerCommand
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3ControllerCommand
  */
  public static Resourcecontrollerk8v3ControllerCommand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3ControllerCommand.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3ControllerCommand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

