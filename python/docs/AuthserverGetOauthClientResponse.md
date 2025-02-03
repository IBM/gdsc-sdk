# AuthserverGetOauthClientResponse

Response parameters for get oauth client by clientId.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_client** | [**AuthserverOauthClient**](AuthserverOauthClient.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.authserver_get_oauth_client_response import AuthserverGetOauthClientResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverGetOauthClientResponse from a JSON string
authserver_get_oauth_client_response_instance = AuthserverGetOauthClientResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverGetOauthClientResponse.to_json())

# convert the object into a dict
authserver_get_oauth_client_response_dict = authserver_get_oauth_client_response_instance.to_dict()
# create an instance of AuthserverGetOauthClientResponse from a dict
authserver_get_oauth_client_response_from_dict = AuthserverGetOauthClientResponse.from_dict(authserver_get_oauth_client_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


