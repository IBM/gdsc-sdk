# Connectionsv3DeleteConnectionsConfigsResponse

Response parameters for delete connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_delete_connections_configs_response import Connectionsv3DeleteConnectionsConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3DeleteConnectionsConfigsResponse from a JSON string
connectionsv3_delete_connections_configs_response_instance = Connectionsv3DeleteConnectionsConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3DeleteConnectionsConfigsResponse.to_json())

# convert the object into a dict
connectionsv3_delete_connections_configs_response_dict = connectionsv3_delete_connections_configs_response_instance.to_dict()
# create an instance of Connectionsv3DeleteConnectionsConfigsResponse from a dict
connectionsv3_delete_connections_configs_response_from_dict = Connectionsv3DeleteConnectionsConfigsResponse.from_dict(connectionsv3_delete_connections_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


