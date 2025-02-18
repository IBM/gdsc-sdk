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


package com.ibm.gdsc.sdk.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3AppDeployment;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3AppFile;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3AppHpa;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3AppSecret;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3Container;
import com.ibm.gdsc.sdk.models.Resourcecontrollerk8v3InitContainer;
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

import com.ibm.gdsc.sdk.JSON;

/**
 * App contains the information about an app.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T13:24:05.648078332-08:00[America/Los_Angeles]", comments = "Generator version: 7.6.0")
public class Resourcecontrollerk8v3App {
  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private Resourcecontrollerk8v3Container container;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_DEPLOYMENT = "deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private Resourcecontrollerk8v3AppDeployment deployment;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "empty_dir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private String emptyDir;

  public static final String SERIALIZED_NAME_FILE_IDS = "file_ids";
  @SerializedName(SERIALIZED_NAME_FILE_IDS)
  private List<String> fileIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<Resourcecontrollerk8v3AppFile> files = new ArrayList<>();

  public static final String SERIALIZED_NAME_HPA = "hpa";
  @SerializedName(SERIALIZED_NAME_HPA)
  private Resourcecontrollerk8v3AppHpa hpa;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "init_containers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<Resourcecontrollerk8v3InitContainer> initContainers = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private String modified;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<Resourcecontrollerk8v3AppSecret> secrets = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TENANT_UUID = "tenant_uuid";
  @SerializedName(SERIALIZED_NAME_TENANT_UUID)
  private String tenantUuid;

  public Resourcecontrollerk8v3App() {
  }

  public Resourcecontrollerk8v3App container(Resourcecontrollerk8v3Container container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  public Resourcecontrollerk8v3Container getContainer() {
    return container;
  }

  public void setContainer(Resourcecontrollerk8v3Container container) {
    this.container = container;
  }


  public Resourcecontrollerk8v3App created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Optional: The date this app was created (ms since epoch).
   * @return created
  **/
  @javax.annotation.Nullable
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }


  public Resourcecontrollerk8v3App deployment(Resourcecontrollerk8v3AppDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

   /**
   * Get deployment
   * @return deployment
  **/
  @javax.annotation.Nullable
  public Resourcecontrollerk8v3AppDeployment getDeployment() {
    return deployment;
  }

  public void setDeployment(Resourcecontrollerk8v3AppDeployment deployment) {
    this.deployment = deployment;
  }


  public Resourcecontrollerk8v3App emptyDir(String emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * Optional: The path for mounted empty directory. All containers in pod have read/write permission to it.
   * @return emptyDir
  **/
  @javax.annotation.Nullable
  public String getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(String emptyDir) {
    this.emptyDir = emptyDir;
  }


  public Resourcecontrollerk8v3App fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public Resourcecontrollerk8v3App addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * Optional: The internal IDs of the files for the app. This is deprecated in favor of the files field.
   * @return fileIds
  **/
  @javax.annotation.Nullable
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }


  public Resourcecontrollerk8v3App files(List<Resourcecontrollerk8v3AppFile> files) {
    this.files = files;
    return this;
  }

  public Resourcecontrollerk8v3App addFilesItem(Resourcecontrollerk8v3AppFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Optional: The files for the app.
   * @return files
  **/
  @javax.annotation.Nullable
  public List<Resourcecontrollerk8v3AppFile> getFiles() {
    return files;
  }

  public void setFiles(List<Resourcecontrollerk8v3AppFile> files) {
    this.files = files;
  }


  public Resourcecontrollerk8v3App hpa(Resourcecontrollerk8v3AppHpa hpa) {
    this.hpa = hpa;
    return this;
  }

   /**
   * Get hpa
   * @return hpa
  **/
  @javax.annotation.Nullable
  public Resourcecontrollerk8v3AppHpa getHpa() {
    return hpa;
  }

  public void setHpa(Resourcecontrollerk8v3AppHpa hpa) {
    this.hpa = hpa;
  }


  public Resourcecontrollerk8v3App id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The internal ID of the app.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Resourcecontrollerk8v3App initContainers(List<Resourcecontrollerk8v3InitContainer> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public Resourcecontrollerk8v3App addInitContainersItem(Resourcecontrollerk8v3InitContainer initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * Get initContainers
   * @return initContainers
  **/
  @javax.annotation.Nullable
  public List<Resourcecontrollerk8v3InitContainer> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<Resourcecontrollerk8v3InitContainer> initContainers) {
    this.initContainers = initContainers;
  }


  public Resourcecontrollerk8v3App modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Optional: The date this app was modified (ms since epoch).
   * @return modified
  **/
  @javax.annotation.Nullable
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  public Resourcecontrollerk8v3App name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the app.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Resourcecontrollerk8v3App secrets(List<Resourcecontrollerk8v3AppSecret> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Resourcecontrollerk8v3App addSecretsItem(Resourcecontrollerk8v3AppSecret secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Optional: The secrets for the app.
   * @return secrets
  **/
  @javax.annotation.Nullable
  public List<Resourcecontrollerk8v3AppSecret> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<Resourcecontrollerk8v3AppSecret> secrets) {
    this.secrets = secrets;
  }


  public Resourcecontrollerk8v3App status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Optional: The status of the app.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Resourcecontrollerk8v3App tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id for the app.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public Resourcecontrollerk8v3App tenantUuid(String tenantUuid) {
    this.tenantUuid = tenantUuid;
    return this;
  }

   /**
   * The internal ID of the tenant for the app.
   * @return tenantUuid
  **/
  @javax.annotation.Nullable
  public String getTenantUuid() {
    return tenantUuid;
  }

  public void setTenantUuid(String tenantUuid) {
    this.tenantUuid = tenantUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resourcecontrollerk8v3App resourcecontrollerk8v3App = (Resourcecontrollerk8v3App) o;
    return Objects.equals(this.container, resourcecontrollerk8v3App.container) &&
        Objects.equals(this.created, resourcecontrollerk8v3App.created) &&
        Objects.equals(this.deployment, resourcecontrollerk8v3App.deployment) &&
        Objects.equals(this.emptyDir, resourcecontrollerk8v3App.emptyDir) &&
        Objects.equals(this.fileIds, resourcecontrollerk8v3App.fileIds) &&
        Objects.equals(this.files, resourcecontrollerk8v3App.files) &&
        Objects.equals(this.hpa, resourcecontrollerk8v3App.hpa) &&
        Objects.equals(this.id, resourcecontrollerk8v3App.id) &&
        Objects.equals(this.initContainers, resourcecontrollerk8v3App.initContainers) &&
        Objects.equals(this.modified, resourcecontrollerk8v3App.modified) &&
        Objects.equals(this.name, resourcecontrollerk8v3App.name) &&
        Objects.equals(this.secrets, resourcecontrollerk8v3App.secrets) &&
        Objects.equals(this.status, resourcecontrollerk8v3App.status) &&
        Objects.equals(this.tenantId, resourcecontrollerk8v3App.tenantId) &&
        Objects.equals(this.tenantUuid, resourcecontrollerk8v3App.tenantUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, created, deployment, emptyDir, fileIds, files, hpa, id, initContainers, modified, name, secrets, status, tenantId, tenantUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resourcecontrollerk8v3App {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    hpa: ").append(toIndentedString(hpa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
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
    openapiFields.add("container");
    openapiFields.add("created");
    openapiFields.add("deployment");
    openapiFields.add("empty_dir");
    openapiFields.add("file_ids");
    openapiFields.add("files");
    openapiFields.add("hpa");
    openapiFields.add("id");
    openapiFields.add("init_containers");
    openapiFields.add("modified");
    openapiFields.add("name");
    openapiFields.add("secrets");
    openapiFields.add("status");
    openapiFields.add("tenant_id");
    openapiFields.add("tenant_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Resourcecontrollerk8v3App
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Resourcecontrollerk8v3App.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Resourcecontrollerk8v3App is not found in the empty JSON string", Resourcecontrollerk8v3App.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Resourcecontrollerk8v3App.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Resourcecontrollerk8v3App` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `container`
      if (jsonObj.get("container") != null && !jsonObj.get("container").isJsonNull()) {
        Resourcecontrollerk8v3Container.validateJsonElement(jsonObj.get("container"));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      // validate the optional field `deployment`
      if (jsonObj.get("deployment") != null && !jsonObj.get("deployment").isJsonNull()) {
        Resourcecontrollerk8v3AppDeployment.validateJsonElement(jsonObj.get("deployment"));
      }
      if ((jsonObj.get("empty_dir") != null && !jsonObj.get("empty_dir").isJsonNull()) && !jsonObj.get("empty_dir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `empty_dir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("empty_dir").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("file_ids") != null && !jsonObj.get("file_ids").isJsonNull() && !jsonObj.get("file_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_ids` to be an array in the JSON string but got `%s`", jsonObj.get("file_ids").toString()));
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            Resourcecontrollerk8v3AppFile.validateJsonElement(jsonArrayfiles.get(i));
          };
        }
      }
      // validate the optional field `hpa`
      if (jsonObj.get("hpa") != null && !jsonObj.get("hpa").isJsonNull()) {
        Resourcecontrollerk8v3AppHpa.validateJsonElement(jsonObj.get("hpa"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("init_containers") != null && !jsonObj.get("init_containers").isJsonNull()) {
        JsonArray jsonArrayinitContainers = jsonObj.getAsJsonArray("init_containers");
        if (jsonArrayinitContainers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("init_containers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `init_containers` to be an array in the JSON string but got `%s`", jsonObj.get("init_containers").toString()));
          }

          // validate the optional field `init_containers` (array)
          for (int i = 0; i < jsonArrayinitContainers.size(); i++) {
            Resourcecontrollerk8v3InitContainer.validateJsonElement(jsonArrayinitContainers.get(i));
          };
        }
      }
      if ((jsonObj.get("modified") != null && !jsonObj.get("modified").isJsonNull()) && !jsonObj.get("modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modified").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("secrets") != null && !jsonObj.get("secrets").isJsonNull()) {
        JsonArray jsonArraysecrets = jsonObj.getAsJsonArray("secrets");
        if (jsonArraysecrets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secrets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secrets` to be an array in the JSON string but got `%s`", jsonObj.get("secrets").toString()));
          }

          // validate the optional field `secrets` (array)
          for (int i = 0; i < jsonArraysecrets.size(); i++) {
            Resourcecontrollerk8v3AppSecret.validateJsonElement(jsonArraysecrets.get(i));
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("tenant_id") != null && !jsonObj.get("tenant_id").isJsonNull()) && !jsonObj.get("tenant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_id").toString()));
      }
      if ((jsonObj.get("tenant_uuid") != null && !jsonObj.get("tenant_uuid").isJsonNull()) && !jsonObj.get("tenant_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenant_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenant_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Resourcecontrollerk8v3App.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Resourcecontrollerk8v3App' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Resourcecontrollerk8v3App> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Resourcecontrollerk8v3App.class));

       return (TypeAdapter<T>) new TypeAdapter<Resourcecontrollerk8v3App>() {
           @Override
           public void write(JsonWriter out, Resourcecontrollerk8v3App value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Resourcecontrollerk8v3App read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Resourcecontrollerk8v3App given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Resourcecontrollerk8v3App
  * @throws IOException if the JSON string is invalid with respect to Resourcecontrollerk8v3App
  */
  public static Resourcecontrollerk8v3App fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Resourcecontrollerk8v3App.class);
  }

 /**
  * Convert an instance of Resourcecontrollerk8v3App to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

