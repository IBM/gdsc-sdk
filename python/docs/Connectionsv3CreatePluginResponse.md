# Connectionsv3CreatePluginResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_create_plugin_response import Connectionsv3CreatePluginResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3CreatePluginResponse from a JSON string
connectionsv3_create_plugin_response_instance = Connectionsv3CreatePluginResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3CreatePluginResponse.to_json())

# convert the object into a dict
connectionsv3_create_plugin_response_dict = connectionsv3_create_plugin_response_instance.to_dict()
# create an instance of Connectionsv3CreatePluginResponse from a dict
connectionsv3_create_plugin_response_from_dict = Connectionsv3CreatePluginResponse.from_dict(connectionsv3_create_plugin_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


