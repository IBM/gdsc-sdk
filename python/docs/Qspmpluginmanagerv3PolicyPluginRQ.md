# Qspmpluginmanagerv3PolicyPluginRQ

PolicyPluginRQ is the request object for InvokePolicy API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_param** | **Dict[str, str]** |  | [optional] 
**org_id** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**run_for_all_scans** | **bool** |  | [optional] 
**run_for_given_scan** | **bool** |  | [optional] 
**scan_desc** | **str** |  | [optional] 
**scan_id** | **str** |  | [optional] 
**scan_type** | **str** |  | [optional] 
**user_email** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmpluginmanagerv3_policy_plugin_rq import Qspmpluginmanagerv3PolicyPluginRQ

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpluginmanagerv3PolicyPluginRQ from a JSON string
qspmpluginmanagerv3_policy_plugin_rq_instance = Qspmpluginmanagerv3PolicyPluginRQ.from_json(json)
# print the JSON string representation of the object
print(Qspmpluginmanagerv3PolicyPluginRQ.to_json())

# convert the object into a dict
qspmpluginmanagerv3_policy_plugin_rq_dict = qspmpluginmanagerv3_policy_plugin_rq_instance.to_dict()
# create an instance of Qspmpluginmanagerv3PolicyPluginRQ from a dict
qspmpluginmanagerv3_policy_plugin_rq_from_dict = Qspmpluginmanagerv3PolicyPluginRQ.from_dict(qspmpluginmanagerv3_policy_plugin_rq_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


