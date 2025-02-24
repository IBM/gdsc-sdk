# Tenantuserv3CurrentUserTenant

CurrentUserTenant contains a list of tenant id and tenant name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of tenant. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**tenant_id** | **str** | The tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_current_user_tenant import Tenantuserv3CurrentUserTenant

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3CurrentUserTenant from a JSON string
tenantuserv3_current_user_tenant_instance = Tenantuserv3CurrentUserTenant.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3CurrentUserTenant.to_json())

# convert the object into a dict
tenantuserv3_current_user_tenant_dict = tenantuserv3_current_user_tenant_instance.to_dict()
# create an instance of Tenantuserv3CurrentUserTenant from a dict
tenantuserv3_current_user_tenant_from_dict = Tenantuserv3CurrentUserTenant.from_dict(tenantuserv3_current_user_tenant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


