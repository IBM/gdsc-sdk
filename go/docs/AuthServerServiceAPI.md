# \AuthServerServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuthServerServiceCreateOauthClient**](AuthServerServiceAPI.md#AuthServerServiceCreateOauthClient) | **Post** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
[**AuthServerServiceDeleteOauthClient**](AuthServerServiceAPI.md#AuthServerServiceDeleteOauthClient) | **Delete** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
[**AuthServerServiceGetAccessToken**](AuthServerServiceAPI.md#AuthServerServiceGetAccessToken) | **Get** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
[**AuthServerServiceGetOauthClient**](AuthServerServiceAPI.md#AuthServerServiceGetOauthClient) | **Get** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
[**AuthServerServiceGetUser**](AuthServerServiceAPI.md#AuthServerServiceGetUser) | **Get** /api/v3/auth/user | Summary: Get user Description: Get user.
[**AuthServerServiceListOauthClient**](AuthServerServiceAPI.md#AuthServerServiceListOauthClient) | **Get** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.



## AuthServerServiceCreateOauthClient

> AuthserverCreateOauthClientResponse AuthServerServiceCreateOauthClient(ctx).AuthserverCreateOauthClientRequest(authserverCreateOauthClientRequest).Execute()

Summary: Create Oauth client Description: Create/register new Oauth client.

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
	authserverCreateOauthClientRequest := *openapiclient.NewAuthserverCreateOauthClientRequest() // AuthserverCreateOauthClientRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceCreateOauthClient(context.Background()).AuthserverCreateOauthClientRequest(authserverCreateOauthClientRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceCreateOauthClient``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceCreateOauthClient`: AuthserverCreateOauthClientResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceCreateOauthClient`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceCreateOauthClientRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authserverCreateOauthClientRequest** | [**AuthserverCreateOauthClientRequest**](AuthserverCreateOauthClientRequest.md) |  | 

### Return type

[**AuthserverCreateOauthClientResponse**](AuthserverCreateOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuthServerServiceDeleteOauthClient

> map[string]interface{} AuthServerServiceDeleteOauthClient(ctx, clientId).Execute()

Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.

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
	clientId := "clientId_example" // string | ClientID of registered OAuth.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceDeleteOauthClient(context.Background(), clientId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceDeleteOauthClient``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceDeleteOauthClient`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceDeleteOauthClient`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**clientId** | **string** | ClientID of registered OAuth. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceDeleteOauthClientRequest struct via the builder pattern


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


## AuthServerServiceGetAccessToken

> AuthserverGetAccessTokenResponse AuthServerServiceGetAccessToken(ctx).Execute()

Summary: Get access token Description: Get access token from passed clientId and secret.

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
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetAccessToken(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceGetAccessToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceGetAccessToken`: AuthserverGetAccessTokenResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceGetAccessToken`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceGetAccessTokenRequest struct via the builder pattern


### Return type

[**AuthserverGetAccessTokenResponse**](AuthserverGetAccessTokenResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuthServerServiceGetOauthClient

> AuthserverGetOauthClientResponse AuthServerServiceGetOauthClient(ctx, clientId).Execute()

Summary: Get Oauth client Description: Get registered Oauth client by clientId.

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
	clientId := "clientId_example" // string | ClientID of registered OAuth.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetOauthClient(context.Background(), clientId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceGetOauthClient``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceGetOauthClient`: AuthserverGetOauthClientResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceGetOauthClient`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**clientId** | **string** | ClientID of registered OAuth. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceGetOauthClientRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**AuthserverGetOauthClientResponse**](AuthserverGetOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuthServerServiceGetUser

> AuthserverGetUserResponse AuthServerServiceGetUser(ctx).Execute()

Summary: Get user Description: Get user.

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
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceGetUser(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceGetUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceGetUser`: AuthserverGetUserResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceGetUser`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceGetUserRequest struct via the builder pattern


### Return type

[**AuthserverGetUserResponse**](AuthserverGetUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuthServerServiceListOauthClient

> AuthserverListOauthClientResponse AuthServerServiceListOauthClient(ctx).Execute()

Summary: List Oauth client Description: List all registered Oauth client.

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
	resp, r, err := apiClient.AuthServerServiceAPI.AuthServerServiceListOauthClient(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuthServerServiceAPI.AuthServerServiceListOauthClient``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuthServerServiceListOauthClient`: AuthserverListOauthClientResponse
	fmt.Fprintf(os.Stdout, "Response from `AuthServerServiceAPI.AuthServerServiceListOauthClient`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiAuthServerServiceListOauthClientRequest struct via the builder pattern


### Return type

[**AuthserverListOauthClientResponse**](AuthserverListOauthClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

