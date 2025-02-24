# Qspmdatamanagerv3PluginDataModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin_desc** | **str** |  | [optional] 
**plugin_id** | **str** |  | [optional] 
**plugin_name** | **str** |  | [optional] 
**plugin_status** | **str** |  | [optional] 
**plugin_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_plugin_data_model import Qspmdatamanagerv3PluginDataModel

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3PluginDataModel from a JSON string
qspmdatamanagerv3_plugin_data_model_instance = Qspmdatamanagerv3PluginDataModel.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3PluginDataModel.to_json())

# convert the object into a dict
qspmdatamanagerv3_plugin_data_model_dict = qspmdatamanagerv3_plugin_data_model_instance.to_dict()
# create an instance of Qspmdatamanagerv3PluginDataModel from a dict
qspmdatamanagerv3_plugin_data_model_from_dict = Qspmdatamanagerv3PluginDataModel.from_dict(qspmdatamanagerv3_plugin_data_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


