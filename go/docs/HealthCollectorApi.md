# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**HealthCollectorGetDataWarehouseUsage**](HealthCollectorApi.md#HealthCollectorGetDataWarehouseUsage) | **Get** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
[**HealthCollectorGetGDPHealthInfo**](HealthCollectorApi.md#HealthCollectorGetGDPHealthInfo) | **Get** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**HealthCollectorGetHistoricalHealthInfo**](HealthCollectorApi.md#HealthCollectorGetHistoricalHealthInfo) | **Get** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
[**HealthCollectorGetObjectStorageUsage**](HealthCollectorApi.md#HealthCollectorGetObjectStorageUsage) | **Get** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
[**HealthCollectorGetPVCUsage**](HealthCollectorApi.md#HealthCollectorGetPVCUsage) | **Get** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
[**HealthCollectorGetPodRestarts**](HealthCollectorApi.md#HealthCollectorGetPodRestarts) | **Get** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
[**HealthCollectorGetStreamsIngestion**](HealthCollectorApi.md#HealthCollectorGetStreamsIngestion) | **Get** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
[**HealthCollectorGetTopGDPCollectors**](HealthCollectorApi.md#HealthCollectorGetTopGDPCollectors) | **Get** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
[**HealthCollectorStoreEdgeMetrics**](HealthCollectorApi.md#HealthCollectorStoreEdgeMetrics) | **Post** /api/v3/metrics/edge | Summary: Store Edge metrics Description: Store telemetry data from the Edge&#x27;s connected to GI.
[**HealthCollectorStoreHealthInfo**](HealthCollectorApi.md#HealthCollectorStoreHealthInfo) | **Post** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)

# **HealthCollectorGetDataWarehouseUsage**
> Healthcollectorv3GetDataWarehouseUsageResponse HealthCollectorGetDataWarehouseUsage(ctx, type_, optional)
Summary: Get data warehouse usage info Description: Get information from Db2 related to usage

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetDataWarehouseUsageOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetDataWarehouseUsageOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetDataWarehouseUsageResponse**](healthcollectorv3GetDataWarehouseUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetGDPHealthInfo**
> Healthcollectorv3GetGdpHealthInfoResponse HealthCollectorGetGDPHealthInfo(ctx, )
Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Healthcollectorv3GetGdpHealthInfoResponse**](healthcollectorv3GetGDPHealthInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetHistoricalHealthInfo**
> Healthcollectorv3GetHistoricalHealthInfoResponse HealthCollectorGetHistoricalHealthInfo(ctx, optional)
Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***HealthCollectorApiHealthCollectorGetHistoricalHealthInfoOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetHistoricalHealthInfoOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | **optional.String**| Type of unit for which data needs to be retrieved. | [default to UNKNOWN_UNIT]
 **cmId** | **optional.String**| Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | 
 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetHistoricalHealthInfoResponse**](healthcollectorv3GetHistoricalHealthInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetObjectStorageUsage**
> Healthcollectorv3GetObjectStorageUsageResponse HealthCollectorGetObjectStorageUsage(ctx, type_, optional)
Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetObjectStorageUsageOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetObjectStorageUsageOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetObjectStorageUsageResponse**](healthcollectorv3GetObjectStorageUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetPVCUsage**
> Healthcollectorv3GetPvcUsageResponse HealthCollectorGetPVCUsage(ctx, type_, optional)
Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetPVCUsageOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetPVCUsageOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetPvcUsageResponse**](healthcollectorv3GetPVCUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetPodRestarts**
> Healthcollectorv3GetPodRestartsResponse HealthCollectorGetPodRestarts(ctx, type_, optional)
Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetPodRestartsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetPodRestartsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetPodRestartsResponse**](healthcollectorv3GetPodRestartsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetStreamsIngestion**
> Healthcollectorv3GetStreamsIngestionResponse HealthCollectorGetStreamsIngestion(ctx, type_, optional)
Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetStreamsIngestionOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetStreamsIngestionOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetStreamsIngestionResponse**](healthcollectorv3GetStreamsIngestionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorGetTopGDPCollectors**
> Healthcollectorv3GetTopGdpCollectorsResponse HealthCollectorGetTopGDPCollectors(ctx, type_, optional)
Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **type_** | **string**| The type of metric to retrieve | 
 **optional** | ***HealthCollectorApiHealthCollectorGetTopGDPCollectorsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a HealthCollectorApiHealthCollectorGetTopGDPCollectorsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **startTime** | **optional.Time**| The start time from which the data needs to be calculated. | 
 **endTime** | **optional.Time**| The end time from which the data needs to be calculated. | 

### Return type

[**Healthcollectorv3GetTopGdpCollectorsResponse**](healthcollectorv3GetTopGDPCollectorsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorStoreEdgeMetrics**
> Healthcollectorv3StoreEdgeMetricsResponse HealthCollectorStoreEdgeMetrics(ctx, body)
Summary: Store Edge metrics Description: Store telemetry data from the Edge's connected to GI.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Healthcollectorv3StoreEdgeMetricsRequest**](Healthcollectorv3StoreEdgeMetricsRequest.md)|  | 

### Return type

[**Healthcollectorv3StoreEdgeMetricsResponse**](healthcollectorv3StoreEdgeMetricsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **HealthCollectorStoreHealthInfo**
> Healthcollectorv3StoreHealthInfoResponse HealthCollectorStoreHealthInfo(ctx, body, centralManagerId)
Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Healthcollectorv3StoreHealthInfoRequest**](Healthcollectorv3StoreHealthInfoRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Healthcollectorv3StoreHealthInfoResponse**](healthcollectorv3StoreHealthInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

