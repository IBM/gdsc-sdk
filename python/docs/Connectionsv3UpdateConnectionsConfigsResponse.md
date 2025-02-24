# Connectionsv3UpdateConnectionsConfigsResponse

Response parameters for update connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_update_connections_configs_response import Connectionsv3UpdateConnectionsConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateConnectionsConfigsResponse from a JSON string
connectionsv3_update_connections_configs_response_instance = Connectionsv3UpdateConnectionsConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateConnectionsConfigsResponse.to_json())

# convert the object into a dict
connectionsv3_update_connections_configs_response_dict = connectionsv3_update_connections_configs_response_instance.to_dict()
# create an instance of Connectionsv3UpdateConnectionsConfigsResponse from a dict
connectionsv3_update_connections_configs_response_from_dict = Connectionsv3UpdateConnectionsConfigsResponse.from_dict(connectionsv3_update_connections_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


