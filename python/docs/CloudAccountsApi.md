# ibm_gdsc_sdk_saas.CloudAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_analyzed_region**](CloudAccountsApi.md#add_analyzed_region) | **POST** /api/v2/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**add_cloud_accounts**](CloudAccountsApi.md#add_cloud_accounts) | **POST** /api/v2/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
[**generate_atlassian_confluence_auth_url**](CloudAccountsApi.md#generate_atlassian_confluence_auth_url) | **GET** /api/v2/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**generate_atlassian_jira_auth_url**](CloudAccountsApi.md#generate_atlassian_jira_auth_url) | **GET** /api/v2/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**generate_azure_auth_url**](CloudAccountsApi.md#generate_azure_auth_url) | **GET** /api/v2/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**generate_office365_auth_url**](CloudAccountsApi.md#generate_office365_auth_url) | **GET** /api/v2/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**generate_salesforce_auth_url**](CloudAccountsApi.md#generate_salesforce_auth_url) | **GET** /api/v2/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL
[**generate_slack_auth_url**](CloudAccountsApi.md#generate_slack_auth_url) | **GET** /api/v2/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**generate_snowflake_auth_url**](CloudAccountsApi.md#generate_snowflake_auth_url) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
[**get_analyzed_region_status**](CloudAccountsApi.md#get_analyzed_region_status) | **GET** /api/v2/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**get_azure_admin_consent_status**](CloudAccountsApi.md#get_azure_admin_consent_status) | **GET** /api/v2/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**get_cloud_account_installation_status**](CloudAccountsApi.md#get_cloud_account_installation_status) | **GET** /api/v2/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**get_database_metadata**](CloudAccountsApi.md#get_database_metadata) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/getDatabaseMetadata | Get the metadata details of snowflake database.
[**get_refresh_token_expiry**](CloudAccountsApi.md#get_refresh_token_expiry) | **GET** /api/v2/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
[**list_linked_accounts**](CloudAccountsApi.md#list_linked_accounts) | **GET** /api/v2/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
[**remove_accounts**](CloudAccountsApi.md#remove_accounts) | **DELETE** /api/v2/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**remove_accounts_instructions**](CloudAccountsApi.md#remove_accounts_instructions) | **GET** /api/v2/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**retrieve_service_account_id**](CloudAccountsApi.md#retrieve_service_account_id) | **GET** /api/v2/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**snowflake_integration_script**](CloudAccountsApi.md#snowflake_integration_script) | **GET** /api/v2/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
[**submit_google_workspace_admin_email**](CloudAccountsApi.md#submit_google_workspace_admin_email) | **POST** /api/v2/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**submit_office365_tenant_info**](CloudAccountsApi.md#submit_office365_tenant_info) | **POST** /api/v2/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**submit_salesforce_auth_code**](CloudAccountsApi.md#submit_salesforce_auth_code) | **POST** /api/v2/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information
[**submit_slack_auth_code**](CloudAccountsApi.md#submit_slack_auth_code) | **POST** /api/v2/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
[**submit_snowflake_auth_code**](CloudAccountsApi.md#submit_snowflake_auth_code) | **POST** /api/v2/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code


# **add_analyzed_region**
> AddAnalyzedRegion200Response add_analyzed_region(add_analyzed_region_request)

Add a new region for data classification

Install a new analyzer in the specified region to enable data classification in that region.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.add_analyzed_region200_response import AddAnalyzedRegion200Response
from ibm_gdsc_sdk_saas.models.add_analyzed_region_request import AddAnalyzedRegionRequest
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    add_analyzed_region_request = ibm_gdsc_sdk_saas.AddAnalyzedRegionRequest() # AddAnalyzedRegionRequest | 

    try:
        # Add a new region for data classification
        api_response = api_instance.add_analyzed_region(add_analyzed_region_request)
        print("The response of CloudAccountsApi->add_analyzed_region:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->add_analyzed_region: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_analyzed_region_request** | [**AddAnalyzedRegionRequest**](AddAnalyzedRegionRequest.md)|  | 

### Return type

[**AddAnalyzedRegion200Response**](AddAnalyzedRegion200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_cloud_accounts**
> AddCloudAccounts200Response add_cloud_accounts(add_cloud_accounts_request)

Add cloud account connections to DSPM

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the 'Add a new region for data classification' API.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.add_cloud_accounts200_response import AddCloudAccounts200Response
from ibm_gdsc_sdk_saas.models.add_cloud_accounts_request import AddCloudAccountsRequest
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    add_cloud_accounts_request = ibm_gdsc_sdk_saas.AddCloudAccountsRequest() # AddCloudAccountsRequest | 

    try:
        # Add cloud account connections to DSPM
        api_response = api_instance.add_cloud_accounts(add_cloud_accounts_request)
        print("The response of CloudAccountsApi->add_cloud_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->add_cloud_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **add_cloud_accounts_request** | [**AddCloudAccountsRequest**](AddCloudAccountsRequest.md)|  | 

### Return type

[**AddCloudAccounts200Response**](AddCloudAccounts200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_atlassian_confluence_auth_url**
> AuthUrl generate_atlassian_confluence_auth_url()

Generate a Confluence authentication URL

Generate an Atlassian authentication URL for Confluence integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate a Confluence authentication URL
        api_response = api_instance.generate_atlassian_confluence_auth_url()
        print("The response of CloudAccountsApi->generate_atlassian_confluence_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_atlassian_confluence_auth_url: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_atlassian_jira_auth_url**
> AuthUrl generate_atlassian_jira_auth_url()

Generate a JIRA authentication URL

Generate an Atlassian authentication URL for JIRA integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate a JIRA authentication URL
        api_response = api_instance.generate_atlassian_jira_auth_url()
        print("The response of CloudAccountsApi->generate_atlassian_jira_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_atlassian_jira_auth_url: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_azure_auth_url**
> AuthUrl generate_azure_auth_url(tenant_id=tenant_id)

Generate azure authorization url

Generate azure authorization url.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    tenant_id = 'tenant_id_example' # str | Tenant Id of the new Azure account, GUID format. (optional)

    try:
        # Generate azure authorization url
        api_response = api_instance.generate_azure_auth_url(tenant_id=tenant_id)
        print("The response of CloudAccountsApi->generate_azure_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_azure_auth_url: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_id** | **str**| Tenant Id of the new Azure account, GUID format. | [optional] 

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_office365_auth_url**
> AuthUrl generate_office365_auth_url()

Generate a Microsoft 365 consent URL

Generate an administrator consent URL for Microsoft 365 integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate a Microsoft 365 consent URL
        api_response = api_instance.generate_office365_auth_url()
        print("The response of CloudAccountsApi->generate_office365_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_office365_auth_url: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_salesforce_auth_url**
> AuthUrl generate_salesforce_auth_url()

Generate a Salesforce consent URL

Generate an administrator consent URL for Salesforce integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate a Salesforce consent URL
        api_response = api_instance.generate_salesforce_auth_url()
        print("The response of CloudAccountsApi->generate_salesforce_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_salesforce_auth_url: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_slack_auth_url**
> AuthUrl generate_slack_auth_url()

Generate a Slack authentication URL

Generate a Slack authentication URL.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate a Slack authentication URL
        api_response = api_instance.generate_slack_auth_url()
        print("The response of CloudAccountsApi->generate_slack_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_slack_auth_url: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_snowflake_auth_url**
> AuthUrl generate_snowflake_auth_url(client_info)

Validate and Generate a Snowflake OAuth URL

Generate an administrator consent URL for Snowflake integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_url import AuthUrl
from ibm_gdsc_sdk_saas.models.client_info import ClientInfo
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    client_info = ibm_gdsc_sdk_saas.ClientInfo() # ClientInfo | 

    try:
        # Validate and Generate a Snowflake OAuth URL
        api_response = api_instance.generate_snowflake_auth_url(client_info)
        print("The response of CloudAccountsApi->generate_snowflake_auth_url:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->generate_snowflake_auth_url: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_info** | [**ClientInfo**](ClientInfo.md)|  | 

### Return type

[**AuthUrl**](AuthUrl.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_analyzed_region_status**
> GetAnalyzedRegionStatus200Response get_analyzed_region_status(cloud_provider, region)

Get the status of analyzer installation for a region

Get the installation status of Guardium DSPM for a region.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.cloud_service_provider import CloudServiceProvider
from ibm_gdsc_sdk_saas.models.get_analyzed_region_status200_response import GetAnalyzedRegionStatus200Response
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    cloud_provider = ibm_gdsc_sdk_saas.CloudServiceProvider() # CloudServiceProvider | The cloud provider for the cloud account
    region = 'europe-west1' # str | The region code

    try:
        # Get the status of analyzer installation for a region
        api_response = api_instance.get_analyzed_region_status(cloud_provider, region)
        print("The response of CloudAccountsApi->get_analyzed_region_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->get_analyzed_region_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_provider** | [**CloudServiceProvider**](.md)| The cloud provider for the cloud account | 
 **region** | **str**| The region code | 

### Return type

[**GetAnalyzedRegionStatus200Response**](GetAnalyzedRegionStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_azure_admin_consent_status**
> bool get_azure_admin_consent_status()

Get Azure admin consent status

Get Azure admin consent status.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Get Azure admin consent status
        api_response = api_instance.get_azure_admin_consent_status()
        print("The response of CloudAccountsApi->get_azure_admin_consent_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->get_azure_admin_consent_status: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**bool**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | true if the customer has granted admin permissions, false otherwise |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cloud_account_installation_status**
> CloudAccountInstallationStatus get_cloud_account_installation_status(cloud_provider, cloud_account_id)

Get the installation status of a cloud account

Get the installation status of a cloud account.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.cloud_account_installation_status import CloudAccountInstallationStatus
from ibm_gdsc_sdk_saas.models.cloud_service_provider import CloudServiceProvider
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    cloud_provider = ibm_gdsc_sdk_saas.CloudServiceProvider() # CloudServiceProvider | The cloud provider of the cloud account
    cloud_account_id = '12345678910' # str | The cloud account identifier

    try:
        # Get the installation status of a cloud account
        api_response = api_instance.get_cloud_account_installation_status(cloud_provider, cloud_account_id)
        print("The response of CloudAccountsApi->get_cloud_account_installation_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->get_cloud_account_installation_status: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud_provider** | [**CloudServiceProvider**](.md)| The cloud provider of the cloud account | 
 **cloud_account_id** | **str**| The cloud account identifier | 

### Return type

[**CloudAccountInstallationStatus**](CloudAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_database_metadata**
> DBMetadataInfo get_database_metadata(db_info)

Get the metadata details of snowflake database.

Get the metadata details of snowflake database from saas-asset-store.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.db_metadata_info import DBMetadataInfo
from ibm_gdsc_sdk_saas.models.db_info import DbInfo
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    db_info = ibm_gdsc_sdk_saas.DbInfo() # DbInfo | 

    try:
        # Get the metadata details of snowflake database.
        api_response = api_instance.get_database_metadata(db_info)
        print("The response of CloudAccountsApi->get_database_metadata:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->get_database_metadata: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **db_info** | [**DbInfo**](DbInfo.md)|  | 

### Return type

[**DBMetadataInfo**](DBMetadataInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_refresh_token_expiry**
> TokenExpiryInfo get_refresh_token_expiry(provider_id)

Get Snowflake Refresh Token Expiry date

Get Snowflake Refresh Token Expiry date.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.token_expiry_info import TokenExpiryInfo
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    provider_id = 'provider_id_example' # str | The ID of the provider

    try:
        # Get Snowflake Refresh Token Expiry date
        api_response = api_instance.get_refresh_token_expiry(provider_id)
        print("The response of CloudAccountsApi->get_refresh_token_expiry:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->get_refresh_token_expiry: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **str**| The ID of the provider | 

### Return type

[**TokenExpiryInfo**](TokenExpiryInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_linked_accounts**
> List[LinkedAccounts] list_linked_accounts()

List cloud accounts connected to DSPM

Get a list of all the connected cloud accounts monitored by Guardium DSPM.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.linked_accounts import LinkedAccounts
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # List cloud accounts connected to DSPM
        api_response = api_instance.list_linked_accounts()
        print("The response of CloudAccountsApi->list_linked_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->list_linked_accounts: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[LinkedAccounts]**](LinkedAccounts.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_accounts**
> remove_accounts(account_ids, service_provider)

Post cloud account ID connections to be removed

Post cloud account ID connections to be removed from Guardium DSPM.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.service_provider import ServiceProvider
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    account_ids = ['[\"1234567891011\"]'] # List[str] | 
    service_provider = ibm_gdsc_sdk_saas.ServiceProvider() # ServiceProvider | 

    try:
        # Post cloud account ID connections to be removed
        api_instance.remove_accounts(account_ids, service_provider)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->remove_accounts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_ids** | [**List[str]**](str.md)|  | 
 **service_provider** | [**ServiceProvider**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_accounts_instructions**
> RemoveAccountsInstructions200Response remove_accounts_instructions(account_ids, service_provider)

Post cloud account IDs and get instructions to remove the accounts

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.remove_accounts_instructions200_response import RemoveAccountsInstructions200Response
from ibm_gdsc_sdk_saas.models.service_provider import ServiceProvider
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    account_ids = ['[\"1234567891011\"]'] # List[str] | 
    service_provider = ibm_gdsc_sdk_saas.ServiceProvider() # ServiceProvider | 

    try:
        # Post cloud account IDs and get instructions to remove the accounts
        api_response = api_instance.remove_accounts_instructions(account_ids, service_provider)
        print("The response of CloudAccountsApi->remove_accounts_instructions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->remove_accounts_instructions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_ids** | [**List[str]**](str.md)|  | 
 **service_provider** | [**ServiceProvider**](.md)|  | 

### Return type

[**RemoveAccountsInstructions200Response**](RemoveAccountsInstructions200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | string |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_service_account_id**
> ServiceAccountClientId retrieve_service_account_id()

Get Google Workspace authentication

Retrieve a service account ID to use it for Google Workspace authentication.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.service_account_client_id import ServiceAccountClientId
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Get Google Workspace authentication
        api_response = api_instance.retrieve_service_account_id()
        print("The response of CloudAccountsApi->retrieve_service_account_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->retrieve_service_account_id: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceAccountClientId**](ServiceAccountClientId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **snowflake_integration_script**
> Script snowflake_integration_script()

Generate Snowflake Integration Script

Generate Snowflake integration Script.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.script import Script
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)

    try:
        # Generate Snowflake Integration Script
        api_response = api_instance.snowflake_integration_script()
        print("The response of CloudAccountsApi->snowflake_integration_script:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->snowflake_integration_script: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Script**](Script.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_google_workspace_admin_email**
> ServiceAccountInstallationStatus submit_google_workspace_admin_email(submit_admin_email_params)

Submit email for service account authorization

Submit admin email for service account authorization and return service-account authorization status.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.service_account_installation_status import ServiceAccountInstallationStatus
from ibm_gdsc_sdk_saas.models.submit_admin_email_params import SubmitAdminEmailParams
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    submit_admin_email_params = ibm_gdsc_sdk_saas.SubmitAdminEmailParams() # SubmitAdminEmailParams | 

    try:
        # Submit email for service account authorization
        api_response = api_instance.submit_google_workspace_admin_email(submit_admin_email_params)
        print("The response of CloudAccountsApi->submit_google_workspace_admin_email:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->submit_google_workspace_admin_email: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submit_admin_email_params** | [**SubmitAdminEmailParams**](SubmitAdminEmailParams.md)|  | 

### Return type

[**ServiceAccountInstallationStatus**](ServiceAccountInstallationStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_office365_tenant_info**
> Office365TenantInfo submit_office365_tenant_info(tenant_info)

Submit Microsoft 365 customer information

Submit customer information for Microsoft 365 integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.office365_tenant_info import Office365TenantInfo
from ibm_gdsc_sdk_saas.models.tenant_info import TenantInfo
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    tenant_info = ibm_gdsc_sdk_saas.TenantInfo() # TenantInfo | 

    try:
        # Submit Microsoft 365 customer information
        api_response = api_instance.submit_office365_tenant_info(tenant_info)
        print("The response of CloudAccountsApi->submit_office365_tenant_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->submit_office365_tenant_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_info** | [**TenantInfo**](TenantInfo.md)|  | 

### Return type

[**Office365TenantInfo**](Office365TenantInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_salesforce_auth_code**
> submit_salesforce_auth_code(auth_code)

Submit Salesforce customer information

Submit customer information for Salesforce integration.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_code import AuthCode
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    auth_code = ibm_gdsc_sdk_saas.AuthCode() # AuthCode | 

    try:
        # Submit Salesforce customer information
        api_instance.submit_salesforce_auth_code(auth_code)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->submit_salesforce_auth_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_code** | [**AuthCode**](AuthCode.md)|  | 

### Return type

void (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_slack_auth_code**
> object submit_slack_auth_code(submit_auth_code)

Submit a Slack authentication code

Submit a Slack authentication code.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.submit_auth_code import SubmitAuthCode
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    submit_auth_code = ibm_gdsc_sdk_saas.SubmitAuthCode() # SubmitAuthCode | 

    try:
        # Submit a Slack authentication code
        api_response = api_instance.submit_slack_auth_code(submit_auth_code)
        print("The response of CloudAccountsApi->submit_slack_auth_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->submit_slack_auth_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submit_auth_code** | [**SubmitAuthCode**](SubmitAuthCode.md)|  | 

### Return type

**object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_snowflake_auth_code**
> submit_snowflake_auth_code(auth_info)

Submit Snowflake oAuth code

Storing code that is returned from Snowflake oAuth.

### Example

* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.auth_info import AuthInfo
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
    api_instance = ibm_gdsc_sdk_saas.CloudAccountsApi(api_client)
    auth_info = ibm_gdsc_sdk_saas.AuthInfo() # AuthInfo | 

    try:
        # Submit Snowflake oAuth code
        api_instance.submit_snowflake_auth_code(auth_info)
    except Exception as e:
        print("Exception when calling CloudAccountsApi->submit_snowflake_auth_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_info** | [**AuthInfo**](AuthInfo.md)|  | 

### Return type

void (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

