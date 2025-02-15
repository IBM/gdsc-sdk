# ibm_gdsc_sdk_software.DashboardsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboards_service_create_dashboard**](DashboardsServiceApi.md#dashboards_service_create_dashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
[**dashboards_service_delete_dashboard**](DashboardsServiceApi.md#dashboards_service_delete_dashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
[**dashboards_service_get_dashboards**](DashboardsServiceApi.md#dashboards_service_get_dashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
[**dashboards_service_update_dashboard**](DashboardsServiceApi.md#dashboards_service_update_dashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.


# **dashboards_service_create_dashboard**
> Dashboardsv3CreateDashboardResponse dashboards_service_create_dashboard(dashboardsv3_dashboard)

Summary: Create dashboard Description: Create a unique dashboard.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.dashboardsv3_create_dashboard_response import Dashboardsv3CreateDashboardResponse
from ibm_gdsc_sdk_software.models.dashboardsv3_dashboard import Dashboardsv3Dashboard
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.DashboardsServiceApi(api_client)
    dashboardsv3_dashboard = ibm_gdsc_sdk_software.Dashboardsv3Dashboard() # Dashboardsv3Dashboard | Unique dashboard.

    try:
        # Summary: Create dashboard Description: Create a unique dashboard.
        api_response = api_instance.dashboards_service_create_dashboard(dashboardsv3_dashboard)
        print("The response of DashboardsServiceApi->dashboards_service_create_dashboard:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DashboardsServiceApi->dashboards_service_create_dashboard: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3_dashboard** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md)| Unique dashboard. | 

### Return type

[**Dashboardsv3CreateDashboardResponse**](Dashboardsv3CreateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dashboards_service_delete_dashboard**
> Dashboardsv3DeleteDashboardResponse dashboards_service_delete_dashboard(dashboard_id, dashboardsv3_delete_dashboard_request)

Summary: Delete dashboard Description: Delete a unique dashboard.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.dashboardsv3_delete_dashboard_request import Dashboardsv3DeleteDashboardRequest
from ibm_gdsc_sdk_software.models.dashboardsv3_delete_dashboard_response import Dashboardsv3DeleteDashboardResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.DashboardsServiceApi(api_client)
    dashboard_id = 'dashboard_id_example' # str | The id of the dashboard to be deleted.
    dashboardsv3_delete_dashboard_request = ibm_gdsc_sdk_software.Dashboardsv3DeleteDashboardRequest() # Dashboardsv3DeleteDashboardRequest | 

    try:
        # Summary: Delete dashboard Description: Delete a unique dashboard.
        api_response = api_instance.dashboards_service_delete_dashboard(dashboard_id, dashboardsv3_delete_dashboard_request)
        print("The response of DashboardsServiceApi->dashboards_service_delete_dashboard:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DashboardsServiceApi->dashboards_service_delete_dashboard: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboard_id** | **str**| The id of the dashboard to be deleted. | 
 **dashboardsv3_delete_dashboard_request** | [**Dashboardsv3DeleteDashboardRequest**](Dashboardsv3DeleteDashboardRequest.md)|  | 

### Return type

[**Dashboardsv3DeleteDashboardResponse**](Dashboardsv3DeleteDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dashboards_service_get_dashboards**
> Dashboardsv3GetDashboardsResponse dashboards_service_get_dashboards()

Summary: Get dashboards Description: Get a list of dashboards with all data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.dashboardsv3_get_dashboards_response import Dashboardsv3GetDashboardsResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.DashboardsServiceApi(api_client)

    try:
        # Summary: Get dashboards Description: Get a list of dashboards with all data.
        api_response = api_instance.dashboards_service_get_dashboards()
        print("The response of DashboardsServiceApi->dashboards_service_get_dashboards:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DashboardsServiceApi->dashboards_service_get_dashboards: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Dashboardsv3GetDashboardsResponse**](Dashboardsv3GetDashboardsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dashboards_service_update_dashboard**
> Dashboardsv3UpdateDashboardResponse dashboards_service_update_dashboard(dashboard_id, dashboardsv3_update_dashboard_request)

Summary: Update dashboard Description: Update a dashboard.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software,os
from ibm_gdsc_sdk_software.models.dashboardsv3_update_dashboard_request import Dashboardsv3UpdateDashboardRequest
from ibm_gdsc_sdk_software.models.dashboardsv3_update_dashboard_response import Dashboardsv3UpdateDashboardResponse
from ibm_gdsc_sdk_software.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_software.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_software.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_software.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_software.DashboardsServiceApi(api_client)
    dashboard_id = 'dashboard_id_example' # str | The id of the dashboard that was updated.
    dashboardsv3_update_dashboard_request = ibm_gdsc_sdk_software.Dashboardsv3UpdateDashboardRequest() # Dashboardsv3UpdateDashboardRequest | 

    try:
        # Summary: Update dashboard Description: Update a dashboard.
        api_response = api_instance.dashboards_service_update_dashboard(dashboard_id, dashboardsv3_update_dashboard_request)
        print("The response of DashboardsServiceApi->dashboards_service_update_dashboard:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DashboardsServiceApi->dashboards_service_update_dashboard: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboard_id** | **str**| The id of the dashboard that was updated. | 
 **dashboardsv3_update_dashboard_request** | [**Dashboardsv3UpdateDashboardRequest**](Dashboardsv3UpdateDashboardRequest.md)|  | 

### Return type

[**Dashboardsv3UpdateDashboardResponse**](Dashboardsv3UpdateDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

