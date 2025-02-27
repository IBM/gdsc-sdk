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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Reportsv3ReportUsedInJoin;

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
 * GetReportsForJoinResponse - Returns a small amount of information for each report used by a join. Includes the join-imported headers used by the report. Warning: use sparingly as this function requires fetching every report in a category and traversing their trees - it can be slow.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Reportsv3GetReportsForJoinResponse {
  public static final String SERIALIZED_NAME_REPORTS_USED_IN_JOIN = "reports_used_in_join";
  @SerializedName(SERIALIZED_NAME_REPORTS_USED_IN_JOIN)
  private List<Reportsv3ReportUsedInJoin> reportsUsedInJoin = new ArrayList<>();

  public Reportsv3GetReportsForJoinResponse() {
  }

  public Reportsv3GetReportsForJoinResponse reportsUsedInJoin(List<Reportsv3ReportUsedInJoin> reportsUsedInJoin) {
    this.reportsUsedInJoin = reportsUsedInJoin;
    return this;
  }

  public Reportsv3GetReportsForJoinResponse addReportsUsedInJoinItem(Reportsv3ReportUsedInJoin reportsUsedInJoinItem) {
    if (this.reportsUsedInJoin == null) {
      this.reportsUsedInJoin = new ArrayList<>();
    }
    this.reportsUsedInJoin.add(reportsUsedInJoinItem);
    return this;
  }

   /**
   * Get reportsUsedInJoin
   * @return reportsUsedInJoin
  **/
  @javax.annotation.Nullable
  public List<Reportsv3ReportUsedInJoin> getReportsUsedInJoin() {
    return reportsUsedInJoin;
  }

  public void setReportsUsedInJoin(List<Reportsv3ReportUsedInJoin> reportsUsedInJoin) {
    this.reportsUsedInJoin = reportsUsedInJoin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportsv3GetReportsForJoinResponse reportsv3GetReportsForJoinResponse = (Reportsv3GetReportsForJoinResponse) o;
    return Objects.equals(this.reportsUsedInJoin, reportsv3GetReportsForJoinResponse.reportsUsedInJoin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportsUsedInJoin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportsv3GetReportsForJoinResponse {\n");
    sb.append("    reportsUsedInJoin: ").append(toIndentedString(reportsUsedInJoin)).append("\n");
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
    openapiFields.add("reports_used_in_join");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Reportsv3GetReportsForJoinResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Reportsv3GetReportsForJoinResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reportsv3GetReportsForJoinResponse is not found in the empty JSON string", Reportsv3GetReportsForJoinResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Reportsv3GetReportsForJoinResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reportsv3GetReportsForJoinResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("reports_used_in_join") != null && !jsonObj.get("reports_used_in_join").isJsonNull()) {
        JsonArray jsonArrayreportsUsedInJoin = jsonObj.getAsJsonArray("reports_used_in_join");
        if (jsonArrayreportsUsedInJoin != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reports_used_in_join").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reports_used_in_join` to be an array in the JSON string but got `%s`", jsonObj.get("reports_used_in_join").toString()));
          }

          // validate the optional field `reports_used_in_join` (array)
          for (int i = 0; i < jsonArrayreportsUsedInJoin.size(); i++) {
            Reportsv3ReportUsedInJoin.validateJsonElement(jsonArrayreportsUsedInJoin.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reportsv3GetReportsForJoinResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reportsv3GetReportsForJoinResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reportsv3GetReportsForJoinResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reportsv3GetReportsForJoinResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Reportsv3GetReportsForJoinResponse>() {
           @Override
           public void write(JsonWriter out, Reportsv3GetReportsForJoinResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reportsv3GetReportsForJoinResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reportsv3GetReportsForJoinResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reportsv3GetReportsForJoinResponse
  * @throws IOException if the JSON string is invalid with respect to Reportsv3GetReportsForJoinResponse
  */
  public static Reportsv3GetReportsForJoinResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reportsv3GetReportsForJoinResponse.class);
  }

 /**
  * Convert an instance of Reportsv3GetReportsForJoinResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

