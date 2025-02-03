# \NotificationsServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NotificationsServiceCreateTicket**](NotificationsServiceAPI.md#NotificationsServiceCreateTicket) | **Post** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
[**NotificationsServiceGetFolders**](NotificationsServiceAPI.md#NotificationsServiceGetFolders) | **Post** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
[**NotificationsServiceGetNotificationFilename**](NotificationsServiceAPI.md#NotificationsServiceGetNotificationFilename) | **Get** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**NotificationsServiceGetNotificationRecord**](NotificationsServiceAPI.md#NotificationsServiceGetNotificationRecord) | **Get** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
[**NotificationsServiceGetNotificationRecords**](NotificationsServiceAPI.md#NotificationsServiceGetNotificationRecords) | **Get** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
[**NotificationsServiceGetTicketStatus**](NotificationsServiceAPI.md#NotificationsServiceGetTicketStatus) | **Get** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
[**NotificationsServiceTestIntegration**](NotificationsServiceAPI.md#NotificationsServiceTestIntegration) | **Post** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
[**NotificationsServiceUpdateNotificationRecord**](NotificationsServiceAPI.md#NotificationsServiceUpdateNotificationRecord) | **Post** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.



## NotificationsServiceCreateTicket

> Notificationsv3CreateTicketResponse NotificationsServiceCreateTicket(ctx).Notificationsv3CreateTicketRequest(notificationsv3CreateTicketRequest).Execute()

Summary: Create ticket Description: Create ticket based on information passed in.

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
	notificationsv3CreateTicketRequest := *openapiclient.NewNotificationsv3CreateTicketRequest() // Notificationsv3CreateTicketRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceCreateTicket(context.Background()).Notificationsv3CreateTicketRequest(notificationsv3CreateTicketRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceCreateTicket``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceCreateTicket`: Notificationsv3CreateTicketResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceCreateTicket`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceCreateTicketRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3CreateTicketRequest** | [**Notificationsv3CreateTicketRequest**](Notificationsv3CreateTicketRequest.md) |  | 

### Return type

[**Notificationsv3CreateTicketResponse**](Notificationsv3CreateTicketResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceGetFolders

> Notificationsv3GetFoldersResponse NotificationsServiceGetFolders(ctx).Notificationsv3GetFoldersRequest(notificationsv3GetFoldersRequest).Execute()

Summary: Get folders Description: Get folder for the integration connection provided.

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
	notificationsv3GetFoldersRequest := *openapiclient.NewNotificationsv3GetFoldersRequest() // Notificationsv3GetFoldersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceGetFolders(context.Background()).Notificationsv3GetFoldersRequest(notificationsv3GetFoldersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceGetFolders``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceGetFolders`: Notificationsv3GetFoldersResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceGetFolders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceGetFoldersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3GetFoldersRequest** | [**Notificationsv3GetFoldersRequest**](Notificationsv3GetFoldersRequest.md) |  | 

### Return type

[**Notificationsv3GetFoldersResponse**](Notificationsv3GetFoldersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceGetNotificationFilename

> Notificationsv3GetNotificationFilenameResponse NotificationsServiceGetNotificationFilename(ctx).NotificationId(notificationId).Execute()

Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.

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
	notificationId := "notificationId_example" // string | Params are located in the requests context (tenant id, user email, notification id). (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceGetNotificationFilename(context.Background()).NotificationId(notificationId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceGetNotificationFilename``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceGetNotificationFilename`: Notificationsv3GetNotificationFilenameResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceGetNotificationFilename`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceGetNotificationFilenameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **string** | Params are located in the requests context (tenant id, user email, notification id). | 

### Return type

[**Notificationsv3GetNotificationFilenameResponse**](Notificationsv3GetNotificationFilenameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceGetNotificationRecord

> Notificationsv3GetNotificationRecordResponse NotificationsServiceGetNotificationRecord(ctx, notificationId).Execute()

Summary: Get notification record Description: Return notifications record with the specified ID.

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
	notificationId := "notificationId_example" // string | ID for the record to return.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceGetNotificationRecord(context.Background(), notificationId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceGetNotificationRecord``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceGetNotificationRecord`: Notificationsv3GetNotificationRecordResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceGetNotificationRecord`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**notificationId** | **string** | ID for the record to return. | 

### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceGetNotificationRecordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Notificationsv3GetNotificationRecordResponse**](Notificationsv3GetNotificationRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceGetNotificationRecords

> Notificationsv3GetNotificationRecordsResponse NotificationsServiceGetNotificationRecords(ctx).FilterStartTime(filterStartTime).FilterEndTime(filterEndTime).FilterState(filterState).FilterOrigins(filterOrigins).FilterOriginData(filterOriginData).Offset(offset).Limit(limit).IncludeFilterCounts(includeFilterCounts).Execute()

Summary: Get notification records Description: Return notifications records that match the specified filter.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	filterStartTime := time.Now() // time.Time | Return records created at this time or later (>=). (optional)
	filterEndTime := time.Now() // time.Time | Return records created before this time (<). (optional)
	filterState := "filterState_example" // string | Only return record that include the specified state. (optional) (default to "INCLUDE_ALL")
	filterOrigins := []string{"Inner_example"} // []string | Only return record that includes the specified origins. (optional)
	filterOriginData := "filterOriginData_example" // string | Only return record that with the specified origin_data. (optional)
	offset := int64(789) // int64 | The amount to offset the rows by for pagination. (optional)
	limit := int64(789) // int64 | The max amount of rows to return for pagination. (optional)
	includeFilterCounts := true // bool | Computing the filter counts is relatively expensive, only compute when needed. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceGetNotificationRecords(context.Background()).FilterStartTime(filterStartTime).FilterEndTime(filterEndTime).FilterState(filterState).FilterOrigins(filterOrigins).FilterOriginData(filterOriginData).Offset(offset).Limit(limit).IncludeFilterCounts(includeFilterCounts).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceGetNotificationRecords``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceGetNotificationRecords`: Notificationsv3GetNotificationRecordsResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceGetNotificationRecords`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceGetNotificationRecordsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | **time.Time** | Return records created at this time or later (&gt;&#x3D;). | 
 **filterEndTime** | **time.Time** | Return records created before this time (&lt;). | 
 **filterState** | **string** | Only return record that include the specified state. | [default to &quot;INCLUDE_ALL&quot;]
 **filterOrigins** | **[]string** | Only return record that includes the specified origins. | 
 **filterOriginData** | **string** | Only return record that with the specified origin_data. | 
 **offset** | **int64** | The amount to offset the rows by for pagination. | 
 **limit** | **int64** | The max amount of rows to return for pagination. | 
 **includeFilterCounts** | **bool** | Computing the filter counts is relatively expensive, only compute when needed. | 

### Return type

[**Notificationsv3GetNotificationRecordsResponse**](Notificationsv3GetNotificationRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceGetTicketStatus

> Notificationsv3GetTicketStatusResponse NotificationsServiceGetTicketStatus(ctx).TicketId(ticketId).IntegrationId(integrationId).Execute()

Summary: Get ticket status Description: Get the status of the given ticket

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
	ticketId := "ticketId_example" // string | The ID of the ticket to fetch. (optional)
	integrationId := "integrationId_example" // string | The ID of the ticketing integration. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceGetTicketStatus(context.Background()).TicketId(ticketId).IntegrationId(integrationId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceGetTicketStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceGetTicketStatus`: Notificationsv3GetTicketStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceGetTicketStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceGetTicketStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **string** | The ID of the ticket to fetch. | 
 **integrationId** | **string** | The ID of the ticketing integration. | 

### Return type

[**Notificationsv3GetTicketStatusResponse**](Notificationsv3GetTicketStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceTestIntegration

> Notificationsv3TestIntegrationResponse NotificationsServiceTestIntegration(ctx).Notificationsv3TestIntegrationRequest(notificationsv3TestIntegrationRequest).Execute()

Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.

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
	notificationsv3TestIntegrationRequest := *openapiclient.NewNotificationsv3TestIntegrationRequest() // Notificationsv3TestIntegrationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceTestIntegration(context.Background()).Notificationsv3TestIntegrationRequest(notificationsv3TestIntegrationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceTestIntegration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceTestIntegration`: Notificationsv3TestIntegrationResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceTestIntegration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceTestIntegrationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3TestIntegrationRequest** | [**Notificationsv3TestIntegrationRequest**](Notificationsv3TestIntegrationRequest.md) |  | 

### Return type

[**Notificationsv3TestIntegrationResponse**](Notificationsv3TestIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NotificationsServiceUpdateNotificationRecord

> Notificationsv3UpdateNotificationRecordResponse NotificationsServiceUpdateNotificationRecord(ctx).Notificationsv3UpdateNotificationRecordRequest(notificationsv3UpdateNotificationRecordRequest).Execute()

Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.

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
	notificationsv3UpdateNotificationRecordRequest := *openapiclient.NewNotificationsv3UpdateNotificationRecordRequest() // Notificationsv3UpdateNotificationRecordRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.NotificationsServiceAPI.NotificationsServiceUpdateNotificationRecord(context.Background()).Notificationsv3UpdateNotificationRecordRequest(notificationsv3UpdateNotificationRecordRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `NotificationsServiceAPI.NotificationsServiceUpdateNotificationRecord``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `NotificationsServiceUpdateNotificationRecord`: Notificationsv3UpdateNotificationRecordResponse
	fmt.Fprintf(os.Stdout, "Response from `NotificationsServiceAPI.NotificationsServiceUpdateNotificationRecord`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiNotificationsServiceUpdateNotificationRecordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3UpdateNotificationRecordRequest** | [**Notificationsv3UpdateNotificationRecordRequest**](Notificationsv3UpdateNotificationRecordRequest.md) |  | 

### Return type

[**Notificationsv3UpdateNotificationRecordResponse**](Notificationsv3UpdateNotificationRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

