# Connectionsv3UpdatePluginRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_type** | **str** |  | [optional] 
**developer_name** | **str** |  | [optional] 
**document_link** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**logfile** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**readme** | **str** |  | [optional] 
**records** | [**List[Connectionsv3PluginRecord]**](Connectionsv3PluginRecord.md) |  | [optional] 
**state** | **str** |  | [optional] 
**supported_inputs** | **List[str]** |  | [optional] 
**version** | **str** |  | [optional] 
**version_tested** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_update_plugin_request import Connectionsv3UpdatePluginRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdatePluginRequest from a JSON string
connectionsv3_update_plugin_request_instance = Connectionsv3UpdatePluginRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdatePluginRequest.to_json())

# convert the object into a dict
connectionsv3_update_plugin_request_dict = connectionsv3_update_plugin_request_instance.to_dict()
# create an instance of Connectionsv3UpdatePluginRequest from a dict
connectionsv3_update_plugin_request_from_dict = Connectionsv3UpdatePluginRequest.from_dict(connectionsv3_update_plugin_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


