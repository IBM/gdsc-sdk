# Connectionsv3CreateConnectionsAccountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_create_connections_accounts_response import Connectionsv3CreateConnectionsAccountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3CreateConnectionsAccountsResponse from a JSON string
connectionsv3_create_connections_accounts_response_instance = Connectionsv3CreateConnectionsAccountsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3CreateConnectionsAccountsResponse.to_json())

# convert the object into a dict
connectionsv3_create_connections_accounts_response_dict = connectionsv3_create_connections_accounts_response_instance.to_dict()
# create an instance of Connectionsv3CreateConnectionsAccountsResponse from a dict
connectionsv3_create_connections_accounts_response_from_dict = Connectionsv3CreateConnectionsAccountsResponse.from_dict(connectionsv3_create_connections_accounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


