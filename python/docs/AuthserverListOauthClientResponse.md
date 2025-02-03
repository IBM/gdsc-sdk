# AuthserverListOauthClientResponse

Response parameters for list oauth client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauth_clients** | [**List[AuthserverOauthClient]**](AuthserverOauthClient.md) | List of base oauth client object. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.authserver_list_oauth_client_response import AuthserverListOauthClientResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverListOauthClientResponse from a JSON string
authserver_list_oauth_client_response_instance = AuthserverListOauthClientResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverListOauthClientResponse.to_json())

# convert the object into a dict
authserver_list_oauth_client_response_dict = authserver_list_oauth_client_response_instance.to_dict()
# create an instance of AuthserverListOauthClientResponse from a dict
authserver_list_oauth_client_response_from_dict = AuthserverListOauthClientResponse.from_dict(authserver_list_oauth_client_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


