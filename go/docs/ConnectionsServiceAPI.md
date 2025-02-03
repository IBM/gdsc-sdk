# \ConnectionsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConnectionsServiceCreateConnectionsAccounts**](ConnectionsServiceAPI.md#ConnectionsServiceCreateConnectionsAccounts) | **Post** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
[**ConnectionsServiceCreateConnectionsConfigs**](ConnectionsServiceAPI.md#ConnectionsServiceCreateConnectionsConfigs) | **Post** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
[**ConnectionsServiceCreatePlugin**](ConnectionsServiceAPI.md#ConnectionsServiceCreatePlugin) | **Post** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
[**ConnectionsServiceCreateSettings**](ConnectionsServiceAPI.md#ConnectionsServiceCreateSettings) | **Post** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
[**ConnectionsServiceDeleteConnectionsAccounts**](ConnectionsServiceAPI.md#ConnectionsServiceDeleteConnectionsAccounts) | **Delete** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
[**ConnectionsServiceDeleteConnectionsConfigs**](ConnectionsServiceAPI.md#ConnectionsServiceDeleteConnectionsConfigs) | **Delete** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
[**ConnectionsServiceDeleteConnector**](ConnectionsServiceAPI.md#ConnectionsServiceDeleteConnector) | **Delete** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
[**ConnectionsServiceDeletePlugin**](ConnectionsServiceAPI.md#ConnectionsServiceDeletePlugin) | **Delete** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
[**ConnectionsServiceGetBannerState**](ConnectionsServiceAPI.md#ConnectionsServiceGetBannerState) | **Get** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
[**ConnectionsServiceGetConnectionsAccounts**](ConnectionsServiceAPI.md#ConnectionsServiceGetConnectionsAccounts) | **Get** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
[**ConnectionsServiceGetConnectionsConfigs**](ConnectionsServiceAPI.md#ConnectionsServiceGetConnectionsConfigs) | **Get** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
[**ConnectionsServiceGetConnectionsWithFilters**](ConnectionsServiceAPI.md#ConnectionsServiceGetConnectionsWithFilters) | **Post** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
[**ConnectionsServiceGetConnectorsSummary**](ConnectionsServiceAPI.md#ConnectionsServiceGetConnectorsSummary) | **Get** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
[**ConnectionsServiceGetDataSources**](ConnectionsServiceAPI.md#ConnectionsServiceGetDataSources) | **Get** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
[**ConnectionsServiceGetGuardRecordFields**](ConnectionsServiceAPI.md#ConnectionsServiceGetGuardRecordFields) | **Get** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
[**ConnectionsServiceGetHeaders**](ConnectionsServiceAPI.md#ConnectionsServiceGetHeaders) | **Get** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
[**ConnectionsServiceGetPlugins**](ConnectionsServiceAPI.md#ConnectionsServiceGetPlugins) | **Get** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
[**ConnectionsServiceGetSettings**](ConnectionsServiceAPI.md#ConnectionsServiceGetSettings) | **Get** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
[**ConnectionsServicePartialUpdateConnectors**](ConnectionsServiceAPI.md#ConnectionsServicePartialUpdateConnectors) | **Patch** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
[**ConnectionsServicePostStapCommand**](ConnectionsServiceAPI.md#ConnectionsServicePostStapCommand) | **Post** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
[**ConnectionsServiceUpdateBannerState**](ConnectionsServiceAPI.md#ConnectionsServiceUpdateBannerState) | **Put** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
[**ConnectionsServiceUpdateConnectionsAccounts**](ConnectionsServiceAPI.md#ConnectionsServiceUpdateConnectionsAccounts) | **Put** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
[**ConnectionsServiceUpdateConnectionsConfigs**](ConnectionsServiceAPI.md#ConnectionsServiceUpdateConnectionsConfigs) | **Patch** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
[**ConnectionsServiceUpdateConnectors**](ConnectionsServiceAPI.md#ConnectionsServiceUpdateConnectors) | **Put** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
[**ConnectionsServiceUpdatePlugin**](ConnectionsServiceAPI.md#ConnectionsServiceUpdatePlugin) | **Put** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
[**ConnectionsServiceUpdateSettings**](ConnectionsServiceAPI.md#ConnectionsServiceUpdateSettings) | **Put** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.



## ConnectionsServiceCreateConnectionsAccounts

> Connectionsv3CreateConnectionsAccountsResponse ConnectionsServiceCreateConnectionsAccounts(ctx).Connectionsv3CreateConnectionsAccountsRequest(connectionsv3CreateConnectionsAccountsRequest).Execute()

Summary: Create Connections accounts Description: Create Connections acccounts.

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
	connectionsv3CreateConnectionsAccountsRequest := *openapiclient.NewConnectionsv3CreateConnectionsAccountsRequest() // Connectionsv3CreateConnectionsAccountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsAccounts(context.Background()).Connectionsv3CreateConnectionsAccountsRequest(connectionsv3CreateConnectionsAccountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceCreateConnectionsAccounts`: Connectionsv3CreateConnectionsAccountsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsAccounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceCreateConnectionsAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsAccountsRequest** | [**Connectionsv3CreateConnectionsAccountsRequest**](Connectionsv3CreateConnectionsAccountsRequest.md) |  | 

### Return type

[**Connectionsv3CreateConnectionsAccountsResponse**](Connectionsv3CreateConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceCreateConnectionsConfigs

> Connectionsv3CreateConnectionsConfigsResponse ConnectionsServiceCreateConnectionsConfigs(ctx).Connectionsv3CreateConnectionsConfigsRequest(connectionsv3CreateConnectionsConfigsRequest).Execute()

Summary: Create connections configs Description: Create Connection config by connection type.

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
	connectionsv3CreateConnectionsConfigsRequest := *openapiclient.NewConnectionsv3CreateConnectionsConfigsRequest() // Connectionsv3CreateConnectionsConfigsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsConfigs(context.Background()).Connectionsv3CreateConnectionsConfigsRequest(connectionsv3CreateConnectionsConfigsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsConfigs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceCreateConnectionsConfigs`: Connectionsv3CreateConnectionsConfigsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceCreateConnectionsConfigs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceCreateConnectionsConfigsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsConfigsRequest** | [**Connectionsv3CreateConnectionsConfigsRequest**](Connectionsv3CreateConnectionsConfigsRequest.md) |  | 

### Return type

[**Connectionsv3CreateConnectionsConfigsResponse**](Connectionsv3CreateConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceCreatePlugin

> Connectionsv3CreatePluginResponse ConnectionsServiceCreatePlugin(ctx).Connectionsv3CreatePluginRequest(connectionsv3CreatePluginRequest).Execute()

Summary: Create plugin Description: Create UC generic plugin

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
	connectionsv3CreatePluginRequest := *openapiclient.NewConnectionsv3CreatePluginRequest() // Connectionsv3CreatePluginRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceCreatePlugin(context.Background()).Connectionsv3CreatePluginRequest(connectionsv3CreatePluginRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceCreatePlugin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceCreatePlugin`: Connectionsv3CreatePluginResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceCreatePlugin`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceCreatePluginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreatePluginRequest** | [**Connectionsv3CreatePluginRequest**](Connectionsv3CreatePluginRequest.md) |  | 

### Return type

[**Connectionsv3CreatePluginResponse**](Connectionsv3CreatePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceCreateSettings

> map[string]interface{} ConnectionsServiceCreateSettings(ctx).Connectionsv3CreateSettingsRequest(connectionsv3CreateSettingsRequest).Execute()

Summary: Create settings Description: Create Settings.

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
	connectionsv3CreateSettingsRequest := *openapiclient.NewConnectionsv3CreateSettingsRequest() // Connectionsv3CreateSettingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceCreateSettings(context.Background()).Connectionsv3CreateSettingsRequest(connectionsv3CreateSettingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceCreateSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceCreateSettings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceCreateSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceCreateSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateSettingsRequest** | [**Connectionsv3CreateSettingsRequest**](Connectionsv3CreateSettingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceDeleteConnectionsAccounts

> Connectionsv3DeleteConnectionsAccountsResponse ConnectionsServiceDeleteConnectionsAccounts(ctx, accountId).Execute()

Summary: Delete Connections accounts Description: Delete Connections acccounts.

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
	accountId := "accountId_example" // string | Account id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsAccounts(context.Background(), accountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceDeleteConnectionsAccounts`: Connectionsv3DeleteConnectionsAccountsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsAccounts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**accountId** | **string** | Account id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceDeleteConnectionsAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Connectionsv3DeleteConnectionsAccountsResponse**](Connectionsv3DeleteConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceDeleteConnectionsConfigs

> Connectionsv3DeleteConnectionsConfigsResponse ConnectionsServiceDeleteConnectionsConfigs(ctx, connectionId).Execute()

Summary: Delete connections configs Description: Delete Connection config by connection id.

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
	connectionId := "connectionId_example" // string | Connection id.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsConfigs(context.Background(), connectionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsConfigs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceDeleteConnectionsConfigs`: Connectionsv3DeleteConnectionsConfigsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceDeleteConnectionsConfigs`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**connectionId** | **string** | Connection id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceDeleteConnectionsConfigsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Connectionsv3DeleteConnectionsConfigsResponse**](Connectionsv3DeleteConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceDeleteConnector

> map[string]interface{} ConnectionsServiceDeleteConnector(ctx, connectionId).Execute()

Summary: Delete connector Description: Delete a Connection.

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
	connectionId := "connectionId_example" // string | The connection id

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceDeleteConnector(context.Background(), connectionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceDeleteConnector``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceDeleteConnector`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceDeleteConnector`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**connectionId** | **string** | The connection id | 

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceDeleteConnectorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceDeletePlugin

> Connectionsv3DeletePluginResponse ConnectionsServiceDeletePlugin(ctx, id).Execute()

Summary: Delete plugin. Description: Delete plugin.

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
	id := "id_example" // string | plugin id

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceDeletePlugin(context.Background(), id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceDeletePlugin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceDeletePlugin`: Connectionsv3DeletePluginResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceDeletePlugin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | plugin id | 

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceDeletePluginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Connectionsv3DeletePluginResponse**](Connectionsv3DeletePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetBannerState

> Connectionsv3GetBannerStateResponse ConnectionsServiceGetBannerState(ctx).Execute()

Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetBannerState(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetBannerState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetBannerState`: Connectionsv3GetBannerStateResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetBannerState`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetBannerStateRequest struct via the builder pattern


### Return type

[**Connectionsv3GetBannerStateResponse**](Connectionsv3GetBannerStateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetConnectionsAccounts

> Connectionsv3GetConnectionsAccountsResponse ConnectionsServiceGetConnectionsAccounts(ctx).AccountId(accountId).AccessKey(accessKey).Execute()

Summary: Get Connections accounts Description: Get Connections acccounts.

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
	accountId := "accountId_example" // string | Optional: account id. (optional)
	accessKey := "accessKey_example" // string | Optional: acccount access key. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetConnectionsAccounts(context.Background()).AccountId(accountId).AccessKey(accessKey).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetConnectionsAccounts`: Connectionsv3GetConnectionsAccountsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsAccounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetConnectionsAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string** | Optional: account id. | 
 **accessKey** | **string** | Optional: acccount access key. | 

### Return type

[**Connectionsv3GetConnectionsAccountsResponse**](Connectionsv3GetConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetConnectionsConfigs

> Connectionsv3GetConnectionsConfigsResponse ConnectionsServiceGetConnectionsConfigs(ctx).Type_(type_).ConnectionId(connectionId).Execute()

Summary: Get connections configs Description: Get Connection config by connection type.

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
	type_ := "type__example" // string | The type of connector. (optional) (default to "UNDEFINED_TYPE")
	connectionId := "connectionId_example" // string | Optional: if connection id did not provide then return all connections. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetConnectionsConfigs(context.Background()).Type_(type_).ConnectionId(connectionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsConfigs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetConnectionsConfigs`: Connectionsv3GetConnectionsConfigsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsConfigs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetConnectionsConfigsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **string** | The type of connector. | [default to &quot;UNDEFINED_TYPE&quot;]
 **connectionId** | **string** | Optional: if connection id did not provide then return all connections. | 

### Return type

[**Connectionsv3GetConnectionsConfigsResponse**](Connectionsv3GetConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetConnectionsWithFilters

> Connectionsv3GetConnectionsWithFiltersResponse ConnectionsServiceGetConnectionsWithFilters(ctx).Connectionsv3GetConnectionsWithFiltersRequest(connectionsv3GetConnectionsWithFiltersRequest).Execute()

Summary: Get connections with filters Description: Get connections with filters.

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
	connectionsv3GetConnectionsWithFiltersRequest := *openapiclient.NewConnectionsv3GetConnectionsWithFiltersRequest() // Connectionsv3GetConnectionsWithFiltersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetConnectionsWithFilters(context.Background()).Connectionsv3GetConnectionsWithFiltersRequest(connectionsv3GetConnectionsWithFiltersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsWithFilters``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetConnectionsWithFilters`: Connectionsv3GetConnectionsWithFiltersResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetConnectionsWithFilters`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetConnectionsWithFiltersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3GetConnectionsWithFiltersRequest** | [**Connectionsv3GetConnectionsWithFiltersRequest**](Connectionsv3GetConnectionsWithFiltersRequest.md) |  | 

### Return type

[**Connectionsv3GetConnectionsWithFiltersResponse**](Connectionsv3GetConnectionsWithFiltersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetConnectorsSummary

> Connectionsv3GetConnectorsSummaryResponse ConnectionsServiceGetConnectorsSummary(ctx).Execute()

Summary: Get connectors summary Description: Get a summary of Connectors.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetConnectorsSummary(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetConnectorsSummary``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetConnectorsSummary`: Connectionsv3GetConnectorsSummaryResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetConnectorsSummary`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetConnectorsSummaryRequest struct via the builder pattern


### Return type

[**Connectionsv3GetConnectorsSummaryResponse**](Connectionsv3GetConnectorsSummaryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetDataSources

> Connectionsv3GetDataSourcesResponse ConnectionsServiceGetDataSources(ctx).Execute()

Summary: Get data sources Description: Get a list of data sources.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetDataSources(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetDataSources``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetDataSources`: Connectionsv3GetDataSourcesResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetDataSources`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetDataSourcesRequest struct via the builder pattern


### Return type

[**Connectionsv3GetDataSourcesResponse**](Connectionsv3GetDataSourcesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetGuardRecordFields

> Connectionsv3GetGuardRecordFieldsResponse ConnectionsServiceGetGuardRecordFields(ctx).Execute()

Summary: Get list of guard record fields.  Description: Get list of guard record fields.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetGuardRecordFields(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetGuardRecordFields``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetGuardRecordFields`: Connectionsv3GetGuardRecordFieldsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetGuardRecordFields`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetGuardRecordFieldsRequest struct via the builder pattern


### Return type

[**Connectionsv3GetGuardRecordFieldsResponse**](Connectionsv3GetGuardRecordFieldsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetHeaders

> Connectionsv3GetHeadersResponse ConnectionsServiceGetHeaders(ctx).Execute()

Summary: Get headers Description: Get a list of Headers.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetHeaders(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetHeaders``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetHeaders`: Connectionsv3GetHeadersResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetHeaders`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetHeadersRequest struct via the builder pattern


### Return type

[**Connectionsv3GetHeadersResponse**](Connectionsv3GetHeadersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetPlugins

> Connectionsv3GetPluginsResponse ConnectionsServiceGetPlugins(ctx).Id(id).Execute()

Summary: Get plugins  Description: Get custom universal connector plugins

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
	id := "id_example" // string | Optional: if no plug-in id is provided, returns list of all plug-ins. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetPlugins(context.Background()).Id(id).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetPlugins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetPlugins`: Connectionsv3GetPluginsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetPlugins`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetPluginsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | Optional: if no plug-in id is provided, returns list of all plug-ins. | 

### Return type

[**Connectionsv3GetPluginsResponse**](Connectionsv3GetPluginsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceGetSettings

> Connectionsv3GetSettingsResponse ConnectionsServiceGetSettings(ctx).Execute()

Summary: Get settings Description: Get a list of Settings.

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
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceGetSettings(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceGetSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceGetSettings`: Connectionsv3GetSettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceGetSettings`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceGetSettingsRequest struct via the builder pattern


### Return type

[**Connectionsv3GetSettingsResponse**](Connectionsv3GetSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServicePartialUpdateConnectors

> Connectionsv3PartialUpdateConnectorsResponse ConnectionsServicePartialUpdateConnectors(ctx).Connectionsv3PartialUpdateConnectorsRequest(connectionsv3PartialUpdateConnectorsRequest).Execute()

Summary: Partial update connectors Description: Partial update of Connectors.

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
	connectionsv3PartialUpdateConnectorsRequest := *openapiclient.NewConnectionsv3PartialUpdateConnectorsRequest() // Connectionsv3PartialUpdateConnectorsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServicePartialUpdateConnectors(context.Background()).Connectionsv3PartialUpdateConnectorsRequest(connectionsv3PartialUpdateConnectorsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServicePartialUpdateConnectors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServicePartialUpdateConnectors`: Connectionsv3PartialUpdateConnectorsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServicePartialUpdateConnectors`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServicePartialUpdateConnectorsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3PartialUpdateConnectorsRequest** | [**Connectionsv3PartialUpdateConnectorsRequest**](Connectionsv3PartialUpdateConnectorsRequest.md) |  | 

### Return type

[**Connectionsv3PartialUpdateConnectorsResponse**](Connectionsv3PartialUpdateConnectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServicePostStapCommand

> Connectionsv3StatusResponseBase ConnectionsServicePostStapCommand(ctx).Connectionsv3StapCommandRequest(connectionsv3StapCommandRequest).Execute()

Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.

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
	connectionsv3StapCommandRequest := *openapiclient.NewConnectionsv3StapCommandRequest() // Connectionsv3StapCommandRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServicePostStapCommand(context.Background()).Connectionsv3StapCommandRequest(connectionsv3StapCommandRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServicePostStapCommand``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServicePostStapCommand`: Connectionsv3StatusResponseBase
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServicePostStapCommand`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServicePostStapCommandRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3StapCommandRequest** | [**Connectionsv3StapCommandRequest**](Connectionsv3StapCommandRequest.md) |  | 

### Return type

[**Connectionsv3StatusResponseBase**](Connectionsv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdateBannerState

> Connectionsv3UpdateBannerStateResponse ConnectionsServiceUpdateBannerState(ctx).Connectionsv3UpdateBannerStateRequest(connectionsv3UpdateBannerStateRequest).Execute()

Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.

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
	connectionsv3UpdateBannerStateRequest := *openapiclient.NewConnectionsv3UpdateBannerStateRequest() // Connectionsv3UpdateBannerStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdateBannerState(context.Background()).Connectionsv3UpdateBannerStateRequest(connectionsv3UpdateBannerStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdateBannerState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdateBannerState`: Connectionsv3UpdateBannerStateResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdateBannerState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdateBannerStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateBannerStateRequest** | [**Connectionsv3UpdateBannerStateRequest**](Connectionsv3UpdateBannerStateRequest.md) |  | 

### Return type

[**Connectionsv3UpdateBannerStateResponse**](Connectionsv3UpdateBannerStateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdateConnectionsAccounts

> Connectionsv3UpdateConnectionsAccountsResponse ConnectionsServiceUpdateConnectionsAccounts(ctx).Connectionsv3UpdateConnectionsAccountsRequest(connectionsv3UpdateConnectionsAccountsRequest).Execute()

Summary: Update Connections accounts Description: Update Connections acccounts.

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
	connectionsv3UpdateConnectionsAccountsRequest := *openapiclient.NewConnectionsv3UpdateConnectionsAccountsRequest() // Connectionsv3UpdateConnectionsAccountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsAccounts(context.Background()).Connectionsv3UpdateConnectionsAccountsRequest(connectionsv3UpdateConnectionsAccountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdateConnectionsAccounts`: Connectionsv3UpdateConnectionsAccountsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsAccounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdateConnectionsAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsAccountsRequest** | [**Connectionsv3UpdateConnectionsAccountsRequest**](Connectionsv3UpdateConnectionsAccountsRequest.md) |  | 

### Return type

[**Connectionsv3UpdateConnectionsAccountsResponse**](Connectionsv3UpdateConnectionsAccountsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdateConnectionsConfigs

> Connectionsv3UpdateConnectionsConfigsResponse ConnectionsServiceUpdateConnectionsConfigs(ctx).Connectionsv3UpdateConnectionsConfigsRequest(connectionsv3UpdateConnectionsConfigsRequest).Execute()

Summary: Update connections configs Description: Update Connection config by connection id.

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
	connectionsv3UpdateConnectionsConfigsRequest := *openapiclient.NewConnectionsv3UpdateConnectionsConfigsRequest() // Connectionsv3UpdateConnectionsConfigsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsConfigs(context.Background()).Connectionsv3UpdateConnectionsConfigsRequest(connectionsv3UpdateConnectionsConfigsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsConfigs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdateConnectionsConfigs`: Connectionsv3UpdateConnectionsConfigsResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectionsConfigs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdateConnectionsConfigsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsConfigsRequest** | [**Connectionsv3UpdateConnectionsConfigsRequest**](Connectionsv3UpdateConnectionsConfigsRequest.md) |  | 

### Return type

[**Connectionsv3UpdateConnectionsConfigsResponse**](Connectionsv3UpdateConnectionsConfigsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdateConnectors

> map[string]interface{} ConnectionsServiceUpdateConnectors(ctx).Connectionsv3UpdateConnectorsRequest(connectionsv3UpdateConnectorsRequest).Execute()

Summary: Update connectors Description: Update a list of Connectors.

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
	connectionsv3UpdateConnectorsRequest := *openapiclient.NewConnectionsv3UpdateConnectorsRequest() // Connectionsv3UpdateConnectorsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdateConnectors(context.Background()).Connectionsv3UpdateConnectorsRequest(connectionsv3UpdateConnectorsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectors``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdateConnectors`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdateConnectors`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdateConnectorsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectorsRequest** | [**Connectionsv3UpdateConnectorsRequest**](Connectionsv3UpdateConnectorsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdatePlugin

> Connectionsv3UpdatePluginResponse ConnectionsServiceUpdatePlugin(ctx, id).Connectionsv3UpdatePluginRequest(connectionsv3UpdatePluginRequest).Execute()

Summary: Update plugin. Description: Update plugin.

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
	id := "id_example" // string | id
	connectionsv3UpdatePluginRequest := *openapiclient.NewConnectionsv3UpdatePluginRequest() // Connectionsv3UpdatePluginRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdatePlugin(context.Background(), id).Connectionsv3UpdatePluginRequest(connectionsv3UpdatePluginRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdatePlugin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdatePlugin`: Connectionsv3UpdatePluginResponse
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdatePlugin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | id | 

### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdatePluginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **connectionsv3UpdatePluginRequest** | [**Connectionsv3UpdatePluginRequest**](Connectionsv3UpdatePluginRequest.md) |  | 

### Return type

[**Connectionsv3UpdatePluginResponse**](Connectionsv3UpdatePluginResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConnectionsServiceUpdateSettings

> map[string]interface{} ConnectionsServiceUpdateSettings(ctx).Connectionsv3UpdateSettingsRequest(connectionsv3UpdateSettingsRequest).Execute()

Summary: Update settings Description: Update Settings.

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
	connectionsv3UpdateSettingsRequest := *openapiclient.NewConnectionsv3UpdateSettingsRequest() // Connectionsv3UpdateSettingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ConnectionsServiceAPI.ConnectionsServiceUpdateSettings(context.Background()).Connectionsv3UpdateSettingsRequest(connectionsv3UpdateSettingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ConnectionsServiceAPI.ConnectionsServiceUpdateSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConnectionsServiceUpdateSettings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `ConnectionsServiceAPI.ConnectionsServiceUpdateSettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiConnectionsServiceUpdateSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateSettingsRequest** | [**Connectionsv3UpdateSettingsRequest**](Connectionsv3UpdateSettingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

