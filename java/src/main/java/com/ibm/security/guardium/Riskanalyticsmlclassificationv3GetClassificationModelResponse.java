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
import com.ibm.security.guardium.Riskanalyticsmlclassificationv3ClassModelExplained;
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

import com.ibm.security.JSON;

/**
 * GetClassificationModelResponse message for the GetClassificationModel api.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-24T18:44:53.377644Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsmlclassificationv3GetClassificationModelResponse {
  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private List<Riskanalyticsmlclassificationv3ClassModelExplained> model = new ArrayList<>();

  public Riskanalyticsmlclassificationv3GetClassificationModelResponse() {
  }

  public Riskanalyticsmlclassificationv3GetClassificationModelResponse model(List<Riskanalyticsmlclassificationv3ClassModelExplained> model) {
    this.model = model;
    return this;
  }

  public Riskanalyticsmlclassificationv3GetClassificationModelResponse addModelItem(Riskanalyticsmlclassificationv3ClassModelExplained modelItem) {
    if (this.model == null) {
      this.model = new ArrayList<>();
    }
    this.model.add(modelItem);
    return this;
  }

   /**
   * Classification model weights.
   * @return model
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsmlclassificationv3ClassModelExplained> getModel() {
    return model;
  }

  public void setModel(List<Riskanalyticsmlclassificationv3ClassModelExplained> model) {
    this.model = model;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsmlclassificationv3GetClassificationModelResponse riskanalyticsmlclassificationv3GetClassificationModelResponse = (Riskanalyticsmlclassificationv3GetClassificationModelResponse) o;
    return Objects.equals(this.model, riskanalyticsmlclassificationv3GetClassificationModelResponse.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsmlclassificationv3GetClassificationModelResponse {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
    openapiFields.add("model");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsmlclassificationv3GetClassificationModelResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsmlclassificationv3GetClassificationModelResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsmlclassificationv3GetClassificationModelResponse is not found in the empty JSON string", Riskanalyticsmlclassificationv3GetClassificationModelResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsmlclassificationv3GetClassificationModelResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsmlclassificationv3GetClassificationModelResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) {
        JsonArray jsonArraymodel = jsonObj.getAsJsonArray("model");
        if (jsonArraymodel != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model` to be an array in the JSON string but got `%s`", jsonObj.get("model").toString()));
          }

          // validate the optional field `model` (array)
          for (int i = 0; i < jsonArraymodel.size(); i++) {
            Riskanalyticsmlclassificationv3ClassModelExplained.validateJsonElement(jsonArraymodel.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsmlclassificationv3GetClassificationModelResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsmlclassificationv3GetClassificationModelResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsmlclassificationv3GetClassificationModelResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsmlclassificationv3GetClassificationModelResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsmlclassificationv3GetClassificationModelResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsmlclassificationv3GetClassificationModelResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsmlclassificationv3GetClassificationModelResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsmlclassificationv3GetClassificationModelResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsmlclassificationv3GetClassificationModelResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsmlclassificationv3GetClassificationModelResponse
  */
  public static Riskanalyticsmlclassificationv3GetClassificationModelResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsmlclassificationv3GetClassificationModelResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticsmlclassificationv3GetClassificationModelResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

