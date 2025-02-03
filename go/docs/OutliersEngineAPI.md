# \OutliersEngineAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OutliersEngineGetSourceStatistics**](OutliersEngineAPI.md#OutliersEngineGetSourceStatistics) | **Get** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**OutliersEngineGetStatistics**](OutliersEngineAPI.md#OutliersEngineGetStatistics) | **Get** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**OutliersEngineGetWorkingHoursPeriods**](OutliersEngineAPI.md#OutliersEngineGetWorkingHoursPeriods) | **Get** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
[**OutliersEngineRunSimulator**](OutliersEngineAPI.md#OutliersEngineRunSimulator) | **Post** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
[**OutliersEngineUpdateWorkingHoursPeriods**](OutliersEngineAPI.md#OutliersEngineUpdateWorkingHoursPeriods) | **Put** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
[**OutliersEngineUploadAndAnalyzePeriod**](OutliersEngineAPI.md#OutliersEngineUploadAndAnalyzePeriod) | **Post** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
[**OutliersEngineUserClustering**](OutliersEngineAPI.md#OutliersEngineUserClustering) | **Post** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.



## OutliersEngineGetSourceStatistics

> Outliersenginev3GetSourceStatisticsResponse OutliersEngineGetSourceStatistics(ctx).SourceServerIp(sourceServerIp).SourceDatabaseName(sourceDatabaseName).SourceDbUser(sourceDbUser).AttributesLimit(attributesLimit).Execute()

Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.

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
	sourceServerIp := "sourceServerIp_example" // string | server ip. (optional)
	sourceDatabaseName := "sourceDatabaseName_example" // string | database name. (optional)
	sourceDbUser := "sourceDbUser_example" // string | db user name (optional). (optional)
	attributesLimit := int32(56) // int32 | The number of attributes to return for each SourceAttributeType - optional. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineGetSourceStatistics(context.Background()).SourceServerIp(sourceServerIp).SourceDatabaseName(sourceDatabaseName).SourceDbUser(sourceDbUser).AttributesLimit(attributesLimit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineGetSourceStatistics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineGetSourceStatistics`: Outliersenginev3GetSourceStatisticsResponse
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineGetSourceStatistics`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineGetSourceStatisticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceServerIp** | **string** | server ip. | 
 **sourceDatabaseName** | **string** | database name. | 
 **sourceDbUser** | **string** | db user name (optional). | 
 **attributesLimit** | **int32** | The number of attributes to return for each SourceAttributeType - optional. | 

### Return type

[**Outliersenginev3GetSourceStatisticsResponse**](Outliersenginev3GetSourceStatisticsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineGetStatistics

> Outliersenginev3StatisticsResponse OutliersEngineGetStatistics(ctx).Execute()

Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.

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
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineGetStatistics(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineGetStatistics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineGetStatistics`: Outliersenginev3StatisticsResponse
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineGetStatistics`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineGetStatisticsRequest struct via the builder pattern


### Return type

[**Outliersenginev3StatisticsResponse**](Outliersenginev3StatisticsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineGetWorkingHoursPeriods

> Outliersenginev3GetWorkingHoursPeriodsResponse OutliersEngineGetWorkingHoursPeriods(ctx).Execute()

Summary: Get working hours periods Description: Get a list of the working hours periods.

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
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineGetWorkingHoursPeriods(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineGetWorkingHoursPeriods``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineGetWorkingHoursPeriods`: Outliersenginev3GetWorkingHoursPeriodsResponse
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineGetWorkingHoursPeriods`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineGetWorkingHoursPeriodsRequest struct via the builder pattern


### Return type

[**Outliersenginev3GetWorkingHoursPeriodsResponse**](Outliersenginev3GetWorkingHoursPeriodsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineRunSimulator

> RpcStatus OutliersEngineRunSimulator(ctx).Outliersenginev3RunSimulatorRequest(outliersenginev3RunSimulatorRequest).Execute()

Summary: Run simulator Description: Run outlier simulator.

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
	outliersenginev3RunSimulatorRequest := *openapiclient.NewOutliersenginev3RunSimulatorRequest() // Outliersenginev3RunSimulatorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineRunSimulator(context.Background()).Outliersenginev3RunSimulatorRequest(outliersenginev3RunSimulatorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineRunSimulator``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineRunSimulator`: RpcStatus
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineRunSimulator`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineRunSimulatorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3RunSimulatorRequest** | [**Outliersenginev3RunSimulatorRequest**](Outliersenginev3RunSimulatorRequest.md) |  | 

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineUpdateWorkingHoursPeriods

> Outliersenginev3OutlierResponse OutliersEngineUpdateWorkingHoursPeriods(ctx).Outliersenginev3UpdateWorkingHoursPeriodsRequest(outliersenginev3UpdateWorkingHoursPeriodsRequest).Execute()

Summary: Update working hours periods Description: Update the working hours periods values.

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
	outliersenginev3UpdateWorkingHoursPeriodsRequest := *openapiclient.NewOutliersenginev3UpdateWorkingHoursPeriodsRequest() // Outliersenginev3UpdateWorkingHoursPeriodsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineUpdateWorkingHoursPeriods(context.Background()).Outliersenginev3UpdateWorkingHoursPeriodsRequest(outliersenginev3UpdateWorkingHoursPeriodsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineUpdateWorkingHoursPeriods``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineUpdateWorkingHoursPeriods`: Outliersenginev3OutlierResponse
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineUpdateWorkingHoursPeriods`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineUpdateWorkingHoursPeriodsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3UpdateWorkingHoursPeriodsRequest** | [**Outliersenginev3UpdateWorkingHoursPeriodsRequest**](Outliersenginev3UpdateWorkingHoursPeriodsRequest.md) |  | 

### Return type

[**Outliersenginev3OutlierResponse**](Outliersenginev3OutlierResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineUploadAndAnalyzePeriod

> RpcStatus OutliersEngineUploadAndAnalyzePeriod(ctx).Body(body).Execute()

Summary: Upload and analyze period Description: Run outliers detection on ready periods.

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
	body := map[string]interface{}{ ... } // map[string]interface{} | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineUploadAndAnalyzePeriod(context.Background()).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineUploadAndAnalyzePeriod``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineUploadAndAnalyzePeriod`: RpcStatus
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineUploadAndAnalyzePeriod`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineUploadAndAnalyzePeriodRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## OutliersEngineUserClustering

> RpcStatus OutliersEngineUserClustering(ctx).Body(body).Execute()

Summary: User clustering Description: Run user-clustering on current sources.

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
	body := map[string]interface{}{ ... } // map[string]interface{} | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutliersEngineAPI.OutliersEngineUserClustering(context.Background()).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutliersEngineAPI.OutliersEngineUserClustering``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `OutliersEngineUserClustering`: RpcStatus
	fmt.Fprintf(os.Stdout, "Response from `OutliersEngineAPI.OutliersEngineUserClustering`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiOutliersEngineUserClusteringRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

