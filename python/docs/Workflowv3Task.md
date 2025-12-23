# Workflowv3Task

Task (sub-task of a case).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_id** | **str** | Alternate Unique ID. | [optional] 
**assignments** | [**List[Workflowv3Entity]**](Workflowv3Entity.md) | Entities that the task is assigned to. | [optional] 
**case_id** | **str** | Parent case. | [optional] 
**comments** | [**List[Workflowv3Comment]**](Workflowv3Comment.md) | Comments - who, when, what. | [optional] 
**date_created** | **datetime** | Date created. | [optional] 
**date_due** | **datetime** | Date due. | [optional] 
**date_modified** | **datetime** | Date of last update. | [optional] 
**depends_on** | **List[str]** | Task ID dependencies if sequential processing is needed. | [optional] 
**description** | **str** | Multiline description of the task. | [optional] 
**investigation_links** | [**List[Schedulerv3ConfigurationItem]**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**justification** | **str** |  | [optional] 
**number** | **str** |  | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] [default to Workflowv3Priority.UNDEFINED_PRIORITY]
**report_result** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  | [optional] 
**response_template** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**review_action** | **str** |  | [optional] 
**run** | [**Workflowv3ReportRun**](Workflowv3ReportRun.md) |  | [optional] 
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] [default to Workflowv3Status.UNDEFINED_STATUS]
**tags** | **List[str]** |  | [optional] 
**task_id** | **str** | Unique ID. | [optional] 
**title** | **str** | Task title (subject). | [optional] 
**workflow_type** | [**Schedulerv3WorkflowType**](Schedulerv3WorkflowType.md) |  | [optional] [default to Schedulerv3WorkflowType.REVIEW_NONE]

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_task import Workflowv3Task

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Task from a JSON string
workflowv3_task_instance = Workflowv3Task.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Task.to_json())

# convert the object into a dict
workflowv3_task_dict = workflowv3_task_instance.to_dict()
# create an instance of Workflowv3Task from a dict
workflowv3_task_from_dict = Workflowv3Task.from_dict(workflowv3_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


