# UserEntitlementInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** |  | 
**type** | **str** |  | 
**permissions** | [**List[AccessType]**](AccessType.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.user_entitlement_info import UserEntitlementInfo

# TODO update the JSON string below
json = "{}"
# create an instance of UserEntitlementInfo from a JSON string
user_entitlement_info_instance = UserEntitlementInfo.from_json(json)
# print the JSON string representation of the object
print(UserEntitlementInfo.to_json())

# convert the object into a dict
user_entitlement_info_dict = user_entitlement_info_instance.to_dict()
# create an instance of UserEntitlementInfo from a dict
user_entitlement_info_from_dict = UserEntitlementInfo.from_dict(user_entitlement_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


