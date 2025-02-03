# Connectionsv3ConnectorSettingStat

Connector setting statistics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The count for the given setting. | [optional] 
**has_unhealthy** | **bool** | Has unhealthy connections. | [optional] 
**id** | **str** | The id of the setting. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_connector_setting_stat import Connectionsv3ConnectorSettingStat

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorSettingStat from a JSON string
connectionsv3_connector_setting_stat_instance = Connectionsv3ConnectorSettingStat.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorSettingStat.to_json())

# convert the object into a dict
connectionsv3_connector_setting_stat_dict = connectionsv3_connector_setting_stat_instance.to_dict()
# create an instance of Connectionsv3ConnectorSettingStat from a dict
connectionsv3_connector_setting_stat_from_dict = Connectionsv3ConnectorSettingStat.from_dict(connectionsv3_connector_setting_stat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


