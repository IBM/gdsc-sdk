# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OutliersEngineGetSourceStatistics**](OutliersEngineApi.md#OutliersEngineGetSourceStatistics) | **Get** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**OutliersEngineGetStatistics**](OutliersEngineApi.md#OutliersEngineGetStatistics) | **Get** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**OutliersEngineGetWorkingHoursPeriods**](OutliersEngineApi.md#OutliersEngineGetWorkingHoursPeriods) | **Get** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
[**OutliersEngineRunSimulator**](OutliersEngineApi.md#OutliersEngineRunSimulator) | **Post** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
[**OutliersEngineUpdateWorkingHoursPeriods**](OutliersEngineApi.md#OutliersEngineUpdateWorkingHoursPeriods) | **Put** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
[**OutliersEngineUploadAndAnalyzePeriod**](OutliersEngineApi.md#OutliersEngineUploadAndAnalyzePeriod) | **Post** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
[**OutliersEngineUserClustering**](OutliersEngineApi.md#OutliersEngineUserClustering) | **Post** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.

# **OutliersEngineGetSourceStatistics**
> Outliersenginev3GetSourceStatisticsResponse OutliersEngineGetSourceStatistics(ctx, optional)
Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OutliersEngineApiOutliersEngineGetSourceStatisticsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OutliersEngineApiOutliersEngineGetSourceStatisticsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceServerIp** | **optional.String**| server ip. | 
 **sourceDatabaseName** | **optional.String**| database name. | 
 **sourceDbUser** | **optional.String**| db user name (optional). | 
 **attributesLimit** | **optional.Int32**| The number of attributes to return for each SourceAttributeType - optional. | 

### Return type

[**Outliersenginev3GetSourceStatisticsResponse**](outliersenginev3GetSourceStatisticsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineGetStatistics**
> Outliersenginev3StatisticsResponse OutliersEngineGetStatistics(ctx, )
Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Outliersenginev3StatisticsResponse**](outliersenginev3StatisticsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineGetWorkingHoursPeriods**
> Outliersenginev3GetWorkingHoursPeriodsResponse OutliersEngineGetWorkingHoursPeriods(ctx, )
Summary: Get working hours periods Description: Get a list of the working hours periods.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Outliersenginev3GetWorkingHoursPeriodsResponse**](outliersenginev3GetWorkingHoursPeriodsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineRunSimulator**
> RpcStatus OutliersEngineRunSimulator(ctx, body)
Summary: Run simulator Description: Run outlier simulator.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Outliersenginev3RunSimulatorRequest**](Outliersenginev3RunSimulatorRequest.md)|  | 

### Return type

[**RpcStatus**](rpcStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineUpdateWorkingHoursPeriods**
> Outliersenginev3OutlierResponse OutliersEngineUpdateWorkingHoursPeriods(ctx, body)
Summary: Update working hours periods Description: Update the working hours periods values.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Outliersenginev3UpdateWorkingHoursPeriodsRequest**](Outliersenginev3UpdateWorkingHoursPeriodsRequest.md)|  | 

### Return type

[**Outliersenginev3OutlierResponse**](outliersenginev3OutlierResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineUploadAndAnalyzePeriod**
> RpcStatus OutliersEngineUploadAndAnalyzePeriod(ctx, body)
Summary: Upload and analyze period Description: Run outliers detection on ready periods.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Outliersenginev3EmptyRequest**](Outliersenginev3EmptyRequest.md)|  | 

### Return type

[**RpcStatus**](rpcStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutliersEngineUserClustering**
> RpcStatus OutliersEngineUserClustering(ctx, body)
Summary: User clustering Description: Run user-clustering on current sources.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Outliersenginev3EmptyRequest**](Outliersenginev3EmptyRequest.md)|  | 

### Return type

[**RpcStatus**](rpcStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

