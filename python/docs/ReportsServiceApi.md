# ibm_gdsc_sdk_saas.ReportsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reports_service_create_category**](ReportsServiceApi.md#reports_service_create_category) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**reports_service_create_chart**](ReportsServiceApi.md#reports_service_create_chart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**reports_service_create_chart_templatev2**](ReportsServiceApi.md#reports_service_create_chart_templatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**reports_service_create_chartv2**](ReportsServiceApi.md#reports_service_create_chartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**reports_service_create_fields_by_category**](ReportsServiceApi.md#reports_service_create_fields_by_category) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**reports_service_create_join**](ReportsServiceApi.md#reports_service_create_join) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**reports_service_create_report**](ReportsServiceApi.md#reports_service_create_report) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**reports_service_create_variant**](ReportsServiceApi.md#reports_service_create_variant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**reports_service_delete_category**](ReportsServiceApi.md#reports_service_delete_category) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**reports_service_delete_chart**](ReportsServiceApi.md#reports_service_delete_chart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**reports_service_delete_chart_templatev2**](ReportsServiceApi.md#reports_service_delete_chart_templatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**reports_service_delete_chartv2**](ReportsServiceApi.md#reports_service_delete_chartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**reports_service_delete_fields_by_category**](ReportsServiceApi.md#reports_service_delete_fields_by_category) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**reports_service_delete_join**](ReportsServiceApi.md#reports_service_delete_join) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**reports_service_delete_report**](ReportsServiceApi.md#reports_service_delete_report) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**reports_service_delete_variant**](ReportsServiceApi.md#reports_service_delete_variant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**reports_service_get_categories**](ReportsServiceApi.md#reports_service_get_categories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**reports_service_get_chart_settings**](ReportsServiceApi.md#reports_service_get_chart_settings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**reports_service_get_chart_settingsv2**](ReportsServiceApi.md#reports_service_get_chart_settingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**reports_service_get_chart_templatesv2**](ReportsServiceApi.md#reports_service_get_chart_templatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**reports_service_get_fields_by_categories**](ReportsServiceApi.md#reports_service_get_fields_by_categories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**reports_service_get_fields_by_category**](ReportsServiceApi.md#reports_service_get_fields_by_category) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**reports_service_get_joins**](ReportsServiceApi.md#reports_service_get_joins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**reports_service_get_query_by_report_definition**](ReportsServiceApi.md#reports_service_get_query_by_report_definition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**reports_service_get_query_by_report_id**](ReportsServiceApi.md#reports_service_get_query_by_report_id) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**reports_service_get_report_definition**](ReportsServiceApi.md#reports_service_get_report_definition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**reports_service_get_report_groups**](ReportsServiceApi.md#reports_service_get_report_groups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**reports_service_get_report_synopsis**](ReportsServiceApi.md#reports_service_get_report_synopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**reports_service_get_report_timestamp_header**](ReportsServiceApi.md#reports_service_get_report_timestamp_header) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**reports_service_get_reports**](ReportsServiceApi.md#reports_service_get_reports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**reports_service_get_reports_for_join**](ReportsServiceApi.md#reports_service_get_reports_for_join) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**reports_service_get_reports_tags**](ReportsServiceApi.md#reports_service_get_reports_tags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**reports_service_get_variant**](ReportsServiceApi.md#reports_service_get_variant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**reports_service_get_variants**](ReportsServiceApi.md#reports_service_get_variants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**reports_service_partial_chart_update**](ReportsServiceApi.md#reports_service_partial_chart_update) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**reports_service_partial_report_update**](ReportsServiceApi.md#reports_service_partial_report_update) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**reports_service_run_variant_operation**](ReportsServiceApi.md#reports_service_run_variant_operation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**reports_service_transpose**](ReportsServiceApi.md#reports_service_transpose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**reports_service_update_chart**](ReportsServiceApi.md#reports_service_update_chart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**reports_service_update_chartv2**](ReportsServiceApi.md#reports_service_update_chartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**reports_service_update_join**](ReportsServiceApi.md#reports_service_update_join) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**reports_service_update_report**](ReportsServiceApi.md#reports_service_update_report) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**reports_service_update_variant_override**](ReportsServiceApi.md#reports_service_update_variant_override) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override


# **reports_service_create_category**
> Reportsv3CreateCategoryResponse reports_service_create_category(reportsv3_create_category_request)

Summary: Create a category Description: Create a report category

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_category_request import Reportsv3CreateCategoryRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_category_response import Reportsv3CreateCategoryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_category_request = ibm_gdsc_sdk_saas.Reportsv3CreateCategoryRequest() # Reportsv3CreateCategoryRequest | 

    try:
        # Summary: Create a category Description: Create a report category
        api_response = api_instance.reports_service_create_category(reportsv3_create_category_request)
        print("The response of ReportsServiceApi->reports_service_create_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_category_request** | [**Reportsv3CreateCategoryRequest**](Reportsv3CreateCategoryRequest.md)|  | 

### Return type

[**Reportsv3CreateCategoryResponse**](Reportsv3CreateCategoryResponse.md)

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

# **reports_service_create_chart**
> Reportsv3CreateChartResponse reports_service_create_chart(reportsv3_create_chart_request)

Summary: Create chart Description: Create custom chart based on provided properties.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_request import Reportsv3CreateChartRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_response import Reportsv3CreateChartResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_chart_request = ibm_gdsc_sdk_saas.Reportsv3CreateChartRequest() # Reportsv3CreateChartRequest | 

    try:
        # Summary: Create chart Description: Create custom chart based on provided properties.
        api_response = api_instance.reports_service_create_chart(reportsv3_create_chart_request)
        print("The response of ReportsServiceApi->reports_service_create_chart:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_chart: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_chart_request** | [**Reportsv3CreateChartRequest**](Reportsv3CreateChartRequest.md)|  | 

### Return type

[**Reportsv3CreateChartResponse**](Reportsv3CreateChartResponse.md)

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

# **reports_service_create_chart_templatev2**
> Reportsv3CreateChartTemplatev2Response reports_service_create_chart_templatev2(reportsv3_create_chart_templatev2_request)

Summary: Create chart template v2 Description: Create custom VEGA chart template.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_templatev2_request import Reportsv3CreateChartTemplatev2Request
from ibm_gdsc_sdk_saas.models.reportsv3_create_chart_templatev2_response import Reportsv3CreateChartTemplatev2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_chart_templatev2_request = ibm_gdsc_sdk_saas.Reportsv3CreateChartTemplatev2Request() # Reportsv3CreateChartTemplatev2Request | 

    try:
        # Summary: Create chart template v2 Description: Create custom VEGA chart template.
        api_response = api_instance.reports_service_create_chart_templatev2(reportsv3_create_chart_templatev2_request)
        print("The response of ReportsServiceApi->reports_service_create_chart_templatev2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_chart_templatev2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_chart_templatev2_request** | [**Reportsv3CreateChartTemplatev2Request**](Reportsv3CreateChartTemplatev2Request.md)|  | 

### Return type

[**Reportsv3CreateChartTemplatev2Response**](Reportsv3CreateChartTemplatev2Response.md)

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

# **reports_service_create_chartv2**
> Reportsv3CreateChartv2Response reports_service_create_chartv2(reportsv3_create_chartv2_request)

Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_chartv2_request import Reportsv3CreateChartv2Request
from ibm_gdsc_sdk_saas.models.reportsv3_create_chartv2_response import Reportsv3CreateChartv2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_chartv2_request = ibm_gdsc_sdk_saas.Reportsv3CreateChartv2Request() # Reportsv3CreateChartv2Request | 

    try:
        # Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
        api_response = api_instance.reports_service_create_chartv2(reportsv3_create_chartv2_request)
        print("The response of ReportsServiceApi->reports_service_create_chartv2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_chartv2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_chartv2_request** | [**Reportsv3CreateChartv2Request**](Reportsv3CreateChartv2Request.md)|  | 

### Return type

[**Reportsv3CreateChartv2Response**](Reportsv3CreateChartv2Response.md)

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

# **reports_service_create_fields_by_category**
> Reportsv3CreateFieldsByCategoryResponse reports_service_create_fields_by_category(reportsv3_create_fields_by_category_request)

Summary - Create fields by category Description: Cteate category fields based on provided properties.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_fields_by_category_request import Reportsv3CreateFieldsByCategoryRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_fields_by_category_response import Reportsv3CreateFieldsByCategoryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_fields_by_category_request = ibm_gdsc_sdk_saas.Reportsv3CreateFieldsByCategoryRequest() # Reportsv3CreateFieldsByCategoryRequest | 

    try:
        # Summary - Create fields by category Description: Cteate category fields based on provided properties.
        api_response = api_instance.reports_service_create_fields_by_category(reportsv3_create_fields_by_category_request)
        print("The response of ReportsServiceApi->reports_service_create_fields_by_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_fields_by_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_fields_by_category_request** | [**Reportsv3CreateFieldsByCategoryRequest**](Reportsv3CreateFieldsByCategoryRequest.md)|  | 

### Return type

[**Reportsv3CreateFieldsByCategoryResponse**](Reportsv3CreateFieldsByCategoryResponse.md)

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

# **reports_service_create_join**
> Reportsv3CreateJoinResponse reports_service_create_join(reportsv3_create_join_request)

Summary: Create a join Description: Create a custom report join

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_join_request import Reportsv3CreateJoinRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_join_response import Reportsv3CreateJoinResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_join_request = ibm_gdsc_sdk_saas.Reportsv3CreateJoinRequest() # Reportsv3CreateJoinRequest | 

    try:
        # Summary: Create a join Description: Create a custom report join
        api_response = api_instance.reports_service_create_join(reportsv3_create_join_request)
        print("The response of ReportsServiceApi->reports_service_create_join:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_join: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_join_request** | [**Reportsv3CreateJoinRequest**](Reportsv3CreateJoinRequest.md)|  | 

### Return type

[**Reportsv3CreateJoinResponse**](Reportsv3CreateJoinResponse.md)

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

# **reports_service_create_report**
> Reportsv3CreateReportResponse reports_service_create_report(reportsv3_create_report_request)

Summary: Create report Description: Create custom report based on provided properties.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_report_request import Reportsv3CreateReportRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_report_response import Reportsv3CreateReportResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_report_request = ibm_gdsc_sdk_saas.Reportsv3CreateReportRequest() # Reportsv3CreateReportRequest | 

    try:
        # Summary: Create report Description: Create custom report based on provided properties.
        api_response = api_instance.reports_service_create_report(reportsv3_create_report_request)
        print("The response of ReportsServiceApi->reports_service_create_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_report_request** | [**Reportsv3CreateReportRequest**](Reportsv3CreateReportRequest.md)|  | 

### Return type

[**Reportsv3CreateReportResponse**](Reportsv3CreateReportResponse.md)

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

# **reports_service_create_variant**
> Reportsv3CreateVariantResponse reports_service_create_variant(reportsv3_create_variant_request)

Summary: Create a variant Description: Create a variant for reports

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_create_variant_request import Reportsv3CreateVariantRequest
from ibm_gdsc_sdk_saas.models.reportsv3_create_variant_response import Reportsv3CreateVariantResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_create_variant_request = ibm_gdsc_sdk_saas.Reportsv3CreateVariantRequest() # Reportsv3CreateVariantRequest | 

    try:
        # Summary: Create a variant Description: Create a variant for reports
        api_response = api_instance.reports_service_create_variant(reportsv3_create_variant_request)
        print("The response of ReportsServiceApi->reports_service_create_variant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_create_variant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_create_variant_request** | [**Reportsv3CreateVariantRequest**](Reportsv3CreateVariantRequest.md)|  | 

### Return type

[**Reportsv3CreateVariantResponse**](Reportsv3CreateVariantResponse.md)

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

# **reports_service_delete_category**
> Reportsv3DeleteCategoryResponse reports_service_delete_category(category_id=category_id, table_name=table_name)

Summary: Delete a category Description: Delete a report category

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_category_response import Reportsv3DeleteCategoryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_id = 'category_id_example' # str | category id. (optional)
    table_name = 'table_name_example' # str | table name. (optional)

    try:
        # Summary: Delete a category Description: Delete a report category
        api_response = api_instance.reports_service_delete_category(category_id=category_id, table_name=table_name)
        print("The response of ReportsServiceApi->reports_service_delete_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**| category id. | [optional] 
 **table_name** | **str**| table name. | [optional] 

### Return type

[**Reportsv3DeleteCategoryResponse**](Reportsv3DeleteCategoryResponse.md)

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

# **reports_service_delete_chart**
> Reportsv3DeleteChartResponse reports_service_delete_chart(chart_id)

Summary: Delete chart Description: Delete a custom chart.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_chart_response import Reportsv3DeleteChartResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | The id of the chart to be deleted.

    try:
        # Summary: Delete chart Description: Delete a custom chart.
        api_response = api_instance.reports_service_delete_chart(chart_id)
        print("The response of ReportsServiceApi->reports_service_delete_chart:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_chart: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| The id of the chart to be deleted. | 

### Return type

[**Reportsv3DeleteChartResponse**](Reportsv3DeleteChartResponse.md)

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

# **reports_service_delete_chart_templatev2**
> Reportsv3DeleteChartTemplatev2Response reports_service_delete_chart_templatev2(template_id)

Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_chart_templatev2_response import Reportsv3DeleteChartTemplatev2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    template_id = 'template_id_example' # str | Unique template ID.

    try:
        # Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
        api_response = api_instance.reports_service_delete_chart_templatev2(template_id)
        print("The response of ReportsServiceApi->reports_service_delete_chart_templatev2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_chart_templatev2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| Unique template ID. | 

### Return type

[**Reportsv3DeleteChartTemplatev2Response**](Reportsv3DeleteChartTemplatev2Response.md)

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

# **reports_service_delete_chartv2**
> Reportsv3DeleteChartv2Response reports_service_delete_chartv2(chart_id)

Summary: Delete chart v2 Description: Delete a custom VEGA chart.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_chartv2_response import Reportsv3DeleteChartv2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | The ID of the chart for deletion.

    try:
        # Summary: Delete chart v2 Description: Delete a custom VEGA chart.
        api_response = api_instance.reports_service_delete_chartv2(chart_id)
        print("The response of ReportsServiceApi->reports_service_delete_chartv2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_chartv2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| The ID of the chart for deletion. | 

### Return type

[**Reportsv3DeleteChartv2Response**](Reportsv3DeleteChartv2Response.md)

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

# **reports_service_delete_fields_by_category**
> Reportsv3DeleteFieldsByCategoryResponse reports_service_delete_fields_by_category(header_ids=header_ids, table_name=table_name)

Summary - Delete fields by category Description: Delete category fields based on provided properties.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_fields_by_category_response import Reportsv3DeleteFieldsByCategoryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    header_ids = ['header_ids_example'] # List[str] | Header ids. (optional)
    table_name = 'table_name_example' # str | table name. (optional)

    try:
        # Summary - Delete fields by category Description: Delete category fields based on provided properties.
        api_response = api_instance.reports_service_delete_fields_by_category(header_ids=header_ids, table_name=table_name)
        print("The response of ReportsServiceApi->reports_service_delete_fields_by_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_fields_by_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **header_ids** | [**List[str]**](str.md)| Header ids. | [optional] 
 **table_name** | **str**| table name. | [optional] 

### Return type

[**Reportsv3DeleteFieldsByCategoryResponse**](Reportsv3DeleteFieldsByCategoryResponse.md)

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

# **reports_service_delete_join**
> Reportsv3DeleteJoinResponse reports_service_delete_join(join_id)

Summary: Delete a join Description: Delete a custom join

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_join_response import Reportsv3DeleteJoinResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    join_id = 'join_id_example' # str | The id of the join to be deleted.

    try:
        # Summary: Delete a join Description: Delete a custom join
        api_response = api_instance.reports_service_delete_join(join_id)
        print("The response of ReportsServiceApi->reports_service_delete_join:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_join: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **join_id** | **str**| The id of the join to be deleted. | 

### Return type

[**Reportsv3DeleteJoinResponse**](Reportsv3DeleteJoinResponse.md)

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

# **reports_service_delete_report**
> Reportsv3DeleteReportResponse reports_service_delete_report(report_id)

Summary: Delete report Description: Delete a custom report.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_report_response import Reportsv3DeleteReportResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | The id of the Report to be deleted.

    try:
        # Summary: Delete report Description: Delete a custom report.
        api_response = api_instance.reports_service_delete_report(report_id)
        print("The response of ReportsServiceApi->reports_service_delete_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| The id of the Report to be deleted. | 

### Return type

[**Reportsv3DeleteReportResponse**](Reportsv3DeleteReportResponse.md)

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

# **reports_service_delete_variant**
> Reportsv3DeleteVariantResponse reports_service_delete_variant(variant_id)

Summary: Delete a variant Description: Delete a variant

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_delete_variant_response import Reportsv3DeleteVariantResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    variant_id = 'variant_id_example' # str | The id of the variant to delete

    try:
        # Summary: Delete a variant Description: Delete a variant
        api_response = api_instance.reports_service_delete_variant(variant_id)
        print("The response of ReportsServiceApi->reports_service_delete_variant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_delete_variant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant_id** | **str**| The id of the variant to delete | 

### Return type

[**Reportsv3DeleteVariantResponse**](Reportsv3DeleteVariantResponse.md)

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

# **reports_service_get_categories**
> Reportsv3GetCategoriesResponse reports_service_get_categories(report_id=report_id)

Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_categories_response import Reportsv3GetCategoriesResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | Report ID. (optional)

    try:
        # Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
        api_response = api_instance.reports_service_get_categories(report_id=report_id)
        print("The response of ReportsServiceApi->reports_service_get_categories:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_categories: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Report ID. | [optional] 

### Return type

[**Reportsv3GetCategoriesResponse**](Reportsv3GetCategoriesResponse.md)

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

# **reports_service_get_chart_settings**
> Reportsv3GetChartSettingsResponse reports_service_get_chart_settings(chart_id=chart_id, report_id=report_id)

Summary: Get chart settings Description: Get a custom chart based on provided report id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_settings_response import Reportsv3GetChartSettingsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | Unique Chart ID. (optional)
    report_id = 'report_id_example' # str | Unique Report ID. (optional)

    try:
        # Summary: Get chart settings Description: Get a custom chart based on provided report id.
        api_response = api_instance.reports_service_get_chart_settings(chart_id=chart_id, report_id=report_id)
        print("The response of ReportsServiceApi->reports_service_get_chart_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_chart_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| Unique Chart ID. | [optional] 
 **report_id** | **str**| Unique Report ID. | [optional] 

### Return type

[**Reportsv3GetChartSettingsResponse**](Reportsv3GetChartSettingsResponse.md)

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

# **reports_service_get_chart_settingsv2**
> Reportsv3GetChartSettingsv2Response reports_service_get_chart_settingsv2(chart_id=chart_id, report_id=report_id)

Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_settingsv2_response import Reportsv3GetChartSettingsv2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | Unique Chart ID. (optional)
    report_id = 'report_id_example' # str | Unique Report ID. (optional)

    try:
        # Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
        api_response = api_instance.reports_service_get_chart_settingsv2(chart_id=chart_id, report_id=report_id)
        print("The response of ReportsServiceApi->reports_service_get_chart_settingsv2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_chart_settingsv2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| Unique Chart ID. | [optional] 
 **report_id** | **str**| Unique Report ID. | [optional] 

### Return type

[**Reportsv3GetChartSettingsv2Response**](Reportsv3GetChartSettingsv2Response.md)

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

# **reports_service_get_chart_templatesv2**
> Reportsv3GetChartTemplatesv2Response reports_service_get_chart_templatesv2()

Summary: Get chart template v2 Description: Get all custom VEGA chart templates.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_chart_templatesv2_response import Reportsv3GetChartTemplatesv2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)

    try:
        # Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
        api_response = api_instance.reports_service_get_chart_templatesv2()
        print("The response of ReportsServiceApi->reports_service_get_chart_templatesv2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_chart_templatesv2: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetChartTemplatesv2Response**](Reportsv3GetChartTemplatesv2Response.md)

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

# **reports_service_get_fields_by_categories**
> Reportsv3GetFieldsByCategoriesResponse reports_service_get_fields_by_categories(category_ids=category_ids)

Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_fields_by_categories_response import Reportsv3GetFieldsByCategoriesResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_ids = ['category_ids_example'] # List[str] | Category IDs. (optional)

    try:
        # Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
        api_response = api_instance.reports_service_get_fields_by_categories(category_ids=category_ids)
        print("The response of ReportsServiceApi->reports_service_get_fields_by_categories:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_fields_by_categories: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_ids** | [**List[str]**](str.md)| Category IDs. | [optional] 

### Return type

[**Reportsv3GetFieldsByCategoriesResponse**](Reportsv3GetFieldsByCategoriesResponse.md)

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

# **reports_service_get_fields_by_category**
> Reportsv3GetFieldsByCategoryResponse reports_service_get_fields_by_category(category_id=category_id, report_id=report_id, table_name=table_name)

Summary: Get fields by category Description: Get all category related fields or all possible fields.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_fields_by_category_response import Reportsv3GetFieldsByCategoryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_id = 'category_id_example' # str | Category ID. (optional)
    report_id = 'report_id_example' # str | Report ID. (optional)
    table_name = 'table_name_example' # str | optional table name parameter. (optional)

    try:
        # Summary: Get fields by category Description: Get all category related fields or all possible fields.
        api_response = api_instance.reports_service_get_fields_by_category(category_id=category_id, report_id=report_id, table_name=table_name)
        print("The response of ReportsServiceApi->reports_service_get_fields_by_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_fields_by_category: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**| Category ID. | [optional] 
 **report_id** | **str**| Report ID. | [optional] 
 **table_name** | **str**| optional table name parameter. | [optional] 

### Return type

[**Reportsv3GetFieldsByCategoryResponse**](Reportsv3GetFieldsByCategoryResponse.md)

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

# **reports_service_get_joins**
> Reportsv3GetJoinsResponse reports_service_get_joins(category_id=category_id)

Summary: Get all joins Description: Get all custom joins.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_joins_response import Reportsv3GetJoinsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_id = 'category_id_example' # str | Category ID (Optional). (optional)

    try:
        # Summary: Get all joins Description: Get all custom joins.
        api_response = api_instance.reports_service_get_joins(category_id=category_id)
        print("The response of ReportsServiceApi->reports_service_get_joins:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_joins: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**| Category ID (Optional). | [optional] 

### Return type

[**Reportsv3GetJoinsResponse**](Reportsv3GetJoinsResponse.md)

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

# **reports_service_get_query_by_report_definition**
> Reportsv3GetReportQueryResponse reports_service_get_query_by_report_definition(reportsv3_get_query_by_report_definition_request)

Summary: Get query by report definition Description: Get query by report definition.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_query_by_report_definition_request import Reportsv3GetQueryByReportDefinitionRequest
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_query_response import Reportsv3GetReportQueryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_get_query_by_report_definition_request = ibm_gdsc_sdk_saas.Reportsv3GetQueryByReportDefinitionRequest() # Reportsv3GetQueryByReportDefinitionRequest | 

    try:
        # Summary: Get query by report definition Description: Get query by report definition.
        api_response = api_instance.reports_service_get_query_by_report_definition(reportsv3_get_query_by_report_definition_request)
        print("The response of ReportsServiceApi->reports_service_get_query_by_report_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_query_by_report_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_get_query_by_report_definition_request** | [**Reportsv3GetQueryByReportDefinitionRequest**](Reportsv3GetQueryByReportDefinitionRequest.md)|  | 

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

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

# **reports_service_get_query_by_report_id**
> Reportsv3GetReportQueryResponse reports_service_get_query_by_report_id(reportsv3_get_query_by_report_id_request)

Summary: Get query by report ID Description: Get query by report ID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_query_by_report_id_request import Reportsv3GetQueryByReportIDRequest
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_query_response import Reportsv3GetReportQueryResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_get_query_by_report_id_request = ibm_gdsc_sdk_saas.Reportsv3GetQueryByReportIDRequest() # Reportsv3GetQueryByReportIDRequest | 

    try:
        # Summary: Get query by report ID Description: Get query by report ID.
        api_response = api_instance.reports_service_get_query_by_report_id(reportsv3_get_query_by_report_id_request)
        print("The response of ReportsServiceApi->reports_service_get_query_by_report_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_query_by_report_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_get_query_by_report_id_request** | [**Reportsv3GetQueryByReportIDRequest**](Reportsv3GetQueryByReportIDRequest.md)|  | 

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

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

# **reports_service_get_report_definition**
> Reportsv3GetReportDefinitionResponse reports_service_get_report_definition(report_id)

Summary: Get report definition Description: Get report definition.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_definition_response import Reportsv3GetReportDefinitionResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | Unique Report ID.

    try:
        # Summary: Get report definition Description: Get report definition.
        api_response = api_instance.reports_service_get_report_definition(report_id)
        print("The response of ReportsServiceApi->reports_service_get_report_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_report_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Unique Report ID. | 

### Return type

[**Reportsv3GetReportDefinitionResponse**](Reportsv3GetReportDefinitionResponse.md)

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

# **reports_service_get_report_groups**
> Reportsv3GetReportGroupsResponse reports_service_get_report_groups(groups=groups)

Summary: Get report groups Description: Get reports used by the provided groups.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_groups_response import Reportsv3GetReportGroupsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    groups = ['groups_example'] # List[str] | List of group IDs that should be checked for usage in each report. (optional)

    try:
        # Summary: Get report groups Description: Get reports used by the provided groups.
        api_response = api_instance.reports_service_get_report_groups(groups=groups)
        print("The response of ReportsServiceApi->reports_service_get_report_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_report_groups: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | [**List[str]**](str.md)| List of group IDs that should be checked for usage in each report. | [optional] 

### Return type

[**Reportsv3GetReportGroupsResponse**](Reportsv3GetReportGroupsResponse.md)

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

# **reports_service_get_report_synopsis**
> Reportsv3GetReportSynopsisResponse reports_service_get_report_synopsis(report_id)

Summary: Get report synopsis Description: Return BriefReport.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_synopsis_response import Reportsv3GetReportSynopsisResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | Unique Report ID.

    try:
        # Summary: Get report synopsis Description: Return BriefReport.
        api_response = api_instance.reports_service_get_report_synopsis(report_id)
        print("The response of ReportsServiceApi->reports_service_get_report_synopsis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_report_synopsis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Unique Report ID. | 

### Return type

[**Reportsv3GetReportSynopsisResponse**](Reportsv3GetReportSynopsisResponse.md)

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

# **reports_service_get_report_timestamp_header**
> Reportsv3GetReportTimestampHeaderResponse reports_service_get_report_timestamp_header(category_id=category_id, table_names=table_names)

Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_report_timestamp_header_response import Reportsv3GetReportTimestampHeaderResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_id = 'category_id_example' # str | Category ID parameter. (optional)
    table_names = ['table_names_example'] # List[str] | List of all header tables. (optional)

    try:
        # Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
        api_response = api_instance.reports_service_get_report_timestamp_header(category_id=category_id, table_names=table_names)
        print("The response of ReportsServiceApi->reports_service_get_report_timestamp_header:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_report_timestamp_header: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**| Category ID parameter. | [optional] 
 **table_names** | [**List[str]**](str.md)| List of all header tables. | [optional] 

### Return type

[**Reportsv3GetReportTimestampHeaderResponse**](Reportsv3GetReportTimestampHeaderResponse.md)

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

# **reports_service_get_reports**
> Reportsv3GetReportsResponse reports_service_get_reports(category_id=category_id, table_name=table_name)

Summary: Get reports Description: Get reports list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_reports_response import Reportsv3GetReportsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    category_id = 'category_id_example' # str | Optional Category ID parameter. (optional)
    table_name = 'table_name_example' # str | Optional table name parameter. (optional)

    try:
        # Summary: Get reports Description: Get reports list.
        api_response = api_instance.reports_service_get_reports(category_id=category_id, table_name=table_name)
        print("The response of ReportsServiceApi->reports_service_get_reports:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_reports: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**| Optional Category ID parameter. | [optional] 
 **table_name** | **str**| Optional table name parameter. | [optional] 

### Return type

[**Reportsv3GetReportsResponse**](Reportsv3GetReportsResponse.md)

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

# **reports_service_get_reports_for_join**
> Reportsv3GetReportsForJoinResponse reports_service_get_reports_for_join(join_id)

Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_reports_for_join_response import Reportsv3GetReportsForJoinResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    join_id = 'join_id_example' # str | 

    try:
        # Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
        api_response = api_instance.reports_service_get_reports_for_join(join_id)
        print("The response of ReportsServiceApi->reports_service_get_reports_for_join:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_reports_for_join: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **join_id** | **str**|  | 

### Return type

[**Reportsv3GetReportsForJoinResponse**](Reportsv3GetReportsForJoinResponse.md)

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

# **reports_service_get_reports_tags**
> Reportsv3GetReportsTagsResponse reports_service_get_reports_tags()

Summary: Get reports tags Description: Get all report distinct tags.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_reports_tags_response import Reportsv3GetReportsTagsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)

    try:
        # Summary: Get reports tags Description: Get all report distinct tags.
        api_response = api_instance.reports_service_get_reports_tags()
        print("The response of ReportsServiceApi->reports_service_get_reports_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_reports_tags: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetReportsTagsResponse**](Reportsv3GetReportsTagsResponse.md)

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

# **reports_service_get_variant**
> Reportsv3GetVariantResponse reports_service_get_variant(variant_id)

Summary: Get a variant Description: Get a given variant

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_variant_response import Reportsv3GetVariantResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    variant_id = 'variant_id_example' # str | The variant id

    try:
        # Summary: Get a variant Description: Get a given variant
        api_response = api_instance.reports_service_get_variant(variant_id)
        print("The response of ReportsServiceApi->reports_service_get_variant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_variant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant_id** | **str**| The variant id | 

### Return type

[**Reportsv3GetVariantResponse**](Reportsv3GetVariantResponse.md)

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

# **reports_service_get_variants**
> Reportsv3GetVariantsResponse reports_service_get_variants()

Summary: Get all variants Description: Get all variants in reports

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_get_variants_response import Reportsv3GetVariantsResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)

    try:
        # Summary: Get all variants Description: Get all variants in reports
        api_response = api_instance.reports_service_get_variants()
        print("The response of ReportsServiceApi->reports_service_get_variants:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_get_variants: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Reportsv3GetVariantsResponse**](Reportsv3GetVariantsResponse.md)

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

# **reports_service_partial_chart_update**
> Reportsv3PartialChartUpdateResponse reports_service_partial_chart_update(chart_id, reportsv3_partial_chart_update_request)

Summary: Partial chart update Description: Update a custom chart with partial information.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_partial_chart_update_request import Reportsv3PartialChartUpdateRequest
from ibm_gdsc_sdk_saas.models.reportsv3_partial_chart_update_response import Reportsv3PartialChartUpdateResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | Unique chart ID.
    reportsv3_partial_chart_update_request = ibm_gdsc_sdk_saas.Reportsv3PartialChartUpdateRequest() # Reportsv3PartialChartUpdateRequest | 

    try:
        # Summary: Partial chart update Description: Update a custom chart with partial information.
        api_response = api_instance.reports_service_partial_chart_update(chart_id, reportsv3_partial_chart_update_request)
        print("The response of ReportsServiceApi->reports_service_partial_chart_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_partial_chart_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| Unique chart ID. | 
 **reportsv3_partial_chart_update_request** | [**Reportsv3PartialChartUpdateRequest**](Reportsv3PartialChartUpdateRequest.md)|  | 

### Return type

[**Reportsv3PartialChartUpdateResponse**](Reportsv3PartialChartUpdateResponse.md)

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

# **reports_service_partial_report_update**
> Reportsv3PartialReportUpdateResponse reports_service_partial_report_update(report_id, reportsv3_partial_report_update_request)

Summary: Partial report update Description: Update a custom report with partial information.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_partial_report_update_request import Reportsv3PartialReportUpdateRequest
from ibm_gdsc_sdk_saas.models.reportsv3_partial_report_update_response import Reportsv3PartialReportUpdateResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | Unique Report ID.
    reportsv3_partial_report_update_request = ibm_gdsc_sdk_saas.Reportsv3PartialReportUpdateRequest() # Reportsv3PartialReportUpdateRequest | 

    try:
        # Summary: Partial report update Description: Update a custom report with partial information.
        api_response = api_instance.reports_service_partial_report_update(report_id, reportsv3_partial_report_update_request)
        print("The response of ReportsServiceApi->reports_service_partial_report_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_partial_report_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Unique Report ID. | 
 **reportsv3_partial_report_update_request** | [**Reportsv3PartialReportUpdateRequest**](Reportsv3PartialReportUpdateRequest.md)|  | 

### Return type

[**Reportsv3PartialReportUpdateResponse**](Reportsv3PartialReportUpdateResponse.md)

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

# **reports_service_run_variant_operation**
> Reportsv3RunVariantOperationResponse reports_service_run_variant_operation(reportsv3_run_variant_operation_request)

Summary: Run a variant Description: Run the operations in a variant

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_run_variant_operation_request import Reportsv3RunVariantOperationRequest
from ibm_gdsc_sdk_saas.models.reportsv3_run_variant_operation_response import Reportsv3RunVariantOperationResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_run_variant_operation_request = ibm_gdsc_sdk_saas.Reportsv3RunVariantOperationRequest() # Reportsv3RunVariantOperationRequest | 

    try:
        # Summary: Run a variant Description: Run the operations in a variant
        api_response = api_instance.reports_service_run_variant_operation(reportsv3_run_variant_operation_request)
        print("The response of ReportsServiceApi->reports_service_run_variant_operation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_run_variant_operation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_run_variant_operation_request** | [**Reportsv3RunVariantOperationRequest**](Reportsv3RunVariantOperationRequest.md)|  | 

### Return type

[**Reportsv3RunVariantOperationResponse**](Reportsv3RunVariantOperationResponse.md)

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

# **reports_service_transpose**
> Reportsv3RunReportResponse reports_service_transpose(reportsv3_transpose_request)

Summary: Transpose Description: Return the corresponding full sql data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_run_report_response import Reportsv3RunReportResponse
from ibm_gdsc_sdk_saas.models.reportsv3_transpose_request import Reportsv3TransposeRequest
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    reportsv3_transpose_request = ibm_gdsc_sdk_saas.Reportsv3TransposeRequest() # Reportsv3TransposeRequest | 

    try:
        # Summary: Transpose Description: Return the corresponding full sql data.
        api_response = api_instance.reports_service_transpose(reportsv3_transpose_request)
        print("The response of ReportsServiceApi->reports_service_transpose:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_transpose: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3_transpose_request** | [**Reportsv3TransposeRequest**](Reportsv3TransposeRequest.md)|  | 

### Return type

[**Reportsv3RunReportResponse**](Reportsv3RunReportResponse.md)

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

# **reports_service_update_chart**
> Reportsv3UpdateChartResponse reports_service_update_chart(chart_id, reportsv3_update_chart_request)

Summary: Update chart Description: Update a custom chart.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_update_chart_request import Reportsv3UpdateChartRequest
from ibm_gdsc_sdk_saas.models.reportsv3_update_chart_response import Reportsv3UpdateChartResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | Unique chart ID.
    reportsv3_update_chart_request = ibm_gdsc_sdk_saas.Reportsv3UpdateChartRequest() # Reportsv3UpdateChartRequest | 

    try:
        # Summary: Update chart Description: Update a custom chart.
        api_response = api_instance.reports_service_update_chart(chart_id, reportsv3_update_chart_request)
        print("The response of ReportsServiceApi->reports_service_update_chart:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_update_chart: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| Unique chart ID. | 
 **reportsv3_update_chart_request** | [**Reportsv3UpdateChartRequest**](Reportsv3UpdateChartRequest.md)|  | 

### Return type

[**Reportsv3UpdateChartResponse**](Reportsv3UpdateChartResponse.md)

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

# **reports_service_update_chartv2**
> Reportsv3UpdateChartv2Response reports_service_update_chartv2(chart_id, reportsv3_update_chartv2_request)

Summary: Update chart v2 Description: Update a custom VEGA chart.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_update_chartv2_request import Reportsv3UpdateChartv2Request
from ibm_gdsc_sdk_saas.models.reportsv3_update_chartv2_response import Reportsv3UpdateChartv2Response
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    chart_id = 'chart_id_example' # str | Unique chart ID.
    reportsv3_update_chartv2_request = ibm_gdsc_sdk_saas.Reportsv3UpdateChartv2Request() # Reportsv3UpdateChartv2Request | 

    try:
        # Summary: Update chart v2 Description: Update a custom VEGA chart.
        api_response = api_instance.reports_service_update_chartv2(chart_id, reportsv3_update_chartv2_request)
        print("The response of ReportsServiceApi->reports_service_update_chartv2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_update_chartv2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart_id** | **str**| Unique chart ID. | 
 **reportsv3_update_chartv2_request** | [**Reportsv3UpdateChartv2Request**](Reportsv3UpdateChartv2Request.md)|  | 

### Return type

[**Reportsv3UpdateChartv2Response**](Reportsv3UpdateChartv2Response.md)

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

# **reports_service_update_join**
> Reportsv3UpdateJoinResponse reports_service_update_join(join_id, reportsv3_update_join_request)

Summary: Update a join Description: Update a custom join

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_update_join_request import Reportsv3UpdateJoinRequest
from ibm_gdsc_sdk_saas.models.reportsv3_update_join_response import Reportsv3UpdateJoinResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    join_id = 'join_id_example' # str | Unique join ID.
    reportsv3_update_join_request = ibm_gdsc_sdk_saas.Reportsv3UpdateJoinRequest() # Reportsv3UpdateJoinRequest | 

    try:
        # Summary: Update a join Description: Update a custom join
        api_response = api_instance.reports_service_update_join(join_id, reportsv3_update_join_request)
        print("The response of ReportsServiceApi->reports_service_update_join:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_update_join: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **join_id** | **str**| Unique join ID. | 
 **reportsv3_update_join_request** | [**Reportsv3UpdateJoinRequest**](Reportsv3UpdateJoinRequest.md)|  | 

### Return type

[**Reportsv3UpdateJoinResponse**](Reportsv3UpdateJoinResponse.md)

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

# **reports_service_update_report**
> Reportsv3UpdateReportResponse reports_service_update_report(report_id, reportsv3_update_report_request)

Summary: Update report Description: Update a custom report.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_update_report_request import Reportsv3UpdateReportRequest
from ibm_gdsc_sdk_saas.models.reportsv3_update_report_response import Reportsv3UpdateReportResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    report_id = 'report_id_example' # str | Unique Report ID.
    reportsv3_update_report_request = ibm_gdsc_sdk_saas.Reportsv3UpdateReportRequest() # Reportsv3UpdateReportRequest | 

    try:
        # Summary: Update report Description: Update a custom report.
        api_response = api_instance.reports_service_update_report(report_id, reportsv3_update_report_request)
        print("The response of ReportsServiceApi->reports_service_update_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_update_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Unique Report ID. | 
 **reportsv3_update_report_request** | [**Reportsv3UpdateReportRequest**](Reportsv3UpdateReportRequest.md)|  | 

### Return type

[**Reportsv3UpdateReportResponse**](Reportsv3UpdateReportResponse.md)

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

# **reports_service_update_variant_override**
> Reportsv3UpdateVariantOverrideResponse reports_service_update_variant_override(variant_id, reportsv3_update_variant_override_request)

Summary: Update a variant Description: Update a variant with a custom override

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsv3_update_variant_override_request import Reportsv3UpdateVariantOverrideRequest
from ibm_gdsc_sdk_saas.models.reportsv3_update_variant_override_response import Reportsv3UpdateVariantOverrideResponse
from ibm_gdsc_sdk_saas.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = ibm_gdsc_sdk_saas.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: BasicAuth
configuration = ibm_gdsc_sdk_saas.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.ReportsServiceApi(api_client)
    variant_id = 'variant_id_example' # str | The variant id
    reportsv3_update_variant_override_request = ibm_gdsc_sdk_saas.Reportsv3UpdateVariantOverrideRequest() # Reportsv3UpdateVariantOverrideRequest | 

    try:
        # Summary: Update a variant Description: Update a variant with a custom override
        api_response = api_instance.reports_service_update_variant_override(variant_id, reportsv3_update_variant_override_request)
        print("The response of ReportsServiceApi->reports_service_update_variant_override:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsServiceApi->reports_service_update_variant_override: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant_id** | **str**| The variant id | 
 **reportsv3_update_variant_override_request** | [**Reportsv3UpdateVariantOverrideRequest**](Reportsv3UpdateVariantOverrideRequest.md)|  | 

### Return type

[**Reportsv3UpdateVariantOverrideResponse**](Reportsv3UpdateVariantOverrideResponse.md)

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

