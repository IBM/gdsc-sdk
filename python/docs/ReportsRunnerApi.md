# ibm_gdsc_sdk_saas.ReportsRunnerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reports_runner_get_active_queries**](ReportsRunnerApi.md#reports_runner_get_active_queries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
[**reports_runner_get_audit_data_count**](ReportsRunnerApi.md#reports_runner_get_audit_data_count) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
[**reports_runner_get_chart_data**](ReportsRunnerApi.md#reports_runner_get_chart_data) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**reports_runner_get_chart_datav2**](ReportsRunnerApi.md#reports_runner_get_chart_datav2) | **POST** /api/v3/flex-charts/run | 
[**reports_runner_get_report_column_facet**](ReportsRunnerApi.md#reports_runner_get_report_column_facet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
[**reports_runner_get_report_data_count**](ReportsRunnerApi.md#reports_runner_get_report_data_count) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
[**reports_runner_run_audit_report**](ReportsRunnerApi.md#reports_runner_run_audit_report) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
[**reports_runner_run_report**](ReportsRunnerApi.md#reports_runner_run_report) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
[**reports_runner_stop_query**](ReportsRunnerApi.md#reports_runner_stop_query) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id


# **reports_runner_get_active_queries**
> Reportsrunnerv3GetActiveQueriesResponse reports_runner_get_active_queries(reportsrunnerv3_get_active_queries_request)

Summary: Get running queries Description: Get queries that are running more than certain time

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_active_queries_request import Reportsrunnerv3GetActiveQueriesRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_active_queries_response import Reportsrunnerv3GetActiveQueriesResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_get_active_queries_request = ibm_gdsc_sdk_saas.Reportsrunnerv3GetActiveQueriesRequest() # Reportsrunnerv3GetActiveQueriesRequest | 

    try:
        # Summary: Get running queries Description: Get queries that are running more than certain time
        api_response = api_instance.reports_runner_get_active_queries(reportsrunnerv3_get_active_queries_request)
        print("The response of ReportsRunnerApi->reports_runner_get_active_queries:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_active_queries: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_get_active_queries_request** | [**Reportsrunnerv3GetActiveQueriesRequest**](Reportsrunnerv3GetActiveQueriesRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetActiveQueriesResponse**](Reportsrunnerv3GetActiveQueriesResponse.md)

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

# **reports_runner_get_audit_data_count**
> Reportsrunnerv3GetReportDataCountResponse reports_runner_get_audit_data_count(report_id, reportsrunnerv3_get_audit_data_count_request)

Summary: Get audit data count Description: Get audit data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_audit_data_count_request import Reportsrunnerv3GetAuditDataCountRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_data_count_response import Reportsrunnerv3GetReportDataCountResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    report_id = 'report_id_example' # str | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
    reportsrunnerv3_get_audit_data_count_request = ibm_gdsc_sdk_saas.Reportsrunnerv3GetAuditDataCountRequest() # Reportsrunnerv3GetAuditDataCountRequest | 

    try:
        # Summary: Get audit data count Description: Get audit data.
        api_response = api_instance.reports_runner_get_audit_data_count(report_id, reportsrunnerv3_get_audit_data_count_request)
        print("The response of ReportsRunnerApi->reports_runner_get_audit_data_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_audit_data_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | 
 **reportsrunnerv3_get_audit_data_count_request** | [**Reportsrunnerv3GetAuditDataCountRequest**](Reportsrunnerv3GetAuditDataCountRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

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

# **reports_runner_get_chart_data**
> Reportsrunnerv3GetChartDataResponse reports_runner_get_chart_data(reportsrunnerv3_get_chart_data_request)

Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_chart_data_request import Reportsrunnerv3GetChartDataRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_chart_data_response import Reportsrunnerv3GetChartDataResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_get_chart_data_request = ibm_gdsc_sdk_saas.Reportsrunnerv3GetChartDataRequest() # Reportsrunnerv3GetChartDataRequest | 

    try:
        # Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
        api_response = api_instance.reports_runner_get_chart_data(reportsrunnerv3_get_chart_data_request)
        print("The response of ReportsRunnerApi->reports_runner_get_chart_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_chart_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_get_chart_data_request** | [**Reportsrunnerv3GetChartDataRequest**](Reportsrunnerv3GetChartDataRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetChartDataResponse**](Reportsrunnerv3GetChartDataResponse.md)

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

# **reports_runner_get_chart_datav2**
> Reportsrunnerv3GetChartDataResponsev2 reports_runner_get_chart_datav2(reportsrunnerv3_get_chart_data_requestv2)

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_chart_data_requestv2 import Reportsrunnerv3GetChartDataRequestv2
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_chart_data_responsev2 import Reportsrunnerv3GetChartDataResponsev2
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_get_chart_data_requestv2 = ibm_gdsc_sdk_saas.Reportsrunnerv3GetChartDataRequestv2() # Reportsrunnerv3GetChartDataRequestv2 | 

    try:
        api_response = api_instance.reports_runner_get_chart_datav2(reportsrunnerv3_get_chart_data_requestv2)
        print("The response of ReportsRunnerApi->reports_runner_get_chart_datav2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_chart_datav2: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_get_chart_data_requestv2** | [**Reportsrunnerv3GetChartDataRequestv2**](Reportsrunnerv3GetChartDataRequestv2.md)|  | 

### Return type

[**Reportsrunnerv3GetChartDataResponsev2**](Reportsrunnerv3GetChartDataResponsev2.md)

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

# **reports_runner_get_report_column_facet**
> Reportsrunnerv3GetReportColumnFacetResponse reports_runner_get_report_column_facet(reportsrunnerv3_get_report_column_facet_request)

Summary: Get report column facet Description: Get counts that is group by values for the selected column.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_column_facet_request import Reportsrunnerv3GetReportColumnFacetRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_column_facet_response import Reportsrunnerv3GetReportColumnFacetResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_get_report_column_facet_request = ibm_gdsc_sdk_saas.Reportsrunnerv3GetReportColumnFacetRequest() # Reportsrunnerv3GetReportColumnFacetRequest | 

    try:
        # Summary: Get report column facet Description: Get counts that is group by values for the selected column.
        api_response = api_instance.reports_runner_get_report_column_facet(reportsrunnerv3_get_report_column_facet_request)
        print("The response of ReportsRunnerApi->reports_runner_get_report_column_facet:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_report_column_facet: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_get_report_column_facet_request** | [**Reportsrunnerv3GetReportColumnFacetRequest**](Reportsrunnerv3GetReportColumnFacetRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetReportColumnFacetResponse**](Reportsrunnerv3GetReportColumnFacetResponse.md)

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

# **reports_runner_get_report_data_count**
> Reportsrunnerv3GetReportDataCountResponse reports_runner_get_report_data_count(reportsrunnerv3_get_report_data_count_request)

Summary: Get report data count Description: Get report data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_data_count_request import Reportsrunnerv3GetReportDataCountRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_get_report_data_count_response import Reportsrunnerv3GetReportDataCountResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_get_report_data_count_request = ibm_gdsc_sdk_saas.Reportsrunnerv3GetReportDataCountRequest() # Reportsrunnerv3GetReportDataCountRequest | 

    try:
        # Summary: Get report data count Description: Get report data.
        api_response = api_instance.reports_runner_get_report_data_count(reportsrunnerv3_get_report_data_count_request)
        print("The response of ReportsRunnerApi->reports_runner_get_report_data_count:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_get_report_data_count: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_get_report_data_count_request** | [**Reportsrunnerv3GetReportDataCountRequest**](Reportsrunnerv3GetReportDataCountRequest.md)|  | 

### Return type

[**Reportsrunnerv3GetReportDataCountResponse**](Reportsrunnerv3GetReportDataCountResponse.md)

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

# **reports_runner_run_audit_report**
> StreamResultOfReportsrunnerv3RunReportResponse reports_runner_run_audit_report(report_id, reportsrunnerv3_run_audit_report_request)

Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_run_audit_report_request import Reportsrunnerv3RunAuditReportRequest
from ibm_gdsc_sdk_saas.models.stream_result_of_reportsrunnerv3_run_report_response import StreamResultOfReportsrunnerv3RunReportResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    report_id = 'report_id_example' # str | The ID of the Report we wish to run (e.g. 000000000000000000000905).
    reportsrunnerv3_run_audit_report_request = ibm_gdsc_sdk_saas.Reportsrunnerv3RunAuditReportRequest() # Reportsrunnerv3RunAuditReportRequest | 

    try:
        # Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
        api_response = api_instance.reports_runner_run_audit_report(report_id, reportsrunnerv3_run_audit_report_request)
        print("The response of ReportsRunnerApi->reports_runner_run_audit_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_run_audit_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| The ID of the Report we wish to run (e.g. 000000000000000000000905). | 
 **reportsrunnerv3_run_audit_report_request** | [**Reportsrunnerv3RunAuditReportRequest**](Reportsrunnerv3RunAuditReportRequest.md)|  | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reports_runner_run_report**
> StreamResultOfReportsrunnerv3RunReportResponse reports_runner_run_report(reportsrunnerv3_run_report_request)

Summary: Run report Description: Run report by report ID or by specifying report definition.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_run_report_request import Reportsrunnerv3RunReportRequest
from ibm_gdsc_sdk_saas.models.stream_result_of_reportsrunnerv3_run_report_response import StreamResultOfReportsrunnerv3RunReportResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_run_report_request = ibm_gdsc_sdk_saas.Reportsrunnerv3RunReportRequest() # Reportsrunnerv3RunReportRequest | 

    try:
        # Summary: Run report Description: Run report by report ID or by specifying report definition.
        api_response = api_instance.reports_runner_run_report(reportsrunnerv3_run_report_request)
        print("The response of ReportsRunnerApi->reports_runner_run_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_run_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_run_report_request** | [**Reportsrunnerv3RunReportRequest**](Reportsrunnerv3RunReportRequest.md)|  | 

### Return type

[**StreamResultOfReportsrunnerv3RunReportResponse**](StreamResultOfReportsrunnerv3RunReportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reports_runner_stop_query**
> Reportsrunnerv3StopQueryResponse reports_runner_stop_query(reportsrunnerv3_stop_query_request)

Summary: Stop query Description: Stop a query based on the id

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_query_request import Reportsrunnerv3StopQueryRequest
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_stop_query_response import Reportsrunnerv3StopQueryResponse
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
    api_instance = ibm_gdsc_sdk_saas.ReportsRunnerApi(api_client)
    reportsrunnerv3_stop_query_request = ibm_gdsc_sdk_saas.Reportsrunnerv3StopQueryRequest() # Reportsrunnerv3StopQueryRequest | 

    try:
        # Summary: Stop query Description: Stop a query based on the id
        api_response = api_instance.reports_runner_stop_query(reportsrunnerv3_stop_query_request)
        print("The response of ReportsRunnerApi->reports_runner_stop_query:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsRunnerApi->reports_runner_stop_query: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3_stop_query_request** | [**Reportsrunnerv3StopQueryRequest**](Reportsrunnerv3StopQueryRequest.md)|  | 

### Return type

[**Reportsrunnerv3StopQueryResponse**](Reportsrunnerv3StopQueryResponse.md)

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

