# Qspmpluginmanagerv3PluginRS

PluginRS is the response object for InvokePlugin,InvokeAppProv,InvokeExplorerV1,InvokeExplorerV2 API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dims** | [**List[Qspmpluginmanagerv3EntityNewSchema]**](Qspmpluginmanagerv3EntityNewSchema.md) |  | [optional] 
**facts** | [**List[Qspmpluginmanagerv3EntityNewSchema]**](Qspmpluginmanagerv3EntityNewSchema.md) |  | [optional] 
**org_id** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scan_id** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 
**validation_result** | [**Qspmpluginmanagerv3ValidationResult**](Qspmpluginmanagerv3ValidationResult.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmpluginmanagerv3_plugin_rs import Qspmpluginmanagerv3PluginRS

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpluginmanagerv3PluginRS from a JSON string
qspmpluginmanagerv3_plugin_rs_instance = Qspmpluginmanagerv3PluginRS.from_json(json)
# print the JSON string representation of the object
print(Qspmpluginmanagerv3PluginRS.to_json())

# convert the object into a dict
qspmpluginmanagerv3_plugin_rs_dict = qspmpluginmanagerv3_plugin_rs_instance.to_dict()
# create an instance of Qspmpluginmanagerv3PluginRS from a dict
qspmpluginmanagerv3_plugin_rs_from_dict = Qspmpluginmanagerv3PluginRS.from_dict(qspmpluginmanagerv3_plugin_rs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


