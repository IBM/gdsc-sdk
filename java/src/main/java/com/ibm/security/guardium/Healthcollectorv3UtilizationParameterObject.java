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

import com.ibm.security.JSON;

/**
 * UnitUtilizationParameterObject gets information about unit utilization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:17:29.841502Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3UtilizationParameterObject {
  public static final String SERIALIZED_NAME_ANALYZER_QUEUE_VALUE = "analyzer_queue_value";
  @SerializedName(SERIALIZED_NAME_ANALYZER_QUEUE_VALUE)
  private Integer analyzerQueueValue;

  public static final String SERIALIZED_NAME_DETAILED_ERR_MESSAGE = "detailed_err_message";
  @SerializedName(SERIALIZED_NAME_DETAILED_ERR_MESSAGE)
  private String detailedErrMessage;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Integer error;

  public static final String SERIALIZED_NAME_FREE_BUFFER_SPACE_VALUE = "free_buffer_space_value";
  @SerializedName(SERIALIZED_NAME_FREE_BUFFER_SPACE_VALUE)
  private Integer freeBufferSpaceValue;

  public static final String SERIALIZED_NAME_LOGGER_QUEUE_VALUE = "logger_queue_value";
  @SerializedName(SERIALIZED_NAME_LOGGER_QUEUE_VALUE)
  private Integer loggerQueueValue;

  public static final String SERIALIZED_NAME_MYSQL_DISK_USAGE_VALUE = "mysql_disk_usage_value";
  @SerializedName(SERIALIZED_NAME_MYSQL_DISK_USAGE_VALUE)
  private Integer mysqlDiskUsageValue;

  public static final String SERIALIZED_NAME_NO_OF_EXCEPTIONS_VALUE = "no_of_exceptions_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_EXCEPTIONS_VALUE)
  private Integer noOfExceptionsValue;

  public static final String SERIALIZED_NAME_NO_OF_FLAT_LOG_REQUESTS_VALUE = "no_of_flat_log_requests_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_FLAT_LOG_REQUESTS_VALUE)
  private Integer noOfFlatLogRequestsValue;

  public static final String SERIALIZED_NAME_NO_OF_POLICY_VIOLATIONS_VALUE = "no_of_policy_violations_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_POLICY_VIOLATIONS_VALUE)
  private Integer noOfPolicyViolationsValue;

  public static final String SERIALIZED_NAME_NO_OF_REQUESTS_VALUE = "no_of_requests_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_REQUESTS_VALUE)
  private Integer noOfRequestsValue;

  public static final String SERIALIZED_NAME_NO_OF_RESTARTS_VALUE = "no_of_restarts_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_RESTARTS_VALUE)
  private Integer noOfRestartsValue;

  public static final String SERIALIZED_NAME_PREC_MYSQL_MEMORY_VALUE = "prec_mysql_memory_value";
  @SerializedName(SERIALIZED_NAME_PREC_MYSQL_MEMORY_VALUE)
  private Integer precMysqlMemoryValue;

  public static final String SERIALIZED_NAME_SNIFFER_MEMORY_VALUE = "sniffer_memory_value";
  @SerializedName(SERIALIZED_NAME_SNIFFER_MEMORY_VALUE)
  private Integer snifferMemoryValue;

  public static final String SERIALIZED_NAME_SYSTEM_CPU_LOAD_VALUE = "system_cpu_load_value";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CPU_LOAD_VALUE)
  private Integer systemCpuLoadValue;

  public static final String SERIALIZED_NAME_SYSTEM_VAR_DISK_USAGE_VALUE = "system_var_disk_usage_value";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VAR_DISK_USAGE_VALUE)
  private Integer systemVarDiskUsageValue;

  public Healthcollectorv3UtilizationParameterObject() {
  }

  public Healthcollectorv3UtilizationParameterObject analyzerQueueValue(Integer analyzerQueueValue) {
    this.analyzerQueueValue = analyzerQueueValue;
    return this;
  }

   /**
   * Analyzer queue value.
   * @return analyzerQueueValue
  **/
  @javax.annotation.Nullable
  public Integer getAnalyzerQueueValue() {
    return analyzerQueueValue;
  }

  public void setAnalyzerQueueValue(Integer analyzerQueueValue) {
    this.analyzerQueueValue = analyzerQueueValue;
  }


  public Healthcollectorv3UtilizationParameterObject detailedErrMessage(String detailedErrMessage) {
    this.detailedErrMessage = detailedErrMessage;
    return this;
  }

   /**
   * Detailed error message.
   * @return detailedErrMessage
  **/
  @javax.annotation.Nullable
  public String getDetailedErrMessage() {
    return detailedErrMessage;
  }

  public void setDetailedErrMessage(String detailedErrMessage) {
    this.detailedErrMessage = detailedErrMessage;
  }


  public Healthcollectorv3UtilizationParameterObject error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Error message.
   * @return error
  **/
  @javax.annotation.Nullable
  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }


  public Healthcollectorv3UtilizationParameterObject freeBufferSpaceValue(Integer freeBufferSpaceValue) {
    this.freeBufferSpaceValue = freeBufferSpaceValue;
    return this;
  }

   /**
   * Free buffer space value.
   * @return freeBufferSpaceValue
  **/
  @javax.annotation.Nullable
  public Integer getFreeBufferSpaceValue() {
    return freeBufferSpaceValue;
  }

  public void setFreeBufferSpaceValue(Integer freeBufferSpaceValue) {
    this.freeBufferSpaceValue = freeBufferSpaceValue;
  }


  public Healthcollectorv3UtilizationParameterObject loggerQueueValue(Integer loggerQueueValue) {
    this.loggerQueueValue = loggerQueueValue;
    return this;
  }

   /**
   * Logger queue value.
   * @return loggerQueueValue
  **/
  @javax.annotation.Nullable
  public Integer getLoggerQueueValue() {
    return loggerQueueValue;
  }

  public void setLoggerQueueValue(Integer loggerQueueValue) {
    this.loggerQueueValue = loggerQueueValue;
  }


  public Healthcollectorv3UtilizationParameterObject mysqlDiskUsageValue(Integer mysqlDiskUsageValue) {
    this.mysqlDiskUsageValue = mysqlDiskUsageValue;
    return this;
  }

   /**
   * MySQL Disk usage.
   * @return mysqlDiskUsageValue
  **/
  @javax.annotation.Nullable
  public Integer getMysqlDiskUsageValue() {
    return mysqlDiskUsageValue;
  }

  public void setMysqlDiskUsageValue(Integer mysqlDiskUsageValue) {
    this.mysqlDiskUsageValue = mysqlDiskUsageValue;
  }


  public Healthcollectorv3UtilizationParameterObject noOfExceptionsValue(Integer noOfExceptionsValue) {
    this.noOfExceptionsValue = noOfExceptionsValue;
    return this;
  }

   /**
   * Number of exceptions.
   * @return noOfExceptionsValue
  **/
  @javax.annotation.Nullable
  public Integer getNoOfExceptionsValue() {
    return noOfExceptionsValue;
  }

  public void setNoOfExceptionsValue(Integer noOfExceptionsValue) {
    this.noOfExceptionsValue = noOfExceptionsValue;
  }


  public Healthcollectorv3UtilizationParameterObject noOfFlatLogRequestsValue(Integer noOfFlatLogRequestsValue) {
    this.noOfFlatLogRequestsValue = noOfFlatLogRequestsValue;
    return this;
  }

   /**
   * Flat log requests value.
   * @return noOfFlatLogRequestsValue
  **/
  @javax.annotation.Nullable
  public Integer getNoOfFlatLogRequestsValue() {
    return noOfFlatLogRequestsValue;
  }

  public void setNoOfFlatLogRequestsValue(Integer noOfFlatLogRequestsValue) {
    this.noOfFlatLogRequestsValue = noOfFlatLogRequestsValue;
  }


  public Healthcollectorv3UtilizationParameterObject noOfPolicyViolationsValue(Integer noOfPolicyViolationsValue) {
    this.noOfPolicyViolationsValue = noOfPolicyViolationsValue;
    return this;
  }

   /**
   * Number of policy violations.
   * @return noOfPolicyViolationsValue
  **/
  @javax.annotation.Nullable
  public Integer getNoOfPolicyViolationsValue() {
    return noOfPolicyViolationsValue;
  }

  public void setNoOfPolicyViolationsValue(Integer noOfPolicyViolationsValue) {
    this.noOfPolicyViolationsValue = noOfPolicyViolationsValue;
  }


  public Healthcollectorv3UtilizationParameterObject noOfRequestsValue(Integer noOfRequestsValue) {
    this.noOfRequestsValue = noOfRequestsValue;
    return this;
  }

   /**
   * Number of requests.
   * @return noOfRequestsValue
  **/
  @javax.annotation.Nullable
  public Integer getNoOfRequestsValue() {
    return noOfRequestsValue;
  }

  public void setNoOfRequestsValue(Integer noOfRequestsValue) {
    this.noOfRequestsValue = noOfRequestsValue;
  }


  public Healthcollectorv3UtilizationParameterObject noOfRestartsValue(Integer noOfRestartsValue) {
    this.noOfRestartsValue = noOfRestartsValue;
    return this;
  }

   /**
   * Number of restarts.
   * @return noOfRestartsValue
  **/
  @javax.annotation.Nullable
  public Integer getNoOfRestartsValue() {
    return noOfRestartsValue;
  }

  public void setNoOfRestartsValue(Integer noOfRestartsValue) {
    this.noOfRestartsValue = noOfRestartsValue;
  }


  public Healthcollectorv3UtilizationParameterObject precMysqlMemoryValue(Integer precMysqlMemoryValue) {
    this.precMysqlMemoryValue = precMysqlMemoryValue;
    return this;
  }

   /**
   * MySQL memory value.
   * @return precMysqlMemoryValue
  **/
  @javax.annotation.Nullable
  public Integer getPrecMysqlMemoryValue() {
    return precMysqlMemoryValue;
  }

  public void setPrecMysqlMemoryValue(Integer precMysqlMemoryValue) {
    this.precMysqlMemoryValue = precMysqlMemoryValue;
  }


  public Healthcollectorv3UtilizationParameterObject snifferMemoryValue(Integer snifferMemoryValue) {
    this.snifferMemoryValue = snifferMemoryValue;
    return this;
  }

   /**
   * Sniffer memory value.
   * @return snifferMemoryValue
  **/
  @javax.annotation.Nullable
  public Integer getSnifferMemoryValue() {
    return snifferMemoryValue;
  }

  public void setSnifferMemoryValue(Integer snifferMemoryValue) {
    this.snifferMemoryValue = snifferMemoryValue;
  }


  public Healthcollectorv3UtilizationParameterObject systemCpuLoadValue(Integer systemCpuLoadValue) {
    this.systemCpuLoadValue = systemCpuLoadValue;
    return this;
  }

   /**
   * CPU load value.
   * @return systemCpuLoadValue
  **/
  @javax.annotation.Nullable
  public Integer getSystemCpuLoadValue() {
    return systemCpuLoadValue;
  }

  public void setSystemCpuLoadValue(Integer systemCpuLoadValue) {
    this.systemCpuLoadValue = systemCpuLoadValue;
  }


  public Healthcollectorv3UtilizationParameterObject systemVarDiskUsageValue(Integer systemVarDiskUsageValue) {
    this.systemVarDiskUsageValue = systemVarDiskUsageValue;
    return this;
  }

   /**
   * System var disk usage value.
   * @return systemVarDiskUsageValue
  **/
  @javax.annotation.Nullable
  public Integer getSystemVarDiskUsageValue() {
    return systemVarDiskUsageValue;
  }

  public void setSystemVarDiskUsageValue(Integer systemVarDiskUsageValue) {
    this.systemVarDiskUsageValue = systemVarDiskUsageValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3UtilizationParameterObject healthcollectorv3UtilizationParameterObject = (Healthcollectorv3UtilizationParameterObject) o;
    return Objects.equals(this.analyzerQueueValue, healthcollectorv3UtilizationParameterObject.analyzerQueueValue) &&
        Objects.equals(this.detailedErrMessage, healthcollectorv3UtilizationParameterObject.detailedErrMessage) &&
        Objects.equals(this.error, healthcollectorv3UtilizationParameterObject.error) &&
        Objects.equals(this.freeBufferSpaceValue, healthcollectorv3UtilizationParameterObject.freeBufferSpaceValue) &&
        Objects.equals(this.loggerQueueValue, healthcollectorv3UtilizationParameterObject.loggerQueueValue) &&
        Objects.equals(this.mysqlDiskUsageValue, healthcollectorv3UtilizationParameterObject.mysqlDiskUsageValue) &&
        Objects.equals(this.noOfExceptionsValue, healthcollectorv3UtilizationParameterObject.noOfExceptionsValue) &&
        Objects.equals(this.noOfFlatLogRequestsValue, healthcollectorv3UtilizationParameterObject.noOfFlatLogRequestsValue) &&
        Objects.equals(this.noOfPolicyViolationsValue, healthcollectorv3UtilizationParameterObject.noOfPolicyViolationsValue) &&
        Objects.equals(this.noOfRequestsValue, healthcollectorv3UtilizationParameterObject.noOfRequestsValue) &&
        Objects.equals(this.noOfRestartsValue, healthcollectorv3UtilizationParameterObject.noOfRestartsValue) &&
        Objects.equals(this.precMysqlMemoryValue, healthcollectorv3UtilizationParameterObject.precMysqlMemoryValue) &&
        Objects.equals(this.snifferMemoryValue, healthcollectorv3UtilizationParameterObject.snifferMemoryValue) &&
        Objects.equals(this.systemCpuLoadValue, healthcollectorv3UtilizationParameterObject.systemCpuLoadValue) &&
        Objects.equals(this.systemVarDiskUsageValue, healthcollectorv3UtilizationParameterObject.systemVarDiskUsageValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzerQueueValue, detailedErrMessage, error, freeBufferSpaceValue, loggerQueueValue, mysqlDiskUsageValue, noOfExceptionsValue, noOfFlatLogRequestsValue, noOfPolicyViolationsValue, noOfRequestsValue, noOfRestartsValue, precMysqlMemoryValue, snifferMemoryValue, systemCpuLoadValue, systemVarDiskUsageValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3UtilizationParameterObject {\n");
    sb.append("    analyzerQueueValue: ").append(toIndentedString(analyzerQueueValue)).append("\n");
    sb.append("    detailedErrMessage: ").append(toIndentedString(detailedErrMessage)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    freeBufferSpaceValue: ").append(toIndentedString(freeBufferSpaceValue)).append("\n");
    sb.append("    loggerQueueValue: ").append(toIndentedString(loggerQueueValue)).append("\n");
    sb.append("    mysqlDiskUsageValue: ").append(toIndentedString(mysqlDiskUsageValue)).append("\n");
    sb.append("    noOfExceptionsValue: ").append(toIndentedString(noOfExceptionsValue)).append("\n");
    sb.append("    noOfFlatLogRequestsValue: ").append(toIndentedString(noOfFlatLogRequestsValue)).append("\n");
    sb.append("    noOfPolicyViolationsValue: ").append(toIndentedString(noOfPolicyViolationsValue)).append("\n");
    sb.append("    noOfRequestsValue: ").append(toIndentedString(noOfRequestsValue)).append("\n");
    sb.append("    noOfRestartsValue: ").append(toIndentedString(noOfRestartsValue)).append("\n");
    sb.append("    precMysqlMemoryValue: ").append(toIndentedString(precMysqlMemoryValue)).append("\n");
    sb.append("    snifferMemoryValue: ").append(toIndentedString(snifferMemoryValue)).append("\n");
    sb.append("    systemCpuLoadValue: ").append(toIndentedString(systemCpuLoadValue)).append("\n");
    sb.append("    systemVarDiskUsageValue: ").append(toIndentedString(systemVarDiskUsageValue)).append("\n");
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
    openapiFields.add("analyzer_queue_value");
    openapiFields.add("detailed_err_message");
    openapiFields.add("error");
    openapiFields.add("free_buffer_space_value");
    openapiFields.add("logger_queue_value");
    openapiFields.add("mysql_disk_usage_value");
    openapiFields.add("no_of_exceptions_value");
    openapiFields.add("no_of_flat_log_requests_value");
    openapiFields.add("no_of_policy_violations_value");
    openapiFields.add("no_of_requests_value");
    openapiFields.add("no_of_restarts_value");
    openapiFields.add("prec_mysql_memory_value");
    openapiFields.add("sniffer_memory_value");
    openapiFields.add("system_cpu_load_value");
    openapiFields.add("system_var_disk_usage_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3UtilizationParameterObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3UtilizationParameterObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3UtilizationParameterObject is not found in the empty JSON string", Healthcollectorv3UtilizationParameterObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3UtilizationParameterObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3UtilizationParameterObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("detailed_err_message") != null && !jsonObj.get("detailed_err_message").isJsonNull()) && !jsonObj.get("detailed_err_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detailed_err_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detailed_err_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3UtilizationParameterObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3UtilizationParameterObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3UtilizationParameterObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3UtilizationParameterObject.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3UtilizationParameterObject>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3UtilizationParameterObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3UtilizationParameterObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3UtilizationParameterObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3UtilizationParameterObject
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3UtilizationParameterObject
  */
  public static Healthcollectorv3UtilizationParameterObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3UtilizationParameterObject.class);
  }

 /**
  * Convert an instance of Healthcollectorv3UtilizationParameterObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

