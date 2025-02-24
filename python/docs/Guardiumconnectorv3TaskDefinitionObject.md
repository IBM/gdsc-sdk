# Guardiumconnectorv3TaskDefinitionObject

Object hold task definition info.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**execution_trigger** | **int** | Tells GDP when to send data. | [optional] 
**interval** | **str** | Task interval. | [optional] 
**is_blocker_task** | **int** | Is the task a blocker task. | [optional] 
**task_type** | **str** | Task type. | [optional] 
**version** | **str** | Task version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_definition_object import Guardiumconnectorv3TaskDefinitionObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskDefinitionObject from a JSON string
guardiumconnectorv3_task_definition_object_instance = Guardiumconnectorv3TaskDefinitionObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskDefinitionObject.to_json())

# convert the object into a dict
guardiumconnectorv3_task_definition_object_dict = guardiumconnectorv3_task_definition_object_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskDefinitionObject from a dict
guardiumconnectorv3_task_definition_object_from_dict = Guardiumconnectorv3TaskDefinitionObject.from_dict(guardiumconnectorv3_task_definition_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


