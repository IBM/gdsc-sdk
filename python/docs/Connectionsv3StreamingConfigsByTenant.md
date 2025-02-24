# Connectionsv3StreamingConfigsByTenant

List of streaming configs by tenant id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mini_snif_endpoint** | **str** | Mini snif endpoint from config . | [optional] 
**streaming_configs** | [**Connectionsv3StreamingConfigs**](Connectionsv3StreamingConfigs.md) |  | [optional] 
**tenant_id** | **str** | Tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_streaming_configs_by_tenant import Connectionsv3StreamingConfigsByTenant

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StreamingConfigsByTenant from a JSON string
connectionsv3_streaming_configs_by_tenant_instance = Connectionsv3StreamingConfigsByTenant.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StreamingConfigsByTenant.to_json())

# convert the object into a dict
connectionsv3_streaming_configs_by_tenant_dict = connectionsv3_streaming_configs_by_tenant_instance.to_dict()
# create an instance of Connectionsv3StreamingConfigsByTenant from a dict
connectionsv3_streaming_configs_by_tenant_from_dict = Connectionsv3StreamingConfigsByTenant.from_dict(connectionsv3_streaming_configs_by_tenant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


