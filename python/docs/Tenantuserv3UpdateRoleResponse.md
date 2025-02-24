# Tenantuserv3UpdateRoleResponse

UpdateTenantResponse message for PUT v3/tenants/{tenant_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_id** | **str** | ID of role updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_update_role_response import Tenantuserv3UpdateRoleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateRoleResponse from a JSON string
tenantuserv3_update_role_response_instance = Tenantuserv3UpdateRoleResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateRoleResponse.to_json())

# convert the object into a dict
tenantuserv3_update_role_response_dict = tenantuserv3_update_role_response_instance.to_dict()
# create an instance of Tenantuserv3UpdateRoleResponse from a dict
tenantuserv3_update_role_response_from_dict = Tenantuserv3UpdateRoleResponse.from_dict(tenantuserv3_update_role_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


