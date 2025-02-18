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
import com.ibm.gdsc.sdk.models.RpcStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Response from creating a ticket.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Qspmpolicymanagerv3CreateTicketResponse {
  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_INTEGRATION_NAME = "integrationName";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_NAME)
  private String integrationName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RpcStatus status;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_TICKET_ID = "ticket_id";
  @SerializedName(SERIALIZED_NAME_TICKET_ID)
  private String ticketId;

  public static final String SERIALIZED_NAME_TICKET_NUMBER = "ticket_number";
  @SerializedName(SERIALIZED_NAME_TICKET_NUMBER)
  private String ticketNumber;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public Qspmpolicymanagerv3CreateTicketResponse() {
  }

  public Qspmpolicymanagerv3CreateTicketResponse createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  public Qspmpolicymanagerv3CreateTicketResponse integrationName(String integrationName) {
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Get integrationName
   * @return integrationName
  **/
  @javax.annotation.Nullable
  public String getIntegrationName() {
    return integrationName;
  }

  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  public Qspmpolicymanagerv3CreateTicketResponse status(RpcStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public RpcStatus getStatus() {
    return status;
  }

  public void setStatus(RpcStatus status) {
    this.status = status;
  }


  public Qspmpolicymanagerv3CreateTicketResponse summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public Qspmpolicymanagerv3CreateTicketResponse ticketId(String ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Get ticketId
   * @return ticketId
  **/
  @javax.annotation.Nullable
  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }


  public Qspmpolicymanagerv3CreateTicketResponse ticketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
    return this;
  }

   /**
   * Get ticketNumber
   * @return ticketNumber
  **/
  @javax.annotation.Nullable
  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }


  public Qspmpolicymanagerv3CreateTicketResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qspmpolicymanagerv3CreateTicketResponse qspmpolicymanagerv3CreateTicketResponse = (Qspmpolicymanagerv3CreateTicketResponse) o;
    return Objects.equals(this.createTime, qspmpolicymanagerv3CreateTicketResponse.createTime) &&
        Objects.equals(this.integrationName, qspmpolicymanagerv3CreateTicketResponse.integrationName) &&
        Objects.equals(this.status, qspmpolicymanagerv3CreateTicketResponse.status) &&
        Objects.equals(this.summary, qspmpolicymanagerv3CreateTicketResponse.summary) &&
        Objects.equals(this.ticketId, qspmpolicymanagerv3CreateTicketResponse.ticketId) &&
        Objects.equals(this.ticketNumber, qspmpolicymanagerv3CreateTicketResponse.ticketNumber) &&
        Objects.equals(this.uri, qspmpolicymanagerv3CreateTicketResponse.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, integrationName, status, summary, ticketId, ticketNumber, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qspmpolicymanagerv3CreateTicketResponse {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("createTime");
    openapiFields.add("integrationName");
    openapiFields.add("status");
    openapiFields.add("summary");
    openapiFields.add("ticket_id");
    openapiFields.add("ticket_number");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Qspmpolicymanagerv3CreateTicketResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Qspmpolicymanagerv3CreateTicketResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Qspmpolicymanagerv3CreateTicketResponse is not found in the empty JSON string", Qspmpolicymanagerv3CreateTicketResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Qspmpolicymanagerv3CreateTicketResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Qspmpolicymanagerv3CreateTicketResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("integrationName") != null && !jsonObj.get("integrationName").isJsonNull()) && !jsonObj.get("integrationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationName").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RpcStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("ticket_id") != null && !jsonObj.get("ticket_id").isJsonNull()) && !jsonObj.get("ticket_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_id").toString()));
      }
      if ((jsonObj.get("ticket_number") != null && !jsonObj.get("ticket_number").isJsonNull()) && !jsonObj.get("ticket_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_number").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Qspmpolicymanagerv3CreateTicketResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Qspmpolicymanagerv3CreateTicketResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Qspmpolicymanagerv3CreateTicketResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Qspmpolicymanagerv3CreateTicketResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Qspmpolicymanagerv3CreateTicketResponse>() {
           @Override
           public void write(JsonWriter out, Qspmpolicymanagerv3CreateTicketResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Qspmpolicymanagerv3CreateTicketResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Qspmpolicymanagerv3CreateTicketResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Qspmpolicymanagerv3CreateTicketResponse
  * @throws IOException if the JSON string is invalid with respect to Qspmpolicymanagerv3CreateTicketResponse
  */
  public static Qspmpolicymanagerv3CreateTicketResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Qspmpolicymanagerv3CreateTicketResponse.class);
  }

 /**
  * Convert an instance of Qspmpolicymanagerv3CreateTicketResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

