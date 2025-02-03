# Universalconnectormanagerv3UploadPluginRequest

Upload Universal Connector plugin request with configuration details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**plugin_id** | **str** | Universal Connector plugin ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_upload_plugin_request import Universalconnectormanagerv3UploadPluginRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3UploadPluginRequest from a JSON string
universalconnectormanagerv3_upload_plugin_request_instance = Universalconnectormanagerv3UploadPluginRequest.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3UploadPluginRequest.to_json())

# convert the object into a dict
universalconnectormanagerv3_upload_plugin_request_dict = universalconnectormanagerv3_upload_plugin_request_instance.to_dict()
# create an instance of Universalconnectormanagerv3UploadPluginRequest from a dict
universalconnectormanagerv3_upload_plugin_request_from_dict = Universalconnectormanagerv3UploadPluginRequest.from_dict(universalconnectormanagerv3_upload_plugin_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


