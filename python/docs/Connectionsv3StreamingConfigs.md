# Connectionsv3StreamingConfigs

List of account configs and streaming connection configs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_configs** | [**List[Connectionsv3AccountConfig]**](Connectionsv3AccountConfig.md) | Accounts infomation. | [optional] 
**instance_configs** | [**List[Connectionsv3StreamConnectionConfig]**](Connectionsv3StreamConnectionConfig.md) | Streaming connections information. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_streaming_configs import Connectionsv3StreamingConfigs

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StreamingConfigs from a JSON string
connectionsv3_streaming_configs_instance = Connectionsv3StreamingConfigs.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StreamingConfigs.to_json())

# convert the object into a dict
connectionsv3_streaming_configs_dict = connectionsv3_streaming_configs_instance.to_dict()
# create an instance of Connectionsv3StreamingConfigs from a dict
connectionsv3_streaming_configs_from_dict = Connectionsv3StreamingConfigs.from_dict(connectionsv3_streaming_configs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


