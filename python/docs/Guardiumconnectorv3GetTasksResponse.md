# Guardiumconnectorv3GetTasksResponse

GetTasks response message and returned list of tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 
**tasks** | [**List[Guardiumconnectorv3TaskObject]**](Guardiumconnectorv3TaskObject.md) | List of task(s). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_tasks_response import Guardiumconnectorv3GetTasksResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetTasksResponse from a JSON string
guardiumconnectorv3_get_tasks_response_instance = Guardiumconnectorv3GetTasksResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetTasksResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_tasks_response_dict = guardiumconnectorv3_get_tasks_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetTasksResponse from a dict
guardiumconnectorv3_get_tasks_response_from_dict = Guardiumconnectorv3GetTasksResponse.from_dict(guardiumconnectorv3_get_tasks_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


