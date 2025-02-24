# Assetsv3FetchAssetDashboardResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_with_open_vulnerabilities** | [**List[Assetsv3AssetsWithOpenVulnerabilities]**](Assetsv3AssetsWithOpenVulnerabilities.md) |  | [optional] 
**classification_scan_status** | [**List[Assetsv3ClassificationScanStatus]**](Assetsv3ClassificationScanStatus.md) |  | [optional] 
**count** | **str** |  | [optional] 
**highest_asset_tag_counts** | [**List[Assetsv3HighestAssetTagCounts]**](Assetsv3HighestAssetTagCounts.md) |  | [optional] 
**selected_filters** | [**List[Assetsv3FilterCatagory]**](Assetsv3FilterCatagory.md) |  | [optional] 
**tag_categories_data** | [**List[Assetsv3TagCategoriesData]**](Assetsv3TagCategoriesData.md) |  | [optional] 
**tags_filter_data** | [**List[Assetsv3TagsFilterData]**](Assetsv3TagsFilterData.md) |  | [optional] 
**template_id** | **str** |  | [optional] 
**vulnerability_scan_status** | [**List[Assetsv3VulnerabilityScanStatus]**](Assetsv3VulnerabilityScanStatus.md) |  | [optional] 
**vulnerability_trend** | [**List[Assetsv3VulnerabilityTrend]**](Assetsv3VulnerabilityTrend.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_fetch_asset_dashboard_response import Assetsv3FetchAssetDashboardResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FetchAssetDashboardResponse from a JSON string
assetsv3_fetch_asset_dashboard_response_instance = Assetsv3FetchAssetDashboardResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FetchAssetDashboardResponse.to_json())

# convert the object into a dict
assetsv3_fetch_asset_dashboard_response_dict = assetsv3_fetch_asset_dashboard_response_instance.to_dict()
# create an instance of Assetsv3FetchAssetDashboardResponse from a dict
assetsv3_fetch_asset_dashboard_response_from_dict = Assetsv3FetchAssetDashboardResponse.from_dict(assetsv3_fetch_asset_dashboard_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


