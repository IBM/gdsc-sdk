# Guardiumconnectorv3AddTaskResponse

AddTask response message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_task_response import Guardiumconnectorv3AddTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddTaskResponse from a JSON string
guardiumconnectorv3_add_task_response_instance = Guardiumconnectorv3AddTaskResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddTaskResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_add_task_response_dict = guardiumconnectorv3_add_task_response_instance.to_dict()
# create an instance of Guardiumconnectorv3AddTaskResponse from a dict
guardiumconnectorv3_add_task_response_from_dict = Guardiumconnectorv3AddTaskResponse.from_dict(guardiumconnectorv3_add_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


