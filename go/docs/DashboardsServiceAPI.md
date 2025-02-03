# \DashboardsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DashboardsServiceCreateDashboard**](DashboardsServiceAPI.md#DashboardsServiceCreateDashboard) | **Post** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
[**DashboardsServiceDeleteDashboard**](DashboardsServiceAPI.md#DashboardsServiceDeleteDashboard) | **Delete** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
[**DashboardsServiceGetDashboards**](DashboardsServiceAPI.md#DashboardsServiceGetDashboards) | **Get** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
[**DashboardsServiceUpdateDashboard**](DashboardsServiceAPI.md#DashboardsServiceUpdateDashboard) | **Put** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.



## DashboardsServiceCreateDashboard

> Dashboardsv3CreateDashboardResponse DashboardsServiceCreateDashboard(ctx).Dashboardsv3Dashboard(dashboardsv3Dashboard).Execute()

Summary: Create dashboard Description: Create a unique dashboard.

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
	dashboardsv3Dashboard := *openapiclient.NewDashboardsv3Dashboard() // Dashboardsv3Dashboard | Unique dashboard.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DashboardsServiceAPI.DashboardsServiceCreateDashboard(context.Background()).Dashboardsv3Dashboard(dashboardsv3Dashboard).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DashboardsServiceAPI.DashboardsServiceCreateDashboard``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DashboardsServiceCreateDashboard`: Dashboardsv3CreateDashboardResponse
	fmt.Fprintf(os.Stdout, "Response from `DashboardsServiceAPI.DashboardsServiceCreateDashboard`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDashboardsServiceCreateDashboardRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3Dashboard** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md) | Unique dashboard. | 

### Return type

[**Dashboardsv3CreateDashboardResponse**](Dashboardsv3CreateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DashboardsServiceDeleteDashboard

> Dashboardsv3DeleteDashboardResponse DashboardsServiceDeleteDashboard(ctx, dashboardId).Dashboardsv3DeleteDashboardRequest(dashboardsv3DeleteDashboardRequest).Execute()

Summary: Delete dashboard Description: Delete a unique dashboard.

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
	dashboardId := "dashboardId_example" // string | The id of the dashboard to be deleted.
	dashboardsv3DeleteDashboardRequest := *openapiclient.NewDashboardsv3DeleteDashboardRequest() // Dashboardsv3DeleteDashboardRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DashboardsServiceAPI.DashboardsServiceDeleteDashboard(context.Background(), dashboardId).Dashboardsv3DeleteDashboardRequest(dashboardsv3DeleteDashboardRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DashboardsServiceAPI.DashboardsServiceDeleteDashboard``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DashboardsServiceDeleteDashboard`: Dashboardsv3DeleteDashboardResponse
	fmt.Fprintf(os.Stdout, "Response from `DashboardsServiceAPI.DashboardsServiceDeleteDashboard`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dashboardId** | **string** | The id of the dashboard to be deleted. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDashboardsServiceDeleteDashboardRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dashboardsv3DeleteDashboardRequest** | [**Dashboardsv3DeleteDashboardRequest**](Dashboardsv3DeleteDashboardRequest.md) |  | 

### Return type

[**Dashboardsv3DeleteDashboardResponse**](Dashboardsv3DeleteDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DashboardsServiceGetDashboards

> Dashboardsv3GetDashboardsResponse DashboardsServiceGetDashboards(ctx).Execute()

Summary: Get dashboards Description: Get a list of dashboards with all data.

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
	resp, r, err := apiClient.DashboardsServiceAPI.DashboardsServiceGetDashboards(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DashboardsServiceAPI.DashboardsServiceGetDashboards``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DashboardsServiceGetDashboards`: Dashboardsv3GetDashboardsResponse
	fmt.Fprintf(os.Stdout, "Response from `DashboardsServiceAPI.DashboardsServiceGetDashboards`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDashboardsServiceGetDashboardsRequest struct via the builder pattern


### Return type

[**Dashboardsv3GetDashboardsResponse**](Dashboardsv3GetDashboardsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DashboardsServiceUpdateDashboard

> Dashboardsv3UpdateDashboardResponse DashboardsServiceUpdateDashboard(ctx, dashboardId).Dashboardsv3UpdateDashboardRequest(dashboardsv3UpdateDashboardRequest).Execute()

Summary: Update dashboard Description: Update a dashboard.

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
	dashboardId := "dashboardId_example" // string | The id of the dashboard that was updated.
	dashboardsv3UpdateDashboardRequest := *openapiclient.NewDashboardsv3UpdateDashboardRequest() // Dashboardsv3UpdateDashboardRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DashboardsServiceAPI.DashboardsServiceUpdateDashboard(context.Background(), dashboardId).Dashboardsv3UpdateDashboardRequest(dashboardsv3UpdateDashboardRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DashboardsServiceAPI.DashboardsServiceUpdateDashboard``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DashboardsServiceUpdateDashboard`: Dashboardsv3UpdateDashboardResponse
	fmt.Fprintf(os.Stdout, "Response from `DashboardsServiceAPI.DashboardsServiceUpdateDashboard`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dashboardId** | **string** | The id of the dashboard that was updated. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDashboardsServiceUpdateDashboardRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dashboardsv3UpdateDashboardRequest** | [**Dashboardsv3UpdateDashboardRequest**](Dashboardsv3UpdateDashboardRequest.md) |  | 

### Return type

[**Dashboardsv3UpdateDashboardResponse**](Dashboardsv3UpdateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

