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
import com.ibm.gdsc.sdk.Policybuilderv3ActionMetadata;
import com.ibm.gdsc.sdk.Policybuilderv3RuleParameterMetadata;
import com.ibm.gdsc.sdk.Policybuilderv3StatusResponseBase;
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
 * Rule Metadata Response message.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Policybuilderv3RuleMetadataResponse {
  public static final String SERIALIZED_NAME_ACTION_METADATA = "action_metadata";
  @SerializedName(SERIALIZED_NAME_ACTION_METADATA)
  private List<Policybuilderv3ActionMetadata> actionMetadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARAMETER_METADATA = "parameter_metadata";
  @SerializedName(SERIALIZED_NAME_PARAMETER_METADATA)
  private List<Policybuilderv3RuleParameterMetadata> parameterMetadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Policybuilderv3StatusResponseBase status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public Policybuilderv3RuleMetadataResponse() {
  }

  public Policybuilderv3RuleMetadataResponse actionMetadata(List<Policybuilderv3ActionMetadata> actionMetadata) {
    this.actionMetadata = actionMetadata;
    return this;
  }

  public Policybuilderv3RuleMetadataResponse addActionMetadataItem(Policybuilderv3ActionMetadata actionMetadataItem) {
    if (this.actionMetadata == null) {
      this.actionMetadata = new ArrayList<>();
    }
    this.actionMetadata.add(actionMetadataItem);
    return this;
  }

   /**
   * Actions metadata object.
   * @return actionMetadata
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3ActionMetadata> getActionMetadata() {
    return actionMetadata;
  }

  public void setActionMetadata(List<Policybuilderv3ActionMetadata> actionMetadata) {
    this.actionMetadata = actionMetadata;
  }


  public Policybuilderv3RuleMetadataResponse parameterMetadata(List<Policybuilderv3RuleParameterMetadata> parameterMetadata) {
    this.parameterMetadata = parameterMetadata;
    return this;
  }

  public Policybuilderv3RuleMetadataResponse addParameterMetadataItem(Policybuilderv3RuleParameterMetadata parameterMetadataItem) {
    if (this.parameterMetadata == null) {
      this.parameterMetadata = new ArrayList<>();
    }
    this.parameterMetadata.add(parameterMetadataItem);
    return this;
  }

   /**
   * Rule Parameters Metadata object.
   * @return parameterMetadata
  **/
  @javax.annotation.Nullable
  public List<Policybuilderv3RuleParameterMetadata> getParameterMetadata() {
    return parameterMetadata;
  }

  public void setParameterMetadata(List<Policybuilderv3RuleParameterMetadata> parameterMetadata) {
    this.parameterMetadata = parameterMetadata;
  }


  public Policybuilderv3RuleMetadataResponse status(Policybuilderv3StatusResponseBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public Policybuilderv3StatusResponseBase getStatus() {
    return status;
  }

  public void setStatus(Policybuilderv3StatusResponseBase status) {
    this.status = status;
  }


  public Policybuilderv3RuleMetadataResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Policybuilderv3RuleMetadataResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of existing tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policybuilderv3RuleMetadataResponse policybuilderv3RuleMetadataResponse = (Policybuilderv3RuleMetadataResponse) o;
    return Objects.equals(this.actionMetadata, policybuilderv3RuleMetadataResponse.actionMetadata) &&
        Objects.equals(this.parameterMetadata, policybuilderv3RuleMetadataResponse.parameterMetadata) &&
        Objects.equals(this.status, policybuilderv3RuleMetadataResponse.status) &&
        Objects.equals(this.tags, policybuilderv3RuleMetadataResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionMetadata, parameterMetadata, status, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policybuilderv3RuleMetadataResponse {\n");
    sb.append("    actionMetadata: ").append(toIndentedString(actionMetadata)).append("\n");
    sb.append("    parameterMetadata: ").append(toIndentedString(parameterMetadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("action_metadata");
    openapiFields.add("parameter_metadata");
    openapiFields.add("status");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Policybuilderv3RuleMetadataResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policybuilderv3RuleMetadataResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policybuilderv3RuleMetadataResponse is not found in the empty JSON string", Policybuilderv3RuleMetadataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policybuilderv3RuleMetadataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policybuilderv3RuleMetadataResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("action_metadata") != null && !jsonObj.get("action_metadata").isJsonNull()) {
        JsonArray jsonArrayactionMetadata = jsonObj.getAsJsonArray("action_metadata");
        if (jsonArrayactionMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("action_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `action_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("action_metadata").toString()));
          }

          // validate the optional field `action_metadata` (array)
          for (int i = 0; i < jsonArrayactionMetadata.size(); i++) {
            Policybuilderv3ActionMetadata.validateJsonElement(jsonArrayactionMetadata.get(i));
          };
        }
      }
      if (jsonObj.get("parameter_metadata") != null && !jsonObj.get("parameter_metadata").isJsonNull()) {
        JsonArray jsonArrayparameterMetadata = jsonObj.getAsJsonArray("parameter_metadata");
        if (jsonArrayparameterMetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameter_metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameter_metadata` to be an array in the JSON string but got `%s`", jsonObj.get("parameter_metadata").toString()));
          }

          // validate the optional field `parameter_metadata` (array)
          for (int i = 0; i < jsonArrayparameterMetadata.size(); i++) {
            Policybuilderv3RuleParameterMetadata.validateJsonElement(jsonArrayparameterMetadata.get(i));
          };
        }
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        Policybuilderv3StatusResponseBase.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policybuilderv3RuleMetadataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policybuilderv3RuleMetadataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policybuilderv3RuleMetadataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policybuilderv3RuleMetadataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Policybuilderv3RuleMetadataResponse>() {
           @Override
           public void write(JsonWriter out, Policybuilderv3RuleMetadataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policybuilderv3RuleMetadataResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Policybuilderv3RuleMetadataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Policybuilderv3RuleMetadataResponse
  * @throws IOException if the JSON string is invalid with respect to Policybuilderv3RuleMetadataResponse
  */
  public static Policybuilderv3RuleMetadataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policybuilderv3RuleMetadataResponse.class);
  }

 /**
  * Convert an instance of Policybuilderv3RuleMetadataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

