# Assetsv3AssetControl

AssetControl - Asset Overview - Control Health widget data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryption** | [**Assetsv3StatusType**](Assetsv3StatusType.md) |  | [optional] 
**last_response** | **str** |  | [optional] 
**monitoring** | [**Assetsv3StatusType**](Assetsv3StatusType.md) |  | [optional] 
**policy_applied_status** | [**Assetsv3PolicyApplied**](Assetsv3PolicyApplied.md) |  | [optional] 
**stap_name** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_control import Assetsv3AssetControl

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetControl from a JSON string
assetsv3_asset_control_instance = Assetsv3AssetControl.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetControl.to_json())

# convert the object into a dict
assetsv3_asset_control_dict = assetsv3_asset_control_instance.to_dict()
# create an instance of Assetsv3AssetControl from a dict
assetsv3_asset_control_from_dict = Assetsv3AssetControl.from_dict(assetsv3_asset_control_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


