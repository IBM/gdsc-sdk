# ReportsRunnerApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsRunnerGetActiveQueries**](ReportsRunnerApi.md#reportsRunnerGetActiveQueries) | **POST** /api/v3/queries/search | Summary: Get running queries
Description: Get queries that are running more than certain time
[**reportsRunnerGetAuditDataCount**](ReportsRunnerApi.md#reportsRunnerGetAuditDataCount) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count
Description: Get audit data.
[**reportsRunnerGetChartData**](ReportsRunnerApi.md#reportsRunnerGetChartData) | **POST** /api/v3/charts/run | Summary: Get chart data
Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**reportsRunnerGetChartDatav2**](ReportsRunnerApi.md#reportsRunnerGetChartDatav2) | **POST** /api/v3/flex-charts/run | 
[**reportsRunnerGetReportColumnFacet**](ReportsRunnerApi.md#reportsRunnerGetReportColumnFacet) | **POST** /api/v3/reports/facet | Summary: Get report column facet
Description: Get counts that is group by values for the selected column.
[**reportsRunnerGetReportDataCount**](ReportsRunnerApi.md#reportsRunnerGetReportDataCount) | **POST** /api/v3/reports/count | Summary: Get report data count
Description: Get report data.
[**reportsRunnerRunAuditReport**](ReportsRunnerApi.md#reportsRunnerRunAuditReport) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report
Description: Run task report by SQL based ob report ID and filter definition.
[**reportsRunnerRunReport**](ReportsRunnerApi.md#reportsRunnerRunReport) | **POST** /api/v3/reports/run | Summary: Run report
Description: Run report by report ID or by specifying report definition.
[**reportsRunnerStopQuery**](ReportsRunnerApi.md#reportsRunnerStopQuery) | **POST** /api/v3/queries/stop | Summary: Stop query
Description: Stop a query based on the id



## reportsRunnerGetActiveQueries

Summary: Get running queries
Description: Get queries that are running more than certain time

### Example

```bash
 reportsRunnerGetActiveQueries
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetActiveQueriesRequest** | [**Reportsrunnerv3GetActiveQueriesRequest**](Reportsrunnerv3GetActiveQueriesRequest.md) |  |

### Return type

[**Reportsrunnerv3GetActiveQueriesResponse**](Reportsrunnerv3GetActiveQueriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerGetAuditDataCount

Summary: Get audit data count
Description: Get audit data.

### Example

```bash
 reportsRunnerGetAuditDataCount report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | [default to null]
 **reportsrunnerv3GetAuditDataCountRequest** | [**Reportsrunnerv3GetAuditDataCountRequest**](Reportsrunnerv3GetAuditDataCountRequest.md) |  |

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerGetChartData

Summary: Get chart data
Description: Get Chart data by chart ID or by specifying report definition and chart settings.

### Example

```bash
 reportsRunnerGetChartData
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequest** | [**Reportsrunnerv3GetChartDataRequest**](Reportsrunnerv3GetChartDataRequest.md) |  |

### Return type

[**Reportsrunnerv3GetChartDataResponse**](Reportsrunnerv3GetChartDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerGetChartDatav2



### Example

```bash
 reportsRunnerGetChartDatav2
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequestv2** | [**Reportsrunnerv3GetChartDataRequestv2**](Reportsrunnerv3GetChartDataRequestv2.md) |  |

### Return type

[**Reportsrunnerv3GetChartDataResponsev2**](Reportsrunnerv3GetChartDataResponsev2.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerGetReportColumnFacet

Summary: Get report column facet
Description: Get counts that is group by values for the selected column.

### Example

```bash
 reportsRunnerGetReportColumnFacet
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportColumnFacetRequest** | [**Reportsrunnerv3GetReportColumnFacetRequest**](Reportsrunnerv3GetReportColumnFacetRequest.md) |  |

### Return type

[**Reportsrunnerv3GetReportColumnFacetResponse**](Reportsrunnerv3GetReportColumnFacetResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerGetReportDataCount

Summary: Get report data count
Description: Get report data.

### Example

```bash
 reportsRunnerGetReportDataCount
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportDataCountRequest** | [**Reportsrunnerv3GetReportDataCountRequest**](Reportsrunnerv3GetReportDataCountRequest.md) |  |

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerRunAuditReport

Summary: Run audit report
Description: Run task report by SQL based ob report ID and filter definition.

### Example

```bash
 reportsRunnerRunAuditReport report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | The ID of the Report we wish to run (e.g. 000000000000000000000905). | [default to null]
 **reportsrunnerv3RunAuditReportRequest** | [**Reportsrunnerv3RunAuditReportRequest**](Reportsrunnerv3RunAuditReportRequest.md) |  |

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerRunReport

Summary: Run report
Description: Run report by report ID or by specifying report definition.

### Example

```bash
 reportsRunnerRunReport
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunReportRequest** | [**Reportsrunnerv3RunReportRequest**](Reportsrunnerv3RunReportRequest.md) |  |

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsRunnerStopQuery

Summary: Stop query
Description: Stop a query based on the id

### Example

```bash
 reportsRunnerStopQuery
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3StopQueryRequest** | [**Reportsrunnerv3StopQueryRequest**](Reportsrunnerv3StopQueryRequest.md) |  |

### Return type

[**Reportsrunnerv3StopQueryResponse**](Reportsrunnerv3StopQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

