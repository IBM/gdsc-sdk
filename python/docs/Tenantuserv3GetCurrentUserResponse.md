# Tenantuserv3GetCurrentUserResponse

GetCurrentUserResponse for GetCurrentUser.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cur_user** | [**Tenantuserv3CurrentUser**](Tenantuserv3CurrentUser.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_current_user_response import Tenantuserv3GetCurrentUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetCurrentUserResponse from a JSON string
tenantuserv3_get_current_user_response_instance = Tenantuserv3GetCurrentUserResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetCurrentUserResponse.to_json())

# convert the object into a dict
tenantuserv3_get_current_user_response_dict = tenantuserv3_get_current_user_response_instance.to_dict()
# create an instance of Tenantuserv3GetCurrentUserResponse from a dict
tenantuserv3_get_current_user_response_from_dict = Tenantuserv3GetCurrentUserResponse.from_dict(tenantuserv3_get_current_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


