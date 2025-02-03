# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetsServiceAssetIngestion**](AssetsServiceApi.md#AssetsServiceAssetIngestion) | **Post** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**AssetsServiceAssetIngestionManualTrigger**](AssetsServiceApi.md#AssetsServiceAssetIngestionManualTrigger) | **Post** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**AssetsServiceClonePolicy**](AssetsServiceApi.md#AssetsServiceClonePolicy) | **Post** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
[**AssetsServiceCreateUpdatePolicy**](AssetsServiceApi.md#AssetsServiceCreateUpdatePolicy) | **Post** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
[**AssetsServiceDeleteFilterTemplateForAssets**](AssetsServiceApi.md#AssetsServiceDeleteFilterTemplateForAssets) | **Delete** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
[**AssetsServiceDeletePolicies**](AssetsServiceApi.md#AssetsServiceDeletePolicies) | **Delete** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
[**AssetsServiceFetchAssetChangeLog**](AssetsServiceApi.md#AssetsServiceFetchAssetChangeLog) | **Post** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
[**AssetsServiceFetchAssetDashboard**](AssetsServiceApi.md#AssetsServiceFetchAssetDashboard) | **Get** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
[**AssetsServiceFetchAssetList**](AssetsServiceApi.md#AssetsServiceFetchAssetList) | **Post** /api/v3/assets | FetchAssetList - Asset Fetch Api .
[**AssetsServiceFetchAssetsForMergeSplit**](AssetsServiceApi.md#AssetsServiceFetchAssetsForMergeSplit) | **Get** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
[**AssetsServiceFindAssetName**](AssetsServiceApi.md#AssetsServiceFindAssetName) | **Get** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
[**AssetsServiceGetAssetOverview**](AssetsServiceApi.md#AssetsServiceGetAssetOverview) | **Get** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
[**AssetsServiceGetAssetTopology**](AssetsServiceApi.md#AssetsServiceGetAssetTopology) | **Post** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
[**AssetsServiceGetFilterTemplateForAssets**](AssetsServiceApi.md#AssetsServiceGetFilterTemplateForAssets) | **Get** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
[**AssetsServiceGetFiltersForAssets**](AssetsServiceApi.md#AssetsServiceGetFiltersForAssets) | **Get** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
[**AssetsServiceListPolicy**](AssetsServiceApi.md#AssetsServiceListPolicy) | **Get** /api/v3/assets/policies | ListPolicy - List all policies.
[**AssetsServiceListRule**](AssetsServiceApi.md#AssetsServiceListRule) | **Get** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
[**AssetsServiceListTagDomains**](AssetsServiceApi.md#AssetsServiceListTagDomains) | **Get** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
[**AssetsServiceListTags**](AssetsServiceApi.md#AssetsServiceListTags) | **Get** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
[**AssetsServiceMergeOrSplitAssets**](AssetsServiceApi.md#AssetsServiceMergeOrSplitAssets) | **Post** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
[**AssetsServiceSaveAssignedTags**](AssetsServiceApi.md#AssetsServiceSaveAssignedTags) | **Post** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
[**AssetsServiceSaveTagConceptData**](AssetsServiceApi.md#AssetsServiceSaveTagConceptData) | **Post** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
[**AssetsServiceSaveTagDomainData**](AssetsServiceApi.md#AssetsServiceSaveTagDomainData) | **Post** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
[**AssetsServiceSaveUpdateFilterTemplateForAssets**](AssetsServiceApi.md#AssetsServiceSaveUpdateFilterTemplateForAssets) | **Post** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
[**AssetsServiceSetBannerState**](AssetsServiceApi.md#AssetsServiceSetBannerState) | **Put** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
[**AssetsServiceUpdateAssetName**](AssetsServiceApi.md#AssetsServiceUpdateAssetName) | **Put** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
[**AssetsServiceUpdatePolicy**](AssetsServiceApi.md#AssetsServiceUpdatePolicy) | **Put** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.

# **AssetsServiceAssetIngestion**
> Assetsv3AssetIngestionResponse AssetsServiceAssetIngestion(ctx, body)
AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3AssetIngestionRequest**](Assetsv3AssetIngestionRequest.md)|  | 

### Return type

[**Assetsv3AssetIngestionResponse**](assetsv3AssetIngestionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceAssetIngestionManualTrigger**
> Assetsv3AssetIngestionResponse AssetsServiceAssetIngestionManualTrigger(ctx, body)
AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3StandardEmptyRequest**](Assetsv3StandardEmptyRequest.md)|  | 

### Return type

[**Assetsv3AssetIngestionResponse**](assetsv3AssetIngestionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceClonePolicy**
> Assetsv3StandardEmptyResponse AssetsServiceClonePolicy(ctx, body, policyId)
ClonePolicy - Clone a policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3ClonePolicyRequest**](Assetsv3ClonePolicyRequest.md)|  | 
  **policyId** | **string**| Policy id that needs to be cloned. | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceCreateUpdatePolicy**
> Assetsv3CreateUpdatePolicyResponse AssetsServiceCreateUpdatePolicy(ctx, body)
CreateUpdatePolicy - Create/update new Policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3CreateUpdatePolicyRequest**](Assetsv3CreateUpdatePolicyRequest.md)|  | 

### Return type

[**Assetsv3CreateUpdatePolicyResponse**](assetsv3CreateUpdatePolicyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceDeleteFilterTemplateForAssets**
> Assetsv3StandardEmptyResponse AssetsServiceDeleteFilterTemplateForAssets(ctx, body, templateId)
DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3AssetFilterTemplateRequest**](Assetsv3AssetFilterTemplateRequest.md)|  | 
  **templateId** | **string**| template id to be deleted | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceDeletePolicies**
> Assetsv3StandardEmptyResponse AssetsServiceDeletePolicies(ctx, optional)
DeletePolicies - Delete Policy returns response code and message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceDeletePoliciesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceDeletePoliciesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | [**optional.Interface of []string**](string.md)| Policy ids. | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceFetchAssetChangeLog**
> Assetsv3FetchAssetChangeLogResponse AssetsServiceFetchAssetChangeLog(ctx, body)
FetchAssetChangeLog - Fetch the logs for any actions performed on assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3FetchAssetChangeLogRequest**](Assetsv3FetchAssetChangeLogRequest.md)|  | 

### Return type

[**Assetsv3FetchAssetChangeLogResponse**](assetsv3FetchAssetChangeLogResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceFetchAssetDashboard**
> Assetsv3FetchAssetDashboardResponse AssetsServiceFetchAssetDashboard(ctx, widgetType, optional)
FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **widgetType** | **string**| ID of the Dashboard Widget | 
 **optional** | ***AssetsServiceApiAssetsServiceFetchAssetDashboardOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceFetchAssetDashboardOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **dateRangeStart** | **optional.String**| start of date range for ui widget. | 
 **dateRangeEnd** | **optional.String**| end of date range for ui widget. | 
 **dateRangeType** | **optional.String**| type of date range for ui widget. | 
 **dateRangeKey** | **optional.String**| key for ui widget. | 
 **dateRangeError** | **optional.String**| error for ui widget. | 
 **dateRangeStartNumber** | **optional.Int32**| start_number for ui widget. | 
 **dateRangeStartUnit** | **optional.String**| start of date range for ui widget. | 
 **dateRangeEndNumber** | **optional.Int32**| start of date range for ui widget. | 
 **dateRangeEndUnit** | **optional.String**| start of date range for ui widget. | 
 **timelineValueSelected** | **optional.String**| Name of the timeline value selected from drop down. | 
 **tagId** | **optional.String**| Tag ID. | 

### Return type

[**Assetsv3FetchAssetDashboardResponse**](assetsv3FetchAssetDashboardResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceFetchAssetList**
> Assetsv3FetchAssetListResponse AssetsServiceFetchAssetList(ctx, body)
FetchAssetList - Asset Fetch Api .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3FetchAssetListRequest**](Assetsv3FetchAssetListRequest.md)|  | 

### Return type

[**Assetsv3FetchAssetListResponse**](assetsv3FetchAssetListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceFetchAssetsForMergeSplit**
> Assetsv3FetchAssetsForMergeSplitResponse AssetsServiceFetchAssetsForMergeSplit(ctx, optional)
FetchAssetsForMergeSplit : Fetch assets for Merge and Split.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **optional.String**| Asset grouper Id. | 
 **pageNumber** | **optional.Int32**| Page number. | 
 **pageSize** | **optional.Int32**| Page size. | 
 **action** | **optional.String**| Action : merge or split. | 
 **searchKey** | **optional.String**| Search from the list based on asset name, database name, ip or host. | 

### Return type

[**Assetsv3FetchAssetsForMergeSplitResponse**](assetsv3FetchAssetsForMergeSplitResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceFindAssetName**
> Assetsv3FindAssetNameResponse AssetsServiceFindAssetName(ctx, optional)
FindAssetName - Checks if the given Asset Name has already been assigned to an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceFindAssetNameOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceFindAssetNameOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetName** | **optional.String**| Name of asset. | 

### Return type

[**Assetsv3FindAssetNameResponse**](assetsv3FindAssetNameResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceGetAssetOverview**
> Assetsv3AssetOverviewResponse AssetsServiceGetAssetOverview(ctx, optional)
GetAssetOverview - Get asset overview widgets data for a particular asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceGetAssetOverviewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceGetAssetOverviewOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **optional.String**| Asset grouper Id. | 
 **pageNumber** | **optional.Int32**| Page number. | 
 **size** | **optional.Int32**| Page size. | 
 **widget** | **optional.String**| Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. | [default to ALL]
 **ip** | **optional.String**| Asset IP. | 
 **host** | **optional.String**| Asset Host. | 
 **database** | **optional.String**| Database Name. | 
 **assetEntityType** | **optional.String**| asset ntity type. | 

### Return type

[**Assetsv3AssetOverviewResponse**](assetsv3AssetOverviewResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceGetAssetTopology**
> Assetsv3GetAssetTopologyResponse AssetsServiceGetAssetTopology(ctx, body)
GetAssetTopology- Get list of topology for a parent asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3GetAssetTopologyRequest**](Assetsv3GetAssetTopologyRequest.md)|  | 

### Return type

[**Assetsv3GetAssetTopologyResponse**](assetsv3GetAssetTopologyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceGetFilterTemplateForAssets**
> Assetsv3GetFilterTemplateResponse AssetsServiceGetFilterTemplateForAssets(ctx, optional)
GetFilterTemplateForAssets - Get list of filters query templates for manage assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **optional.String**| template id to be deleted. | 

### Return type

[**Assetsv3GetFilterTemplateResponse**](assetsv3GetFilterTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceGetFiltersForAssets**
> Assetsv3GetFiltersDataResponse AssetsServiceGetFiltersForAssets(ctx, )
GetFiltersForAssets - Get a list of filters category and sub category with all data.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Assetsv3GetFiltersDataResponse**](assetsv3GetFiltersDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceListPolicy**
> Assetsv3ListPolicyResponse AssetsServiceListPolicy(ctx, )
ListPolicy - List all policies.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Assetsv3ListPolicyResponse**](assetsv3ListPolicyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceListRule**
> Assetsv3ListRuleResponse AssetsServiceListRule(ctx, policyId)
ListRule - List all rules for a policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **policyId** | **string**| Policy ID | 

### Return type

[**Assetsv3ListRuleResponse**](assetsv3ListRuleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceListTagDomains**
> Assetsv3ListTagDomainsResponse AssetsServiceListTagDomains(ctx, optional)
ListTagDomains - Get Tag categories by request parameters .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceListTagDomainsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceListTagDomainsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domGrouper** | **optional.String**| Optional: dom_grouper required if we want to fetch domains based on the group. | 
 **purpose** | **optional.String**| Optional: purpose required if we want to fetch domains based on the purpose. | 
 **needTag** | **optional.Bool**| Optional: If we need Tag  based on the Domains. | 

### Return type

[**Assetsv3ListTagDomainsResponse**](assetsv3ListTagDomainsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceListTags**
> Assetsv3ListTagsResponse AssetsServiceListTags(ctx, optional)
ListTags - Get Tags for Manage Tags listing screen .

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AssetsServiceApiAssetsServiceListTagsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AssetsServiceApiAssetsServiceListTagsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | [**optional.Interface of []string**](string.md)| asset id - Asset ID. | 

### Return type

[**Assetsv3ListTagsResponse**](assetsv3ListTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceMergeOrSplitAssets**
> Assetsv3StandardEmptyResponse AssetsServiceMergeOrSplitAssets(ctx, body)
MergeOrSplitAssets - Merge or split the selected assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3MergeOrSplitAssetsRequest**](Assetsv3MergeOrSplitAssetsRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceSaveAssignedTags**
> Assetsv3StandardEmptyResponse AssetsServiceSaveAssignedTags(ctx, body)
SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3SaveAssignedTagsRequest**](Assetsv3SaveAssignedTagsRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceSaveTagConceptData**
> Assetsv3StandardEmptyResponse AssetsServiceSaveTagConceptData(ctx, body)
SaveTagConceptData - creates a custom tag

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3SaveTagConceptDataRequest**](Assetsv3SaveTagConceptDataRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceSaveTagDomainData**
> Assetsv3StandardEmptyResponse AssetsServiceSaveTagDomainData(ctx, body)
SaveTagDomainData - creates a custom category to be assigned to a tag

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3SaveTagDomainDataRequest**](Assetsv3SaveTagDomainDataRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceSaveUpdateFilterTemplateForAssets**
> Assetsv3SaveUpdateFilterTemplateResponse AssetsServiceSaveUpdateFilterTemplateForAssets(ctx, body)
SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3SaveUpdateFilterTemplateRequest**](Assetsv3SaveUpdateFilterTemplateRequest.md)|  | 

### Return type

[**Assetsv3SaveUpdateFilterTemplateResponse**](assetsv3SaveUpdateFilterTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceSetBannerState**
> Assetsv3StandardEmptyResponse AssetsServiceSetBannerState(ctx, body)
SetBannerState - Set banner state for asset inventory page.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3SetBannerStateRequest**](Assetsv3SetBannerStateRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceUpdateAssetName**
> Assetsv3StandardEmptyResponse AssetsServiceUpdateAssetName(ctx, body)
UpdateAssetName - Udates the name of the asset as given by the user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3UpdateAssetNameRequest**](Assetsv3UpdateAssetNameRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AssetsServiceUpdatePolicy**
> Assetsv3StandardEmptyResponse AssetsServiceUpdatePolicy(ctx, body)
UpdatePolicy - Update existing Policy status.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Assetsv3UpdatePolicyRequest**](Assetsv3UpdatePolicyRequest.md)|  | 

### Return type

[**Assetsv3StandardEmptyResponse**](assetsv3StandardEmptyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

