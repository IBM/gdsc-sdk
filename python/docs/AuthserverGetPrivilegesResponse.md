# AuthserverGetPrivilegesResponse

Request parameters for get api privillage.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_flags** | [**Dict[str, Featureflagsv3FeatureFlagValue]**](Featureflagsv3FeatureFlagValue.md) | Feature flags map. | [optional] 
**privileges** | **Dict[str, bool]** | Cumulative privileges base on all roles. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.authserver_get_privileges_response import AuthserverGetPrivilegesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AuthserverGetPrivilegesResponse from a JSON string
authserver_get_privileges_response_instance = AuthserverGetPrivilegesResponse.from_json(json)
# print the JSON string representation of the object
print(AuthserverGetPrivilegesResponse.to_json())

# convert the object into a dict
authserver_get_privileges_response_dict = authserver_get_privileges_response_instance.to_dict()
# create an instance of AuthserverGetPrivilegesResponse from a dict
authserver_get_privileges_response_from_dict = AuthserverGetPrivilegesResponse.from_dict(authserver_get_privileges_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


