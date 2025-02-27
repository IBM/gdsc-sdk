# Guardiumconnectorv3AddTaskRequest

Adds specified task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**interval** | **str** | Optional, overrides task default interval. | [optional] 
**key_object** | **str** | Key object. | [optional] 
**params** | [**List[Guardiumconnectorv3TaskParamsObject]**](Guardiumconnectorv3TaskParamsObject.md) | Json array. | [optional] 
**task_type** | **str** | Type of task being added. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_task_request import Guardiumconnectorv3AddTaskRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddTaskRequest from a JSON string
guardiumconnectorv3_add_task_request_instance = Guardiumconnectorv3AddTaskRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddTaskRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_add_task_request_dict = guardiumconnectorv3_add_task_request_instance.to_dict()
# create an instance of Guardiumconnectorv3AddTaskRequest from a dict
guardiumconnectorv3_add_task_request_from_dict = Guardiumconnectorv3AddTaskRequest.from_dict(guardiumconnectorv3_add_task_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


