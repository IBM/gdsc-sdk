# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ResourceControllerK8ServiceCreateController**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateController) | **Post** /api/v3/app_manager/controllers | CreateController - Add a new controller.
[**ResourceControllerK8ServiceCreateHeartBeat**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateHeartBeat) | **Post** /api/v3/app_manager/controllers/{controller_id}/heartbeat | CreateHeartBeat - Create a heartbeat for the controller.
[**ResourceControllerK8ServiceCreateHeartBeatEx**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateHeartBeatEx) | **Post** /api/v3/app_manager/controllers/{controller_id}/heartbeat_ex | CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
[**ResourceControllerK8ServiceCreateJob**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateJob) | **Post** /api/v3/app_manager/jobs | //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
[**ResourceControllerK8ServiceCreateJobExecution**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateJobExecution) | **Post** /api/v3/app_manager/job_executions | CreateJobExecution - Create a job execution.
[**ResourceControllerK8ServiceCreateKeypair**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceCreateKeypair) | **Post** /api/v3/app_manager/controllers/{controller_id}/keypair | CreateKeypair - Create a new keypair for the controller.
[**ResourceControllerK8ServiceDeleteController**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceDeleteController) | **Delete** /api/v3/app_manager/controllers/{controller_id} | DeleteController - Delete a controller.
[**ResourceControllerK8ServiceDeleteEdgeTenant**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceDeleteEdgeTenant) | **Delete** /api/v3/app_manager/tenants/{tenant_id} | DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
[**ResourceControllerK8ServiceDeleteEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceDeleteEdgeTenantRequest) | **Delete** /api/v3/edgegateways/{tenant_id} | DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
[**ResourceControllerK8ServiceDeleteJob**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceDeleteJob) | **Delete** /api/v3/app_manager/jobs/{job_id} | DeleteJob - Delete a job.
[**ResourceControllerK8ServiceDownloadControllerLogs**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceDownloadControllerLogs) | **Post** /api/v3/app_manager/controllers/{controller_id}/logs | DownloadControllerLogs - Download the controller logs for a running controller.
[**ResourceControllerK8ServiceGetControllerApps**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllerApps) | **Get** /api/v3/app_manager/controllers/{controller_id}/apps | GetControllerApps - Get the apps for the given controller.
[**ResourceControllerK8ServiceGetControllerCommands**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllerCommands) | **Get** /api/v3/app_manager/controllers/{controller_id}/commands | GetControllerCommands - Get the commands for the controller to execute.
[**ResourceControllerK8ServiceGetControllerJobs**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllerJobs) | **Get** /api/v3/app_manager/controllers/{controller_id}/jobs | GetControllerJobs - Get the jobs for the controller to execute.
[**ResourceControllerK8ServiceGetControllerStatus**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllerStatus) | **Get** /api/v3/app_manager/controllers/{controller_id}/status | GetControllerStatus - Get the status for the given controller.
[**ResourceControllerK8ServiceGetControllers**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllers) | **Get** /api/v3/app_manager/tenants/{tenant_id}/controllers | GetControllers - Get the controllers for the given tenant.
[**ResourceControllerK8ServiceGetControllersWithStatus**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetControllersWithStatus) | **Get** /api/v3/app_manager/tenants/{tenant_id}/controller_status | GetControllersWithStatus - Get the controllers for the given tenant with computed status.
[**ResourceControllerK8ServiceGetJob**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetJob) | **Get** /api/v3/app_manager/jobs/{job_id} | GetJob - Get the job.
[**ResourceControllerK8ServiceGetJobExecution**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetJobExecution) | **Get** /api/v3/app_manager/job_executions/{jobexe_id} | GetJobExecution - Get a job execution.
[**ResourceControllerK8ServiceGetJobExecutions**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetJobExecutions) | **Get** /api/v3/app_manager/jobs/{job_id}/executions | GetJobExecutions - Get the job executions.
[**ResourceControllerK8ServiceGetJobStatus**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetJobStatus) | **Get** /api/v3/app_manager/jobs/{job_id}/status | GetJobStatus - Get the job&#x27;s status.
[**ResourceControllerK8ServiceGetTenantApp**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetTenantApp) | **Get** /api/v3/app_manager/tenants/{tenant_id}/apps/{app_name} | GetTenantApp - Get a specific app for the given tenant.
[**ResourceControllerK8ServiceGetTenantApps**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetTenantApps) | **Get** /api/v3/app_manager/tenants/{tenant_id}/apps | GetTenantApps - Get the apps for the given tenant.
[**ResourceControllerK8ServiceGetTenantJobs**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetTenantJobs) | **Get** /api/v3/app_manager/tenants/{tenant_id}/jobs | GetTenantJobs - Get jobs for the given tenant.
[**ResourceControllerK8ServiceGetVersion**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceGetVersion) | **Get** /api/v3/app_manager/system/version | GetVersion - Get the system version information for the service.
[**ResourceControllerK8ServiceInstallEdgeTenantRequest**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceInstallEdgeTenantRequest) | **Post** /api/v3/edgegateways | InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge
[**ResourceControllerK8ServiceQueryControllerLogs**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceQueryControllerLogs) | **Post** /api/v3/app_manager/controllers/{controller_id}/logs/query | QueryControllerLogs - Query for the controller logs for a running controller.
[**ResourceControllerK8ServiceUpdateCommand**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateCommand) | **Put** /api/v3/app_manager/commands/{id} | UpdateCommand - Update the command.
[**ResourceControllerK8ServiceUpdateController**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateController) | **Put** /api/v3/app_manager/controllers/{id} | UpdateController - Update an existing controller.
[**ResourceControllerK8ServiceUpdateControllerStatus**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateControllerStatus) | **Put** /api/v3/app_manager/controllers/{id}/status | UpdateControllerStatus - Updates the status for the given controller.
[**ResourceControllerK8ServiceUpdateJob**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateJob) | **Put** /api/v3/app_manager/jobs/{id} | UpdateJob - Update a job.
[**ResourceControllerK8ServiceUpdateJobExecution**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateJobExecution) | **Put** /api/v3/app_manager/job_executions/{id} | UpdateJobExecution - Update a job execution.
[**ResourceControllerK8ServiceUpdateJobStatus**](ResourceControllerK8ServiceApi.md#ResourceControllerK8ServiceUpdateJobStatus) | **Put** /api/v3/app_manager/jobs/{job_id}/status | UpdateJobStatus - Updates the status for the given Job.

# **ResourceControllerK8ServiceCreateController**
> Resourcecontrollerk8v3Controller ResourceControllerK8ServiceCreateController(ctx, body)
CreateController - Add a new controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3CreateControllerRequest**](Resourcecontrollerk8v3CreateControllerRequest.md)|  | 

### Return type

[**Resourcecontrollerk8v3Controller**](resourcecontrollerk8v3Controller.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceCreateHeartBeat**
> Resourcecontrollerk8v3CreateHeartBeatResponse ResourceControllerK8ServiceCreateHeartBeat(ctx, body, controllerId)
CreateHeartBeat - Create a heartbeat for the controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3CreateHeartBeatRequest**](Resourcecontrollerk8v3CreateHeartBeatRequest.md)|  | 
  **controllerId** | **string**| The ID of the controller to invoke a heartbeat on. | 

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatResponse**](resourcecontrollerk8v3CreateHeartBeatResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceCreateHeartBeatEx**
> Resourcecontrollerk8v3CreateHeartBeatExResponse ResourceControllerK8ServiceCreateHeartBeatEx(ctx, body, controllerId)
CreateHeartBeatEx - Create a heartbeat for the controller with extended information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3ControllerHeartbeat**](Resourcecontrollerk8v3ControllerHeartbeat.md)|  | 
  **controllerId** | **string**| Optional: controller id | 

### Return type

[**Resourcecontrollerk8v3CreateHeartBeatExResponse**](resourcecontrollerk8v3CreateHeartBeatExResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceCreateJob**
> Resourcecontrollerk8v3Job ResourceControllerK8ServiceCreateJob(ctx, body)
//////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | 

### Return type

[**Resourcecontrollerk8v3Job**](resourcecontrollerk8v3Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceCreateJobExecution**
> Resourcecontrollerk8v3JobExecution ResourceControllerK8ServiceCreateJobExecution(ctx, body)
CreateJobExecution - Create a job execution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3JobExecution**](Resourcecontrollerk8v3JobExecution.md)|  | 

### Return type

[**Resourcecontrollerk8v3JobExecution**](resourcecontrollerk8v3JobExecution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceCreateKeypair**
> Resourcecontrollerk8v3CreateKeypairResponse ResourceControllerK8ServiceCreateKeypair(ctx, body, controllerId)
CreateKeypair - Create a new keypair for the controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3CreateKeypairRequest**](Resourcecontrollerk8v3CreateKeypairRequest.md)|  | 
  **controllerId** | **string**| The ID of the controller to get app tests for. | 

### Return type

[**Resourcecontrollerk8v3CreateKeypairResponse**](resourcecontrollerk8v3CreateKeypairResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceDeleteController**
> Resourcecontrollerk8v3DeleteControllerResponse ResourceControllerK8ServiceDeleteController(ctx, body, controllerId)
DeleteController - Delete a controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3DeleteControllerRequest**](Resourcecontrollerk8v3DeleteControllerRequest.md)|  | 
  **controllerId** | **string**| The ID of the controller to get the status. | 

### Return type

[**Resourcecontrollerk8v3DeleteControllerResponse**](resourcecontrollerk8v3DeleteControllerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceDeleteEdgeTenant**
> Resourcecontrollerk8v3DeleteEdgeTenantResponse ResourceControllerK8ServiceDeleteEdgeTenant(ctx, body, tenantId)
DeleteEdgeTenant - deletes an edge tenant providing edge tenant id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost**](Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost.md)|  | 
  **tenantId** | **string**| ID of the tenant to delete | 

### Return type

[**Resourcecontrollerk8v3DeleteEdgeTenantResponse**](resourcecontrollerk8v3DeleteEdgeTenantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceDeleteEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse ResourceControllerK8ServiceDeleteEdgeTenantRequest(ctx, body, tenantId)
DeleteEdgeTenantRequest to deletes gi and tnt CR on edge

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | 
  **tenantId** | **string**| Tenant ID for the redge request | 

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](resourcecontrollerk8v3EdgeResourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceDeleteJob**
> Resourcecontrollerk8v3DeleteJobResponse ResourceControllerK8ServiceDeleteJob(ctx, body, jobId)
DeleteJob - Delete a job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3DeleteJobRequest**](Resourcecontrollerk8v3DeleteJobRequest.md)|  | 
  **jobId** | **string**| ID of the job that needs to be deleted. | 

### Return type

[**Resourcecontrollerk8v3DeleteJobResponse**](resourcecontrollerk8v3DeleteJobResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceDownloadControllerLogs**
> Resourcecontrollerk8v3DownloadControllerLogsResponse ResourceControllerK8ServiceDownloadControllerLogs(ctx, body, controllerId)
DownloadControllerLogs - Download the controller logs for a running controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3DownloadControllerLogsRequest**](Resourcecontrollerk8v3DownloadControllerLogsRequest.md)|  | 
  **controllerId** | **string**| The ID of the controller to download logs for. | 

### Return type

[**Resourcecontrollerk8v3DownloadControllerLogsResponse**](resourcecontrollerk8v3DownloadControllerLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllerApps**
> Resourcecontrollerk8v3GetControllerAppsResponse ResourceControllerK8ServiceGetControllerApps(ctx, controllerId, optional)
GetControllerApps - Get the apps for the given controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **controllerId** | **string**| The ID of the controller to get apps for. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerAppsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerAppsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **modifiedSince** | **optional.String**| Only get the apps if any were modified since the given date. | 

### Return type

[**Resourcecontrollerk8v3GetControllerAppsResponse**](resourcecontrollerk8v3GetControllerAppsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllerCommands**
> Resourcecontrollerk8v3GetControllerCommandsResponse ResourceControllerK8ServiceGetControllerCommands(ctx, controllerId)
GetControllerCommands - Get the commands for the controller to execute.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **controllerId** | **string**| The ID of the controller to get commands for. | 

### Return type

[**Resourcecontrollerk8v3GetControllerCommandsResponse**](resourcecontrollerk8v3GetControllerCommandsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllerJobs**
> Resourcecontrollerk8v3GetControllerJobsResponse ResourceControllerK8ServiceGetControllerJobs(ctx, controllerId, optional)
GetControllerJobs - Get the jobs for the controller to execute.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **controllerId** | **string**| The ID of the controller to get jobs for. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerJobsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllerJobsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **modifiedSince** | **optional.String**| Optional: Only get the jobs if any were modified since the given date. | 

### Return type

[**Resourcecontrollerk8v3GetControllerJobsResponse**](resourcecontrollerk8v3GetControllerJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllerStatus**
> Resourcecontrollerk8v3ControllerStatus ResourceControllerK8ServiceGetControllerStatus(ctx, controllerId)
GetControllerStatus - Get the status for the given controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **controllerId** | **string**| The ID of the controller to get the status. | 

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](resourcecontrollerk8v3ControllerStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllers**
> Resourcecontrollerk8v3GetControllersResponse ResourceControllerK8ServiceGetControllers(ctx, tenantId, optional)
GetControllers - Get the controllers for the given tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| The ID of the tenant to get controllers for. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **wantLocal** | **optional.Bool**| Used to indicate the caller wants the local controller. | 

### Return type

[**Resourcecontrollerk8v3GetControllersResponse**](resourcecontrollerk8v3GetControllersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetControllersWithStatus**
> Resourcecontrollerk8v3GetControllersWithStatusResponse ResourceControllerK8ServiceGetControllersWithStatus(ctx, tenantId, optional)
GetControllersWithStatus - Get the controllers for the given tenant with computed status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| The ID of the tenant to get controllers for. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersWithStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetControllersWithStatusOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **wantLocal** | **optional.Bool**| Used to indicate the caller wants the local controller. | 
 **controllerId** | **optional.String**| \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller. | 

### Return type

[**Resourcecontrollerk8v3GetControllersWithStatusResponse**](resourcecontrollerk8v3GetControllersWithStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetJob**
> Resourcecontrollerk8v3Job ResourceControllerK8ServiceGetJob(ctx, jobId, optional)
GetJob - Get the job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **jobId** | **string**| The ID of the job to get. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetJobOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **wantSecretValues** | **optional.Bool**| Optional: True to return secret values, false otherwise. | 

### Return type

[**Resourcecontrollerk8v3Job**](resourcecontrollerk8v3Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetJobExecution**
> Resourcecontrollerk8v3JobExecution ResourceControllerK8ServiceGetJobExecution(ctx, jobexeId)
GetJobExecution - Get a job execution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **jobexeId** | **string**| The ID of the job execution to get. | 

### Return type

[**Resourcecontrollerk8v3JobExecution**](resourcecontrollerk8v3JobExecution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetJobExecutions**
> Resourcecontrollerk8v3GetJobExecutionsResponse ResourceControllerK8ServiceGetJobExecutions(ctx, jobId)
GetJobExecutions - Get the job executions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **jobId** | **string**| The ID of the job to get status. | 

### Return type

[**Resourcecontrollerk8v3GetJobExecutionsResponse**](resourcecontrollerk8v3GetJobExecutionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetJobStatus**
> Resourcecontrollerk8v3JobStatusDto ResourceControllerK8ServiceGetJobStatus(ctx, jobId)
GetJobStatus - Get the job's status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **jobId** | **string**| The ID of the job to get status. | 

### Return type

[**Resourcecontrollerk8v3JobStatusDto**](resourcecontrollerk8v3JobStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetTenantApp**
> Resourcecontrollerk8v3App ResourceControllerK8ServiceGetTenantApp(ctx, tenantId, appName, optional)
GetTenantApp - Get a specific app for the given tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| The ID of the tenant to get apps for. | 
  **appName** | **string**| The name of the app to get. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **returnLevel** | **optional.String**| Optional: specify a return level for the data. This will control the amount of data returned. | 

### Return type

[**Resourcecontrollerk8v3App**](resourcecontrollerk8v3App.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetTenantApps**
> Resourcecontrollerk8v3GetTenantAppsResponse ResourceControllerK8ServiceGetTenantApps(ctx, tenantId, optional)
GetTenantApps - Get the apps for the given tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| The ID of the tenant to get apps for. | 
 **optional** | ***ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ResourceControllerK8ServiceApiResourceControllerK8ServiceGetTenantAppsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **returnLevel** | **optional.String**| Optional: specify a return level for the data. This will control the amount of data returned. | 

### Return type

[**Resourcecontrollerk8v3GetTenantAppsResponse**](resourcecontrollerk8v3GetTenantAppsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetTenantJobs**
> Resourcecontrollerk8v3GetTenantJobsResponse ResourceControllerK8ServiceGetTenantJobs(ctx, tenantId)
GetTenantJobs - Get jobs for the given tenant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **tenantId** | **string**| The ID of the tenant to get jobs for. | 

### Return type

[**Resourcecontrollerk8v3GetTenantJobsResponse**](resourcecontrollerk8v3GetTenantJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceGetVersion**
> Resourcecontrollerk8v3Version ResourceControllerK8ServiceGetVersion(ctx, )
GetVersion - Get the system version information for the service.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Resourcecontrollerk8v3Version**](resourcecontrollerk8v3Version.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceInstallEdgeTenantRequest**
> Resourcecontrollerk8v3EdgeResourceResponse ResourceControllerK8ServiceInstallEdgeTenantRequest(ctx, body)
InstallEdgeTenantRequest to Create/update gi and tnt CRs on edge

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3EdgeTenantRequest**](Resourcecontrollerk8v3EdgeTenantRequest.md)|  | 

### Return type

[**Resourcecontrollerk8v3EdgeResourceResponse**](resourcecontrollerk8v3EdgeResourceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceQueryControllerLogs**
> Resourcecontrollerk8v3QueryControllerLogsResponse ResourceControllerK8ServiceQueryControllerLogs(ctx, body, controllerId)
QueryControllerLogs - Query for the controller logs for a running controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3QueryControllerLogsRequest**](Resourcecontrollerk8v3QueryControllerLogsRequest.md)|  | 
  **controllerId** | **string**| The ID of the controller to get logs for. | 

### Return type

[**Resourcecontrollerk8v3QueryControllerLogsResponse**](resourcecontrollerk8v3QueryControllerLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateCommand**
> Resourcecontrollerk8v3ControllerCommand ResourceControllerK8ServiceUpdateCommand(ctx, body, id)
UpdateCommand - Update the command.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3ControllerCommand**](Resourcecontrollerk8v3ControllerCommand.md)|  | 
  **id** | **string**| The ID of the command. | 

### Return type

[**Resourcecontrollerk8v3ControllerCommand**](resourcecontrollerk8v3ControllerCommand.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateController**
> Resourcecontrollerk8v3Controller ResourceControllerK8ServiceUpdateController(ctx, body, id)
UpdateController - Update an existing controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3Controller**](Resourcecontrollerk8v3Controller.md)|  | 
  **id** | **string**| Optional: The internal ID of the controller. | 

### Return type

[**Resourcecontrollerk8v3Controller**](resourcecontrollerk8v3Controller.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateControllerStatus**
> Resourcecontrollerk8v3ControllerStatus ResourceControllerK8ServiceUpdateControllerStatus(ctx, body, id)
UpdateControllerStatus - Updates the status for the given controller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3ControllerStatus**](Resourcecontrollerk8v3ControllerStatus.md)|  | 
  **id** | **string**| The internal ID of the controller. | 

### Return type

[**Resourcecontrollerk8v3ControllerStatus**](resourcecontrollerk8v3ControllerStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateJob**
> Resourcecontrollerk8v3Job ResourceControllerK8ServiceUpdateJob(ctx, body, id)
UpdateJob - Update a job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3Job**](Resourcecontrollerk8v3Job.md)|  | 
  **id** | **string**| The ID of the job. | 

### Return type

[**Resourcecontrollerk8v3Job**](resourcecontrollerk8v3Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateJobExecution**
> Resourcecontrollerk8v3JobExecution ResourceControllerK8ServiceUpdateJobExecution(ctx, body, id)
UpdateJobExecution - Update a job execution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3UpdateJobExecutionRequest**](Resourcecontrollerk8v3UpdateJobExecutionRequest.md)|  | 
  **id** | **string**| The ID of the job execution to update. | 

### Return type

[**Resourcecontrollerk8v3JobExecution**](resourcecontrollerk8v3JobExecution.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResourceControllerK8ServiceUpdateJobStatus**
> Resourcecontrollerk8v3JobStatusDto ResourceControllerK8ServiceUpdateJobStatus(ctx, body, jobId)
UpdateJobStatus - Updates the status for the given Job.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Resourcecontrollerk8v3UpdateJobStatusRequest**](Resourcecontrollerk8v3UpdateJobStatusRequest.md)|  | 
  **jobId** | **string**| The ID of the job to get status. | 

### Return type

[**Resourcecontrollerk8v3JobStatusDto**](resourcecontrollerk8v3JobStatusDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

