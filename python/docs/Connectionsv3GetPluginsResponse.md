# Connectionsv3GetPluginsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugins** | [**List[Connectionsv3PluginConfiguration]**](Connectionsv3PluginConfiguration.md) |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_get_plugins_response import Connectionsv3GetPluginsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetPluginsResponse from a JSON string
connectionsv3_get_plugins_response_instance = Connectionsv3GetPluginsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetPluginsResponse.to_json())

# convert the object into a dict
connectionsv3_get_plugins_response_dict = connectionsv3_get_plugins_response_instance.to_dict()
# create an instance of Connectionsv3GetPluginsResponse from a dict
connectionsv3_get_plugins_response_from_dict = Connectionsv3GetPluginsResponse.from_dict(connectionsv3_get_plugins_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


