# Workflowv3UpdateTasksRequest

Update existing tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** | Update tasks belonging to common parent. | [optional] 
**tasks** | [**List[Workflowv3TaskEdit]**](Workflowv3TaskEdit.md) | Update multiple tasks in one request. | [optional] 
**update_fields** | **List[str]** | Only update these fields in the backend records. | [optional] 
**workflow_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_update_tasks_request import Workflowv3UpdateTasksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3UpdateTasksRequest from a JSON string
workflowv3_update_tasks_request_instance = Workflowv3UpdateTasksRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3UpdateTasksRequest.to_json())

# convert the object into a dict
workflowv3_update_tasks_request_dict = workflowv3_update_tasks_request_instance.to_dict()
# create an instance of Workflowv3UpdateTasksRequest from a dict
workflowv3_update_tasks_request_from_dict = Workflowv3UpdateTasksRequest.from_dict(workflowv3_update_tasks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


