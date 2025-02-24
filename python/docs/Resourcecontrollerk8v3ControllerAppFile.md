# Resourcecontrollerk8v3ControllerAppFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The GZIP base64 encoded content of the file. | [optional] 
**id** | **str** | The internal ID of the app file. | [optional] 
**modified** | **str** | The date this app file was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the app file. | [optional] 
**path** | **str** | The path to the file for the app. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_app_file import Resourcecontrollerk8v3ControllerAppFile

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerAppFile from a JSON string
resourcecontrollerk8v3_controller_app_file_instance = Resourcecontrollerk8v3ControllerAppFile.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerAppFile.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_app_file_dict = resourcecontrollerk8v3_controller_app_file_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerAppFile from a dict
resourcecontrollerk8v3_controller_app_file_from_dict = Resourcecontrollerk8v3ControllerAppFile.from_dict(resourcecontrollerk8v3_controller_app_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


