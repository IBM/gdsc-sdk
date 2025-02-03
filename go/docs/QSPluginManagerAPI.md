# \QSPluginManagerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSPluginManagerInvokeAppProv**](QSPluginManagerAPI.md#QSPluginManagerInvokeAppProv) | **Post** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
[**QSPluginManagerInvokeExplorerV1**](QSPluginManagerAPI.md#QSPluginManagerInvokeExplorerV1) | **Post** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
[**QSPluginManagerInvokeExplorerV2**](QSPluginManagerAPI.md#QSPluginManagerInvokeExplorerV2) | **Post** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
[**QSPluginManagerInvokePlugin**](QSPluginManagerAPI.md#QSPluginManagerInvokePlugin) | **Post** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
[**QSPluginManagerInvokePolicy**](QSPluginManagerAPI.md#QSPluginManagerInvokePolicy) | **Post** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload



## QSPluginManagerInvokeAppProv

> Qspmpluginmanagerv3PluginRS QSPluginManagerInvokeAppProv(ctx, pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()

Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload

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
	pluginId := "pluginId_example" // string | Unique identifier for the plugin
	qspmpluginmanagerv3PluginRQ := *openapiclient.NewQspmpluginmanagerv3PluginRQ() // Qspmpluginmanagerv3PluginRQ | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPluginManagerAPI.QSPluginManagerInvokeAppProv(context.Background(), pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPluginManagerAPI.QSPluginManagerInvokeAppProv``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPluginManagerInvokeAppProv`: Qspmpluginmanagerv3PluginRS
	fmt.Fprintf(os.Stdout, "Response from `QSPluginManagerAPI.QSPluginManagerInvokeAppProv`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pluginId** | **string** | Unique identifier for the plugin | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSPluginManagerInvokeAppProvRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPluginManagerInvokeExplorerV1

> Qspmpluginmanagerv3PluginRS QSPluginManagerInvokeExplorerV1(ctx, pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()

Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload

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
	pluginId := "pluginId_example" // string | Unique identifier for the plugin
	qspmpluginmanagerv3PluginRQ := *openapiclient.NewQspmpluginmanagerv3PluginRQ() // Qspmpluginmanagerv3PluginRQ | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPluginManagerAPI.QSPluginManagerInvokeExplorerV1(context.Background(), pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPluginManagerAPI.QSPluginManagerInvokeExplorerV1``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPluginManagerInvokeExplorerV1`: Qspmpluginmanagerv3PluginRS
	fmt.Fprintf(os.Stdout, "Response from `QSPluginManagerAPI.QSPluginManagerInvokeExplorerV1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pluginId** | **string** | Unique identifier for the plugin | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSPluginManagerInvokeExplorerV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPluginManagerInvokeExplorerV2

> Qspmpluginmanagerv3PluginRS QSPluginManagerInvokeExplorerV2(ctx, pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()

Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload

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
	pluginId := "pluginId_example" // string | Unique identifier for the plugin
	qspmpluginmanagerv3PluginRQ := *openapiclient.NewQspmpluginmanagerv3PluginRQ() // Qspmpluginmanagerv3PluginRQ | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPluginManagerAPI.QSPluginManagerInvokeExplorerV2(context.Background(), pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPluginManagerAPI.QSPluginManagerInvokeExplorerV2``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPluginManagerInvokeExplorerV2`: Qspmpluginmanagerv3PluginRS
	fmt.Fprintf(os.Stdout, "Response from `QSPluginManagerAPI.QSPluginManagerInvokeExplorerV2`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pluginId** | **string** | Unique identifier for the plugin | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSPluginManagerInvokeExplorerV2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPluginManagerInvokePlugin

> Qspmpluginmanagerv3PluginRS QSPluginManagerInvokePlugin(ctx, pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()

Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload

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
	pluginId := "pluginId_example" // string | Unique identifier for the plugin
	qspmpluginmanagerv3PluginRQ := *openapiclient.NewQspmpluginmanagerv3PluginRQ() // Qspmpluginmanagerv3PluginRQ | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPluginManagerAPI.QSPluginManagerInvokePlugin(context.Background(), pluginId).Qspmpluginmanagerv3PluginRQ(qspmpluginmanagerv3PluginRQ).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPluginManagerAPI.QSPluginManagerInvokePlugin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPluginManagerInvokePlugin`: Qspmpluginmanagerv3PluginRS
	fmt.Fprintf(os.Stdout, "Response from `QSPluginManagerAPI.QSPluginManagerInvokePlugin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pluginId** | **string** | Unique identifier for the plugin | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSPluginManagerInvokePluginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **qspmpluginmanagerv3PluginRQ** | [**Qspmpluginmanagerv3PluginRQ**](Qspmpluginmanagerv3PluginRQ.md) |  | 

### Return type

[**Qspmpluginmanagerv3PluginRS**](Qspmpluginmanagerv3PluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPluginManagerInvokePolicy

> Qspmpluginmanagerv3PolicyPluginRS QSPluginManagerInvokePolicy(ctx, pluginId).Qspmpluginmanagerv3PolicyPluginRQ(qspmpluginmanagerv3PolicyPluginRQ).Execute()

Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload

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
	pluginId := "pluginId_example" // string | Unique identifier for the plugin
	qspmpluginmanagerv3PolicyPluginRQ := *openapiclient.NewQspmpluginmanagerv3PolicyPluginRQ() // Qspmpluginmanagerv3PolicyPluginRQ | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPluginManagerAPI.QSPluginManagerInvokePolicy(context.Background(), pluginId).Qspmpluginmanagerv3PolicyPluginRQ(qspmpluginmanagerv3PolicyPluginRQ).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPluginManagerAPI.QSPluginManagerInvokePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPluginManagerInvokePolicy`: Qspmpluginmanagerv3PolicyPluginRS
	fmt.Fprintf(os.Stdout, "Response from `QSPluginManagerAPI.QSPluginManagerInvokePolicy`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**pluginId** | **string** | Unique identifier for the plugin | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSPluginManagerInvokePolicyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **qspmpluginmanagerv3PolicyPluginRQ** | [**Qspmpluginmanagerv3PolicyPluginRQ**](Qspmpluginmanagerv3PolicyPluginRQ.md) |  | 

### Return type

[**Qspmpluginmanagerv3PolicyPluginRS**](Qspmpluginmanagerv3PolicyPluginRS.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

