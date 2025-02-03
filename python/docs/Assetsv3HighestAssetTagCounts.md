# Assetsv3HighestAssetTagCounts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag_category** | **str** |  | [optional] 
**tag_category_id** | **str** |  | [optional] 
**tag_id** | **str** |  | [optional] 
**tag_name** | **str** |  | [optional] 
**total_assets** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_highest_asset_tag_counts import Assetsv3HighestAssetTagCounts

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3HighestAssetTagCounts from a JSON string
assetsv3_highest_asset_tag_counts_instance = Assetsv3HighestAssetTagCounts.from_json(json)
# print the JSON string representation of the object
print(Assetsv3HighestAssetTagCounts.to_json())

# convert the object into a dict
assetsv3_highest_asset_tag_counts_dict = assetsv3_highest_asset_tag_counts_instance.to_dict()
# create an instance of Assetsv3HighestAssetTagCounts from a dict
assetsv3_highest_asset_tag_counts_from_dict = Assetsv3HighestAssetTagCounts.from_dict(assetsv3_highest_asset_tag_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


