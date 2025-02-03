# .ReportsRunnerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsRunnerGetActiveQueries**](ReportsRunnerApi.md#reportsRunnerGetActiveQueries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
[**reportsRunnerGetAuditDataCount**](ReportsRunnerApi.md#reportsRunnerGetAuditDataCount) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
[**reportsRunnerGetChartData**](ReportsRunnerApi.md#reportsRunnerGetChartData) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**reportsRunnerGetChartDatav2**](ReportsRunnerApi.md#reportsRunnerGetChartDatav2) | **POST** /api/v3/flex-charts/run | 
[**reportsRunnerGetReportColumnFacet**](ReportsRunnerApi.md#reportsRunnerGetReportColumnFacet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
[**reportsRunnerGetReportDataCount**](ReportsRunnerApi.md#reportsRunnerGetReportDataCount) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
[**reportsRunnerRunAuditReport**](ReportsRunnerApi.md#reportsRunnerRunAuditReport) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
[**reportsRunnerRunReport**](ReportsRunnerApi.md#reportsRunnerRunReport) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
[**reportsRunnerStopQuery**](ReportsRunnerApi.md#reportsRunnerStopQuery) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id


# **reportsRunnerGetActiveQueries**
> Reportsrunnerv3GetActiveQueriesResponse reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetActiveQueriesRequest = {
  // Reportsrunnerv3GetActiveQueriesRequest
  reportsrunnerv3GetActiveQueriesRequest: {
    elapsedTime: 1,
    type: [
      "type_example",
    ],
  },
};

apiInstance.reportsRunnerGetActiveQueries(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetActiveQueriesRequest** | **Reportsrunnerv3GetActiveQueriesRequest**|  |


### Return type

**Reportsrunnerv3GetActiveQueriesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerGetAuditDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetAuditDataCount(reportsrunnerv3GetAuditDataCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetAuditDataCountRequest = {
  // string | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
  reportId: "report_id_example",
  // Reportsrunnerv3GetAuditDataCountRequest
  reportsrunnerv3GetAuditDataCountRequest: {
    jobId: "jobId_example",
    reportFilters: {
      bracketsId: 1,
      filterName: "filterName_example",
      filtersArray: [
        {
          brackets: ,
          condition: {
            caseInsensitive: true,
            fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
            filterId: 1,
            headerId: "headerId_example",
            headerName: "headerName_example",
            headerType: "UNDEFINED_TYPE",
            inReportDateRange: {
              endDate: "endDate_example",
              endNumber: 1,
              endUnit: "UNDEFINED_UINT_TYPE",
              startDate: "startDate_example",
              startNumber: 1,
              startUnit: "UNDEFINED_UINT_TYPE",
              type: "UNDEFINED_DATE_RANGE_TYPE",
            },
            inReportFieldNlsKey: "inReportFieldNlsKey_example",
            inReportHeaderId: "inReportHeaderId_example",
            inReportHeaderName: "inReportHeaderName_example",
            inReportId: "inReportId_example",
            inReportName: "inReportName_example",
            inReportTableName: "inReportTableName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            parameterType: "UNDEFINED_PARAM_TYPE",
            schemaName: "schemaName_example",
            sequence: 1,
            tableName: "tableName_example",
            values: [
              "values_example",
            ],
          },
        },
      ],
      havingArray: [
        {
          condition: {
            aggregationType: "UNDEFINED_AGG_TYPE",
            headerId: "headerId_example",
            headerName: "headerName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            tableName: "tableName_example",
            value: "value_example",
          },
        },
      ],
      isCustom: true,
      optionType: "UNDEFINED_OPTION_TYPE",
      sequence: 1,
    },
    reportId: "reportId_example",
    schemaName: "schemaName_example",
    tableName: "tableName_example",
  },
};

apiInstance.reportsRunnerGetAuditDataCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetAuditDataCountRequest** | **Reportsrunnerv3GetAuditDataCountRequest**|  |
 **reportId** | [**string**] | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | defaults to undefined


### Return type

**Reportsrunnerv3GetReportDataCountResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerGetChartData**
> Reportsrunnerv3GetChartDataResponse reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetChartDataRequest = {
  // Reportsrunnerv3GetChartDataRequest
  reportsrunnerv3GetChartDataRequest: {
    chartId: "chartId_example",
    chartSettings: {
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      chartType: "UNDEFINED_CHART_TYPE",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      datasetHeaderId: "datasetHeaderId_example",
      datasetMaxValues: 1,
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      refreshRate: 1,
      reportId: "reportId_example",
      xaxisHeaderId: "xaxisHeaderId_example",
      xaxisMaxValues: 1,
      yaxisHeaderId: "yaxisHeaderId_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetChartData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequest** | **Reportsrunnerv3GetChartDataRequest**|  |


### Return type

**Reportsrunnerv3GetChartDataResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerGetChartDatav2**
> Reportsrunnerv3GetChartDataResponsev2 reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetChartDatav2Request = {
  // Reportsrunnerv3GetChartDataRequestv2
  reportsrunnerv3GetChartDataRequestv2: {
    chartId: "chartId_example",
    chartSettings: {
      categorySequenceNumbers: [
        1,
      ],
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      measureSequenceNumbers: [
        1,
      ],
      refreshRate: 1,
      reportId: "reportId_example",
      vegaDefinition: "vegaDefinition_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetChartDatav2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequestv2** | **Reportsrunnerv3GetChartDataRequestv2**|  |


### Return type

**Reportsrunnerv3GetChartDataResponsev2**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerGetReportColumnFacet**
> Reportsrunnerv3GetReportColumnFacetResponse reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetReportColumnFacetRequest = {
  // Reportsrunnerv3GetReportColumnFacetRequest
  reportsrunnerv3GetReportColumnFacetRequest: {
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    facetSelectedHeader: {
      aggregationType: "UNDEFINED_AGG_TYPE",
      fieldName: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      groupTypeId: 1,
      headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
      headerDescription: {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      headerId: "headerId_example",
      headerName: "headerName_example",
      headerType: "UNDEFINED_TYPE",
      headerTypeLength: 1,
      literal: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      orderBy: "UNDEFINED_ORDER_BY",
      orderBySeq: 1,
      schemaName: "schemaName_example",
      sequence: 1,
      tableName: "tableName_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetReportColumnFacet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportColumnFacetRequest** | **Reportsrunnerv3GetReportColumnFacetRequest**|  |


### Return type

**Reportsrunnerv3GetReportColumnFacetResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerGetReportDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetReportDataCountRequest = {
  // Reportsrunnerv3GetReportDataCountRequest
  reportsrunnerv3GetReportDataCountRequest: {
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    reportId: "reportId_example",
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetReportDataCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportDataCountRequest** | **Reportsrunnerv3GetReportDataCountRequest**|  |


### Return type

**Reportsrunnerv3GetReportDataCountResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerRunAuditReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunAuditReport(reportsrunnerv3RunAuditReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerRunAuditReportRequest = {
  // string | The ID of the Report we wish to run (e.g. 000000000000000000000905).
  reportId: "report_id_example",
  // Reportsrunnerv3RunAuditReportRequest
  reportsrunnerv3RunAuditReportRequest: {
    fetchSize: 1,
    headerName: "headerName_example",
    jobId: "jobId_example",
    offset: 1,
    orderBy: "UNDEFINED_ORDER_BY",
    reportFilters: {
      bracketsId: 1,
      filterName: "filterName_example",
      filtersArray: [
        {
          brackets: ,
          condition: {
            caseInsensitive: true,
            fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
            filterId: 1,
            headerId: "headerId_example",
            headerName: "headerName_example",
            headerType: "UNDEFINED_TYPE",
            inReportDateRange: {
              endDate: "endDate_example",
              endNumber: 1,
              endUnit: "UNDEFINED_UINT_TYPE",
              startDate: "startDate_example",
              startNumber: 1,
              startUnit: "UNDEFINED_UINT_TYPE",
              type: "UNDEFINED_DATE_RANGE_TYPE",
            },
            inReportFieldNlsKey: "inReportFieldNlsKey_example",
            inReportHeaderId: "inReportHeaderId_example",
            inReportHeaderName: "inReportHeaderName_example",
            inReportId: "inReportId_example",
            inReportName: "inReportName_example",
            inReportTableName: "inReportTableName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            parameterType: "UNDEFINED_PARAM_TYPE",
            schemaName: "schemaName_example",
            sequence: 1,
            tableName: "tableName_example",
            values: [
              "values_example",
            ],
          },
        },
      ],
      havingArray: [
        {
          condition: {
            aggregationType: "UNDEFINED_AGG_TYPE",
            headerId: "headerId_example",
            headerName: "headerName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            tableName: "tableName_example",
            value: "value_example",
          },
        },
      ],
      isCustom: true,
      optionType: "UNDEFINED_OPTION_TYPE",
      sequence: 1,
    },
    reportId: "reportId_example",
    schemaName: "schemaName_example",
    tableName: "tableName_example",
    withoutLimit: true,
  },
};

apiInstance.reportsRunnerRunAuditReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunAuditReportRequest** | **Reportsrunnerv3RunAuditReportRequest**|  |
 **reportId** | [**string**] | The ID of the Report we wish to run (e.g. 000000000000000000000905). | defaults to undefined


### Return type

**StreamResultOfReportsrunnerv3RunReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerRunReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunReport(reportsrunnerv3RunReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerRunReportRequest = {
  // Reportsrunnerv3RunReportRequest
  reportsrunnerv3RunReportRequest: {
    calculateFacets: true,
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    defaultChartExpanded: true,
    fetchSize: 1,
    jobType: "UNDEFINED_JOB_TYPE",
    modelType: "UNDEFINED_MODEL_TYPE",
    offset: 1,
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    reportId: "reportId_example",
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
    useQuickFacets: true,
    withoutLimit: true,
  },
};

apiInstance.reportsRunnerRunReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunReportRequest** | **Reportsrunnerv3RunReportRequest**|  |


### Return type

**StreamResultOfReportsrunnerv3RunReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerStopQuery**
> Reportsrunnerv3StopQueryResponse reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerStopQueryRequest = {
  // Reportsrunnerv3StopQueryRequest
  reportsrunnerv3StopQueryRequest: {
    queryIds: [
      "queryIds_example",
    ],
  },
};

apiInstance.reportsRunnerStopQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3StopQueryRequest** | **Reportsrunnerv3StopQueryRequest**|  |


### Return type

**Reportsrunnerv3StopQueryResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


