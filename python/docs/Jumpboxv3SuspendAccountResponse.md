# Jumpboxv3SuspendAccountResponse

SuspendTenantResponse message for PATCH v3/accounts/suspend/{account_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_suspend_account_response import Jumpboxv3SuspendAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3SuspendAccountResponse from a JSON string
jumpboxv3_suspend_account_response_instance = Jumpboxv3SuspendAccountResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3SuspendAccountResponse.to_json())

# convert the object into a dict
jumpboxv3_suspend_account_response_dict = jumpboxv3_suspend_account_response_instance.to_dict()
# create an instance of Jumpboxv3SuspendAccountResponse from a dict
jumpboxv3_suspend_account_response_from_dict = Jumpboxv3SuspendAccountResponse.from_dict(jumpboxv3_suspend_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


