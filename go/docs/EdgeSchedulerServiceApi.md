# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EdgeSchedulerServiceGetEdgeQueryStatus**](EdgeSchedulerServiceApi.md#EdgeSchedulerServiceGetEdgeQueryStatus) | **Get** /api/v3/edge/query/status | Summary: Get edge query status Description: Get the status of a queued edge query
[**EdgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**](EdgeSchedulerServiceApi.md#EdgeSchedulerServiceMonitoringPendingRequestForEdgeQuery) | **Post** /api/v3/edge/query | Summary: Create workspace Description: monitor edge query pending request
[**EdgeSchedulerServiceScheduleEdgeQuery**](EdgeSchedulerServiceApi.md#EdgeSchedulerServiceScheduleEdgeQuery) | **Post** /api/v3/edge/query/schedule | Summary: Schedule an edge query  Description: Schedule an edge query via db2 queue

# **EdgeSchedulerServiceGetEdgeQueryStatus**
> Edgeschedulerv3GetEdgeQueryStatusResponse EdgeSchedulerServiceGetEdgeQueryStatus(ctx, optional)
Summary: Get edge query status Description: Get the status of a queued edge query

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EdgeSchedulerServiceApiEdgeSchedulerServiceGetEdgeQueryStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EdgeSchedulerServiceApiEdgeSchedulerServiceGetEdgeQueryStatusOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edgeId** | **optional.String**| the id of the edge. | 
 **edgeResultReportId** | **optional.String**| the id of the UC report being queried for. | 

### Return type

[**Edgeschedulerv3GetEdgeQueryStatusResponse**](edgeschedulerv3GetEdgeQueryStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EdgeSchedulerServiceMonitoringPendingRequestForEdgeQuery**
> StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse EdgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(ctx, body)
Summary: Create workspace Description: monitor edge query pending request

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest**](Edgeschedulerv3MonitoringPendingRequestForEdgeQueryRequest.md)|  | 

### Return type

[**StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse**](Stream result of edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EdgeSchedulerServiceScheduleEdgeQuery**
> Edgeschedulerv3ScheduleEdgeQueryResponse EdgeSchedulerServiceScheduleEdgeQuery(ctx, body)
Summary: Schedule an edge query  Description: Schedule an edge query via db2 queue

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Edgeschedulerv3ScheduleEdgeQueryRequest**](Edgeschedulerv3ScheduleEdgeQueryRequest.md)|  | 

### Return type

[**Edgeschedulerv3ScheduleEdgeQueryResponse**](edgeschedulerv3ScheduleEdgeQueryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

