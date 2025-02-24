# Qspmdatamanagerv3PluginDataResponse

PluginDataResponse is the response object for GetPluginrData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugindata** | [**List[Qspmdatamanagerv3PluginDataModel]**](Qspmdatamanagerv3PluginDataModel.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_plugin_data_response import Qspmdatamanagerv3PluginDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3PluginDataResponse from a JSON string
qspmdatamanagerv3_plugin_data_response_instance = Qspmdatamanagerv3PluginDataResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3PluginDataResponse.to_json())

# convert the object into a dict
qspmdatamanagerv3_plugin_data_response_dict = qspmdatamanagerv3_plugin_data_response_instance.to_dict()
# create an instance of Qspmdatamanagerv3PluginDataResponse from a dict
qspmdatamanagerv3_plugin_data_response_from_dict = Qspmdatamanagerv3PluginDataResponse.from_dict(qspmdatamanagerv3_plugin_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


