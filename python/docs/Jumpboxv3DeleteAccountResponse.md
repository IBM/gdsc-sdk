# Jumpboxv3DeleteAccountResponse

DeleteAccountResponse message for DELETE v3/accounts/{account_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_delete_account_response import Jumpboxv3DeleteAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3DeleteAccountResponse from a JSON string
jumpboxv3_delete_account_response_instance = Jumpboxv3DeleteAccountResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3DeleteAccountResponse.to_json())

# convert the object into a dict
jumpboxv3_delete_account_response_dict = jumpboxv3_delete_account_response_instance.to_dict()
# create an instance of Jumpboxv3DeleteAccountResponse from a dict
jumpboxv3_delete_account_response_from_dict = Jumpboxv3DeleteAccountResponse.from_dict(jumpboxv3_delete_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


