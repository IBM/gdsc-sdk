# ReportsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsServiceCreateCategory**](ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category
Description: Create a report category
[**reportsServiceCreateChart**](ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart
Description: Create custom chart based on provided properties.
[**reportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2
Description: Create custom VEGA chart template.
[**reportsServiceCreateChartv2**](ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2
Description: Create custom VEGA chart based on provided properties.
[**reportsServiceCreateControl**](ReportsServiceApi.md#reportsServiceCreateControl) | **POST** /api/v3/compliance/controls | Summary: Create Control.
Description: Create a unique Control.
[**reportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category
Description: Cteate category fields based on provided properties.
[**reportsServiceCreateGrade**](ReportsServiceApi.md#reportsServiceCreateGrade) | **POST** /api/v3/compliance/grades | Summary: Create Grade.
Description: Create a unique Grade.
[**reportsServiceCreateJoin**](ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join
Description: Create a custom report join
[**reportsServiceCreateMeasure**](ReportsServiceApi.md#reportsServiceCreateMeasure) | **POST** /api/v3/compliance/measures | Summary: Create measure.
Description: Create a unique measure.
[**reportsServiceCreateMetric**](ReportsServiceApi.md#reportsServiceCreateMetric) | **POST** /api/v3/compliance/metrics | Summary: Create metric.
Description: Create a unique metric.
[**reportsServiceCreateProgram**](ReportsServiceApi.md#reportsServiceCreateProgram) | **POST** /api/v3/compliance/programs | Summary: Create Program.
Description: Create a unique Program.
[**reportsServiceCreateReport**](ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report
Description: Create custom report based on provided properties.
[**reportsServiceCreateRequirement**](ReportsServiceApi.md#reportsServiceCreateRequirement) | **POST** /api/v3/compliance/requirements | Summary: Create Requirement.
Description: Create a unique Requirement.
[**reportsServiceCreateVariant**](ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant
Description: Create a variant for reports
[**reportsServiceDeleteCategory**](ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category
Description: Delete a report category
[**reportsServiceDeleteChart**](ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart
Description: Delete a custom chart.
[**reportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2
Description: Delete a custom VEGA chart template.
[**reportsServiceDeleteChartv2**](ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2
Description: Delete a custom VEGA chart.
[**reportsServiceDeleteControl**](ReportsServiceApi.md#reportsServiceDeleteControl) | **DELETE** /api/v3/compliance/controls/{control_id} | Summary: Delete Control
Description: Delete a Control.
[**reportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category
Description: Delete category fields based on provided properties.
[**reportsServiceDeleteGrade**](ReportsServiceApi.md#reportsServiceDeleteGrade) | **DELETE** /api/v3/compliance/grades/{grade_id} | Summary: Delete Grade
Description: Delete a Grade.
[**reportsServiceDeleteJoin**](ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join
Description: Delete a custom join
[**reportsServiceDeleteMeasure**](ReportsServiceApi.md#reportsServiceDeleteMeasure) | **DELETE** /api/v3/compliance/measures/{measure_id} | Summary: Delete measure
Description: Delete a measure.
[**reportsServiceDeleteMetric**](ReportsServiceApi.md#reportsServiceDeleteMetric) | **DELETE** /api/v3/compliance/metrics/{metric_id} | Summary: Delete metric
Description: Delete a metric.
[**reportsServiceDeleteProgram**](ReportsServiceApi.md#reportsServiceDeleteProgram) | **DELETE** /api/v3/compliance/programs/{program_id} | Summary: Delete Program
Description: Delete a Program.
[**reportsServiceDeleteReport**](ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report
Description: Delete a custom report.
[**reportsServiceDeleteRequirement**](ReportsServiceApi.md#reportsServiceDeleteRequirement) | **DELETE** /api/v3/compliance/requirements/{requirement_id} | Summary: Delete Requirement
Description: Delete a Requirement.
[**reportsServiceDeleteVariant**](ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant
Description: Delete a variant
[**reportsServiceGetCategories**](ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories.
Description: Get all category related fields or all possible fields.
[**reportsServiceGetChartSettings**](ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings
Description: Get a custom chart based on provided report id.
[**reportsServiceGetChartSettingsv2**](ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2
Description: Get a custom VEGA chart based on provided report id.
[**reportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2
Description: Get all custom VEGA chart templates.
[**reportsServiceGetControls**](ReportsServiceApi.md#reportsServiceGetControls) | **GET** /api/v3/compliance/controls | Summary: Get controls
Description: Get a list of controls with all data.
[**reportsServiceGetFieldsByCategories**](ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories
Description: Get all category related fields or all possible fields based on a list of categories.
[**reportsServiceGetFieldsByCategory**](ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category
Description: Get all category related fields or all possible fields.
[**reportsServiceGetGrades**](ReportsServiceApi.md#reportsServiceGetGrades) | **GET** /api/v3/compliance/grades | Summary: Get grades
Description: Get a list of grades with all data.
[**reportsServiceGetJoins**](ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins
Description: Get all custom joins.
[**reportsServiceGetMeasures**](ReportsServiceApi.md#reportsServiceGetMeasures) | **GET** /api/v3/compliance/measures | Summary: Get measures
Description: Get a list of measures with all data.
[**reportsServiceGetMetrics**](ReportsServiceApi.md#reportsServiceGetMetrics) | **GET** /api/v3/compliance/metrics | Summary: Get metrics
Description: Get a list of metrics with all data.
[**reportsServiceGetPrograms**](ReportsServiceApi.md#reportsServiceGetPrograms) | **GET** /api/v3/compliance/programs | Summary: Get controls
Description: Get a list of controls with all data.
[**reportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition
Description: Get query by report definition.
[**reportsServiceGetQueryByReportID**](ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID
Description: Get query by report ID.
[**reportsServiceGetReportDefinition**](ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition
Description: Get report definition.
[**reportsServiceGetReportGroups**](ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups
Description: Get reports used by the provided groups.
[**reportsServiceGetReportSynopsis**](ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis
Description: Return BriefReport.
[**reportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header
Description: Get where to take a report timestamp given an entity.
[**reportsServiceGetReports**](ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports
Description: Get reports list.
[**reportsServiceGetReportsForJoin**](ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join
Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**reportsServiceGetReportsTags**](ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags
Description: Get all report distinct tags.
[**reportsServiceGetRequirements**](ReportsServiceApi.md#reportsServiceGetRequirements) | **GET** /api/v3/compliance/requirements | Summary: Get requirements
Description: Get a list of requirements with all data.
[**reportsServiceGetVariant**](ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant
Description: Get a given variant
[**reportsServiceGetVariants**](ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants
Description: Get all variants in reports
[**reportsServicePartialChartUpdate**](ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update
Description: Update a custom chart with partial information.
[**reportsServicePartialReportUpdate**](ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update
Description: Update a custom report with partial information.
[**reportsServiceRunGrades**](ReportsServiceApi.md#reportsServiceRunGrades) | **POST** /api/v3/compliance/grades/run | Summary: Refresh metrics via grades.
Description: Refresh metrics via grades.
[**reportsServiceRunVariantOperation**](ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant
Description: Run the operations in a variant
[**reportsServiceTranspose**](ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose
Description: Return the corresponding full sql data.
[**reportsServiceUpdateChart**](ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart
Description: Update a custom chart.
[**reportsServiceUpdateChartv2**](ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2
Description: Update a custom VEGA chart.
[**reportsServiceUpdateControl**](ReportsServiceApi.md#reportsServiceUpdateControl) | **PUT** /api/v3/compliance/controls/{control_id} | Summary: Update Control.
Description: Update a Control.
[**reportsServiceUpdateGrade**](ReportsServiceApi.md#reportsServiceUpdateGrade) | **PUT** /api/v3/compliance/grades/{grade_id} | Summary: Update Grade.
Description: Update a Grade.
[**reportsServiceUpdateJoin**](ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join
Description: Update a custom join
[**reportsServiceUpdateMeasure**](ReportsServiceApi.md#reportsServiceUpdateMeasure) | **PUT** /api/v3/compliance/measures/{measure_id} | Summary: Update measure.
Description: Update a measure.
[**reportsServiceUpdateMetric**](ReportsServiceApi.md#reportsServiceUpdateMetric) | **PUT** /api/v3/compliance/metrics/{metric_id} | Summary: Update metric.
Description: Update a metric.
[**reportsServiceUpdateProgram**](ReportsServiceApi.md#reportsServiceUpdateProgram) | **PUT** /api/v3/compliance/programs/{program_id} | Summary: Update Program.
Description: Update a Program.
[**reportsServiceUpdateReport**](ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report
Description: Update a custom report.
[**reportsServiceUpdateRequirement**](ReportsServiceApi.md#reportsServiceUpdateRequirement) | **PUT** /api/v3/compliance/requirements/{requirement_id} | Summary: Update Requirement.
Description: Update a Requirement.
[**reportsServiceUpdateVariantOverride**](ReportsServiceApi.md#reportsServiceUpdateVariantOverride) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant
Description: Update a variant with a custom override



## reportsServiceCreateCategory

Summary: Create a category
Description: Create a report category

### Example

```bash
 reportsServiceCreateCategory
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateCategoryRequest** | [**Reportsv3CreateCategoryRequest**](Reportsv3CreateCategoryRequest.md) |  |

### Return type

[**Reportsv3CreateCategoryResponse**](Reportsv3CreateCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateChart

Summary: Create chart
Description: Create custom chart based on provided properties.

### Example

```bash
 reportsServiceCreateChart
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartRequest** | [**Reportsv3CreateChartRequest**](Reportsv3CreateChartRequest.md) |  |

### Return type

[**Reportsv3CreateChartResponse**](Reportsv3CreateChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateChartTemplatev2

Summary: Create chart template v2
Description: Create custom VEGA chart template.

### Example

```bash
 reportsServiceCreateChartTemplatev2
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartTemplatev2Request** | [**Reportsv3CreateChartTemplatev2Request**](Reportsv3CreateChartTemplatev2Request.md) |  |

### Return type

[**Reportsv3CreateChartTemplatev2Response**](Reportsv3CreateChartTemplatev2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateChartv2

Summary: Create chart v2
Description: Create custom VEGA chart based on provided properties.

### Example

```bash
 reportsServiceCreateChartv2
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartv2Request** | [**Reportsv3CreateChartv2Request**](Reportsv3CreateChartv2Request.md) |  |

### Return type

[**Reportsv3CreateChartv2Response**](Reportsv3CreateChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateControl

Summary: Create Control.
Description: Create a unique Control.

### Example

```bash
 reportsServiceCreateControl
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateControlRequest** | [**Reportsv3CreateControlRequest**](Reportsv3CreateControlRequest.md) |  |

### Return type

[**Reportsv3CreateControlResponse**](Reportsv3CreateControlResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateFieldsByCategory

Summary - Create fields by category
Description: Cteate category fields based on provided properties.

### Example

```bash
 reportsServiceCreateFieldsByCategory
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateFieldsByCategoryRequest** | [**Reportsv3CreateFieldsByCategoryRequest**](Reportsv3CreateFieldsByCategoryRequest.md) |  |

### Return type

[**Reportsv3CreateFieldsByCategoryResponse**](Reportsv3CreateFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateGrade

Summary: Create Grade.
Description: Create a unique Grade.

### Example

```bash
 reportsServiceCreateGrade
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateGradeRequest** | [**Reportsv3CreateGradeRequest**](Reportsv3CreateGradeRequest.md) |  |

### Return type

[**Reportsv3CreateGradeResponse**](Reportsv3CreateGradeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateJoin

Summary: Create a join
Description: Create a custom report join

### Example

```bash
 reportsServiceCreateJoin
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateJoinRequest** | [**Reportsv3CreateJoinRequest**](Reportsv3CreateJoinRequest.md) |  |

### Return type

[**Reportsv3CreateJoinResponse**](Reportsv3CreateJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateMeasure

Summary: Create measure.
Description: Create a unique measure.

### Example

```bash
 reportsServiceCreateMeasure
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateMeasureRequest** | [**Reportsv3CreateMeasureRequest**](Reportsv3CreateMeasureRequest.md) |  |

### Return type

[**Reportsv3CreateMeasureResponse**](Reportsv3CreateMeasureResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateMetric

Summary: Create metric.
Description: Create a unique metric.

### Example

```bash
 reportsServiceCreateMetric
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateMetricRequest** | [**Reportsv3CreateMetricRequest**](Reportsv3CreateMetricRequest.md) |  |

### Return type

[**Reportsv3CreateMetricResponse**](Reportsv3CreateMetricResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateProgram

Summary: Create Program.
Description: Create a unique Program.

### Example

```bash
 reportsServiceCreateProgram
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateProgramRequest** | [**Reportsv3CreateProgramRequest**](Reportsv3CreateProgramRequest.md) |  |

### Return type

[**Reportsv3CreateProgramResponse**](Reportsv3CreateProgramResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateReport

Summary: Create report
Description: Create custom report based on provided properties.

### Example

```bash
 reportsServiceCreateReport
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateReportRequest** | [**Reportsv3CreateReportRequest**](Reportsv3CreateReportRequest.md) |  |

### Return type

[**Reportsv3CreateReportResponse**](Reportsv3CreateReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateRequirement

Summary: Create Requirement.
Description: Create a unique Requirement.

### Example

```bash
 reportsServiceCreateRequirement
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateRequirementRequest** | [**Reportsv3CreateRequirementRequest**](Reportsv3CreateRequirementRequest.md) |  |

### Return type

[**Reportsv3CreateRequirementResponse**](Reportsv3CreateRequirementResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceCreateVariant

Summary: Create a variant
Description: Create a variant for reports

### Example

```bash
 reportsServiceCreateVariant
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateVariantRequest** | [**Reportsv3CreateVariantRequest**](Reportsv3CreateVariantRequest.md) |  |

### Return type

[**Reportsv3CreateVariantResponse**](Reportsv3CreateVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteCategory

Summary: Delete a category
Description: Delete a report category

### Example

```bash
 reportsServiceDeleteCategory  category_id=value  table_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | category id. | [optional] [default to null]
 **tableName** | **string** | table name. | [optional] [default to null]

### Return type

[**Reportsv3DeleteCategoryResponse**](Reportsv3DeleteCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteChart

Summary: Delete chart
Description: Delete a custom chart.

### Example

```bash
 reportsServiceDeleteChart chart_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | The id of the chart to be deleted. | [default to null]

### Return type

[**Reportsv3DeleteChartResponse**](Reportsv3DeleteChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteChartTemplatev2

Summary: Delete chart template v2
Description: Delete a custom VEGA chart template.

### Example

```bash
 reportsServiceDeleteChartTemplatev2 template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | Unique template ID. | [default to null]

### Return type

[**Reportsv3DeleteChartTemplatev2Response**](Reportsv3DeleteChartTemplatev2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteChartv2

Summary: Delete chart v2
Description: Delete a custom VEGA chart.

### Example

```bash
 reportsServiceDeleteChartv2 chart_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | The ID of the chart for deletion. | [default to null]

### Return type

[**Reportsv3DeleteChartv2Response**](Reportsv3DeleteChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteControl

Summary: Delete Control
Description: Delete a Control.

### Example

```bash
 reportsServiceDeleteControl control_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controlId** | **integer** | The ID of the control to delete | [default to null]
 **reportsv3DeleteControlRequest** | [**Reportsv3DeleteControlRequest**](Reportsv3DeleteControlRequest.md) |  |

### Return type

[**Reportsv3DeleteControlResponse**](Reportsv3DeleteControlResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteFieldsByCategory

Summary - Delete fields by category
Description: Delete category fields based on provided properties.

### Example

```bash
 reportsServiceDeleteFieldsByCategory  Specify as:  header_ids=value1 header_ids=value2 header_ids=...  table_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerIds** | [**array[string]**](string.md) | Header ids. | [optional] [default to null]
 **tableName** | **string** | table name. | [optional] [default to null]

### Return type

[**Reportsv3DeleteFieldsByCategoryResponse**](Reportsv3DeleteFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteGrade

Summary: Delete Grade
Description: Delete a Grade.

### Example

```bash
 reportsServiceDeleteGrade grade_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradeId** | **integer** | The id of the grade to be deleted. | [default to null]
 **reportsv3DeleteGradeRequest** | [**Reportsv3DeleteGradeRequest**](Reportsv3DeleteGradeRequest.md) |  |

### Return type

[**Reportsv3DeleteGradeResponse**](Reportsv3DeleteGradeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteJoin

Summary: Delete a join
Description: Delete a custom join

### Example

```bash
 reportsServiceDeleteJoin join_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | **string** | The id of the join to be deleted. | [default to null]

### Return type

[**Reportsv3DeleteJoinResponse**](Reportsv3DeleteJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteMeasure

Summary: Delete measure
Description: Delete a measure.

### Example

```bash
 reportsServiceDeleteMeasure measure_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measureId** | **integer** | The id of the measure to be deleted. | [default to null]
 **reportsv3DeleteMeasureRequest** | [**Reportsv3DeleteMeasureRequest**](Reportsv3DeleteMeasureRequest.md) |  |

### Return type

[**Reportsv3DeleteMeasureResponse**](Reportsv3DeleteMeasureResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteMetric

Summary: Delete metric
Description: Delete a metric.

### Example

```bash
 reportsServiceDeleteMetric metric_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricId** | **integer** | The id of the metric to be deleted. | [default to null]
 **reportsv3DeleteMetricRequest** | [**Reportsv3DeleteMetricRequest**](Reportsv3DeleteMetricRequest.md) |  |

### Return type

[**Reportsv3DeleteMetricResponse**](Reportsv3DeleteMetricResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteProgram

Summary: Delete Program
Description: Delete a Program.

### Example

```bash
 reportsServiceDeleteProgram program_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **integer** | The ID of the program to delete | [default to null]
 **reportsv3DeleteProgramRequest** | [**Reportsv3DeleteProgramRequest**](Reportsv3DeleteProgramRequest.md) |  |

### Return type

[**Reportsv3DeleteProgramResponse**](Reportsv3DeleteProgramResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteReport

Summary: Delete report
Description: Delete a custom report.

### Example

```bash
 reportsServiceDeleteReport report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | The id of the Report to be deleted. | [default to null]

### Return type

[**Reportsv3DeleteReportResponse**](Reportsv3DeleteReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteRequirement

Summary: Delete Requirement
Description: Delete a Requirement.

### Example

```bash
 reportsServiceDeleteRequirement requirement_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requirementId** | **integer** | The requirement to delete's ID | [default to null]
 **reportsv3DeleteRequirementRequest** | [**Reportsv3DeleteRequirementRequest**](Reportsv3DeleteRequirementRequest.md) |  |

### Return type

[**Reportsv3DeleteRequirementResponse**](Reportsv3DeleteRequirementResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceDeleteVariant

Summary: Delete a variant
Description: Delete a variant

### Example

```bash
 reportsServiceDeleteVariant variant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | **string** | The id of the variant to delete | [default to null]

### Return type

[**Reportsv3DeleteVariantResponse**](Reportsv3DeleteVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetCategories

Summary:  Get all available report categories.
Description: Get all category related fields or all possible fields.

### Example

```bash
 reportsServiceGetCategories  report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Report ID. | [optional] [default to null]

### Return type

[**Reportsv3GetCategoriesResponse**](Reportsv3GetCategoriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetChartSettings

Summary: Get chart settings
Description: Get a custom chart based on provided report id.

### Example

```bash
 reportsServiceGetChartSettings  chart_id=value  report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique Chart ID. | [optional] [default to null]
 **reportId** | **string** | Unique Report ID. | [optional] [default to null]

### Return type

[**Reportsv3GetChartSettingsResponse**](Reportsv3GetChartSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetChartSettingsv2

Summary: Get chart settings v2
Description: Get a custom VEGA chart based on provided report id.

### Example

```bash
 reportsServiceGetChartSettingsv2  chart_id=value  report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique Chart ID. | [optional] [default to null]
 **reportId** | **string** | Unique Report ID. | [optional] [default to null]

### Return type

[**Reportsv3GetChartSettingsv2Response**](Reportsv3GetChartSettingsv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetChartTemplatesv2

Summary: Get chart template v2
Description: Get all custom VEGA chart templates.

### Example

```bash
 reportsServiceGetChartTemplatesv2
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetChartTemplatesv2Response**](Reportsv3GetChartTemplatesv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetControls

Summary: Get controls
Description: Get a list of controls with all data.

### Example

```bash
 reportsServiceGetControls
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetControlsResponse**](Reportsv3GetControlsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetFieldsByCategories

Summary: Get fields by categories
Description: Get all category related fields or all possible fields based on a list of categories.

### Example

```bash
 reportsServiceGetFieldsByCategories  Specify as:  category_ids=value1 category_ids=value2 category_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | [**array[string]**](string.md) | Category IDs. | [optional] [default to null]

### Return type

[**Reportsv3GetFieldsByCategoriesResponse**](Reportsv3GetFieldsByCategoriesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetFieldsByCategory

Summary: Get fields by category
Description: Get all category related fields or all possible fields.

### Example

```bash
 reportsServiceGetFieldsByCategory  category_id=value  report_id=value  table_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID. | [optional] [default to null]
 **reportId** | **string** | Report ID. | [optional] [default to null]
 **tableName** | **string** | optional table name parameter. | [optional] [default to null]

### Return type

[**Reportsv3GetFieldsByCategoryResponse**](Reportsv3GetFieldsByCategoryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetGrades

Summary: Get grades
Description: Get a list of grades with all data.

### Example

```bash
 reportsServiceGetGrades
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetGradesResponse**](Reportsv3GetGradesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetJoins

Summary: Get all joins
Description: Get all custom joins.

### Example

```bash
 reportsServiceGetJoins  category_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID (Optional). | [optional] [default to null]

### Return type

[**Reportsv3GetJoinsResponse**](Reportsv3GetJoinsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetMeasures

Summary: Get measures
Description: Get a list of measures with all data.

### Example

```bash
 reportsServiceGetMeasures
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetMeasuresResponse**](Reportsv3GetMeasuresResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetMetrics

Summary: Get metrics
Description: Get a list of metrics with all data.

### Example

```bash
 reportsServiceGetMetrics
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetMetricsResponse**](Reportsv3GetMetricsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetPrograms

Summary: Get controls
Description: Get a list of controls with all data.

### Example

```bash
 reportsServiceGetPrograms
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetProgramsResponse**](Reportsv3GetProgramsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetQueryByReportDefinition

Summary: Get query by report definition
Description: Get query by report definition.

### Example

```bash
 reportsServiceGetQueryByReportDefinition
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportDefinitionRequest** | [**Reportsv3GetQueryByReportDefinitionRequest**](Reportsv3GetQueryByReportDefinitionRequest.md) |  |

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetQueryByReportID

Summary: Get query by report ID
Description: Get query by report ID.

### Example

```bash
 reportsServiceGetQueryByReportID
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportIDRequest** | [**Reportsv3GetQueryByReportIDRequest**](Reportsv3GetQueryByReportIDRequest.md) |  |

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportDefinition

Summary: Get report definition
Description: Get report definition.

### Example

```bash
 reportsServiceGetReportDefinition report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Unique Report ID. | [default to null]

### Return type

[**Reportsv3GetReportDefinitionResponse**](Reportsv3GetReportDefinitionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportGroups

Summary: Get report groups
Description: Get reports used by the provided groups.

### Example

```bash
 reportsServiceGetReportGroups  Specify as:  groups=value1 groups=value2 groups=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | [**array[string]**](string.md) | List of group IDs that should be checked for usage in each report. | [optional] [default to null]

### Return type

[**Reportsv3GetReportGroupsResponse**](Reportsv3GetReportGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportSynopsis

Summary: Get report synopsis
Description: Return BriefReport.

### Example

```bash
 reportsServiceGetReportSynopsis report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Unique Report ID. | [default to null]

### Return type

[**Reportsv3GetReportSynopsisResponse**](Reportsv3GetReportSynopsisResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportTimestampHeader

Summary: Get report timestamp header
Description: Get where to take a report timestamp given an entity.

### Example

```bash
 reportsServiceGetReportTimestampHeader  category_id=value  Specify as:  table_names=value1 table_names=value2 table_names=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Category ID parameter. | [optional] [default to null]
 **tableNames** | [**array[string]**](string.md) | List of all header tables. | [optional] [default to null]

### Return type

[**Reportsv3GetReportTimestampHeaderResponse**](Reportsv3GetReportTimestampHeaderResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReports

Summary: Get reports
Description: Get reports list.

### Example

```bash
 reportsServiceGetReports  category_id=value  table_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **string** | Optional Category ID parameter. | [optional] [default to null]
 **tableName** | **string** | Optional table name parameter. | [optional] [default to null]

### Return type

[**Reportsv3GetReportsResponse**](Reportsv3GetReportsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportsForJoin

Summary: Get the reports that use a join
Description: Get the reports that use a join and the headers that are imported by the reports using the join

### Example

```bash
 reportsServiceGetReportsForJoin join_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | **string** |  | [default to null]

### Return type

[**Reportsv3GetReportsForJoinResponse**](Reportsv3GetReportsForJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetReportsTags

Summary: Get reports tags
Description: Get all report distinct tags.

### Example

```bash
 reportsServiceGetReportsTags
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetReportsTagsResponse**](Reportsv3GetReportsTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetRequirements

Summary: Get requirements
Description: Get a list of requirements with all data.

### Example

```bash
 reportsServiceGetRequirements
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetRequirementsResponse**](Reportsv3GetRequirementsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetVariant

Summary: Get a variant
Description: Get a given variant

### Example

```bash
 reportsServiceGetVariant variant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | **string** | The variant id | [default to null]

### Return type

[**Reportsv3GetVariantResponse**](Reportsv3GetVariantResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceGetVariants

Summary: Get all variants
Description: Get all variants in reports

### Example

```bash
 reportsServiceGetVariants
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetVariantsResponse**](Reportsv3GetVariantsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServicePartialChartUpdate

Summary: Partial chart update
Description: Update a custom chart with partial information.

### Example

```bash
 reportsServicePartialChartUpdate chart_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique chart ID. | [default to null]
 **reportsv3PartialChartUpdateRequest** | [**Reportsv3PartialChartUpdateRequest**](Reportsv3PartialChartUpdateRequest.md) |  |

### Return type

[**Reportsv3PartialChartUpdateResponse**](Reportsv3PartialChartUpdateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServicePartialReportUpdate

Summary: Partial report update
Description: Update a custom report with partial information.

### Example

```bash
 reportsServicePartialReportUpdate report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Unique Report ID. | [default to null]
 **reportsv3PartialReportUpdateRequest** | [**Reportsv3PartialReportUpdateRequest**](Reportsv3PartialReportUpdateRequest.md) |  |

### Return type

[**Reportsv3PartialReportUpdateResponse**](Reportsv3PartialReportUpdateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceRunGrades

Summary: Refresh metrics via grades.
Description: Refresh metrics via grades.

### Example

```bash
 reportsServiceRunGrades
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunGradesRequest** | [**Reportsv3RunGradesRequest**](Reportsv3RunGradesRequest.md) |  |

### Return type

[**Reportsv3RunGradesResponse**](Reportsv3RunGradesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceRunVariantOperation

Summary: Run a variant
Description: Run the operations in a variant

### Example

```bash
 reportsServiceRunVariantOperation
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunVariantOperationRequest** | [**Reportsv3RunVariantOperationRequest**](Reportsv3RunVariantOperationRequest.md) |  |

### Return type

[**Reportsv3RunVariantOperationResponse**](Reportsv3RunVariantOperationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceTranspose

Summary: Transpose
Description: Return the corresponding full sql data.

### Example

```bash
 reportsServiceTranspose
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3TransposeRequest** | [**Reportsv3TransposeRequest**](Reportsv3TransposeRequest.md) |  |

### Return type

[**Reportsv3RunReportResponse**](Reportsv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateChart

Summary: Update chart
Description: Update a custom chart.

### Example

```bash
 reportsServiceUpdateChart chart_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique chart ID. | [default to null]
 **reportsv3UpdateChartRequest** | [**Reportsv3UpdateChartRequest**](Reportsv3UpdateChartRequest.md) |  |

### Return type

[**Reportsv3UpdateChartResponse**](Reportsv3UpdateChartResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateChartv2

Summary: Update chart v2
Description: Update a custom VEGA chart.

### Example

```bash
 reportsServiceUpdateChartv2 chart_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **string** | Unique chart ID. | [default to null]
 **reportsv3UpdateChartv2Request** | [**Reportsv3UpdateChartv2Request**](Reportsv3UpdateChartv2Request.md) |  |

### Return type

[**Reportsv3UpdateChartv2Response**](Reportsv3UpdateChartv2Response.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateControl

Summary: Update Control.
Description: Update a Control.

### Example

```bash
 reportsServiceUpdateControl control_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controlId** | **integer** | The id of the control that was updated. | [default to null]
 **reportsv3UpdateControlRequest** | [**Reportsv3UpdateControlRequest**](Reportsv3UpdateControlRequest.md) |  |

### Return type

[**Reportsv3UpdateControlResponse**](Reportsv3UpdateControlResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateGrade

Summary: Update Grade.
Description: Update a Grade.

### Example

```bash
 reportsServiceUpdateGrade grade_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gradeId** | **integer** | The id of the grade that was updated. | [default to null]
 **reportsv3UpdateGradeRequest** | [**Reportsv3UpdateGradeRequest**](Reportsv3UpdateGradeRequest.md) |  |

### Return type

[**Reportsv3UpdateGradeResponse**](Reportsv3UpdateGradeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateJoin

Summary: Update a join
Description: Update a custom join

### Example

```bash
 reportsServiceUpdateJoin join_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | **string** | Unique join ID. | [default to null]
 **reportsv3UpdateJoinRequest** | [**Reportsv3UpdateJoinRequest**](Reportsv3UpdateJoinRequest.md) |  |

### Return type

[**Reportsv3UpdateJoinResponse**](Reportsv3UpdateJoinResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateMeasure

Summary: Update measure.
Description: Update a measure.

### Example

```bash
 reportsServiceUpdateMeasure measure_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measureId** | **integer** | The id of the measure that was updated. | [default to null]
 **reportsv3UpdateMeasureRequest** | [**Reportsv3UpdateMeasureRequest**](Reportsv3UpdateMeasureRequest.md) |  |

### Return type

[**Reportsv3UpdateMeasureResponse**](Reportsv3UpdateMeasureResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateMetric

Summary: Update metric.
Description: Update a metric.

### Example

```bash
 reportsServiceUpdateMetric metric_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricId** | **integer** | The id of the metric that was updated. | [default to null]
 **reportsv3UpdateMetricRequest** | [**Reportsv3UpdateMetricRequest**](Reportsv3UpdateMetricRequest.md) |  |

### Return type

[**Reportsv3UpdateMetricResponse**](Reportsv3UpdateMetricResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateProgram

Summary: Update Program.
Description: Update a Program.

### Example

```bash
 reportsServiceUpdateProgram program_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **integer** | The id of the programs that was updated. | [default to null]
 **reportsv3UpdateProgramRequest** | [**Reportsv3UpdateProgramRequest**](Reportsv3UpdateProgramRequest.md) |  |

### Return type

[**Reportsv3UpdateProgramResponse**](Reportsv3UpdateProgramResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateReport

Summary: Update report
Description: Update a custom report.

### Example

```bash
 reportsServiceUpdateReport report_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Unique Report ID. | [default to null]
 **reportsv3UpdateReportRequest** | [**Reportsv3UpdateReportRequest**](Reportsv3UpdateReportRequest.md) |  |

### Return type

[**Reportsv3UpdateReportResponse**](Reportsv3UpdateReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateRequirement

Summary: Update Requirement.
Description: Update a Requirement.

### Example

```bash
 reportsServiceUpdateRequirement requirement_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requirementId** | **integer** | The id of the requirements that was updated. | [default to null]
 **reportsv3UpdateRequirementRequest** | [**Reportsv3UpdateRequirementRequest**](Reportsv3UpdateRequirementRequest.md) |  |

### Return type

[**Reportsv3UpdateRequirementResponse**](Reportsv3UpdateRequirementResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## reportsServiceUpdateVariantOverride

Summary: Update a variant
Description: Update a variant with a custom override

### Example

```bash
 reportsServiceUpdateVariantOverride variant_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | **string** | The variant id | [default to null]
 **reportsv3UpdateVariantOverrideRequest** | [**Reportsv3UpdateVariantOverrideRequest**](Reportsv3UpdateVariantOverrideRequest.md) |  |

### Return type

[**Reportsv3UpdateVariantOverrideResponse**](Reportsv3UpdateVariantOverrideResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

