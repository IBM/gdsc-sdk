# AuthserverOauthClient

Base oauth client object which is used in get and list APIs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | ClientID of registered OAuth. | [optional] 
**client_secret** | **str** | ClientSecret of registered OAuth. | [optional] 
**description** | **str** | Description of oauth client. | [optional] 
**name** | **str** | Name of oauth client. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.authserver_oauth_client import AuthserverOauthClient

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverOauthClient from a JSON string
authserver_oauth_client_instance = AuthserverOauthClient.from_json(json)
# print the JSON string representation of the object
print(AuthserverOauthClient.to_json())

# convert the object into a dict
authserver_oauth_client_dict = authserver_oauth_client_instance.to_dict()
# create an instance of AuthserverOauthClient from a dict
authserver_oauth_client_from_dict = AuthserverOauthClient.from_dict(authserver_oauth_client_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


