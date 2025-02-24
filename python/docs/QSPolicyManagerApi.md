# ibm_gdsc_sdk_saas.QSPolicyManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**q_s_policy_manager_batch_status_update**](QSPolicyManagerApi.md#q_s_policy_manager_batch_status_update) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**q_s_policy_manager_config_update**](QSPolicyManagerApi.md#q_s_policy_manager_config_update) | **PATCH** /api/v3/policy_manager/configs | ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
[**q_s_policy_manager_create_ticket**](QSPolicyManagerApi.md#q_s_policy_manager_create_ticket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**q_s_policy_manager_fetch_filesfrom_buckets**](QSPolicyManagerApi.md#q_s_policy_manager_fetch_filesfrom_buckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**q_s_policy_manager_process_policy_dimention_records**](QSPolicyManagerApi.md#q_s_policy_manager_process_policy_dimention_records) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**q_s_policy_manager_update_ticket_status**](QSPolicyManagerApi.md#q_s_policy_manager_update_ticket_status) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .


# **q_s_policy_manager_batch_status_update**
> Qspmpolicymanagerv3StandardEmptyResponse q_s_policy_manager_batch_status_update(body)

BatchStatusUpdate - trigger the batch to update the status of the Ticket .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_standard_empty_response import Qspmpolicymanagerv3StandardEmptyResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)
    body = None # object | 

    try:
        # BatchStatusUpdate - trigger the batch to update the status of the Ticket .
        api_response = api_instance.q_s_policy_manager_batch_status_update(body)
        print("The response of QSPolicyManagerApi->q_s_policy_manager_batch_status_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_batch_status_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**Qspmpolicymanagerv3StandardEmptyResponse**](Qspmpolicymanagerv3StandardEmptyResponse.md)

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

# **q_s_policy_manager_config_update**
> Qspmpolicymanagerv3APIResonse q_s_policy_manager_config_update(qspmpolicymanagerv3_update_configs_request)

ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_api_resonse import Qspmpolicymanagerv3APIResonse
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_configs_request import Qspmpolicymanagerv3UpdateConfigsRequest
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)
    qspmpolicymanagerv3_update_configs_request = ibm_gdsc_sdk_saas.Qspmpolicymanagerv3UpdateConfigsRequest() # Qspmpolicymanagerv3UpdateConfigsRequest | 

    try:
        # ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
        api_response = api_instance.q_s_policy_manager_config_update(qspmpolicymanagerv3_update_configs_request)
        print("The response of QSPolicyManagerApi->q_s_policy_manager_config_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_config_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3_update_configs_request** | [**Qspmpolicymanagerv3UpdateConfigsRequest**](Qspmpolicymanagerv3UpdateConfigsRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3APIResonse**](Qspmpolicymanagerv3APIResonse.md)

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

# **q_s_policy_manager_create_ticket**
> Qspmpolicymanagerv3CreateTicketResponse q_s_policy_manager_create_ticket(qspmpolicymanagerv3_create_ticket_request)

CreateTicket - Create a new Incident .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_create_ticket_request import Qspmpolicymanagerv3CreateTicketRequest
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_create_ticket_response import Qspmpolicymanagerv3CreateTicketResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)
    qspmpolicymanagerv3_create_ticket_request = ibm_gdsc_sdk_saas.Qspmpolicymanagerv3CreateTicketRequest() # Qspmpolicymanagerv3CreateTicketRequest | 

    try:
        # CreateTicket - Create a new Incident .
        api_response = api_instance.q_s_policy_manager_create_ticket(qspmpolicymanagerv3_create_ticket_request)
        print("The response of QSPolicyManagerApi->q_s_policy_manager_create_ticket:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_create_ticket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3_create_ticket_request** | [**Qspmpolicymanagerv3CreateTicketRequest**](Qspmpolicymanagerv3CreateTicketRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3CreateTicketResponse**](Qspmpolicymanagerv3CreateTicketResponse.md)

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

# **q_s_policy_manager_fetch_filesfrom_buckets**
> Qspmpolicymanagerv3FetchObjectStoreFileResponse q_s_policy_manager_fetch_filesfrom_buckets()

FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_fetch_object_store_file_response import Qspmpolicymanagerv3FetchObjectStoreFileResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)

    try:
        # FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
        api_response = api_instance.q_s_policy_manager_fetch_filesfrom_buckets()
        print("The response of QSPolicyManagerApi->q_s_policy_manager_fetch_filesfrom_buckets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_fetch_filesfrom_buckets: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Qspmpolicymanagerv3FetchObjectStoreFileResponse**](Qspmpolicymanagerv3FetchObjectStoreFileResponse.md)

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

# **q_s_policy_manager_process_policy_dimention_records**
> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse q_s_policy_manager_process_policy_dimention_records(qspmpolicymanagerv3_process_policy_dimention_records_request)

ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_process_policy_dimention_records_request import Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_process_policy_dimention_records_resonse import Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)
    qspmpolicymanagerv3_process_policy_dimention_records_request = ibm_gdsc_sdk_saas.Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest() # Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest | 

    try:
        # ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
        api_response = api_instance.q_s_policy_manager_process_policy_dimention_records(qspmpolicymanagerv3_process_policy_dimention_records_request)
        print("The response of QSPolicyManagerApi->q_s_policy_manager_process_policy_dimention_records:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_process_policy_dimention_records: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3_process_policy_dimention_records_request** | [**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**](Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse.md)

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

# **q_s_policy_manager_update_ticket_status**
> Qspmpolicymanagerv3UpdateTicketStatusResponse q_s_policy_manager_update_ticket_status(qspmpolicymanagerv3_update_ticket_status_request)

UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_ticket_status_request import Qspmpolicymanagerv3UpdateTicketStatusRequest
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_ticket_status_response import Qspmpolicymanagerv3UpdateTicketStatusResponse
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
    api_instance = ibm_gdsc_sdk_saas.QSPolicyManagerApi(api_client)
    qspmpolicymanagerv3_update_ticket_status_request = ibm_gdsc_sdk_saas.Qspmpolicymanagerv3UpdateTicketStatusRequest() # Qspmpolicymanagerv3UpdateTicketStatusRequest | 

    try:
        # UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
        api_response = api_instance.q_s_policy_manager_update_ticket_status(qspmpolicymanagerv3_update_ticket_status_request)
        print("The response of QSPolicyManagerApi->q_s_policy_manager_update_ticket_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSPolicyManagerApi->q_s_policy_manager_update_ticket_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3_update_ticket_status_request** | [**Qspmpolicymanagerv3UpdateTicketStatusRequest**](Qspmpolicymanagerv3UpdateTicketStatusRequest.md)|  | 

### Return type

[**Qspmpolicymanagerv3UpdateTicketStatusResponse**](Qspmpolicymanagerv3UpdateTicketStatusResponse.md)

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

