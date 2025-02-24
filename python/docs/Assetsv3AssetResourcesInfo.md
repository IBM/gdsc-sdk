# Assetsv3AssetResourcesInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**List[Assetsv3ResourceData]**](Assetsv3ResourceData.md) |  | [optional] 
**total_count** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_resources_info import Assetsv3AssetResourcesInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetResourcesInfo from a JSON string
assetsv3_asset_resources_info_instance = Assetsv3AssetResourcesInfo.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetResourcesInfo.to_json())

# convert the object into a dict
assetsv3_asset_resources_info_dict = assetsv3_asset_resources_info_instance.to_dict()
# create an instance of Assetsv3AssetResourcesInfo from a dict
assetsv3_asset_resources_info_from_dict = Assetsv3AssetResourcesInfo.from_dict(assetsv3_asset_resources_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


