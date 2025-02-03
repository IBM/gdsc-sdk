# Connectionsv3ConnectorAttribute

Connector attribute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The header id. | [optional] 
**tags** | **List[str]** | The list of tags for this connection. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_connector_attribute import Connectionsv3ConnectorAttribute

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorAttribute from a JSON string
connectionsv3_connector_attribute_instance = Connectionsv3ConnectorAttribute.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorAttribute.to_json())

# convert the object into a dict
connectionsv3_connector_attribute_dict = connectionsv3_connector_attribute_instance.to_dict()
# create an instance of Connectionsv3ConnectorAttribute from a dict
connectionsv3_connector_attribute_from_dict = Connectionsv3ConnectorAttribute.from_dict(connectionsv3_connector_attribute_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


