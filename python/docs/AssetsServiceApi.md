# ibm_gdsc_sdk_saas.AssetsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assets_service_asset_ingestion**](AssetsServiceApi.md#assets_service_asset_ingestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**assets_service_asset_ingestion_manual_trigger**](AssetsServiceApi.md#assets_service_asset_ingestion_manual_trigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**assets_service_clone_policy**](AssetsServiceApi.md#assets_service_clone_policy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
[**assets_service_create_update_policy**](AssetsServiceApi.md#assets_service_create_update_policy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
[**assets_service_delete_filter_template_for_assets**](AssetsServiceApi.md#assets_service_delete_filter_template_for_assets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
[**assets_service_delete_policies**](AssetsServiceApi.md#assets_service_delete_policies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
[**assets_service_fetch_asset_change_log**](AssetsServiceApi.md#assets_service_fetch_asset_change_log) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
[**assets_service_fetch_asset_dashboard**](AssetsServiceApi.md#assets_service_fetch_asset_dashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
[**assets_service_fetch_asset_list**](AssetsServiceApi.md#assets_service_fetch_asset_list) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api .
[**assets_service_fetch_assets_for_merge_split**](AssetsServiceApi.md#assets_service_fetch_assets_for_merge_split) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
[**assets_service_find_asset_name**](AssetsServiceApi.md#assets_service_find_asset_name) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
[**assets_service_get_asset_overview**](AssetsServiceApi.md#assets_service_get_asset_overview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
[**assets_service_get_asset_topology**](AssetsServiceApi.md#assets_service_get_asset_topology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
[**assets_service_get_filter_template_for_assets**](AssetsServiceApi.md#assets_service_get_filter_template_for_assets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
[**assets_service_get_filters_for_assets**](AssetsServiceApi.md#assets_service_get_filters_for_assets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
[**assets_service_list_policy**](AssetsServiceApi.md#assets_service_list_policy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies.
[**assets_service_list_rule**](AssetsServiceApi.md#assets_service_list_rule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
[**assets_service_list_tag_domains**](AssetsServiceApi.md#assets_service_list_tag_domains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
[**assets_service_list_tags**](AssetsServiceApi.md#assets_service_list_tags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
[**assets_service_merge_or_split_assets**](AssetsServiceApi.md#assets_service_merge_or_split_assets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
[**assets_service_save_assigned_tags**](AssetsServiceApi.md#assets_service_save_assigned_tags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
[**assets_service_save_tag_concept_data**](AssetsServiceApi.md#assets_service_save_tag_concept_data) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
[**assets_service_save_tag_domain_data**](AssetsServiceApi.md#assets_service_save_tag_domain_data) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
[**assets_service_save_update_filter_template_for_assets**](AssetsServiceApi.md#assets_service_save_update_filter_template_for_assets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
[**assets_service_set_banner_state**](AssetsServiceApi.md#assets_service_set_banner_state) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
[**assets_service_update_asset_name**](AssetsServiceApi.md#assets_service_update_asset_name) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
[**assets_service_update_policy**](AssetsServiceApi.md#assets_service_update_policy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.


# **assets_service_asset_ingestion**
> Assetsv3AssetIngestionResponse assets_service_asset_ingestion(assetsv3_asset_ingestion_request)

AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_asset_ingestion_request import Assetsv3AssetIngestionRequest
from ibm_gdsc_sdk_saas.models.assetsv3_asset_ingestion_response import Assetsv3AssetIngestionResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_asset_ingestion_request = ibm_gdsc_sdk_saas.Assetsv3AssetIngestionRequest() # Assetsv3AssetIngestionRequest | 

    try:
        # AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
        api_response = api_instance.assets_service_asset_ingestion(assetsv3_asset_ingestion_request)
        print("The response of AssetsServiceApi->assets_service_asset_ingestion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_asset_ingestion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_asset_ingestion_request** | [**Assetsv3AssetIngestionRequest**](Assetsv3AssetIngestionRequest.md)|  | 

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

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

# **assets_service_asset_ingestion_manual_trigger**
> Assetsv3AssetIngestionResponse assets_service_asset_ingestion_manual_trigger(body)

AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_asset_ingestion_response import Assetsv3AssetIngestionResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    body = None # object | 

    try:
        # AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
        api_response = api_instance.assets_service_asset_ingestion_manual_trigger(body)
        print("The response of AssetsServiceApi->assets_service_asset_ingestion_manual_trigger:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_asset_ingestion_manual_trigger: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **object**|  | 

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

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

# **assets_service_clone_policy**
> object assets_service_clone_policy(policy_id, assetsv3_clone_policy_request)

ClonePolicy - Clone a policy.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_clone_policy_request import Assetsv3ClonePolicyRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    policy_id = 'policy_id_example' # str | Policy id that needs to be cloned.
    assetsv3_clone_policy_request = ibm_gdsc_sdk_saas.Assetsv3ClonePolicyRequest() # Assetsv3ClonePolicyRequest | 

    try:
        # ClonePolicy - Clone a policy.
        api_response = api_instance.assets_service_clone_policy(policy_id, assetsv3_clone_policy_request)
        print("The response of AssetsServiceApi->assets_service_clone_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_clone_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_id** | **str**| Policy id that needs to be cloned. | 
 **assetsv3_clone_policy_request** | [**Assetsv3ClonePolicyRequest**](Assetsv3ClonePolicyRequest.md)|  | 

### Return type

**object**

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

# **assets_service_create_update_policy**
> Assetsv3CreateUpdatePolicyResponse assets_service_create_update_policy(assetsv3_create_update_policy_request)

CreateUpdatePolicy - Create/update new Policy.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_create_update_policy_request import Assetsv3CreateUpdatePolicyRequest
from ibm_gdsc_sdk_saas.models.assetsv3_create_update_policy_response import Assetsv3CreateUpdatePolicyResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_create_update_policy_request = ibm_gdsc_sdk_saas.Assetsv3CreateUpdatePolicyRequest() # Assetsv3CreateUpdatePolicyRequest | 

    try:
        # CreateUpdatePolicy - Create/update new Policy.
        api_response = api_instance.assets_service_create_update_policy(assetsv3_create_update_policy_request)
        print("The response of AssetsServiceApi->assets_service_create_update_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_create_update_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_create_update_policy_request** | [**Assetsv3CreateUpdatePolicyRequest**](Assetsv3CreateUpdatePolicyRequest.md)|  | 

### Return type

[**Assetsv3CreateUpdatePolicyResponse**](Assetsv3CreateUpdatePolicyResponse.md)

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

# **assets_service_delete_filter_template_for_assets**
> object assets_service_delete_filter_template_for_assets(template_id, assetsv3_asset_filter_template_request)

DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_asset_filter_template_request import Assetsv3AssetFilterTemplateRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    template_id = 'template_id_example' # str | template id to be deleted
    assetsv3_asset_filter_template_request = ibm_gdsc_sdk_saas.Assetsv3AssetFilterTemplateRequest() # Assetsv3AssetFilterTemplateRequest | 

    try:
        # DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
        api_response = api_instance.assets_service_delete_filter_template_for_assets(template_id, assetsv3_asset_filter_template_request)
        print("The response of AssetsServiceApi->assets_service_delete_filter_template_for_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_delete_filter_template_for_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| template id to be deleted | 
 **assetsv3_asset_filter_template_request** | [**Assetsv3AssetFilterTemplateRequest**](Assetsv3AssetFilterTemplateRequest.md)|  | 

### Return type

**object**

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

# **assets_service_delete_policies**
> object assets_service_delete_policies(policy_ids=policy_ids)

DeletePolicies - Delete Policy returns response code and message.

### Example

* Basic Authentication (BasicAuth):
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    policy_ids = ['policy_ids_example'] # List[str] | Policy ids. (optional)

    try:
        # DeletePolicies - Delete Policy returns response code and message.
        api_response = api_instance.assets_service_delete_policies(policy_ids=policy_ids)
        print("The response of AssetsServiceApi->assets_service_delete_policies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_delete_policies: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_ids** | [**List[str]**](str.md)| Policy ids. | [optional] 

### Return type

**object**

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

# **assets_service_fetch_asset_change_log**
> Assetsv3FetchAssetChangeLogResponse assets_service_fetch_asset_change_log(assetsv3_fetch_asset_change_log_request)

FetchAssetChangeLog - Fetch the logs for any actions performed on assets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_change_log_request import Assetsv3FetchAssetChangeLogRequest
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_change_log_response import Assetsv3FetchAssetChangeLogResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_fetch_asset_change_log_request = ibm_gdsc_sdk_saas.Assetsv3FetchAssetChangeLogRequest() # Assetsv3FetchAssetChangeLogRequest | 

    try:
        # FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
        api_response = api_instance.assets_service_fetch_asset_change_log(assetsv3_fetch_asset_change_log_request)
        print("The response of AssetsServiceApi->assets_service_fetch_asset_change_log:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_fetch_asset_change_log: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_fetch_asset_change_log_request** | [**Assetsv3FetchAssetChangeLogRequest**](Assetsv3FetchAssetChangeLogRequest.md)|  | 

### Return type

[**Assetsv3FetchAssetChangeLogResponse**](Assetsv3FetchAssetChangeLogResponse.md)

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

# **assets_service_fetch_asset_dashboard**
> Assetsv3FetchAssetDashboardResponse assets_service_fetch_asset_dashboard(widget_type, date_range_start=date_range_start, date_range_end=date_range_end, date_range_type=date_range_type, date_range_key=date_range_key, date_range_error=date_range_error, date_range_start_number=date_range_start_number, date_range_start_unit=date_range_start_unit, date_range_end_number=date_range_end_number, date_range_end_unit=date_range_end_unit, timeline_value_selected=timeline_value_selected, tag_id=tag_id)

FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_dashboard_response import Assetsv3FetchAssetDashboardResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    widget_type = 'widget_type_example' # str | ID of the Dashboard Widget
    date_range_start = 'date_range_start_example' # str | start of date range for ui widget. (optional)
    date_range_end = 'date_range_end_example' # str | end of date range for ui widget. (optional)
    date_range_type = 'date_range_type_example' # str | type of date range for ui widget. (optional)
    date_range_key = 'date_range_key_example' # str | key for ui widget. (optional)
    date_range_error = 'date_range_error_example' # str | error for ui widget. (optional)
    date_range_start_number = 56 # int | start_number for ui widget. (optional)
    date_range_start_unit = 'date_range_start_unit_example' # str | start of date range for ui widget. (optional)
    date_range_end_number = 56 # int | start of date range for ui widget. (optional)
    date_range_end_unit = 'date_range_end_unit_example' # str | start of date range for ui widget. (optional)
    timeline_value_selected = 'timeline_value_selected_example' # str | Name of the timeline value selected from drop down. (optional)
    tag_id = 'tag_id_example' # str | Tag ID. (optional)

    try:
        # FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
        api_response = api_instance.assets_service_fetch_asset_dashboard(widget_type, date_range_start=date_range_start, date_range_end=date_range_end, date_range_type=date_range_type, date_range_key=date_range_key, date_range_error=date_range_error, date_range_start_number=date_range_start_number, date_range_start_unit=date_range_start_unit, date_range_end_number=date_range_end_number, date_range_end_unit=date_range_end_unit, timeline_value_selected=timeline_value_selected, tag_id=tag_id)
        print("The response of AssetsServiceApi->assets_service_fetch_asset_dashboard:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_fetch_asset_dashboard: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **widget_type** | **str**| ID of the Dashboard Widget | 
 **date_range_start** | **str**| start of date range for ui widget. | [optional] 
 **date_range_end** | **str**| end of date range for ui widget. | [optional] 
 **date_range_type** | **str**| type of date range for ui widget. | [optional] 
 **date_range_key** | **str**| key for ui widget. | [optional] 
 **date_range_error** | **str**| error for ui widget. | [optional] 
 **date_range_start_number** | **int**| start_number for ui widget. | [optional] 
 **date_range_start_unit** | **str**| start of date range for ui widget. | [optional] 
 **date_range_end_number** | **int**| start of date range for ui widget. | [optional] 
 **date_range_end_unit** | **str**| start of date range for ui widget. | [optional] 
 **timeline_value_selected** | **str**| Name of the timeline value selected from drop down. | [optional] 
 **tag_id** | **str**| Tag ID. | [optional] 

### Return type

[**Assetsv3FetchAssetDashboardResponse**](Assetsv3FetchAssetDashboardResponse.md)

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

# **assets_service_fetch_asset_list**
> Assetsv3FetchAssetListResponse assets_service_fetch_asset_list(assetsv3_fetch_asset_list_request)

FetchAssetList - Asset Fetch Api .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_list_request import Assetsv3FetchAssetListRequest
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_list_response import Assetsv3FetchAssetListResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_fetch_asset_list_request = ibm_gdsc_sdk_saas.Assetsv3FetchAssetListRequest() # Assetsv3FetchAssetListRequest | 

    try:
        # FetchAssetList - Asset Fetch Api .
        api_response = api_instance.assets_service_fetch_asset_list(assetsv3_fetch_asset_list_request)
        print("The response of AssetsServiceApi->assets_service_fetch_asset_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_fetch_asset_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_fetch_asset_list_request** | [**Assetsv3FetchAssetListRequest**](Assetsv3FetchAssetListRequest.md)|  | 

### Return type

[**Assetsv3FetchAssetListResponse**](Assetsv3FetchAssetListResponse.md)

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

# **assets_service_fetch_assets_for_merge_split**
> Assetsv3FetchAssetsForMergeSplitResponse assets_service_fetch_assets_for_merge_split(asset_id=asset_id, page_number=page_number, page_size=page_size, action=action, search_key=search_key)

FetchAssetsForMergeSplit : Fetch assets for Merge and Split.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_assets_for_merge_split_response import Assetsv3FetchAssetsForMergeSplitResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    asset_id = 'asset_id_example' # str | Asset grouper Id. (optional)
    page_number = 56 # int | Page number. (optional)
    page_size = 56 # int | Page size. (optional)
    action = 'action_example' # str | Action : merge or split. (optional)
    search_key = 'search_key_example' # str | Search from the list based on asset name, database name, ip or host. (optional)

    try:
        # FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
        api_response = api_instance.assets_service_fetch_assets_for_merge_split(asset_id=asset_id, page_number=page_number, page_size=page_size, action=action, search_key=search_key)
        print("The response of AssetsServiceApi->assets_service_fetch_assets_for_merge_split:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_fetch_assets_for_merge_split: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset_id** | **str**| Asset grouper Id. | [optional] 
 **page_number** | **int**| Page number. | [optional] 
 **page_size** | **int**| Page size. | [optional] 
 **action** | **str**| Action : merge or split. | [optional] 
 **search_key** | **str**| Search from the list based on asset name, database name, ip or host. | [optional] 

### Return type

[**Assetsv3FetchAssetsForMergeSplitResponse**](Assetsv3FetchAssetsForMergeSplitResponse.md)

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

# **assets_service_find_asset_name**
> Assetsv3FindAssetNameResponse assets_service_find_asset_name(asset_name=asset_name)

FindAssetName - Checks if the given Asset Name has already been assigned to an asset.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_find_asset_name_response import Assetsv3FindAssetNameResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    asset_name = 'asset_name_example' # str | Name of asset. (optional)

    try:
        # FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
        api_response = api_instance.assets_service_find_asset_name(asset_name=asset_name)
        print("The response of AssetsServiceApi->assets_service_find_asset_name:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_find_asset_name: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset_name** | **str**| Name of asset. | [optional] 

### Return type

[**Assetsv3FindAssetNameResponse**](Assetsv3FindAssetNameResponse.md)

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

# **assets_service_get_asset_overview**
> Assetsv3AssetOverviewResponse assets_service_get_asset_overview(asset_id=asset_id, page_number=page_number, size=size, widget=widget, ip=ip, host=host, database=database, asset_entity_type=asset_entity_type)

GetAssetOverview - Get asset overview widgets data for a particular asset.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_asset_overview_response import Assetsv3AssetOverviewResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    asset_id = 'asset_id_example' # str | Asset grouper Id. (optional)
    page_number = 56 # int | Page number. (optional)
    size = 56 # int | Page size. (optional)
    widget = 'ALL' # str | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. (optional) (default to 'ALL')
    ip = 'ip_example' # str | Asset IP. (optional)
    host = 'host_example' # str | Asset Host. (optional)
    database = 'database_example' # str | Database Name. (optional)
    asset_entity_type = 'asset_entity_type_example' # str | asset ntity type. (optional)

    try:
        # GetAssetOverview - Get asset overview widgets data for a particular asset.
        api_response = api_instance.assets_service_get_asset_overview(asset_id=asset_id, page_number=page_number, size=size, widget=widget, ip=ip, host=host, database=database, asset_entity_type=asset_entity_type)
        print("The response of AssetsServiceApi->assets_service_get_asset_overview:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_get_asset_overview: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset_id** | **str**| Asset grouper Id. | [optional] 
 **page_number** | **int**| Page number. | [optional] 
 **size** | **int**| Page size. | [optional] 
 **widget** | **str**| Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. | [optional] [default to &#39;ALL&#39;]
 **ip** | **str**| Asset IP. | [optional] 
 **host** | **str**| Asset Host. | [optional] 
 **database** | **str**| Database Name. | [optional] 
 **asset_entity_type** | **str**| asset ntity type. | [optional] 

### Return type

[**Assetsv3AssetOverviewResponse**](Assetsv3AssetOverviewResponse.md)

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

# **assets_service_get_asset_topology**
> Assetsv3GetAssetTopologyResponse assets_service_get_asset_topology(assetsv3_get_asset_topology_request)

GetAssetTopology- Get list of topology for a parent asset.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_get_asset_topology_request import Assetsv3GetAssetTopologyRequest
from ibm_gdsc_sdk_saas.models.assetsv3_get_asset_topology_response import Assetsv3GetAssetTopologyResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_get_asset_topology_request = ibm_gdsc_sdk_saas.Assetsv3GetAssetTopologyRequest() # Assetsv3GetAssetTopologyRequest | 

    try:
        # GetAssetTopology- Get list of topology for a parent asset.
        api_response = api_instance.assets_service_get_asset_topology(assetsv3_get_asset_topology_request)
        print("The response of AssetsServiceApi->assets_service_get_asset_topology:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_get_asset_topology: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_get_asset_topology_request** | [**Assetsv3GetAssetTopologyRequest**](Assetsv3GetAssetTopologyRequest.md)|  | 

### Return type

[**Assetsv3GetAssetTopologyResponse**](Assetsv3GetAssetTopologyResponse.md)

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

# **assets_service_get_filter_template_for_assets**
> Assetsv3GetFilterTemplateResponse assets_service_get_filter_template_for_assets(template_id=template_id)

GetFilterTemplateForAssets - Get list of filters query templates for manage assets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_get_filter_template_response import Assetsv3GetFilterTemplateResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    template_id = 'template_id_example' # str | template id to be deleted. (optional)

    try:
        # GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
        api_response = api_instance.assets_service_get_filter_template_for_assets(template_id=template_id)
        print("The response of AssetsServiceApi->assets_service_get_filter_template_for_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_get_filter_template_for_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_id** | **str**| template id to be deleted. | [optional] 

### Return type

[**Assetsv3GetFilterTemplateResponse**](Assetsv3GetFilterTemplateResponse.md)

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

# **assets_service_get_filters_for_assets**
> Assetsv3GetFiltersDataResponse assets_service_get_filters_for_assets()

GetFiltersForAssets - Get a list of filters category and sub category with all data.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_get_filters_data_response import Assetsv3GetFiltersDataResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)

    try:
        # GetFiltersForAssets - Get a list of filters category and sub category with all data.
        api_response = api_instance.assets_service_get_filters_for_assets()
        print("The response of AssetsServiceApi->assets_service_get_filters_for_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_get_filters_for_assets: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Assetsv3GetFiltersDataResponse**](Assetsv3GetFiltersDataResponse.md)

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

# **assets_service_list_policy**
> Assetsv3ListPolicyResponse assets_service_list_policy()

ListPolicy - List all policies.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_list_policy_response import Assetsv3ListPolicyResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)

    try:
        # ListPolicy - List all policies.
        api_response = api_instance.assets_service_list_policy()
        print("The response of AssetsServiceApi->assets_service_list_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_list_policy: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Assetsv3ListPolicyResponse**](Assetsv3ListPolicyResponse.md)

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

# **assets_service_list_rule**
> Assetsv3ListRuleResponse assets_service_list_rule(policy_id)

ListRule - List all rules for a policy.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_list_rule_response import Assetsv3ListRuleResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    policy_id = 'policy_id_example' # str | Policy ID

    try:
        # ListRule - List all rules for a policy.
        api_response = api_instance.assets_service_list_rule(policy_id)
        print("The response of AssetsServiceApi->assets_service_list_rule:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_list_rule: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policy_id** | **str**| Policy ID | 

### Return type

[**Assetsv3ListRuleResponse**](Assetsv3ListRuleResponse.md)

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

# **assets_service_list_tag_domains**
> Assetsv3ListTagDomainsResponse assets_service_list_tag_domains(dom_grouper=dom_grouper, purpose=purpose, need_tag=need_tag)

ListTagDomains - Get Tag categories by request parameters .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_list_tag_domains_response import Assetsv3ListTagDomainsResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    dom_grouper = 'dom_grouper_example' # str | Optional: dom_grouper required if we want to fetch domains based on the group. (optional)
    purpose = 'purpose_example' # str | Optional: purpose required if we want to fetch domains based on the purpose. (optional)
    need_tag = True # bool | Optional: If we need Tag  based on the Domains. (optional)

    try:
        # ListTagDomains - Get Tag categories by request parameters .
        api_response = api_instance.assets_service_list_tag_domains(dom_grouper=dom_grouper, purpose=purpose, need_tag=need_tag)
        print("The response of AssetsServiceApi->assets_service_list_tag_domains:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_list_tag_domains: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dom_grouper** | **str**| Optional: dom_grouper required if we want to fetch domains based on the group. | [optional] 
 **purpose** | **str**| Optional: purpose required if we want to fetch domains based on the purpose. | [optional] 
 **need_tag** | **bool**| Optional: If we need Tag  based on the Domains. | [optional] 

### Return type

[**Assetsv3ListTagDomainsResponse**](Assetsv3ListTagDomainsResponse.md)

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

# **assets_service_list_tags**
> Assetsv3ListTagsResponse assets_service_list_tags(asset_id=asset_id)

ListTags - Get Tags for Manage Tags listing screen .

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_list_tags_response import Assetsv3ListTagsResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    asset_id = ['asset_id_example'] # List[str] | asset id - Asset ID. (optional)

    try:
        # ListTags - Get Tags for Manage Tags listing screen .
        api_response = api_instance.assets_service_list_tags(asset_id=asset_id)
        print("The response of AssetsServiceApi->assets_service_list_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_list_tags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset_id** | [**List[str]**](str.md)| asset id - Asset ID. | [optional] 

### Return type

[**Assetsv3ListTagsResponse**](Assetsv3ListTagsResponse.md)

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

# **assets_service_merge_or_split_assets**
> object assets_service_merge_or_split_assets(assetsv3_merge_or_split_assets_request)

MergeOrSplitAssets - Merge or split the selected assets.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_merge_or_split_assets_request import Assetsv3MergeOrSplitAssetsRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_merge_or_split_assets_request = ibm_gdsc_sdk_saas.Assetsv3MergeOrSplitAssetsRequest() # Assetsv3MergeOrSplitAssetsRequest | 

    try:
        # MergeOrSplitAssets - Merge or split the selected assets.
        api_response = api_instance.assets_service_merge_or_split_assets(assetsv3_merge_or_split_assets_request)
        print("The response of AssetsServiceApi->assets_service_merge_or_split_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_merge_or_split_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_merge_or_split_assets_request** | [**Assetsv3MergeOrSplitAssetsRequest**](Assetsv3MergeOrSplitAssetsRequest.md)|  | 

### Return type

**object**

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

# **assets_service_save_assigned_tags**
> object assets_service_save_assigned_tags(assetsv3_save_assigned_tags_request)

SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_save_assigned_tags_request import Assetsv3SaveAssignedTagsRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_save_assigned_tags_request = ibm_gdsc_sdk_saas.Assetsv3SaveAssignedTagsRequest() # Assetsv3SaveAssignedTagsRequest | 

    try:
        # SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
        api_response = api_instance.assets_service_save_assigned_tags(assetsv3_save_assigned_tags_request)
        print("The response of AssetsServiceApi->assets_service_save_assigned_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_save_assigned_tags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_save_assigned_tags_request** | [**Assetsv3SaveAssignedTagsRequest**](Assetsv3SaveAssignedTagsRequest.md)|  | 

### Return type

**object**

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

# **assets_service_save_tag_concept_data**
> object assets_service_save_tag_concept_data(assetsv3_save_tag_concept_data_request)

SaveTagConceptData - creates a custom tag

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_save_tag_concept_data_request import Assetsv3SaveTagConceptDataRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_save_tag_concept_data_request = ibm_gdsc_sdk_saas.Assetsv3SaveTagConceptDataRequest() # Assetsv3SaveTagConceptDataRequest | 

    try:
        # SaveTagConceptData - creates a custom tag
        api_response = api_instance.assets_service_save_tag_concept_data(assetsv3_save_tag_concept_data_request)
        print("The response of AssetsServiceApi->assets_service_save_tag_concept_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_save_tag_concept_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_save_tag_concept_data_request** | [**Assetsv3SaveTagConceptDataRequest**](Assetsv3SaveTagConceptDataRequest.md)|  | 

### Return type

**object**

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

# **assets_service_save_tag_domain_data**
> object assets_service_save_tag_domain_data(assetsv3_save_tag_domain_data_request)

SaveTagDomainData - creates a custom category to be assigned to a tag

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_save_tag_domain_data_request import Assetsv3SaveTagDomainDataRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_save_tag_domain_data_request = ibm_gdsc_sdk_saas.Assetsv3SaveTagDomainDataRequest() # Assetsv3SaveTagDomainDataRequest | 

    try:
        # SaveTagDomainData - creates a custom category to be assigned to a tag
        api_response = api_instance.assets_service_save_tag_domain_data(assetsv3_save_tag_domain_data_request)
        print("The response of AssetsServiceApi->assets_service_save_tag_domain_data:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_save_tag_domain_data: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_save_tag_domain_data_request** | [**Assetsv3SaveTagDomainDataRequest**](Assetsv3SaveTagDomainDataRequest.md)|  | 

### Return type

**object**

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

# **assets_service_save_update_filter_template_for_assets**
> Assetsv3SaveUpdateFilterTemplateResponse assets_service_save_update_filter_template_for_assets(assetsv3_save_update_filter_template_request)

SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_save_update_filter_template_request import Assetsv3SaveUpdateFilterTemplateRequest
from ibm_gdsc_sdk_saas.models.assetsv3_save_update_filter_template_response import Assetsv3SaveUpdateFilterTemplateResponse
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_save_update_filter_template_request = ibm_gdsc_sdk_saas.Assetsv3SaveUpdateFilterTemplateRequest() # Assetsv3SaveUpdateFilterTemplateRequest | 

    try:
        # SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
        api_response = api_instance.assets_service_save_update_filter_template_for_assets(assetsv3_save_update_filter_template_request)
        print("The response of AssetsServiceApi->assets_service_save_update_filter_template_for_assets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_save_update_filter_template_for_assets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_save_update_filter_template_request** | [**Assetsv3SaveUpdateFilterTemplateRequest**](Assetsv3SaveUpdateFilterTemplateRequest.md)|  | 

### Return type

[**Assetsv3SaveUpdateFilterTemplateResponse**](Assetsv3SaveUpdateFilterTemplateResponse.md)

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

# **assets_service_set_banner_state**
> object assets_service_set_banner_state(assetsv3_set_banner_state_request)

SetBannerState - Set banner state for asset inventory page.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_set_banner_state_request import Assetsv3SetBannerStateRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_set_banner_state_request = ibm_gdsc_sdk_saas.Assetsv3SetBannerStateRequest() # Assetsv3SetBannerStateRequest | 

    try:
        # SetBannerState - Set banner state for asset inventory page.
        api_response = api_instance.assets_service_set_banner_state(assetsv3_set_banner_state_request)
        print("The response of AssetsServiceApi->assets_service_set_banner_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_set_banner_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_set_banner_state_request** | [**Assetsv3SetBannerStateRequest**](Assetsv3SetBannerStateRequest.md)|  | 

### Return type

**object**

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

# **assets_service_update_asset_name**
> object assets_service_update_asset_name(assetsv3_update_asset_name_request)

UpdateAssetName - Udates the name of the asset as given by the user.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_update_asset_name_request import Assetsv3UpdateAssetNameRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_update_asset_name_request = ibm_gdsc_sdk_saas.Assetsv3UpdateAssetNameRequest() # Assetsv3UpdateAssetNameRequest | 

    try:
        # UpdateAssetName - Udates the name of the asset as given by the user.
        api_response = api_instance.assets_service_update_asset_name(assetsv3_update_asset_name_request)
        print("The response of AssetsServiceApi->assets_service_update_asset_name:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_update_asset_name: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_update_asset_name_request** | [**Assetsv3UpdateAssetNameRequest**](Assetsv3UpdateAssetNameRequest.md)|  | 

### Return type

**object**

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

# **assets_service_update_policy**
> object assets_service_update_policy(assetsv3_update_policy_request)

UpdatePolicy - Update existing Policy status.

### Example

* Basic Authentication (BasicAuth):
* Api Key Authentication (ApiKeyAuth):

```python
import ibm_gdsc_sdk_saas,os
from ibm_gdsc_sdk_saas.models.assetsv3_update_policy_request import Assetsv3UpdatePolicyRequest
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
    api_instance = ibm_gdsc_sdk_saas.AssetsServiceApi(api_client)
    assetsv3_update_policy_request = ibm_gdsc_sdk_saas.Assetsv3UpdatePolicyRequest() # Assetsv3UpdatePolicyRequest | 

    try:
        # UpdatePolicy - Update existing Policy status.
        api_response = api_instance.assets_service_update_policy(assetsv3_update_policy_request)
        print("The response of AssetsServiceApi->assets_service_update_policy:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AssetsServiceApi->assets_service_update_policy: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3_update_policy_request** | [**Assetsv3UpdatePolicyRequest**](Assetsv3UpdatePolicyRequest.md)|  | 

### Return type

**object**

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

