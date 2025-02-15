# ResourceControllerK8ServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**resourceControllerK8ServiceCreateController**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateController) | **POST** /api/v3/app_manager/controllers | CreateController - Add a new controller.
[**resourceControllerK8ServiceCreateHeartBeat**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeat) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller.
[**resourceControllerK8ServiceCreateHeartBeatEx**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateHeartBeatEx) | **POST** /api/v3/app_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
[**resourceControllerK8ServiceCreateJob**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceCreateJob) | **POST** /api/v3/app_manager/jobs | ////////////////////////////////////////////////////////////////
Interface to the controllers and apps api in the App-Manager microservice
CreateJob - Create a job definition. Files and secrets contained within will also be created.
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
[**resourceControllerK8ServiceGetJobStatus**](ResourceControllerK8ServiceApi.md#resourceControllerK8ServiceGetJobStatus) | **GET** /api/v3/app_manager/jobs/{job_id}/status | GetJobStatus - Get the job&#39;s status.
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



## resourceControllerK8ServiceCreateController

CreateController - Add a new controller.

### Example

```bash
 resourceControllerK8ServiceCreateController
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3CreateControllerRequest** | [**Resourcecontrollerk8v3CreateControllerRequest**](Resourcecontrollerk8v3CreateControllerRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceCreateHeartBeat

CreateHeartBeat - Create a heartbeat for the controller.

### Example

```bash
 resourceControllerK8ServiceCreateHeartBeat controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to invoke a heartbeat on. | [default to null]
 **resourcecontrollerk8v3CreateHeartBeatRequest** | [**Resourcecontrollerk8v3CreateHeartBeatRequest**](Resourcecontrollerk8v3CreateHeartBeatRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatResponse**](Resourcecontrollerk8v3CreateHeartBeatResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceCreateHeartBeatEx

CreateHeartBeatEx - Create a heartbeat for the controller with extended information.

### Example

```bash
 resourceControllerK8ServiceCreateHeartBeatEx controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | Optional: controller id | [default to null]
 **resourcecontrollerk8v3ControllerHeartbeat** | [**Resourcecontrollerk8v3ControllerHeartbeat**](Resourcecontrollerk8v3ControllerHeartbeat.md) |  |

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatExResponse**](Resourcecontrollerk8v3CreateHeartBeatExResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceCreateJob

////////////////////////////////////////////////////////////////
Interface to the controllers and apps api in the App-Manager microservice
CreateJob - Create a job definition. Files and secrets contained within will also be created.

### Example

```bash
 resourceControllerK8ServiceCreateJob
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3Job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md) |  |

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceCreateJobExecution

CreateJobExecution - Create a job execution.

### Example

```bash
 resourceControllerK8ServiceCreateJobExecution
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3JobExecution** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md) |  |

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceCreateKeypair

CreateKeypair - Create a new keypair for the controller.

### Example

```bash
 resourceControllerK8ServiceCreateKeypair controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get app tests for. | [default to null]
 **resourcecontrollerk8v3CreateKeypairRequest** | [**Resourcecontrollerk8v3CreateKeypairRequest**](Resourcecontrollerk8v3CreateKeypairRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3CreateKeypairResponse**](Resourcecontrollerk8v3CreateKeypairResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceDeleteController

DeleteController - Delete a controller.

### Example

```bash
 resourceControllerK8ServiceDeleteController controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get the status. | [default to null]
 **resourcecontrollerk8v3DeleteControllerRequest** | [**Resourcecontrollerk8v3DeleteControllerRequest**](Resourcecontrollerk8v3DeleteControllerRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3DeleteControllerResponse**](Resourcecontrollerk8v3DeleteControllerResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceDeleteEdgeTenant

DeleteEdgeTenant - deletes an edge tenant providing edge tenant id

### Example

```bash
 resourceControllerK8ServiceDeleteEdgeTenant tenant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | ID of the tenant to delete | [default to null]
 **resourcecontrollerk8v3DeleteEdgeTenantRequestApphost** | [**Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost**](Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost.md) |  |

### Return type

[**Resourcecontrollerk8v3DeleteEdgeTenantResponse**](Resourcecontrollerk8v3DeleteEdgeTenantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceDeleteEdgeTenantRequest

DeleteEdgeTenantRequest to deletes gi and tnt CR on edge

### Example

```bash
 resourceControllerK8ServiceDeleteEdgeTenantRequest tenant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | Tenant ID for the redge request | [default to null]
 **resourcecontrollerk8v3EdgeTenantRequest** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](Resourcecontrollerk8v3EdgeResourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceDeleteJob

DeleteJob - Delete a job.

### Example

```bash
 resourceControllerK8ServiceDeleteJob job_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | ID of the job that needs to be deleted. | [default to null]
 **resourcecontrollerk8v3DeleteJobRequest** | [**Resourcecontrollerk8v3DeleteJobRequest**](Resourcecontrollerk8v3DeleteJobRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3DeleteJobResponse**](Resourcecontrollerk8v3DeleteJobResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceDownloadControllerLogs

DownloadControllerLogs - Download the controller logs for a running controller.

### Example

```bash
 resourceControllerK8ServiceDownloadControllerLogs controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to download logs for. | [default to null]
 **resourcecontrollerk8v3DownloadControllerLogsRequest** | [**Resourcecontrollerk8v3DownloadControllerLogsRequest**](Resourcecontrollerk8v3DownloadControllerLogsRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3DownloadControllerLogsResponse**](Resourcecontrollerk8v3DownloadControllerLogsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllerApps

GetControllerApps - Get the apps for the given controller.

### Example

```bash
 resourceControllerK8ServiceGetControllerApps controller_id=value  modified_since=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get apps for. | [default to null]
 **modifiedSince** | **string** | Only get the apps if any were modified since the given date. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3GetControllerAppsResponse**](Resourcecontrollerk8v3GetControllerAppsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllerCommands

GetControllerCommands - Get the commands for the controller to execute.

### Example

```bash
 resourceControllerK8ServiceGetControllerCommands controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get commands for. | [default to null]

### Return type

[**Resourcecontrollerk8v3GetControllerCommandsResponse**](Resourcecontrollerk8v3GetControllerCommandsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllerJobs

GetControllerJobs - Get the jobs for the controller to execute.

### Example

```bash
 resourceControllerK8ServiceGetControllerJobs controller_id=value  modified_since=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get jobs for. | [default to null]
 **modifiedSince** | **string** | Optional: Only get the jobs if any were modified since the given date. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3GetControllerJobsResponse**](Resourcecontrollerk8v3GetControllerJobsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllerStatus

GetControllerStatus - Get the status for the given controller.

### Example

```bash
 resourceControllerK8ServiceGetControllerStatus controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get the status. | [default to null]

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllers

GetControllers - Get the controllers for the given tenant.

### Example

```bash
 resourceControllerK8ServiceGetControllers tenant_id=value  want_local=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | The ID of the tenant to get controllers for. | [default to null]
 **wantLocal** | **boolean** | Used to indicate the caller wants the local controller. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3GetControllersResponse**](Resourcecontrollerk8v3GetControllersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetControllersWithStatus

GetControllersWithStatus - Get the controllers for the given tenant with computed status.

### Example

```bash
 resourceControllerK8ServiceGetControllersWithStatus tenant_id=value  want_local=value  controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | The ID of the tenant to get controllers for. | [default to null]
 **wantLocal** | **boolean** | Used to indicate the caller wants the local controller. | [optional] [default to null]
 **controllerId** | **string** | \"ALL\": for getting all controllers; <controller_id>: for getting single controller. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3GetControllersWithStatusResponse**](Resourcecontrollerk8v3GetControllersWithStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetJob

GetJob - Get the job.

### Example

```bash
 resourceControllerK8ServiceGetJob job_id=value  want_secret_values=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the job to get. | [default to null]
 **wantSecretValues** | **boolean** | Optional: True to return secret values, false otherwise. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetJobExecution

GetJobExecution - Get a job execution.

### Example

```bash
 resourceControllerK8ServiceGetJobExecution jobexe_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobexeId** | **string** | The ID of the job execution to get. | [default to null]

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetJobExecutions

GetJobExecutions - Get the job executions.

### Example

```bash
 resourceControllerK8ServiceGetJobExecutions job_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the job to get status. | [default to null]

### Return type

[**Resourcecontrollerk8v3GetJobExecutionsResponse**](Resourcecontrollerk8v3GetJobExecutionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetJobStatus

GetJobStatus - Get the job's status.

### Example

```bash
 resourceControllerK8ServiceGetJobStatus job_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the job to get status. | [default to null]

### Return type

[**Resourcecontrollerk8v3JobStatusDTO**](Resourcecontrollerk8v3JobStatusDTO.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetTenantApp

GetTenantApp - Get a specific app for the given tenant.

### Example

```bash
 resourceControllerK8ServiceGetTenantApp tenant_id=value app_name=value  returnLevel=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | The ID of the tenant to get apps for. | [default to null]
 **appName** | **string** | The name of the app to get. | [default to null]
 **returnLevel** | **string** | Optional: specify a return level for the data. This will control the amount of data returned. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3App**](Resourcecontrollerk8v3App.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetTenantApps

GetTenantApps - Get the apps for the given tenant.

### Example

```bash
 resourceControllerK8ServiceGetTenantApps tenant_id=value  returnLevel=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | The ID of the tenant to get apps for. | [default to null]
 **returnLevel** | **string** | Optional: specify a return level for the data. This will control the amount of data returned. | [optional] [default to null]

### Return type

[**Resourcecontrollerk8v3GetTenantAppsResponse**](Resourcecontrollerk8v3GetTenantAppsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetTenantJobs

GetTenantJobs - Get jobs for the given tenant.

### Example

```bash
 resourceControllerK8ServiceGetTenantJobs tenant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **string** | The ID of the tenant to get jobs for. | [default to null]

### Return type

[**Resourcecontrollerk8v3GetTenantJobsResponse**](Resourcecontrollerk8v3GetTenantJobsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceGetVersion

GetVersion - Get the system version information for the service.

### Example

```bash
 resourceControllerK8ServiceGetVersion
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceInstallEdgeTenantRequest

InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge

### Example

```bash
 resourceControllerK8ServiceInstallEdgeTenantRequest
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourcecontrollerk8v3EdgeTenantRequest** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](Resourcecontrollerk8v3EdgeResourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceQueryControllerLogs

QueryControllerLogs - Query for the controller logs for a running controller.

### Example

```bash
 resourceControllerK8ServiceQueryControllerLogs controller_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **string** | The ID of the controller to get logs for. | [default to null]
 **resourcecontrollerk8v3QueryControllerLogsRequest** | [**Resourcecontrollerk8v3QueryControllerLogsRequest**](Resourcecontrollerk8v3QueryControllerLogsRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3QueryControllerLogsResponse**](Resourcecontrollerk8v3QueryControllerLogsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateCommand

UpdateCommand - Update the command.

### Example

```bash
 resourceControllerK8ServiceUpdateCommand id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the command. | [default to null]
 **resourcecontrollerk8v3ControllerCommand** | [**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md) |  |

### Return type

[**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateController

UpdateController - Update an existing controller.

### Example

```bash
 resourceControllerK8ServiceUpdateController id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | Optional: The internal ID of the controller. | [default to null]
 **resourcecontrollerk8v3Controller** | [**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md) |  |

### Return type

[**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateControllerStatus

UpdateControllerStatus - Updates the status for the given controller.

### Example

```bash
 resourceControllerK8ServiceUpdateControllerStatus id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The internal ID of the controller. | [default to null]
 **resourcecontrollerk8v3ControllerStatus** | [**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md) |  |

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateJob

UpdateJob - Update a job.

### Example

```bash
 resourceControllerK8ServiceUpdateJob id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the job. | [default to null]
 **resourcecontrollerk8v3Job** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md) |  |

### Return type

[**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateJobExecution

UpdateJobExecution - Update a job execution.

### Example

```bash
 resourceControllerK8ServiceUpdateJobExecution id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | The ID of the job execution to update. | [default to null]
 **resourcecontrollerk8v3UpdateJobExecutionRequest** | [**Resourcecontrollerk8v3UpdateJobExecutionRequest**](Resourcecontrollerk8v3UpdateJobExecutionRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## resourceControllerK8ServiceUpdateJobStatus

UpdateJobStatus - Updates the status for the given Job.

### Example

```bash
 resourceControllerK8ServiceUpdateJobStatus job_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **string** | The ID of the job to get status. | [default to null]
 **resourcecontrollerk8v3UpdateJobStatusRequest** | [**Resourcecontrollerk8v3UpdateJobStatusRequest**](Resourcecontrollerk8v3UpdateJobStatusRequest.md) |  |

### Return type

[**Resourcecontrollerk8v3JobStatusDTO**](Resourcecontrollerk8v3JobStatusDTO.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

