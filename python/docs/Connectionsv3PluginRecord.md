# Connectionsv3PluginRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guard_record_name** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_plugin_record import Connectionsv3PluginRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3PluginRecord from a JSON string
connectionsv3_plugin_record_instance = Connectionsv3PluginRecord.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3PluginRecord.to_json())

# convert the object into a dict
connectionsv3_plugin_record_dict = connectionsv3_plugin_record_instance.to_dict()
# create an instance of Connectionsv3PluginRecord from a dict
connectionsv3_plugin_record_from_dict = Connectionsv3PluginRecord.from_dict(connectionsv3_plugin_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


