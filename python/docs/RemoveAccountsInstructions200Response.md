# RemoveAccountsInstructions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**link** | **str** |  | [optional] 
**script** | **str** | Use this script to remove account from your provider | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.remove_accounts_instructions200_response import RemoveAccountsInstructions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveAccountsInstructions200Response from a JSON string
remove_accounts_instructions200_response_instance = RemoveAccountsInstructions200Response.from_json(json)
# print the JSON string representation of the object
print(RemoveAccountsInstructions200Response.to_json())

# convert the object into a dict
remove_accounts_instructions200_response_dict = remove_accounts_instructions200_response_instance.to_dict()
# create an instance of RemoveAccountsInstructions200Response from a dict
remove_accounts_instructions200_response_from_dict = RemoveAccountsInstructions200Response.from_dict(remove_accounts_instructions200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


