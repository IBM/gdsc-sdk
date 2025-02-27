# Guardiumconnectorv3UpdateTaskRequest

Updates specified task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**interval** | **str** | Updates task interval. | [optional] 
**task_id** | **str** | ID of task being updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_update_task_request import Guardiumconnectorv3UpdateTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UpdateTaskRequest from a JSON string
guardiumconnectorv3_update_task_request_instance = Guardiumconnectorv3UpdateTaskRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UpdateTaskRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_update_task_request_dict = guardiumconnectorv3_update_task_request_instance.to_dict()
# create an instance of Guardiumconnectorv3UpdateTaskRequest from a dict
guardiumconnectorv3_update_task_request_from_dict = Guardiumconnectorv3UpdateTaskRequest.from_dict(guardiumconnectorv3_update_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


