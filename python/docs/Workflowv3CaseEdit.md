# Workflowv3CaseEdit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifacts** | **List[str]** | Optional: Array of artifact URLs, i.e. a URL to a report result. | [optional] 
**assignments** | [**List[Workflowv3Entity]**](Workflowv3Entity.md) | Optional: Entities that the case is assigned to. | [optional] 
**case_id** | **str** | Unique ID - needed to update the case (read-only). | [optional] 
**comment** | **str** | Optional: Comment - this text will be added to the comments history. | [optional] 
**date_due** | **datetime** | Optional: Date due. | [optional] 
**description** | **str** | Optional: Multiline description of the case. | [optional] 
**priority** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] [default to Workflowv3Priority.UNDEFINED_PRIORITY]
**status** | [**Workflowv3Status**](Workflowv3Status.md) |  | [optional] [default to Workflowv3Status.UNDEFINED_STATUS]
**title** | **str** | Optional: Case title (subject). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_case_edit import Workflowv3CaseEdit

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CaseEdit from a JSON string
workflowv3_case_edit_instance = Workflowv3CaseEdit.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CaseEdit.to_json())

# convert the object into a dict
workflowv3_case_edit_dict = workflowv3_case_edit_instance.to_dict()
# create an instance of Workflowv3CaseEdit from a dict
workflowv3_case_edit_from_dict = Workflowv3CaseEdit.from_dict(workflowv3_case_edit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


