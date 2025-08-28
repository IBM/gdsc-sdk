# Connectionsv3ValidateGcpConnectionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_email** | **str** |  | [optional] 
**private_key** | **str** |  | [optional] 
**project_id** | **str** |  | [optional] 
**subscription** | **str** |  | [optional] 
**topic** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_gcp_connection_request import Connectionsv3ValidateGcpConnectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ValidateGcpConnectionRequest from a JSON string
connectionsv3_validate_gcp_connection_request_instance = Connectionsv3ValidateGcpConnectionRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ValidateGcpConnectionRequest.to_json())

# convert the object into a dict
connectionsv3_validate_gcp_connection_request_dict = connectionsv3_validate_gcp_connection_request_instance.to_dict()
# create an instance of Connectionsv3ValidateGcpConnectionRequest from a dict
connectionsv3_validate_gcp_connection_request_from_dict = Connectionsv3ValidateGcpConnectionRequest.from_dict(connectionsv3_validate_gcp_connection_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


