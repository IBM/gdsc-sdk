# Workflowv3TaskCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_id** | **str** |  | [optional] 
**assignments** | [**List[Workflowv3Entity]**](Workflowv3Entity.md) | Optional: Entities that the task is assigned to. | [optional] 
**comment** | **str** | Optional: Comment - this text will be added to the comments history. | [optional] 
**date_due** | **datetime** | Optional: Date due. | [optional] 
**depends_on** | **List[str]** | Optional: Task ID dependencies if sequential processing is needed. | [optional] 
**description** | **str** | Optional: Multiline description of the task. | [optional] 
**investigation_links** | [**List[Schedulerv3ConfigurationItem]**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**origin** | [**Workflowv3Origin**](Workflowv3Origin.md) |  | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] 
**report_result** | [**Workflowv3ReportResult**](Workflowv3ReportResult.md) |  | [optional] 
**response_template** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**title** | **str** | Task title (subject). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_task_create import Workflowv3TaskCreate

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3TaskCreate from a JSON string
workflowv3_task_create_instance = Workflowv3TaskCreate.from_json(json)
# print the JSON string representation of the object
print(Workflowv3TaskCreate.to_json())

# convert the object into a dict
workflowv3_task_create_dict = workflowv3_task_create_instance.to_dict()
# create an instance of Workflowv3TaskCreate from a dict
workflowv3_task_create_from_dict = Workflowv3TaskCreate.from_dict(workflowv3_task_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


