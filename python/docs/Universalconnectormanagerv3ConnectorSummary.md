# Universalconnectormanagerv3ConnectorSummary

Part of GetConnectors response. Contains details about a Universal connector connection configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**combined_configuration** | **str** | Connector configuration parameters. A union of Input and Filter parameters. | [optional] 
**combined_configuration_strings** | **str** | Connector configuration parameters strings, for UI. | [optional] 
**connector_name** | **str** | ID of connector. | [optional] 
**developer** | **str** | The developer who developed the manifest. | [optional] 
**filter_plugin** | [**Universalconnectormanagerv3PluginDefinition**](Universalconnectormanagerv3PluginDefinition.md) |  | [optional] 
**filter_plugin_name** | **str** | ID of filter plugin. | [optional] 
**input_plugin** | [**Universalconnectormanagerv3PluginDefinition**](Universalconnectormanagerv3PluginDefinition.md) |  | [optional] 
**input_plugin_name** | **str** | ID of input plugin. | [optional] 
**supported_datasources** | [**List[Universalconnectormanagerv3DatasourceType]**](Universalconnectormanagerv3DatasourceType.md) | Supported data source types, according to the Filter plugin. | [optional] 
**supported_platforms** | **List[str]** | Array of supported platforms/environments. Examples: \&quot;on-premise\&quot;, \&quot;AWS\&quot;, \&quot;Azure\&quot;, \&quot;GCP\&quot;. | [optional] 
**upload_date** | **datetime** | Date connector manifest was uploaded. | [optional] 
**upload_user** | **str** | User who uploaded the manifest. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_connector_summary import Universalconnectormanagerv3ConnectorSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3ConnectorSummary from a JSON string
universalconnectormanagerv3_connector_summary_instance = Universalconnectormanagerv3ConnectorSummary.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3ConnectorSummary.to_json())

# convert the object into a dict
universalconnectormanagerv3_connector_summary_dict = universalconnectormanagerv3_connector_summary_instance.to_dict()
# create an instance of Universalconnectormanagerv3ConnectorSummary from a dict
universalconnectormanagerv3_connector_summary_from_dict = Universalconnectormanagerv3ConnectorSummary.from_dict(universalconnectormanagerv3_connector_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


