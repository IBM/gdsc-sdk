# Jumpboxv3PostAccountResponse

PostAccountsResponse message for POST v3/accounts api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | Account id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_post_account_response import Jumpboxv3PostAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostAccountResponse from a JSON string
jumpboxv3_post_account_response_instance = Jumpboxv3PostAccountResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostAccountResponse.to_json())

# convert the object into a dict
jumpboxv3_post_account_response_dict = jumpboxv3_post_account_response_instance.to_dict()
# create an instance of Jumpboxv3PostAccountResponse from a dict
jumpboxv3_post_account_response_from_dict = Jumpboxv3PostAccountResponse.from_dict(jumpboxv3_post_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


