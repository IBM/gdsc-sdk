# Resourcecontrollerk8v3AppFile

AppFile contains the information about an app file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** | Optional: The internal ID of the app for the file. | [optional] 
**content** | **str** | The text content of the app file. | [optional] 
**created** | **str** | Optional: The date this app file was created (ms since epoch). | [optional] 
**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  | [optional] 
**id** | **str** | Optional: The internal ID of the app file. | [optional] 
**mime_type** | **str** | The mime type of the app file (only used to provide an editor). | [optional] 
**modified** | **str** | Optional: The date this app file was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the app file. | [optional] 
**path** | **str** | The path to the file for the app. | [optional] 
**restart_app** | **bool** | True if the app should be restarted when updating this file, false otherwise. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_app_file import Resourcecontrollerk8v3AppFile

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3AppFile from a JSON string
resourcecontrollerk8v3_app_file_instance = Resourcecontrollerk8v3AppFile.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3AppFile.to_json())

# convert the object into a dict
resourcecontrollerk8v3_app_file_dict = resourcecontrollerk8v3_app_file_instance.to_dict()
# create an instance of Resourcecontrollerk8v3AppFile from a dict
resourcecontrollerk8v3_app_file_from_dict = Resourcecontrollerk8v3AppFile.from_dict(resourcecontrollerk8v3_app_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


