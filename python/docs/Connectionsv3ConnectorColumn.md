# Connectionsv3ConnectorColumn

Connector column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The header id. | [optional] 
**values** | **List[str]** | The column value. Multiple values are possible for STAP. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_connector_column import Connectionsv3ConnectorColumn

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorColumn from a JSON string
connectionsv3_connector_column_instance = Connectionsv3ConnectorColumn.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorColumn.to_json())

# convert the object into a dict
connectionsv3_connector_column_dict = connectionsv3_connector_column_instance.to_dict()
# create an instance of Connectionsv3ConnectorColumn from a dict
connectionsv3_connector_column_from_dict = Connectionsv3ConnectorColumn.from_dict(connectionsv3_connector_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


