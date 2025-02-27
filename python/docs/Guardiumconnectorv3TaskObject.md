# Guardiumconnectorv3TaskObject

Object holding task info.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sub_tasks** | [**List[Guardiumconnectorv3SubTaskObject]**](Guardiumconnectorv3SubTaskObject.md) | Sub tasks. | [optional] 
**task_definition** | [**Guardiumconnectorv3TaskDefinitionObject**](Guardiumconnectorv3TaskDefinitionObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_object import Guardiumconnectorv3TaskObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskObject from a JSON string
guardiumconnectorv3_task_object_instance = Guardiumconnectorv3TaskObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskObject.to_json())

# convert the object into a dict
guardiumconnectorv3_task_object_dict = guardiumconnectorv3_task_object_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskObject from a dict
guardiumconnectorv3_task_object_from_dict = Guardiumconnectorv3TaskObject.from_dict(guardiumconnectorv3_task_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


