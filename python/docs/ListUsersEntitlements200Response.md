# ListUsersEntitlements200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[ListUsersEntitlements200ResponseResultsInner]**](ListUsersEntitlements200ResponseResultsInner.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_users_entitlements200_response import ListUsersEntitlements200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListUsersEntitlements200Response from a JSON string
list_users_entitlements200_response_instance = ListUsersEntitlements200Response.from_json(json)
# print the JSON string representation of the object
print(ListUsersEntitlements200Response.to_json())

# convert the object into a dict
list_users_entitlements200_response_dict = list_users_entitlements200_response_instance.to_dict()
# create an instance of ListUsersEntitlements200Response from a dict
list_users_entitlements200_response_from_dict = ListUsersEntitlements200Response.from_dict(list_users_entitlements200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


