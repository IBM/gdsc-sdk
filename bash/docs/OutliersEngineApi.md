# OutliersEngineApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**outliersEngineGetSourceStatistics**](OutliersEngineApi.md#outliersEngineGetSourceStatistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics
Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**outliersEngineGetStatistics**](OutliersEngineApi.md#outliersEngineGetStatistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics
Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**outliersEngineGetWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineGetWorkingHoursPeriods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods
Description: Get a list of the working hours periods.
[**outliersEngineRunSimulator**](OutliersEngineApi.md#outliersEngineRunSimulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator
Description: Run outlier simulator.
[**outliersEngineUpdateWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineUpdateWorkingHoursPeriods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods
Description: Update the working hours periods values.
[**outliersEngineUploadAndAnalyzePeriod**](OutliersEngineApi.md#outliersEngineUploadAndAnalyzePeriod) | **POST** /api/v3/outliers | Summary: Upload and analyze period
Description: Run outliers detection on ready periods.
[**outliersEngineUserClustering**](OutliersEngineApi.md#outliersEngineUserClustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering
Description: Run user-clustering on current sources.



## outliersEngineGetSourceStatistics

Summary: Get source statistics
Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.

### Example

```bash
 outliersEngineGetSourceStatistics  source.server_ip=value  source.database_name=value  source.db_user=value  attributes_limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourcePeriodserverIp** | **string** | server ip. | [optional] [default to null]
 **sourcePerioddatabaseName** | **string** | database name. | [optional] [default to null]
 **sourcePerioddbUser** | **string** | db user name (optional). | [optional] [default to null]
 **attributesLimit** | **integer** | The number of attributes to return for each SourceAttributeType - optional. | [optional] [default to null]

### Return type

[**Outliersenginev3GetSourceStatisticsResponse**](Outliersenginev3GetSourceStatisticsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineGetStatistics

Summary: Get statistics
Description: Return statistics regarding number of outliers, clusters and un/completed periods.

### Example

```bash
 outliersEngineGetStatistics
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Outliersenginev3StatisticsResponse**](Outliersenginev3StatisticsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineGetWorkingHoursPeriods

Summary: Get working hours periods
Description: Get a list of the working hours periods.

### Example

```bash
 outliersEngineGetWorkingHoursPeriods
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Outliersenginev3GetWorkingHoursPeriodsResponse**](Outliersenginev3GetWorkingHoursPeriodsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineRunSimulator

Summary: Run simulator
Description: Run outlier simulator.

### Example

```bash
 outliersEngineRunSimulator
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3RunSimulatorRequest** | [**Outliersenginev3RunSimulatorRequest**](Outliersenginev3RunSimulatorRequest.md) |  |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineUpdateWorkingHoursPeriods

Summary: Update working hours periods
Description: Update the working hours periods values.

### Example

```bash
 outliersEngineUpdateWorkingHoursPeriods
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3UpdateWorkingHoursPeriodsRequest** | [**Outliersenginev3UpdateWorkingHoursPeriodsRequest**](Outliersenginev3UpdateWorkingHoursPeriodsRequest.md) |  |

### Return type

[**Outliersenginev3OutlierResponse**](Outliersenginev3OutlierResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineUploadAndAnalyzePeriod

Summary: Upload and analyze period
Description: Run outliers detection on ready periods.

### Example

```bash
 outliersEngineUploadAndAnalyzePeriod
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## outliersEngineUserClustering

Summary: User clustering
Description: Run user-clustering on current sources.

### Example

```bash
 outliersEngineUserClustering
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

