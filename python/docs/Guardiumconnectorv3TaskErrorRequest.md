# Guardiumconnectorv3TaskErrorRequest

Request to log task error execution from GDP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**error_code** | **str** | Translatable error code. | [optional] 
**error_description** | **str** | Error details. | [optional] 
**task** | [**Guardiumconnectorv3TaskDefinition**](Guardiumconnectorv3TaskDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_task_error_request import Guardiumconnectorv3TaskErrorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3TaskErrorRequest from a JSON string
guardiumconnectorv3_task_error_request_instance = Guardiumconnectorv3TaskErrorRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3TaskErrorRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_task_error_request_dict = guardiumconnectorv3_task_error_request_instance.to_dict()
# create an instance of Guardiumconnectorv3TaskErrorRequest from a dict
guardiumconnectorv3_task_error_request_from_dict = Guardiumconnectorv3TaskErrorRequest.from_dict(guardiumconnectorv3_task_error_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


