# Universalconnectormanagerv3PluginDefinition

Plugin definition based on UCPluginDefinition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin_jdbc_driver_required** | **bool** |  | [optional] 
**plugin_alias** | **str** | mongoDB. | [optional] 
**plugin_configuration_notes** | **str** | Config noted. | [optional] 
**plugin_description** | **str** | Description. | [optional] 
**plugin_developer** | **str** | Developer. | [optional] 
**plugin_documentation_path** | **str** | Documentation path. | [optional] 
**plugin_license** | **str** | License. | [optional] 
**plugin_name** | **str** | Name. | [optional] 
**plugin_pipeline_type** | **str** | Pipeline type. | [optional] 
**plugin_type** | **str** | Filter/input. | [optional] 
**plugin_version** | **str** | Plugin version. | [optional] 
**supported_input_plugins** | **List[str]** | Collection of supported input plugins. | [optional] 
**supported_datasources** | [**List[Universalconnectormanagerv3DatasourceType]**](Universalconnectormanagerv3DatasourceType.md) | Collection of DatasourceType. | [optional] 
**upload_date** | **datetime** | Datetime of plugin upload. | [optional] 
**upload_user** | **str** | Plugin user upload. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_plugin_definition import Universalconnectormanagerv3PluginDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3PluginDefinition from a JSON string
universalconnectormanagerv3_plugin_definition_instance = Universalconnectormanagerv3PluginDefinition.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3PluginDefinition.to_json())

# convert the object into a dict
universalconnectormanagerv3_plugin_definition_dict = universalconnectormanagerv3_plugin_definition_instance.to_dict()
# create an instance of Universalconnectormanagerv3PluginDefinition from a dict
universalconnectormanagerv3_plugin_definition_from_dict = Universalconnectormanagerv3PluginDefinition.from_dict(universalconnectormanagerv3_plugin_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


