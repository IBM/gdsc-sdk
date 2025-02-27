# Assetsv3AssetForMergeSplit

Asset from Asset Inventory selected for merge or split.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**asset_name** | **str** |  | [optional] 
**dsdef_key** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_for_merge_split import Assetsv3AssetForMergeSplit

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetForMergeSplit from a JSON string
assetsv3_asset_for_merge_split_instance = Assetsv3AssetForMergeSplit.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetForMergeSplit.to_json())

# convert the object into a dict
assetsv3_asset_for_merge_split_dict = assetsv3_asset_for_merge_split_instance.to_dict()
# create an instance of Assetsv3AssetForMergeSplit from a dict
assetsv3_asset_for_merge_split_from_dict = Assetsv3AssetForMergeSplit.from_dict(assetsv3_asset_for_merge_split_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


