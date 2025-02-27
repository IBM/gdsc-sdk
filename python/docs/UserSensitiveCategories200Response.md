# UserSensitiveCategories200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | 
**type** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | 
**account_ids** | **List[str]** |  | 
**sensitive_categories** | [**List[UserSensitiveCategoriesSensitiveCategoriesInner]**](UserSensitiveCategoriesSensitiveCategoriesInner.md) |  | 
**accessible_permission_configurations** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.user_sensitive_categories200_response import UserSensitiveCategories200Response

# TODO update the JSON string below
json = "{}"
# create an instance of UserSensitiveCategories200Response from a JSON string
user_sensitive_categories200_response_instance = UserSensitiveCategories200Response.from_json(json)
# print the JSON string representation of the object
print(UserSensitiveCategories200Response.to_json())

# convert the object into a dict
user_sensitive_categories200_response_dict = user_sensitive_categories200_response_instance.to_dict()
# create an instance of UserSensitiveCategories200Response from a dict
user_sensitive_categories200_response_from_dict = UserSensitiveCategories200Response.from_dict(user_sensitive_categories200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


