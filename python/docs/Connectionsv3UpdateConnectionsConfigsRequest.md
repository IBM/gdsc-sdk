# Connectionsv3UpdateConnectionsConfigsRequest

Request parameters for update connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stream_connection_configs** | [**List[Connectionsv3StreamConnectionConfig]**](Connectionsv3StreamConnectionConfig.md) | Optional: list of streaming connections. | [optional] 
**type** | [**Connectionsv3ConnectorType**](Connectionsv3ConnectorType.md) |  | [optional] 
**uc_connection_configs** | [**List[Connectionsv3UCConnectionConfig]**](Connectionsv3UCConnectionConfig.md) | Optional: list of UC connections. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_update_connections_configs_request import Connectionsv3UpdateConnectionsConfigsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateConnectionsConfigsRequest from a JSON string
connectionsv3_update_connections_configs_request_instance = Connectionsv3UpdateConnectionsConfigsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateConnectionsConfigsRequest.to_json())

# convert the object into a dict
connectionsv3_update_connections_configs_request_dict = connectionsv3_update_connections_configs_request_instance.to_dict()
# create an instance of Connectionsv3UpdateConnectionsConfigsRequest from a dict
connectionsv3_update_connections_configs_request_from_dict = Connectionsv3UpdateConnectionsConfigsRequest.from_dict(connectionsv3_update_connections_configs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


