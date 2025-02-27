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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Tenantuserv3Prometheus;

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
 * ExternalMetadata external metadata.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Tenantuserv3ExternalMetadata {
  public static final String SERIALIZED_NAME_ADD_ONS = "add_ons";
  @SerializedName(SERIALIZED_NAME_ADD_ONS)
  private Map<String, Tenantuserv3Prometheus> addOns = new HashMap<>();

  public static final String SERIALIZED_NAME_CRN = "crn";
  @SerializedName(SERIALIZED_NAME_CRN)
  private String crn;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public Tenantuserv3ExternalMetadata() {
  }

  public Tenantuserv3ExternalMetadata addOns(Map<String, Tenantuserv3Prometheus> addOns) {
    this.addOns = addOns;
    return this;
  }

  public Tenantuserv3ExternalMetadata putAddOnsItem(String key, Tenantuserv3Prometheus addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new HashMap<>();
    }
    this.addOns.put(key, addOnsItem);
    return this;
  }

   /**
   * Add ons.
   * @return addOns
  **/
  @javax.annotation.Nullable
  public Map<String, Tenantuserv3Prometheus> getAddOns() {
    return addOns;
  }

  public void setAddOns(Map<String, Tenantuserv3Prometheus> addOns) {
    this.addOns = addOns;
  }


  public Tenantuserv3ExternalMetadata crn(String crn) {
    this.crn = crn;
    return this;
  }

   /**
   * Get crn
   * @return crn
  **/
  @javax.annotation.Nullable
  public String getCrn() {
    return crn;
  }

  public void setCrn(String crn) {
    this.crn = crn;
  }


  public Tenantuserv3ExternalMetadata expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Tenantuserv3ExternalMetadata instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Instance id.
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public Tenantuserv3ExternalMetadata partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Part number.
   * @return partNumber
  **/
  @javax.annotation.Nullable
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }


  public Tenantuserv3ExternalMetadata planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Plan id.
   * @return planId
  **/
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public Tenantuserv3ExternalMetadata serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Service id.
   * @return serviceId
  **/
  @javax.annotation.Nullable
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public Tenantuserv3ExternalMetadata subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Subscription id.
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenantuserv3ExternalMetadata tenantuserv3ExternalMetadata = (Tenantuserv3ExternalMetadata) o;
    return Objects.equals(this.addOns, tenantuserv3ExternalMetadata.addOns) &&
        Objects.equals(this.crn, tenantuserv3ExternalMetadata.crn) &&
        Objects.equals(this.expirationDate, tenantuserv3ExternalMetadata.expirationDate) &&
        Objects.equals(this.instanceId, tenantuserv3ExternalMetadata.instanceId) &&
        Objects.equals(this.partNumber, tenantuserv3ExternalMetadata.partNumber) &&
        Objects.equals(this.planId, tenantuserv3ExternalMetadata.planId) &&
        Objects.equals(this.serviceId, tenantuserv3ExternalMetadata.serviceId) &&
        Objects.equals(this.subscriptionId, tenantuserv3ExternalMetadata.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, crn, expirationDate, instanceId, partNumber, planId, serviceId, subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenantuserv3ExternalMetadata {\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
    openapiFields.add("add_ons");
    openapiFields.add("crn");
    openapiFields.add("expiration_date");
    openapiFields.add("instance_id");
    openapiFields.add("part_number");
    openapiFields.add("plan_id");
    openapiFields.add("service_id");
    openapiFields.add("subscription_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Tenantuserv3ExternalMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Tenantuserv3ExternalMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenantuserv3ExternalMetadata is not found in the empty JSON string", Tenantuserv3ExternalMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Tenantuserv3ExternalMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenantuserv3ExternalMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("crn") != null && !jsonObj.get("crn").isJsonNull()) && !jsonObj.get("crn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crn").toString()));
      }
      if ((jsonObj.get("instance_id") != null && !jsonObj.get("instance_id").isJsonNull()) && !jsonObj.get("instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_id").toString()));
      }
      if ((jsonObj.get("part_number") != null && !jsonObj.get("part_number").isJsonNull()) && !jsonObj.get("part_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_number").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("service_id") != null && !jsonObj.get("service_id").isJsonNull()) && !jsonObj.get("service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_id").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Tenantuserv3ExternalMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenantuserv3ExternalMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenantuserv3ExternalMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenantuserv3ExternalMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenantuserv3ExternalMetadata>() {
           @Override
           public void write(JsonWriter out, Tenantuserv3ExternalMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenantuserv3ExternalMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenantuserv3ExternalMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenantuserv3ExternalMetadata
  * @throws IOException if the JSON string is invalid with respect to Tenantuserv3ExternalMetadata
  */
  public static Tenantuserv3ExternalMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenantuserv3ExternalMetadata.class);
  }

 /**
  * Convert an instance of Tenantuserv3ExternalMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

