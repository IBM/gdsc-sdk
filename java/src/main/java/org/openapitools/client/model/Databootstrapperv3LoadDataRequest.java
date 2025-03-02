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

import org.openapitools.client.JSON;

/**
 * Load data request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Databootstrapperv3LoadDataRequest {
  public static final String SERIALIZED_NAME_PART_NUMBER = "part_number";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public Databootstrapperv3LoadDataRequest() {
  }

  public Databootstrapperv3LoadDataRequest partNumber(String partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * The part number.
   * @return partNumber
  **/
  @javax.annotation.Nullable
  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Databootstrapperv3LoadDataRequest databootstrapperv3LoadDataRequest = (Databootstrapperv3LoadDataRequest) o;
    return Objects.equals(this.partNumber, databootstrapperv3LoadDataRequest.partNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Databootstrapperv3LoadDataRequest {\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
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
    openapiFields.add("part_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Databootstrapperv3LoadDataRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Databootstrapperv3LoadDataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Databootstrapperv3LoadDataRequest is not found in the empty JSON string", Databootstrapperv3LoadDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Databootstrapperv3LoadDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Databootstrapperv3LoadDataRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("part_number") != null && !jsonObj.get("part_number").isJsonNull()) && !jsonObj.get("part_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Databootstrapperv3LoadDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Databootstrapperv3LoadDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Databootstrapperv3LoadDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Databootstrapperv3LoadDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Databootstrapperv3LoadDataRequest>() {
           @Override
           public void write(JsonWriter out, Databootstrapperv3LoadDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Databootstrapperv3LoadDataRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Databootstrapperv3LoadDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Databootstrapperv3LoadDataRequest
  * @throws IOException if the JSON string is invalid with respect to Databootstrapperv3LoadDataRequest
  */
  public static Databootstrapperv3LoadDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Databootstrapperv3LoadDataRequest.class);
  }

 /**
  * Convert an instance of Databootstrapperv3LoadDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

