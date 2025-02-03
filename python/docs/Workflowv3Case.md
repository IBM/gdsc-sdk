# Workflowv3Case

Top-level task (case).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_id** | **str** | Alternate Unique ID. | [optional] 
**artifacts** | **List[str]** | Array of artifact URLs, i.e. a URL to a report result. | [optional] 
**assignments** | [**List[Workflowv3Entity]**](Workflowv3Entity.md) | Entities that the case is assigned to. | [optional] 
**case_id** | **str** | Unique ID. | [optional] 
**comments** | [**List[Workflowv3Comment]**](Workflowv3Comment.md) | Comments - who, when, what. | [optional] 
**date_created** | **datetime** | Date created (Scheduled job queue time). | [optional] 
**date_due** | **datetime** | Date due (Scheduled job next run). | [optional] 
**date_modified** | **datetime** | Date of last update. | [optional] 
**description** | **str** | Multiline description of the case. | [optional] 
**full_access** | **bool** | Access level. | [optional] 
**origin** | [**Workflowv3Origin**](Workflowv3Origin.md) |  | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] 
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] 
**tasks** | [**List[Workflowv3Task]**](Workflowv3Task.md) | Sub-tasks that the current user has access to. | [optional] 
**title** | **str** | Case title (subject). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_case import Workflowv3Case

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Case from a JSON string
workflowv3_case_instance = Workflowv3Case.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Case.to_json())

# convert the object into a dict
workflowv3_case_dict = workflowv3_case_instance.to_dict()
# create an instance of Workflowv3Case from a dict
workflowv3_case_from_dict = Workflowv3Case.from_dict(workflowv3_case_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


