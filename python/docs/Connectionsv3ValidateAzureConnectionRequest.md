# Connectionsv3ValidateAzureConnectionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_hub_name** | **str** |  | [optional] 
**storage_connection_string** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_validate_azure_connection_request import Connectionsv3ValidateAzureConnectionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3ValidateAzureConnectionRequest from a JSON string
connectionsv3_validate_azure_connection_request_instance = Connectionsv3ValidateAzureConnectionRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3ValidateAzureConnectionRequest.to_json())

# convert the object into a dict
connectionsv3_validate_azure_connection_request_dict = connectionsv3_validate_azure_connection_request_instance.to_dict()
# create an instance of Connectionsv3ValidateAzureConnectionRequest from a dict
connectionsv3_validate_azure_connection_request_from_dict = Connectionsv3ValidateAzureConnectionRequest.from_dict(connectionsv3_validate_azure_connection_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


