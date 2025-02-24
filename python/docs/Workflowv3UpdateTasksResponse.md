# Workflowv3UpdateTasksResponse

Returns the ids of the tasks updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 
**updated** | **str** | Number of tasks that were updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_update_tasks_response import Workflowv3UpdateTasksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3UpdateTasksResponse from a JSON string
workflowv3_update_tasks_response_instance = Workflowv3UpdateTasksResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3UpdateTasksResponse.to_json())

# convert the object into a dict
workflowv3_update_tasks_response_dict = workflowv3_update_tasks_response_instance.to_dict()
# create an instance of Workflowv3UpdateTasksResponse from a dict
workflowv3_update_tasks_response_from_dict = Workflowv3UpdateTasksResponse.from_dict(workflowv3_update_tasks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


