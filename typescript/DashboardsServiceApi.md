# .DashboardsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsServiceCreateDashboard**](DashboardsServiceApi.md#dashboardsServiceCreateDashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
[**dashboardsServiceDeleteDashboard**](DashboardsServiceApi.md#dashboardsServiceDeleteDashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
[**dashboardsServiceGetDashboards**](DashboardsServiceApi.md#dashboardsServiceGetDashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
[**dashboardsServiceUpdateDashboard**](DashboardsServiceApi.md#dashboardsServiceUpdateDashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.


# **dashboardsServiceCreateDashboard**
> Dashboardsv3CreateDashboardResponse dashboardsServiceCreateDashboard(dashboardsv3Dashboard)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceCreateDashboardRequest = {
  // Dashboardsv3Dashboard | Unique dashboard.
  dashboardsv3Dashboard: {
    cards: [
      {
        cardID: "cardID_example",
        cardPosition: {
          height: 3.14,
          width: 3.14,
          xPosition: 3.14,
          yPosition: 3.14,
        },
        cardType: "UNDEFINED_CARD_TYPE",
        excludedGlobalFilterIds: [
          "excludedGlobalFilterIds_example",
        ],
        reportParameters: {
          end: "end_example",
          id: "id_example",
          localTimeFilter: {
            end: "end_example",
            range: "range_example",
            start: "start_example",
          },
          menuItem: "menuItem_example",
          override: true,
          range: "range_example",
          regulation: "regulation_example",
          start: "start_example",
          tags: [
            {
              nlsKey: "nlsKey_example",
              nlsValue: "nlsValue_example",
            },
          ],
          title: "title_example",
        },
      },
    ],
    dashboardDescription: "dashboardDescription_example",
    dashboardId: "dashboardId_example",
    dashboardTitle: "dashboardTitle_example",
    globalTimeFilter: {
      end: "end_example",
      range: "range_example",
      start: "start_example",
    },
    reportGlobalFilterList: [
      {
        caseInsensitive: true,
        filterItemType: "filterItemType_example",
        groupName: "groupName_example",
        headerId: "headerId_example",
        headerType: "headerType_example",
        id: "id_example",
        name: "name_example",
        operator: "operator_example",
        operatorKey: "operatorKey_example",
        reportOperator: [
          {
            key: "key_example",
            label: "label_example",
            value: "value_example",
          },
        ],
      },
    ],
  },
};

apiInstance.dashboardsServiceCreateDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3Dashboard** | **Dashboardsv3Dashboard**| Unique dashboard. |


### Return type

**Dashboardsv3CreateDashboardResponse**

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

# **dashboardsServiceDeleteDashboard**
> Dashboardsv3DeleteDashboardResponse dashboardsServiceDeleteDashboard(dashboardsv3DeleteDashboardRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceDeleteDashboardRequest = {
  // string | The id of the dashboard to be deleted.
  dashboardId: "dashboard_id_example",
  // Dashboardsv3DeleteDashboardRequest
  dashboardsv3DeleteDashboardRequest: {
    dashboardId: "dashboardId_example",
  },
};

apiInstance.dashboardsServiceDeleteDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3DeleteDashboardRequest** | **Dashboardsv3DeleteDashboardRequest**|  |
 **dashboardId** | [**string**] | The id of the dashboard to be deleted. | defaults to undefined


### Return type

**Dashboardsv3DeleteDashboardResponse**

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

# **dashboardsServiceGetDashboards**
> Dashboardsv3GetDashboardsResponse dashboardsServiceGetDashboards()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:any = {};

apiInstance.dashboardsServiceGetDashboards(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Dashboardsv3GetDashboardsResponse**

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

# **dashboardsServiceUpdateDashboard**
> Dashboardsv3UpdateDashboardResponse dashboardsServiceUpdateDashboard(dashboardsv3UpdateDashboardRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceUpdateDashboardRequest = {
  // string | The id of the dashboard that was updated.
  dashboardId: "dashboard_id_example",
  // Dashboardsv3UpdateDashboardRequest
  dashboardsv3UpdateDashboardRequest: {
    dashboard: {
      cards: [
        {
          cardID: "cardID_example",
          cardPosition: {
            height: 3.14,
            width: 3.14,
            xPosition: 3.14,
            yPosition: 3.14,
          },
          cardType: "UNDEFINED_CARD_TYPE",
          excludedGlobalFilterIds: [
            "excludedGlobalFilterIds_example",
          ],
          reportParameters: {
            end: "end_example",
            id: "id_example",
            localTimeFilter: {
              end: "end_example",
              range: "range_example",
              start: "start_example",
            },
            menuItem: "menuItem_example",
            override: true,
            range: "range_example",
            regulation: "regulation_example",
            start: "start_example",
            tags: [
              {
                nlsKey: "nlsKey_example",
                nlsValue: "nlsValue_example",
              },
            ],
            title: "title_example",
          },
        },
      ],
      dashboardDescription: "dashboardDescription_example",
      dashboardId: "dashboardId_example",
      dashboardTitle: "dashboardTitle_example",
      globalTimeFilter: {
        end: "end_example",
        range: "range_example",
        start: "start_example",
      },
      reportGlobalFilterList: [
        {
          caseInsensitive: true,
          filterItemType: "filterItemType_example",
          groupName: "groupName_example",
          headerId: "headerId_example",
          headerType: "headerType_example",
          id: "id_example",
          name: "name_example",
          operator: "operator_example",
          operatorKey: "operatorKey_example",
          reportOperator: [
            {
              key: "key_example",
              label: "label_example",
              value: "value_example",
            },
          ],
        },
      ],
    },
    dashboardId: "dashboardId_example",
    updateHint: "updateHint_example",
    updateType: "UNDEFINED_UPDATE_TYPE",
  },
};

apiInstance.dashboardsServiceUpdateDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3UpdateDashboardRequest** | **Dashboardsv3UpdateDashboardRequest**|  |
 **dashboardId** | [**string**] | The id of the dashboard that was updated. | defaults to undefined


### Return type

**Dashboardsv3UpdateDashboardResponse**

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


