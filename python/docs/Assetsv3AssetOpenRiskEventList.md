# Assetsv3AssetOpenRiskEventList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_type** | **str** |  | [optional] 
**expandable** | **bool** |  | [optional] 
**value** | [**List[Assetsv3AssetOpenRiskEvent]**](Assetsv3AssetOpenRiskEvent.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset_open_risk_event_list import Assetsv3AssetOpenRiskEventList

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetOpenRiskEventList from a JSON string
assetsv3_asset_open_risk_event_list_instance = Assetsv3AssetOpenRiskEventList.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetOpenRiskEventList.to_json())

# convert the object into a dict
assetsv3_asset_open_risk_event_list_dict = assetsv3_asset_open_risk_event_list_instance.to_dict()
# create an instance of Assetsv3AssetOpenRiskEventList from a dict
assetsv3_asset_open_risk_event_list_from_dict = Assetsv3AssetOpenRiskEventList.from_dict(assetsv3_asset_open_risk_event_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


