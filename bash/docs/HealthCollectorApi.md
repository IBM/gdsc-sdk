# HealthCollectorApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCollectorGetDataWarehouseUsage**](HealthCollectorApi.md#healthCollectorGetDataWarehouseUsage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info
Description: Get information from Db2 related to usage
[**healthCollectorGetGDPHealthInfo**](HealthCollectorApi.md#healthCollectorGetGDPHealthInfo) | **GET** /api/v3/health | Summary: Get GDP health info
Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**healthCollectorGetHistoricalHealthInfo**](HealthCollectorApi.md#healthCollectorGetHistoricalHealthInfo) | **GET** /api/v3/health/history | Summary: Get historical health info
Description: Retrieve historical s-tap related statistics from health-collector service.
[**healthCollectorGetObjectStorageUsage**](HealthCollectorApi.md#healthCollectorGetObjectStorageUsage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info
Description: Get information from object storage about tenant bucket usage
[**healthCollectorGetPVCUsage**](HealthCollectorApi.md#healthCollectorGetPVCUsage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information
Description: Get information about the PVC usage in the OCP cluster
[**healthCollectorGetPodRestarts**](HealthCollectorApi.md#healthCollectorGetPodRestarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information
Description: Get information about the number of restarts by pod in OCP
[**healthCollectorGetStreamsIngestion**](HealthCollectorApi.md#healthCollectorGetStreamsIngestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time
Description: Get information about streams ingestion volume
[**healthCollectorGetTopGDPCollectors**](HealthCollectorApi.md#healthCollectorGetTopGDPCollectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI
Description: Get information about the top GDP collectors
[**healthCollectorStoreHealthInfo**](HealthCollectorApi.md#healthCollectorStoreHealthInfo) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info
Description: Store health info from GDP into GI. (This API is called from GDP only)



## healthCollectorGetDataWarehouseUsage

Summary: Get data warehouse usage info
Description: Get information from Db2 related to usage

### Example

```bash
 healthCollectorGetDataWarehouseUsage type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetDataWarehouseUsageResponse**](Healthcollectorv3GetDataWarehouseUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetGDPHealthInfo

Summary: Get GDP health info
Description: Get information from MongoDB for Guardium central managers using health-connector service.

### Example

```bash
 healthCollectorGetGDPHealthInfo
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Healthcollectorv3GetGDPHealthInfoResponse**](Healthcollectorv3GetGDPHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetHistoricalHealthInfo

Summary: Get historical health info
Description: Retrieve historical s-tap related statistics from health-collector service.

### Example

```bash
 healthCollectorGetHistoricalHealthInfo  unit=value  cm_id=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | **string** | Type of unit for which data needs to be retrieved. | [optional] [default to UNKNOWN_UNIT]
 **cmId** | **string** | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | [optional] [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetHistoricalHealthInfoResponse**](Healthcollectorv3GetHistoricalHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetObjectStorageUsage

Summary: Get object storage usage info
Description: Get information from object storage about tenant bucket usage

### Example

```bash
 healthCollectorGetObjectStorageUsage type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetObjectStorageUsageResponse**](Healthcollectorv3GetObjectStorageUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetPVCUsage

Summary: Get the PVC usage information
Description: Get information about the PVC usage in the OCP cluster

### Example

```bash
 healthCollectorGetPVCUsage type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetPVCUsageResponse**](Healthcollectorv3GetPVCUsageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetPodRestarts

Summary: Get the pod restart information
Description: Get information about the number of restarts by pod in OCP

### Example

```bash
 healthCollectorGetPodRestarts type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetPodRestartsResponse**](Healthcollectorv3GetPodRestartsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetStreamsIngestion

Summary: Get streams ingestion volume over a given time
Description: Get information about streams ingestion volume

### Example

```bash
 healthCollectorGetStreamsIngestion type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetStreamsIngestionResponse**](Healthcollectorv3GetStreamsIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorGetTopGDPCollectors

Summary: Get the top GDP collectors which send data to GI
Description: Get information about the top GDP collectors

### Example

```bash
 healthCollectorGetTopGDPCollectors type=value  start_time=value  end_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string** | The type of metric to retrieve | [default to null]
 **startTime** | **string** | The start time from which the data needs to be calculated. | [optional] [default to null]
 **endTime** | **string** | The end time from which the data needs to be calculated. | [optional] [default to null]

### Return type

[**Healthcollectorv3GetTopGDPCollectorsResponse**](Healthcollectorv3GetTopGDPCollectorsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## healthCollectorStoreHealthInfo

Summary: Store health info
Description: Store health info from GDP into GI. (This API is called from GDP only)

### Example

```bash
 healthCollectorStoreHealthInfo central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **healthcollectorv3StoreHealthInfoRequest** | [**Healthcollectorv3StoreHealthInfoRequest**](Healthcollectorv3StoreHealthInfoRequest.md) |  |

### Return type

[**Healthcollectorv3StoreHealthInfoResponse**](Healthcollectorv3StoreHealthInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

