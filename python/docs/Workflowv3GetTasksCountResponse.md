# Workflowv3GetTasksCountResponse

Returns task count.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counts** | [**List[Workflowv3TaskCount]**](Workflowv3TaskCount.md) | Total Rows Count. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_get_tasks_count_response import Workflowv3GetTasksCountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetTasksCountResponse from a JSON string
workflowv3_get_tasks_count_response_instance = Workflowv3GetTasksCountResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetTasksCountResponse.to_json())

# convert the object into a dict
workflowv3_get_tasks_count_response_dict = workflowv3_get_tasks_count_response_instance.to_dict()
# create an instance of Workflowv3GetTasksCountResponse from a dict
workflowv3_get_tasks_count_response_from_dict = Workflowv3GetTasksCountResponse.from_dict(workflowv3_get_tasks_count_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


