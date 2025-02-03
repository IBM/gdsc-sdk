# Guardiumconnectorv3TaskParamsObject

Json object holding an arg value and arg name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arg_name** | **str** | Arg name. | [optional] 
**arg_value** | **str** | Arg value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_params_object import Guardiumconnectorv3TaskParamsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskParamsObject from a JSON string
guardiumconnectorv3_task_params_object_instance = Guardiumconnectorv3TaskParamsObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskParamsObject.to_json())

# convert the object into a dict
guardiumconnectorv3_task_params_object_dict = guardiumconnectorv3_task_params_object_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskParamsObject from a dict
guardiumconnectorv3_task_params_object_from_dict = Guardiumconnectorv3TaskParamsObject.from_dict(guardiumconnectorv3_task_params_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


