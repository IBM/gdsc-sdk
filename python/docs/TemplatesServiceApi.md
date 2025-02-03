# ibm_gdsc_sdk_software.TemplatesServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templates_service_create_integration**](TemplatesServiceApi.md#templates_service_create_integration) | **POST** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
[**templates_service_create_template**](TemplatesServiceApi.md#templates_service_create_template) | **POST** /api/v3/templates | Summary: Create template Description: Create a new template.
[**templates_service_delete_integration**](TemplatesServiceApi.md#templates_service_delete_integration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
[**templates_service_delete_template**](TemplatesServiceApi.md#templates_service_delete_template) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
[**templates_service_get_origin_default_content**](TemplatesServiceApi.md#templates_service_get_origin_default_content) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
[**templates_service_get_origin_fields**](TemplatesServiceApi.md#templates_service_get_origin_fields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
[**templates_service_get_template**](TemplatesServiceApi.md#templates_service_get_template) | **GET** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
[**templates_service_get_templates**](TemplatesServiceApi.md#templates_service_get_templates) | **GET** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
[**templates_service_test_template**](TemplatesServiceApi.md#templates_service_test_template) | **POST** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
[**templates_service_transform_template**](TemplatesServiceApi.md#templates_service_transform_template) | **POST** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
[**templates_service_transform_template_json**](TemplatesServiceApi.md#templates_service_transform_template_json) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
[**templates_service_update_template**](TemplatesServiceApi.md#templates_service_update_template) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.


# **templates_service_create_integration**
> Templatesv3CreateIntegrationResponse templates_service_create_integration(templatesv3_create_integration_request)

Summary: Create integration Description: Create a set of new templates for a new integration.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_create_integration_request import Templatesv3CreateIntegrationRequest
from ibm_gdsc_sdk_software.models.templatesv3_create_integration_response import Templatesv3CreateIntegrationResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    templatesv3_create_integration_request = ibm_gdsc_sdk_software.Templatesv3CreateIntegrationRequest() # Templatesv3CreateIntegrationRequest | 

    try:
        # Summary: Create integration Description: Create a set of new templates for a new integration.
        api_response = api_instance.templates_service_create_integration(templatesv3_create_integration_request)
        print("The response of TemplatesServiceApi->templates_service_create_integration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_create_integration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3_create_integration_request** | [**Templatesv3CreateIntegrationRequest**](Templatesv3CreateIntegrationRequest.md)|  | 

### Return type

[**Templatesv3CreateIntegrationResponse**](Templatesv3CreateIntegrationResponse.md)

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

# **templates_service_create_template**
> Templatesv3CreateTemplateResponse templates_service_create_template(templatesv3_create_template_request)

Summary: Create template Description: Create a new template.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_create_template_request import Templatesv3CreateTemplateRequest
from ibm_gdsc_sdk_software.models.templatesv3_create_template_response import Templatesv3CreateTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    templatesv3_create_template_request = ibm_gdsc_sdk_software.Templatesv3CreateTemplateRequest() # Templatesv3CreateTemplateRequest | 

    try:
        # Summary: Create template Description: Create a new template.
        api_response = api_instance.templates_service_create_template(templatesv3_create_template_request)
        print("The response of TemplatesServiceApi->templates_service_create_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_create_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3_create_template_request** | [**Templatesv3CreateTemplateRequest**](Templatesv3CreateTemplateRequest.md)|  | 

### Return type

[**Templatesv3CreateTemplateResponse**](Templatesv3CreateTemplateResponse.md)

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

# **templates_service_delete_integration**
> Templatesv3DeleteIntegrationResponse templates_service_delete_integration(integration_id)

Summary: Delete integration Description: Delete all templates associated with an integration.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_delete_integration_response import Templatesv3DeleteIntegrationResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    integration_id = 'integration_id_example' # str | Delete the templates associated with the specified integration ID.

    try:
        # Summary: Delete integration Description: Delete all templates associated with an integration.
        api_response = api_instance.templates_service_delete_integration(integration_id)
        print("The response of TemplatesServiceApi->templates_service_delete_integration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_delete_integration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_id** | **str**| Delete the templates associated with the specified integration ID. | 

### Return type

[**Templatesv3DeleteIntegrationResponse**](Templatesv3DeleteIntegrationResponse.md)

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

# **templates_service_delete_template**
> Templatesv3DeleteTemplateResponse templates_service_delete_template(template_id)

Summary: Delete template Description: Delete a specific template.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_delete_template_response import Templatesv3DeleteTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    template_id = 'template_id_example' # str | Delete the template with the specified unique ID.

    try:
        # Summary: Delete template Description: Delete a specific template.
        api_response = api_instance.templates_service_delete_template(template_id)
        print("The response of TemplatesServiceApi->templates_service_delete_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_delete_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| Delete the template with the specified unique ID. | 

### Return type

[**Templatesv3DeleteTemplateResponse**](Templatesv3DeleteTemplateResponse.md)

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

# **templates_service_get_origin_default_content**
> Templatesv3GetOriginDefaultContentResponse templates_service_get_origin_default_content(origin, integration=integration, mime_type=mime_type)

Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_get_origin_default_content_response import Templatesv3GetOriginDefaultContentResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    origin = 'origin_example' # str | Origin for the desired content.
    integration = 'UNDEFINED_INTEGRATION' # str | Integration provides the context for the Request. (optional) (default to 'UNDEFINED_INTEGRATION')
    mime_type = 'PLAIN_TEXT' # str | MIME type for the desired content. (optional) (default to 'PLAIN_TEXT')

    try:
        # Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
        api_response = api_instance.templates_service_get_origin_default_content(origin, integration=integration, mime_type=mime_type)
        print("The response of TemplatesServiceApi->templates_service_get_origin_default_content:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_get_origin_default_content: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **str**| Origin for the desired content. | 
 **integration** | **str**| Integration provides the context for the Request. | [optional] [default to &#39;UNDEFINED_INTEGRATION&#39;]
 **mime_type** | **str**| MIME type for the desired content. | [optional] [default to &#39;PLAIN_TEXT&#39;]

### Return type

[**Templatesv3GetOriginDefaultContentResponse**](Templatesv3GetOriginDefaultContentResponse.md)

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

# **templates_service_get_origin_fields**
> Templatesv3GetOriginFieldsResponse templates_service_get_origin_fields(origin)

Summary: Get origin fields Description: Return the fields available with a specific origin.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_get_origin_fields_response import Templatesv3GetOriginFieldsResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    origin = 'origin_example' # str | Origin for the desired fields.

    try:
        # Summary: Get origin fields Description: Return the fields available with a specific origin.
        api_response = api_instance.templates_service_get_origin_fields(origin)
        print("The response of TemplatesServiceApi->templates_service_get_origin_fields:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_get_origin_fields: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **str**| Origin for the desired fields. | 

### Return type

[**Templatesv3GetOriginFieldsResponse**](Templatesv3GetOriginFieldsResponse.md)

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

# **templates_service_get_template**
> Templatesv3GetTemplateResponse templates_service_get_template(template_id, include_integration_name=include_integration_name)

Summary: Get template Description: Return a specific template by id.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_get_template_response import Templatesv3GetTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    template_id = 'template_id_example' # str | The unique ID for the template to fetch.
    include_integration_name = True # bool | Include the Integration name in the returned template. (optional)

    try:
        # Summary: Get template Description: Return a specific template by id.
        api_response = api_instance.templates_service_get_template(template_id, include_integration_name=include_integration_name)
        print("The response of TemplatesServiceApi->templates_service_get_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_get_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| The unique ID for the template to fetch. | 
 **include_integration_name** | **bool**| Include the Integration name in the returned template. | [optional] 

### Return type

[**Templatesv3GetTemplateResponse**](Templatesv3GetTemplateResponse.md)

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

# **templates_service_get_templates**
> Templatesv3GetTemplatesResponse templates_service_get_templates(integration_id=integration_id, filter_integration=filter_integration, filter_origin=filter_origin, filter_mime_type=filter_mime_type, filter_tags=filter_tags, filter_enabled_only=filter_enabled_only, include_integration_name=include_integration_name)

Summary: Get templates Description: Return all templates based on supplied filters.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_get_templates_response import Templatesv3GetTemplatesResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    integration_id = 'integration_id_example' # str | Filter on templates associated with a specific integration. (optional)
    filter_integration = ['filter_integration_example'] # List[str] | Filter on a set of integrations; ignored if empty. (optional)
    filter_origin = ['filter_origin_example'] # List[str] | Filter on a specific set of data origins; ignored if empty. (optional)
    filter_mime_type = ['filter_mime_type_example'] # List[str] | Filter on specific mime types; ignored if empty. (optional)
    filter_tags = ['filter_tags_example'] # List[str] | Filter on specific tags; ignored if empty. (optional)
    filter_enabled_only = True # bool | Filter on all templates instead of just the enabled templates. (optional)
    include_integration_name = True # bool | Include the Integration name in the returned templates. (optional)

    try:
        # Summary: Get templates Description: Return all templates based on supplied filters.
        api_response = api_instance.templates_service_get_templates(integration_id=integration_id, filter_integration=filter_integration, filter_origin=filter_origin, filter_mime_type=filter_mime_type, filter_tags=filter_tags, filter_enabled_only=filter_enabled_only, include_integration_name=include_integration_name)
        print("The response of TemplatesServiceApi->templates_service_get_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_get_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_id** | **str**| Filter on templates associated with a specific integration. | [optional] 
 **filter_integration** | [**List[str]**](str.md)| Filter on a set of integrations; ignored if empty. | [optional] 
 **filter_origin** | [**List[str]**](str.md)| Filter on a specific set of data origins; ignored if empty. | [optional] 
 **filter_mime_type** | [**List[str]**](str.md)| Filter on specific mime types; ignored if empty. | [optional] 
 **filter_tags** | [**List[str]**](str.md)| Filter on specific tags; ignored if empty. | [optional] 
 **filter_enabled_only** | **bool**| Filter on all templates instead of just the enabled templates. | [optional] 
 **include_integration_name** | **bool**| Include the Integration name in the returned templates. | [optional] 

### Return type

[**Templatesv3GetTemplatesResponse**](Templatesv3GetTemplatesResponse.md)

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

# **templates_service_test_template**
> Templatesv3TestTemplateResponse templates_service_test_template(templatesv3_test_template_request)

Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_test_template_request import Templatesv3TestTemplateRequest
from ibm_gdsc_sdk_software.models.templatesv3_test_template_response import Templatesv3TestTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    templatesv3_test_template_request = ibm_gdsc_sdk_software.Templatesv3TestTemplateRequest() # Templatesv3TestTemplateRequest | 

    try:
        # Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
        api_response = api_instance.templates_service_test_template(templatesv3_test_template_request)
        print("The response of TemplatesServiceApi->templates_service_test_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_test_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3_test_template_request** | [**Templatesv3TestTemplateRequest**](Templatesv3TestTemplateRequest.md)|  | 

### Return type

[**Templatesv3TestTemplateResponse**](Templatesv3TestTemplateResponse.md)

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

# **templates_service_transform_template**
> Templatesv3TransformTemplateResponse templates_service_transform_template(templatesv3_transform_template_request)

Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_request import Templatesv3TransformTemplateRequest
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_response import Templatesv3TransformTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    templatesv3_transform_template_request = ibm_gdsc_sdk_software.Templatesv3TransformTemplateRequest() # Templatesv3TransformTemplateRequest | 

    try:
        # Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
        api_response = api_instance.templates_service_transform_template(templatesv3_transform_template_request)
        print("The response of TemplatesServiceApi->templates_service_transform_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_transform_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3_transform_template_request** | [**Templatesv3TransformTemplateRequest**](Templatesv3TransformTemplateRequest.md)|  | 

### Return type

[**Templatesv3TransformTemplateResponse**](Templatesv3TransformTemplateResponse.md)

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

# **templates_service_transform_template_json**
> Templatesv3TransformTemplateJSONResponse templates_service_transform_template_json(templatesv3_transform_template_json_request)

Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_json_request import Templatesv3TransformTemplateJSONRequest
from ibm_gdsc_sdk_software.models.templatesv3_transform_template_json_response import Templatesv3TransformTemplateJSONResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    templatesv3_transform_template_json_request = ibm_gdsc_sdk_software.Templatesv3TransformTemplateJSONRequest() # Templatesv3TransformTemplateJSONRequest | 

    try:
        # Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
        api_response = api_instance.templates_service_transform_template_json(templatesv3_transform_template_json_request)
        print("The response of TemplatesServiceApi->templates_service_transform_template_json:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_transform_template_json: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3_transform_template_json_request** | [**Templatesv3TransformTemplateJSONRequest**](Templatesv3TransformTemplateJSONRequest.md)|  | 

### Return type

[**Templatesv3TransformTemplateJSONResponse**](Templatesv3TransformTemplateJSONResponse.md)

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

# **templates_service_update_template**
> Templatesv3UpdateTemplateResponse templates_service_update_template(template_id, templatesv3_update_template_request)

Summary: Update template Description: Update a single template.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_software
from ibm_gdsc_sdk_software.models.templatesv3_update_template_request import Templatesv3UpdateTemplateRequest
from ibm_gdsc_sdk_software.models.templatesv3_update_template_response import Templatesv3UpdateTemplateResponse
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
    api_instance = ibm_gdsc_sdk_software.TemplatesServiceApi(api_client)
    template_id = 'template_id_example' # str | The template id to update.
    templatesv3_update_template_request = ibm_gdsc_sdk_software.Templatesv3UpdateTemplateRequest() # Templatesv3UpdateTemplateRequest | 

    try:
        # Summary: Update template Description: Update a single template.
        api_response = api_instance.templates_service_update_template(template_id, templatesv3_update_template_request)
        print("The response of TemplatesServiceApi->templates_service_update_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TemplatesServiceApi->templates_service_update_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| The template id to update. | 
 **templatesv3_update_template_request** | [**Templatesv3UpdateTemplateRequest**](Templatesv3UpdateTemplateRequest.md)|  | 

### Return type

[**Templatesv3UpdateTemplateResponse**](Templatesv3UpdateTemplateResponse.md)

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

