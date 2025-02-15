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
import com.ibm.gdsc.sdk.Riskanalyticsenginev3LeadGeneratorConfig;
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
 * GetLeadGeneratorConfigResponse is the response object for GetLeadGeneratorConfig API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-15T03:58:58.617687Z[UTC]", comments = "Generator version: 7.6.0")
public class Riskanalyticsenginev3GetLeadGeneratorConfigResponse {
  public static final String SERIALIZED_NAME_CONFIGS = "configs";
  @SerializedName(SERIALIZED_NAME_CONFIGS)
  private List<Riskanalyticsenginev3LeadGeneratorConfig> configs = new ArrayList<>();

  public Riskanalyticsenginev3GetLeadGeneratorConfigResponse() {
  }

  public Riskanalyticsenginev3GetLeadGeneratorConfigResponse configs(List<Riskanalyticsenginev3LeadGeneratorConfig> configs) {
    this.configs = configs;
    return this;
  }

  public Riskanalyticsenginev3GetLeadGeneratorConfigResponse addConfigsItem(Riskanalyticsenginev3LeadGeneratorConfig configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * A list of lead generator configs from the risk analytics engine.
   * @return configs
  **/
  @javax.annotation.Nullable
  public List<Riskanalyticsenginev3LeadGeneratorConfig> getConfigs() {
    return configs;
  }

  public void setConfigs(List<Riskanalyticsenginev3LeadGeneratorConfig> configs) {
    this.configs = configs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskanalyticsenginev3GetLeadGeneratorConfigResponse riskanalyticsenginev3GetLeadGeneratorConfigResponse = (Riskanalyticsenginev3GetLeadGeneratorConfigResponse) o;
    return Objects.equals(this.configs, riskanalyticsenginev3GetLeadGeneratorConfigResponse.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskanalyticsenginev3GetLeadGeneratorConfigResponse {\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
    openapiFields.add("configs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Riskanalyticsenginev3GetLeadGeneratorConfigResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Riskanalyticsenginev3GetLeadGeneratorConfigResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Riskanalyticsenginev3GetLeadGeneratorConfigResponse is not found in the empty JSON string", Riskanalyticsenginev3GetLeadGeneratorConfigResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Riskanalyticsenginev3GetLeadGeneratorConfigResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Riskanalyticsenginev3GetLeadGeneratorConfigResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("configs") != null && !jsonObj.get("configs").isJsonNull()) {
        JsonArray jsonArrayconfigs = jsonObj.getAsJsonArray("configs");
        if (jsonArrayconfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configs` to be an array in the JSON string but got `%s`", jsonObj.get("configs").toString()));
          }

          // validate the optional field `configs` (array)
          for (int i = 0; i < jsonArrayconfigs.size(); i++) {
            Riskanalyticsenginev3LeadGeneratorConfig.validateJsonElement(jsonArrayconfigs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Riskanalyticsenginev3GetLeadGeneratorConfigResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Riskanalyticsenginev3GetLeadGeneratorConfigResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Riskanalyticsenginev3GetLeadGeneratorConfigResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Riskanalyticsenginev3GetLeadGeneratorConfigResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Riskanalyticsenginev3GetLeadGeneratorConfigResponse>() {
           @Override
           public void write(JsonWriter out, Riskanalyticsenginev3GetLeadGeneratorConfigResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Riskanalyticsenginev3GetLeadGeneratorConfigResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Riskanalyticsenginev3GetLeadGeneratorConfigResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Riskanalyticsenginev3GetLeadGeneratorConfigResponse
  * @throws IOException if the JSON string is invalid with respect to Riskanalyticsenginev3GetLeadGeneratorConfigResponse
  */
  public static Riskanalyticsenginev3GetLeadGeneratorConfigResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Riskanalyticsenginev3GetLeadGeneratorConfigResponse.class);
  }

 /**
  * Convert an instance of Riskanalyticsenginev3GetLeadGeneratorConfigResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

