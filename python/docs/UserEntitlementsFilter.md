# UserEntitlementsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.user_entitlements_filter import UserEntitlementsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of UserEntitlementsFilter from a JSON string
user_entitlements_filter_instance = UserEntitlementsFilter.from_json(json)
# print the JSON string representation of the object
print(UserEntitlementsFilter.to_json())

# convert the object into a dict
user_entitlements_filter_dict = user_entitlements_filter_instance.to_dict()
# create an instance of UserEntitlementsFilter from a dict
user_entitlements_filter_from_dict = UserEntitlementsFilter.from_dict(user_entitlements_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


