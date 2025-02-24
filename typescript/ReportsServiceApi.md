# .ReportsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsServiceCreateCategory**](ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**reportsServiceCreateChart**](ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**reportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**reportsServiceCreateChartv2**](ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**reportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**reportsServiceCreateJoin**](ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**reportsServiceCreateReport**](ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**reportsServiceCreateVariant**](ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**reportsServiceDeleteCategory**](ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**reportsServiceDeleteChart**](ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**reportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**reportsServiceDeleteChartv2**](ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**reportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**reportsServiceDeleteJoin**](ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**reportsServiceDeleteReport**](ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**reportsServiceDeleteVariant**](ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**reportsServiceGetCategories**](ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**reportsServiceGetChartSettings**](ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**reportsServiceGetChartSettingsv2**](ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**reportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**reportsServiceGetFieldsByCategories**](ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**reportsServiceGetFieldsByCategory**](ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**reportsServiceGetJoins**](ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**reportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**reportsServiceGetQueryByReportID**](ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**reportsServiceGetReportDefinition**](ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**reportsServiceGetReportGroups**](ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**reportsServiceGetReportSynopsis**](ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**reportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**reportsServiceGetReports**](ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**reportsServiceGetReportsForJoin**](ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**reportsServiceGetReportsTags**](ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**reportsServiceGetVariant**](ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**reportsServiceGetVariants**](ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**reportsServicePartialChartUpdate**](ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**reportsServicePartialReportUpdate**](ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**reportsServiceRunVariantOperation**](ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**reportsServiceTranspose**](ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**reportsServiceUpdateChart**](ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**reportsServiceUpdateChartv2**](ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**reportsServiceUpdateJoin**](ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**reportsServiceUpdateReport**](ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**reportsServiceUpdateVariantOverride**](ReportsServiceApi.md#reportsServiceUpdateVariantOverride) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override


# **reportsServiceCreateCategory**
> Reportsv3CreateCategoryResponse reportsServiceCreateCategory(reportsv3CreateCategoryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateCategoryRequest = {
  // Reportsv3CreateCategoryRequest
  reportsv3CreateCategoryRequest: {
    category: {
      categoryDescription: "categoryDescription_example",
      categoryName: "categoryName_example",
      categoryTables: [
        "categoryTables_example",
      ],
      timestampMapping: [
        {
          level: 1,
          tableName: "tableName_example",
          timestampHeaderId: "timestampHeaderId_example",
          timestampHeaderName: "timestampHeaderName_example",
        },
      ],
    },
  },
};

apiInstance.reportsServiceCreateCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateCategoryRequest** | **Reportsv3CreateCategoryRequest**|  |


### Return type

**Reportsv3CreateCategoryResponse**

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

# **reportsServiceCreateChart**
> Reportsv3CreateChartResponse reportsServiceCreateChart(reportsv3CreateChartRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartRequest = {
  // Reportsv3CreateChartRequest
  reportsv3CreateChartRequest: {
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
  },
};

apiInstance.reportsServiceCreateChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartRequest** | **Reportsv3CreateChartRequest**|  |


### Return type

**Reportsv3CreateChartResponse**

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

# **reportsServiceCreateChartTemplatev2**
> Reportsv3CreateChartTemplatev2Response reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartTemplatev2Request = {
  // Reportsv3CreateChartTemplatev2Request
  reportsv3CreateChartTemplatev2Request: {
    vegaDefinition: "vegaDefinition_example",
  },
};

apiInstance.reportsServiceCreateChartTemplatev2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartTemplatev2Request** | **Reportsv3CreateChartTemplatev2Request**|  |


### Return type

**Reportsv3CreateChartTemplatev2Response**

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

# **reportsServiceCreateChartv2**
> Reportsv3CreateChartv2Response reportsServiceCreateChartv2(reportsv3CreateChartv2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartv2Request = {
  // Reportsv3CreateChartv2Request
  reportsv3CreateChartv2Request: {
    chartSettingsV2: {
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
  },
};

apiInstance.reportsServiceCreateChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartv2Request** | **Reportsv3CreateChartv2Request**|  |


### Return type

**Reportsv3CreateChartv2Response**

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

# **reportsServiceCreateFieldsByCategory**
> Reportsv3CreateFieldsByCategoryResponse reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateFieldsByCategoryRequest = {
  // Reportsv3CreateFieldsByCategoryRequest
  reportsv3CreateFieldsByCategoryRequest: {
    fields: [
      {
        canBeUsedInChart: true,
        fieldName: "fieldName_example",
        groupTypeId: 1,
        headerCategory: "headerCategory_example",
        headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
        headerDescription: "headerDescription_example",
        headerName: "headerName_example",
        isRecommended: true,
        isVisible: true,
        tableName: "tableName_example",
        type: "UNDEFINED_TYPE",
        typeLength: 1,
      },
    ],
  },
};

apiInstance.reportsServiceCreateFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateFieldsByCategoryRequest** | **Reportsv3CreateFieldsByCategoryRequest**|  |


### Return type

**Reportsv3CreateFieldsByCategoryResponse**

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

# **reportsServiceCreateJoin**
> Reportsv3CreateJoinResponse reportsServiceCreateJoin(reportsv3CreateJoinRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateJoinRequest = {
  // Reportsv3CreateJoinRequest
  reportsv3CreateJoinRequest: {
    joinDefinition: {
      categoryId: "categoryId_example",
      headerPairList: [
        {
          sourceHeaderId: "sourceHeaderId_example",
          targetHeaderId: "targetHeaderId_example",
        },
      ],
      sourceTableName: "sourceTableName_example",
      targetHeadersSelectedIds: [
        "targetHeadersSelectedIds_example",
      ],
      targetTableName: "targetTableName_example",
    },
  },
};

apiInstance.reportsServiceCreateJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateJoinRequest** | **Reportsv3CreateJoinRequest**|  |


### Return type

**Reportsv3CreateJoinResponse**

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

# **reportsServiceCreateReport**
> Reportsv3CreateReportResponse reportsServiceCreateReport(reportsv3CreateReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateReportRequest = {
  // Reportsv3CreateReportRequest
  reportsv3CreateReportRequest: {
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
  },
};

apiInstance.reportsServiceCreateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateReportRequest** | **Reportsv3CreateReportRequest**|  |


### Return type

**Reportsv3CreateReportResponse**

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

# **reportsServiceCreateVariant**
> Reportsv3CreateVariantResponse reportsServiceCreateVariant(reportsv3CreateVariantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateVariantRequest = {
  // Reportsv3CreateVariantRequest
  reportsv3CreateVariantRequest: {
    headerId: "headerId_example",
    rules: [
      {
        actionIfType: "UNDEFINED_VARIANT_ACTION_IF",
        delimiter: "delimiter_example",
        extractValue: "extractValue_example",
        matcher: "matcher_example",
        type: "UNDEFINED_VARIANT_RULE_TYPE",
      },
    ],
    variantName: "variantName_example",
  },
};

apiInstance.reportsServiceCreateVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateVariantRequest** | **Reportsv3CreateVariantRequest**|  |


### Return type

**Reportsv3CreateVariantResponse**

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

# **reportsServiceDeleteCategory**
> Reportsv3DeleteCategoryResponse reportsServiceDeleteCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteCategoryRequest = {
  // string | category id. (optional)
  categoryId: "category_id_example",
  // string | table name. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceDeleteCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | category id. | (optional) defaults to undefined
 **tableName** | [**string**] | table name. | (optional) defaults to undefined


### Return type

**Reportsv3DeleteCategoryResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteChart**
> Reportsv3DeleteChartResponse reportsServiceDeleteChart()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartRequest = {
  // string | The id of the chart to be deleted.
  chartId: "chart_id_example",
};

apiInstance.reportsServiceDeleteChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | The id of the chart to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteChartResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteChartTemplatev2**
> Reportsv3DeleteChartTemplatev2Response reportsServiceDeleteChartTemplatev2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartTemplatev2Request = {
  // string | Unique template ID.
  templateId: "template_id_example",
};

apiInstance.reportsServiceDeleteChartTemplatev2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | Unique template ID. | defaults to undefined


### Return type

**Reportsv3DeleteChartTemplatev2Response**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteChartv2**
> Reportsv3DeleteChartv2Response reportsServiceDeleteChartv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartv2Request = {
  // string | The ID of the chart for deletion.
  chartId: "chart_id_example",
};

apiInstance.reportsServiceDeleteChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | The ID of the chart for deletion. | defaults to undefined


### Return type

**Reportsv3DeleteChartv2Response**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteFieldsByCategory**
> Reportsv3DeleteFieldsByCategoryResponse reportsServiceDeleteFieldsByCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteFieldsByCategoryRequest = {
  // Array<string> | Header ids. (optional)
  headerIds: [
    "header_ids_example",
  ],
  // string | table name. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceDeleteFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerIds** | **Array&lt;string&gt;** | Header ids. | (optional) defaults to undefined
 **tableName** | [**string**] | table name. | (optional) defaults to undefined


### Return type

**Reportsv3DeleteFieldsByCategoryResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteJoin**
> Reportsv3DeleteJoinResponse reportsServiceDeleteJoin()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteJoinRequest = {
  // string | The id of the join to be deleted.
  joinId: "join_id_example",
};

apiInstance.reportsServiceDeleteJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | [**string**] | The id of the join to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteJoinResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteReport**
> Reportsv3DeleteReportResponse reportsServiceDeleteReport()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteReportRequest = {
  // string | The id of the Report to be deleted.
  reportId: "report_id_example",
};

apiInstance.reportsServiceDeleteReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | The id of the Report to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceDeleteVariant**
> Reportsv3DeleteVariantResponse reportsServiceDeleteVariant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteVariantRequest = {
  // string | The id of the variant to delete
  variantId: "variant_id_example",
};

apiInstance.reportsServiceDeleteVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | [**string**] | The id of the variant to delete | defaults to undefined


### Return type

**Reportsv3DeleteVariantResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetCategories**
> Reportsv3GetCategoriesResponse reportsServiceGetCategories()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetCategoriesRequest = {
  // string | Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetCategories(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetCategoriesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetChartSettings**
> Reportsv3GetChartSettingsResponse reportsServiceGetChartSettings()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetChartSettingsRequest = {
  // string | Unique Chart ID. (optional)
  chartId: "chart_id_example",
  // string | Unique Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetChartSettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | Unique Chart ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Unique Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetChartSettingsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetChartSettingsv2**
> Reportsv3GetChartSettingsv2Response reportsServiceGetChartSettingsv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetChartSettingsv2Request = {
  // string | Unique Chart ID. (optional)
  chartId: "chart_id_example",
  // string | Unique Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetChartSettingsv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | Unique Chart ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Unique Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetChartSettingsv2Response**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetChartTemplatesv2**
> Reportsv3GetChartTemplatesv2Response reportsServiceGetChartTemplatesv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetChartTemplatesv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetChartTemplatesv2Response**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetFieldsByCategories**
> Reportsv3GetFieldsByCategoriesResponse reportsServiceGetFieldsByCategories()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetFieldsByCategoriesRequest = {
  // Array<string> | Category IDs. (optional)
  categoryIds: [
    "category_ids_example",
  ],
};

apiInstance.reportsServiceGetFieldsByCategories(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | **Array&lt;string&gt;** | Category IDs. | (optional) defaults to undefined


### Return type

**Reportsv3GetFieldsByCategoriesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetFieldsByCategory**
> Reportsv3GetFieldsByCategoryResponse reportsServiceGetFieldsByCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetFieldsByCategoryRequest = {
  // string | Category ID. (optional)
  categoryId: "category_id_example",
  // string | Report ID. (optional)
  reportId: "report_id_example",
  // string | optional table name parameter. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceGetFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Report ID. | (optional) defaults to undefined
 **tableName** | [**string**] | optional table name parameter. | (optional) defaults to undefined


### Return type

**Reportsv3GetFieldsByCategoryResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetJoins**
> Reportsv3GetJoinsResponse reportsServiceGetJoins()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetJoinsRequest = {
  // string | Category ID (Optional). (optional)
  categoryId: "category_id_example",
};

apiInstance.reportsServiceGetJoins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID (Optional). | (optional) defaults to undefined


### Return type

**Reportsv3GetJoinsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetQueryByReportDefinition**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetQueryByReportDefinitionRequest = {
  // Reportsv3GetQueryByReportDefinitionRequest
  reportsv3GetQueryByReportDefinitionRequest: {
    addGroupLiteral: "addGroupLiteral_example",
    addJobIdLiteral: "addJobIdLiteral_example",
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
    excludeGroupId: "excludeGroupId_example",
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
    filterForJobId: "filterForJobId_example",
    jobType: "UNDEFINED_JOB_TYPE",
    modelTypes: [
      "UNDEFINED_MODEL_TYPE",
    ],
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
    sqlType: "UNDEFINED_SQL_TYPE",
    tableJoinOptimization: true,
  },
};

apiInstance.reportsServiceGetQueryByReportDefinition(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportDefinitionRequest** | **Reportsv3GetQueryByReportDefinitionRequest**|  |


### Return type

**Reportsv3GetReportQueryResponse**

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

# **reportsServiceGetQueryByReportID**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetQueryByReportIDRequest = {
  // Reportsv3GetQueryByReportIDRequest
  reportsv3GetQueryByReportIDRequest: {
    addGroupLiteral: "addGroupLiteral_example",
    addJobIdLiteral: "addJobIdLiteral_example",
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
    excludeGroupId: "excludeGroupId_example",
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
    filterForJobId: "filterForJobId_example",
    jobType: "UNDEFINED_JOB_TYPE",
    modelTypes: [
      "UNDEFINED_MODEL_TYPE",
    ],
    reportId: "reportId_example",
    sqlType: "UNDEFINED_SQL_TYPE",
    tableJoinOptimization: true,
  },
};

apiInstance.reportsServiceGetQueryByReportID(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportIDRequest** | **Reportsv3GetQueryByReportIDRequest**|  |


### Return type

**Reportsv3GetReportQueryResponse**

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

# **reportsServiceGetReportDefinition**
> Reportsv3GetReportDefinitionResponse reportsServiceGetReportDefinition()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportDefinitionRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetReportDefinition(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3GetReportDefinitionResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReportGroups**
> Reportsv3GetReportGroupsResponse reportsServiceGetReportGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportGroupsRequest = {
  // Array<string> | List of group IDs that should be checked for usage in each report. (optional)
  groups: [
    "groups_example",
  ],
};

apiInstance.reportsServiceGetReportGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | **Array&lt;string&gt;** | List of group IDs that should be checked for usage in each report. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportGroupsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReportSynopsis**
> Reportsv3GetReportSynopsisResponse reportsServiceGetReportSynopsis()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportSynopsisRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetReportSynopsis(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3GetReportSynopsisResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReportTimestampHeader**
> Reportsv3GetReportTimestampHeaderResponse reportsServiceGetReportTimestampHeader()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportTimestampHeaderRequest = {
  // string | Category ID parameter. (optional)
  categoryId: "category_id_example",
  // Array<string> | List of all header tables. (optional)
  tableNames: [
    "table_names_example",
  ],
};

apiInstance.reportsServiceGetReportTimestampHeader(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID parameter. | (optional) defaults to undefined
 **tableNames** | **Array&lt;string&gt;** | List of all header tables. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportTimestampHeaderResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReports**
> Reportsv3GetReportsResponse reportsServiceGetReports()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportsRequest = {
  // string | Optional Category ID parameter. (optional)
  categoryId: "category_id_example",
  // string | Optional table name parameter. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceGetReports(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Optional Category ID parameter. | (optional) defaults to undefined
 **tableName** | [**string**] | Optional table name parameter. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReportsForJoin**
> Reportsv3GetReportsForJoinResponse reportsServiceGetReportsForJoin()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportsForJoinRequest = {
  // string
  joinId: "join_id_example",
};

apiInstance.reportsServiceGetReportsForJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | [**string**] |  | defaults to undefined


### Return type

**Reportsv3GetReportsForJoinResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetReportsTags**
> Reportsv3GetReportsTagsResponse reportsServiceGetReportsTags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetReportsTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetReportsTagsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetVariant**
> Reportsv3GetVariantResponse reportsServiceGetVariant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetVariantRequest = {
  // string | The variant id
  variantId: "variant_id_example",
};

apiInstance.reportsServiceGetVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | [**string**] | The variant id | defaults to undefined


### Return type

**Reportsv3GetVariantResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServiceGetVariants**
> Reportsv3GetVariantsResponse reportsServiceGetVariants()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetVariants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetVariantsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsServicePartialChartUpdate**
> Reportsv3PartialChartUpdateResponse reportsServicePartialChartUpdate(reportsv3PartialChartUpdateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServicePartialChartUpdateRequest = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3PartialChartUpdateRequest
  reportsv3PartialChartUpdateRequest: {
    chartId: "chartId_example",
    chartTitle: "chartTitle_example",
    chartType: "UNDEFINED_CHART_TYPE",
    updateMask: {
      paths: [
        "paths_example",
      ],
    },
  },
};

apiInstance.reportsServicePartialChartUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3PartialChartUpdateRequest** | **Reportsv3PartialChartUpdateRequest**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3PartialChartUpdateResponse**

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

# **reportsServicePartialReportUpdate**
> Reportsv3PartialReportUpdateResponse reportsServicePartialReportUpdate(reportsv3PartialReportUpdateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServicePartialReportUpdateRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
  // Reportsv3PartialReportUpdateRequest
  reportsv3PartialReportUpdateRequest: {
    defaultChartExpanded: true,
    isHidden: true,
    isPinned: true,
    reportDescription: "reportDescription_example",
    reportId: "reportId_example",
    reportName: "reportName_example",
    reportTags: [
      {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
    ],
    updateMask: {
      paths: [
        "paths_example",
      ],
    },
  },
};

apiInstance.reportsServicePartialReportUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3PartialReportUpdateRequest** | **Reportsv3PartialReportUpdateRequest**|  |
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3PartialReportUpdateResponse**

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

# **reportsServiceRunVariantOperation**
> Reportsv3RunVariantOperationResponse reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceRunVariantOperationRequest = {
  // Reportsv3RunVariantOperationRequest
  reportsv3RunVariantOperationRequest: {
    input: "input_example",
    rules: [
      {
        actionIfType: "UNDEFINED_VARIANT_ACTION_IF",
        delimiter: "delimiter_example",
        extractValue: "extractValue_example",
        matcher: "matcher_example",
        type: "UNDEFINED_VARIANT_RULE_TYPE",
      },
    ],
    variantId: "variantId_example",
  },
};

apiInstance.reportsServiceRunVariantOperation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunVariantOperationRequest** | **Reportsv3RunVariantOperationRequest**|  |


### Return type

**Reportsv3RunVariantOperationResponse**

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

# **reportsServiceTranspose**
> Reportsv3RunReportResponse reportsServiceTranspose(reportsv3TransposeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceTransposeRequest = {
  // Reportsv3TransposeRequest
  reportsv3TransposeRequest: {
    constructIds: [
      "constructIds_example",
    ],
    contributionIndicators: "contributionIndicators_example",
    contributionPointers: [
      {
        column: "column_example",
        operator: "operator_example",
        value: "value_example",
      },
    ],
    limit: "limit_example",
    offset: "offset_example",
    summary: true,
  },
};

apiInstance.reportsServiceTranspose(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3TransposeRequest** | **Reportsv3TransposeRequest**|  |


### Return type

**Reportsv3RunReportResponse**

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

# **reportsServiceUpdateChart**
> Reportsv3UpdateChartResponse reportsServiceUpdateChart(reportsv3UpdateChartRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateChartRequest = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3UpdateChartRequest
  reportsv3UpdateChartRequest: {
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
  },
};

apiInstance.reportsServiceUpdateChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateChartRequest** | **Reportsv3UpdateChartRequest**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3UpdateChartResponse**

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

# **reportsServiceUpdateChartv2**
> Reportsv3UpdateChartv2Response reportsServiceUpdateChartv2(reportsv3UpdateChartv2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateChartv2Request = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3UpdateChartv2Request
  reportsv3UpdateChartv2Request: {
    chartId: "chartId_example",
    chartSettingsV2: {
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
    primaryCategory: 1,
    primaryMeasure: 1,
    secondaryCategory: 1,
    secondaryMeasure: 1,
    tertiaryCategory: 1,
    tertiaryMeasure: 1,
    vegaDefinition: "vegaDefinition_example",
  },
};

apiInstance.reportsServiceUpdateChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateChartv2Request** | **Reportsv3UpdateChartv2Request**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3UpdateChartv2Response**

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

# **reportsServiceUpdateJoin**
> Reportsv3UpdateJoinResponse reportsServiceUpdateJoin(reportsv3UpdateJoinRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateJoinRequest = {
  // string | Unique join ID.
  joinId: "join_id_example",
  // Reportsv3UpdateJoinRequest
  reportsv3UpdateJoinRequest: {
    joinDef: {
      categoryId: "categoryId_example",
      headerPairList: [
        {
          sourceHeaderId: "sourceHeaderId_example",
          targetHeaderId: "targetHeaderId_example",
        },
      ],
      sourceTableName: "sourceTableName_example",
      targetHeadersSelectedIds: [
        "targetHeadersSelectedIds_example",
      ],
      targetTableName: "targetTableName_example",
    },
    joinId: "joinId_example",
  },
};

apiInstance.reportsServiceUpdateJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateJoinRequest** | **Reportsv3UpdateJoinRequest**|  |
 **joinId** | [**string**] | Unique join ID. | defaults to undefined


### Return type

**Reportsv3UpdateJoinResponse**

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

# **reportsServiceUpdateReport**
> Reportsv3UpdateReportResponse reportsServiceUpdateReport(reportsv3UpdateReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateReportRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
  // Reportsv3UpdateReportRequest
  reportsv3UpdateReportRequest: {
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
  },
};

apiInstance.reportsServiceUpdateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateReportRequest** | **Reportsv3UpdateReportRequest**|  |
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3UpdateReportResponse**

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

# **reportsServiceUpdateVariantOverride**
> Reportsv3UpdateVariantOverrideResponse reportsServiceUpdateVariantOverride(reportsv3UpdateVariantOverrideRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateVariantOverrideRequest = {
  // string | The variant id
  variantId: "variant_id_example",
  // Reportsv3UpdateVariantOverrideRequest
  reportsv3UpdateVariantOverrideRequest: {
    key: "key_example",
    values: {
      "key": "key_example",
    },
    variantId: "variantId_example",
  },
};

apiInstance.reportsServiceUpdateVariantOverride(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateVariantOverrideRequest** | **Reportsv3UpdateVariantOverrideRequest**|  |
 **variantId** | [**string**] | The variant id | defaults to undefined


### Return type

**Reportsv3UpdateVariantOverrideResponse**

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


