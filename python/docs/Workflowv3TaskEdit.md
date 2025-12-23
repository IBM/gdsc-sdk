# Workflowv3TaskEdit

Editable fields of a task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignments** | [**List[Workflowv3Entity]**](Workflowv3Entity.md) | Optional: Entities that the task is assigned to. | [optional] 
**comment** | **str** | Optional: Comment - this text will be added to the comments history. | [optional] 
**date_due** | **datetime** | Optional: Date due. | [optional] 
**depends_on** | **List[str]** | Optional: Task ID dependencies if sequential processing is needed. | [optional] 
**description** | **str** | Optional: Multiline description of the task. | [optional] 
**investigation_links** | [**List[Schedulerv3ConfigurationItem]**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**justification** | **str** | Optional: Justification - this text will be added to the respond justification. | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] [default to Workflowv3Priority.UNDEFINED_PRIORITY]
**response_template** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**review_action** | **str** | Optional: review action - this text will be added to the respond action. | [optional] 
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] [default to Workflowv3Status.UNDEFINED_STATUS]
**tags** | **List[str]** |  | [optional] 
**task_id** | **str** |  | [optional] 
**title** | **str** | Optional: Task title (subject). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_task_edit import Workflowv3TaskEdit

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3TaskEdit from a JSON string
workflowv3_task_edit_instance = Workflowv3TaskEdit.from_json(json)
# print the JSON string representation of the object
print(Workflowv3TaskEdit.to_json())

# convert the object into a dict
workflowv3_task_edit_dict = workflowv3_task_edit_instance.to_dict()
# create an instance of Workflowv3TaskEdit from a dict
workflowv3_task_edit_from_dict = Workflowv3TaskEdit.from_dict(workflowv3_task_edit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


