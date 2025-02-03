# AuthserverCheckPermissionForOAuthTokenResponse

Response parameters for check api permission.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jwt_token** | **str** | JWT token to access GI API. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.authserver_check_permission_for_o_auth_token_response import AuthserverCheckPermissionForOAuthTokenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverCheckPermissionForOAuthTokenResponse from a JSON string
authserver_check_permission_for_o_auth_token_response_instance = AuthserverCheckPermissionForOAuthTokenResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverCheckPermissionForOAuthTokenResponse.to_json())

# convert the object into a dict
authserver_check_permission_for_o_auth_token_response_dict = authserver_check_permission_for_o_auth_token_response_instance.to_dict()
# create an instance of AuthserverCheckPermissionForOAuthTokenResponse from a dict
authserver_check_permission_for_o_auth_token_response_from_dict = AuthserverCheckPermissionForOAuthTokenResponse.from_dict(authserver_check_permission_for_o_auth_token_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


