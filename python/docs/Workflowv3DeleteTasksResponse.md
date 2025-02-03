# Workflowv3DeleteTasksResponse

Returns the number of tasks deleted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted** | **str** | Number of tasks that were deleted. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_delete_tasks_response import Workflowv3DeleteTasksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3DeleteTasksResponse from a JSON string
workflowv3_delete_tasks_response_instance = Workflowv3DeleteTasksResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3DeleteTasksResponse.to_json())

# convert the object into a dict
workflowv3_delete_tasks_response_dict = workflowv3_delete_tasks_response_instance.to_dict()
# create an instance of Workflowv3DeleteTasksResponse from a dict
workflowv3_delete_tasks_response_from_dict = Workflowv3DeleteTasksResponse.from_dict(workflowv3_delete_tasks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


