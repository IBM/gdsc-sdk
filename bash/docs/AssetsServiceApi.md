# AssetsServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsServiceAssetIngestion**](AssetsServiceApi.md#assetsServiceAssetIngestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**assetsServiceAssetIngestionManualTrigger**](AssetsServiceApi.md#assetsServiceAssetIngestionManualTrigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**assetsServiceCancelCSVImport**](AssetsServiceApi.md#assetsServiceCancelCSVImport) | **DELETE** /api/v3/assets/csv/cancel/{csv_id} | CancelCSVImport - Cancel the import of CSV and update the status in import log table
[**assetsServiceClonePolicy**](AssetsServiceApi.md#assetsServiceClonePolicy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
[**assetsServiceCompareCSVToExistingAssets**](AssetsServiceApi.md#assetsServiceCompareCSVToExistingAssets) | **GET** /api/v3/assets/csv/compare/{csv_id} | CompareCSVToExistingAssets - Compare CSV with existing assets and return list of assets(existing/to be imported/both) on demand from csv.
[**assetsServiceCreateUpdatePolicy**](AssetsServiceApi.md#assetsServiceCreateUpdatePolicy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
[**assetsServiceDeleteFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceDeleteFilterTemplateForAssets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
[**assetsServiceDeletePolicies**](AssetsServiceApi.md#assetsServiceDeletePolicies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
[**assetsServiceFetchAssetChangeLog**](AssetsServiceApi.md#assetsServiceFetchAssetChangeLog) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
[**assetsServiceFetchAssetDashboard**](AssetsServiceApi.md#assetsServiceFetchAssetDashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
[**assetsServiceFetchAssetList**](AssetsServiceApi.md#assetsServiceFetchAssetList) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api .
[**assetsServiceFetchAssetsForMergeSplit**](AssetsServiceApi.md#assetsServiceFetchAssetsForMergeSplit) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
[**assetsServiceFindAssetName**](AssetsServiceApi.md#assetsServiceFindAssetName) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
[**assetsServiceGetAssetOverview**](AssetsServiceApi.md#assetsServiceGetAssetOverview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
[**assetsServiceGetAssetTopology**](AssetsServiceApi.md#assetsServiceGetAssetTopology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
[**assetsServiceGetFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceGetFilterTemplateForAssets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
[**assetsServiceGetFiltersForAssets**](AssetsServiceApi.md#assetsServiceGetFiltersForAssets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
[**assetsServiceImportCSV**](AssetsServiceApi.md#assetsServiceImportCSV) | **POST** /api/v3/assets/csv/import/{csv_id} | ImportCSV - Start the async asset import from CSV by starting the db procedure and send notification at the end.
[**assetsServiceListPolicy**](AssetsServiceApi.md#assetsServiceListPolicy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies.
[**assetsServiceListRule**](AssetsServiceApi.md#assetsServiceListRule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
[**assetsServiceListTagDomains**](AssetsServiceApi.md#assetsServiceListTagDomains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
[**assetsServiceListTags**](AssetsServiceApi.md#assetsServiceListTags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
[**assetsServiceMergeOrSplitAssets**](AssetsServiceApi.md#assetsServiceMergeOrSplitAssets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
[**assetsServiceSaveAssignedTags**](AssetsServiceApi.md#assetsServiceSaveAssignedTags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
[**assetsServiceSaveTagConceptData**](AssetsServiceApi.md#assetsServiceSaveTagConceptData) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
[**assetsServiceSaveTagDomainData**](AssetsServiceApi.md#assetsServiceSaveTagDomainData) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
[**assetsServiceSaveUpdateFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceSaveUpdateFilterTemplateForAssets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
[**assetsServiceSetBannerState**](AssetsServiceApi.md#assetsServiceSetBannerState) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
[**assetsServiceUpdateAssetName**](AssetsServiceApi.md#assetsServiceUpdateAssetName) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
[**assetsServiceUpdatePolicy**](AssetsServiceApi.md#assetsServiceUpdatePolicy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.



## assetsServiceAssetIngestion

AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.

### Example

```bash
 assetsServiceAssetIngestion
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3AssetIngestionRequest** | [**Assetsv3AssetIngestionRequest**](Assetsv3AssetIngestionRequest.md) |  |

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceAssetIngestionManualTrigger

AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.

### Example

```bash
 assetsServiceAssetIngestionManualTrigger
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **map** |  |

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceCancelCSVImport

CancelCSVImport - Cancel the import of CSV and update the status in import log table

### Example

```bash
 assetsServiceCancelCSVImport csv_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csvId** | **string** | unique id of the csv | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceClonePolicy

ClonePolicy - Clone a policy.

### Example

```bash
 assetsServiceClonePolicy policy_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy id that needs to be cloned. | [default to null]
 **assetsv3ClonePolicyRequest** | [**Assetsv3ClonePolicyRequest**](Assetsv3ClonePolicyRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceCompareCSVToExistingAssets

CompareCSVToExistingAssets - Compare CSV with existing assets and return list of assets(existing/to be imported/both) on demand from csv.

### Example

```bash
 assetsServiceCompareCSVToExistingAssets csv_id=value  rows_required=value  page_number=value  page_size=value  template_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csvId** | **string** | unique id of the csv | [default to null]
 **rowsRequired** | **string** | which rows are required, existing or new or all. | [optional] [default to null]
 **pageNumber** | **integer** | page number. | [optional] [default to null]
 **pageSize** | **integer** | page size. | [optional] [default to null]
 **templateType** | **string** | Asset CSV template type.

 - DATABASE: Template for database | [optional] [default to DATABASE]

### Return type

[**Assetsv3CompareCSVResponse**](Assetsv3CompareCSVResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceCreateUpdatePolicy

CreateUpdatePolicy - Create/update new Policy.

### Example

```bash
 assetsServiceCreateUpdatePolicy
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3CreateUpdatePolicyRequest** | [**Assetsv3CreateUpdatePolicyRequest**](Assetsv3CreateUpdatePolicyRequest.md) |  |

### Return type

[**Assetsv3CreateUpdatePolicyResponse**](Assetsv3CreateUpdatePolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceDeleteFilterTemplateForAssets

DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.

### Example

```bash
 assetsServiceDeleteFilterTemplateForAssets template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | template id to be deleted | [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceDeletePolicies

DeletePolicies - Delete Policy returns response code and message.

### Example

```bash
 assetsServiceDeletePolicies  Specify as:  policy_ids=value1 policy_ids=value2 policy_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | [**array[string]**](string.md) | Policy ids. | [optional] [default to null]

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceFetchAssetChangeLog

FetchAssetChangeLog - Fetch the logs for any actions performed on assets.

### Example

```bash
 assetsServiceFetchAssetChangeLog
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetChangeLogRequest** | [**Assetsv3FetchAssetChangeLogRequest**](Assetsv3FetchAssetChangeLogRequest.md) |  |

### Return type

[**Assetsv3FetchAssetChangeLogResponse**](Assetsv3FetchAssetChangeLogResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceFetchAssetDashboard

FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.

### Example

```bash
 assetsServiceFetchAssetDashboard widget_type=value  date_range.start=value  date_range.end=value  date_range.type=value  date_range.key=value  date_range.error=value  date_range.start_number=value  date_range.start_unit=value  date_range.end_number=value  date_range.end_unit=value  timeline_value_selected=value  tag_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **widgetType** | **string** | ID of the Dashboard Widget | [default to null]
 **dateRangePeriodstart** | **string** | start of date range for ui widget. | [optional] [default to null]
 **dateRangePeriodend** | **string** | end of date range for ui widget. | [optional] [default to null]
 **dateRangePeriodtype** | **string** | type of date range for ui widget. | [optional] [default to null]
 **dateRangePeriodkey** | **string** | key for ui widget. | [optional] [default to null]
 **dateRangePerioderror** | **string** | error for ui widget. | [optional] [default to null]
 **dateRangePeriodstartNumber** | **integer** | start_number for ui widget. | [optional] [default to null]
 **dateRangePeriodstartUnit** | **string** | start of date range for ui widget. | [optional] [default to null]
 **dateRangePeriodendNumber** | **integer** | start of date range for ui widget. | [optional] [default to null]
 **dateRangePeriodendUnit** | **string** | start of date range for ui widget. | [optional] [default to null]
 **timelineValueSelected** | **string** | Name of the timeline value selected from drop down. | [optional] [default to null]
 **tagId** | **string** | Tag ID. | [optional] [default to null]

### Return type

[**Assetsv3FetchAssetDashboardResponse**](Assetsv3FetchAssetDashboardResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceFetchAssetList

FetchAssetList - Asset Fetch Api .

### Example

```bash
 assetsServiceFetchAssetList
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetListRequest** | [**Assetsv3FetchAssetListRequest**](Assetsv3FetchAssetListRequest.md) |  |

### Return type

[**Assetsv3FetchAssetListResponse**](Assetsv3FetchAssetListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceFetchAssetsForMergeSplit

FetchAssetsForMergeSplit : Fetch assets for Merge and Split.

### Example

```bash
 assetsServiceFetchAssetsForMergeSplit  asset_id=value  page_number=value  page_size=value  action=value  search_key=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **string** | Asset grouper Id. | [optional] [default to null]
 **pageNumber** | **integer** | Page number. | [optional] [default to null]
 **pageSize** | **integer** | Page size. | [optional] [default to null]
 **action** | **string** | Action : merge or split. | [optional] [default to null]
 **searchKey** | **string** | Search from the list based on asset name, database name, ip or host. | [optional] [default to null]

### Return type

[**Assetsv3FetchAssetsForMergeSplitResponse**](Assetsv3FetchAssetsForMergeSplitResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceFindAssetName

FindAssetName - Checks if the given Asset Name has already been assigned to an asset.

### Example

```bash
 assetsServiceFindAssetName  asset_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetName** | **string** | Name of asset. | [optional] [default to null]

### Return type

[**Assetsv3FindAssetNameResponse**](Assetsv3FindAssetNameResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceGetAssetOverview

GetAssetOverview - Get asset overview widgets data for a particular asset.

### Example

```bash
 assetsServiceGetAssetOverview  asset_id=value  page_number=value  size=value  widget=value  ip=value  host=value  database=value  asset_entity_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **string** | Asset grouper Id. | [optional] [default to null]
 **pageNumber** | **integer** | Page number. | [optional] [default to null]
 **size** | **integer** | Page size. | [optional] [default to null]
 **widget** | **string** | Widget type.

 - ALL: All Asset Overview Widgets.
 - CLASSIFICATION: Classification Asset Overview Widgets.
 - TAG: Tag Asset Overview Widgets.
 - RESOURCE: Resource Asset Overview Widgets. | [optional] [default to ALL]
 **ip** | **string** | Asset IP. | [optional] [default to null]
 **host** | **string** | Asset Host. | [optional] [default to null]
 **database** | **string** | Database Name. | [optional] [default to null]
 **assetEntityType** | **string** | asset entity type. | [optional] [default to null]

### Return type

[**Assetsv3AssetOverviewResponse**](Assetsv3AssetOverviewResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceGetAssetTopology

GetAssetTopology- Get list of topology for a parent asset.

### Example

```bash
 assetsServiceGetAssetTopology
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3GetAssetTopologyRequest** | [**Assetsv3GetAssetTopologyRequest**](Assetsv3GetAssetTopologyRequest.md) |  |

### Return type

[**Assetsv3GetAssetTopologyResponse**](Assetsv3GetAssetTopologyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceGetFilterTemplateForAssets

GetFilterTemplateForAssets - Get list of filters query templates for manage assets.

### Example

```bash
 assetsServiceGetFilterTemplateForAssets  template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | template id to be deleted. | [optional] [default to null]

### Return type

[**Assetsv3GetFilterTemplateResponse**](Assetsv3GetFilterTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceGetFiltersForAssets

GetFiltersForAssets - Get a list of filters category and sub category with all data.

### Example

```bash
 assetsServiceGetFiltersForAssets
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Assetsv3GetFiltersDataResponse**](Assetsv3GetFiltersDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceImportCSV

ImportCSV - Start the async asset import from CSV by starting the db procedure and send notification at the end.

### Example

```bash
 assetsServiceImportCSV csv_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csvId** | **string** | unique id of the csv | [default to null]
 **assetsv3ImportCSVRequest** | [**Assetsv3ImportCSVRequest**](Assetsv3ImportCSVRequest.md) |  |

### Return type

[**Assetsv3ImportCSVResponse**](Assetsv3ImportCSVResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceListPolicy

ListPolicy - List all policies.

### Example

```bash
 assetsServiceListPolicy
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Assetsv3ListPolicyResponse**](Assetsv3ListPolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceListRule

ListRule - List all rules for a policy.

### Example

```bash
 assetsServiceListRule policy_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy ID | [default to null]

### Return type

[**Assetsv3ListRuleResponse**](Assetsv3ListRuleResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceListTagDomains

ListTagDomains - Get Tag categories by request parameters .

### Example

```bash
 assetsServiceListTagDomains  dom_grouper=value  purpose=value  need_tag=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domGrouper** | **string** | Optional: dom_grouper required if we want to fetch domains based on the group. | [optional] [default to null]
 **purpose** | **string** | Optional: purpose required if we want to fetch domains based on the purpose. | [optional] [default to null]
 **needTag** | **boolean** | Optional: If we need Tag  based on the Domains. | [optional] [default to null]

### Return type

[**Assetsv3ListTagDomainsResponse**](Assetsv3ListTagDomainsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceListTags

ListTags - Get Tags for Manage Tags listing screen .

### Example

```bash
 assetsServiceListTags  Specify as:  asset_id=value1 asset_id=value2 asset_id=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | [**array[string]**](string.md) | asset id - Asset ID. | [optional] [default to null]

### Return type

[**Assetsv3ListTagsResponse**](Assetsv3ListTagsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceMergeOrSplitAssets

MergeOrSplitAssets - Merge or split the selected assets.

### Example

```bash
 assetsServiceMergeOrSplitAssets
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3MergeOrSplitAssetsRequest** | [**Assetsv3MergeOrSplitAssetsRequest**](Assetsv3MergeOrSplitAssetsRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceSaveAssignedTags

SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.

### Example

```bash
 assetsServiceSaveAssignedTags
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveAssignedTagsRequest** | [**Assetsv3SaveAssignedTagsRequest**](Assetsv3SaveAssignedTagsRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceSaveTagConceptData

SaveTagConceptData - creates a custom tag

### Example

```bash
 assetsServiceSaveTagConceptData
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagConceptDataRequest** | [**Assetsv3SaveTagConceptDataRequest**](Assetsv3SaveTagConceptDataRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceSaveTagDomainData

SaveTagDomainData - creates a custom category to be assigned to a tag

### Example

```bash
 assetsServiceSaveTagDomainData
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagDomainDataRequest** | [**Assetsv3SaveTagDomainDataRequest**](Assetsv3SaveTagDomainDataRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceSaveUpdateFilterTemplateForAssets

SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.

### Example

```bash
 assetsServiceSaveUpdateFilterTemplateForAssets
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveUpdateFilterTemplateRequest** | [**Assetsv3SaveUpdateFilterTemplateRequest**](Assetsv3SaveUpdateFilterTemplateRequest.md) |  |

### Return type

[**Assetsv3SaveUpdateFilterTemplateResponse**](Assetsv3SaveUpdateFilterTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceSetBannerState

SetBannerState - Set banner state for asset inventory page.

### Example

```bash
 assetsServiceSetBannerState
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SetBannerStateRequest** | [**Assetsv3SetBannerStateRequest**](Assetsv3SetBannerStateRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceUpdateAssetName

UpdateAssetName - Udates the name of the asset as given by the user.

### Example

```bash
 assetsServiceUpdateAssetName
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdateAssetNameRequest** | [**Assetsv3UpdateAssetNameRequest**](Assetsv3UpdateAssetNameRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetsServiceUpdatePolicy

UpdatePolicy - Update existing Policy status.

### Example

```bash
 assetsServiceUpdatePolicy
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdatePolicyRequest** | [**Assetsv3UpdatePolicyRequest**](Assetsv3UpdatePolicyRequest.md) |  |

### Return type

**map**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

