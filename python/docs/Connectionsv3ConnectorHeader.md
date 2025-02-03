# Connectionsv3ConnectorHeader

Connector header.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The header id. | [optional] 
**is_default** | **bool** | Is the header displayed by default. | [optional] 
**is_editable** | **bool** | Is editable. | [optional] 
**is_hidden** | **bool** | Visible in the UI. | [optional] 
**nls_key** | **str** | The header nls_key. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_connector_header import Connectionsv3ConnectorHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ConnectorHeader from a JSON string
connectionsv3_connector_header_instance = Connectionsv3ConnectorHeader.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ConnectorHeader.to_json())

# convert the object into a dict
connectionsv3_connector_header_dict = connectionsv3_connector_header_instance.to_dict()
# create an instance of Connectionsv3ConnectorHeader from a dict
connectionsv3_connector_header_from_dict = Connectionsv3ConnectorHeader.from_dict(connectionsv3_connector_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


