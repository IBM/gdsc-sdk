# Schedulerv3ScheduledTaskSummary

ScheduledTaskSummary returns enough details for list view.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audit_type** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] 
**name** | **str** | Task name (usually the same as the report name). | [optional] 
**report_id** | **str** |  | [optional] 
**report_name** | **str** |  | [optional] 
**scheduled_task_id** | **str** | Id for the task. | [optional] 
**type** | [**Schedulerv3TaskType**](Schedulerv3TaskType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_task_summary import Schedulerv3ScheduledTaskSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledTaskSummary from a JSON string
schedulerv3_scheduled_task_summary_instance = Schedulerv3ScheduledTaskSummary.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledTaskSummary.to_json())

# convert the object into a dict
schedulerv3_scheduled_task_summary_dict = schedulerv3_scheduled_task_summary_instance.to_dict()
# create an instance of Schedulerv3ScheduledTaskSummary from a dict
schedulerv3_scheduled_task_summary_from_dict = Schedulerv3ScheduledTaskSummary.from_dict(schedulerv3_scheduled_task_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


