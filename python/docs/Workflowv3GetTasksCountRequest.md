# Workflowv3GetTasksCountRequest

Requests task count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** |  | [optional] 
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_get_tasks_count_request import Workflowv3GetTasksCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetTasksCountRequest from a JSON string
workflowv3_get_tasks_count_request_instance = Workflowv3GetTasksCountRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetTasksCountRequest.to_json())

# convert the object into a dict
workflowv3_get_tasks_count_request_dict = workflowv3_get_tasks_count_request_instance.to_dict()
# create an instance of Workflowv3GetTasksCountRequest from a dict
workflowv3_get_tasks_count_request_from_dict = Workflowv3GetTasksCountRequest.from_dict(workflowv3_get_tasks_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


