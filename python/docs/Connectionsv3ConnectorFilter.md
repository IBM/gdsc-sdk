# Connectionsv3ConnectorFilter

Connector filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The number. | [optional] 
**value** | **str** | The column filter value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_connector_filter import Connectionsv3ConnectorFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorFilter from a JSON string
connectionsv3_connector_filter_instance = Connectionsv3ConnectorFilter.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorFilter.to_json())

# convert the object into a dict
connectionsv3_connector_filter_dict = connectionsv3_connector_filter_instance.to_dict()
# create an instance of Connectionsv3ConnectorFilter from a dict
connectionsv3_connector_filter_from_dict = Connectionsv3ConnectorFilter.from_dict(connectionsv3_connector_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


