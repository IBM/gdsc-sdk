# Assetsv3UpdateAssetNameRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouper_id** | **int** |  | [optional] 
**updated_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_update_asset_name_request import Assetsv3UpdateAssetNameRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3UpdateAssetNameRequest from a JSON string
assetsv3_update_asset_name_request_instance = Assetsv3UpdateAssetNameRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3UpdateAssetNameRequest.to_json())

# convert the object into a dict
assetsv3_update_asset_name_request_dict = assetsv3_update_asset_name_request_instance.to_dict()
# create an instance of Assetsv3UpdateAssetNameRequest from a dict
assetsv3_update_asset_name_request_from_dict = Assetsv3UpdateAssetNameRequest.from_dict(assetsv3_update_asset_name_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


