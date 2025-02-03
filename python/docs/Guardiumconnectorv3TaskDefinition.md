# Guardiumconnectorv3TaskDefinition

Task defifnition executed by GDP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**task_id** | **str** | Task id. | [optional] 
**task_params** | [**List[Guardiumconnectorv3TaskParamsObject]**](Guardiumconnectorv3TaskParamsObject.md) | Parameters passed top the task. | [optional] 
**task_type** | **str** | Task type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_definition import Guardiumconnectorv3TaskDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskDefinition from a JSON string
guardiumconnectorv3_task_definition_instance = Guardiumconnectorv3TaskDefinition.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskDefinition.to_json())

# convert the object into a dict
guardiumconnectorv3_task_definition_dict = guardiumconnectorv3_task_definition_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskDefinition from a dict
guardiumconnectorv3_task_definition_from_dict = Guardiumconnectorv3TaskDefinition.from_dict(guardiumconnectorv3_task_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


