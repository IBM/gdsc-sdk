# ibm_gdsc_sdk_software.NotificationsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notifications_service_create_ticket**](NotificationsServiceApi.md#notifications_service_create_ticket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
[**notifications_service_get_folders**](NotificationsServiceApi.md#notifications_service_get_folders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
[**notifications_service_get_notification_filename**](NotificationsServiceApi.md#notifications_service_get_notification_filename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**notifications_service_get_notification_record**](NotificationsServiceApi.md#notifications_service_get_notification_record) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
[**notifications_service_get_notification_records**](NotificationsServiceApi.md#notifications_service_get_notification_records) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
[**notifications_service_get_ticket_status**](NotificationsServiceApi.md#notifications_service_get_ticket_status) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
[**notifications_service_test_integration**](NotificationsServiceApi.md#notifications_service_test_integration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
[**notifications_service_update_notification_record**](NotificationsServiceApi.md#notifications_service_update_notification_record) | **POST** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.


# **notifications_service_create_ticket**
> Notificationsv3CreateTicketResponse notifications_service_create_ticket(notificationsv3_create_ticket_request)

Summary: Create ticket Description: Create ticket based on information passed in.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_create_ticket_request import Notificationsv3CreateTicketRequest
from ibm_gdsc_sdk_software.models.notificationsv3_create_ticket_response import Notificationsv3CreateTicketResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notificationsv3_create_ticket_request = ibm_gdsc_sdk_software.Notificationsv3CreateTicketRequest() # Notificationsv3CreateTicketRequest | 

    try:
        # Summary: Create ticket Description: Create ticket based on information passed in.
        api_response = api_instance.notifications_service_create_ticket(notificationsv3_create_ticket_request)
        print("The response of NotificationsServiceApi->notifications_service_create_ticket:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_create_ticket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3_create_ticket_request** | [**Notificationsv3CreateTicketRequest**](Notificationsv3CreateTicketRequest.md)|  | 

### Return type

[**Notificationsv3CreateTicketResponse**](Notificationsv3CreateTicketResponse.md)

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

# **notifications_service_get_folders**
> Notificationsv3GetFoldersResponse notifications_service_get_folders(notificationsv3_get_folders_request)

Summary: Get folders Description: Get folder for the integration connection provided.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_get_folders_request import Notificationsv3GetFoldersRequest
from ibm_gdsc_sdk_software.models.notificationsv3_get_folders_response import Notificationsv3GetFoldersResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notificationsv3_get_folders_request = ibm_gdsc_sdk_software.Notificationsv3GetFoldersRequest() # Notificationsv3GetFoldersRequest | 

    try:
        # Summary: Get folders Description: Get folder for the integration connection provided.
        api_response = api_instance.notifications_service_get_folders(notificationsv3_get_folders_request)
        print("The response of NotificationsServiceApi->notifications_service_get_folders:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_get_folders: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3_get_folders_request** | [**Notificationsv3GetFoldersRequest**](Notificationsv3GetFoldersRequest.md)|  | 

### Return type

[**Notificationsv3GetFoldersResponse**](Notificationsv3GetFoldersResponse.md)

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

# **notifications_service_get_notification_filename**
> Notificationsv3GetNotificationFilenameResponse notifications_service_get_notification_filename(notification_id=notification_id)

Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_get_notification_filename_response import Notificationsv3GetNotificationFilenameResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notification_id = 'notification_id_example' # str | Params are located in the requests context (tenant id, user email, notification id). (optional)

    try:
        # Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
        api_response = api_instance.notifications_service_get_notification_filename(notification_id=notification_id)
        print("The response of NotificationsServiceApi->notifications_service_get_notification_filename:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_get_notification_filename: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | **str**| Params are located in the requests context (tenant id, user email, notification id). | [optional] 

### Return type

[**Notificationsv3GetNotificationFilenameResponse**](Notificationsv3GetNotificationFilenameResponse.md)

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

# **notifications_service_get_notification_record**
> Notificationsv3GetNotificationRecordResponse notifications_service_get_notification_record(notification_id)

Summary: Get notification record Description: Return notifications record with the specified ID.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_get_notification_record_response import Notificationsv3GetNotificationRecordResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notification_id = 'notification_id_example' # str | ID for the record to return.

    try:
        # Summary: Get notification record Description: Return notifications record with the specified ID.
        api_response = api_instance.notifications_service_get_notification_record(notification_id)
        print("The response of NotificationsServiceApi->notifications_service_get_notification_record:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_get_notification_record: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | **str**| ID for the record to return. | 

### Return type

[**Notificationsv3GetNotificationRecordResponse**](Notificationsv3GetNotificationRecordResponse.md)

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

# **notifications_service_get_notification_records**
> Notificationsv3GetNotificationRecordsResponse notifications_service_get_notification_records(filter_start_time=filter_start_time, filter_end_time=filter_end_time, filter_state=filter_state, filter_origins=filter_origins, filter_origin_data=filter_origin_data, offset=offset, limit=limit, include_filter_counts=include_filter_counts)

Summary: Get notification records Description: Return notifications records that match the specified filter.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_get_notification_records_response import Notificationsv3GetNotificationRecordsResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    filter_start_time = '2013-10-20T19:20:30+01:00' # datetime | Return records created at this time or later (>=). (optional)
    filter_end_time = '2013-10-20T19:20:30+01:00' # datetime | Return records created before this time (<). (optional)
    filter_state = 'INCLUDE_ALL' # str | Only return record that include the specified state. (optional) (default to 'INCLUDE_ALL')
    filter_origins = ['filter_origins_example'] # List[str] | Only return record that includes the specified origins. (optional)
    filter_origin_data = 'filter_origin_data_example' # str | Only return record that with the specified origin_data. (optional)
    offset = 56 # int | The amount to offset the rows by for pagination. (optional)
    limit = 56 # int | The max amount of rows to return for pagination. (optional)
    include_filter_counts = True # bool | Computing the filter counts is relatively expensive, only compute when needed. (optional)

    try:
        # Summary: Get notification records Description: Return notifications records that match the specified filter.
        api_response = api_instance.notifications_service_get_notification_records(filter_start_time=filter_start_time, filter_end_time=filter_end_time, filter_state=filter_state, filter_origins=filter_origins, filter_origin_data=filter_origin_data, offset=offset, limit=limit, include_filter_counts=include_filter_counts)
        print("The response of NotificationsServiceApi->notifications_service_get_notification_records:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_get_notification_records: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_start_time** | **datetime**| Return records created at this time or later (&gt;&#x3D;). | [optional] 
 **filter_end_time** | **datetime**| Return records created before this time (&lt;). | [optional] 
 **filter_state** | **str**| Only return record that include the specified state. | [optional] [default to &#39;INCLUDE_ALL&#39;]
 **filter_origins** | [**List[str]**](str.md)| Only return record that includes the specified origins. | [optional] 
 **filter_origin_data** | **str**| Only return record that with the specified origin_data. | [optional] 
 **offset** | **int**| The amount to offset the rows by for pagination. | [optional] 
 **limit** | **int**| The max amount of rows to return for pagination. | [optional] 
 **include_filter_counts** | **bool**| Computing the filter counts is relatively expensive, only compute when needed. | [optional] 

### Return type

[**Notificationsv3GetNotificationRecordsResponse**](Notificationsv3GetNotificationRecordsResponse.md)

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

# **notifications_service_get_ticket_status**
> Notificationsv3GetTicketStatusResponse notifications_service_get_ticket_status(ticket_id=ticket_id, integration_id=integration_id)

Summary: Get ticket status Description: Get the status of the given ticket

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_get_ticket_status_response import Notificationsv3GetTicketStatusResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    ticket_id = 'ticket_id_example' # str | The ID of the ticket to fetch. (optional)
    integration_id = 'integration_id_example' # str | The ID of the ticketing integration. (optional)

    try:
        # Summary: Get ticket status Description: Get the status of the given ticket
        api_response = api_instance.notifications_service_get_ticket_status(ticket_id=ticket_id, integration_id=integration_id)
        print("The response of NotificationsServiceApi->notifications_service_get_ticket_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_get_ticket_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticket_id** | **str**| The ID of the ticket to fetch. | [optional] 
 **integration_id** | **str**| The ID of the ticketing integration. | [optional] 

### Return type

[**Notificationsv3GetTicketStatusResponse**](Notificationsv3GetTicketStatusResponse.md)

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

# **notifications_service_test_integration**
> Notificationsv3TestIntegrationResponse notifications_service_test_integration(notificationsv3_test_integration_request)

Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_test_integration_request import Notificationsv3TestIntegrationRequest
from ibm_gdsc_sdk_software.models.notificationsv3_test_integration_response import Notificationsv3TestIntegrationResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notificationsv3_test_integration_request = ibm_gdsc_sdk_software.Notificationsv3TestIntegrationRequest() # Notificationsv3TestIntegrationRequest | 

    try:
        # Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
        api_response = api_instance.notifications_service_test_integration(notificationsv3_test_integration_request)
        print("The response of NotificationsServiceApi->notifications_service_test_integration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_test_integration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3_test_integration_request** | [**Notificationsv3TestIntegrationRequest**](Notificationsv3TestIntegrationRequest.md)|  | 

### Return type

[**Notificationsv3TestIntegrationResponse**](Notificationsv3TestIntegrationResponse.md)

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

# **notifications_service_update_notification_record**
> Notificationsv3UpdateNotificationRecordResponse notifications_service_update_notification_record(notificationsv3_update_notification_record_request)

Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.notificationsv3_update_notification_record_request import Notificationsv3UpdateNotificationRecordRequest
from ibm_gdsc_sdk_software.models.notificationsv3_update_notification_record_response import Notificationsv3UpdateNotificationRecordResponse
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
    api_instance = ibm_gdsc_sdk_software.NotificationsServiceApi(api_client)
    notificationsv3_update_notification_record_request = ibm_gdsc_sdk_software.Notificationsv3UpdateNotificationRecordRequest() # Notificationsv3UpdateNotificationRecordRequest | 

    try:
        # Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
        api_response = api_instance.notifications_service_update_notification_record(notificationsv3_update_notification_record_request)
        print("The response of NotificationsServiceApi->notifications_service_update_notification_record:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationsServiceApi->notifications_service_update_notification_record: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3_update_notification_record_request** | [**Notificationsv3UpdateNotificationRecordRequest**](Notificationsv3UpdateNotificationRecordRequest.md)|  | 

### Return type

[**Notificationsv3UpdateNotificationRecordResponse**](Notificationsv3UpdateNotificationRecordResponse.md)

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

