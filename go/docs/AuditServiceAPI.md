# \AuditServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuditServiceGetActivityRecords**](AuditServiceAPI.md#AuditServiceGetActivityRecords) | **Get** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**AuditServicePutDownloadActivityRecord**](AuditServiceAPI.md#AuditServicePutDownloadActivityRecord) | **Post** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.



## AuditServiceGetActivityRecords

> Auditv3GetActivityRecordsResponse AuditServiceGetActivityRecords(ctx).StartTime(startTime).EndTime(endTime).Uid(uid).ActionTaken(actionTaken).Context(context).ChangesMade(changesMade).PerformedBy(performedBy).ContextDescription(contextDescription).Query(query).Offset(offset).Limit(limit).Filter(filter).Execute()

Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".

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
	startTime := time.Now() // time.Time | Return records starting at this time (>=). (optional)
	endTime := time.Now() // time.Time | Return records ending before this time (<). (optional)
	uid := "uid_example" // string | Return records with this service/collection id. (optional)
	actionTaken := "actionTaken_example" // string | Return records matching this operation (CRUD or other action). (optional)
	context := "context_example" // string | Return records for this service/collection. (optional)
	changesMade := "changesMade_example" // string | Return records created only for this reason. (optional)
	performedBy := "performedBy_example" // string | Return records originating with the specified user id. (optional)
	contextDescription := "contextDescription_example" // string | Return records with this label. (optional)
	query := "query_example" // string | Return records based on the query. (optional)
	offset := int64(789) // int64 | The amount to offset the rows by for pagination. (optional)
	limit := int64(789) // int64 | The max amount of rows to return for pagination. (optional)
	filter := true // bool | Return eligable filters if this is true. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuditServiceAPI.AuditServiceGetActivityRecords(context.Background()).StartTime(startTime).EndTime(endTime).Uid(uid).ActionTaken(actionTaken).Context(context).ChangesMade(changesMade).PerformedBy(performedBy).ContextDescription(contextDescription).Query(query).Offset(offset).Limit(limit).Filter(filter).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuditServiceAPI.AuditServiceGetActivityRecords``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuditServiceGetActivityRecords`: Auditv3GetActivityRecordsResponse
	fmt.Fprintf(os.Stdout, "Response from `AuditServiceAPI.AuditServiceGetActivityRecords`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuditServiceGetActivityRecordsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **time.Time** | Return records starting at this time (&gt;&#x3D;). | 
 **endTime** | **time.Time** | Return records ending before this time (&lt;). | 
 **uid** | **string** | Return records with this service/collection id. | 
 **actionTaken** | **string** | Return records matching this operation (CRUD or other action). | 
 **context** | **string** | Return records for this service/collection. | 
 **changesMade** | **string** | Return records created only for this reason. | 
 **performedBy** | **string** | Return records originating with the specified user id. | 
 **contextDescription** | **string** | Return records with this label. | 
 **query** | **string** | Return records based on the query. | 
 **offset** | **int64** | The amount to offset the rows by for pagination. | 
 **limit** | **int64** | The max amount of rows to return for pagination. | 
 **filter** | **bool** | Return eligable filters if this is true. | 

### Return type

[**Auditv3GetActivityRecordsResponse**](Auditv3GetActivityRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AuditServicePutDownloadActivityRecord

> Auditv3PutActivityRecordResponse AuditServicePutDownloadActivityRecord(ctx).Auditv3PutActivityRecordRequest(auditv3PutActivityRecordRequest).Execute()

Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.

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
	auditv3PutActivityRecordRequest := *openapiclient.NewAuditv3PutActivityRecordRequest() // Auditv3PutActivityRecordRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.AuditServiceAPI.AuditServicePutDownloadActivityRecord(context.Background()).Auditv3PutActivityRecordRequest(auditv3PutActivityRecordRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `AuditServiceAPI.AuditServicePutDownloadActivityRecord``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AuditServicePutDownloadActivityRecord`: Auditv3PutActivityRecordResponse
	fmt.Fprintf(os.Stdout, "Response from `AuditServiceAPI.AuditServicePutDownloadActivityRecord`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuditServicePutDownloadActivityRecordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditv3PutActivityRecordRequest** | [**Auditv3PutActivityRecordRequest**](Auditv3PutActivityRecordRequest.md) |  | 

### Return type

[**Auditv3PutActivityRecordResponse**](Auditv3PutActivityRecordResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

