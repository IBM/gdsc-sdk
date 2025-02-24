# ibm_gdsc_sdk_saas.QSDataLoaderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**q_s_data_loader_q_sfile_validator**](QSDataLoaderApi.md#q_s_data_loader_q_sfile_validator) | **POST** /api/v3/data/validation | QSfileValidator - validate the files before insert happend .
[**q_s_data_loader_upload_synthetic_data_loader**](QSDataLoaderApi.md#q_s_data_loader_upload_synthetic_data_loader) | **POST** /api/v3/data/synthetic | UploadSyntheticDataLoader - Insert data into Db after read from .sql file .


# **q_s_data_loader_q_sfile_validator**
> Qsdataloaderv3QSfileValidatorResonse q_s_data_loader_q_sfile_validator(qsdataloaderv3_q_sfile_validator_request)

QSfileValidator - validate the files before insert happend .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_sfile_validator_request import Qsdataloaderv3QSfileValidatorRequest
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_sfile_validator_resonse import Qsdataloaderv3QSfileValidatorResonse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataLoaderApi(api_client)
    qsdataloaderv3_q_sfile_validator_request = ibm_gdsc_sdk_saas.Qsdataloaderv3QSfileValidatorRequest() # Qsdataloaderv3QSfileValidatorRequest | 

    try:
        # QSfileValidator - validate the files before insert happend .
        api_response = api_instance.q_s_data_loader_q_sfile_validator(qsdataloaderv3_q_sfile_validator_request)
        print("The response of QSDataLoaderApi->q_s_data_loader_q_sfile_validator:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataLoaderApi->q_s_data_loader_q_sfile_validator: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qsdataloaderv3_q_sfile_validator_request** | [**Qsdataloaderv3QSfileValidatorRequest**](Qsdataloaderv3QSfileValidatorRequest.md)|  | 

### Return type

[**Qsdataloaderv3QSfileValidatorResonse**](Qsdataloaderv3QSfileValidatorResonse.md)

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

# **q_s_data_loader_upload_synthetic_data_loader**
> Qsdataloaderv3QSyntheticDataLoaderResonse q_s_data_loader_upload_synthetic_data_loader(body)

UploadSyntheticDataLoader - Insert data into Db after read from .sql file .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_synthetic_data_loader_resonse import Qsdataloaderv3QSyntheticDataLoaderResonse
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
    api_instance = ibm_gdsc_sdk_saas.QSDataLoaderApi(api_client)
    body = None # object | 

    try:
        # UploadSyntheticDataLoader - Insert data into Db after read from .sql file .
        api_response = api_instance.q_s_data_loader_upload_synthetic_data_loader(body)
        print("The response of QSDataLoaderApi->q_s_data_loader_upload_synthetic_data_loader:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling QSDataLoaderApi->q_s_data_loader_upload_synthetic_data_loader: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**Qsdataloaderv3QSyntheticDataLoaderResonse**](Qsdataloaderv3QSyntheticDataLoaderResonse.md)

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

