# \GuardiumConnectorAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GuardiumConnectorAddCM**](GuardiumConnectorAPI.md#GuardiumConnectorAddCM) | **Post** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
[**GuardiumConnectorAddDatamarts**](GuardiumConnectorAPI.md#GuardiumConnectorAddDatamarts) | **Post** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
[**GuardiumConnectorAddDmExclusion**](GuardiumConnectorAPI.md#GuardiumConnectorAddDmExclusion) | **Post** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
[**GuardiumConnectorAddTask**](GuardiumConnectorAPI.md#GuardiumConnectorAddTask) | **Post** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP.
[**GuardiumConnectorBlockUser**](GuardiumConnectorAPI.md#GuardiumConnectorBlockUser) | **Post** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**GuardiumConnectorConfigureAggregatorExport**](GuardiumConnectorAPI.md#GuardiumConnectorConfigureAggregatorExport) | **Put** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
[**GuardiumConnectorConfigureCollectorExport**](GuardiumConnectorAPI.md#GuardiumConnectorConfigureCollectorExport) | **Put** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
[**GuardiumConnectorConfigureStreaming**](GuardiumConnectorAPI.md#GuardiumConnectorConfigureStreaming) | **Post** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
[**GuardiumConnectorDatamartVersionCheck**](GuardiumConnectorAPI.md#GuardiumConnectorDatamartVersionCheck) | **Post** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
[**GuardiumConnectorDeleteCM**](GuardiumConnectorAPI.md#GuardiumConnectorDeleteCM) | **Delete** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**GuardiumConnectorDeleteDmExclusion**](GuardiumConnectorAPI.md#GuardiumConnectorDeleteDmExclusion) | **Delete** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
[**GuardiumConnectorDeleteTask**](GuardiumConnectorAPI.md#GuardiumConnectorDeleteTask) | **Delete** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id.
[**GuardiumConnectorDeleteTasks**](GuardiumConnectorAPI.md#GuardiumConnectorDeleteTasks) | **Delete** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager&#39;s tasks by central manager id.
[**GuardiumConnectorGetAggregatorsConfig**](GuardiumConnectorAPI.md#GuardiumConnectorGetAggregatorsConfig) | **Get** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
[**GuardiumConnectorGetCMs**](GuardiumConnectorAPI.md#GuardiumConnectorGetCMs) | **Get** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
[**GuardiumConnectorGetCMsConfig**](GuardiumConnectorAPI.md#GuardiumConnectorGetCMsConfig) | **Get** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
[**GuardiumConnectorGetCollectorsConfig**](GuardiumConnectorAPI.md#GuardiumConnectorGetCollectorsConfig) | **Get** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
[**GuardiumConnectorGetDatamarts**](GuardiumConnectorAPI.md#GuardiumConnectorGetDatamarts) | **Get** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**GuardiumConnectorGetDmExclusion**](GuardiumConnectorAPI.md#GuardiumConnectorGetDmExclusion) | **Get** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
[**GuardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorAPI.md#GuardiumConnectorGetGdpPolicyInfo) | **Get** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
[**GuardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorAPI.md#GuardiumConnectorGetGdpPolicySummaries) | **Get** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
[**GuardiumConnectorGetHealthInfo**](GuardiumConnectorAPI.md#GuardiumConnectorGetHealthInfo) | **Get** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
[**GuardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorAPI.md#GuardiumConnectorGetLatestDMExtractionProfile) | **Get** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.
[**GuardiumConnectorGetStreamingStatus**](GuardiumConnectorAPI.md#GuardiumConnectorGetStreamingStatus) | **Get** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
[**GuardiumConnectorGetSyncDMs**](GuardiumConnectorAPI.md#GuardiumConnectorGetSyncDMs) | **Get** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager.
[**GuardiumConnectorGetTaskTypes**](GuardiumConnectorAPI.md#GuardiumConnectorGetTaskTypes) | **Get** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
[**GuardiumConnectorGetTasks**](GuardiumConnectorAPI.md#GuardiumConnectorGetTasks) | **Get** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager.
[**GuardiumConnectorRunGDPReport**](GuardiumConnectorAPI.md#GuardiumConnectorRunGDPReport) | **Post** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report.
[**GuardiumConnectorSetupCM**](GuardiumConnectorAPI.md#GuardiumConnectorSetupCM) | **Post** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.
[**GuardiumConnectorSetupDatamarts**](GuardiumConnectorAPI.md#GuardiumConnectorSetupDatamarts) | **Post** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**GuardiumConnectorTaskError**](GuardiumConnectorAPI.md#GuardiumConnectorTaskError) | **Post** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution.
[**GuardiumConnectorTestDatabaseConnection**](GuardiumConnectorAPI.md#GuardiumConnectorTestDatabaseConnection) | **Post** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
[**GuardiumConnectorUpdateDmExclusion**](GuardiumConnectorAPI.md#GuardiumConnectorUpdateDmExclusion) | **Put** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
[**GuardiumConnectorUpdateStreaming**](GuardiumConnectorAPI.md#GuardiumConnectorUpdateStreaming) | **Put** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI.
[**GuardiumConnectorUpdateTask**](GuardiumConnectorAPI.md#GuardiumConnectorUpdateTask) | **Put** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP.



## GuardiumConnectorAddCM

> Guardiumconnectorv3AddCMResponse GuardiumConnectorAddCM(ctx).Guardiumconnectorv3AddCMRequest(guardiumconnectorv3AddCMRequest).Execute()

Summary: Add CM Description: Add a Central Manager to the tenant database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3AddCMRequest := *openapiclient.NewGuardiumconnectorv3AddCMRequest() // Guardiumconnectorv3AddCMRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorAddCM(context.Background()).Guardiumconnectorv3AddCMRequest(guardiumconnectorv3AddCMRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorAddCM``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorAddCM`: Guardiumconnectorv3AddCMResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorAddCM`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorAddCMRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorAddDatamarts

> Guardiumconnectorv3AddDatamartsResponse GuardiumConnectorAddDatamarts(ctx, centralManagerId).Guardiumconnectorv3AddDatamartsRequest(guardiumconnectorv3AddDatamartsRequest).Execute()

Description: stores datamarts details from GDP

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | central manager
	guardiumconnectorv3AddDatamartsRequest := *openapiclient.NewGuardiumconnectorv3AddDatamartsRequest() // Guardiumconnectorv3AddDatamartsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorAddDatamarts(context.Background(), centralManagerId).Guardiumconnectorv3AddDatamartsRequest(guardiumconnectorv3AddDatamartsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorAddDatamarts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorAddDatamarts`: Guardiumconnectorv3AddDatamartsResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorAddDatamarts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | central manager | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorAddDatamartsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3AddDatamartsRequest** | [**Guardiumconnectorv3AddDatamartsRequest**](Guardiumconnectorv3AddDatamartsRequest.md) |  | 

### Return type

[**Guardiumconnectorv3AddDatamartsResponse**](Guardiumconnectorv3AddDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorAddDmExclusion

> Guardiumconnectorv3AddDmExclusionResponse GuardiumConnectorAddDmExclusion(ctx).Guardiumconnectorv3AddDmExclusionRequest(guardiumconnectorv3AddDmExclusionRequest).Execute()

Summary: Add DM exclusion Description: Add datamart to exclusion list.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3AddDmExclusionRequest := *openapiclient.NewGuardiumconnectorv3AddDmExclusionRequest() // Guardiumconnectorv3AddDmExclusionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorAddDmExclusion(context.Background()).Guardiumconnectorv3AddDmExclusionRequest(guardiumconnectorv3AddDmExclusionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorAddDmExclusion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorAddDmExclusion`: Guardiumconnectorv3AddDmExclusionResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorAddDmExclusion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorAddDmExclusionRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorAddTask

> Guardiumconnectorv3AddTaskResponse GuardiumConnectorAddTask(ctx, centralManagerId).Guardiumconnectorv3AddTaskRequest(guardiumconnectorv3AddTaskRequest).Execute()

Summary: Add task Description: Add a task to be executed on GDP.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	guardiumconnectorv3AddTaskRequest := *openapiclient.NewGuardiumconnectorv3AddTaskRequest() // Guardiumconnectorv3AddTaskRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorAddTask(context.Background(), centralManagerId).Guardiumconnectorv3AddTaskRequest(guardiumconnectorv3AddTaskRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorAddTask``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorAddTask`: Guardiumconnectorv3AddTaskResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorAddTask`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorAddTaskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3AddTaskRequest** | [**Guardiumconnectorv3AddTaskRequest**](Guardiumconnectorv3AddTaskRequest.md) |  | 

### Return type

[**Guardiumconnectorv3AddTaskResponse**](Guardiumconnectorv3AddTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorBlockUser

> Guardiumconnectorv3BlockUserResponse GuardiumConnectorBlockUser(ctx).Guardiumconnectorv3BlockUserRequest(guardiumconnectorv3BlockUserRequest).Execute()

Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3BlockUserRequest := *openapiclient.NewGuardiumconnectorv3BlockUserRequest() // Guardiumconnectorv3BlockUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorBlockUser(context.Background()).Guardiumconnectorv3BlockUserRequest(guardiumconnectorv3BlockUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorBlockUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorBlockUser`: Guardiumconnectorv3BlockUserResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorBlockUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorBlockUserRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorConfigureAggregatorExport

> Guardiumconnectorv3ConfigureAggregatorExportResponse GuardiumConnectorConfigureAggregatorExport(ctx, centralManagerId).Guardiumconnectorv3ConfigureAggregatorExportRequest(guardiumconnectorv3ConfigureAggregatorExportRequest).Execute()

Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	guardiumconnectorv3ConfigureAggregatorExportRequest := *openapiclient.NewGuardiumconnectorv3ConfigureAggregatorExportRequest() // Guardiumconnectorv3ConfigureAggregatorExportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorConfigureAggregatorExport(context.Background(), centralManagerId).Guardiumconnectorv3ConfigureAggregatorExportRequest(guardiumconnectorv3ConfigureAggregatorExportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorConfigureAggregatorExport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorConfigureAggregatorExport`: Guardiumconnectorv3ConfigureAggregatorExportResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorConfigureAggregatorExport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorConfigureAggregatorExportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3ConfigureAggregatorExportRequest** | [**Guardiumconnectorv3ConfigureAggregatorExportRequest**](Guardiumconnectorv3ConfigureAggregatorExportRequest.md) |  | 

### Return type

[**Guardiumconnectorv3ConfigureAggregatorExportResponse**](Guardiumconnectorv3ConfigureAggregatorExportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorConfigureCollectorExport

> Guardiumconnectorv3ConfigureCollectorExportResponse GuardiumConnectorConfigureCollectorExport(ctx, centralManagerId).Guardiumconnectorv3ConfigureCollectorExportRequest(guardiumconnectorv3ConfigureCollectorExportRequest).Execute()

Summary: Configure collector export Description: Schedule export historical data for collectors.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	guardiumconnectorv3ConfigureCollectorExportRequest := *openapiclient.NewGuardiumconnectorv3ConfigureCollectorExportRequest() // Guardiumconnectorv3ConfigureCollectorExportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorConfigureCollectorExport(context.Background(), centralManagerId).Guardiumconnectorv3ConfigureCollectorExportRequest(guardiumconnectorv3ConfigureCollectorExportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorConfigureCollectorExport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorConfigureCollectorExport`: Guardiumconnectorv3ConfigureCollectorExportResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorConfigureCollectorExport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorConfigureCollectorExportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3ConfigureCollectorExportRequest** | [**Guardiumconnectorv3ConfigureCollectorExportRequest**](Guardiumconnectorv3ConfigureCollectorExportRequest.md) |  | 

### Return type

[**Guardiumconnectorv3ConfigureCollectorExportResponse**](Guardiumconnectorv3ConfigureCollectorExportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorConfigureStreaming

> Guardiumconnectorv3ConfigureStreamingResponse GuardiumConnectorConfigureStreaming(ctx, centralManagerId).Guardiumconnectorv3ConfigureStreamingRequest(guardiumconnectorv3ConfigureStreamingRequest).Execute()

Summary: Configure streaming Description: Enable or disable streaming.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	guardiumconnectorv3ConfigureStreamingRequest := *openapiclient.NewGuardiumconnectorv3ConfigureStreamingRequest() // Guardiumconnectorv3ConfigureStreamingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorConfigureStreaming(context.Background(), centralManagerId).Guardiumconnectorv3ConfigureStreamingRequest(guardiumconnectorv3ConfigureStreamingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorConfigureStreaming``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorConfigureStreaming`: Guardiumconnectorv3ConfigureStreamingResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorConfigureStreaming`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorConfigureStreamingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3ConfigureStreamingRequest** | [**Guardiumconnectorv3ConfigureStreamingRequest**](Guardiumconnectorv3ConfigureStreamingRequest.md) |  | 

### Return type

[**Guardiumconnectorv3ConfigureStreamingResponse**](Guardiumconnectorv3ConfigureStreamingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorDatamartVersionCheck

> Guardiumconnectorv3DatamartVersionResponse GuardiumConnectorDatamartVersionCheck(ctx, centralManagerId).Guardiumconnectorv3DatamartVersionRequest(guardiumconnectorv3DatamartVersionRequest).Execute()

Description: validates if central manager has datamart support for event model

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central manager
	guardiumconnectorv3DatamartVersionRequest := *openapiclient.NewGuardiumconnectorv3DatamartVersionRequest() // Guardiumconnectorv3DatamartVersionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorDatamartVersionCheck(context.Background(), centralManagerId).Guardiumconnectorv3DatamartVersionRequest(guardiumconnectorv3DatamartVersionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorDatamartVersionCheck``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorDatamartVersionCheck`: Guardiumconnectorv3DatamartVersionResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorDatamartVersionCheck`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central manager | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorDatamartVersionCheckRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3DatamartVersionRequest** | [**Guardiumconnectorv3DatamartVersionRequest**](Guardiumconnectorv3DatamartVersionRequest.md) |  | 

### Return type

[**Guardiumconnectorv3DatamartVersionResponse**](Guardiumconnectorv3DatamartVersionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorDeleteCM

> Guardiumconnectorv3DeleteCMResponse GuardiumConnectorDeleteCM(ctx, centralManagerId).Force(force).Execute()

Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	force := int32(56) // int32 | Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorDeleteCM(context.Background(), centralManagerId).Force(force).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorDeleteCM``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorDeleteCM`: Guardiumconnectorv3DeleteCMResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorDeleteCM`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorDeleteCMRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **force** | **int32** | Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | 

### Return type

[**Guardiumconnectorv3DeleteCMResponse**](Guardiumconnectorv3DeleteCMResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorDeleteDmExclusion

> Guardiumconnectorv3DeleteDmExclusionResponse GuardiumConnectorDeleteDmExclusion(ctx).Datamart(datamart).Execute()

Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	datamart := "datamart_example" // string | Datamart name. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorDeleteDmExclusion(context.Background()).Datamart(datamart).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorDeleteDmExclusion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorDeleteDmExclusion`: Guardiumconnectorv3DeleteDmExclusionResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorDeleteDmExclusion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorDeleteDmExclusionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | **string** | Datamart name. | 

### Return type

[**Guardiumconnectorv3DeleteDmExclusionResponse**](Guardiumconnectorv3DeleteDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorDeleteTask

> Guardiumconnectorv3DeleteTaskResponse GuardiumConnectorDeleteTask(ctx, centralManagerId, taskId).Execute()

Summary: Delete task Description: Delete a task by central manager id and task id.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	taskId := "taskId_example" // string | ID of task being deleted.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorDeleteTask(context.Background(), centralManagerId, taskId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorDeleteTask``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorDeleteTask`: Guardiumconnectorv3DeleteTaskResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorDeleteTask`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 
**taskId** | **string** | ID of task being deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorDeleteTaskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Guardiumconnectorv3DeleteTaskResponse**](Guardiumconnectorv3DeleteTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorDeleteTasks

> Guardiumconnectorv3DeleteTasksResponse GuardiumConnectorDeleteTasks(ctx, centralManagerId).Execute()

Summary: Delete tasks Description: Delete a central manager's tasks by central manager id.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorDeleteTasks(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorDeleteTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorDeleteTasks`: Guardiumconnectorv3DeleteTasksResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorDeleteTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorDeleteTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3DeleteTasksResponse**](Guardiumconnectorv3DeleteTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetAggregatorsConfig

> Guardiumconnectorv3GetAggregatorsConfigResponse GuardiumConnectorGetAggregatorsConfig(ctx, centralManagerId).Execute()

Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetAggregatorsConfig(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetAggregatorsConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetAggregatorsConfig`: Guardiumconnectorv3GetAggregatorsConfigResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetAggregatorsConfig`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetAggregatorsConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetAggregatorsConfigResponse**](Guardiumconnectorv3GetAggregatorsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetCMs

> Guardiumconnectorv3GetCMsResponse GuardiumConnectorGetCMs(ctx).RunAdditionalChecks(runAdditionalChecks).Execute()

Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	runAdditionalChecks := true // bool | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetCMs(context.Background()).RunAdditionalChecks(runAdditionalChecks).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetCMs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetCMs`: Guardiumconnectorv3GetCMsResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetCMs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetCMsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runAdditionalChecks** | **bool** | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | 

### Return type

[**Guardiumconnectorv3GetCMsResponse**](Guardiumconnectorv3GetCMsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetCMsConfig

> Guardiumconnectorv3GetCMsConfigResponse GuardiumConnectorGetCMsConfig(ctx).Execute()

Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetCMsConfig(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetCMsConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetCMsConfig`: Guardiumconnectorv3GetCMsConfigResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetCMsConfig`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetCMsConfigRequest struct via the builder pattern


### Return type

[**Guardiumconnectorv3GetCMsConfigResponse**](Guardiumconnectorv3GetCMsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetCollectorsConfig

> Guardiumconnectorv3GetCollectorsConfigResponse GuardiumConnectorGetCollectorsConfig(ctx, centralManagerId).Execute()

Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetCollectorsConfig(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetCollectorsConfig``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetCollectorsConfig`: Guardiumconnectorv3GetCollectorsConfigResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetCollectorsConfig`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetCollectorsConfigRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetCollectorsConfigResponse**](Guardiumconnectorv3GetCollectorsConfigResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetDatamarts

> Guardiumconnectorv3GetDatamartsResponse GuardiumConnectorGetDatamarts(ctx, centralManagerId).Execute()

Description: returns full list of supported datamarts including type (historical or non-historical)

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | central manager hostname

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetDatamarts(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetDatamarts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetDatamarts`: Guardiumconnectorv3GetDatamartsResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetDatamarts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | central manager hostname | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetDatamartsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetDatamartsResponse**](Guardiumconnectorv3GetDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetDmExclusion

> Guardiumconnectorv3GetDmExclusionResponse GuardiumConnectorGetDmExclusion(ctx).Execute()

Summary: Get DM exclusion Description: Return datamarts in the exclusion list.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetDmExclusion(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetDmExclusion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetDmExclusion`: Guardiumconnectorv3GetDmExclusionResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetDmExclusion`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetDmExclusionRequest struct via the builder pattern


### Return type

[**Guardiumconnectorv3GetDmExclusionResponse**](Guardiumconnectorv3GetDmExclusionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetGdpPolicyInfo

> Guardiumconnectorv3GetPolicyInfoResponse GuardiumConnectorGetGdpPolicyInfo(ctx, centralManagerId).PolicyName(policyName).Execute()

Summary: Get guardium policy definition Description: returns the policy definition on the cm

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central manager hostname
	policyName := "policyName_example" // string | Policy name. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicyInfo(context.Background(), centralManagerId).PolicyName(policyName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicyInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetGdpPolicyInfo`: Guardiumconnectorv3GetPolicyInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicyInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central manager hostname | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetGdpPolicyInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **policyName** | **string** | Policy name. | 

### Return type

[**Guardiumconnectorv3GetPolicyInfoResponse**](Guardiumconnectorv3GetPolicyInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetGdpPolicySummaries

> Guardiumconnectorv3GetPolicySummariesResponse GuardiumConnectorGetGdpPolicySummaries(ctx, centralManagerId).Execute()

Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central manager hostname

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicySummaries(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicySummaries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetGdpPolicySummaries`: Guardiumconnectorv3GetPolicySummariesResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetGdpPolicySummaries`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central manager hostname | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetGdpPolicySummariesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetPolicySummariesResponse**](Guardiumconnectorv3GetPolicySummariesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetHealthInfo

> Guardiumconnectorv3GetHealthInfoResponse GuardiumConnectorGetHealthInfo(ctx, centralManagerId).UseFallback(useFallback).Execute()

Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	useFallback := true // bool | Flag indicating if the older gdp api is to be called in case it doesn't support new api. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetHealthInfo(context.Background(), centralManagerId).UseFallback(useFallback).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetHealthInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetHealthInfo`: Guardiumconnectorv3GetHealthInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetHealthInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetHealthInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **useFallback** | **bool** | Flag indicating if the older gdp api is to be called in case it doesn&#39;t support new api. | 

### Return type

[**Guardiumconnectorv3GetHealthInfoResponse**](Guardiumconnectorv3GetHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetLatestDMExtractionProfile

> Guardiumconnectorv3GetLatestDMExtractionProfileResponse GuardiumConnectorGetLatestDMExtractionProfile(ctx, centralManagerId).Execute()

Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium Insights.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetLatestDMExtractionProfile(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetLatestDMExtractionProfile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetLatestDMExtractionProfile`: Guardiumconnectorv3GetLatestDMExtractionProfileResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetLatestDMExtractionProfile`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetLatestDMExtractionProfileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetLatestDMExtractionProfileResponse**](Guardiumconnectorv3GetLatestDMExtractionProfileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetStreamingStatus

> Guardiumconnectorv3GetStreamingStatusResponse GuardiumConnectorGetStreamingStatus(ctx, centralManagerId).Execute()

Summary: Get streaming status Description: Return the streaming configuration.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetStreamingStatus(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetStreamingStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetStreamingStatus`: Guardiumconnectorv3GetStreamingStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetStreamingStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetStreamingStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetStreamingStatusResponse**](Guardiumconnectorv3GetStreamingStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetSyncDMs

> Guardiumconnectorv3GetSyncDMsResponse GuardiumConnectorGetSyncDMs(ctx, centralManagerId).Execute()

Summary: Get sync DMs Description: Return the list of tasks from a central manager.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetSyncDMs(context.Background(), centralManagerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetSyncDMs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetSyncDMs`: Guardiumconnectorv3GetSyncDMsResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetSyncDMs`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetSyncDMsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Guardiumconnectorv3GetSyncDMsResponse**](Guardiumconnectorv3GetSyncDMsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetTaskTypes

> Guardiumconnectorv3GetTaskTypesResponse GuardiumConnectorGetTaskTypes(ctx).Execute()

Summary: Get task types Description: Return the list of supported task types.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetTaskTypes(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetTaskTypes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetTaskTypes`: Guardiumconnectorv3GetTaskTypesResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetTaskTypes`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetTaskTypesRequest struct via the builder pattern


### Return type

[**Guardiumconnectorv3GetTaskTypesResponse**](Guardiumconnectorv3GetTaskTypesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorGetTasks

> Guardiumconnectorv3GetTasksResponse GuardiumConnectorGetTasks(ctx, centralManagerId).TaskId(taskId).TaskType(taskType).KeyObject(keyObject).Execute()

Summary: Get tasks Description: Return the list of tasks from a central manager.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	taskId := "taskId_example" // string | ID of task. (optional)
	taskType := "taskType_example" // string | Type of task. (optional)
	keyObject := "keyObject_example" // string | Key object. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorGetTasks(context.Background(), centralManagerId).TaskId(taskId).TaskType(taskType).KeyObject(keyObject).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorGetTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorGetTasks`: Guardiumconnectorv3GetTasksResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorGetTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorGetTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **taskId** | **string** | ID of task. | 
 **taskType** | **string** | Type of task. | 
 **keyObject** | **string** | Key object. | 

### Return type

[**Guardiumconnectorv3GetTasksResponse**](Guardiumconnectorv3GetTasksResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorRunGDPReport

> Guardiumconnectorv3RunGDPReportResponse GuardiumConnectorRunGDPReport(ctx, centralManagerId).Guardiumconnectorv3RunGDPReportRequest(guardiumconnectorv3RunGDPReportRequest).Execute()

Summary: Run GDP report Description: Run GDP report.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | Central Manager ID.
	guardiumconnectorv3RunGDPReportRequest := *openapiclient.NewGuardiumconnectorv3RunGDPReportRequest() // Guardiumconnectorv3RunGDPReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorRunGDPReport(context.Background(), centralManagerId).Guardiumconnectorv3RunGDPReportRequest(guardiumconnectorv3RunGDPReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorRunGDPReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorRunGDPReport`: Guardiumconnectorv3RunGDPReportResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorRunGDPReport`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | Central Manager ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorRunGDPReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3RunGDPReportRequest** | [**Guardiumconnectorv3RunGDPReportRequest**](Guardiumconnectorv3RunGDPReportRequest.md) |  | 

### Return type

[**Guardiumconnectorv3RunGDPReportResponse**](Guardiumconnectorv3RunGDPReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorSetupCM

> Guardiumconnectorv3SetupCMResponse GuardiumConnectorSetupCM(ctx).Guardiumconnectorv3SetupCMRequest(guardiumconnectorv3SetupCMRequest).Execute()

Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium Insights.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3SetupCMRequest := *openapiclient.NewGuardiumconnectorv3SetupCMRequest() // Guardiumconnectorv3SetupCMRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorSetupCM(context.Background()).Guardiumconnectorv3SetupCMRequest(guardiumconnectorv3SetupCMRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorSetupCM``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorSetupCM`: Guardiumconnectorv3SetupCMResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorSetupCM`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorSetupCMRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorSetupDatamarts

> Guardiumconnectorv3SetupDatamartsResponse GuardiumConnectorSetupDatamarts(ctx, centralManagerId).Guardiumconnectorv3SetupDatamartsRequest(guardiumconnectorv3SetupDatamartsRequest).Execute()

Description: setup custom datamart execution mode

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | central manager
	guardiumconnectorv3SetupDatamartsRequest := *openapiclient.NewGuardiumconnectorv3SetupDatamartsRequest() // Guardiumconnectorv3SetupDatamartsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorSetupDatamarts(context.Background(), centralManagerId).Guardiumconnectorv3SetupDatamartsRequest(guardiumconnectorv3SetupDatamartsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorSetupDatamarts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorSetupDatamarts`: Guardiumconnectorv3SetupDatamartsResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorSetupDatamarts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | central manager | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorSetupDatamartsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3SetupDatamartsRequest** | [**Guardiumconnectorv3SetupDatamartsRequest**](Guardiumconnectorv3SetupDatamartsRequest.md) |  | 

### Return type

[**Guardiumconnectorv3SetupDatamartsResponse**](Guardiumconnectorv3SetupDatamartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorTaskError

> Guardiumconnectorv3TaskErrorResponse GuardiumConnectorTaskError(ctx, centralManagerId).Guardiumconnectorv3TaskErrorRequest(guardiumconnectorv3TaskErrorRequest).Execute()

Summary: Task error Description: Log error messages from GDP task execution.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	guardiumconnectorv3TaskErrorRequest := *openapiclient.NewGuardiumconnectorv3TaskErrorRequest() // Guardiumconnectorv3TaskErrorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorTaskError(context.Background(), centralManagerId).Guardiumconnectorv3TaskErrorRequest(guardiumconnectorv3TaskErrorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorTaskError``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorTaskError`: Guardiumconnectorv3TaskErrorResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorTaskError`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorTaskErrorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3TaskErrorRequest** | [**Guardiumconnectorv3TaskErrorRequest**](Guardiumconnectorv3TaskErrorRequest.md) |  | 

### Return type

[**Guardiumconnectorv3TaskErrorResponse**](Guardiumconnectorv3TaskErrorResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorTestDatabaseConnection

> Guardiumconnectorv3DatabaseResultResponse GuardiumConnectorTestDatabaseConnection(ctx).Guardiumconnectorv3DatabaseConnectionStringRequest(guardiumconnectorv3DatabaseConnectionStringRequest).Execute()

Summary: Test database connection Description: Return database connection results.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3DatabaseConnectionStringRequest := *openapiclient.NewGuardiumconnectorv3DatabaseConnectionStringRequest() // Guardiumconnectorv3DatabaseConnectionStringRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorTestDatabaseConnection(context.Background()).Guardiumconnectorv3DatabaseConnectionStringRequest(guardiumconnectorv3DatabaseConnectionStringRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorTestDatabaseConnection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorTestDatabaseConnection`: Guardiumconnectorv3DatabaseResultResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorTestDatabaseConnection`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorTestDatabaseConnectionRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorUpdateDmExclusion

> Guardiumconnectorv3UpdateDmExclusionResponse GuardiumConnectorUpdateDmExclusion(ctx).Guardiumconnectorv3UpdateDmExclusionRequest(guardiumconnectorv3UpdateDmExclusionRequest).Execute()

Summary: Update DM exclusion Description: Update the atamart exclusion list.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	guardiumconnectorv3UpdateDmExclusionRequest := *openapiclient.NewGuardiumconnectorv3UpdateDmExclusionRequest() // Guardiumconnectorv3UpdateDmExclusionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorUpdateDmExclusion(context.Background()).Guardiumconnectorv3UpdateDmExclusionRequest(guardiumconnectorv3UpdateDmExclusionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorUpdateDmExclusion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorUpdateDmExclusion`: Guardiumconnectorv3UpdateDmExclusionResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorUpdateDmExclusion`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorUpdateDmExclusionRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorUpdateStreaming

> Guardiumconnectorv3UpdateStreamingResponse GuardiumConnectorUpdateStreaming(ctx, centralManagerId).Guardiumconnectorv3UpdateStreamingRequest(guardiumconnectorv3UpdateStreamingRequest).Execute()

Summary: Update streaming Description: Update streaming status into GI.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	guardiumconnectorv3UpdateStreamingRequest := *openapiclient.NewGuardiumconnectorv3UpdateStreamingRequest() // Guardiumconnectorv3UpdateStreamingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorUpdateStreaming(context.Background(), centralManagerId).Guardiumconnectorv3UpdateStreamingRequest(guardiumconnectorv3UpdateStreamingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorUpdateStreaming``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorUpdateStreaming`: Guardiumconnectorv3UpdateStreamingResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorUpdateStreaming`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorUpdateStreamingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **guardiumconnectorv3UpdateStreamingRequest** | [**Guardiumconnectorv3UpdateStreamingRequest**](Guardiumconnectorv3UpdateStreamingRequest.md) |  | 

### Return type

[**Guardiumconnectorv3UpdateStreamingResponse**](Guardiumconnectorv3UpdateStreamingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GuardiumConnectorUpdateTask

> Guardiumconnectorv3UpdateTaskResponse GuardiumConnectorUpdateTask(ctx, centralManagerId, taskId).Guardiumconnectorv3UpdateTaskRequest(guardiumconnectorv3UpdateTaskRequest).Execute()

Summary: Update task Description: Update a task that gets executed on GDP.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	centralManagerId := "centralManagerId_example" // string | ID of central manager.
	taskId := "taskId_example" // string | ID of task being updated.
	guardiumconnectorv3UpdateTaskRequest := *openapiclient.NewGuardiumconnectorv3UpdateTaskRequest() // Guardiumconnectorv3UpdateTaskRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GuardiumConnectorAPI.GuardiumConnectorUpdateTask(context.Background(), centralManagerId, taskId).Guardiumconnectorv3UpdateTaskRequest(guardiumconnectorv3UpdateTaskRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GuardiumConnectorAPI.GuardiumConnectorUpdateTask``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GuardiumConnectorUpdateTask`: Guardiumconnectorv3UpdateTaskResponse
	fmt.Fprintf(os.Stdout, "Response from `GuardiumConnectorAPI.GuardiumConnectorUpdateTask`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**centralManagerId** | **string** | ID of central manager. | 
**taskId** | **string** | ID of task being updated. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGuardiumConnectorUpdateTaskRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **guardiumconnectorv3UpdateTaskRequest** | [**Guardiumconnectorv3UpdateTaskRequest**](Guardiumconnectorv3UpdateTaskRequest.md) |  | 

### Return type

[**Guardiumconnectorv3UpdateTaskResponse**](Guardiumconnectorv3UpdateTaskResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

