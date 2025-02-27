# Connectionsv3ConnectorSetting

Connector setting.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description. | [optional] 
**filters** | [**List[Connectionsv3HeaderFilter]**](Connectionsv3HeaderFilter.md) | The filters associated to this setting. | [optional] 
**headers** | **List[str]** | The headers used when this setting is active. | [optional] 
**id** | **str** | The id of the setting. | [optional] 
**name** | **str** | The name of the Preset. | [optional] 
**order** | [**Connectionsv3OrderType**](Connectionsv3OrderType.md) |  | [optional] 
**sorted_by** | **str** | The header key used for sorting. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_connector_setting import Connectionsv3ConnectorSetting

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorSetting from a JSON string
connectionsv3_connector_setting_instance = Connectionsv3ConnectorSetting.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorSetting.to_json())

# convert the object into a dict
connectionsv3_connector_setting_dict = connectionsv3_connector_setting_instance.to_dict()
# create an instance of Connectionsv3ConnectorSetting from a dict
connectionsv3_connector_setting_from_dict = Connectionsv3ConnectorSetting.from_dict(connectionsv3_connector_setting_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


