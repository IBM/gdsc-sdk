# Connectionsv3StreamConnectionConfig

Stream connection config with connecion id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_id** | **str** | Connection id. | [optional] 
**stream_connection** | [**Connectionsv3StreamConnection**](Connectionsv3StreamConnection.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_stream_connection_config import Connectionsv3StreamConnectionConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StreamConnectionConfig from a JSON string
connectionsv3_stream_connection_config_instance = Connectionsv3StreamConnectionConfig.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StreamConnectionConfig.to_json())

# convert the object into a dict
connectionsv3_stream_connection_config_dict = connectionsv3_stream_connection_config_instance.to_dict()
# create an instance of Connectionsv3StreamConnectionConfig from a dict
connectionsv3_stream_connection_config_from_dict = Connectionsv3StreamConnectionConfig.from_dict(connectionsv3_stream_connection_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


