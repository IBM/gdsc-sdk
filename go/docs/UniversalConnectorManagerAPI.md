# \UniversalConnectorManagerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UniversalConnectorManagerGetCertificate**](UniversalConnectorManagerAPI.md#UniversalConnectorManagerGetCertificate) | **Get** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.
[**UniversalConnectorManagerGetConnectors**](UniversalConnectorManagerAPI.md#UniversalConnectorManagerGetConnectors) | **Get** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**UniversalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerAPI.md#UniversalConnectorManagerListConnectionsSummary) | **Get** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
[**UniversalConnectorManagerPluginsList**](UniversalConnectorManagerAPI.md#UniversalConnectorManagerPluginsList) | **Get** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
[**UniversalConnectorManagerUploadPlugin**](UniversalConnectorManagerAPI.md#UniversalConnectorManagerUploadPlugin) | **Post** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.



## UniversalConnectorManagerGetCertificate

> Universalconnectormanagerv3FileResponse UniversalConnectorManagerGetCertificate(ctx).Execute()

Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium Insights.

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
	resp, r, err := apiClient.UniversalConnectorManagerAPI.UniversalConnectorManagerGetCertificate(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UniversalConnectorManagerAPI.UniversalConnectorManagerGetCertificate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UniversalConnectorManagerGetCertificate`: Universalconnectormanagerv3FileResponse
	fmt.Fprintf(os.Stdout, "Response from `UniversalConnectorManagerAPI.UniversalConnectorManagerGetCertificate`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiUniversalConnectorManagerGetCertificateRequest struct via the builder pattern


### Return type

[**Universalconnectormanagerv3FileResponse**](Universalconnectormanagerv3FileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UniversalConnectorManagerGetConnectors

> Universalconnectormanagerv3GetConnectorsResponse UniversalConnectorManagerGetConnectors(ctx).Execute()

Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.

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
	resp, r, err := apiClient.UniversalConnectorManagerAPI.UniversalConnectorManagerGetConnectors(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UniversalConnectorManagerAPI.UniversalConnectorManagerGetConnectors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UniversalConnectorManagerGetConnectors`: Universalconnectormanagerv3GetConnectorsResponse
	fmt.Fprintf(os.Stdout, "Response from `UniversalConnectorManagerAPI.UniversalConnectorManagerGetConnectors`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiUniversalConnectorManagerGetConnectorsRequest struct via the builder pattern


### Return type

[**Universalconnectormanagerv3GetConnectorsResponse**](Universalconnectormanagerv3GetConnectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UniversalConnectorManagerListConnectionsSummary

> Universalconnectormanagerv3ListConnectionsResponse UniversalConnectorManagerListConnectionsSummary(ctx).Execute()

Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).

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
	resp, r, err := apiClient.UniversalConnectorManagerAPI.UniversalConnectorManagerListConnectionsSummary(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UniversalConnectorManagerAPI.UniversalConnectorManagerListConnectionsSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UniversalConnectorManagerListConnectionsSummary`: Universalconnectormanagerv3ListConnectionsResponse
	fmt.Fprintf(os.Stdout, "Response from `UniversalConnectorManagerAPI.UniversalConnectorManagerListConnectionsSummary`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiUniversalConnectorManagerListConnectionsSummaryRequest struct via the builder pattern


### Return type

[**Universalconnectormanagerv3ListConnectionsResponse**](Universalconnectormanagerv3ListConnectionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UniversalConnectorManagerPluginsList

> Universalconnectormanagerv3PluginsListResponse UniversalConnectorManagerPluginsList(ctx).Execute()

Summary: Plugins list Description: List of all universal connector plugins.

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
	resp, r, err := apiClient.UniversalConnectorManagerAPI.UniversalConnectorManagerPluginsList(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UniversalConnectorManagerAPI.UniversalConnectorManagerPluginsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UniversalConnectorManagerPluginsList`: Universalconnectormanagerv3PluginsListResponse
	fmt.Fprintf(os.Stdout, "Response from `UniversalConnectorManagerAPI.UniversalConnectorManagerPluginsList`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiUniversalConnectorManagerPluginsListRequest struct via the builder pattern


### Return type

[**Universalconnectormanagerv3PluginsListResponse**](Universalconnectormanagerv3PluginsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UniversalConnectorManagerUploadPlugin

> RpcStatus UniversalConnectorManagerUploadPlugin(ctx).Universalconnectormanagerv3UploadPluginRequest(universalconnectormanagerv3UploadPluginRequest).Execute()

Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.

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
	universalconnectormanagerv3UploadPluginRequest := *openapiclient.NewUniversalconnectormanagerv3UploadPluginRequest() // Universalconnectormanagerv3UploadPluginRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.UniversalConnectorManagerAPI.UniversalConnectorManagerUploadPlugin(context.Background()).Universalconnectormanagerv3UploadPluginRequest(universalconnectormanagerv3UploadPluginRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `UniversalConnectorManagerAPI.UniversalConnectorManagerUploadPlugin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UniversalConnectorManagerUploadPlugin`: RpcStatus
	fmt.Fprintf(os.Stdout, "Response from `UniversalConnectorManagerAPI.UniversalConnectorManagerUploadPlugin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiUniversalConnectorManagerUploadPluginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universalconnectormanagerv3UploadPluginRequest** | [**Universalconnectormanagerv3UploadPluginRequest**](Universalconnectormanagerv3UploadPluginRequest.md) |  | 

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

