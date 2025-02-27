# Guardiumconnectorv3GetTaskTypesResponse

GetTaskTypes response message and returned list of task types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 
**task_types** | [**List[Guardiumconnectorv3TaskType]**](Guardiumconnectorv3TaskType.md) | List of supported task types. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_task_types_response import Guardiumconnectorv3GetTaskTypesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetTaskTypesResponse from a JSON string
guardiumconnectorv3_get_task_types_response_instance = Guardiumconnectorv3GetTaskTypesResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetTaskTypesResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_task_types_response_dict = guardiumconnectorv3_get_task_types_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetTaskTypesResponse from a dict
guardiumconnectorv3_get_task_types_response_from_dict = Guardiumconnectorv3GetTaskTypesResponse.from_dict(guardiumconnectorv3_get_task_types_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


