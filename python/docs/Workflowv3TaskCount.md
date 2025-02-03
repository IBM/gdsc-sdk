# Workflowv3TaskCount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counts** | [**List[Workflowv3StatusCount]**](Workflowv3StatusCount.md) |  | [optional] 
**scheduled_task_id** | **str** | The task within the ScheduledJob. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_task_count import Workflowv3TaskCount

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3TaskCount from a JSON string
workflowv3_task_count_instance = Workflowv3TaskCount.from_json(json)
# print the JSON string representation of the object
print(Workflowv3TaskCount.to_json())

# convert the object into a dict
workflowv3_task_count_dict = workflowv3_task_count_instance.to_dict()
# create an instance of Workflowv3TaskCount from a dict
workflowv3_task_count_from_dict = Workflowv3TaskCount.from_dict(workflowv3_task_count_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


