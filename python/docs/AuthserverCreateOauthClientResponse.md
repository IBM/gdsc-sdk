# AuthserverCreateOauthClientResponse

Response parameters for create oauth client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_client** | [**AuthserverOauthClient**](AuthserverOauthClient.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.authserver_create_oauth_client_response import AuthserverCreateOauthClientResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverCreateOauthClientResponse from a JSON string
authserver_create_oauth_client_response_instance = AuthserverCreateOauthClientResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverCreateOauthClientResponse.to_json())

# convert the object into a dict
authserver_create_oauth_client_response_dict = authserver_create_oauth_client_response_instance.to_dict()
# create an instance of AuthserverCreateOauthClientResponse from a dict
authserver_create_oauth_client_response_from_dict = AuthserverCreateOauthClientResponse.from_dict(authserver_create_oauth_client_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


