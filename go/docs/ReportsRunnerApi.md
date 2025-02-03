# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsRunnerGetActiveQueries**](ReportsRunnerApi.md#ReportsRunnerGetActiveQueries) | **Post** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
[**ReportsRunnerGetAuditDataCount**](ReportsRunnerApi.md#ReportsRunnerGetAuditDataCount) | **Post** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
[**ReportsRunnerGetChartData**](ReportsRunnerApi.md#ReportsRunnerGetChartData) | **Post** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**ReportsRunnerGetChartDatav2**](ReportsRunnerApi.md#ReportsRunnerGetChartDatav2) | **Post** /api/v3/flex-charts/run | 
[**ReportsRunnerGetReportColumnFacet**](ReportsRunnerApi.md#ReportsRunnerGetReportColumnFacet) | **Post** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
[**ReportsRunnerGetReportDataCount**](ReportsRunnerApi.md#ReportsRunnerGetReportDataCount) | **Post** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
[**ReportsRunnerRunAuditReport**](ReportsRunnerApi.md#ReportsRunnerRunAuditReport) | **Post** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
[**ReportsRunnerRunReport**](ReportsRunnerApi.md#ReportsRunnerRunReport) | **Post** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
[**ReportsRunnerStopQuery**](ReportsRunnerApi.md#ReportsRunnerStopQuery) | **Post** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id

# **ReportsRunnerGetActiveQueries**
> Reportsrunnerv3GetActiveQueriesResponse ReportsRunnerGetActiveQueries(ctx, body)
Summary: Get running queries Description: Get queries that are running more than certain time

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetActiveQueriesRequest**](Reportsrunnerv3GetActiveQueriesRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetActiveQueriesResponse**](reportsrunnerv3GetActiveQueriesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerGetAuditDataCount**
> Reportsrunnerv3GetReportDataCountResponse ReportsRunnerGetAuditDataCount(ctx, body, reportId)
Summary: Get audit data count Description: Get audit data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetAuditDataCountRequest**](Reportsrunnerv3GetAuditDataCountRequest.md)|  | 
  **reportId** | **string**| Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerGetChartData**
> Reportsrunnerv3GetChartDataResponse ReportsRunnerGetChartData(ctx, body)
Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetChartDataRequest**](Reportsrunnerv3GetChartDataRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetChartDataResponse**](reportsrunnerv3GetChartDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerGetChartDatav2**
> Reportsrunnerv3GetChartDataResponsev2 ReportsRunnerGetChartDatav2(ctx, body)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetChartDataRequestv2**](Reportsrunnerv3GetChartDataRequestv2.md)|  | 

### Return type

[**Reportsrunnerv3GetChartDataResponsev2**](reportsrunnerv3GetChartDataResponsev2.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerGetReportColumnFacet**
> Reportsrunnerv3GetReportColumnFacetResponse ReportsRunnerGetReportColumnFacet(ctx, body)
Summary: Get report column facet Description: Get counts that is group by values for the selected column.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetReportColumnFacetRequest**](Reportsrunnerv3GetReportColumnFacetRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetReportColumnFacetResponse**](reportsrunnerv3GetReportColumnFacetResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerGetReportDataCount**
> Reportsrunnerv3GetReportDataCountResponse ReportsRunnerGetReportDataCount(ctx, body)
Summary: Get report data count Description: Get report data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3GetReportDataCountRequest**](Reportsrunnerv3GetReportDataCountRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerRunAuditReport**
> StreamResultOfReportsrunnerv3RunReportResponse ReportsRunnerRunAuditReport(ctx, body, reportId)
Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3RunAuditReportRequest**](Reportsrunnerv3RunAuditReportRequest.md)|  | 
  **reportId** | **string**| The ID of the Report we wish to run (e.g. 000000000000000000000905). | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](Stream result of reportsrunnerv3RunReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerRunReport**
> StreamResultOfReportsrunnerv3RunReportResponse ReportsRunnerRunReport(ctx, body)
Summary: Run report Description: Run report by report ID or by specifying report definition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3RunReportRequest**](Reportsrunnerv3RunReportRequest.md)|  | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](Stream result of reportsrunnerv3RunReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsRunnerStopQuery**
> Reportsrunnerv3StopQueryResponse ReportsRunnerStopQuery(ctx, body)
Summary: Stop query Description: Stop a query based on the id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsrunnerv3StopQueryRequest**](Reportsrunnerv3StopQueryRequest.md)|  | 

### Return type

[**Reportsrunnerv3StopQueryResponse**](reportsrunnerv3StopQueryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

