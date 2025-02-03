# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DashboardsServiceCreateDashboard**](DashboardsServiceApi.md#DashboardsServiceCreateDashboard) | **Post** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
[**DashboardsServiceDeleteDashboard**](DashboardsServiceApi.md#DashboardsServiceDeleteDashboard) | **Delete** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
[**DashboardsServiceGetDashboards**](DashboardsServiceApi.md#DashboardsServiceGetDashboards) | **Get** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
[**DashboardsServiceUpdateDashboard**](DashboardsServiceApi.md#DashboardsServiceUpdateDashboard) | **Put** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.

# **DashboardsServiceCreateDashboard**
> Dashboardsv3CreateDashboardResponse DashboardsServiceCreateDashboard(ctx, body)
Summary: Create dashboard Description: Create a unique dashboard.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md)| Unique dashboard. | 

### Return type

[**Dashboardsv3CreateDashboardResponse**](dashboardsv3CreateDashboardResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DashboardsServiceDeleteDashboard**
> Dashboardsv3DeleteDashboardResponse DashboardsServiceDeleteDashboard(ctx, body, dashboardId)
Summary: Delete dashboard Description: Delete a unique dashboard.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Dashboardsv3DeleteDashboardRequest**](Dashboardsv3DeleteDashboardRequest.md)|  | 
  **dashboardId** | **string**| The id of the dashboard to be deleted. | 

### Return type

[**Dashboardsv3DeleteDashboardResponse**](dashboardsv3DeleteDashboardResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DashboardsServiceGetDashboards**
> Dashboardsv3GetDashboardsResponse DashboardsServiceGetDashboards(ctx, )
Summary: Get dashboards Description: Get a list of dashboards with all data.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Dashboardsv3GetDashboardsResponse**](dashboardsv3GetDashboardsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DashboardsServiceUpdateDashboard**
> Dashboardsv3UpdateDashboardResponse DashboardsServiceUpdateDashboard(ctx, body, dashboardId)
Summary: Update dashboard Description: Update a dashboard.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Dashboardsv3UpdateDashboardRequest**](Dashboardsv3UpdateDashboardRequest.md)|  | 
  **dashboardId** | **string**| The id of the dashboard that was updated. | 

### Return type

[**Dashboardsv3UpdateDashboardResponse**](dashboardsv3UpdateDashboardResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

