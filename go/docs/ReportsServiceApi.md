# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsServiceCreateCategory**](ReportsServiceApi.md#ReportsServiceCreateCategory) | **Post** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**ReportsServiceCreateChart**](ReportsServiceApi.md#ReportsServiceCreateChart) | **Post** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**ReportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#ReportsServiceCreateChartTemplatev2) | **Post** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**ReportsServiceCreateChartv2**](ReportsServiceApi.md#ReportsServiceCreateChartv2) | **Post** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**ReportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#ReportsServiceCreateFieldsByCategory) | **Post** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**ReportsServiceCreateJoin**](ReportsServiceApi.md#ReportsServiceCreateJoin) | **Post** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**ReportsServiceCreateReport**](ReportsServiceApi.md#ReportsServiceCreateReport) | **Post** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**ReportsServiceCreateVariant**](ReportsServiceApi.md#ReportsServiceCreateVariant) | **Post** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**ReportsServiceDeleteCategory**](ReportsServiceApi.md#ReportsServiceDeleteCategory) | **Delete** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**ReportsServiceDeleteChart**](ReportsServiceApi.md#ReportsServiceDeleteChart) | **Delete** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**ReportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#ReportsServiceDeleteChartTemplatev2) | **Delete** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**ReportsServiceDeleteChartv2**](ReportsServiceApi.md#ReportsServiceDeleteChartv2) | **Delete** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**ReportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#ReportsServiceDeleteFieldsByCategory) | **Delete** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**ReportsServiceDeleteJoin**](ReportsServiceApi.md#ReportsServiceDeleteJoin) | **Delete** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**ReportsServiceDeleteReport**](ReportsServiceApi.md#ReportsServiceDeleteReport) | **Delete** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**ReportsServiceDeleteVariant**](ReportsServiceApi.md#ReportsServiceDeleteVariant) | **Delete** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**ReportsServiceGetCategories**](ReportsServiceApi.md#ReportsServiceGetCategories) | **Get** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**ReportsServiceGetChartSettings**](ReportsServiceApi.md#ReportsServiceGetChartSettings) | **Get** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**ReportsServiceGetChartSettingsv2**](ReportsServiceApi.md#ReportsServiceGetChartSettingsv2) | **Get** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**ReportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#ReportsServiceGetChartTemplatesv2) | **Get** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**ReportsServiceGetFieldsByCategories**](ReportsServiceApi.md#ReportsServiceGetFieldsByCategories) | **Get** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**ReportsServiceGetFieldsByCategory**](ReportsServiceApi.md#ReportsServiceGetFieldsByCategory) | **Get** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**ReportsServiceGetJoins**](ReportsServiceApi.md#ReportsServiceGetJoins) | **Get** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**ReportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#ReportsServiceGetQueryByReportDefinition) | **Post** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**ReportsServiceGetQueryByReportID**](ReportsServiceApi.md#ReportsServiceGetQueryByReportID) | **Post** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**ReportsServiceGetReportDefinition**](ReportsServiceApi.md#ReportsServiceGetReportDefinition) | **Get** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**ReportsServiceGetReportGroups**](ReportsServiceApi.md#ReportsServiceGetReportGroups) | **Get** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**ReportsServiceGetReportSynopsis**](ReportsServiceApi.md#ReportsServiceGetReportSynopsis) | **Get** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**ReportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#ReportsServiceGetReportTimestampHeader) | **Get** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**ReportsServiceGetReports**](ReportsServiceApi.md#ReportsServiceGetReports) | **Get** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**ReportsServiceGetReportsForJoin**](ReportsServiceApi.md#ReportsServiceGetReportsForJoin) | **Get** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**ReportsServiceGetReportsTags**](ReportsServiceApi.md#ReportsServiceGetReportsTags) | **Get** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**ReportsServiceGetVariant**](ReportsServiceApi.md#ReportsServiceGetVariant) | **Get** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**ReportsServiceGetVariants**](ReportsServiceApi.md#ReportsServiceGetVariants) | **Get** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**ReportsServicePartialChartUpdate**](ReportsServiceApi.md#ReportsServicePartialChartUpdate) | **Patch** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**ReportsServicePartialReportUpdate**](ReportsServiceApi.md#ReportsServicePartialReportUpdate) | **Patch** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**ReportsServiceRunVariantOperation**](ReportsServiceApi.md#ReportsServiceRunVariantOperation) | **Post** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**ReportsServiceTranspose**](ReportsServiceApi.md#ReportsServiceTranspose) | **Post** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**ReportsServiceUpdateChart**](ReportsServiceApi.md#ReportsServiceUpdateChart) | **Put** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**ReportsServiceUpdateChartv2**](ReportsServiceApi.md#ReportsServiceUpdateChartv2) | **Put** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**ReportsServiceUpdateJoin**](ReportsServiceApi.md#ReportsServiceUpdateJoin) | **Put** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**ReportsServiceUpdateReport**](ReportsServiceApi.md#ReportsServiceUpdateReport) | **Put** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**ReportsServiceUpdateVariantOverride**](ReportsServiceApi.md#ReportsServiceUpdateVariantOverride) | **Put** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override

# **ReportsServiceCreateCategory**
> Reportsv3CreateCategoryResponse ReportsServiceCreateCategory(ctx, body)
Summary: Create a category Description: Create a report category

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateCategoryRequest**](Reportsv3CreateCategoryRequest.md)|  | 

### Return type

[**Reportsv3CreateCategoryResponse**](reportsv3CreateCategoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateChart**
> Reportsv3CreateChartResponse ReportsServiceCreateChart(ctx, body)
Summary: Create chart Description: Create custom chart based on provided properties.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateChartRequest**](Reportsv3CreateChartRequest.md)|  | 

### Return type

[**Reportsv3CreateChartResponse**](reportsv3CreateChartResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateChartTemplatev2**
> Reportsv3CreateChartTemplatev2Response ReportsServiceCreateChartTemplatev2(ctx, body)
Summary: Create chart template v2 Description: Create custom VEGA chart template.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateChartTemplatev2Request**](Reportsv3CreateChartTemplatev2Request.md)|  | 

### Return type

[**Reportsv3CreateChartTemplatev2Response**](reportsv3CreateChartTemplatev2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateChartv2**
> Reportsv3CreateChartv2Response ReportsServiceCreateChartv2(ctx, body)
Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateChartv2Request**](Reportsv3CreateChartv2Request.md)|  | 

### Return type

[**Reportsv3CreateChartv2Response**](reportsv3CreateChartv2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateFieldsByCategory**
> Reportsv3CreateFieldsByCategoryResponse ReportsServiceCreateFieldsByCategory(ctx, body)
Summary - Create fields by category Description: Cteate category fields based on provided properties.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateFieldsByCategoryRequest**](Reportsv3CreateFieldsByCategoryRequest.md)|  | 

### Return type

[**Reportsv3CreateFieldsByCategoryResponse**](reportsv3CreateFieldsByCategoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateJoin**
> Reportsv3CreateJoinResponse ReportsServiceCreateJoin(ctx, body)
Summary: Create a join Description: Create a custom report join

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateJoinRequest**](Reportsv3CreateJoinRequest.md)|  | 

### Return type

[**Reportsv3CreateJoinResponse**](reportsv3CreateJoinResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateReport**
> Reportsv3CreateReportResponse ReportsServiceCreateReport(ctx, body)
Summary: Create report Description: Create custom report based on provided properties.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateReportRequest**](Reportsv3CreateReportRequest.md)|  | 

### Return type

[**Reportsv3CreateReportResponse**](reportsv3CreateReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceCreateVariant**
> Reportsv3CreateVariantResponse ReportsServiceCreateVariant(ctx, body)
Summary: Create a variant Description: Create a variant for reports

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3CreateVariantRequest**](Reportsv3CreateVariantRequest.md)|  | 

### Return type

[**Reportsv3CreateVariantResponse**](reportsv3CreateVariantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteCategory**
> Reportsv3DeleteCategoryResponse ReportsServiceDeleteCategory(ctx, optional)
Summary: Delete a category Description: Delete a report category

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceDeleteCategoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceDeleteCategoryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **optional.String**| category id. | 
 **tableName** | **optional.String**| table name. | 

### Return type

[**Reportsv3DeleteCategoryResponse**](reportsv3DeleteCategoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteChart**
> Reportsv3DeleteChartResponse ReportsServiceDeleteChart(ctx, chartId)
Summary: Delete chart Description: Delete a custom chart.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **chartId** | **string**| The id of the chart to be deleted. | 

### Return type

[**Reportsv3DeleteChartResponse**](reportsv3DeleteChartResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteChartTemplatev2**
> Reportsv3DeleteChartTemplatev2Response ReportsServiceDeleteChartTemplatev2(ctx, templateId)
Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **templateId** | **string**| Unique template ID. | 

### Return type

[**Reportsv3DeleteChartTemplatev2Response**](reportsv3DeleteChartTemplatev2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteChartv2**
> Reportsv3DeleteChartv2Response ReportsServiceDeleteChartv2(ctx, chartId)
Summary: Delete chart v2 Description: Delete a custom VEGA chart.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **chartId** | **string**| The ID of the chart for deletion. | 

### Return type

[**Reportsv3DeleteChartv2Response**](reportsv3DeleteChartv2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteFieldsByCategory**
> Reportsv3DeleteFieldsByCategoryResponse ReportsServiceDeleteFieldsByCategory(ctx, optional)
Summary - Delete fields by category Description: Delete category fields based on provided properties.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceDeleteFieldsByCategoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceDeleteFieldsByCategoryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerIds** | [**optional.Interface of []string**](string.md)| Header ids. | 
 **tableName** | **optional.String**| table name. | 

### Return type

[**Reportsv3DeleteFieldsByCategoryResponse**](reportsv3DeleteFieldsByCategoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteJoin**
> Reportsv3DeleteJoinResponse ReportsServiceDeleteJoin(ctx, joinId)
Summary: Delete a join Description: Delete a custom join

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **joinId** | **string**| The id of the join to be deleted. | 

### Return type

[**Reportsv3DeleteJoinResponse**](reportsv3DeleteJoinResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteReport**
> Reportsv3DeleteReportResponse ReportsServiceDeleteReport(ctx, reportId)
Summary: Delete report Description: Delete a custom report.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **reportId** | **string**| The id of the Report to be deleted. | 

### Return type

[**Reportsv3DeleteReportResponse**](reportsv3DeleteReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceDeleteVariant**
> Reportsv3DeleteVariantResponse ReportsServiceDeleteVariant(ctx, variantId)
Summary: Delete a variant Description: Delete a variant

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **variantId** | **string**| The id of the variant to delete | 

### Return type

[**Reportsv3DeleteVariantResponse**](reportsv3DeleteVariantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetCategories**
> Reportsv3GetCategoriesResponse ReportsServiceGetCategories(ctx, optional)
Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetCategoriesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetCategoriesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **optional.String**| Report ID. | 

### Return type

[**Reportsv3GetCategoriesResponse**](reportsv3GetCategoriesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetChartSettings**
> Reportsv3GetChartSettingsResponse ReportsServiceGetChartSettings(ctx, optional)
Summary: Get chart settings Description: Get a custom chart based on provided report id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetChartSettingsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetChartSettingsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **optional.String**| Unique Chart ID. | 
 **reportId** | **optional.String**| Unique Report ID. | 

### Return type

[**Reportsv3GetChartSettingsResponse**](reportsv3GetChartSettingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetChartSettingsv2**
> Reportsv3GetChartSettingsv2Response ReportsServiceGetChartSettingsv2(ctx, optional)
Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetChartSettingsv2Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetChartSettingsv2Opts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **optional.String**| Unique Chart ID. | 
 **reportId** | **optional.String**| Unique Report ID. | 

### Return type

[**Reportsv3GetChartSettingsv2Response**](reportsv3GetChartSettingsv2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetChartTemplatesv2**
> Reportsv3GetChartTemplatesv2Response ReportsServiceGetChartTemplatesv2(ctx, )
Summary: Get chart template v2 Description: Get all custom VEGA chart templates.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Reportsv3GetChartTemplatesv2Response**](reportsv3GetChartTemplatesv2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetFieldsByCategories**
> Reportsv3GetFieldsByCategoriesResponse ReportsServiceGetFieldsByCategories(ctx, optional)
Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetFieldsByCategoriesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetFieldsByCategoriesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | [**optional.Interface of []string**](string.md)| Category IDs. | 

### Return type

[**Reportsv3GetFieldsByCategoriesResponse**](reportsv3GetFieldsByCategoriesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetFieldsByCategory**
> Reportsv3GetFieldsByCategoryResponse ReportsServiceGetFieldsByCategory(ctx, optional)
Summary: Get fields by category Description: Get all category related fields or all possible fields.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetFieldsByCategoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetFieldsByCategoryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **optional.String**| Category ID. | 
 **reportId** | **optional.String**| Report ID. | 
 **tableName** | **optional.String**| optional table name parameter. | 

### Return type

[**Reportsv3GetFieldsByCategoryResponse**](reportsv3GetFieldsByCategoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetJoins**
> Reportsv3GetJoinsResponse ReportsServiceGetJoins(ctx, optional)
Summary: Get all joins Description: Get all custom joins.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetJoinsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetJoinsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **optional.String**| Category ID (Optional). | 

### Return type

[**Reportsv3GetJoinsResponse**](reportsv3GetJoinsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetQueryByReportDefinition**
> Reportsv3GetReportQueryResponse ReportsServiceGetQueryByReportDefinition(ctx, body)
Summary: Get query by report definition Description: Get query by report definition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3GetQueryByReportDefinitionRequest**](Reportsv3GetQueryByReportDefinitionRequest.md)|  | 

### Return type

[**Reportsv3GetReportQueryResponse**](reportsv3GetReportQueryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetQueryByReportID**
> Reportsv3GetReportQueryResponse ReportsServiceGetQueryByReportID(ctx, body)
Summary: Get query by report ID Description: Get query by report ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3GetQueryByReportIdRequest**](Reportsv3GetQueryByReportIdRequest.md)|  | 

### Return type

[**Reportsv3GetReportQueryResponse**](reportsv3GetReportQueryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportDefinition**
> Reportsv3GetReportDefinitionResponse ReportsServiceGetReportDefinition(ctx, reportId)
Summary: Get report definition Description: Get report definition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **reportId** | **string**| Unique Report ID. | 

### Return type

[**Reportsv3GetReportDefinitionResponse**](reportsv3GetReportDefinitionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportGroups**
> Reportsv3GetReportGroupsResponse ReportsServiceGetReportGroups(ctx, optional)
Summary: Get report groups Description: Get reports used by the provided groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetReportGroupsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetReportGroupsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | [**optional.Interface of []string**](string.md)| List of group IDs that should be checked for usage in each report. | 

### Return type

[**Reportsv3GetReportGroupsResponse**](reportsv3GetReportGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportSynopsis**
> Reportsv3GetReportSynopsisResponse ReportsServiceGetReportSynopsis(ctx, reportId)
Summary: Get report synopsis Description: Return BriefReport.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **reportId** | **string**| Unique Report ID. | 

### Return type

[**Reportsv3GetReportSynopsisResponse**](reportsv3GetReportSynopsisResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportTimestampHeader**
> Reportsv3GetReportTimestampHeaderResponse ReportsServiceGetReportTimestampHeader(ctx, optional)
Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetReportTimestampHeaderOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetReportTimestampHeaderOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **optional.String**| Category ID parameter. | 
 **tableNames** | [**optional.Interface of []string**](string.md)| List of all header tables. | 

### Return type

[**Reportsv3GetReportTimestampHeaderResponse**](reportsv3GetReportTimestampHeaderResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReports**
> Reportsv3GetReportsResponse ReportsServiceGetReports(ctx, optional)
Summary: Get reports Description: Get reports list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ReportsServiceApiReportsServiceGetReportsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportsServiceApiReportsServiceGetReportsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **optional.String**| Optional Category ID parameter. | 
 **tableName** | **optional.String**| Optional table name parameter. | 

### Return type

[**Reportsv3GetReportsResponse**](reportsv3GetReportsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportsForJoin**
> Reportsv3GetReportsForJoinResponse ReportsServiceGetReportsForJoin(ctx, joinId)
Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **joinId** | **string**|  | 

### Return type

[**Reportsv3GetReportsForJoinResponse**](reportsv3GetReportsForJoinResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetReportsTags**
> Reportsv3GetReportsTagsResponse ReportsServiceGetReportsTags(ctx, )
Summary: Get reports tags Description: Get all report distinct tags.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Reportsv3GetReportsTagsResponse**](reportsv3GetReportsTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetVariant**
> Reportsv3GetVariantResponse ReportsServiceGetVariant(ctx, variantId)
Summary: Get a variant Description: Get a given variant

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **variantId** | **string**| The variant id | 

### Return type

[**Reportsv3GetVariantResponse**](reportsv3GetVariantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceGetVariants**
> Reportsv3GetVariantsResponse ReportsServiceGetVariants(ctx, )
Summary: Get all variants Description: Get all variants in reports

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Reportsv3GetVariantsResponse**](reportsv3GetVariantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServicePartialChartUpdate**
> Reportsv3PartialChartUpdateResponse ReportsServicePartialChartUpdate(ctx, body, chartId)
Summary: Partial chart update Description: Update a custom chart with partial information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3PartialChartUpdateRequest**](Reportsv3PartialChartUpdateRequest.md)|  | 
  **chartId** | **string**| Unique chart ID. | 

### Return type

[**Reportsv3PartialChartUpdateResponse**](reportsv3PartialChartUpdateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServicePartialReportUpdate**
> Reportsv3PartialReportUpdateResponse ReportsServicePartialReportUpdate(ctx, body, reportId)
Summary: Partial report update Description: Update a custom report with partial information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3PartialReportUpdateRequest**](Reportsv3PartialReportUpdateRequest.md)|  | 
  **reportId** | **string**| Unique Report ID. | 

### Return type

[**Reportsv3PartialReportUpdateResponse**](reportsv3PartialReportUpdateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceRunVariantOperation**
> Reportsv3RunVariantOperationResponse ReportsServiceRunVariantOperation(ctx, body)
Summary: Run a variant Description: Run the operations in a variant

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3RunVariantOperationRequest**](Reportsv3RunVariantOperationRequest.md)|  | 

### Return type

[**Reportsv3RunVariantOperationResponse**](reportsv3RunVariantOperationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceTranspose**
> Reportsv3RunReportResponse ReportsServiceTranspose(ctx, body)
Summary: Transpose Description: Return the corresponding full sql data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3TransposeRequest**](Reportsv3TransposeRequest.md)|  | 

### Return type

[**Reportsv3RunReportResponse**](reportsv3RunReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceUpdateChart**
> Reportsv3UpdateChartResponse ReportsServiceUpdateChart(ctx, body, chartId)
Summary: Update chart Description: Update a custom chart.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3UpdateChartRequest**](Reportsv3UpdateChartRequest.md)|  | 
  **chartId** | **string**| Unique chart ID. | 

### Return type

[**Reportsv3UpdateChartResponse**](reportsv3UpdateChartResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceUpdateChartv2**
> Reportsv3UpdateChartv2Response ReportsServiceUpdateChartv2(ctx, body, chartId)
Summary: Update chart v2 Description: Update a custom VEGA chart.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3UpdateChartv2Request**](Reportsv3UpdateChartv2Request.md)|  | 
  **chartId** | **string**| Unique chart ID. | 

### Return type

[**Reportsv3UpdateChartv2Response**](reportsv3UpdateChartv2Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceUpdateJoin**
> Reportsv3UpdateJoinResponse ReportsServiceUpdateJoin(ctx, body, joinId)
Summary: Update a join Description: Update a custom join

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3UpdateJoinRequest**](Reportsv3UpdateJoinRequest.md)|  | 
  **joinId** | **string**| Unique join ID. | 

### Return type

[**Reportsv3UpdateJoinResponse**](reportsv3UpdateJoinResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceUpdateReport**
> Reportsv3UpdateReportResponse ReportsServiceUpdateReport(ctx, body, reportId)
Summary: Update report Description: Update a custom report.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3UpdateReportRequest**](Reportsv3UpdateReportRequest.md)|  | 
  **reportId** | **string**| Unique Report ID. | 

### Return type

[**Reportsv3UpdateReportResponse**](reportsv3UpdateReportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsServiceUpdateVariantOverride**
> Reportsv3UpdateVariantOverrideResponse ReportsServiceUpdateVariantOverride(ctx, body, variantId)
Summary: Update a variant Description: Update a variant with a custom override

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Reportsv3UpdateVariantOverrideRequest**](Reportsv3UpdateVariantOverrideRequest.md)|  | 
  **variantId** | **string**| The variant id | 

### Return type

[**Reportsv3UpdateVariantOverrideResponse**](reportsv3UpdateVariantOverrideResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

