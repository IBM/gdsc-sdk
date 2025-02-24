# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AuditServiceGetActivityRecords**](AuditServiceApi.md#AuditServiceGetActivityRecords) | **Get** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**AuditServicePutDownloadActivityRecord**](AuditServiceApi.md#AuditServicePutDownloadActivityRecord) | **Post** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.

# **AuditServiceGetActivityRecords**
> Auditv3GetActivityRecordsResponse AuditServiceGetActivityRecords(ctx, optional)
Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AuditServiceApiAuditServiceGetActivityRecordsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AuditServiceApiAuditServiceGetActivityRecordsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **optional.Time**| Return records starting at this time (&gt;&#x3D;). | 
 **endTime** | **optional.Time**| Return records ending before this time (&lt;). | 
 **uid** | **optional.String**| Return records with this service/collection id. | 
 **actionTaken** | **optional.String**| Return records matching this operation (CRUD or other action). | 
 **context** | **optional.String**| Return records for this service/collection. | 
 **changesMade** | **optional.String**| Return records created only for this reason. | 
 **performedBy** | **optional.String**| Return records originating with the specified user id. | 
 **contextDescription** | **optional.String**| Return records with this label. | 
 **query** | **optional.String**| Return records based on the query. | 
 **offset** | **optional.Int64**| The amount to offset the rows by for pagination. | 
 **limit** | **optional.Int64**| The max amount of rows to return for pagination. | 
 **filter** | **optional.Bool**| Return eligable filters if this is true. | 

### Return type

[**Auditv3GetActivityRecordsResponse**](auditv3GetActivityRecordsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AuditServicePutDownloadActivityRecord**
> Auditv3PutActivityRecordResponse AuditServicePutDownloadActivityRecord(ctx, body)
Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Auditv3PutActivityRecordRequest**](Auditv3PutActivityRecordRequest.md)|  | 

### Return type

[**Auditv3PutActivityRecordResponse**](auditv3PutActivityRecordResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

