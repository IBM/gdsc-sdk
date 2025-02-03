# Workflowv3SearchTasksRequest

Request cases by filtering on specific values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** |  | [optional] 
**filter** | [**Workflowv3Filter**](Workflowv3Filter.md) |  | [optional] 
**limit** | **int** | Optional: The max amount of cases to return for pagination. | [optional] 
**offset** | **int** | Optional: The amount to offset the cases for pagination. | [optional] 
**sort_field** | **str** |  | [optional] 
**sort_order** | [**Reportsv3OrderBy**](Reportsv3OrderBy.md) |  | [optional] 
**task_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_search_tasks_request import Workflowv3SearchTasksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3SearchTasksRequest from a JSON string
workflowv3_search_tasks_request_instance = Workflowv3SearchTasksRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3SearchTasksRequest.to_json())

# convert the object into a dict
workflowv3_search_tasks_request_dict = workflowv3_search_tasks_request_instance.to_dict()
# create an instance of Workflowv3SearchTasksRequest from a dict
workflowv3_search_tasks_request_from_dict = Workflowv3SearchTasksRequest.from_dict(workflowv3_search_tasks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


