# Tenantuserv3UserTenant

UserTenant contains info on the user and on connected tenants.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_tenant** | [**Tenantuserv3Tenant**](Tenantuserv3Tenant.md) |  | [optional] 
**tenants** | [**List[Tenantuserv3Tenant]**](Tenantuserv3Tenant.md) | Limited info about the other tenants this user belongs to. | [optional] 
**user** | [**Tenantuserv3FullUser**](Tenantuserv3FullUser.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_user_tenant import Tenantuserv3UserTenant

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UserTenant from a JSON string
tenantuserv3_user_tenant_instance = Tenantuserv3UserTenant.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UserTenant.to_json())

# convert the object into a dict
tenantuserv3_user_tenant_dict = tenantuserv3_user_tenant_instance.to_dict()
# create an instance of Tenantuserv3UserTenant from a dict
tenantuserv3_user_tenant_from_dict = Tenantuserv3UserTenant.from_dict(tenantuserv3_user_tenant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


