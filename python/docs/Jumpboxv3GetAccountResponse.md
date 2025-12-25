# Jumpboxv3GetAccountResponse

GetAccountResponse message for GET v3/accounts/{account_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant** | [**Jumpboxv3Tenant**](Jumpboxv3Tenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_get_account_response import Jumpboxv3GetAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3GetAccountResponse from a JSON string
jumpboxv3_get_account_response_instance = Jumpboxv3GetAccountResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3GetAccountResponse.to_json())

# convert the object into a dict
jumpboxv3_get_account_response_dict = jumpboxv3_get_account_response_instance.to_dict()
# create an instance of Jumpboxv3GetAccountResponse from a dict
jumpboxv3_get_account_response_from_dict = Jumpboxv3GetAccountResponse.from_dict(jumpboxv3_get_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


