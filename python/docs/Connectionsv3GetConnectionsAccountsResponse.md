# Connectionsv3GetConnectionsAccountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_configs** | [**List[Connectionsv3AccountConfig]**](Connectionsv3AccountConfig.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_get_connections_accounts_response import Connectionsv3GetConnectionsAccountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3GetConnectionsAccountsResponse from a JSON string
connectionsv3_get_connections_accounts_response_instance = Connectionsv3GetConnectionsAccountsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3GetConnectionsAccountsResponse.to_json())

# convert the object into a dict
connectionsv3_get_connections_accounts_response_dict = connectionsv3_get_connections_accounts_response_instance.to_dict()
# create an instance of Connectionsv3GetConnectionsAccountsResponse from a dict
connectionsv3_get_connections_accounts_response_from_dict = Connectionsv3GetConnectionsAccountsResponse.from_dict(connectionsv3_get_connections_accounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


