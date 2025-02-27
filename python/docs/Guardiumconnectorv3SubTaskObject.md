# Guardiumconnectorv3SubTaskObject

Object holding sub task info.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Subtask id. | [optional] 
**interval** | **str** | Subtask interval. | [optional] 
**params** | [**List[Guardiumconnectorv3TaskParamsObject]**](Guardiumconnectorv3TaskParamsObject.md) | Json array. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_sub_task_object import Guardiumconnectorv3SubTaskObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3SubTaskObject from a JSON string
guardiumconnectorv3_sub_task_object_instance = Guardiumconnectorv3SubTaskObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3SubTaskObject.to_json())

# convert the object into a dict
guardiumconnectorv3_sub_task_object_dict = guardiumconnectorv3_sub_task_object_instance.to_dict()
# create an instance of Guardiumconnectorv3SubTaskObject from a dict
guardiumconnectorv3_sub_task_object_from_dict = Guardiumconnectorv3SubTaskObject.from_dict(guardiumconnectorv3_sub_task_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


