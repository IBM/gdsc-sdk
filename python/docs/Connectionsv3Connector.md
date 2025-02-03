# Connectionsv3Connector

Connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | [**List[Connectionsv3ConnectorColumn]**](Connectionsv3ConnectorColumn.md) | The columns. | [optional] 
**id** | **str** | The id of the connector. | [optional] 
**tags** | **List[str]** | The tags that this connector has. | [optional] 
**type** | [**Connectionsv3ConnectorType**](Connectionsv3ConnectorType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_connector import Connectionsv3Connector

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3Connector from a JSON string
connectionsv3_connector_instance = Connectionsv3Connector.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3Connector.to_json())

# convert the object into a dict
connectionsv3_connector_dict = connectionsv3_connector_instance.to_dict()
# create an instance of Connectionsv3Connector from a dict
connectionsv3_connector_from_dict = Connectionsv3Connector.from_dict(connectionsv3_connector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


