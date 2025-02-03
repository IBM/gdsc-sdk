# Tenantuserv3GetUserResponse

GetUserResponse message for GetUser.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or failure. | [optional] 
**user** | [**Tenantuserv3FullUser**](Tenantuserv3FullUser.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_user_response import Tenantuserv3GetUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetUserResponse from a JSON string
tenantuserv3_get_user_response_instance = Tenantuserv3GetUserResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetUserResponse.to_json())

# convert the object into a dict
tenantuserv3_get_user_response_dict = tenantuserv3_get_user_response_instance.to_dict()
# create an instance of Tenantuserv3GetUserResponse from a dict
tenantuserv3_get_user_response_from_dict = Tenantuserv3GetUserResponse.from_dict(tenantuserv3_get_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


