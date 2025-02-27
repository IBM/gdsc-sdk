# Tenantuserv3AuthResponse

AuthResponse message for GET v3/Authentication api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jwt** | **str** | JWT token. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_auth_response import Tenantuserv3AuthResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3AuthResponse from a JSON string
tenantuserv3_auth_response_instance = Tenantuserv3AuthResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3AuthResponse.to_json())

# convert the object into a dict
tenantuserv3_auth_response_dict = tenantuserv3_auth_response_instance.to_dict()
# create an instance of Tenantuserv3AuthResponse from a dict
tenantuserv3_auth_response_from_dict = Tenantuserv3AuthResponse.from_dict(tenantuserv3_auth_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


