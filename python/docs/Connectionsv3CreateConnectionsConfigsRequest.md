# Connectionsv3CreateConnectionsConfigsRequest

Request parameters for create connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_id** | **str** | Optional: connection id. | [optional] 
**stream_connection** | [**Connectionsv3StreamConnection**](Connectionsv3StreamConnection.md) |  | [optional] 
**type** | [**Connectionsv3ConnectorType**](Connectionsv3ConnectorType.md) |  | [optional] 
**uc_connection** | [**Connectionsv3UCConnectionSummary**](Connectionsv3UCConnectionSummary.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_create_connections_configs_request import Connectionsv3CreateConnectionsConfigsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3CreateConnectionsConfigsRequest from a JSON string
connectionsv3_create_connections_configs_request_instance = Connectionsv3CreateConnectionsConfigsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3CreateConnectionsConfigsRequest.to_json())

# convert the object into a dict
connectionsv3_create_connections_configs_request_dict = connectionsv3_create_connections_configs_request_instance.to_dict()
# create an instance of Connectionsv3CreateConnectionsConfigsRequest from a dict
connectionsv3_create_connections_configs_request_from_dict = Connectionsv3CreateConnectionsConfigsRequest.from_dict(connectionsv3_create_connections_configs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


