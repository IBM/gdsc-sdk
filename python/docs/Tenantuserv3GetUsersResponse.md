# Tenantuserv3GetUsersResponse

PostUsersResponse message for Get v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | [**List[Tenantuserv3User]**](Tenantuserv3User.md) | List of users. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_users_response import Tenantuserv3GetUsersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetUsersResponse from a JSON string
tenantuserv3_get_users_response_instance = Tenantuserv3GetUsersResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetUsersResponse.to_json())

# convert the object into a dict
tenantuserv3_get_users_response_dict = tenantuserv3_get_users_response_instance.to_dict()
# create an instance of Tenantuserv3GetUsersResponse from a dict
tenantuserv3_get_users_response_from_dict = Tenantuserv3GetUsersResponse.from_dict(tenantuserv3_get_users_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


