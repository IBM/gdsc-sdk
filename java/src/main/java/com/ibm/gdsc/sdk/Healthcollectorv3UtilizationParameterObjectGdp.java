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
 * UnitUtilizationParameterObject gets information about unit utilization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-18T18:23:51.166908Z[UTC]", comments = "Generator version: 7.6.0")
public class Healthcollectorv3UtilizationParameterObjectGdp {
  public static final String SERIALIZED_NAME_ANALYZER_QUEUE_VALUE = "analyzer_queue_value";
  @SerializedName(SERIALIZED_NAME_ANALYZER_QUEUE_VALUE)
  private Integer analyzerQueueValue;

  public static final String SERIALIZED_NAME_ERROR_MESSAGES_CODE = "error_messages_code";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES_CODE)
  private Integer errorMessagesCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGES_VALUE = "error_messages_value";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES_VALUE)
  private String errorMessagesValue;

  public static final String SERIALIZED_NAME_FREE_BUFF_SPACE_VALUE = "free_buff_space_value";
  @SerializedName(SERIALIZED_NAME_FREE_BUFF_SPACE_VALUE)
  private Integer freeBuffSpaceValue;

  public static final String SERIALIZED_NAME_LOGGER_QUEUE_VALUE = "logger_queue_value";
  @SerializedName(SERIALIZED_NAME_LOGGER_QUEUE_VALUE)
  private Integer loggerQueueValue;

  public static final String SERIALIZED_NAME_MYSQL_DISK_USAGE_VALUE = "mysql_disk_usage_value";
  @SerializedName(SERIALIZED_NAME_MYSQL_DISK_USAGE_VALUE)
  private Integer mysqlDiskUsageValue;

  public static final String SERIALIZED_NAME_NO_OF_RESTARTS_VALUE = "no_of_restarts_value";
  @SerializedName(SERIALIZED_NAME_NO_OF_RESTARTS_VALUE)
  private Integer noOfRestartsValue;

  public static final String SERIALIZED_NAME_NUM_OF_EXCEPTIONS_VALUE = "num_of_exceptions_value";
  @SerializedName(SERIALIZED_NAME_NUM_OF_EXCEPTIONS_VALUE)
  private Integer numOfExceptionsValue;

  public static final String SERIALIZED_NAME_NUM_OF_FLAT_LOG_REQUESTS_VALUE = "num_of_flat_log_requests_value";
  @SerializedName(SERIALIZED_NAME_NUM_OF_FLAT_LOG_REQUESTS_VALUE)
  private Integer numOfFlatLogRequestsValue;

  public static final String SERIALIZED_NAME_NUM_OF_POLICY_VIOLATIONS_VALUE = "num_of_policy_violations_value";
  @SerializedName(SERIALIZED_NAME_NUM_OF_POLICY_VIOLATIONS_VALUE)
  private Integer numOfPolicyViolationsValue;

  public static final String SERIALIZED_NAME_NUM_OF_REQUESTS_VALUE = "num_of_requests_value";
  @SerializedName(SERIALIZED_NAME_NUM_OF_REQUESTS_VALUE)
  private Integer numOfRequestsValue;

  public static final String SERIALIZED_NAME_PREC_MYSQL_MEM_VALUE = "prec_mysql_mem_value";
  @SerializedName(SERIALIZED_NAME_PREC_MYSQL_MEM_VALUE)
  private Integer precMysqlMemValue;

  public static final String SERIALIZED_NAME_SNIF_MEMORY_VALUE = "snif_memory_value";
  @SerializedName(SERIALIZED_NAME_SNIF_MEMORY_VALUE)
  private Integer snifMemoryValue;

  public static final String SERIALIZED_NAME_SYS_VAR_DISK_USAGE_VALUE = "sys_var_disk_usage_value";
  @SerializedName(SERIALIZED_NAME_SYS_VAR_DISK_USAGE_VALUE)
  private Integer sysVarDiskUsageValue;

  public static final String SERIALIZED_NAME_SYSTEM_CPU_LOAD_VALUE = "system_cpu_load_value";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CPU_LOAD_VALUE)
  private Integer systemCpuLoadValue;

  public Healthcollectorv3UtilizationParameterObjectGdp() {
  }

  public Healthcollectorv3UtilizationParameterObjectGdp analyzerQueueValue(Integer analyzerQueueValue) {
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


  public Healthcollectorv3UtilizationParameterObjectGdp errorMessagesCode(Integer errorMessagesCode) {
    this.errorMessagesCode = errorMessagesCode;
    return this;
  }

   /**
   * Error message.
   * @return errorMessagesCode
  **/
  @javax.annotation.Nullable
  public Integer getErrorMessagesCode() {
    return errorMessagesCode;
  }

  public void setErrorMessagesCode(Integer errorMessagesCode) {
    this.errorMessagesCode = errorMessagesCode;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp errorMessagesValue(String errorMessagesValue) {
    this.errorMessagesValue = errorMessagesValue;
    return this;
  }

   /**
   * Detailed error message.
   * @return errorMessagesValue
  **/
  @javax.annotation.Nullable
  public String getErrorMessagesValue() {
    return errorMessagesValue;
  }

  public void setErrorMessagesValue(String errorMessagesValue) {
    this.errorMessagesValue = errorMessagesValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp freeBuffSpaceValue(Integer freeBuffSpaceValue) {
    this.freeBuffSpaceValue = freeBuffSpaceValue;
    return this;
  }

   /**
   * Free buffer space value.
   * @return freeBuffSpaceValue
  **/
  @javax.annotation.Nullable
  public Integer getFreeBuffSpaceValue() {
    return freeBuffSpaceValue;
  }

  public void setFreeBuffSpaceValue(Integer freeBuffSpaceValue) {
    this.freeBuffSpaceValue = freeBuffSpaceValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp loggerQueueValue(Integer loggerQueueValue) {
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


  public Healthcollectorv3UtilizationParameterObjectGdp mysqlDiskUsageValue(Integer mysqlDiskUsageValue) {
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


  public Healthcollectorv3UtilizationParameterObjectGdp noOfRestartsValue(Integer noOfRestartsValue) {
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


  public Healthcollectorv3UtilizationParameterObjectGdp numOfExceptionsValue(Integer numOfExceptionsValue) {
    this.numOfExceptionsValue = numOfExceptionsValue;
    return this;
  }

   /**
   * Number of exceptions.
   * @return numOfExceptionsValue
  **/
  @javax.annotation.Nullable
  public Integer getNumOfExceptionsValue() {
    return numOfExceptionsValue;
  }

  public void setNumOfExceptionsValue(Integer numOfExceptionsValue) {
    this.numOfExceptionsValue = numOfExceptionsValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp numOfFlatLogRequestsValue(Integer numOfFlatLogRequestsValue) {
    this.numOfFlatLogRequestsValue = numOfFlatLogRequestsValue;
    return this;
  }

   /**
   * Flat log requests value.
   * @return numOfFlatLogRequestsValue
  **/
  @javax.annotation.Nullable
  public Integer getNumOfFlatLogRequestsValue() {
    return numOfFlatLogRequestsValue;
  }

  public void setNumOfFlatLogRequestsValue(Integer numOfFlatLogRequestsValue) {
    this.numOfFlatLogRequestsValue = numOfFlatLogRequestsValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp numOfPolicyViolationsValue(Integer numOfPolicyViolationsValue) {
    this.numOfPolicyViolationsValue = numOfPolicyViolationsValue;
    return this;
  }

   /**
   * Number of policy violations.
   * @return numOfPolicyViolationsValue
  **/
  @javax.annotation.Nullable
  public Integer getNumOfPolicyViolationsValue() {
    return numOfPolicyViolationsValue;
  }

  public void setNumOfPolicyViolationsValue(Integer numOfPolicyViolationsValue) {
    this.numOfPolicyViolationsValue = numOfPolicyViolationsValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp numOfRequestsValue(Integer numOfRequestsValue) {
    this.numOfRequestsValue = numOfRequestsValue;
    return this;
  }

   /**
   * Number of requests.
   * @return numOfRequestsValue
  **/
  @javax.annotation.Nullable
  public Integer getNumOfRequestsValue() {
    return numOfRequestsValue;
  }

  public void setNumOfRequestsValue(Integer numOfRequestsValue) {
    this.numOfRequestsValue = numOfRequestsValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp precMysqlMemValue(Integer precMysqlMemValue) {
    this.precMysqlMemValue = precMysqlMemValue;
    return this;
  }

   /**
   * MySQL memory value.
   * @return precMysqlMemValue
  **/
  @javax.annotation.Nullable
  public Integer getPrecMysqlMemValue() {
    return precMysqlMemValue;
  }

  public void setPrecMysqlMemValue(Integer precMysqlMemValue) {
    this.precMysqlMemValue = precMysqlMemValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp snifMemoryValue(Integer snifMemoryValue) {
    this.snifMemoryValue = snifMemoryValue;
    return this;
  }

   /**
   * Sniffer memory value.
   * @return snifMemoryValue
  **/
  @javax.annotation.Nullable
  public Integer getSnifMemoryValue() {
    return snifMemoryValue;
  }

  public void setSnifMemoryValue(Integer snifMemoryValue) {
    this.snifMemoryValue = snifMemoryValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp sysVarDiskUsageValue(Integer sysVarDiskUsageValue) {
    this.sysVarDiskUsageValue = sysVarDiskUsageValue;
    return this;
  }

   /**
   * System var disk usage value.
   * @return sysVarDiskUsageValue
  **/
  @javax.annotation.Nullable
  public Integer getSysVarDiskUsageValue() {
    return sysVarDiskUsageValue;
  }

  public void setSysVarDiskUsageValue(Integer sysVarDiskUsageValue) {
    this.sysVarDiskUsageValue = sysVarDiskUsageValue;
  }


  public Healthcollectorv3UtilizationParameterObjectGdp systemCpuLoadValue(Integer systemCpuLoadValue) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcollectorv3UtilizationParameterObjectGdp healthcollectorv3UtilizationParameterObjectGdp = (Healthcollectorv3UtilizationParameterObjectGdp) o;
    return Objects.equals(this.analyzerQueueValue, healthcollectorv3UtilizationParameterObjectGdp.analyzerQueueValue) &&
        Objects.equals(this.errorMessagesCode, healthcollectorv3UtilizationParameterObjectGdp.errorMessagesCode) &&
        Objects.equals(this.errorMessagesValue, healthcollectorv3UtilizationParameterObjectGdp.errorMessagesValue) &&
        Objects.equals(this.freeBuffSpaceValue, healthcollectorv3UtilizationParameterObjectGdp.freeBuffSpaceValue) &&
        Objects.equals(this.loggerQueueValue, healthcollectorv3UtilizationParameterObjectGdp.loggerQueueValue) &&
        Objects.equals(this.mysqlDiskUsageValue, healthcollectorv3UtilizationParameterObjectGdp.mysqlDiskUsageValue) &&
        Objects.equals(this.noOfRestartsValue, healthcollectorv3UtilizationParameterObjectGdp.noOfRestartsValue) &&
        Objects.equals(this.numOfExceptionsValue, healthcollectorv3UtilizationParameterObjectGdp.numOfExceptionsValue) &&
        Objects.equals(this.numOfFlatLogRequestsValue, healthcollectorv3UtilizationParameterObjectGdp.numOfFlatLogRequestsValue) &&
        Objects.equals(this.numOfPolicyViolationsValue, healthcollectorv3UtilizationParameterObjectGdp.numOfPolicyViolationsValue) &&
        Objects.equals(this.numOfRequestsValue, healthcollectorv3UtilizationParameterObjectGdp.numOfRequestsValue) &&
        Objects.equals(this.precMysqlMemValue, healthcollectorv3UtilizationParameterObjectGdp.precMysqlMemValue) &&
        Objects.equals(this.snifMemoryValue, healthcollectorv3UtilizationParameterObjectGdp.snifMemoryValue) &&
        Objects.equals(this.sysVarDiskUsageValue, healthcollectorv3UtilizationParameterObjectGdp.sysVarDiskUsageValue) &&
        Objects.equals(this.systemCpuLoadValue, healthcollectorv3UtilizationParameterObjectGdp.systemCpuLoadValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzerQueueValue, errorMessagesCode, errorMessagesValue, freeBuffSpaceValue, loggerQueueValue, mysqlDiskUsageValue, noOfRestartsValue, numOfExceptionsValue, numOfFlatLogRequestsValue, numOfPolicyViolationsValue, numOfRequestsValue, precMysqlMemValue, snifMemoryValue, sysVarDiskUsageValue, systemCpuLoadValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcollectorv3UtilizationParameterObjectGdp {\n");
    sb.append("    analyzerQueueValue: ").append(toIndentedString(analyzerQueueValue)).append("\n");
    sb.append("    errorMessagesCode: ").append(toIndentedString(errorMessagesCode)).append("\n");
    sb.append("    errorMessagesValue: ").append(toIndentedString(errorMessagesValue)).append("\n");
    sb.append("    freeBuffSpaceValue: ").append(toIndentedString(freeBuffSpaceValue)).append("\n");
    sb.append("    loggerQueueValue: ").append(toIndentedString(loggerQueueValue)).append("\n");
    sb.append("    mysqlDiskUsageValue: ").append(toIndentedString(mysqlDiskUsageValue)).append("\n");
    sb.append("    noOfRestartsValue: ").append(toIndentedString(noOfRestartsValue)).append("\n");
    sb.append("    numOfExceptionsValue: ").append(toIndentedString(numOfExceptionsValue)).append("\n");
    sb.append("    numOfFlatLogRequestsValue: ").append(toIndentedString(numOfFlatLogRequestsValue)).append("\n");
    sb.append("    numOfPolicyViolationsValue: ").append(toIndentedString(numOfPolicyViolationsValue)).append("\n");
    sb.append("    numOfRequestsValue: ").append(toIndentedString(numOfRequestsValue)).append("\n");
    sb.append("    precMysqlMemValue: ").append(toIndentedString(precMysqlMemValue)).append("\n");
    sb.append("    snifMemoryValue: ").append(toIndentedString(snifMemoryValue)).append("\n");
    sb.append("    sysVarDiskUsageValue: ").append(toIndentedString(sysVarDiskUsageValue)).append("\n");
    sb.append("    systemCpuLoadValue: ").append(toIndentedString(systemCpuLoadValue)).append("\n");
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
    openapiFields.add("error_messages_code");
    openapiFields.add("error_messages_value");
    openapiFields.add("free_buff_space_value");
    openapiFields.add("logger_queue_value");
    openapiFields.add("mysql_disk_usage_value");
    openapiFields.add("no_of_restarts_value");
    openapiFields.add("num_of_exceptions_value");
    openapiFields.add("num_of_flat_log_requests_value");
    openapiFields.add("num_of_policy_violations_value");
    openapiFields.add("num_of_requests_value");
    openapiFields.add("prec_mysql_mem_value");
    openapiFields.add("snif_memory_value");
    openapiFields.add("sys_var_disk_usage_value");
    openapiFields.add("system_cpu_load_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Healthcollectorv3UtilizationParameterObjectGdp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Healthcollectorv3UtilizationParameterObjectGdp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Healthcollectorv3UtilizationParameterObjectGdp is not found in the empty JSON string", Healthcollectorv3UtilizationParameterObjectGdp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Healthcollectorv3UtilizationParameterObjectGdp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Healthcollectorv3UtilizationParameterObjectGdp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error_messages_value") != null && !jsonObj.get("error_messages_value").isJsonNull()) && !jsonObj.get("error_messages_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_messages_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_messages_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Healthcollectorv3UtilizationParameterObjectGdp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Healthcollectorv3UtilizationParameterObjectGdp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Healthcollectorv3UtilizationParameterObjectGdp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Healthcollectorv3UtilizationParameterObjectGdp.class));

       return (TypeAdapter<T>) new TypeAdapter<Healthcollectorv3UtilizationParameterObjectGdp>() {
           @Override
           public void write(JsonWriter out, Healthcollectorv3UtilizationParameterObjectGdp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Healthcollectorv3UtilizationParameterObjectGdp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Healthcollectorv3UtilizationParameterObjectGdp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Healthcollectorv3UtilizationParameterObjectGdp
  * @throws IOException if the JSON string is invalid with respect to Healthcollectorv3UtilizationParameterObjectGdp
  */
  public static Healthcollectorv3UtilizationParameterObjectGdp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcollectorv3UtilizationParameterObjectGdp.class);
  }

 /**
  * Convert an instance of Healthcollectorv3UtilizationParameterObjectGdp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

