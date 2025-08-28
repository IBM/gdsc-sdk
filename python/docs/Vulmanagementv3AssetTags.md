# Vulmanagementv3AssetTags


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag_category** | **str** | Category of the tag. | [optional] 
**tag_name** | **str** | Name of the tag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_asset_tags import Vulmanagementv3AssetTags

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3AssetTags from a JSON string
vulmanagementv3_asset_tags_instance = Vulmanagementv3AssetTags.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3AssetTags.to_json())

# convert the object into a dict
vulmanagementv3_asset_tags_dict = vulmanagementv3_asset_tags_instance.to_dict()
# create an instance of Vulmanagementv3AssetTags from a dict
vulmanagementv3_asset_tags_from_dict = Vulmanagementv3AssetTags.from_dict(vulmanagementv3_asset_tags_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


