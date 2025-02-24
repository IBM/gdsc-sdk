# Connectionsv3GetConnectionsConfigsResponse

Response parameters for get connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stream_connection_configs** | [**List[Connectionsv3StreamConnectionConfig]**](Connectionsv3StreamConnectionConfig.md) | List of streaming connections. | [optional] 
**uc_connection_configs** | [**List[Connectionsv3UCConnectionConfig]**](Connectionsv3UCConnectionConfig.md) | List of UC connections. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_get_connections_configs_response import Connectionsv3GetConnectionsConfigsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetConnectionsConfigsResponse from a JSON string
connectionsv3_get_connections_configs_response_instance = Connectionsv3GetConnectionsConfigsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetConnectionsConfigsResponse.to_json())

# convert the object into a dict
connectionsv3_get_connections_configs_response_dict = connectionsv3_get_connections_configs_response_instance.to_dict()
# create an instance of Connectionsv3GetConnectionsConfigsResponse from a dict
connectionsv3_get_connections_configs_response_from_dict = Connectionsv3GetConnectionsConfigsResponse.from_dict(connectionsv3_get_connections_configs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


