# Connectionsv3Account

Account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key** | **str** | Access key for the connection account. | [optional] 
**authentication_type** | **str** | Authentication type of account. | [optional] 
**connection_type** | **str** | Connection type for the account. | [optional] 
**name** | **str** | Name of acccount. | [optional] 
**role_arn** | **str** | Optional: role of the acccount. | [optional] 
**secret_access_key** | **str** | Account password. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_account import Connectionsv3Account

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3Account from a JSON string
connectionsv3_account_instance = Connectionsv3Account.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3Account.to_json())

# convert the object into a dict
connectionsv3_account_dict = connectionsv3_account_instance.to_dict()
# create an instance of Connectionsv3Account from a dict
connectionsv3_account_from_dict = Connectionsv3Account.from_dict(connectionsv3_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


