# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GuardiumConnectorAddCM**](GuardiumConnectorApi.md#GuardiumConnectorAddCM) | **Post** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
[**GuardiumConnectorAddDatamarts**](GuardiumConnectorApi.md#GuardiumConnectorAddDatamarts) | **Post** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
[**GuardiumConnectorAddDmExclusion**](GuardiumConnectorApi.md#GuardiumConnectorAddDmExclusion) | **Post** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
[**GuardiumConnectorAddTask**](GuardiumConnectorApi.md#GuardiumConnectorAddTask) | **Post** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP.
[**GuardiumConnectorBlockUser**](GuardiumConnectorApi.md#GuardiumConnectorBlockUser) | **Post** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**GuardiumConnectorConfigureAggregatorExport**](GuardiumConnectorApi.md#GuardiumConnectorConfigureAggregatorExport) | **Put** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
[**GuardiumConnectorConfigureCollectorExport**](GuardiumConnectorApi.md#GuardiumConnectorConfigureCollectorExport) | **Put** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
[**GuardiumConnectorConfigureStreaming**](GuardiumConnectorApi.md#GuardiumConnectorConfigureStreaming) | **Post** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
[**GuardiumConnectorDatamartVersionCheck**](GuardiumConnectorApi.md#GuardiumConnectorDatamartVersionCheck) | **Post** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
[**GuardiumConnectorDeleteCM**](GuardiumConnectorApi.md#GuardiumConnectorDeleteCM) | **Delete** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**GuardiumConnectorDeleteDmExclusion**](GuardiumConnectorApi.md#GuardiumConnectorDeleteDmExclusion) | **Delete** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
[**GuardiumConnectorDeleteTask**](GuardiumConnectorApi.md#GuardiumConnectorDeleteTask) | **Delete** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id.
[**GuardiumConnectorDeleteTasks**](GuardiumConnectorApi.md#GuardiumConnectorDeleteTasks) | **Delete** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#x27;s tasks by central manager id.
[**GuardiumConnectorGetAggregatorsConfig**](GuardiumConnectorApi.md#GuardiumConnectorGetAggregatorsConfig) | **Get** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
[**GuardiumConnectorGetCMs**](GuardiumConnectorApi.md#GuardiumConnectorGetCMs) | **Get** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
[**GuardiumConnectorGetCMsConfig**](GuardiumConnectorApi.md#GuardiumConnectorGetCMsConfig) | **Get** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
[**GuardiumConnectorGetCollectorsConfig**](GuardiumConnectorApi.md#GuardiumConnectorGetCollectorsConfig) | **Get** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
[**GuardiumConnectorGetDatamarts**](GuardiumConnectorApi.md#GuardiumConnectorGetDatamarts) | **Get** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**GuardiumConnectorGetDmExclusion**](GuardiumConnectorApi.md#GuardiumConnectorGetDmExclusion) | **Get** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
[**GuardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorApi.md#GuardiumConnectorGetGdpPolicyInfo) | **Get** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
[**GuardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorApi.md#GuardiumConnectorGetGdpPolicySummaries) | **Get** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
[**GuardiumConnectorGetHealthInfo**](GuardiumConnectorApi.md#GuardiumConnectorGetHealthInfo) | **Get** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
[**GuardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorApi.md#GuardiumConnectorGetLatestDMExtractionProfile) | **Get** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.
[**GuardiumConnectorGetStreamingStatus**](GuardiumConnectorApi.md#GuardiumConnectorGetStreamingStatus) | **Get** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
[**GuardiumConnectorGetSyncDMs**](GuardiumConnectorApi.md#GuardiumConnectorGetSyncDMs) | **Get** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager.
[**GuardiumConnectorGetTaskTypes**](GuardiumConnectorApi.md#GuardiumConnectorGetTaskTypes) | **Get** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
[**GuardiumConnectorGetTasks**](GuardiumConnectorApi.md#GuardiumConnectorGetTasks) | **Get** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager.
[**GuardiumConnectorRunGDPReport**](GuardiumConnectorApi.md#GuardiumConnectorRunGDPReport) | **Post** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report.
[**GuardiumConnectorSetupCM**](GuardiumConnectorApi.md#GuardiumConnectorSetupCM) | **Post** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.
[**GuardiumConnectorSetupDatamarts**](GuardiumConnectorApi.md#GuardiumConnectorSetupDatamarts) | **Post** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**GuardiumConnectorTaskError**](GuardiumConnectorApi.md#GuardiumConnectorTaskError) | **Post** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution.
[**GuardiumConnectorTestDatabaseConnection**](GuardiumConnectorApi.md#GuardiumConnectorTestDatabaseConnection) | **Post** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
[**GuardiumConnectorUpdateDmExclusion**](GuardiumConnectorApi.md#GuardiumConnectorUpdateDmExclusion) | **Put** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
[**GuardiumConnectorUpdateStreaming**](GuardiumConnectorApi.md#GuardiumConnectorUpdateStreaming) | **Put** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI.
[**GuardiumConnectorUpdateTask**](GuardiumConnectorApi.md#GuardiumConnectorUpdateTask) | **Put** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP.

# **GuardiumConnectorAddCM**
> Guardiumconnectorv3AddCmResponse GuardiumConnectorAddCM(ctx, body)
Summary: Add CM Description: Add a Central Manager to the tenant database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3AddCmRequest**](Guardiumconnectorv3AddCmRequest.md)|  | 

### Return type

[**Guardiumconnectorv3AddCmResponse**](guardiumconnectorv3AddCMResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorAddDatamarts**
> Guardiumconnectorv3AddDatamartsResponse GuardiumConnectorAddDatamarts(ctx, body, centralManagerId)
Description: stores datamarts details from GDP

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3AddDatamartsRequest**](Guardiumconnectorv3AddDatamartsRequest.md)|  | 
  **centralManagerId** | **string**| central manager | 

### Return type

[**Guardiumconnectorv3AddDatamartsResponse**](guardiumconnectorv3AddDatamartsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorAddDmExclusion**
> Guardiumconnectorv3AddDmExclusionResponse GuardiumConnectorAddDmExclusion(ctx, body)
Summary: Add DM exclusion Description: Add datamart to exclusion list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3AddDmExclusionRequest**](Guardiumconnectorv3AddDmExclusionRequest.md)|  | 

### Return type

[**Guardiumconnectorv3AddDmExclusionResponse**](guardiumconnectorv3AddDmExclusionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorAddTask**
> Guardiumconnectorv3AddTaskResponse GuardiumConnectorAddTask(ctx, body, centralManagerId)
Summary: Add task Description: Add a task to be executed on GDP.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3AddTaskRequest**](Guardiumconnectorv3AddTaskRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Guardiumconnectorv3AddTaskResponse**](guardiumconnectorv3AddTaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorBlockUser**
> Guardiumconnectorv3BlockUserResponse GuardiumConnectorBlockUser(ctx, body)
Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3BlockUserRequest**](Guardiumconnectorv3BlockUserRequest.md)|  | 

### Return type

[**Guardiumconnectorv3BlockUserResponse**](guardiumconnectorv3BlockUserResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorConfigureAggregatorExport**
> Guardiumconnectorv3ConfigureAggregatorExportResponse GuardiumConnectorConfigureAggregatorExport(ctx, body, centralManagerId)
Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3ConfigureAggregatorExportRequest**](Guardiumconnectorv3ConfigureAggregatorExportRequest.md)|  | 
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3ConfigureAggregatorExportResponse**](guardiumconnectorv3ConfigureAggregatorExportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorConfigureCollectorExport**
> Guardiumconnectorv3ConfigureCollectorExportResponse GuardiumConnectorConfigureCollectorExport(ctx, body, centralManagerId)
Summary: Configure collector export Description: Schedule export historical data for collectors.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3ConfigureCollectorExportRequest**](Guardiumconnectorv3ConfigureCollectorExportRequest.md)|  | 
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3ConfigureCollectorExportResponse**](guardiumconnectorv3ConfigureCollectorExportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorConfigureStreaming**
> Guardiumconnectorv3ConfigureStreamingResponse GuardiumConnectorConfigureStreaming(ctx, body, centralManagerId)
Summary: Configure streaming Description: Enable or disable streaming.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3ConfigureStreamingRequest**](Guardiumconnectorv3ConfigureStreamingRequest.md)|  | 
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3ConfigureStreamingResponse**](guardiumconnectorv3ConfigureStreamingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorDatamartVersionCheck**
> Guardiumconnectorv3DatamartVersionResponse GuardiumConnectorDatamartVersionCheck(ctx, body, centralManagerId)
Description: validates if central manager has datamart support for event model

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3DatamartVersionRequest**](Guardiumconnectorv3DatamartVersionRequest.md)|  | 
  **centralManagerId** | **string**| Central manager | 

### Return type

[**Guardiumconnectorv3DatamartVersionResponse**](guardiumconnectorv3DatamartVersionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorDeleteCM**
> Guardiumconnectorv3DeleteCmResponse GuardiumConnectorDeleteCM(ctx, centralManagerId, optional)
Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 
 **optional** | ***GuardiumConnectorApiGuardiumConnectorDeleteCMOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorDeleteCMOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **force** | **optional.Int32**| Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | 

### Return type

[**Guardiumconnectorv3DeleteCmResponse**](guardiumconnectorv3DeleteCMResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorDeleteDmExclusion**
> Guardiumconnectorv3DeleteDmExclusionResponse GuardiumConnectorDeleteDmExclusion(ctx, optional)
Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | **optional.String**| Datamart name. | 

### Return type

[**Guardiumconnectorv3DeleteDmExclusionResponse**](guardiumconnectorv3DeleteDmExclusionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorDeleteTask**
> Guardiumconnectorv3DeleteTaskResponse GuardiumConnectorDeleteTask(ctx, centralManagerId, taskId)
Summary: Delete task Description: Delete a task by central manager id and task id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| ID of central manager. | 
  **taskId** | **string**| ID of task being deleted. | 

### Return type

[**Guardiumconnectorv3DeleteTaskResponse**](guardiumconnectorv3DeleteTaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorDeleteTasks**
> Guardiumconnectorv3DeleteTasksResponse GuardiumConnectorDeleteTasks(ctx, centralManagerId)
Summary: Delete tasks Description: Delete a central manager's tasks by central manager id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Guardiumconnectorv3DeleteTasksResponse**](guardiumconnectorv3DeleteTasksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetAggregatorsConfig**
> Guardiumconnectorv3GetAggregatorsConfigResponse GuardiumConnectorGetAggregatorsConfig(ctx, centralManagerId)
Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3GetAggregatorsConfigResponse**](guardiumconnectorv3GetAggregatorsConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetCMs**
> Guardiumconnectorv3GetCmsResponse GuardiumConnectorGetCMs(ctx, optional)
Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***GuardiumConnectorApiGuardiumConnectorGetCMsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorGetCMsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runAdditionalChecks** | **optional.Bool**| Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | 

### Return type

[**Guardiumconnectorv3GetCmsResponse**](guardiumconnectorv3GetCMsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetCMsConfig**
> Guardiumconnectorv3GetCmsConfigResponse GuardiumConnectorGetCMsConfig(ctx, )
Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetCmsConfigResponse**](guardiumconnectorv3GetCMsConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetCollectorsConfig**
> Guardiumconnectorv3GetCollectorsConfigResponse GuardiumConnectorGetCollectorsConfig(ctx, centralManagerId)
Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3GetCollectorsConfigResponse**](guardiumconnectorv3GetCollectorsConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetDatamarts**
> Guardiumconnectorv3GetDatamartsResponse GuardiumConnectorGetDatamarts(ctx, centralManagerId)
Description: returns full list of supported datamarts including type (historical or non-historical)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| central manager hostname | 

### Return type

[**Guardiumconnectorv3GetDatamartsResponse**](guardiumconnectorv3GetDatamartsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetDmExclusion**
> Guardiumconnectorv3GetDmExclusionResponse GuardiumConnectorGetDmExclusion(ctx, )
Summary: Get DM exclusion Description: Return datamarts in the exclusion list.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetDmExclusionResponse**](guardiumconnectorv3GetDmExclusionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetGdpPolicyInfo**
> Guardiumconnectorv3GetPolicyInfoResponse GuardiumConnectorGetGdpPolicyInfo(ctx, centralManagerId, optional)
Summary: Get guardium policy definition Description: returns the policy definition on the cm

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central manager hostname | 
 **optional** | ***GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **policyName** | **optional.String**| Policy name. | 

### Return type

[**Guardiumconnectorv3GetPolicyInfoResponse**](guardiumconnectorv3GetPolicyInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetGdpPolicySummaries**
> Guardiumconnectorv3GetPolicySummariesResponse GuardiumConnectorGetGdpPolicySummaries(ctx, centralManagerId)
Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central manager hostname | 

### Return type

[**Guardiumconnectorv3GetPolicySummariesResponse**](guardiumconnectorv3GetPolicySummariesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetHealthInfo**
> Guardiumconnectorv3GetHealthInfoResponse GuardiumConnectorGetHealthInfo(ctx, centralManagerId, optional)
Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 
 **optional** | ***GuardiumConnectorApiGuardiumConnectorGetHealthInfoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorGetHealthInfoOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **useFallback** | **optional.Bool**| Flag indicating if the older gdp api is to be called in case it doesn&#x27;t support new api. | 

### Return type

[**Guardiumconnectorv3GetHealthInfoResponse**](guardiumconnectorv3GetHealthInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetLatestDMExtractionProfile**
> Guardiumconnectorv3GetLatestDmExtractionProfileResponse GuardiumConnectorGetLatestDMExtractionProfile(ctx, centralManagerId)
Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3GetLatestDmExtractionProfileResponse**](guardiumconnectorv3GetLatestDMExtractionProfileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetStreamingStatus**
> Guardiumconnectorv3GetStreamingStatusResponse GuardiumConnectorGetStreamingStatus(ctx, centralManagerId)
Summary: Get streaming status Description: Return the streaming configuration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3GetStreamingStatusResponse**](guardiumconnectorv3GetStreamingStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetSyncDMs**
> Guardiumconnectorv3GetSyncDmsResponse GuardiumConnectorGetSyncDMs(ctx, centralManagerId)
Summary: Get sync DMs Description: Return the list of tasks from a central manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Guardiumconnectorv3GetSyncDmsResponse**](guardiumconnectorv3GetSyncDMsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetTaskTypes**
> Guardiumconnectorv3GetTaskTypesResponse GuardiumConnectorGetTaskTypes(ctx, )
Summary: Get task types Description: Return the list of supported task types.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetTaskTypesResponse**](guardiumconnectorv3GetTaskTypesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorGetTasks**
> Guardiumconnectorv3GetTasksResponse GuardiumConnectorGetTasks(ctx, centralManagerId, optional)
Summary: Get tasks Description: Return the list of tasks from a central manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **centralManagerId** | **string**| ID of central manager. | 
 **optional** | ***GuardiumConnectorApiGuardiumConnectorGetTasksOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GuardiumConnectorApiGuardiumConnectorGetTasksOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **taskId** | **optional.String**| ID of task. | 
 **taskType** | **optional.String**| Type of task. | 
 **keyObject** | **optional.String**| Key object. | 

### Return type

[**Guardiumconnectorv3GetTasksResponse**](guardiumconnectorv3GetTasksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorRunGDPReport**
> Guardiumconnectorv3RunGdpReportResponse GuardiumConnectorRunGDPReport(ctx, body, centralManagerId)
Summary: Run GDP report Description: Run GDP report.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3RunGdpReportRequest**](Guardiumconnectorv3RunGdpReportRequest.md)|  | 
  **centralManagerId** | **string**| Central Manager ID. | 

### Return type

[**Guardiumconnectorv3RunGdpReportResponse**](guardiumconnectorv3RunGDPReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorSetupCM**
> Guardiumconnectorv3SetupCmResponse GuardiumConnectorSetupCM(ctx, body)
Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3SetupCmRequest**](Guardiumconnectorv3SetupCmRequest.md)|  | 

### Return type

[**Guardiumconnectorv3SetupCmResponse**](guardiumconnectorv3SetupCMResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorSetupDatamarts**
> Guardiumconnectorv3SetupDatamartsResponse GuardiumConnectorSetupDatamarts(ctx, body, centralManagerId)
Description: setup custom datamart execution mode

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3SetupDatamartsRequest**](Guardiumconnectorv3SetupDatamartsRequest.md)|  | 
  **centralManagerId** | **string**| central manager | 

### Return type

[**Guardiumconnectorv3SetupDatamartsResponse**](guardiumconnectorv3SetupDatamartsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorTaskError**
> Guardiumconnectorv3TaskErrorResponse GuardiumConnectorTaskError(ctx, body, centralManagerId)
Summary: Task error Description: Log error messages from GDP task execution.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3TaskErrorRequest**](Guardiumconnectorv3TaskErrorRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Guardiumconnectorv3TaskErrorResponse**](guardiumconnectorv3TaskErrorResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorTestDatabaseConnection**
> Guardiumconnectorv3DatabaseResultResponse GuardiumConnectorTestDatabaseConnection(ctx, body)
Summary: Test database connection Description: Return database connection results.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3DatabaseConnectionStringRequest**](Guardiumconnectorv3DatabaseConnectionStringRequest.md)|  | 

### Return type

[**Guardiumconnectorv3DatabaseResultResponse**](guardiumconnectorv3DatabaseResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorUpdateDmExclusion**
> Guardiumconnectorv3UpdateDmExclusionResponse GuardiumConnectorUpdateDmExclusion(ctx, body)
Summary: Update DM exclusion Description: Update the atamart exclusion list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3UpdateDmExclusionRequest**](Guardiumconnectorv3UpdateDmExclusionRequest.md)|  | 

### Return type

[**Guardiumconnectorv3UpdateDmExclusionResponse**](guardiumconnectorv3UpdateDmExclusionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorUpdateStreaming**
> Guardiumconnectorv3UpdateStreamingResponse GuardiumConnectorUpdateStreaming(ctx, body, centralManagerId)
Summary: Update streaming Description: Update streaming status into GI.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3UpdateStreamingRequest**](Guardiumconnectorv3UpdateStreamingRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Guardiumconnectorv3UpdateStreamingResponse**](guardiumconnectorv3UpdateStreamingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GuardiumConnectorUpdateTask**
> Guardiumconnectorv3UpdateTaskResponse GuardiumConnectorUpdateTask(ctx, body, centralManagerId, taskId)
Summary: Update task Description: Update a task that gets executed on GDP.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Guardiumconnectorv3UpdateTaskRequest**](Guardiumconnectorv3UpdateTaskRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 
  **taskId** | **string**| ID of task being updated. | 

### Return type

[**Guardiumconnectorv3UpdateTaskResponse**](guardiumconnectorv3UpdateTaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

