# Resourcecontrollerk8v3File

File Contains the information about a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | The text content of the file. | [optional] 
**created** | **str** | Optional: The date this file was created (ms since epoch). | [optional] 
**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  | [optional] 
**id** | **str** | Optional: The internal ID of the file. | [optional] 
**modified** | **str** | Optional: The date this file was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the file with pattern \&quot;^[a-zA-Z0-9-_.]+$\&quot;. | [optional] 
**path** | **str** | The path to the file, due to the limitation of the database, the length of path + name must be less than 2668 characters. | [optional] 
**type** | **str** | The type of the file (only used to provide an editor). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_file import Resourcecontrollerk8v3File

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3File from a JSON string
resourcecontrollerk8v3_file_instance = Resourcecontrollerk8v3File.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3File.to_json())

# convert the object into a dict
resourcecontrollerk8v3_file_dict = resourcecontrollerk8v3_file_instance.to_dict()
# create an instance of Resourcecontrollerk8v3File from a dict
resourcecontrollerk8v3_file_from_dict = Resourcecontrollerk8v3File.from_dict(resourcecontrollerk8v3_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


