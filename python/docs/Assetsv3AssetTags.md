# Assetsv3AssetTags

AssetTags - Tag related info for the asset used in Tags widget.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** |  | [optional] 
**concept** | **str** |  | [optional] 
**concept_id** | **str** |  | [optional] 
**domain_id** | **str** |  | [optional] 
**domain_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_asset_tags import Assetsv3AssetTags

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetTags from a JSON string
assetsv3_asset_tags_instance = Assetsv3AssetTags.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetTags.to_json())

# convert the object into a dict
assetsv3_asset_tags_dict = assetsv3_asset_tags_instance.to_dict()
# create an instance of Assetsv3AssetTags from a dict
assetsv3_asset_tags_from_dict = Assetsv3AssetTags.from_dict(assetsv3_asset_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


