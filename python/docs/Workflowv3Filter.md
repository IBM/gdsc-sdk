# Workflowv3Filter

Filter - to find specific Cases.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assigned_to_me** | **bool** | Optional: Cases and tasks that are assigned to Me. | [optional] 
**assigned_to_my_roles** | **bool** | Optional: Cases and tasks that are assigned to My Roles. | [optional] 
**date_created** | **datetime** | Optional: where Date Created meets criteria. | [optional] 
**date_created_operator** | [**Workflowv3FilterOperator**](Workflowv3FilterOperator.md) |  | [optional] 
**date_due** | **datetime** | Optional: where Date Due meets criteria. | [optional] 
**date_due_operator** | [**Workflowv3FilterOperator**](Workflowv3FilterOperator.md) |  | [optional] 
**filter_columns** | [**List[Workflowv3FilterColumn]**](Workflowv3FilterColumn.md) |  | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] 
**priority_operator** | [**Workflowv3FilterOperator**](Workflowv3FilterOperator.md) |  | [optional] 
**report_id** | **str** |  | [optional] 
**scheduled_job_id** | **List[str]** |  | [optional] 
**scheduled_task_id** | **List[str]** |  | [optional] 
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] 
**status_operator** | [**Workflowv3FilterOperator**](Workflowv3FilterOperator.md) |  | [optional] 
**tags** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_filter import Workflowv3Filter

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Filter from a JSON string
workflowv3_filter_instance = Workflowv3Filter.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Filter.to_json())

# convert the object into a dict
workflowv3_filter_dict = workflowv3_filter_instance.to_dict()
# create an instance of Workflowv3Filter from a dict
workflowv3_filter_from_dict = Workflowv3Filter.from_dict(workflowv3_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


