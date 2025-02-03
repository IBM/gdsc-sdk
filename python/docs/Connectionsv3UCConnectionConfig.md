# Connectionsv3UCConnectionConfig

UC connection config with connecion id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_id** | **str** | Connection id. | [optional] 
**uc_connection_summary** | [**Connectionsv3UCConnectionSummary**](Connectionsv3UCConnectionSummary.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_uc_connection_config import Connectionsv3UCConnectionConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UCConnectionConfig from a JSON string
connectionsv3_uc_connection_config_instance = Connectionsv3UCConnectionConfig.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UCConnectionConfig.to_json())

# convert the object into a dict
connectionsv3_uc_connection_config_dict = connectionsv3_uc_connection_config_instance.to_dict()
# create an instance of Connectionsv3UCConnectionConfig from a dict
connectionsv3_uc_connection_config_from_dict = Connectionsv3UCConnectionConfig.from_dict(connectionsv3_uc_connection_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


