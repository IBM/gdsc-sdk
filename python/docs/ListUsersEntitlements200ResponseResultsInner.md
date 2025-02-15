# ListUsersEntitlements200ResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | 
**type** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | 
**account_ids** | **List[str]** |  | 
**sensitive_categories** | [**List[UserSensitiveCategoriesSensitiveCategoriesInner]**](UserSensitiveCategoriesSensitiveCategoriesInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.list_users_entitlements200_response_results_inner import ListUsersEntitlements200ResponseResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ListUsersEntitlements200ResponseResultsInner from a JSON string
list_users_entitlements200_response_results_inner_instance = ListUsersEntitlements200ResponseResultsInner.from_json(json)
# print the JSON string representation of the object
print(ListUsersEntitlements200ResponseResultsInner.to_json())

# convert the object into a dict
list_users_entitlements200_response_results_inner_dict = list_users_entitlements200_response_results_inner_instance.to_dict()
# create an instance of ListUsersEntitlements200ResponseResultsInner from a dict
list_users_entitlements200_response_results_inner_from_dict = ListUsersEntitlements200ResponseResultsInner.from_dict(list_users_entitlements200_response_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


