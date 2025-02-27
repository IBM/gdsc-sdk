# Connectionsv3GetGuardRecordFieldsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List[Connectionsv3GuardRecordField]**](Connectionsv3GuardRecordField.md) |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_guard_record_fields_response import Connectionsv3GetGuardRecordFieldsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetGuardRecordFieldsResponse from a JSON string
connectionsv3_get_guard_record_fields_response_instance = Connectionsv3GetGuardRecordFieldsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetGuardRecordFieldsResponse.to_json())

# convert the object into a dict
connectionsv3_get_guard_record_fields_response_dict = connectionsv3_get_guard_record_fields_response_instance.to_dict()
# create an instance of Connectionsv3GetGuardRecordFieldsResponse from a dict
connectionsv3_get_guard_record_fields_response_from_dict = Connectionsv3GetGuardRecordFieldsResponse.from_dict(connectionsv3_get_guard_record_fields_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


