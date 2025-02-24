# Schedulerv3ScheduledTask

Scheduled Task for Post v3/schedules api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audit_type** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] 
**delivery_method** | [**Schedulerv3DeliveryMethod**](Schedulerv3DeliveryMethod.md) |  | [optional] 
**distribution_rule_ids** | **List[str]** | Optional: Distribution rule IDs for a task. Will be populated by recipients on save. | [optional] 
**email_subject** | **str** | Optional: Email subject with replaceable variables. | [optional] 
**instructions** | **str** | Optional: Instructions for the task owner. | [optional] 
**name** | **str** | Task name (usually the same as the report name). | [optional] 
**parameter** | [**Schedulerv3TaskParameter**](Schedulerv3TaskParameter.md) |  | [optional] 
**recipients** | [**List[Schedulerv3Recipient]**](Schedulerv3Recipient.md) | Optional: Report result recipients. | [optional] 
**report_filters** | [**Reportsv3ReportFilterBrackets**](Reportsv3ReportFilterBrackets.md) |  | [optional] 
**scheduled_task_id** | **str** | Optional: Id for the task. | [optional] 
**type** | [**Schedulerv3TaskType**](Schedulerv3TaskType.md) |  | [optional] 
**workflow_investigation_links** | [**List[Schedulerv3ConfigurationItem]**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**workflow_response_template** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**workflow_type** | [**Schedulerv3WorkflowType**](Schedulerv3WorkflowType.md) |  | [optional] 
**workflow_unique_fields** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_task import Schedulerv3ScheduledTask

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3ScheduledTask from a JSON string
schedulerv3_scheduled_task_instance = Schedulerv3ScheduledTask.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3ScheduledTask.to_json())

# convert the object into a dict
schedulerv3_scheduled_task_dict = schedulerv3_scheduled_task_instance.to_dict()
# create an instance of Schedulerv3ScheduledTask from a dict
schedulerv3_scheduled_task_from_dict = Schedulerv3ScheduledTask.from_dict(schedulerv3_scheduled_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


