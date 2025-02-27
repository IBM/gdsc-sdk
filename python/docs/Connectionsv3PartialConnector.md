# Connectionsv3PartialConnector

Partial connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | [**List[Connectionsv3ConnectorColumn]**](Connectionsv3ConnectorColumn.md) | The updated columns. | [optional] 
**id** | **str** | The id of the connector. | [optional] 
**last_response** | **str** | The heartbeat. | [optional] 
**tags** | **List[str]** | The updated tags. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_partial_connector import Connectionsv3PartialConnector

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3PartialConnector from a JSON string
connectionsv3_partial_connector_instance = Connectionsv3PartialConnector.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3PartialConnector.to_json())

# convert the object into a dict
connectionsv3_partial_connector_dict = connectionsv3_partial_connector_instance.to_dict()
# create an instance of Connectionsv3PartialConnector from a dict
connectionsv3_partial_connector_from_dict = Connectionsv3PartialConnector.from_dict(connectionsv3_partial_connector_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


