# Connectionsv3ValidateConnectionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_connection_response import Connectionsv3ValidateConnectionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ValidateConnectionResponse from a JSON string
connectionsv3_validate_connection_response_instance = Connectionsv3ValidateConnectionResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ValidateConnectionResponse.to_json())

# convert the object into a dict
connectionsv3_validate_connection_response_dict = connectionsv3_validate_connection_response_instance.to_dict()
# create an instance of Connectionsv3ValidateConnectionResponse from a dict
connectionsv3_validate_connection_response_from_dict = Connectionsv3ValidateConnectionResponse.from_dict(connectionsv3_validate_connection_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


