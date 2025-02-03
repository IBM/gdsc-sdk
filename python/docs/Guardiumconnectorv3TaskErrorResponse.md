# Guardiumconnectorv3TaskErrorResponse

Response to log error task execution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_task_error_response import Guardiumconnectorv3TaskErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskErrorResponse from a JSON string
guardiumconnectorv3_task_error_response_instance = Guardiumconnectorv3TaskErrorResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskErrorResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_task_error_response_dict = guardiumconnectorv3_task_error_response_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskErrorResponse from a dict
guardiumconnectorv3_task_error_response_from_dict = Guardiumconnectorv3TaskErrorResponse.from_dict(guardiumconnectorv3_task_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


