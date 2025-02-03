# Guardiumconnectorv3UpdateTaskResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_task_response import Guardiumconnectorv3UpdateTaskResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UpdateTaskResponse from a JSON string
guardiumconnectorv3_update_task_response_instance = Guardiumconnectorv3UpdateTaskResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UpdateTaskResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_update_task_response_dict = guardiumconnectorv3_update_task_response_instance.to_dict()
# create an instance of Guardiumconnectorv3UpdateTaskResponse from a dict
guardiumconnectorv3_update_task_response_from_dict = Guardiumconnectorv3UpdateTaskResponse.from_dict(guardiumconnectorv3_update_task_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


