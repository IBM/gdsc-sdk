# Connectionsv3UpdatePluginResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_update_plugin_response import Connectionsv3UpdatePluginResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdatePluginResponse from a JSON string
connectionsv3_update_plugin_response_instance = Connectionsv3UpdatePluginResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdatePluginResponse.to_json())

# convert the object into a dict
connectionsv3_update_plugin_response_dict = connectionsv3_update_plugin_response_instance.to_dict()
# create an instance of Connectionsv3UpdatePluginResponse from a dict
connectionsv3_update_plugin_response_from_dict = Connectionsv3UpdatePluginResponse.from_dict(connectionsv3_update_plugin_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


