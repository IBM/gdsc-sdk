# AuthserverCreateOauthClientRequest

Request parameters for create oauth client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of oauth client. | [optional] 
**name** | **str** | Name of oauth client. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.authserver_create_oauth_client_request import AuthserverCreateOauthClientRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverCreateOauthClientRequest from a JSON string
authserver_create_oauth_client_request_instance = AuthserverCreateOauthClientRequest.from_json(json)
# print the JSON string representation of the object
print(AuthserverCreateOauthClientRequest.to_json())

# convert the object into a dict
authserver_create_oauth_client_request_dict = authserver_create_oauth_client_request_instance.to_dict()
# create an instance of AuthserverCreateOauthClientRequest from a dict
authserver_create_oauth_client_request_from_dict = AuthserverCreateOauthClientRequest.from_dict(authserver_create_oauth_client_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


