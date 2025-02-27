# Workflowv3CreateTaskRequest

Create new tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** | Create tasks with common parent. | [optional] 
**task** | [**Workflowv3TaskCreate**](Workflowv3TaskCreate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_create_task_request import Workflowv3CreateTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CreateTaskRequest from a JSON string
workflowv3_create_task_request_instance = Workflowv3CreateTaskRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CreateTaskRequest.to_json())

# convert the object into a dict
workflowv3_create_task_request_dict = workflowv3_create_task_request_instance.to_dict()
# create an instance of Workflowv3CreateTaskRequest from a dict
workflowv3_create_task_request_from_dict = Workflowv3CreateTaskRequest.from_dict(workflowv3_create_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


