# AuditServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditServiceGetActivityRecords**](AuditServiceApi.md#auditServiceGetActivityRecords) | **GET** /api/v3/activity | Summary: Get activity records
Description: Return activity records that match the arguments passed in the request. 
Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a 
comma-separated list to the corresponding fields in the request.  For instance to check for 
multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**auditServicePutDownloadActivityRecord**](AuditServiceApi.md#auditServicePutDownloadActivityRecord) | **POST** /api/v3/activity | Summary: Put download activity record
Description: Create an activity log record with the arguments passed in the request.



## auditServiceGetActivityRecords

Summary: Get activity records
Description: Return activity records that match the arguments passed in the request. 
Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a 
comma-separated list to the corresponding fields in the request.  For instance to check for 
multiple Contexts set the field to \"op1, op2, op3\".

### Example

```bash
 auditServiceGetActivityRecords  start_time=value  end_time=value  uid=value  action_taken=value  context=value  changes_made=value  performed_by=value  context_description=value  query=value  offset=value  limit=value  filter=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **string** | Return records starting at this time (>=). | [optional] [default to null]
 **endTime** | **string** | Return records ending before this time (<). | [optional] [default to null]
 **uid** | **string** | Return records with this service/collection id. | [optional] [default to null]
 **actionTaken** | **string** | Return records matching this operation (CRUD or other action). | [optional] [default to null]
 **context** | **string** | Return records for this service/collection. | [optional] [default to null]
 **changesMade** | **string** | Return records created only for this reason. | [optional] [default to null]
 **performedBy** | **string** | Return records originating with the specified user id. | [optional] [default to null]
 **contextDescription** | **string** | Return records with this label. | [optional] [default to null]
 **query** | **string** | Return records based on the query. | [optional] [default to null]
 **offset** | **integer** | The amount to offset the rows by for pagination. | [optional] [default to null]
 **limit** | **integer** | The max amount of rows to return for pagination. | [optional] [default to null]
 **filter** | **boolean** | Return eligable filters if this is true. | [optional] [default to null]

### Return type

[**Auditv3GetActivityRecordsResponse**](Auditv3GetActivityRecordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## auditServicePutDownloadActivityRecord

Summary: Put download activity record
Description: Create an activity log record with the arguments passed in the request.

### Example

```bash
 auditServicePutDownloadActivityRecord
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

