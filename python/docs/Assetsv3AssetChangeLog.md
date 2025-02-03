# Assetsv3AssetChangeLog


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_taken** | **str** |  | [optional] 
**activity** | **str** |  | [optional] 
**after** | [**List[Assetsv3BeforeAfter]**](Assetsv3BeforeAfter.md) |  | [optional] 
**before** | [**List[Assetsv3BeforeAfter]**](Assetsv3BeforeAfter.md) |  | [optional] 
**var_date** | **str** |  | [optional] 
**performed_by** | **str** |  | [optional] 
**rule** | [**List[Assetsv3RuleLog]**](Assetsv3RuleLog.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_asset_change_log import Assetsv3AssetChangeLog

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetChangeLog from a JSON string
assetsv3_asset_change_log_instance = Assetsv3AssetChangeLog.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetChangeLog.to_json())

# convert the object into a dict
assetsv3_asset_change_log_dict = assetsv3_asset_change_log_instance.to_dict()
# create an instance of Assetsv3AssetChangeLog from a dict
assetsv3_asset_change_log_from_dict = Assetsv3AssetChangeLog.from_dict(assetsv3_asset_change_log_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


