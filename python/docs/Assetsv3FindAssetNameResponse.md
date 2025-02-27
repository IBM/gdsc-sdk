# Assetsv3FindAssetNameResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**already_used** | **str** | Is the given asset name already used. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_find_asset_name_response import Assetsv3FindAssetNameResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FindAssetNameResponse from a JSON string
assetsv3_find_asset_name_response_instance = Assetsv3FindAssetNameResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FindAssetNameResponse.to_json())

# convert the object into a dict
assetsv3_find_asset_name_response_dict = assetsv3_find_asset_name_response_instance.to_dict()
# create an instance of Assetsv3FindAssetNameResponse from a dict
assetsv3_find_asset_name_response_from_dict = Assetsv3FindAssetNameResponse.from_dict(assetsv3_find_asset_name_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


