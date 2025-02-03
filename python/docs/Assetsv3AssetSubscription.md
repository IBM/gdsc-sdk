# Assetsv3AssetSubscription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **str** |  | [optional] 
**end_time** | **str** |  | [optional] 
**start_time** | **str** |  | [optional] 
**subscription** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_asset_subscription import Assetsv3AssetSubscription

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetSubscription from a JSON string
assetsv3_asset_subscription_instance = Assetsv3AssetSubscription.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetSubscription.to_json())

# convert the object into a dict
assetsv3_asset_subscription_dict = assetsv3_asset_subscription_instance.to_dict()
# create an instance of Assetsv3AssetSubscription from a dict
assetsv3_asset_subscription_from_dict = Assetsv3AssetSubscription.from_dict(assetsv3_asset_subscription_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


