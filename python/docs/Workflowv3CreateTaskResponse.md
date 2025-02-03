# Workflowv3CreateTaskResponse

Returns the ids of the tasks created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **str** | task_id that was created. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_create_task_response import Workflowv3CreateTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CreateTaskResponse from a JSON string
workflowv3_create_task_response_instance = Workflowv3CreateTaskResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CreateTaskResponse.to_json())

# convert the object into a dict
workflowv3_create_task_response_dict = workflowv3_create_task_response_instance.to_dict()
# create an instance of Workflowv3CreateTaskResponse from a dict
workflowv3_create_task_response_from_dict = Workflowv3CreateTaskResponse.from_dict(workflowv3_create_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


