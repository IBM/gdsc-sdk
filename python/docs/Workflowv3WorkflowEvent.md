# Workflowv3WorkflowEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **Dict[str, str]** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**href** | **str** |  | [optional] 
**severity** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] 
**tenant_id** | **str** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_workflow_event import Workflowv3WorkflowEvent

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3WorkflowEvent from a JSON string
workflowv3_workflow_event_instance = Workflowv3WorkflowEvent.from_json(json)
# print the JSON string representation of the object
print(Workflowv3WorkflowEvent.to_json())

# convert the object into a dict
workflowv3_workflow_event_dict = workflowv3_workflow_event_instance.to_dict()
# create an instance of Workflowv3WorkflowEvent from a dict
workflowv3_workflow_event_from_dict = Workflowv3WorkflowEvent.from_dict(workflowv3_workflow_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


