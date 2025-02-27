# UserSensitiveCategories


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_ids** | **List[str]** |  | 
**sensitive_categories** | [**List[UserSensitiveCategoriesSensitiveCategoriesInner]**](UserSensitiveCategoriesSensitiveCategoriesInner.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.user_sensitive_categories import UserSensitiveCategories

# TODO update the JSON string below
json = "{}"
# create an instance of UserSensitiveCategories from a JSON string
user_sensitive_categories_instance = UserSensitiveCategories.from_json(json)
# print the JSON string representation of the object
print(UserSensitiveCategories.to_json())

# convert the object into a dict
user_sensitive_categories_dict = user_sensitive_categories_instance.to_dict()
# create an instance of UserSensitiveCategories from a dict
user_sensitive_categories_from_dict = UserSensitiveCategories.from_dict(user_sensitive_categories_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


