# EdgeSchedulerServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**edgeSchedulerServiceGetEdgeQueryStatus**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceGetEdgeQueryStatus) | **GET** /api/v3/edges/{edge_id}/query/status | Summary: Get edge query status
Description: Get the status of a queued edge query
[**edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery) | **GET** /api/v3/edges/query | Summary: Monitor for a pending edge query request
Description: monitor edge query pending request
[**edgeSchedulerServiceScheduleEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceScheduleEdgeQuery) | **POST** /api/v3/edges/{edge_id}/query/schedule | Summary: Schedule an edge query 
Description: Schedule an edge query via data warehouse queue



## edgeSchedulerServiceGetEdgeQueryStatus

Summary: Get edge query status
Description: Get the status of a queued edge query

### Example

```bash
 edgeSchedulerServiceGetEdgeQueryStatus edge_id=value  edge_result_report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **string** | the id of the edge | [default to null]
 **edgeResultReportId** | **string** | the id of the UC report being queried for. | [optional] [default to null]

### Return type

[**Edgeschedulerv3GetEdgeQueryStatusResponse**](Edgeschedulerv3GetEdgeQueryStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery

Summary: Monitor for a pending edge query request
Description: monitor edge query pending request

### Example

```bash
 edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery  client_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string** | edge client id to monitor edge query requests for. | [optional] [default to null]

### Return type

[**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**](StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## edgeSchedulerServiceScheduleEdgeQuery

Summary: Schedule an edge query 
Description: Schedule an edge query via data warehouse queue

### Example

```bash
 edgeSchedulerServiceScheduleEdgeQuery edge_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **string** | the id of the edge | [default to null]
 **edgeschedulerv3ScheduleEdgeQueryRequest** | [**Edgeschedulerv3ScheduleEdgeQueryRequest**](Edgeschedulerv3ScheduleEdgeQueryRequest.md) |  |

### Return type

[**Edgeschedulerv3ScheduleEdgeQueryResponse**](Edgeschedulerv3ScheduleEdgeQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

