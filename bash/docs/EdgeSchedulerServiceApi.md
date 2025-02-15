# EdgeSchedulerServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**edgeSchedulerServiceGetEdgeQueryStatus**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceGetEdgeQueryStatus) | **GET** /api/v3/edge/query/status | Summary: Get edge query status
Description: Get the status of a queued edge query
[**edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery) | **POST** /api/v3/edge/query | Summary: Create workspace
Description: monitor edge query pending request
[**edgeSchedulerServiceScheduleEdgeQuery**](EdgeSchedulerServiceApi.md#edgeSchedulerServiceScheduleEdgeQuery) | **POST** /api/v3/edge/query/schedule | Summary: Schedule an edge query 
Description: Schedule an edge query via db2 queue



## edgeSchedulerServiceGetEdgeQueryStatus

Summary: Get edge query status
Description: Get the status of a queued edge query

### Example

```bash
 edgeSchedulerServiceGetEdgeQueryStatus  edge_id=value  edge_result_report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **string** | the id of the edge. | [optional] [default to null]
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

Summary: Create workspace
Description: monitor edge query pending request

### Example

```bash
 edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest** | [**Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest**](Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest.md) |  |

### Return type

[**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**](StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## edgeSchedulerServiceScheduleEdgeQuery

Summary: Schedule an edge query 
Description: Schedule an edge query via db2 queue

### Example

```bash
 edgeSchedulerServiceScheduleEdgeQuery
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeschedulerv3ScheduleEdgeQueryRequest** | [**Edgeschedulerv3ScheduleEdgeQueryRequest**](Edgeschedulerv3ScheduleEdgeQueryRequest.md) |  |

### Return type

[**Edgeschedulerv3ScheduleEdgeQueryResponse**](Edgeschedulerv3ScheduleEdgeQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

