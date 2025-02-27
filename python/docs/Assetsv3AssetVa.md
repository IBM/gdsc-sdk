# Assetsv3AssetVa

AssetVa - Asset Overview - Vulnerabilites widget data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**critical_count** | **int** |  | [optional] 
**high_count** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_va import Assetsv3AssetVa

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetVa from a JSON string
assetsv3_asset_va_instance = Assetsv3AssetVa.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetVa.to_json())

# convert the object into a dict
assetsv3_asset_va_dict = assetsv3_asset_va_instance.to_dict()
# create an instance of Assetsv3AssetVa from a dict
assetsv3_asset_va_from_dict = Assetsv3AssetVa.from_dict(assetsv3_asset_va_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


