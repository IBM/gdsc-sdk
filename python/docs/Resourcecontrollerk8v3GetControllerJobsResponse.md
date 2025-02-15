# Resourcecontrollerk8v3GetControllerJobsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | The ID of the controller to get jobs for. | [optional] 
**jobs** | [**List[Resourcecontrollerk8v3Job]**](Resourcecontrollerk8v3Job.md) | The controllers for the tenant. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_get_controller_jobs_response import Resourcecontrollerk8v3GetControllerJobsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetControllerJobsResponse from a JSON string
resourcecontrollerk8v3_get_controller_jobs_response_instance = Resourcecontrollerk8v3GetControllerJobsResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetControllerJobsResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_controller_jobs_response_dict = resourcecontrollerk8v3_get_controller_jobs_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetControllerJobsResponse from a dict
resourcecontrollerk8v3_get_controller_jobs_response_from_dict = Resourcecontrollerk8v3GetControllerJobsResponse.from_dict(resourcecontrollerk8v3_get_controller_jobs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


