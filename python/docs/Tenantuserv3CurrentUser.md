# Tenantuserv3CurrentUser

CurrentUser contains a single user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cur_user_tenant** | [**Tenantuserv3Tenant**](Tenantuserv3Tenant.md) |  | [optional] 
**tenants** | [**List[Tenantuserv3CurrentUserTenant]**](Tenantuserv3CurrentUserTenant.md) |  | [optional] 
**user** | [**Tenantuserv3FullUser**](Tenantuserv3FullUser.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_current_user import Tenantuserv3CurrentUser

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3CurrentUser from a JSON string
tenantuserv3_current_user_instance = Tenantuserv3CurrentUser.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3CurrentUser.to_json())

# convert the object into a dict
tenantuserv3_current_user_dict = tenantuserv3_current_user_instance.to_dict()
# create an instance of Tenantuserv3CurrentUser from a dict
tenantuserv3_current_user_from_dict = Tenantuserv3CurrentUser.from_dict(tenantuserv3_current_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


