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
import org.openapitools.client.model.Complianceacceleratorv3Report;

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
 * Reports object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-31T19:36:57.870742Z[UTC]", comments = "Generator version: 7.6.0")
public class Complianceacceleratorv3Reports {
  public static final String SERIALIZED_NAME_REPORTS = "reports";
  @SerializedName(SERIALIZED_NAME_REPORTS)
  private List<Complianceacceleratorv3Report> reports = new ArrayList<>();

  public Complianceacceleratorv3Reports() {
  }

  public Complianceacceleratorv3Reports reports(List<Complianceacceleratorv3Report> reports) {
    this.reports = reports;
    return this;
  }

  public Complianceacceleratorv3Reports addReportsItem(Complianceacceleratorv3Report reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @javax.annotation.Nullable
  public List<Complianceacceleratorv3Report> getReports() {
    return reports;
  }

  public void setReports(List<Complianceacceleratorv3Report> reports) {
    this.reports = reports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complianceacceleratorv3Reports complianceacceleratorv3Reports = (Complianceacceleratorv3Reports) o;
    return Objects.equals(this.reports, complianceacceleratorv3Reports.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Complianceacceleratorv3Reports {\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
    openapiFields.add("reports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Complianceacceleratorv3Reports
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Complianceacceleratorv3Reports.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Complianceacceleratorv3Reports is not found in the empty JSON string", Complianceacceleratorv3Reports.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Complianceacceleratorv3Reports.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Complianceacceleratorv3Reports` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("reports") != null && !jsonObj.get("reports").isJsonNull()) {
        JsonArray jsonArrayreports = jsonObj.getAsJsonArray("reports");
        if (jsonArrayreports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reports` to be an array in the JSON string but got `%s`", jsonObj.get("reports").toString()));
          }

          // validate the optional field `reports` (array)
          for (int i = 0; i < jsonArrayreports.size(); i++) {
            Complianceacceleratorv3Report.validateJsonElement(jsonArrayreports.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Complianceacceleratorv3Reports.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Complianceacceleratorv3Reports' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Complianceacceleratorv3Reports> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Complianceacceleratorv3Reports.class));

       return (TypeAdapter<T>) new TypeAdapter<Complianceacceleratorv3Reports>() {
           @Override
           public void write(JsonWriter out, Complianceacceleratorv3Reports value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Complianceacceleratorv3Reports read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Complianceacceleratorv3Reports given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Complianceacceleratorv3Reports
  * @throws IOException if the JSON string is invalid with respect to Complianceacceleratorv3Reports
  */
  public static Complianceacceleratorv3Reports fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Complianceacceleratorv3Reports.class);
  }

 /**
  * Convert an instance of Complianceacceleratorv3Reports to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

