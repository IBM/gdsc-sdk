# Connectionsv3CreateConnectionsAccountsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**Connectionsv3Account**](Connectionsv3Account.md) |  | [optional] 
**account_id** | **str** | Optional: account id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_create_connections_accounts_request import Connectionsv3CreateConnectionsAccountsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3CreateConnectionsAccountsRequest from a JSON string
connectionsv3_create_connections_accounts_request_instance = Connectionsv3CreateConnectionsAccountsRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3CreateConnectionsAccountsRequest.to_json())

# convert the object into a dict
connectionsv3_create_connections_accounts_request_dict = connectionsv3_create_connections_accounts_request_instance.to_dict()
# create an instance of Connectionsv3CreateConnectionsAccountsRequest from a dict
connectionsv3_create_connections_accounts_request_from_dict = Connectionsv3CreateConnectionsAccountsRequest.from_dict(connectionsv3_create_connections_accounts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


