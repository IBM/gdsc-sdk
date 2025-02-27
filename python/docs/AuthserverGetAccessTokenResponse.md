# AuthserverGetAccessTokenResponse

Response parameters for get access token.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **str** | Access token for requested clientID. | [optional] 
**expires_in** | **str** | Expiry time of Access token. | [optional] 
**token_type** | **str** | Type of access token - generally it will be bearer. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.authserver_get_access_token_response import AuthserverGetAccessTokenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverGetAccessTokenResponse from a JSON string
authserver_get_access_token_response_instance = AuthserverGetAccessTokenResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverGetAccessTokenResponse.to_json())

# convert the object into a dict
authserver_get_access_token_response_dict = authserver_get_access_token_response_instance.to_dict()
# create an instance of AuthserverGetAccessTokenResponse from a dict
authserver_get_access_token_response_from_dict = AuthserverGetAccessTokenResponse.from_dict(authserver_get_access_token_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


