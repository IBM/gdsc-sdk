# Connectionsv3DeletePluginResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_delete_plugin_response import Connectionsv3DeletePluginResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3DeletePluginResponse from a JSON string
connectionsv3_delete_plugin_response_instance = Connectionsv3DeletePluginResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3DeletePluginResponse.to_json())

# convert the object into a dict
connectionsv3_delete_plugin_response_dict = connectionsv3_delete_plugin_response_instance.to_dict()
# create an instance of Connectionsv3DeletePluginResponse from a dict
connectionsv3_delete_plugin_response_from_dict = Connectionsv3DeletePluginResponse.from_dict(connectionsv3_delete_plugin_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


