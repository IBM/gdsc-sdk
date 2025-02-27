# Assetsv3AssetOpenRiskEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criticallity** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**risk_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_open_risk_event import Assetsv3AssetOpenRiskEvent

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetOpenRiskEvent from a JSON string
assetsv3_asset_open_risk_event_instance = Assetsv3AssetOpenRiskEvent.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetOpenRiskEvent.to_json())

# convert the object into a dict
assetsv3_asset_open_risk_event_dict = assetsv3_asset_open_risk_event_instance.to_dict()
# create an instance of Assetsv3AssetOpenRiskEvent from a dict
assetsv3_asset_open_risk_event_from_dict = Assetsv3AssetOpenRiskEvent.from_dict(assetsv3_asset_open_risk_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


