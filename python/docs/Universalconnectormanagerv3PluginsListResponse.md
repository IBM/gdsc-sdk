# Universalconnectormanagerv3PluginsListResponse

list of plugins defined for Universal Connector.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugins** | [**List[Universalconnectormanagerv3PluginDefinition]**](Universalconnectormanagerv3PluginDefinition.md) | Collection of plugins definitions. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_plugins_list_response import Universalconnectormanagerv3PluginsListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3PluginsListResponse from a JSON string
universalconnectormanagerv3_plugins_list_response_instance = Universalconnectormanagerv3PluginsListResponse.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3PluginsListResponse.to_json())

# convert the object into a dict
universalconnectormanagerv3_plugins_list_response_dict = universalconnectormanagerv3_plugins_list_response_instance.to_dict()
# create an instance of Universalconnectormanagerv3PluginsListResponse from a dict
universalconnectormanagerv3_plugins_list_response_from_dict = Universalconnectormanagerv3PluginsListResponse.from_dict(universalconnectormanagerv3_plugins_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


