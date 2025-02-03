# DashboardsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsServiceCreateDashboard**](DashboardsServiceApi.md#dashboardsServiceCreateDashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard
Description: Create a unique dashboard.
[**dashboardsServiceDeleteDashboard**](DashboardsServiceApi.md#dashboardsServiceDeleteDashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard
Description: Delete a unique dashboard.
[**dashboardsServiceGetDashboards**](DashboardsServiceApi.md#dashboardsServiceGetDashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards
Description: Get a list of dashboards with all data.
[**dashboardsServiceUpdateDashboard**](DashboardsServiceApi.md#dashboardsServiceUpdateDashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard
Description: Update a dashboard.



## dashboardsServiceCreateDashboard

Summary: Create dashboard
Description: Create a unique dashboard.

### Example

```bash
 dashboardsServiceCreateDashboard
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3Dashboard** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md) | Unique dashboard. |

### Return type

[**Dashboardsv3CreateDashboardResponse**](Dashboardsv3CreateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## dashboardsServiceDeleteDashboard

Summary: Delete dashboard
Description: Delete a unique dashboard.

### Example

```bash
 dashboardsServiceDeleteDashboard dashboard_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **string** | The id of the dashboard to be deleted. | [default to null]
 **dashboardsv3DeleteDashboardRequest** | [**Dashboardsv3DeleteDashboardRequest**](Dashboardsv3DeleteDashboardRequest.md) |  |

### Return type

[**Dashboardsv3DeleteDashboardResponse**](Dashboardsv3DeleteDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## dashboardsServiceGetDashboards

Summary: Get dashboards
Description: Get a list of dashboards with all data.

### Example

```bash
 dashboardsServiceGetDashboards
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Dashboardsv3GetDashboardsResponse**](Dashboardsv3GetDashboardsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## dashboardsServiceUpdateDashboard

Summary: Update dashboard
Description: Update a dashboard.

### Example

```bash
 dashboardsServiceUpdateDashboard dashboard_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **string** | The id of the dashboard that was updated. | [default to null]
 **dashboardsv3UpdateDashboardRequest** | [**Dashboardsv3UpdateDashboardRequest**](Dashboardsv3UpdateDashboardRequest.md) |  |

### Return type

[**Dashboardsv3UpdateDashboardResponse**](Dashboardsv3UpdateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

