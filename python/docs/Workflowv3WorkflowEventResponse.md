# Workflowv3WorkflowEventResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**case_id** | **str** |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 
**task_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_workflow_event_response import Workflowv3WorkflowEventResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3WorkflowEventResponse from a JSON string
workflowv3_workflow_event_response_instance = Workflowv3WorkflowEventResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3WorkflowEventResponse.to_json())

# convert the object into a dict
workflowv3_workflow_event_response_dict = workflowv3_workflow_event_response_instance.to_dict()
# create an instance of Workflowv3WorkflowEventResponse from a dict
workflowv3_workflow_event_response_from_dict = Workflowv3WorkflowEventResponse.from_dict(workflowv3_workflow_event_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


