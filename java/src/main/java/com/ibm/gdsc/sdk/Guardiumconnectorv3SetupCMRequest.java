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
import com.ibm.gdsc.sdk.Guardiumconnectorv3Attribute;
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
 * SetupCMRequest is the argument type used to register a GDP Central Manager to Guardium.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T20:02:04.461512Z[UTC]", comments = "Generator version: 7.6.0")
public class Guardiumconnectorv3SetupCMRequest {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Guardiumconnectorv3Attribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CM_GID = "cm_gid";
  @SerializedName(SERIALIZED_NAME_CM_GID)
  private String cmGid;

  public static final String SERIALIZED_NAME_CM_HOSTNAME = "cm_hostname";
  @SerializedName(SERIALIZED_NAME_CM_HOSTNAME)
  private String cmHostname;

  public static final String SERIALIZED_NAME_CM_IP = "cm_ip";
  @SerializedName(SERIALIZED_NAME_CM_IP)
  private String cmIp;

  public static final String SERIALIZED_NAME_PUSH_REGISTRATION = "push_registration";
  @SerializedName(SERIALIZED_NAME_PUSH_REGISTRATION)
  private Boolean pushRegistration;

  public Guardiumconnectorv3SetupCMRequest() {
  }

  public Guardiumconnectorv3SetupCMRequest attributes(List<Guardiumconnectorv3Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Guardiumconnectorv3SetupCMRequest addAttributesItem(Guardiumconnectorv3Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes specific to the GDP Central Manager.
   * @return attributes
  **/
  @javax.annotation.Nullable
  public List<Guardiumconnectorv3Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Guardiumconnectorv3Attribute> attributes) {
    this.attributes = attributes;
  }


  public Guardiumconnectorv3SetupCMRequest cmGid(String cmGid) {
    this.cmGid = cmGid;
    return this;
  }

   /**
   * Central Manager GID.
   * @return cmGid
  **/
  @javax.annotation.Nullable
  public String getCmGid() {
    return cmGid;
  }

  public void setCmGid(String cmGid) {
    this.cmGid = cmGid;
  }


  public Guardiumconnectorv3SetupCMRequest cmHostname(String cmHostname) {
    this.cmHostname = cmHostname;
    return this;
  }

   /**
   * Central Manager hostname.
   * @return cmHostname
  **/
  @javax.annotation.Nullable
  public String getCmHostname() {
    return cmHostname;
  }

  public void setCmHostname(String cmHostname) {
    this.cmHostname = cmHostname;
  }


  public Guardiumconnectorv3SetupCMRequest cmIp(String cmIp) {
    this.cmIp = cmIp;
    return this;
  }

   /**
   * Central Manager IP.
   * @return cmIp
  **/
  @javax.annotation.Nullable
  public String getCmIp() {
    return cmIp;
  }

  public void setCmIp(String cmIp) {
    this.cmIp = cmIp;
  }


  public Guardiumconnectorv3SetupCMRequest pushRegistration(Boolean pushRegistration) {
    this.pushRegistration = pushRegistration;
    return this;
  }

   /**
   * Attribute used to distinguish between old mode (pull) and new SaaS mode (push) used during registration.
   * @return pushRegistration
  **/
  @javax.annotation.Nullable
  public Boolean getPushRegistration() {
    return pushRegistration;
  }

  public void setPushRegistration(Boolean pushRegistration) {
    this.pushRegistration = pushRegistration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guardiumconnectorv3SetupCMRequest guardiumconnectorv3SetupCMRequest = (Guardiumconnectorv3SetupCMRequest) o;
    return Objects.equals(this.attributes, guardiumconnectorv3SetupCMRequest.attributes) &&
        Objects.equals(this.cmGid, guardiumconnectorv3SetupCMRequest.cmGid) &&
        Objects.equals(this.cmHostname, guardiumconnectorv3SetupCMRequest.cmHostname) &&
        Objects.equals(this.cmIp, guardiumconnectorv3SetupCMRequest.cmIp) &&
        Objects.equals(this.pushRegistration, guardiumconnectorv3SetupCMRequest.pushRegistration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, cmGid, cmHostname, cmIp, pushRegistration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guardiumconnectorv3SetupCMRequest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    cmGid: ").append(toIndentedString(cmGid)).append("\n");
    sb.append("    cmHostname: ").append(toIndentedString(cmHostname)).append("\n");
    sb.append("    cmIp: ").append(toIndentedString(cmIp)).append("\n");
    sb.append("    pushRegistration: ").append(toIndentedString(pushRegistration)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("cm_gid");
    openapiFields.add("cm_hostname");
    openapiFields.add("cm_ip");
    openapiFields.add("push_registration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Guardiumconnectorv3SetupCMRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Guardiumconnectorv3SetupCMRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Guardiumconnectorv3SetupCMRequest is not found in the empty JSON string", Guardiumconnectorv3SetupCMRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Guardiumconnectorv3SetupCMRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Guardiumconnectorv3SetupCMRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            Guardiumconnectorv3Attribute.validateJsonElement(jsonArrayattributes.get(i));
          };
        }
      }
      if ((jsonObj.get("cm_gid") != null && !jsonObj.get("cm_gid").isJsonNull()) && !jsonObj.get("cm_gid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm_gid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm_gid").toString()));
      }
      if ((jsonObj.get("cm_hostname") != null && !jsonObj.get("cm_hostname").isJsonNull()) && !jsonObj.get("cm_hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm_hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm_hostname").toString()));
      }
      if ((jsonObj.get("cm_ip") != null && !jsonObj.get("cm_ip").isJsonNull()) && !jsonObj.get("cm_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cm_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cm_ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Guardiumconnectorv3SetupCMRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Guardiumconnectorv3SetupCMRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Guardiumconnectorv3SetupCMRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Guardiumconnectorv3SetupCMRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Guardiumconnectorv3SetupCMRequest>() {
           @Override
           public void write(JsonWriter out, Guardiumconnectorv3SetupCMRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Guardiumconnectorv3SetupCMRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Guardiumconnectorv3SetupCMRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Guardiumconnectorv3SetupCMRequest
  * @throws IOException if the JSON string is invalid with respect to Guardiumconnectorv3SetupCMRequest
  */
  public static Guardiumconnectorv3SetupCMRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Guardiumconnectorv3SetupCMRequest.class);
  }

 /**
  * Convert an instance of Guardiumconnectorv3SetupCMRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

