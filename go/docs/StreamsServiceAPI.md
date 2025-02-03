# \StreamsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StreamsServiceCheckAWSCredentials**](StreamsServiceAPI.md#StreamsServiceCheckAWSCredentials) | **Post** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
[**StreamsServiceCheckAzureEventHub**](StreamsServiceAPI.md#StreamsServiceCheckAzureEventHub) | **Post** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
[**StreamsServiceCheckAzureStorageString**](StreamsServiceAPI.md#StreamsServiceCheckAzureStorageString) | **Post** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
[**StreamsServiceGetAWSRegions**](StreamsServiceAPI.md#StreamsServiceGetAWSRegions) | **Get** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
[**StreamsServiceListAWSStreams**](StreamsServiceAPI.md#StreamsServiceListAWSStreams) | **Post** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.



## StreamsServiceCheckAWSCredentials

> Streamsv3CheckAWSCredentialsResponse StreamsServiceCheckAWSCredentials(ctx).Streamsv3CheckAWSCredentialsRequest(streamsv3CheckAWSCredentialsRequest).Execute()

Summary: Check AWS credentials Description: Service to verify AWS credentials.

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
	streamsv3CheckAWSCredentialsRequest := *openapiclient.NewStreamsv3CheckAWSCredentialsRequest() // Streamsv3CheckAWSCredentialsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.StreamsServiceAPI.StreamsServiceCheckAWSCredentials(context.Background()).Streamsv3CheckAWSCredentialsRequest(streamsv3CheckAWSCredentialsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StreamsServiceAPI.StreamsServiceCheckAWSCredentials``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StreamsServiceCheckAWSCredentials`: Streamsv3CheckAWSCredentialsResponse
	fmt.Fprintf(os.Stdout, "Response from `StreamsServiceAPI.StreamsServiceCheckAWSCredentials`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStreamsServiceCheckAWSCredentialsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAWSCredentialsRequest** | [**Streamsv3CheckAWSCredentialsRequest**](Streamsv3CheckAWSCredentialsRequest.md) |  | 

### Return type

[**Streamsv3CheckAWSCredentialsResponse**](Streamsv3CheckAWSCredentialsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StreamsServiceCheckAzureEventHub

> Streamsv3CheckAzureEventHubResponse StreamsServiceCheckAzureEventHub(ctx).Streamsv3CheckAzureEventHubRequest(streamsv3CheckAzureEventHubRequest).Execute()

Summary: Check Azure event hub Description: Service to check Azure event hub.

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
	streamsv3CheckAzureEventHubRequest := *openapiclient.NewStreamsv3CheckAzureEventHubRequest() // Streamsv3CheckAzureEventHubRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.StreamsServiceAPI.StreamsServiceCheckAzureEventHub(context.Background()).Streamsv3CheckAzureEventHubRequest(streamsv3CheckAzureEventHubRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StreamsServiceAPI.StreamsServiceCheckAzureEventHub``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StreamsServiceCheckAzureEventHub`: Streamsv3CheckAzureEventHubResponse
	fmt.Fprintf(os.Stdout, "Response from `StreamsServiceAPI.StreamsServiceCheckAzureEventHub`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStreamsServiceCheckAzureEventHubRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureEventHubRequest** | [**Streamsv3CheckAzureEventHubRequest**](Streamsv3CheckAzureEventHubRequest.md) |  | 

### Return type

[**Streamsv3CheckAzureEventHubResponse**](Streamsv3CheckAzureEventHubResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StreamsServiceCheckAzureStorageString

> Streamsv3CheckAzureStorageStringResponse StreamsServiceCheckAzureStorageString(ctx).Streamsv3CheckAzureStorageStringRequest(streamsv3CheckAzureStorageStringRequest).Execute()

Summary: Check Azure storage string Description: Service to verify Azure storage connection.

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
	streamsv3CheckAzureStorageStringRequest := *openapiclient.NewStreamsv3CheckAzureStorageStringRequest() // Streamsv3CheckAzureStorageStringRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.StreamsServiceAPI.StreamsServiceCheckAzureStorageString(context.Background()).Streamsv3CheckAzureStorageStringRequest(streamsv3CheckAzureStorageStringRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StreamsServiceAPI.StreamsServiceCheckAzureStorageString``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StreamsServiceCheckAzureStorageString`: Streamsv3CheckAzureStorageStringResponse
	fmt.Fprintf(os.Stdout, "Response from `StreamsServiceAPI.StreamsServiceCheckAzureStorageString`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStreamsServiceCheckAzureStorageStringRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureStorageStringRequest** | [**Streamsv3CheckAzureStorageStringRequest**](Streamsv3CheckAzureStorageStringRequest.md) |  | 

### Return type

[**Streamsv3CheckAzureStorageStringResponse**](Streamsv3CheckAzureStorageStringResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StreamsServiceGetAWSRegions

> Streamsv3GetAWSRegionsResponse StreamsServiceGetAWSRegions(ctx).Execute()

Summary: Get AWS regions Description: Service to get AWS regions.

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
	resp, r, err := apiClient.StreamsServiceAPI.StreamsServiceGetAWSRegions(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StreamsServiceAPI.StreamsServiceGetAWSRegions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StreamsServiceGetAWSRegions`: Streamsv3GetAWSRegionsResponse
	fmt.Fprintf(os.Stdout, "Response from `StreamsServiceAPI.StreamsServiceGetAWSRegions`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiStreamsServiceGetAWSRegionsRequest struct via the builder pattern


### Return type

[**Streamsv3GetAWSRegionsResponse**](Streamsv3GetAWSRegionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StreamsServiceListAWSStreams

> Streamsv3ListAWSStreamsResponse StreamsServiceListAWSStreams(ctx).Streamsv3ListAWSStreamsRequest(streamsv3ListAWSStreamsRequest).Execute()

Summary: List AWS streams Description: Service to list AWS Kinesis streams.

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
	streamsv3ListAWSStreamsRequest := *openapiclient.NewStreamsv3ListAWSStreamsRequest() // Streamsv3ListAWSStreamsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.StreamsServiceAPI.StreamsServiceListAWSStreams(context.Background()).Streamsv3ListAWSStreamsRequest(streamsv3ListAWSStreamsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `StreamsServiceAPI.StreamsServiceListAWSStreams``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `StreamsServiceListAWSStreams`: Streamsv3ListAWSStreamsResponse
	fmt.Fprintf(os.Stdout, "Response from `StreamsServiceAPI.StreamsServiceListAWSStreams`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiStreamsServiceListAWSStreamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3ListAWSStreamsRequest** | [**Streamsv3ListAWSStreamsRequest**](Streamsv3ListAWSStreamsRequest.md) |  | 

### Return type

[**Streamsv3ListAWSStreamsResponse**](Streamsv3ListAWSStreamsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

