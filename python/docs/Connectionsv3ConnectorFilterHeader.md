# Connectionsv3ConnectorFilterHeader

Connector filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Connectionsv3ConnectorFilter]**](Connectionsv3ConnectorFilter.md) | The number. | [optional] 
**header** | **str** | The header id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_connector_filter_header import Connectionsv3ConnectorFilterHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorFilterHeader from a JSON string
connectionsv3_connector_filter_header_instance = Connectionsv3ConnectorFilterHeader.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorFilterHeader.to_json())

# convert the object into a dict
connectionsv3_connector_filter_header_dict = connectionsv3_connector_filter_header_instance.to_dict()
# create an instance of Connectionsv3ConnectorFilterHeader from a dict
connectionsv3_connector_filter_header_from_dict = Connectionsv3ConnectorFilterHeader.from_dict(connectionsv3_connector_filter_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


