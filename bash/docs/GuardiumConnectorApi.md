# GuardiumConnectorApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**guardiumConnectorAddCM**](GuardiumConnectorApi.md#guardiumConnectorAddCM) | **POST** /api/v3/central_managers | Summary: Add CM
Description: Add a Central Manager to the tenant database.
[**guardiumConnectorAddDatamarts**](GuardiumConnectorApi.md#guardiumConnectorAddDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
[**guardiumConnectorAddDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorAddDmExclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion
Description: Add datamart to exclusion list.
[**guardiumConnectorAddTask**](GuardiumConnectorApi.md#guardiumConnectorAddTask) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task
Description: Add a task to be executed on GDP.
[**guardiumConnectorBlockUser**](GuardiumConnectorApi.md#guardiumConnectorBlockUser) | **POST** /api/v3/block_user | Summary: Block user
Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**guardiumConnectorConfigureAggregatorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureAggregatorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export
Description: Configure datamart export from the Aggregators to GI.
[**guardiumConnectorConfigureCollectorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureCollectorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export
Description: Schedule export historical data for collectors.
[**guardiumConnectorConfigureStreaming**](GuardiumConnectorApi.md#guardiumConnectorConfigureStreaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming
Description: Enable or disable streaming.
[**guardiumConnectorDatamartVersionCheck**](GuardiumConnectorApi.md#guardiumConnectorDatamartVersionCheck) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
[**guardiumConnectorDeleteCM**](GuardiumConnectorApi.md#guardiumConnectorDeleteCM) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM
Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**guardiumConnectorDeleteDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorDeleteDmExclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion
Description: Delete a datamart from exclusion list.
[**guardiumConnectorDeleteTask**](GuardiumConnectorApi.md#guardiumConnectorDeleteTask) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task
Description: Delete a task by central manager id and task id.
[**guardiumConnectorDeleteTasks**](GuardiumConnectorApi.md#guardiumConnectorDeleteTasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks
Description: Delete a central manager&#39;s tasks by central manager id.
[**guardiumConnectorGetAggregatorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetAggregatorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config
Description: Return a list of managed units from the config collection in tenant database.
[**guardiumConnectorGetCMs**](GuardiumConnectorApi.md#guardiumConnectorGetCMs) | **GET** /api/v3/central_managers | Summary: Get CMs
Description: Return a list of Central Managers from the tenant database with additional processing.
[**guardiumConnectorGetCMsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCMsConfig) | **GET** /api/v3/central_managers_config | Summary: Get CMs config
Description: Return a list of Central Managers from the tenant database.
[**guardiumConnectorGetCollectorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCollectorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config
Description: Return the list of collectors configuration from the tenant database.
[**guardiumConnectorGetDatamarts**](GuardiumConnectorApi.md#guardiumConnectorGetDatamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**guardiumConnectorGetDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorGetDmExclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion
Description: Return datamarts in the exclusion list.
[**guardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicyInfo) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition
Description: returns the policy definition on the cm
[**guardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicySummaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary
Description: returns the summaries of all policies on that central manager
[**guardiumConnectorGetHealthInfo**](GuardiumConnectorApi.md#guardiumConnectorGetHealthInfo) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info
Description: Get health information from Guardium Data Protection central mamangers.
[**guardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorApi.md#guardiumConnectorGetLatestDMExtractionProfile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile
Description: Return the Datamart Extraction Profile for Guardium Insights.
[**guardiumConnectorGetStreamingStatus**](GuardiumConnectorApi.md#guardiumConnectorGetStreamingStatus) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status
Description: Return the streaming configuration.
[**guardiumConnectorGetSyncDMs**](GuardiumConnectorApi.md#guardiumConnectorGetSyncDMs) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs
Description: Return the list of tasks from a central manager.
[**guardiumConnectorGetTaskTypes**](GuardiumConnectorApi.md#guardiumConnectorGetTaskTypes) | **GET** /api/v3/central_managers/task_types | Summary: Get task types
Description: Return the list of supported task types.
[**guardiumConnectorGetTasks**](GuardiumConnectorApi.md#guardiumConnectorGetTasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks
Description: Return the list of tasks from a central manager.
[**guardiumConnectorRunGDPReport**](GuardiumConnectorApi.md#guardiumConnectorRunGDPReport) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report
Description: Run GDP report.
[**guardiumConnectorSetupCM**](GuardiumConnectorApi.md#guardiumConnectorSetupCM) | **POST** /api/v3/central_managers/setup | Summary: Setup CM
Description: Set up the registration between a GDP Central manager and Guardium Insights.
[**guardiumConnectorSetupDatamarts**](GuardiumConnectorApi.md#guardiumConnectorSetupDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**guardiumConnectorTaskError**](GuardiumConnectorApi.md#guardiumConnectorTaskError) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error
Description: Log error messages from GDP task execution.
[**guardiumConnectorTestDatabaseConnection**](GuardiumConnectorApi.md#guardiumConnectorTestDatabaseConnection) | **POST** /api/v3/test_database | Summary: Test database connection
Description: Return database connection results.
[**guardiumConnectorUpdateDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorUpdateDmExclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion
Description: Update the atamart exclusion list.
[**guardiumConnectorUpdateStreaming**](GuardiumConnectorApi.md#guardiumConnectorUpdateStreaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming
Description: Update streaming status into GI.
[**guardiumConnectorUpdateTask**](GuardiumConnectorApi.md#guardiumConnectorUpdateTask) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task
Description: Update a task that gets executed on GDP.



## guardiumConnectorAddCM

Summary: Add CM
Description: Add a Central Manager to the tenant database.

### Example

```bash
 guardiumConnectorAddCM
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddCMRequest** | [**Guardiumconnectorv3AddCMRequest**](Guardiumconnectorv3AddCMRequest.md) |  |

### Return type

[**Guardiumconnectorv3AddCMResponse**](Guardiumconnectorv3AddCMResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorAddDatamarts

Description: stores datamarts details from GDP

### Example

```bash
 guardiumConnectorAddDatamarts central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | central manager | [default to null]
 **guardiumconnectorv3AddDatamartsRequest** | [**Guardiumconnectorv3AddDatamartsRequest**](Guardiumconnectorv3AddDatamartsRequest.md) |  |

### Return type

[**Guardiumconnectorv3AddDatamartsResponse**](Guardiumconnectorv3AddDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorAddDmExclusion

Summary: Add DM exclusion
Description: Add datamart to exclusion list.

### Example

```bash
 guardiumConnectorAddDmExclusion
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddDmExclusionRequest** | [**Guardiumconnectorv3AddDmExclusionRequest**](Guardiumconnectorv3AddDmExclusionRequest.md) |  |

### Return type

[**Guardiumconnectorv3AddDmExclusionResponse**](Guardiumconnectorv3AddDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorAddTask

Summary: Add task
Description: Add a task to be executed on GDP.

### Example

```bash
 guardiumConnectorAddTask central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **guardiumconnectorv3AddTaskRequest** | [**Guardiumconnectorv3AddTaskRequest**](Guardiumconnectorv3AddTaskRequest.md) |  |

### Return type

[**Guardiumconnectorv3AddTaskResponse**](Guardiumconnectorv3AddTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorBlockUser

Summary: Block user
Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.

### Example

```bash
 guardiumConnectorBlockUser
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3BlockUserRequest** | [**Guardiumconnectorv3BlockUserRequest**](Guardiumconnectorv3BlockUserRequest.md) |  |

### Return type

[**Guardiumconnectorv3BlockUserResponse**](Guardiumconnectorv3BlockUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorConfigureAggregatorExport

Summary: Configure aggregator export
Description: Configure datamart export from the Aggregators to GI.

### Example

```bash
 guardiumConnectorConfigureAggregatorExport central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **guardiumconnectorv3ConfigureAggregatorExportRequest** | [**Guardiumconnectorv3ConfigureAggregatorExportRequest**](Guardiumconnectorv3ConfigureAggregatorExportRequest.md) |  |

### Return type

[**Guardiumconnectorv3ConfigureAggregatorExportResponse**](Guardiumconnectorv3ConfigureAggregatorExportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorConfigureCollectorExport

Summary: Configure collector export
Description: Schedule export historical data for collectors.

### Example

```bash
 guardiumConnectorConfigureCollectorExport central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **guardiumconnectorv3ConfigureCollectorExportRequest** | [**Guardiumconnectorv3ConfigureCollectorExportRequest**](Guardiumconnectorv3ConfigureCollectorExportRequest.md) |  |

### Return type

[**Guardiumconnectorv3ConfigureCollectorExportResponse**](Guardiumconnectorv3ConfigureCollectorExportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorConfigureStreaming

Summary: Configure streaming
Description: Enable or disable streaming.

### Example

```bash
 guardiumConnectorConfigureStreaming central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **guardiumconnectorv3ConfigureStreamingRequest** | [**Guardiumconnectorv3ConfigureStreamingRequest**](Guardiumconnectorv3ConfigureStreamingRequest.md) |  |

### Return type

[**Guardiumconnectorv3ConfigureStreamingResponse**](Guardiumconnectorv3ConfigureStreamingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorDatamartVersionCheck

Description: validates if central manager has datamart support for event model

### Example

```bash
 guardiumConnectorDatamartVersionCheck central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager | [default to null]
 **guardiumconnectorv3DatamartVersionRequest** | [**Guardiumconnectorv3DatamartVersionRequest**](Guardiumconnectorv3DatamartVersionRequest.md) |  |

### Return type

[**Guardiumconnectorv3DatamartVersionResponse**](Guardiumconnectorv3DatamartVersionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorDeleteCM

Summary: Delete CM
Description: Delete a Central Manager by ID (Name, Hostname or IP).

### Example

```bash
 guardiumConnectorDeleteCM central_manager_id=value  force=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **force** | **integer** | Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM). | [optional] [default to null]

### Return type

[**Guardiumconnectorv3DeleteCMResponse**](Guardiumconnectorv3DeleteCMResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorDeleteDmExclusion

Summary: Delete DM exclusion
Description: Delete a datamart from exclusion list.

### Example

```bash
 guardiumConnectorDeleteDmExclusion  datamart=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | **string** | Datamart name. | [optional] [default to null]

### Return type

[**Guardiumconnectorv3DeleteDmExclusionResponse**](Guardiumconnectorv3DeleteDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorDeleteTask

Summary: Delete task
Description: Delete a task by central manager id and task id.

### Example

```bash
 guardiumConnectorDeleteTask central_manager_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **taskId** | **string** | ID of task being deleted. | [default to null]

### Return type

[**Guardiumconnectorv3DeleteTaskResponse**](Guardiumconnectorv3DeleteTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorDeleteTasks

Summary: Delete tasks
Description: Delete a central manager's tasks by central manager id.

### Example

```bash
 guardiumConnectorDeleteTasks central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]

### Return type

[**Guardiumconnectorv3DeleteTasksResponse**](Guardiumconnectorv3DeleteTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetAggregatorsConfig

Summary: Get aggregators config
Description: Return a list of managed units from the config collection in tenant database.

### Example

```bash
 guardiumConnectorGetAggregatorsConfig central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]

### Return type

[**Guardiumconnectorv3GetAggregatorsConfigResponse**](Guardiumconnectorv3GetAggregatorsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetCMs

Summary: Get CMs
Description: Return a list of Central Managers from the tenant database with additional processing.

### Example

```bash
 guardiumConnectorGetCMs  run_additional_checks=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runAdditionalChecks** | **boolean** | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | [optional] [default to null]

### Return type

[**Guardiumconnectorv3GetCMsResponse**](Guardiumconnectorv3GetCMsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetCMsConfig

Summary: Get CMs config
Description: Return a list of Central Managers from the tenant database.

### Example

```bash
 guardiumConnectorGetCMsConfig
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetCMsConfigResponse**](Guardiumconnectorv3GetCMsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetCollectorsConfig

Summary: Get collectors config
Description: Return the list of collectors configuration from the tenant database.

### Example

```bash
 guardiumConnectorGetCollectorsConfig central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]

### Return type

[**Guardiumconnectorv3GetCollectorsConfigResponse**](Guardiumconnectorv3GetCollectorsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetDatamarts

Description: returns full list of supported datamarts including type (historical or non-historical)

### Example

```bash
 guardiumConnectorGetDatamarts central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | central manager hostname | [default to null]

### Return type

[**Guardiumconnectorv3GetDatamartsResponse**](Guardiumconnectorv3GetDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetDmExclusion

Summary: Get DM exclusion
Description: Return datamarts in the exclusion list.

### Example

```bash
 guardiumConnectorGetDmExclusion
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetDmExclusionResponse**](Guardiumconnectorv3GetDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetGdpPolicyInfo

Summary: Get guardium policy definition
Description: returns the policy definition on the cm

### Example

```bash
 guardiumConnectorGetGdpPolicyInfo central_manager_id=value  policy_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager hostname | [default to null]
 **policyName** | **string** | Policy name. | [optional] [default to null]

### Return type

[**Guardiumconnectorv3GetPolicyInfoResponse**](Guardiumconnectorv3GetPolicyInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetGdpPolicySummaries

Summary: Get guardium policy summary
Description: returns the summaries of all policies on that central manager

### Example

```bash
 guardiumConnectorGetGdpPolicySummaries central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central manager hostname | [default to null]

### Return type

[**Guardiumconnectorv3GetPolicySummariesResponse**](Guardiumconnectorv3GetPolicySummariesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetHealthInfo

Summary: Get gealth info
Description: Get health information from Guardium Data Protection central mamangers.

### Example

```bash
 guardiumConnectorGetHealthInfo central_manager_id=value  use_fallback=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **useFallback** | **boolean** | Flag indicating if the older gdp api is to be called in case it doesn't support new api. | [optional] [default to null]

### Return type

[**Guardiumconnectorv3GetHealthInfoResponse**](Guardiumconnectorv3GetHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetLatestDMExtractionProfile

Summary: Get latest DM extraction profile
Description: Return the Datamart Extraction Profile for Guardium Insights.

### Example

```bash
 guardiumConnectorGetLatestDMExtractionProfile central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]

### Return type

[**Guardiumconnectorv3GetLatestDMExtractionProfileResponse**](Guardiumconnectorv3GetLatestDMExtractionProfileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetStreamingStatus

Summary: Get streaming status
Description: Return the streaming configuration.

### Example

```bash
 guardiumConnectorGetStreamingStatus central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]

### Return type

[**Guardiumconnectorv3GetStreamingStatusResponse**](Guardiumconnectorv3GetStreamingStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetSyncDMs

Summary: Get sync DMs
Description: Return the list of tasks from a central manager.

### Example

```bash
 guardiumConnectorGetSyncDMs central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]

### Return type

[**Guardiumconnectorv3GetSyncDMsResponse**](Guardiumconnectorv3GetSyncDMsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetTaskTypes

Summary: Get task types
Description: Return the list of supported task types.

### Example

```bash
 guardiumConnectorGetTaskTypes
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Guardiumconnectorv3GetTaskTypesResponse**](Guardiumconnectorv3GetTaskTypesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorGetTasks

Summary: Get tasks
Description: Return the list of tasks from a central manager.

### Example

```bash
 guardiumConnectorGetTasks central_manager_id=value  task_id=value  task_type=value  key_object=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **taskId** | **string** | ID of task. | [optional] [default to null]
 **taskType** | **string** | Type of task. | [optional] [default to null]
 **keyObject** | **string** | Key object. | [optional] [default to null]

### Return type

[**Guardiumconnectorv3GetTasksResponse**](Guardiumconnectorv3GetTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorRunGDPReport

Summary: Run GDP report
Description: Run GDP report.

### Example

```bash
 guardiumConnectorRunGDPReport central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | Central Manager ID. | [default to null]
 **guardiumconnectorv3RunGDPReportRequest** | [**Guardiumconnectorv3RunGDPReportRequest**](Guardiumconnectorv3RunGDPReportRequest.md) |  |

### Return type

[**Guardiumconnectorv3RunGDPReportResponse**](Guardiumconnectorv3RunGDPReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorSetupCM

Summary: Setup CM
Description: Set up the registration between a GDP Central manager and Guardium Insights.

### Example

```bash
 guardiumConnectorSetupCM
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3SetupCMRequest** | [**Guardiumconnectorv3SetupCMRequest**](Guardiumconnectorv3SetupCMRequest.md) |  |

### Return type

[**Guardiumconnectorv3SetupCMResponse**](Guardiumconnectorv3SetupCMResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorSetupDatamarts

Description: setup custom datamart execution mode

### Example

```bash
 guardiumConnectorSetupDatamarts central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | central manager | [default to null]
 **guardiumconnectorv3SetupDatamartsRequest** | [**Guardiumconnectorv3SetupDatamartsRequest**](Guardiumconnectorv3SetupDatamartsRequest.md) |  |

### Return type

[**Guardiumconnectorv3SetupDatamartsResponse**](Guardiumconnectorv3SetupDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorTaskError

Summary: Task error
Description: Log error messages from GDP task execution.

### Example

```bash
 guardiumConnectorTaskError central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **guardiumconnectorv3TaskErrorRequest** | [**Guardiumconnectorv3TaskErrorRequest**](Guardiumconnectorv3TaskErrorRequest.md) |  |

### Return type

[**Guardiumconnectorv3TaskErrorResponse**](Guardiumconnectorv3TaskErrorResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorTestDatabaseConnection

Summary: Test database connection
Description: Return database connection results.

### Example

```bash
 guardiumConnectorTestDatabaseConnection
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3DatabaseConnectionStringRequest** | [**Guardiumconnectorv3DatabaseConnectionStringRequest**](Guardiumconnectorv3DatabaseConnectionStringRequest.md) |  |

### Return type

[**Guardiumconnectorv3DatabaseResultResponse**](Guardiumconnectorv3DatabaseResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorUpdateDmExclusion

Summary: Update DM exclusion
Description: Update the atamart exclusion list.

### Example

```bash
 guardiumConnectorUpdateDmExclusion
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateDmExclusionRequest** | [**Guardiumconnectorv3UpdateDmExclusionRequest**](Guardiumconnectorv3UpdateDmExclusionRequest.md) |  |

### Return type

[**Guardiumconnectorv3UpdateDmExclusionResponse**](Guardiumconnectorv3UpdateDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorUpdateStreaming

Summary: Update streaming
Description: Update streaming status into GI.

### Example

```bash
 guardiumConnectorUpdateStreaming central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **guardiumconnectorv3UpdateStreamingRequest** | [**Guardiumconnectorv3UpdateStreamingRequest**](Guardiumconnectorv3UpdateStreamingRequest.md) |  |

### Return type

[**Guardiumconnectorv3UpdateStreamingResponse**](Guardiumconnectorv3UpdateStreamingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## guardiumConnectorUpdateTask

Summary: Update task
Description: Update a task that gets executed on GDP.

### Example

```bash
 guardiumConnectorUpdateTask central_manager_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **taskId** | **string** | ID of task being updated. | [default to null]
 **guardiumconnectorv3UpdateTaskRequest** | [**Guardiumconnectorv3UpdateTaskRequest**](Guardiumconnectorv3UpdateTaskRequest.md) |  |

### Return type

[**Guardiumconnectorv3UpdateTaskResponse**](Guardiumconnectorv3UpdateTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

