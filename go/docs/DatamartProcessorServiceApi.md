# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DatamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceApi.md#DatamartProcessorServiceGetDatamartInfo) | **Get** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
[**DatamartProcessorServiceGetDatamarts**](DatamartProcessorServiceApi.md#DatamartProcessorServiceGetDatamarts) | **Get** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
[**DatamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceApi.md#DatamartProcessorServiceGetEarliestStartTime) | **Get** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
[**DatamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceApi.md#DatamartProcessorServiceSendAllCompleteFilesToQueue) | **Post** /api/v3/datamarts/repush_files | 
[**DatamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceApi.md#DatamartProcessorServiceStoreExtractionLogs) | **Post** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
[**UploadDatamart**](DatamartProcessorServiceApi.md#UploadDatamart) | **Post** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.

# **DatamartProcessorServiceGetDatamartInfo**
> Datamartprocessorv3GetDatamartInfoResponse DatamartProcessorServiceGetDatamartInfo(ctx, optional)
Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestionId** | **optional.String**| Ingestion id. | 

### Return type

[**Datamartprocessorv3GetDatamartInfoResponse**](datamartprocessorv3GetDatamartInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DatamartProcessorServiceGetDatamarts**
> Datamartprocessorv3GetDatamartResponse DatamartProcessorServiceGetDatamarts(ctx, optional)
Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodStart** | **optional.Time**| Data starting time period in UTC. | 
 **periodEnd** | **optional.Time**| Data ending time period in UTC. | 

### Return type

[**Datamartprocessorv3GetDatamartResponse**](datamartprocessorv3GetDatamartResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DatamartProcessorServiceGetEarliestStartTime**
> Datamartprocessorv3GetEarliestStartTimeResponse DatamartProcessorServiceGetEarliestStartTime(ctx, )
Summary: Get rarliest start time Description: Return the earliest time period of data available in database.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Datamartprocessorv3GetEarliestStartTimeResponse**](datamartprocessorv3GetEarliestStartTimeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DatamartProcessorServiceSendAllCompleteFilesToQueue**
> Datamartprocessorv3StatusResponseBase DatamartProcessorServiceSendAllCompleteFilesToQueue(ctx, body)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Datamartprocessorv3RetryFromOsRequest**](Datamartprocessorv3RetryFromOsRequest.md)|  | 

### Return type

[**Datamartprocessorv3StatusResponseBase**](datamartprocessorv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DatamartProcessorServiceStoreExtractionLogs**
> Datamartprocessorv3DmExtractionLogsResponse DatamartProcessorServiceStoreExtractionLogs(ctx, body, requestId)
Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Datamartprocessorv3DmExtractionLogsRequest**](Datamartprocessorv3DmExtractionLogsRequest.md)|  | 
  **requestId** | **string**| Request id which co-relates to request. | 

### Return type

[**Datamartprocessorv3DmExtractionLogsResponse**](datamartprocessorv3DMExtractionLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UploadDatamart**
> UploadDatamart(ctx, file)
Summary: Upload datamart Description: Upload datamart file for ingestion.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **file** | ***os.File*****os.File**|  | 

### Return type

 (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

