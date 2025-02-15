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
 * AssetTags - Tag related info for the asset used in Tags widget.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Assetsv3AssetTags {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CONCEPT = "concept";
  @SerializedName(SERIALIZED_NAME_CONCEPT)
  private String concept;

  public static final String SERIALIZED_NAME_CONCEPT_ID = "concept_id";
  @SerializedName(SERIALIZED_NAME_CONCEPT_ID)
  private String conceptId;

  public static final String SERIALIZED_NAME_DOMAIN_ID = "domain_id";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domain_name";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public Assetsv3AssetTags() {
  }

  public Assetsv3AssetTags assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public Assetsv3AssetTags concept(String concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Get concept
   * @return concept
  **/
  @javax.annotation.Nullable
  public String getConcept() {
    return concept;
  }

  public void setConcept(String concept) {
    this.concept = concept;
  }


  public Assetsv3AssetTags conceptId(String conceptId) {
    this.conceptId = conceptId;
    return this;
  }

   /**
   * Get conceptId
   * @return conceptId
  **/
  @javax.annotation.Nullable
  public String getConceptId() {
    return conceptId;
  }

  public void setConceptId(String conceptId) {
    this.conceptId = conceptId;
  }


  public Assetsv3AssetTags domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @javax.annotation.Nullable
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  public Assetsv3AssetTags domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @javax.annotation.Nullable
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetsv3AssetTags assetsv3AssetTags = (Assetsv3AssetTags) o;
    return Objects.equals(this.assetId, assetsv3AssetTags.assetId) &&
        Objects.equals(this.concept, assetsv3AssetTags.concept) &&
        Objects.equals(this.conceptId, assetsv3AssetTags.conceptId) &&
        Objects.equals(this.domainId, assetsv3AssetTags.domainId) &&
        Objects.equals(this.domainName, assetsv3AssetTags.domainName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, concept, conceptId, domainId, domainName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetsv3AssetTags {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    conceptId: ").append(toIndentedString(conceptId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("concept");
    openapiFields.add("concept_id");
    openapiFields.add("domain_id");
    openapiFields.add("domain_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Assetsv3AssetTags
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Assetsv3AssetTags.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Assetsv3AssetTags is not found in the empty JSON string", Assetsv3AssetTags.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Assetsv3AssetTags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Assetsv3AssetTags` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("asset_id") != null && !jsonObj.get("asset_id").isJsonNull()) && !jsonObj.get("asset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id").toString()));
      }
      if ((jsonObj.get("concept") != null && !jsonObj.get("concept").isJsonNull()) && !jsonObj.get("concept").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `concept` to be a primitive type in the JSON string but got `%s`", jsonObj.get("concept").toString()));
      }
      if ((jsonObj.get("concept_id") != null && !jsonObj.get("concept_id").isJsonNull()) && !jsonObj.get("concept_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `concept_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("concept_id").toString()));
      }
      if ((jsonObj.get("domain_id") != null && !jsonObj.get("domain_id").isJsonNull()) && !jsonObj.get("domain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_id").toString()));
      }
      if ((jsonObj.get("domain_name") != null && !jsonObj.get("domain_name").isJsonNull()) && !jsonObj.get("domain_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Assetsv3AssetTags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Assetsv3AssetTags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Assetsv3AssetTags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Assetsv3AssetTags.class));

       return (TypeAdapter<T>) new TypeAdapter<Assetsv3AssetTags>() {
           @Override
           public void write(JsonWriter out, Assetsv3AssetTags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Assetsv3AssetTags read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Assetsv3AssetTags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Assetsv3AssetTags
  * @throws IOException if the JSON string is invalid with respect to Assetsv3AssetTags
  */
  public static Assetsv3AssetTags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Assetsv3AssetTags.class);
  }

 /**
  * Convert an instance of Assetsv3AssetTags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

