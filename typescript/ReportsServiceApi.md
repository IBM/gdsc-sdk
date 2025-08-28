# .ReportsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsServiceCreateCategory**](ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**reportsServiceCreateChart**](ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**reportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**reportsServiceCreateChartv2**](ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**reportsServiceCreateControl**](ReportsServiceApi.md#reportsServiceCreateControl) | **POST** /api/v3/compliance/controls | Summary: Create Control. Description: Create a unique Control.
[**reportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**reportsServiceCreateGrade**](ReportsServiceApi.md#reportsServiceCreateGrade) | **POST** /api/v3/compliance/grades | Summary: Create Grade. Description: Create a unique Grade.
[**reportsServiceCreateJoin**](ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**reportsServiceCreateMeasure**](ReportsServiceApi.md#reportsServiceCreateMeasure) | **POST** /api/v3/compliance/measures | Summary: Create measure. Description: Create a unique measure.
[**reportsServiceCreateMetric**](ReportsServiceApi.md#reportsServiceCreateMetric) | **POST** /api/v3/compliance/metrics | Summary: Create metric. Description: Create a unique metric.
[**reportsServiceCreateProgram**](ReportsServiceApi.md#reportsServiceCreateProgram) | **POST** /api/v3/compliance/programs | Summary: Create Program. Description: Create a unique Program.
[**reportsServiceCreateReport**](ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**reportsServiceCreateRequirement**](ReportsServiceApi.md#reportsServiceCreateRequirement) | **POST** /api/v3/compliance/requirements | Summary: Create Requirement. Description: Create a unique Requirement.
[**reportsServiceCreateVariant**](ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**reportsServiceDeleteCategory**](ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**reportsServiceDeleteChart**](ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**reportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**reportsServiceDeleteChartv2**](ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**reportsServiceDeleteControl**](ReportsServiceApi.md#reportsServiceDeleteControl) | **DELETE** /api/v3/compliance/controls/{control_id} | Summary: Delete Control Description: Delete a Control.
[**reportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**reportsServiceDeleteGrade**](ReportsServiceApi.md#reportsServiceDeleteGrade) | **DELETE** /api/v3/compliance/grades/{grade_id} | Summary: Delete Grade Description: Delete a Grade.
[**reportsServiceDeleteJoin**](ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**reportsServiceDeleteMeasure**](ReportsServiceApi.md#reportsServiceDeleteMeasure) | **DELETE** /api/v3/compliance/measures/{measure_id} | Summary: Delete measure Description: Delete a measure.
[**reportsServiceDeleteMetric**](ReportsServiceApi.md#reportsServiceDeleteMetric) | **DELETE** /api/v3/compliance/metrics/{metric_id} | Summary: Delete metric Description: Delete a metric.
[**reportsServiceDeleteProgram**](ReportsServiceApi.md#reportsServiceDeleteProgram) | **DELETE** /api/v3/compliance/programs/{program_id} | Summary: Delete Program Description: Delete a Program.
[**reportsServiceDeleteReport**](ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**reportsServiceDeleteRequirement**](ReportsServiceApi.md#reportsServiceDeleteRequirement) | **DELETE** /api/v3/compliance/requirements/{requirement_id} | Summary: Delete Requirement Description: Delete a Requirement.
[**reportsServiceDeleteVariant**](ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**reportsServiceGetCategories**](ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**reportsServiceGetChartSettings**](ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**reportsServiceGetChartSettingsv2**](ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**reportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**reportsServiceGetControls**](ReportsServiceApi.md#reportsServiceGetControls) | **GET** /api/v3/compliance/controls | Summary: Get controls Description: Get a list of controls with all data.
[**reportsServiceGetFieldsByCategories**](ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**reportsServiceGetFieldsByCategory**](ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**reportsServiceGetGrades**](ReportsServiceApi.md#reportsServiceGetGrades) | **GET** /api/v3/compliance/grades | Summary: Get grades Description: Get a list of grades with all data.
[**reportsServiceGetJoins**](ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**reportsServiceGetMeasures**](ReportsServiceApi.md#reportsServiceGetMeasures) | **GET** /api/v3/compliance/measures | Summary: Get measures Description: Get a list of measures with all data.
[**reportsServiceGetMetrics**](ReportsServiceApi.md#reportsServiceGetMetrics) | **GET** /api/v3/compliance/metrics | Summary: Get metrics Description: Get a list of metrics with all data.
[**reportsServiceGetPrograms**](ReportsServiceApi.md#reportsServiceGetPrograms) | **GET** /api/v3/compliance/programs | Summary: Get controls Description: Get a list of controls with all data.
[**reportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**reportsServiceGetQueryByReportID**](ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**reportsServiceGetReportDefinition**](ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**reportsServiceGetReportGroups**](ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**reportsServiceGetReportSynopsis**](ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**reportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**reportsServiceGetReports**](ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**reportsServiceGetReportsForJoin**](ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**reportsServiceGetReportsTags**](ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**reportsServiceGetRequirements**](ReportsServiceApi.md#reportsServiceGetRequirements) | **GET** /api/v3/compliance/requirements | Summary: Get requirements Description: Get a list of requirements with all data.
[**reportsServiceGetVariant**](ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**reportsServiceGetVariants**](ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**reportsServicePartialChartUpdate**](ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**reportsServicePartialReportUpdate**](ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**reportsServiceRunGrades**](ReportsServiceApi.md#reportsServiceRunGrades) | **POST** /api/v3/compliance/grades/run | Summary: Refresh metrics via grades. Description: Refresh metrics via grades.
[**reportsServiceRunVariantOperation**](ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**reportsServiceTranspose**](ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**reportsServiceUpdateChart**](ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**reportsServiceUpdateChartv2**](ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**reportsServiceUpdateControl**](ReportsServiceApi.md#reportsServiceUpdateControl) | **PUT** /api/v3/compliance/controls/{control_id} | Summary: Update Control. Description: Update a Control.
[**reportsServiceUpdateGrade**](ReportsServiceApi.md#reportsServiceUpdateGrade) | **PUT** /api/v3/compliance/grades/{grade_id} | Summary: Update Grade. Description: Update a Grade.
[**reportsServiceUpdateJoin**](ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**reportsServiceUpdateMeasure**](ReportsServiceApi.md#reportsServiceUpdateMeasure) | **PUT** /api/v3/compliance/measures/{measure_id} | Summary: Update measure. Description: Update a measure.
[**reportsServiceUpdateMetric**](ReportsServiceApi.md#reportsServiceUpdateMetric) | **PUT** /api/v3/compliance/metrics/{metric_id} | Summary: Update metric. Description: Update a metric.
[**reportsServiceUpdateProgram**](ReportsServiceApi.md#reportsServiceUpdateProgram) | **PUT** /api/v3/compliance/programs/{program_id} | Summary: Update Program. Description: Update a Program.
[**reportsServiceUpdateReport**](ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**reportsServiceUpdateRequirement**](ReportsServiceApi.md#reportsServiceUpdateRequirement) | **PUT** /api/v3/compliance/requirements/{requirement_id} | Summary: Update Requirement. Description: Update a Requirement.
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

# **reportsServiceCreateControl**
> Reportsv3CreateControlResponse reportsServiceCreateControl(reportsv3CreateControlRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateControlRequest = {
  // Reportsv3CreateControlRequest
  reportsv3CreateControlRequest: {
    control: {
      artifacts: [
        {
          artifactId: "artifactId_example",
          createUserId: "createUserId_example",
          createUserName: "createUserName_example",
          dateCreated: new Date('1970-01-01T00:00:00.00Z'),
          dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
          description: "description_example",
          type: "ARTIFACT_UNKNOWN",
          updateUserId: "updateUserId_example",
          updateUserName: "updateUserName_example",
        },
      ],
      controlCode: "controlCode_example",
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      createdByTemplate: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      programId: 1,
      tags: [
        "tags_example",
      ],
      templateId: "templateId_example",
      theme: "theme_example",
      title: "title_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
  },
};

apiInstance.reportsServiceCreateControl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateControlRequest** | **Reportsv3CreateControlRequest**|  |


### Return type

**Reportsv3CreateControlResponse**

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

# **reportsServiceCreateGrade**
> Reportsv3CreateGradeResponse reportsServiceCreateGrade(reportsv3CreateGradeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateGradeRequest = {
  // Reportsv3CreateGradeRequest
  reportsv3CreateGradeRequest: {
    grade: {
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      defaultScore: 1,
      defaultScoreName: "defaultScoreName_example",
      description: "description_example",
      gradeId: 1,
      gradeThreshold: [
        {
          thresholdScore: 1,
          thresholdScoreName: "thresholdScoreName_example",
          thresholdValue: 3.14,
        },
      ],
      isPercentage: true,
      metricId: 1,
      name: "name_example",
      recommendation: "recommendation_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
  },
};

apiInstance.reportsServiceCreateGrade(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateGradeRequest** | **Reportsv3CreateGradeRequest**|  |


### Return type

**Reportsv3CreateGradeResponse**

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

# **reportsServiceCreateMeasure**
> Reportsv3CreateMeasureResponse reportsServiceCreateMeasure(reportsv3CreateMeasureRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateMeasureRequest = {
  // Reportsv3CreateMeasureRequest
  reportsv3CreateMeasureRequest: {
    measure: {
      column: {
        aggregationType: "UNDEFINED_AGG_TYPE",
        headerId: "headerId_example",
      },
      measureId: 1,
      reportId: "reportId_example",
    },
  },
};

apiInstance.reportsServiceCreateMeasure(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateMeasureRequest** | **Reportsv3CreateMeasureRequest**|  |


### Return type

**Reportsv3CreateMeasureResponse**

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

# **reportsServiceCreateMetric**
> Reportsv3CreateMetricResponse reportsServiceCreateMetric(reportsv3CreateMetricRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateMetricRequest = {
  // Reportsv3CreateMetricRequest
  reportsv3CreateMetricRequest: {
    metric: {
      column: {
        aggregationType: "UNDEFINED_AGG_TYPE",
        headerId: "headerId_example",
      },
      measureId: 1,
      measureType: "SNAPSHOT",
      metricId: 1,
      metricType: "PERCENTAGE",
      reportId: "reportId_example",
    },
  },
};

apiInstance.reportsServiceCreateMetric(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateMetricRequest** | **Reportsv3CreateMetricRequest**|  |


### Return type

**Reportsv3CreateMetricResponse**

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

# **reportsServiceCreateProgram**
> Reportsv3CreateProgramResponse reportsServiceCreateProgram(reportsv3CreateProgramRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateProgramRequest = {
  // Reportsv3CreateProgramRequest
  reportsv3CreateProgramRequest: {
    program: {
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      programDescription: "programDescription_example",
      programId: 1,
      programTitle: "programTitle_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
  },
};

apiInstance.reportsServiceCreateProgram(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateProgramRequest** | **Reportsv3CreateProgramRequest**|  |


### Return type

**Reportsv3CreateProgramResponse**

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
              groupTypeId: 1,
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
              isTuple: true,
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              tupleType: "tupleType_example",
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

# **reportsServiceCreateRequirement**
> Reportsv3CreateRequirementResponse reportsServiceCreateRequirement(reportsv3CreateRequirementRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateRequirementRequest = {
  // Reportsv3CreateRequirementRequest
  reportsv3CreateRequirementRequest: {
    requirement: {
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      link: "link_example",
      regulation: "regulation_example",
      requirementCode: "requirementCode_example",
      requirementDescription: "requirementDescription_example",
      requirementId: 1,
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
  },
};

apiInstance.reportsServiceCreateRequirement(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateRequirementRequest** | **Reportsv3CreateRequirementRequest**|  |


### Return type

**Reportsv3CreateRequirementResponse**

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

# **reportsServiceDeleteControl**
> Reportsv3DeleteControlResponse reportsServiceDeleteControl(reportsv3DeleteControlRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteControlRequest = {
  // number | The ID of the control to delete
  controlId: 1,
  // Reportsv3DeleteControlRequest
  reportsv3DeleteControlRequest: {
    controlId: 1,
  },
};

apiInstance.reportsServiceDeleteControl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteControlRequest** | **Reportsv3DeleteControlRequest**|  |
 **controlId** | [**number**] | The ID of the control to delete | defaults to undefined


### Return type

**Reportsv3DeleteControlResponse**

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

# **reportsServiceDeleteGrade**
> Reportsv3DeleteGradeResponse reportsServiceDeleteGrade(reportsv3DeleteGradeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteGradeRequest = {
  // number | The id of the grade to be deleted.
  gradeId: 1,
  // Reportsv3DeleteGradeRequest
  reportsv3DeleteGradeRequest: {
    gradeId: 1,
  },
};

apiInstance.reportsServiceDeleteGrade(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteGradeRequest** | **Reportsv3DeleteGradeRequest**|  |
 **gradeId** | [**number**] | The id of the grade to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteGradeResponse**

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

# **reportsServiceDeleteMeasure**
> Reportsv3DeleteMeasureResponse reportsServiceDeleteMeasure(reportsv3DeleteMeasureRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteMeasureRequest = {
  // number | The id of the measure to be deleted.
  measureId: 1,
  // Reportsv3DeleteMeasureRequest
  reportsv3DeleteMeasureRequest: {
    measureId: 1,
  },
};

apiInstance.reportsServiceDeleteMeasure(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteMeasureRequest** | **Reportsv3DeleteMeasureRequest**|  |
 **measureId** | [**number**] | The id of the measure to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteMeasureResponse**

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

# **reportsServiceDeleteMetric**
> Reportsv3DeleteMetricResponse reportsServiceDeleteMetric(reportsv3DeleteMetricRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteMetricRequest = {
  // number | The id of the metric to be deleted.
  metricId: 1,
  // Reportsv3DeleteMetricRequest
  reportsv3DeleteMetricRequest: {
    metricId: 1,
  },
};

apiInstance.reportsServiceDeleteMetric(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteMetricRequest** | **Reportsv3DeleteMetricRequest**|  |
 **metricId** | [**number**] | The id of the metric to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteMetricResponse**

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

# **reportsServiceDeleteProgram**
> Reportsv3DeleteProgramResponse reportsServiceDeleteProgram(reportsv3DeleteProgramRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteProgramRequest = {
  // number | The ID of the program to delete
  programId: 1,
  // Reportsv3DeleteProgramRequest
  reportsv3DeleteProgramRequest: {
    programId: 1,
  },
};

apiInstance.reportsServiceDeleteProgram(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteProgramRequest** | **Reportsv3DeleteProgramRequest**|  |
 **programId** | [**number**] | The ID of the program to delete | defaults to undefined


### Return type

**Reportsv3DeleteProgramResponse**

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

# **reportsServiceDeleteRequirement**
> Reportsv3DeleteRequirementResponse reportsServiceDeleteRequirement(reportsv3DeleteRequirementRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteRequirementRequest = {
  // number | The requirement to delete\'s ID
  requirementId: 1,
  // Reportsv3DeleteRequirementRequest
  reportsv3DeleteRequirementRequest: {
    requirementId: 1,
  },
};

apiInstance.reportsServiceDeleteRequirement(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3DeleteRequirementRequest** | **Reportsv3DeleteRequirementRequest**|  |
 **requirementId** | [**number**] | The requirement to delete\&#39;s ID | defaults to undefined


### Return type

**Reportsv3DeleteRequirementResponse**

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

# **reportsServiceGetControls**
> Reportsv3GetControlsResponse reportsServiceGetControls()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetControls(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetControlsResponse**

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

# **reportsServiceGetGrades**
> Reportsv3GetGradesResponse reportsServiceGetGrades()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetGrades(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetGradesResponse**

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

# **reportsServiceGetMeasures**
> Reportsv3GetMeasuresResponse reportsServiceGetMeasures()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetMeasures(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetMeasuresResponse**

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

# **reportsServiceGetMetrics**
> Reportsv3GetMetricsResponse reportsServiceGetMetrics()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetMetrics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetMetricsResponse**

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

# **reportsServiceGetPrograms**
> Reportsv3GetProgramsResponse reportsServiceGetPrograms()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetPrograms(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetProgramsResponse**

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
              groupTypeId: 1,
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
              isTuple: true,
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              tupleType: "tupleType_example",
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

# **reportsServiceGetRequirements**
> Reportsv3GetRequirementsResponse reportsServiceGetRequirements()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetRequirements(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetRequirementsResponse**

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

# **reportsServiceRunGrades**
> Reportsv3RunGradesResponse reportsServiceRunGrades(reportsv3RunGradesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceRunGradesRequest = {
  // Reportsv3RunGradesRequest
  reportsv3RunGradesRequest: {
    fromDate: "fromDate_example",
    gradeId: 1,
    toDate: "toDate_example",
  },
};

apiInstance.reportsServiceRunGrades(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunGradesRequest** | **Reportsv3RunGradesRequest**|  |


### Return type

**Reportsv3RunGradesResponse**

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

# **reportsServiceUpdateControl**
> Reportsv3UpdateControlResponse reportsServiceUpdateControl(reportsv3UpdateControlRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateControlRequest = {
  // number | The id of the control that was updated.
  controlId: 1,
  // Reportsv3UpdateControlRequest
  reportsv3UpdateControlRequest: {
    control: {
      artifacts: [
        {
          artifactId: "artifactId_example",
          createUserId: "createUserId_example",
          createUserName: "createUserName_example",
          dateCreated: new Date('1970-01-01T00:00:00.00Z'),
          dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
          description: "description_example",
          type: "ARTIFACT_UNKNOWN",
          updateUserId: "updateUserId_example",
          updateUserName: "updateUserName_example",
        },
      ],
      controlCode: "controlCode_example",
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      createdByTemplate: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      programId: 1,
      tags: [
        "tags_example",
      ],
      templateId: "templateId_example",
      theme: "theme_example",
      title: "title_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
    controlId: 1,
  },
};

apiInstance.reportsServiceUpdateControl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateControlRequest** | **Reportsv3UpdateControlRequest**|  |
 **controlId** | [**number**] | The id of the control that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateControlResponse**

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

# **reportsServiceUpdateGrade**
> Reportsv3UpdateGradeResponse reportsServiceUpdateGrade(reportsv3UpdateGradeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateGradeRequest = {
  // number | The id of the grade that was updated.
  gradeId: 1,
  // Reportsv3UpdateGradeRequest
  reportsv3UpdateGradeRequest: {
    grade: {
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      defaultScore: 1,
      defaultScoreName: "defaultScoreName_example",
      description: "description_example",
      gradeId: 1,
      gradeThreshold: [
        {
          thresholdScore: 1,
          thresholdScoreName: "thresholdScoreName_example",
          thresholdValue: 3.14,
        },
      ],
      isPercentage: true,
      metricId: 1,
      name: "name_example",
      recommendation: "recommendation_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
    gradeId: 1,
  },
};

apiInstance.reportsServiceUpdateGrade(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateGradeRequest** | **Reportsv3UpdateGradeRequest**|  |
 **gradeId** | [**number**] | The id of the grade that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateGradeResponse**

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

# **reportsServiceUpdateMeasure**
> Reportsv3UpdateMeasureResponse reportsServiceUpdateMeasure(reportsv3UpdateMeasureRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateMeasureRequest = {
  // number | The id of the measure that was updated.
  measureId: 1,
  // Reportsv3UpdateMeasureRequest
  reportsv3UpdateMeasureRequest: {
    measure: {
      column: {
        aggregationType: "UNDEFINED_AGG_TYPE",
        headerId: "headerId_example",
      },
      measureId: 1,
      reportId: "reportId_example",
    },
    measureId: 1,
  },
};

apiInstance.reportsServiceUpdateMeasure(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateMeasureRequest** | **Reportsv3UpdateMeasureRequest**|  |
 **measureId** | [**number**] | The id of the measure that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateMeasureResponse**

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

# **reportsServiceUpdateMetric**
> Reportsv3UpdateMetricResponse reportsServiceUpdateMetric(reportsv3UpdateMetricRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateMetricRequest = {
  // number | The id of the metric that was updated.
  metricId: 1,
  // Reportsv3UpdateMetricRequest
  reportsv3UpdateMetricRequest: {
    metric: {
      column: {
        aggregationType: "UNDEFINED_AGG_TYPE",
        headerId: "headerId_example",
      },
      measureId: 1,
      measureType: "SNAPSHOT",
      metricId: 1,
      metricType: "PERCENTAGE",
      reportId: "reportId_example",
    },
    metricId: 1,
  },
};

apiInstance.reportsServiceUpdateMetric(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateMetricRequest** | **Reportsv3UpdateMetricRequest**|  |
 **metricId** | [**number**] | The id of the metric that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateMetricResponse**

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

# **reportsServiceUpdateProgram**
> Reportsv3UpdateProgramResponse reportsServiceUpdateProgram(reportsv3UpdateProgramRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateProgramRequest = {
  // number | The id of the programs that was updated.
  programId: 1,
  // Reportsv3UpdateProgramRequest
  reportsv3UpdateProgramRequest: {
    program: {
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      programDescription: "programDescription_example",
      programId: 1,
      programTitle: "programTitle_example",
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
    programId: 1,
  },
};

apiInstance.reportsServiceUpdateProgram(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateProgramRequest** | **Reportsv3UpdateProgramRequest**|  |
 **programId** | [**number**] | The id of the programs that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateProgramResponse**

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
              groupTypeId: 1,
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
              isTuple: true,
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              tupleType: "tupleType_example",
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

# **reportsServiceUpdateRequirement**
> Reportsv3UpdateRequirementResponse reportsServiceUpdateRequirement(reportsv3UpdateRequirementRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateRequirementRequest = {
  // number | The id of the requirements that was updated.
  requirementId: 1,
  // Reportsv3UpdateRequirementRequest
  reportsv3UpdateRequirementRequest: {
    requirement: {
      controlId: 1,
      createUserId: "createUserId_example",
      createUserName: "createUserName_example",
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateUpdated: new Date('1970-01-01T00:00:00.00Z'),
      link: "link_example",
      regulation: "regulation_example",
      requirementCode: "requirementCode_example",
      requirementDescription: "requirementDescription_example",
      requirementId: 1,
      updateUserId: "updateUserId_example",
      updateUserName: "updateUserName_example",
    },
    requirementId: 1,
  },
};

apiInstance.reportsServiceUpdateRequirement(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateRequirementRequest** | **Reportsv3UpdateRequirementRequest**|  |
 **requirementId** | [**number**] | The id of the requirements that was updated. | defaults to undefined


### Return type

**Reportsv3UpdateRequirementResponse**

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


