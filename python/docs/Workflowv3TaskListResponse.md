# Workflowv3TaskListResponse

Returns just tasks, not cases.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 
**tasks** | [**List[Workflowv3Task]**](Workflowv3Task.md) | All tasks or just the ones requested. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_task_list_response import Workflowv3TaskListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3TaskListResponse from a JSON string
workflowv3_task_list_response_instance = Workflowv3TaskListResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3TaskListResponse.to_json())

# convert the object into a dict
workflowv3_task_list_response_dict = workflowv3_task_list_response_instance.to_dict()
# create an instance of Workflowv3TaskListResponse from a dict
workflowv3_task_list_response_from_dict = Workflowv3TaskListResponse.from_dict(workflowv3_task_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


