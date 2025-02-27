# DatamartProcessorServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**datamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamartInfo) | **GET** /api/v3/datamarts/info | Summary: Get datamarts
Description: Return a list of files inside a datamart to the caller.
[**datamartProcessorServiceGetDatamarts**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts
Description: Return a list of datamarts for a time interval to the caller.
[**datamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetEarliestStartTime) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time
Description: Return the earliest time period of data available in database.
[**datamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceApi.md#datamartProcessorServiceSendAllCompleteFilesToQueue) | **POST** /api/v3/datamarts/repush_files | 
[**datamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceApi.md#datamartProcessorServiceStoreExtractionLogs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs
Description: Store the datamart extraction logs inside GI.
[**uploadDatamart**](DatamartProcessorServiceApi.md#uploadDatamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart
Description: Upload datamart file for ingestion.



## datamartProcessorServiceGetDatamartInfo

Summary: Get datamarts
Description: Return a list of files inside a datamart to the caller.

### Example

```bash
 datamartProcessorServiceGetDatamartInfo  ingestion_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestionId** | **string** | Ingestion id. | [optional] [default to null]

### Return type

[**Datamartprocessorv3GetDatamartInfoResponse**](Datamartprocessorv3GetDatamartInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## datamartProcessorServiceGetDatamarts

Summary: Get datamarts
Description: Return a list of datamarts for a time interval to the caller.

### Example

```bash
 datamartProcessorServiceGetDatamarts  period_start=value  period_end=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodStart** | **string** | Data starting time period in UTC. | [optional] [default to null]
 **periodEnd** | **string** | Data ending time period in UTC. | [optional] [default to null]

### Return type

[**Datamartprocessorv3GetDatamartResponse**](Datamartprocessorv3GetDatamartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## datamartProcessorServiceGetEarliestStartTime

Summary: Get rarliest start time
Description: Return the earliest time period of data available in database.

### Example

```bash
 datamartProcessorServiceGetEarliestStartTime
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Datamartprocessorv3GetEarliestStartTimeResponse**](Datamartprocessorv3GetEarliestStartTimeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## datamartProcessorServiceSendAllCompleteFilesToQueue



### Example

```bash
 datamartProcessorServiceSendAllCompleteFilesToQueue
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## datamartProcessorServiceStoreExtractionLogs

Summary: Store extraction logs
Description: Store the datamart extraction logs inside GI.

### Example

```bash
 datamartProcessorServiceStoreExtractionLogs request_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **string** | Request id which co-relates to request. | [default to null]
 **datamartprocessorv3DMExtractionLogsRequest** | [**Datamartprocessorv3DMExtractionLogsRequest**](Datamartprocessorv3DMExtractionLogsRequest.md) |  |

### Return type

[**Datamartprocessorv3DMExtractionLogsResponse**](Datamartprocessorv3DMExtractionLogsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## uploadDatamart

Summary: Upload datamart
Description: Upload datamart file for ingestion.

### Example

```bash
 uploadDatamart
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **binary** | The file to upload. | [default to null]

### Return type

(empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

