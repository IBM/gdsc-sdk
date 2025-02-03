# Connectionsv3InternalCreateConnectionConfigResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_internal_create_connection_config_response import Connectionsv3InternalCreateConnectionConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3InternalCreateConnectionConfigResponse from a JSON string
connectionsv3_internal_create_connection_config_response_instance = Connectionsv3InternalCreateConnectionConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3InternalCreateConnectionConfigResponse.to_json())

# convert the object into a dict
connectionsv3_internal_create_connection_config_response_dict = connectionsv3_internal_create_connection_config_response_instance.to_dict()
# create an instance of Connectionsv3InternalCreateConnectionConfigResponse from a dict
connectionsv3_internal_create_connection_config_response_from_dict = Connectionsv3InternalCreateConnectionConfigResponse.from_dict(connectionsv3_internal_create_connection_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


