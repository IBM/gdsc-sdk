# Connectionsv3InternalGetStreamingConnectionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**streaming_configs_by_tenants** | [**List[Connectionsv3StreamingConfigsByTenant]**](Connectionsv3StreamingConfigsByTenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_internal_get_streaming_connections_response import Connectionsv3InternalGetStreamingConnectionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3InternalGetStreamingConnectionsResponse from a JSON string
connectionsv3_internal_get_streaming_connections_response_instance = Connectionsv3InternalGetStreamingConnectionsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3InternalGetStreamingConnectionsResponse.to_json())

# convert the object into a dict
connectionsv3_internal_get_streaming_connections_response_dict = connectionsv3_internal_get_streaming_connections_response_instance.to_dict()
# create an instance of Connectionsv3InternalGetStreamingConnectionsResponse from a dict
connectionsv3_internal_get_streaming_connections_response_from_dict = Connectionsv3InternalGetStreamingConnectionsResponse.from_dict(connectionsv3_internal_get_streaming_connections_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


