# Workflowv3GetFilenameResponse

GetFilenameResponse - returns file path name and name to be saved for a report result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_name** | **str** | File path name of result to be downloaded. | [optional] 
**friendly_name** | **str** | Friendly name for the file to be saved as. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_get_filename_response import Workflowv3GetFilenameResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetFilenameResponse from a JSON string
workflowv3_get_filename_response_instance = Workflowv3GetFilenameResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetFilenameResponse.to_json())

# convert the object into a dict
workflowv3_get_filename_response_dict = workflowv3_get_filename_response_instance.to_dict()
# create an instance of Workflowv3GetFilenameResponse from a dict
workflowv3_get_filename_response_from_dict = Workflowv3GetFilenameResponse.from_dict(workflowv3_get_filename_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


