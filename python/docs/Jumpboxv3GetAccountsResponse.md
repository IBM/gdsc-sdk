# Jumpboxv3GetAccountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenants** | [**List[Jumpboxv3Tenant]**](Jumpboxv3Tenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_get_accounts_response import Jumpboxv3GetAccountsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3GetAccountsResponse from a JSON string
jumpboxv3_get_accounts_response_instance = Jumpboxv3GetAccountsResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3GetAccountsResponse.to_json())

# convert the object into a dict
jumpboxv3_get_accounts_response_dict = jumpboxv3_get_accounts_response_instance.to_dict()
# create an instance of Jumpboxv3GetAccountsResponse from a dict
jumpboxv3_get_accounts_response_from_dict = Jumpboxv3GetAccountsResponse.from_dict(jumpboxv3_get_accounts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


