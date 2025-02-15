# .ResourceControllerK8ServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resourceControllerK8ServiceCreateController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateController) | **POST** /api/v3/app_manager/controllers | CreateController - Add a new controller.
[**resourceControllerK8ServiceCreateHeartBeat**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeat) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller.
[**resourceControllerK8ServiceCreateHeartBeatEx**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeatEx) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
[**resourceControllerK8ServiceCreateJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateJob) | **POST** /api/v3/app_manager/jobs | //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
[**resourceControllerK8ServiceCreateJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateJobExecution) | **POST** /api/v3/app_manager/job_executions | CreateJobExecution - Create a job execution.
[**resourceControllerK8ServiceCreateKeypair**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateKeypair) | **POST** /api/v3/app_manager/controllers/{controller_id}/keypair | CreateKeypair - Create a new keypair for the controller.
[**resourceControllerK8ServiceDeleteController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteController) | **DELETE** /api/v3/app_manager/controllers/{controller_id} | DeleteController - Delete a controller.
[**resourceControllerK8ServiceDeleteEdgeTenant**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteEdgeTenant) | **DELETE** /api/v3/app_manager/tenants/{tenant_id} | DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
[**resourceControllerK8ServiceDeleteEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteEdgeTenantRequest) | **DELETE** /api/v3/edgegateways/{tenant_id} | DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
[**resourceControllerK8ServiceDeleteJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDeleteJob) | **DELETE** /api/v3/app_manager/jobs/{job_id} | DeleteJob - Delete a job.
[**resourceControllerK8ServiceDownloadControllerLogs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceDownloadControllerLogs) | **POST** /api/v3/app_manager/controllers/{controller_id}/logs | DownloadControllerLogs - Download the controller logs for a running controller.
[**resourceControllerK8ServiceGetControllerApps**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerApps) | **GET** /api/v3/app_manager/controllers/{controller_id}/apps | GetControllerApps - Get the apps for the given controller.
[**resourceControllerK8ServiceGetControllerCommands**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerCommands) | **GET** /api/v3/app_manager/controllers/{controller_id}/commands | GetControllerCommands - Get the commands for the controller to execute.
[**resourceControllerK8ServiceGetControllerJobs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerJobs) | **GET** /api/v3/app_manager/controllers/{controller_id}/jobs | GetControllerJobs - Get the jobs for the controller to execute.
[**resourceControllerK8ServiceGetControllerStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllerStatus) | **GET** /api/v3/app_manager/controllers/{controller_id}/status | GetControllerStatus - Get the status for the given controller.
[**resourceControllerK8ServiceGetControllers**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllers) | **GET** /api/v3/app_manager/tenants/{tenant_id}/controllers | GetControllers - Get the controllers for the given tenant.
[**resourceControllerK8ServiceGetControllersWithStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetControllersWithStatus) | **GET** /api/v3/app_manager/tenants/{tenant_id}/controller_status | GetControllersWithStatus - Get the controllers for the given tenant with computed status.
[**resourceControllerK8ServiceGetJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJob) | **GET** /api/v3/app_manager/jobs/{job_id} | GetJob - Get the job.
[**resourceControllerK8ServiceGetJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobExecution) | **GET** /api/v3/app_manager/job_executions/{jobexe_id} | GetJobExecution - Get a job execution.
[**resourceControllerK8ServiceGetJobExecutions**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobExecutions) | **GET** /api/v3/app_manager/jobs/{job_id}/executions | GetJobExecutions - Get the job executions.
[**resourceControllerK8ServiceGetJobStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobStatus) | **GET** /api/v3/app_manager/jobs/{job_id}/status | GetJobStatus - Get the job\&#39;s status.
[**resourceControllerK8ServiceGetTenantApp**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantApp) | **GET** /api/v3/app_manager/tenants/{tenant_id}/apps/{app_name} | GetTenantApp - Get a specific app for the given tenant.
[**resourceControllerK8ServiceGetTenantApps**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantApps) | **GET** /api/v3/app_manager/tenants/{tenant_id}/apps | GetTenantApps - Get the apps for the given tenant.
[**resourceControllerK8ServiceGetTenantJobs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetTenantJobs) | **GET** /api/v3/app_manager/tenants/{tenant_id}/jobs | GetTenantJobs - Get jobs for the given tenant.
[**resourceControllerK8ServiceGetVersion**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetVersion) | **GET** /api/v3/app_manager/system/version | GetVersion - Get the system version information for the service.
[**resourceControllerK8ServiceInstallEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceInstallEdgeTenantRequest) | **POST** /api/v3/edgegateways | InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge
[**resourceControllerK8ServiceQueryControllerLogs**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceQueryControllerLogs) | **POST** /api/v3/app_manager/controllers/{controller_id}/logs/query | QueryControllerLogs - Query for the controller logs for a running controller.
[**resourceControllerK8ServiceUpdateCommand**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateCommand) | **PUT** /api/v3/app_manager/commands/{id} | UpdateCommand - Update the command.
[**resourceControllerK8ServiceUpdateController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateController) | **PUT** /api/v3/app_manager/controllers/{id} | UpdateController - Update an existing controller.
[**resourceControllerK8ServiceUpdateControllerStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateControllerStatus) | **PUT** /api/v3/app_manager/controllers/{id}/status | UpdateControllerStatus - Updates the status for the given controller.
[**resourceControllerK8ServiceUpdateJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJob) | **PUT** /api/v3/app_manager/jobs/{id} | UpdateJob - Update a job.
[**resourceControllerK8ServiceUpdateJobExecution**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJobExecution) | **PUT** /api/v3/app_manager/job_executions/{id} | UpdateJobExecution - Update a job execution.
[**resourceControllerK8ServiceUpdateJobStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceUpdateJobStatus) | **PUT** /api/v3/app_manager/jobs/{job_id}/status | UpdateJobStatus - Updates the status for the given Job.


# **resourceControllerK8ServiceCreateController**
> Resourcecontrollerk8v3Controller resourceControllerK8ServiceCreateController(resourcecontrollerk8v3CreateControllerRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateControllerRequest = {
  // Resourcecontrollerk8v3CreateControllerRequest
  resourcecontrollerk8v3CreateControllerRequest: {
    description: "description_example",
    name: "name_example",
    tenantId: "tenantId_example",
  },
};

apiInstance.resourceControllerK8ServiceCreateController(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3CreateControllerRequest** | **Resourcecontrollerk8v3CreateControllerRequest**|  |


### Return type

**Resourcecontrollerk8v3Controller**

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

# **resourceControllerK8ServiceCreateHeartBeat**
> Resourcecontrollerk8v3CreateHeartBeatResponse resourceControllerK8ServiceCreateHeartBeat(resourcecontrollerk8v3CreateHeartBeatRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateHeartBeatRequest = {
  // string | The ID of the controller to invoke a heartbeat on.
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3CreateHeartBeatRequest
  resourcecontrollerk8v3CreateHeartBeatRequest: {
    controllerId: "controllerId_example",
  },
};

apiInstance.resourceControllerK8ServiceCreateHeartBeat(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3CreateHeartBeatRequest** | **Resourcecontrollerk8v3CreateHeartBeatRequest**|  |
 **controllerId** | [**string**] | The ID of the controller to invoke a heartbeat on. | defaults to undefined


### Return type

**Resourcecontrollerk8v3CreateHeartBeatResponse**

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

# **resourceControllerK8ServiceCreateHeartBeatEx**
> Resourcecontrollerk8v3CreateHeartBeatExResponse resourceControllerK8ServiceCreateHeartBeatEx(resourcecontrollerk8v3ControllerHeartbeat)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateHeartBeatExRequest = {
  // string | Optional: controller id
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3ControllerHeartbeat
  resourcecontrollerk8v3ControllerHeartbeat: {
    capability: {
      "key": true,
    },
    controllerId: "controllerId_example",
    controllerVersion: {
      build: "build_example",
      major: "major_example",
      micro: "micro_example",
      minor: "minor_example",
      version: "version_example",
    },
    resources: {
      allocatable: {
        "key": "key_example",
      },
      node: "node_example",
      timestamp: "timestamp_example",
      usage: {
        "key": "key_example",
      },
      window: "window_example",
    },
  },
};

apiInstance.resourceControllerK8ServiceCreateHeartBeatEx(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3ControllerHeartbeat** | **Resourcecontrollerk8v3ControllerHeartbeat**|  |
 **controllerId** | [**string**] | Optional: controller id | defaults to undefined


### Return type

**Resourcecontrollerk8v3CreateHeartBeatExResponse**

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

# **resourceControllerK8ServiceCreateJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceCreateJob(resourcecontrollerk8v3Job)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateJobRequest = {
  // Resourcecontrollerk8v3Job
  resourcecontrollerk8v3Job: {
    clusterRoleRules: [
      {
        apiGroups: [
          "apiGroups_example",
        ],
        id: "id_example",
        resources: [
          "resources_example",
        ],
        verbs: [
          "verbs_example",
        ],
      },
    ],
    command: [
      "command_example",
    ],
    container: {
      image: "image_example",
      imageFullyQualified: true,
      resources: {
        limits: {
          cpu: "cpu_example",
          memory: "memory_example",
        },
        requests: {
          cpu: "cpu_example",
          memory: "memory_example",
        },
      },
    },
    controllerId: "controllerId_example",
    created: "created_example",
    cron: {
      schedule: "schedule_example",
    },
    files: [
      {
        content: "content_example",
        created: "created_example",
        description: {
          content: "content_example",
          format: "format_example",
        },
        id: "id_example",
        modified: "modified_example",
        name: "name_example",
        path: "path_example",
        type: "type_example",
      },
    ],
    id: "id_example",
    labels: {
      "key": "key_example",
    },
    lastExecution: {
      details: "details_example",
      ended: "ended_example",
      id: "id_example",
      jobId: "jobId_example",
      modified: "modified_example",
      name: "name_example",
      started: "started_example",
      status: "status_example",
    },
    modified: "modified_example",
    name: "name_example",
    roleRules: [
      {
        apiGroups: [
          "apiGroups_example",
        ],
        id: "id_example",
        resources: [
          "resources_example",
        ],
        verbs: [
          "verbs_example",
        ],
      },
    ],
    secretKey: "secretKey_example",
    secrets: [
      {
        created: "created_example",
        id: "id_example",
        modified: "modified_example",
        name: "name_example",
        _protected: true,
        value: "value_example",
      },
    ],
    status: "status_example",
  },
};

apiInstance.resourceControllerK8ServiceCreateJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3Job** | **Resourcecontrollerk8v3Job**|  |


### Return type

**Resourcecontrollerk8v3Job**

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

# **resourceControllerK8ServiceCreateJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceCreateJobExecution(resourcecontrollerk8v3JobExecution)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateJobExecutionRequest = {
  // Resourcecontrollerk8v3JobExecution
  resourcecontrollerk8v3JobExecution: {
    details: "details_example",
    ended: "ended_example",
    id: "id_example",
    jobId: "jobId_example",
    modified: "modified_example",
    name: "name_example",
    started: "started_example",
    status: "status_example",
  },
};

apiInstance.resourceControllerK8ServiceCreateJobExecution(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3JobExecution** | **Resourcecontrollerk8v3JobExecution**|  |


### Return type

**Resourcecontrollerk8v3JobExecution**

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

# **resourceControllerK8ServiceCreateKeypair**
> Resourcecontrollerk8v3CreateKeypairResponse resourceControllerK8ServiceCreateKeypair(resourcecontrollerk8v3CreateKeypairRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceCreateKeypairRequest = {
  // string | The ID of the controller to get app tests for.
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3CreateKeypairRequest
  resourcecontrollerk8v3CreateKeypairRequest: {
    controllerId: "controllerId_example",
  },
};

apiInstance.resourceControllerK8ServiceCreateKeypair(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3CreateKeypairRequest** | **Resourcecontrollerk8v3CreateKeypairRequest**|  |
 **controllerId** | [**string**] | The ID of the controller to get app tests for. | defaults to undefined


### Return type

**Resourcecontrollerk8v3CreateKeypairResponse**

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

# **resourceControllerK8ServiceDeleteController**
> Resourcecontrollerk8v3DeleteControllerResponse resourceControllerK8ServiceDeleteController(resourcecontrollerk8v3DeleteControllerRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceDeleteControllerRequest = {
  // string | The ID of the controller to get the status.
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3DeleteControllerRequest
  resourcecontrollerk8v3DeleteControllerRequest: {
    controllerId: "controllerId_example",
  },
};

apiInstance.resourceControllerK8ServiceDeleteController(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3DeleteControllerRequest** | **Resourcecontrollerk8v3DeleteControllerRequest**|  |
 **controllerId** | [**string**] | The ID of the controller to get the status. | defaults to undefined


### Return type

**Resourcecontrollerk8v3DeleteControllerResponse**

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

# **resourceControllerK8ServiceDeleteEdgeTenant**
> Resourcecontrollerk8v3DeleteEdgeTenantResponse resourceControllerK8ServiceDeleteEdgeTenant(resourcecontrollerk8v3DeleteEdgeTenantRequestApphost)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceDeleteEdgeTenantRequest = {
  // string | ID of the tenant to delete
  tenantId: "tenant_id_example",
  // Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost
  resourcecontrollerk8v3DeleteEdgeTenantRequestApphost: {
    tenantId: "tenantId_example",
  },
};

apiInstance.resourceControllerK8ServiceDeleteEdgeTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3DeleteEdgeTenantRequestApphost** | **Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost**|  |
 **tenantId** | [**string**] | ID of the tenant to delete | defaults to undefined


### Return type

**Resourcecontrollerk8v3DeleteEdgeTenantResponse**

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

# **resourceControllerK8ServiceDeleteEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse resourceControllerK8ServiceDeleteEdgeTenantRequest(resourcecontrollerk8v3EdgeTenantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceDeleteEdgeTenantRequestRequest = {
  // string | Tenant ID for the redge request
  tenantId: "tenant_id_example",
  // Resourcecontrollerk8v3EdgeTenantRequest
  resourcecontrollerk8v3EdgeTenantRequest: {
    edgeGatewayId: "edgeGatewayId_example",
    edgeGatewayName: "edgeGatewayName_example",
    edgeVersion: "edgeVersion_example",
    hostname: "hostname_example",
    licenseType: "licenseType_example",
    rsyslog: "rsyslog_example",
    storageClassName: "storageClassName_example",
    storageClassNameRwo: "storageClassNameRwo_example",
    tenantId: "tenantId_example",
    tntPlan: "tntPlan_example",
  },
};

apiInstance.resourceControllerK8ServiceDeleteEdgeTenantRequest(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3EdgeTenantRequest** | **Resourcecontrollerk8v3EdgeTenantRequest**|  |
 **tenantId** | [**string**] | Tenant ID for the redge request | defaults to undefined


### Return type

**Resourcecontrollerk8v3EdgeResourceResponse**

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

# **resourceControllerK8ServiceDeleteJob**
> Resourcecontrollerk8v3DeleteJobResponse resourceControllerK8ServiceDeleteJob(resourcecontrollerk8v3DeleteJobRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceDeleteJobRequest = {
  // string | ID of the job that needs to be deleted.
  jobId: "job_id_example",
  // Resourcecontrollerk8v3DeleteJobRequest
  resourcecontrollerk8v3DeleteJobRequest: {
    jobId: "jobId_example",
  },
};

apiInstance.resourceControllerK8ServiceDeleteJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3DeleteJobRequest** | **Resourcecontrollerk8v3DeleteJobRequest**|  |
 **jobId** | [**string**] | ID of the job that needs to be deleted. | defaults to undefined


### Return type

**Resourcecontrollerk8v3DeleteJobResponse**

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

# **resourceControllerK8ServiceDownloadControllerLogs**
> Resourcecontrollerk8v3DownloadControllerLogsResponse resourceControllerK8ServiceDownloadControllerLogs(resourcecontrollerk8v3DownloadControllerLogsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceDownloadControllerLogsRequest = {
  // string | The ID of the controller to download logs for.
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3DownloadControllerLogsRequest
  resourcecontrollerk8v3DownloadControllerLogsRequest: {
    controllerId: "controllerId_example",
    endDate: "endDate_example",
    identifier: "identifier_example",
    previous: true,
    startDate: "startDate_example",
  },
};

apiInstance.resourceControllerK8ServiceDownloadControllerLogs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3DownloadControllerLogsRequest** | **Resourcecontrollerk8v3DownloadControllerLogsRequest**|  |
 **controllerId** | [**string**] | The ID of the controller to download logs for. | defaults to undefined


### Return type

**Resourcecontrollerk8v3DownloadControllerLogsResponse**

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

# **resourceControllerK8ServiceGetControllerApps**
> Resourcecontrollerk8v3GetControllerAppsResponse resourceControllerK8ServiceGetControllerApps()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerAppsRequest = {
  // string | The ID of the controller to get apps for.
  controllerId: "controller_id_example",
  // string | Only get the apps if any were modified since the given date. (optional)
  modifiedSince: "modified_since_example",
};

apiInstance.resourceControllerK8ServiceGetControllerApps(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | [**string**] | The ID of the controller to get apps for. | defaults to undefined
 **modifiedSince** | [**string**] | Only get the apps if any were modified since the given date. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3GetControllerAppsResponse**

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

# **resourceControllerK8ServiceGetControllerCommands**
> Resourcecontrollerk8v3GetControllerCommandsResponse resourceControllerK8ServiceGetControllerCommands()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerCommandsRequest = {
  // string | The ID of the controller to get commands for.
  controllerId: "controller_id_example",
};

apiInstance.resourceControllerK8ServiceGetControllerCommands(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | [**string**] | The ID of the controller to get commands for. | defaults to undefined


### Return type

**Resourcecontrollerk8v3GetControllerCommandsResponse**

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

# **resourceControllerK8ServiceGetControllerJobs**
> Resourcecontrollerk8v3GetControllerJobsResponse resourceControllerK8ServiceGetControllerJobs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerJobsRequest = {
  // string | The ID of the controller to get jobs for.
  controllerId: "controller_id_example",
  // string | Optional: Only get the jobs if any were modified since the given date. (optional)
  modifiedSince: "modified_since_example",
};

apiInstance.resourceControllerK8ServiceGetControllerJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | [**string**] | The ID of the controller to get jobs for. | defaults to undefined
 **modifiedSince** | [**string**] | Optional: Only get the jobs if any were modified since the given date. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3GetControllerJobsResponse**

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

# **resourceControllerK8ServiceGetControllerStatus**
> Resourcecontrollerk8v3ControllerStatus resourceControllerK8ServiceGetControllerStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerStatusRequest = {
  // string | The ID of the controller to get the status.
  controllerId: "controller_id_example",
};

apiInstance.resourceControllerK8ServiceGetControllerStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | [**string**] | The ID of the controller to get the status. | defaults to undefined


### Return type

**Resourcecontrollerk8v3ControllerStatus**

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

# **resourceControllerK8ServiceGetControllers**
> Resourcecontrollerk8v3GetControllersResponse resourceControllerK8ServiceGetControllers()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersRequest = {
  // string | The ID of the tenant to get controllers for.
  tenantId: "tenant_id_example",
  // boolean | Used to indicate the caller wants the local controller. (optional)
  wantLocal: true,
};

apiInstance.resourceControllerK8ServiceGetControllers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | The ID of the tenant to get controllers for. | defaults to undefined
 **wantLocal** | [**boolean**] | Used to indicate the caller wants the local controller. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3GetControllersResponse**

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

# **resourceControllerK8ServiceGetControllersWithStatus**
> Resourcecontrollerk8v3GetControllersWithStatusResponse resourceControllerK8ServiceGetControllersWithStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersWithStatusRequest = {
  // string | The ID of the tenant to get controllers for.
  tenantId: "tenant_id_example",
  // boolean | Used to indicate the caller wants the local controller. (optional)
  wantLocal: true,
  // string | \"ALL\": for getting all controllers; <controller_id>: for getting single controller. (optional)
  controllerId: "controller_id_example",
};

apiInstance.resourceControllerK8ServiceGetControllersWithStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | The ID of the tenant to get controllers for. | defaults to undefined
 **wantLocal** | [**boolean**] | Used to indicate the caller wants the local controller. | (optional) defaults to undefined
 **controllerId** | [**string**] | \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3GetControllersWithStatusResponse**

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

# **resourceControllerK8ServiceGetJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceGetJob()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobRequest = {
  // string | The ID of the job to get.
  jobId: "job_id_example",
  // boolean | Optional: True to return secret values, false otherwise. (optional)
  wantSecretValues: true,
};

apiInstance.resourceControllerK8ServiceGetJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | [**string**] | The ID of the job to get. | defaults to undefined
 **wantSecretValues** | [**boolean**] | Optional: True to return secret values, false otherwise. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3Job**

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

# **resourceControllerK8ServiceGetJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceGetJobExecution()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobExecutionRequest = {
  // string | The ID of the job execution to get.
  jobexeId: "jobexe_id_example",
};

apiInstance.resourceControllerK8ServiceGetJobExecution(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobexeId** | [**string**] | The ID of the job execution to get. | defaults to undefined


### Return type

**Resourcecontrollerk8v3JobExecution**

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

# **resourceControllerK8ServiceGetJobExecutions**
> Resourcecontrollerk8v3GetJobExecutionsResponse resourceControllerK8ServiceGetJobExecutions()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobExecutionsRequest = {
  // string | The ID of the job to get status.
  jobId: "job_id_example",
};

apiInstance.resourceControllerK8ServiceGetJobExecutions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | [**string**] | The ID of the job to get status. | defaults to undefined


### Return type

**Resourcecontrollerk8v3GetJobExecutionsResponse**

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

# **resourceControllerK8ServiceGetJobStatus**
> Resourcecontrollerk8v3JobStatusDTO resourceControllerK8ServiceGetJobStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobStatusRequest = {
  // string | The ID of the job to get status.
  jobId: "job_id_example",
};

apiInstance.resourceControllerK8ServiceGetJobStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | [**string**] | The ID of the job to get status. | defaults to undefined


### Return type

**Resourcecontrollerk8v3JobStatusDTO**

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

# **resourceControllerK8ServiceGetTenantApp**
> Resourcecontrollerk8v3App resourceControllerK8ServiceGetTenantApp()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppRequest = {
  // string | The ID of the tenant to get apps for.
  tenantId: "tenant_id_example",
  // string | The name of the app to get.
  appName: "app_name_example",
  // string | Optional: specify a return level for the data. This will control the amount of data returned. (optional)
  returnLevel: "returnLevel_example",
};

apiInstance.resourceControllerK8ServiceGetTenantApp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | The ID of the tenant to get apps for. | defaults to undefined
 **appName** | [**string**] | The name of the app to get. | defaults to undefined
 **returnLevel** | [**string**] | Optional: specify a return level for the data. This will control the amount of data returned. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3App**

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

# **resourceControllerK8ServiceGetTenantApps**
> Resourcecontrollerk8v3GetTenantAppsResponse resourceControllerK8ServiceGetTenantApps()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppsRequest = {
  // string | The ID of the tenant to get apps for.
  tenantId: "tenant_id_example",
  // string | Optional: specify a return level for the data. This will control the amount of data returned. (optional)
  returnLevel: "returnLevel_example",
};

apiInstance.resourceControllerK8ServiceGetTenantApps(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | The ID of the tenant to get apps for. | defaults to undefined
 **returnLevel** | [**string**] | Optional: specify a return level for the data. This will control the amount of data returned. | (optional) defaults to undefined


### Return type

**Resourcecontrollerk8v3GetTenantAppsResponse**

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

# **resourceControllerK8ServiceGetTenantJobs**
> Resourcecontrollerk8v3GetTenantJobsResponse resourceControllerK8ServiceGetTenantJobs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantJobsRequest = {
  // string | The ID of the tenant to get jobs for.
  tenantId: "tenant_id_example",
};

apiInstance.resourceControllerK8ServiceGetTenantJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | The ID of the tenant to get jobs for. | defaults to undefined


### Return type

**Resourcecontrollerk8v3GetTenantJobsResponse**

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

# **resourceControllerK8ServiceGetVersion**
> Resourcecontrollerk8v3Version resourceControllerK8ServiceGetVersion()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:any = {};

apiInstance.resourceControllerK8ServiceGetVersion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Resourcecontrollerk8v3Version**

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

# **resourceControllerK8ServiceInstallEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse resourceControllerK8ServiceInstallEdgeTenantRequest(resourcecontrollerk8v3EdgeTenantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceInstallEdgeTenantRequestRequest = {
  // Resourcecontrollerk8v3EdgeTenantRequest
  resourcecontrollerk8v3EdgeTenantRequest: {
    edgeGatewayId: "edgeGatewayId_example",
    edgeGatewayName: "edgeGatewayName_example",
    edgeVersion: "edgeVersion_example",
    hostname: "hostname_example",
    licenseType: "licenseType_example",
    rsyslog: "rsyslog_example",
    storageClassName: "storageClassName_example",
    storageClassNameRwo: "storageClassNameRwo_example",
    tenantId: "tenantId_example",
    tntPlan: "tntPlan_example",
  },
};

apiInstance.resourceControllerK8ServiceInstallEdgeTenantRequest(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3EdgeTenantRequest** | **Resourcecontrollerk8v3EdgeTenantRequest**|  |


### Return type

**Resourcecontrollerk8v3EdgeResourceResponse**

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

# **resourceControllerK8ServiceQueryControllerLogs**
> Resourcecontrollerk8v3QueryControllerLogsResponse resourceControllerK8ServiceQueryControllerLogs(resourcecontrollerk8v3QueryControllerLogsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceQueryControllerLogsRequest = {
  // string | The ID of the controller to get logs for.
  controllerId: "controller_id_example",
  // Resourcecontrollerk8v3QueryControllerLogsRequest
  resourcecontrollerk8v3QueryControllerLogsRequest: {
    controllerId: "controllerId_example",
    queryLogs: {
      endDate: "endDate_example",
      previous: true,
      startDate: "startDate_example",
    },
  },
};

apiInstance.resourceControllerK8ServiceQueryControllerLogs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3QueryControllerLogsRequest** | **Resourcecontrollerk8v3QueryControllerLogsRequest**|  |
 **controllerId** | [**string**] | The ID of the controller to get logs for. | defaults to undefined


### Return type

**Resourcecontrollerk8v3QueryControllerLogsResponse**

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

# **resourceControllerK8ServiceUpdateCommand**
> Resourcecontrollerk8v3ControllerCommand resourceControllerK8ServiceUpdateCommand(resourcecontrollerk8v3ControllerCommand)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateCommandRequest = {
  // string | The ID of the command.
  id: "id_example",
  // Resourcecontrollerk8v3ControllerCommand
  resourcecontrollerk8v3ControllerCommand: {
    args: {},
    created: "created_example",
    id: "id_example",
    modified: "modified_example",
    result: "result_example",
    status: "status_example",
    type: "type_example",
  },
};

apiInstance.resourceControllerK8ServiceUpdateCommand(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3ControllerCommand** | **Resourcecontrollerk8v3ControllerCommand**|  |
 **id** | [**string**] | The ID of the command. | defaults to undefined


### Return type

**Resourcecontrollerk8v3ControllerCommand**

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

# **resourceControllerK8ServiceUpdateController**
> Resourcecontrollerk8v3Controller resourceControllerK8ServiceUpdateController(resourcecontrollerk8v3Controller)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateControllerRequest = {
  // string | Optional: The internal ID of the controller.
  id: "id_example",
  // Resourcecontrollerk8v3Controller
  resourcecontrollerk8v3Controller: {
    appIds: [
      "appIds_example",
    ],
    apps: [
      {
        container: {
          image: "image_example",
          imageFullyQualified: true,
          resources: {
            limits: {
              cpu: "cpu_example",
              memory: "memory_example",
            },
            requests: {
              cpu: "cpu_example",
              memory: "memory_example",
            },
          },
        },
        created: "created_example",
        deployment: {
          controllerId: "controllerId_example",
          details: "details_example",
          modified: "modified_example",
          replicas: 1,
          status: "status_example",
        },
        emptyDir: "emptyDir_example",
        fileIds: [
          "fileIds_example",
        ],
        files: [
          {
            appId: "appId_example",
            content: "content_example",
            created: "created_example",
            description: {
              content: "content_example",
              format: "format_example",
            },
            id: "id_example",
            mimeType: "mimeType_example",
            modified: "modified_example",
            name: "name_example",
            path: "path_example",
            restartApp: true,
          },
        ],
        hpa: {
          maxReplicas: "maxReplicas_example",
          minReplicas: "minReplicas_example",
          targetCpuUtilizationPercentage: "targetCpuUtilizationPercentage_example",
        },
        id: "id_example",
        initContainers: [
          {
            command: [
              "command_example",
            ],
            image: "image_example",
            name: "name_example",
          },
        ],
        modified: "modified_example",
        name: "name_example",
        secrets: [
          {
            appId: "appId_example",
            created: "created_example",
            id: "id_example",
            modified: "modified_example",
            name: "name_example",
            _protected: true,
            value: "value_example",
          },
        ],
        status: "status_example",
        tenantId: "tenantId_example",
        tenantUuid: "tenantUuid_example",
      },
    ],
    capability: {
      "key": true,
    },
    created: "created_example",
    description: {
      content: "content_example",
      format: "format_example",
    },
    id: "id_example",
    keypair: {
      _private: "_private_example",
    },
    lastHeartbeat: "lastHeartbeat_example",
    local: true,
    modified: "modified_example",
    name: "name_example",
    resources: {
      allocatable: {
        "key": "key_example",
      },
      node: "node_example",
      timestamp: "timestamp_example",
      usage: {
        "key": "key_example",
      },
      window: "window_example",
    },
    sinceLastHeartbeat: "sinceLastHeartbeat_example",
    status: "status_example",
    tenantId: "tenantId_example",
    tenantUuid: "tenantUuid_example",
    version: {
      build: "build_example",
      major: "major_example",
      micro: "micro_example",
      minor: "minor_example",
      version: "version_example",
    },
  },
};

apiInstance.resourceControllerK8ServiceUpdateController(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3Controller** | **Resourcecontrollerk8v3Controller**|  |
 **id** | [**string**] | Optional: The internal ID of the controller. | defaults to undefined


### Return type

**Resourcecontrollerk8v3Controller**

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

# **resourceControllerK8ServiceUpdateControllerStatus**
> Resourcecontrollerk8v3ControllerStatus resourceControllerK8ServiceUpdateControllerStatus(resourcecontrollerk8v3ControllerStatus)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateControllerStatusRequest = {
  // string | The internal ID of the controller.
  id: "id_example",
  // Resourcecontrollerk8v3ControllerStatus
  resourcecontrollerk8v3ControllerStatus: {
    id: "id_example",
    modified: "modified_example",
    status: "status_example",
    version: {
      build: "build_example",
      major: "major_example",
      micro: "micro_example",
      minor: "minor_example",
      version: "version_example",
    },
  },
};

apiInstance.resourceControllerK8ServiceUpdateControllerStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3ControllerStatus** | **Resourcecontrollerk8v3ControllerStatus**|  |
 **id** | [**string**] | The internal ID of the controller. | defaults to undefined


### Return type

**Resourcecontrollerk8v3ControllerStatus**

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

# **resourceControllerK8ServiceUpdateJob**
> Resourcecontrollerk8v3Job resourceControllerK8ServiceUpdateJob(resourcecontrollerk8v3Job)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateJobRequest = {
  // string | The ID of the job.
  id: "id_example",
  // Resourcecontrollerk8v3Job
  resourcecontrollerk8v3Job: {
    clusterRoleRules: [
      {
        apiGroups: [
          "apiGroups_example",
        ],
        id: "id_example",
        resources: [
          "resources_example",
        ],
        verbs: [
          "verbs_example",
        ],
      },
    ],
    command: [
      "command_example",
    ],
    container: {
      image: "image_example",
      imageFullyQualified: true,
      resources: {
        limits: {
          cpu: "cpu_example",
          memory: "memory_example",
        },
        requests: {
          cpu: "cpu_example",
          memory: "memory_example",
        },
      },
    },
    controllerId: "controllerId_example",
    created: "created_example",
    cron: {
      schedule: "schedule_example",
    },
    files: [
      {
        content: "content_example",
        created: "created_example",
        description: {
          content: "content_example",
          format: "format_example",
        },
        id: "id_example",
        modified: "modified_example",
        name: "name_example",
        path: "path_example",
        type: "type_example",
      },
    ],
    id: "id_example",
    labels: {
      "key": "key_example",
    },
    lastExecution: {
      details: "details_example",
      ended: "ended_example",
      id: "id_example",
      jobId: "jobId_example",
      modified: "modified_example",
      name: "name_example",
      started: "started_example",
      status: "status_example",
    },
    modified: "modified_example",
    name: "name_example",
    roleRules: [
      {
        apiGroups: [
          "apiGroups_example",
        ],
        id: "id_example",
        resources: [
          "resources_example",
        ],
        verbs: [
          "verbs_example",
        ],
      },
    ],
    secretKey: "secretKey_example",
    secrets: [
      {
        created: "created_example",
        id: "id_example",
        modified: "modified_example",
        name: "name_example",
        _protected: true,
        value: "value_example",
      },
    ],
    status: "status_example",
  },
};

apiInstance.resourceControllerK8ServiceUpdateJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3Job** | **Resourcecontrollerk8v3Job**|  |
 **id** | [**string**] | The ID of the job. | defaults to undefined


### Return type

**Resourcecontrollerk8v3Job**

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

# **resourceControllerK8ServiceUpdateJobExecution**
> Resourcecontrollerk8v3JobExecution resourceControllerK8ServiceUpdateJobExecution(resourcecontrollerk8v3UpdateJobExecutionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateJobExecutionRequest = {
  // string | The ID of the job execution to update.
  id: "id_example",
  // Resourcecontrollerk8v3UpdateJobExecutionRequest
  resourcecontrollerk8v3UpdateJobExecutionRequest: {
    details: "details_example",
    ended: "ended_example",
    id: "id_example",
    jobId: "jobId_example",
    modified: "modified_example",
    name: "name_example",
    started: "started_example",
    status: "status_example",
  },
};

apiInstance.resourceControllerK8ServiceUpdateJobExecution(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3UpdateJobExecutionRequest** | **Resourcecontrollerk8v3UpdateJobExecutionRequest**|  |
 **id** | [**string**] | The ID of the job execution to update. | defaults to undefined


### Return type

**Resourcecontrollerk8v3JobExecution**

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

# **resourceControllerK8ServiceUpdateJobStatus**
> Resourcecontrollerk8v3JobStatusDTO resourceControllerK8ServiceUpdateJobStatus(resourcecontrollerk8v3UpdateJobStatusRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ResourceControllerK8ServiceApi(configuration);

let body:.ResourceControllerK8ServiceApiResourceControllerK8ServiceUpdateJobStatusRequest = {
  // string | The ID of the job to get status.
  jobId: "job_id_example",
  // Resourcecontrollerk8v3UpdateJobStatusRequest
  resourcecontrollerk8v3UpdateJobStatusRequest: {
    jobId: "jobId_example",
    modified: "modified_example",
    status: "status_example",
  },
};

apiInstance.resourceControllerK8ServiceUpdateJobStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3UpdateJobStatusRequest** | **Resourcecontrollerk8v3UpdateJobStatusRequest**|  |
 **jobId** | [**string**] | The ID of the job to get status. | defaults to undefined


### Return type

**Resourcecontrollerk8v3JobStatusDTO**

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


