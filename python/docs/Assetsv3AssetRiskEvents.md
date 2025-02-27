# Assetsv3AssetRiskEvents


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_open_risk_event_list** | [**List[Assetsv3AssetOpenRiskEventList]**](Assetsv3AssetOpenRiskEventList.md) |  | [optional] 
**last_activity** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_risk_events import Assetsv3AssetRiskEvents

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetRiskEvents from a JSON string
assetsv3_asset_risk_events_instance = Assetsv3AssetRiskEvents.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetRiskEvents.to_json())

# convert the object into a dict
assetsv3_asset_risk_events_dict = assetsv3_asset_risk_events_instance.to_dict()
# create an instance of Assetsv3AssetRiskEvents from a dict
assetsv3_asset_risk_events_from_dict = Assetsv3AssetRiskEvents.from_dict(assetsv3_asset_risk_events_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


