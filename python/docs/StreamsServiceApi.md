# ibm_gdsc_sdk_saas.StreamsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streams_service_check_aws_credentials**](StreamsServiceApi.md#streams_service_check_aws_credentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
[**streams_service_check_azure_event_hub**](StreamsServiceApi.md#streams_service_check_azure_event_hub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
[**streams_service_check_azure_storage_string**](StreamsServiceApi.md#streams_service_check_azure_storage_string) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
[**streams_service_get_aws_regions**](StreamsServiceApi.md#streams_service_get_aws_regions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
[**streams_service_list_aws_streams**](StreamsServiceApi.md#streams_service_list_aws_streams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.


# **streams_service_check_aws_credentials**
> Streamsv3CheckAWSCredentialsResponse streams_service_check_aws_credentials(streamsv3_check_aws_credentials_request)

Summary: Check AWS credentials Description: Service to verify AWS credentials.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.streamsv3_check_aws_credentials_request import Streamsv3CheckAWSCredentialsRequest
from ibm_gdsc_sdk_saas.models.streamsv3_check_aws_credentials_response import Streamsv3CheckAWSCredentialsResponse
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
    api_instance = ibm_gdsc_sdk_saas.StreamsServiceApi(api_client)
    streamsv3_check_aws_credentials_request = ibm_gdsc_sdk_saas.Streamsv3CheckAWSCredentialsRequest() # Streamsv3CheckAWSCredentialsRequest | 

    try:
        # Summary: Check AWS credentials Description: Service to verify AWS credentials.
        api_response = api_instance.streams_service_check_aws_credentials(streamsv3_check_aws_credentials_request)
        print("The response of StreamsServiceApi->streams_service_check_aws_credentials:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StreamsServiceApi->streams_service_check_aws_credentials: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3_check_aws_credentials_request** | [**Streamsv3CheckAWSCredentialsRequest**](Streamsv3CheckAWSCredentialsRequest.md)|  | 

### Return type

[**Streamsv3CheckAWSCredentialsResponse**](Streamsv3CheckAWSCredentialsResponse.md)

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

# **streams_service_check_azure_event_hub**
> Streamsv3CheckAzureEventHubResponse streams_service_check_azure_event_hub(streamsv3_check_azure_event_hub_request)

Summary: Check Azure event hub Description: Service to check Azure event hub.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_event_hub_request import Streamsv3CheckAzureEventHubRequest
from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_event_hub_response import Streamsv3CheckAzureEventHubResponse
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
    api_instance = ibm_gdsc_sdk_saas.StreamsServiceApi(api_client)
    streamsv3_check_azure_event_hub_request = ibm_gdsc_sdk_saas.Streamsv3CheckAzureEventHubRequest() # Streamsv3CheckAzureEventHubRequest | 

    try:
        # Summary: Check Azure event hub Description: Service to check Azure event hub.
        api_response = api_instance.streams_service_check_azure_event_hub(streamsv3_check_azure_event_hub_request)
        print("The response of StreamsServiceApi->streams_service_check_azure_event_hub:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StreamsServiceApi->streams_service_check_azure_event_hub: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3_check_azure_event_hub_request** | [**Streamsv3CheckAzureEventHubRequest**](Streamsv3CheckAzureEventHubRequest.md)|  | 

### Return type

[**Streamsv3CheckAzureEventHubResponse**](Streamsv3CheckAzureEventHubResponse.md)

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

# **streams_service_check_azure_storage_string**
> Streamsv3CheckAzureStorageStringResponse streams_service_check_azure_storage_string(streamsv3_check_azure_storage_string_request)

Summary: Check Azure storage string Description: Service to verify Azure storage connection.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_storage_string_request import Streamsv3CheckAzureStorageStringRequest
from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_storage_string_response import Streamsv3CheckAzureStorageStringResponse
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

# Configure API key authorization: ApiKeyAuth
configuration.api_key['ApiKeyAuth'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['ApiKeyAuth'] = 'Bearer'

# Enter a context with an instance of the API client
with ibm_gdsc_sdk_saas.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ibm_gdsc_sdk_saas.StreamsServiceApi(api_client)
    streamsv3_check_azure_storage_string_request = ibm_gdsc_sdk_saas.Streamsv3CheckAzureStorageStringRequest() # Streamsv3CheckAzureStorageStringRequest | 

    try:
        # Summary: Check Azure storage string Description: Service to verify Azure storage connection.
        api_response = api_instance.streams_service_check_azure_storage_string(streamsv3_check_azure_storage_string_request)
        print("The response of StreamsServiceApi->streams_service_check_azure_storage_string:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StreamsServiceApi->streams_service_check_azure_storage_string: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3_check_azure_storage_string_request** | [**Streamsv3CheckAzureStorageStringRequest**](Streamsv3CheckAzureStorageStringRequest.md)|  | 

### Return type

[**Streamsv3CheckAzureStorageStringResponse**](Streamsv3CheckAzureStorageStringResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **streams_service_get_aws_regions**
> Streamsv3GetAWSRegionsResponse streams_service_get_aws_regions()

Summary: Get AWS regions Description: Service to get AWS regions.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.streamsv3_get_aws_regions_response import Streamsv3GetAWSRegionsResponse
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
    api_instance = ibm_gdsc_sdk_saas.StreamsServiceApi(api_client)

    try:
        # Summary: Get AWS regions Description: Service to get AWS regions.
        api_response = api_instance.streams_service_get_aws_regions()
        print("The response of StreamsServiceApi->streams_service_get_aws_regions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StreamsServiceApi->streams_service_get_aws_regions: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Streamsv3GetAWSRegionsResponse**](Streamsv3GetAWSRegionsResponse.md)

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

# **streams_service_list_aws_streams**
> Streamsv3ListAWSStreamsResponse streams_service_list_aws_streams(streamsv3_list_aws_streams_request)

Summary: List AWS streams Description: Service to list AWS Kinesis streams.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.streamsv3_list_aws_streams_request import Streamsv3ListAWSStreamsRequest
from ibm_gdsc_sdk_saas.models.streamsv3_list_aws_streams_response import Streamsv3ListAWSStreamsResponse
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
    api_instance = ibm_gdsc_sdk_saas.StreamsServiceApi(api_client)
    streamsv3_list_aws_streams_request = ibm_gdsc_sdk_saas.Streamsv3ListAWSStreamsRequest() # Streamsv3ListAWSStreamsRequest | 

    try:
        # Summary: List AWS streams Description: Service to list AWS Kinesis streams.
        api_response = api_instance.streams_service_list_aws_streams(streamsv3_list_aws_streams_request)
        print("The response of StreamsServiceApi->streams_service_list_aws_streams:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling StreamsServiceApi->streams_service_list_aws_streams: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3_list_aws_streams_request** | [**Streamsv3ListAWSStreamsRequest**](Streamsv3ListAWSStreamsRequest.md)|  | 

### Return type

[**Streamsv3ListAWSStreamsResponse**](Streamsv3ListAWSStreamsResponse.md)

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

