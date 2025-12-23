# .GuardiumConnectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guardiumConnectorAddCM**](GuardiumConnectorApi.md#guardiumConnectorAddCM) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
[**guardiumConnectorAddDatamarts**](GuardiumConnectorApi.md#guardiumConnectorAddDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP. (This API is called from GDP only)
[**guardiumConnectorAddDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorAddDmExclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
[**guardiumConnectorAddTask**](GuardiumConnectorApi.md#guardiumConnectorAddTask) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP. (This API is called from GDP only)
[**guardiumConnectorBlockUser**](GuardiumConnectorApi.md#guardiumConnectorBlockUser) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**guardiumConnectorConfigureAggregatorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureAggregatorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
[**guardiumConnectorConfigureCollectorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureCollectorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
[**guardiumConnectorConfigureStreaming**](GuardiumConnectorApi.md#guardiumConnectorConfigureStreaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
[**guardiumConnectorDatamartVersionCheck**](GuardiumConnectorApi.md#guardiumConnectorDatamartVersionCheck) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has v5 datamart support. (This API is called from GDP only)
[**guardiumConnectorDeleteCM**](GuardiumConnectorApi.md#guardiumConnectorDeleteCM) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**guardiumConnectorDeleteDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorDeleteDmExclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
[**guardiumConnectorDeleteTask**](GuardiumConnectorApi.md#guardiumConnectorDeleteTask) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id. (This API is called from GDP only)
[**guardiumConnectorDeleteTasks**](GuardiumConnectorApi.md#guardiumConnectorDeleteTasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager\&#39;s tasks by central manager id. (This API is called from GDP only)
[**guardiumConnectorGetAggregatorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetAggregatorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
[**guardiumConnectorGetCMs**](GuardiumConnectorApi.md#guardiumConnectorGetCMs) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
[**guardiumConnectorGetCMsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCMsConfig) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
[**guardiumConnectorGetCollectorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCollectorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
[**guardiumConnectorGetDatamarts**](GuardiumConnectorApi.md#guardiumConnectorGetDatamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**guardiumConnectorGetDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorGetDmExclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
[**guardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicyInfo) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
[**guardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicySummaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
[**guardiumConnectorGetHealthInfo**](GuardiumConnectorApi.md#guardiumConnectorGetHealthInfo) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get health info Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
[**guardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorApi.md#guardiumConnectorGetLatestDMExtractionProfile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for GDSC.
[**guardiumConnectorGetStreamingStatus**](GuardiumConnectorApi.md#guardiumConnectorGetStreamingStatus) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
[**guardiumConnectorGetSyncDMs**](GuardiumConnectorApi.md#guardiumConnectorGetSyncDMs) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager. (This API is called from GDP only)
[**guardiumConnectorGetTaskTypes**](GuardiumConnectorApi.md#guardiumConnectorGetTaskTypes) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
[**guardiumConnectorGetTasks**](GuardiumConnectorApi.md#guardiumConnectorGetTasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager. (This API is called from GDP only)
[**guardiumConnectorRunGDPReport**](GuardiumConnectorApi.md#guardiumConnectorRunGDPReport) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
[**guardiumConnectorSetupCM**](GuardiumConnectorApi.md#guardiumConnectorSetupCM) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)
[**guardiumConnectorSetupDatamarts**](GuardiumConnectorApi.md#guardiumConnectorSetupDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**guardiumConnectorTaskError**](GuardiumConnectorApi.md#guardiumConnectorTaskError) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution. (This API is called from GDP only)
[**guardiumConnectorTestDatabaseConnection**](GuardiumConnectorApi.md#guardiumConnectorTestDatabaseConnection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
[**guardiumConnectorUpdateDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorUpdateDmExclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
[**guardiumConnectorUpdateStreaming**](GuardiumConnectorApi.md#guardiumConnectorUpdateStreaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI. (This API is called from GDP only)
[**guardiumConnectorUpdateTask**](GuardiumConnectorApi.md#guardiumConnectorUpdateTask) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP. (This API is called from GDP only)


# **guardiumConnectorAddCM**
> Guardiumconnectorv3AddCMResponse guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorAddCMRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorAddCMRequest = {
  
  guardiumconnectorv3AddCMRequest: {
    cm: {
      attributes: [
        {
          name: "name_example",
          value: "value_example",
        },
      ],
      centralManagerId: "centralManagerId_example",
      cmDateParamAvailable: "cmDateParamAvailable_example",
      datamartEndDateAggregator: "datamartEndDateAggregator_example",
      datamartStartDateAggregator: "datamartStartDateAggregator_example",
      datamartStartDateCollector: "datamartStartDateCollector_example",
      maxSupportedDmVersion: "maxSupportedDmVersion_example",
      mode: "mode_example",
      name: "name_example",
      port: "port_example",
      status: "status_example",
      supportCustomDmTypeSetup: "supportCustomDmTypeSetup_example",
    },
    editCmAttributes: [
      "editCmAttributes_example",
    ],
    isEdit: true,
  },
};

const data = await apiInstance.guardiumConnectorAddCM(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddCMRequest** | **Guardiumconnectorv3AddCMRequest**|  |


### Return type

**Guardiumconnectorv3AddCMResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorAddDatamarts**
> Guardiumconnectorv3AddDatamartsResponse guardiumConnectorAddDatamarts(guardiumconnectorv3AddDatamartsRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest = {
    // central manager
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3AddDatamartsRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

const data = await apiInstance.guardiumConnectorAddDatamarts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddDatamartsRequest** | **Guardiumconnectorv3AddDatamartsRequest**|  |
 **centralManagerId** | [**string**] | central manager | defaults to undefined


### Return type

**Guardiumconnectorv3AddDatamartsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorAddDmExclusion**
> Guardiumconnectorv3AddDmExclusionResponse guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest = {
  
  guardiumconnectorv3AddDmExclusionRequest: {
    datamart: "datamart_example",
  },
};

const data = await apiInstance.guardiumConnectorAddDmExclusion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddDmExclusionRequest** | **Guardiumconnectorv3AddDmExclusionRequest**|  |


### Return type

**Guardiumconnectorv3AddDmExclusionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorAddTask**
> Guardiumconnectorv3AddTaskResponse guardiumConnectorAddTask(guardiumconnectorv3AddTaskRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorAddTaskRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorAddTaskRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3AddTaskRequest: {
    centralManagerId: "centralManagerId_example",
    interval: "interval_example",
    keyObject: "keyObject_example",
    params: [
      {
        argName: "argName_example",
        argValue: "argValue_example",
      },
    ],
    taskType: "taskType_example",
  },
};

const data = await apiInstance.guardiumConnectorAddTask(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddTaskRequest** | **Guardiumconnectorv3AddTaskRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3AddTaskResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorBlockUser**
> Guardiumconnectorv3BlockUserResponse guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorBlockUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorBlockUserRequest = {
  
  guardiumconnectorv3BlockUserRequest: {
    destination: {
      configId: "configId_example",
      guardiumId: "guardiumId_example",
    },
    details: {
      bdbname: "bdbname_example",
      bip: "bip_example",
      bport: "bport_example",
      buser: "buser_example",
    },
  },
};

const data = await apiInstance.guardiumConnectorBlockUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3BlockUserRequest** | **Guardiumconnectorv3BlockUserRequest**|  |


### Return type

**Guardiumconnectorv3BlockUserResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorConfigureAggregatorExport**
> Guardiumconnectorv3ConfigureAggregatorExportResponse guardiumConnectorConfigureAggregatorExport(guardiumconnectorv3ConfigureAggregatorExportRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3ConfigureAggregatorExportRequest: {
    centralManagerId: "centralManagerId_example",
    datamartEndDateAggregator: "datamartEndDateAggregator_example",
    datamartStartDateAggregator: "datamartStartDateAggregator_example",
    managedUnits: [
      "managedUnits_example",
    ],
    skipHistoricalDatamarts: true,
    updateCentralManager: true,
  },
};

const data = await apiInstance.guardiumConnectorConfigureAggregatorExport(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureAggregatorExportRequest** | **Guardiumconnectorv3ConfigureAggregatorExportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureAggregatorExportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorConfigureCollectorExport**
> Guardiumconnectorv3ConfigureCollectorExportResponse guardiumConnectorConfigureCollectorExport(guardiumconnectorv3ConfigureCollectorExportRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3ConfigureCollectorExportRequest: {
    centralManagerId: "centralManagerId_example",
    collectors: [
      "collectors_example",
    ],
    startDate: "startDate_example",
  },
};

const data = await apiInstance.guardiumConnectorConfigureCollectorExport(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureCollectorExportRequest** | **Guardiumconnectorv3ConfigureCollectorExportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureCollectorExportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorConfigureStreaming**
> Guardiumconnectorv3ConfigureStreamingResponse guardiumConnectorConfigureStreaming(guardiumconnectorv3ConfigureStreamingRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3ConfigureStreamingRequest: {
    action: "action_example",
    centralManagerId: "centralManagerId_example",
    skipHistoricalDatamarts: true,
    units: [
      "units_example",
    ],
  },
};

const data = await apiInstance.guardiumConnectorConfigureStreaming(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureStreamingRequest** | **Guardiumconnectorv3ConfigureStreamingRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureStreamingResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorDatamartVersionCheck**
> Guardiumconnectorv3DatamartVersionResponse guardiumConnectorDatamartVersionCheck(guardiumconnectorv3DatamartVersionRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest = {
    // Central manager
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3DatamartVersionRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

const data = await apiInstance.guardiumConnectorDatamartVersionCheck(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3DatamartVersionRequest** | **Guardiumconnectorv3DatamartVersionRequest**|  |
 **centralManagerId** | [**string**] | Central manager | defaults to undefined


### Return type

**Guardiumconnectorv3DatamartVersionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorDeleteCM**
> Guardiumconnectorv3DeleteCMResponse guardiumConnectorDeleteCM()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorDeleteCMRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorDeleteCMRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
    // Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM). (optional)
  force: 1,
};

const data = await apiInstance.guardiumConnectorDeleteCM(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined
 **force** | [**number**] | Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3DeleteCMResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorDeleteDmExclusion**
> Guardiumconnectorv3DeleteDmExclusionResponse guardiumConnectorDeleteDmExclusion()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest = {
    // Datamart name. (optional)
  datamart: "datamart_example",
};

const data = await apiInstance.guardiumConnectorDeleteDmExclusion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | [**string**] | Datamart name. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3DeleteDmExclusionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorDeleteTask**
> Guardiumconnectorv3DeleteTaskResponse guardiumConnectorDeleteTask()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
    // ID of task being deleted.
  taskId: "task_id_example",
};

const data = await apiInstance.guardiumConnectorDeleteTask(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task being deleted. | defaults to undefined


### Return type

**Guardiumconnectorv3DeleteTaskResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorDeleteTasks**
> Guardiumconnectorv3DeleteTasksResponse guardiumConnectorDeleteTasks()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorDeleteTasks(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3DeleteTasksResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetAggregatorsConfig**
> Guardiumconnectorv3GetAggregatorsConfigResponse guardiumConnectorGetAggregatorsConfig()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetAggregatorsConfig(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetAggregatorsConfigResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetCMs**
> Guardiumconnectorv3GetCMsResponse guardiumConnectorGetCMs()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetCMsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetCMsRequest = {
    // Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. (optional)
  runAdditionalChecks: true,
};

const data = await apiInstance.guardiumConnectorGetCMs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runAdditionalChecks** | [**boolean**] | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetCMsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetCMsConfig**
> Guardiumconnectorv3GetCMsConfigResponse guardiumConnectorGetCMsConfig()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request = {};

const data = await apiInstance.guardiumConnectorGetCMsConfig(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetCMsConfigResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetCollectorsConfig**
> Guardiumconnectorv3GetCollectorsConfigResponse guardiumConnectorGetCollectorsConfig()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetCollectorsConfig(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetCollectorsConfigResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetDatamarts**
> Guardiumconnectorv3GetDatamartsResponse guardiumConnectorGetDatamarts()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest = {
    // central manager hostname
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetDatamarts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | central manager hostname | defaults to undefined


### Return type

**Guardiumconnectorv3GetDatamartsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetDmExclusion**
> Guardiumconnectorv3GetDmExclusionResponse guardiumConnectorGetDmExclusion()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request = {};

const data = await apiInstance.guardiumConnectorGetDmExclusion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetDmExclusionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetGdpPolicyInfo**
> Guardiumconnectorv3GetPolicyInfoResponse guardiumConnectorGetGdpPolicyInfo()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest = {
    // Central manager hostname
  centralManagerId: "central_manager_id_example",
    // Policy name. (optional)
  policyName: "policy_name_example",
};

const data = await apiInstance.guardiumConnectorGetGdpPolicyInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager hostname | defaults to undefined
 **policyName** | [**string**] | Policy name. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetPolicyInfoResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetGdpPolicySummaries**
> Guardiumconnectorv3GetPolicySummariesResponse guardiumConnectorGetGdpPolicySummaries()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest = {
    // Central manager hostname
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetGdpPolicySummaries(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager hostname | defaults to undefined


### Return type

**Guardiumconnectorv3GetPolicySummariesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetHealthInfo**
> Guardiumconnectorv3GetHealthInfoResponse guardiumConnectorGetHealthInfo()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
    // Flag indicating if the older GDP api is to be called in case it doesn\'t support new api. (optional)
  useFallback: true,
};

const data = await apiInstance.guardiumConnectorGetHealthInfo(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined
 **useFallback** | [**boolean**] | Flag indicating if the older GDP api is to be called in case it doesn\&#39;t support new api. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetHealthInfoResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetLatestDMExtractionProfile**
> Guardiumconnectorv3GetLatestDMExtractionProfileResponse guardiumConnectorGetLatestDMExtractionProfile()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetLatestDMExtractionProfile(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetLatestDMExtractionProfileResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetStreamingStatus**
> Guardiumconnectorv3GetStreamingStatusResponse guardiumConnectorGetStreamingStatus()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetStreamingStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetStreamingStatusResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetSyncDMs**
> Guardiumconnectorv3GetSyncDMsResponse guardiumConnectorGetSyncDMs()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
};

const data = await apiInstance.guardiumConnectorGetSyncDMs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3GetSyncDMsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetTaskTypes**
> Guardiumconnectorv3GetTaskTypesResponse guardiumConnectorGetTaskTypes()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request = {};

const data = await apiInstance.guardiumConnectorGetTaskTypes(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetTaskTypesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorGetTasks**
> Guardiumconnectorv3GetTasksResponse guardiumConnectorGetTasks()


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorGetTasksRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorGetTasksRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
    // ID of task. (optional)
  taskId: "task_id_example",
    // Type of task. (optional)
  taskType: "task_type_example",
    // Key object. (optional)
  keyObject: "key_object_example",
};

const data = await apiInstance.guardiumConnectorGetTasks(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task. | (optional) defaults to undefined
 **taskType** | [**string**] | Type of task. | (optional) defaults to undefined
 **keyObject** | [**string**] | Key object. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetTasksResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorRunGDPReport**
> Guardiumconnectorv3RunGDPReportResponse guardiumConnectorRunGDPReport(guardiumconnectorv3RunGDPReportRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest = {
    // Central Manager ID.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3RunGDPReportRequest: {
    centralManagerId: "centralManagerId_example",
    maxFetchSize: 1,
    reportName: "reportName_example",
    reportParameters: [
      {
        parameterValue: "parameterValue_example",
        paremeterName: "paremeterName_example",
      },
    ],
    sortColumn: "sortColumn_example",
    sortOrder: "ACS",
    startFrom: 1,
  },
};

const data = await apiInstance.guardiumConnectorRunGDPReport(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3RunGDPReportRequest** | **Guardiumconnectorv3RunGDPReportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3RunGDPReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorSetupCM**
> Guardiumconnectorv3SetupCMResponse guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorSetupCMRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorSetupCMRequest = {
  
  guardiumconnectorv3SetupCMRequest: {
    attributes: [
      {
        name: "name_example",
        value: "value_example",
      },
    ],
    cmGid: "cmGid_example",
    cmHostname: "cmHostname_example",
    cmIp: "cmIp_example",
    pushRegistration: true,
  },
};

const data = await apiInstance.guardiumConnectorSetupCM(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3SetupCMRequest** | **Guardiumconnectorv3SetupCMRequest**|  |


### Return type

**Guardiumconnectorv3SetupCMResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorSetupDatamarts**
> Guardiumconnectorv3SetupDatamartsResponse guardiumConnectorSetupDatamarts(guardiumconnectorv3SetupDatamartsRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest = {
    // central manager
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3SetupDatamartsRequest: {
    centralManagerId: "centralManagerId_example",
    datamarts: [
      {
        dmExecDefaultMode: "dmExecDefaultMode_example",
        dmExecMode: "dmExecMode_example",
        dmName: "dmName_example",
      },
    ],
  },
};

const data = await apiInstance.guardiumConnectorSetupDatamarts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3SetupDatamartsRequest** | **Guardiumconnectorv3SetupDatamartsRequest**|  |
 **centralManagerId** | [**string**] | central manager | defaults to undefined


### Return type

**Guardiumconnectorv3SetupDatamartsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorTaskError**
> Guardiumconnectorv3TaskErrorResponse guardiumConnectorTaskError(guardiumconnectorv3TaskErrorRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorTaskErrorRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorTaskErrorRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3TaskErrorRequest: {
    centralManagerId: "centralManagerId_example",
    errorCode: "errorCode_example",
    errorDescription: "errorDescription_example",
    task: {
      taskId: "taskId_example",
      taskParams: [
        {
          argName: "argName_example",
          argValue: "argValue_example",
        },
      ],
      taskType: "taskType_example",
    },
  },
};

const data = await apiInstance.guardiumConnectorTaskError(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3TaskErrorRequest** | **Guardiumconnectorv3TaskErrorRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3TaskErrorResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorTestDatabaseConnection**
> Guardiumconnectorv3DatabaseResultResponse guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest = {
  
  guardiumconnectorv3DatabaseConnectionStringRequest: {
    dbhost: "dbhost_example",
    dbname: "dbname_example",
    password: "password_example",
    port: "port_example",
    user: "user_example",
  },
};

const data = await apiInstance.guardiumConnectorTestDatabaseConnection(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3DatabaseConnectionStringRequest** | **Guardiumconnectorv3DatabaseConnectionStringRequest**|  |


### Return type

**Guardiumconnectorv3DatabaseResultResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorUpdateDmExclusion**
> Guardiumconnectorv3UpdateDmExclusionResponse guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest = {
  
  guardiumconnectorv3UpdateDmExclusionRequest: {
    datamartList: [
      "datamartList_example",
    ],
  },
};

const data = await apiInstance.guardiumConnectorUpdateDmExclusion(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateDmExclusionRequest** | **Guardiumconnectorv3UpdateDmExclusionRequest**|  |


### Return type

**Guardiumconnectorv3UpdateDmExclusionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorUpdateStreaming**
> Guardiumconnectorv3UpdateStreamingResponse guardiumConnectorUpdateStreaming(guardiumconnectorv3UpdateStreamingRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
  
  guardiumconnectorv3UpdateStreamingRequest: {
    centralManagerId: "centralManagerId_example",
    records: [
      {
        attributes: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        hostName: "hostName_example",
        message: "message_example",
        state: "state_example",
        status: "status_example",
      },
    ],
    status: "status_example",
  },
};

const data = await apiInstance.guardiumConnectorUpdateStreaming(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateStreamingRequest** | **Guardiumconnectorv3UpdateStreamingRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3UpdateStreamingResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorUpdateTask**
> Guardiumconnectorv3UpdateTaskResponse guardiumConnectorUpdateTask(guardiumconnectorv3UpdateTaskRequest)


### Example


```typescript
import { createConfiguration, GuardiumConnectorApi } from '';
import type { GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest } from '';

const configuration = createConfiguration();
const apiInstance = new GuardiumConnectorApi(configuration);

const request: GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest = {
    // ID of central manager.
  centralManagerId: "central_manager_id_example",
    // ID of task being updated.
  taskId: "task_id_example",
  
  guardiumconnectorv3UpdateTaskRequest: {
    centralManagerId: "centralManagerId_example",
    interval: "interval_example",
    taskId: "taskId_example",
  },
};

const data = await apiInstance.guardiumConnectorUpdateTask(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateTaskRequest** | **Guardiumconnectorv3UpdateTaskRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task being updated. | defaults to undefined


### Return type

**Guardiumconnectorv3UpdateTaskResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


