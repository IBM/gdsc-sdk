# Connectionsv3PluginConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_type** | **str** |  | [optional] 
**developer_name** | **str** |  | [optional] 
**document_link** | **str** |  | [optional] 
**gdp_package_link** | **str** |  | [optional] 
**gi_package_link** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**last_modified** | **datetime** |  | [optional] 
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
from ibm_gdsc_sdk_saas.models.connectionsv3_plugin_configuration import Connectionsv3PluginConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3PluginConfiguration from a JSON string
connectionsv3_plugin_configuration_instance = Connectionsv3PluginConfiguration.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3PluginConfiguration.to_json())

# convert the object into a dict
connectionsv3_plugin_configuration_dict = connectionsv3_plugin_configuration_instance.to_dict()
# create an instance of Connectionsv3PluginConfiguration from a dict
connectionsv3_plugin_configuration_from_dict = Connectionsv3PluginConfiguration.from_dict(connectionsv3_plugin_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


