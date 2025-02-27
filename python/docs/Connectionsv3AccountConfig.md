# Connectionsv3AccountConfig

connection account config with account id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**Connectionsv3Account**](Connectionsv3Account.md) |  | [optional] 
**account_id** | **str** | Account id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_account_config import Connectionsv3AccountConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3AccountConfig from a JSON string
connectionsv3_account_config_instance = Connectionsv3AccountConfig.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3AccountConfig.to_json())

# convert the object into a dict
connectionsv3_account_config_dict = connectionsv3_account_config_instance.to_dict()
# create an instance of Connectionsv3AccountConfig from a dict
connectionsv3_account_config_from_dict = Connectionsv3AccountConfig.from_dict(connectionsv3_account_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


