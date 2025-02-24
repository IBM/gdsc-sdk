# AuthserverGetUserResponse

Response parameters for get privillage.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_flags** | [**Dict[str, Featureflagsv3FeatureFlagValue]**](Featureflagsv3FeatureFlagValue.md) | Feature flags map. | [optional] 
**user** | [**Tenantuserv3FullUser**](Tenantuserv3FullUser.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.authserver_get_user_response import AuthserverGetUserResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverGetUserResponse from a JSON string
authserver_get_user_response_instance = AuthserverGetUserResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverGetUserResponse.to_json())

# convert the object into a dict
authserver_get_user_response_dict = authserver_get_user_response_instance.to_dict()
# create an instance of AuthserverGetUserResponse from a dict
authserver_get_user_response_from_dict = AuthserverGetUserResponse.from_dict(authserver_get_user_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


