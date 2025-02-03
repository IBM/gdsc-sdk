# Assetsv3MergeOrSplitAssetsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** |  | [optional] 
**destination_assets** | [**List[Assetsv3AssetForMergeSplit]**](Assetsv3AssetForMergeSplit.md) | Assets selected by user to merge with source asset or split from source asset. | [optional] 
**source_asset** | [**Assetsv3AssetForMergeSplit**](Assetsv3AssetForMergeSplit.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_merge_or_split_assets_request import Assetsv3MergeOrSplitAssetsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3MergeOrSplitAssetsRequest from a JSON string
assetsv3_merge_or_split_assets_request_instance = Assetsv3MergeOrSplitAssetsRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3MergeOrSplitAssetsRequest.to_json())

# convert the object into a dict
assetsv3_merge_or_split_assets_request_dict = assetsv3_merge_or_split_assets_request_instance.to_dict()
# create an instance of Assetsv3MergeOrSplitAssetsRequest from a dict
assetsv3_merge_or_split_assets_request_from_dict = Assetsv3MergeOrSplitAssetsRequest.from_dict(assetsv3_merge_or_split_assets_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


