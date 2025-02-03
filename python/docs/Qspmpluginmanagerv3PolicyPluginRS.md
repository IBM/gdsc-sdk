# Qspmpluginmanagerv3PolicyPluginRS

PolicyPluginRS is the response object for InvokePolicy API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_id** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scanned_ids** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmpluginmanagerv3_policy_plugin_rs import Qspmpluginmanagerv3PolicyPluginRS

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpluginmanagerv3PolicyPluginRS from a JSON string
qspmpluginmanagerv3_policy_plugin_rs_instance = Qspmpluginmanagerv3PolicyPluginRS.from_json(json)
# print the JSON string representation of the object
print(Qspmpluginmanagerv3PolicyPluginRS.to_json())

# convert the object into a dict
qspmpluginmanagerv3_policy_plugin_rs_dict = qspmpluginmanagerv3_policy_plugin_rs_instance.to_dict()
# create an instance of Qspmpluginmanagerv3PolicyPluginRS from a dict
qspmpluginmanagerv3_policy_plugin_rs_from_dict = Qspmpluginmanagerv3PolicyPluginRS.from_dict(qspmpluginmanagerv3_policy_plugin_rs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


