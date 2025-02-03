# \QSPolicyManagerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSPolicyManagerBatchStatusUpdate**](QSPolicyManagerAPI.md#QSPolicyManagerBatchStatusUpdate) | **Put** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**QSPolicyManagerCreateTicket**](QSPolicyManagerAPI.md#QSPolicyManagerCreateTicket) | **Post** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**QSPolicyManagerFetchFilesfromBuckets**](QSPolicyManagerAPI.md#QSPolicyManagerFetchFilesfromBuckets) | **Get** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**QSPolicyManagerProcessPolicyDimentionRecords**](QSPolicyManagerAPI.md#QSPolicyManagerProcessPolicyDimentionRecords) | **Post** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**QSPolicyManagerUpdateTicketStatus**](QSPolicyManagerAPI.md#QSPolicyManagerUpdateTicketStatus) | **Put** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .



## QSPolicyManagerBatchStatusUpdate

> Qspmpolicymanagerv3StandardEmptyResponse QSPolicyManagerBatchStatusUpdate(ctx).Body(body).Execute()

BatchStatusUpdate - trigger the batch to update the status of the Ticket .

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
	resp, r, err := apiClient.QSPolicyManagerAPI.QSPolicyManagerBatchStatusUpdate(context.Background()).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPolicyManagerAPI.QSPolicyManagerBatchStatusUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPolicyManagerBatchStatusUpdate`: Qspmpolicymanagerv3StandardEmptyResponse
	fmt.Fprintf(os.Stdout, "Response from `QSPolicyManagerAPI.QSPolicyManagerBatchStatusUpdate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSPolicyManagerBatchStatusUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map[string]interface{}** |  | 

### Return type

[**Qspmpolicymanagerv3StandardEmptyResponse**](Qspmpolicymanagerv3StandardEmptyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPolicyManagerCreateTicket

> Qspmpolicymanagerv3CreateTicketResponse QSPolicyManagerCreateTicket(ctx).Qspmpolicymanagerv3CreateTicketRequest(qspmpolicymanagerv3CreateTicketRequest).Execute()

CreateTicket - Create a new Incident .

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
	qspmpolicymanagerv3CreateTicketRequest := *openapiclient.NewQspmpolicymanagerv3CreateTicketRequest() // Qspmpolicymanagerv3CreateTicketRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPolicyManagerAPI.QSPolicyManagerCreateTicket(context.Background()).Qspmpolicymanagerv3CreateTicketRequest(qspmpolicymanagerv3CreateTicketRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPolicyManagerAPI.QSPolicyManagerCreateTicket``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPolicyManagerCreateTicket`: Qspmpolicymanagerv3CreateTicketResponse
	fmt.Fprintf(os.Stdout, "Response from `QSPolicyManagerAPI.QSPolicyManagerCreateTicket`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSPolicyManagerCreateTicketRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3CreateTicketRequest** | [**Qspmpolicymanagerv3CreateTicketRequest**](Qspmpolicymanagerv3CreateTicketRequest.md) |  | 

### Return type

[**Qspmpolicymanagerv3CreateTicketResponse**](Qspmpolicymanagerv3CreateTicketResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPolicyManagerFetchFilesfromBuckets

> Qspmpolicymanagerv3FetchObjectStoreFileResponse QSPolicyManagerFetchFilesfromBuckets(ctx).Execute()

FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage

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
	resp, r, err := apiClient.QSPolicyManagerAPI.QSPolicyManagerFetchFilesfromBuckets(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPolicyManagerAPI.QSPolicyManagerFetchFilesfromBuckets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPolicyManagerFetchFilesfromBuckets`: Qspmpolicymanagerv3FetchObjectStoreFileResponse
	fmt.Fprintf(os.Stdout, "Response from `QSPolicyManagerAPI.QSPolicyManagerFetchFilesfromBuckets`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiQSPolicyManagerFetchFilesfromBucketsRequest struct via the builder pattern


### Return type

[**Qspmpolicymanagerv3FetchObjectStoreFileResponse**](Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPolicyManagerProcessPolicyDimentionRecords

> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse QSPolicyManagerProcessPolicyDimentionRecords(ctx).Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest).Execute()

ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table

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
	qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest := *openapiclient.NewQspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest() // Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPolicyManagerAPI.QSPolicyManagerProcessPolicyDimentionRecords(context.Background()).Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPolicyManagerAPI.QSPolicyManagerProcessPolicyDimentionRecords``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPolicyManagerProcessPolicyDimentionRecords`: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse
	fmt.Fprintf(os.Stdout, "Response from `QSPolicyManagerAPI.QSPolicyManagerProcessPolicyDimentionRecords`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSPolicyManagerProcessPolicyDimentionRecordsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest** | [**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md) |  | 

### Return type

[**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSPolicyManagerUpdateTicketStatus

> Qspmpolicymanagerv3UpdateTicketStatusResponse QSPolicyManagerUpdateTicketStatus(ctx).Qspmpolicymanagerv3UpdateTicketStatusRequest(qspmpolicymanagerv3UpdateTicketStatusRequest).Execute()

UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

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
	qspmpolicymanagerv3UpdateTicketStatusRequest := *openapiclient.NewQspmpolicymanagerv3UpdateTicketStatusRequest() // Qspmpolicymanagerv3UpdateTicketStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSPolicyManagerAPI.QSPolicyManagerUpdateTicketStatus(context.Background()).Qspmpolicymanagerv3UpdateTicketStatusRequest(qspmpolicymanagerv3UpdateTicketStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSPolicyManagerAPI.QSPolicyManagerUpdateTicketStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSPolicyManagerUpdateTicketStatus`: Qspmpolicymanagerv3UpdateTicketStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `QSPolicyManagerAPI.QSPolicyManagerUpdateTicketStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSPolicyManagerUpdateTicketStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateTicketStatusRequest** | [**Qspmpolicymanagerv3UpdateTicketStatusRequest**](Qspmpolicymanagerv3UpdateTicketStatusRequest.md) |  | 

### Return type

[**Qspmpolicymanagerv3UpdateTicketStatusResponse**](Qspmpolicymanagerv3UpdateTicketStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

