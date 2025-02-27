# Qspmpluginmanagerv3PluginRQ

PluginRQ is the request object for InvokePlugin,InvokeAppProv,InvokeExplorerV1,InvokeExplorerV2 API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_param** | **Dict[str, str]** |  | [optional] 
**org_id** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**provision_id** | **str** |  | [optional] 
**run_for_all_scans** | **bool** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scan_id** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpluginmanagerv3_plugin_rq import Qspmpluginmanagerv3PluginRQ

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpluginmanagerv3PluginRQ from a JSON string
qspmpluginmanagerv3_plugin_rq_instance = Qspmpluginmanagerv3PluginRQ.from_json(json)
# print the JSON string representation of the object
print(Qspmpluginmanagerv3PluginRQ.to_json())

# convert the object into a dict
qspmpluginmanagerv3_plugin_rq_dict = qspmpluginmanagerv3_plugin_rq_instance.to_dict()
# create an instance of Qspmpluginmanagerv3PluginRQ from a dict
qspmpluginmanagerv3_plugin_rq_from_dict = Qspmpluginmanagerv3PluginRQ.from_dict(qspmpluginmanagerv3_plugin_rq_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


