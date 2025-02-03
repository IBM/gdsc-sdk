# Connectionsv3UpdateConnectionsAccountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_update_connections_accounts_response import Connectionsv3UpdateConnectionsAccountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UpdateConnectionsAccountsResponse from a JSON string
connectionsv3_update_connections_accounts_response_instance = Connectionsv3UpdateConnectionsAccountsResponse.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UpdateConnectionsAccountsResponse.to_json())

# convert the object into a dict
connectionsv3_update_connections_accounts_response_dict = connectionsv3_update_connections_accounts_response_instance.to_dict()
# create an instance of Connectionsv3UpdateConnectionsAccountsResponse from a dict
connectionsv3_update_connections_accounts_response_from_dict = Connectionsv3UpdateConnectionsAccountsResponse.from_dict(connectionsv3_update_connections_accounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


