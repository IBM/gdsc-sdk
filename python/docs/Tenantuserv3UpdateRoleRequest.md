# Tenantuserv3UpdateRoleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | (Optional) A role description that the access-manager sees (for pre-defined roles, use translation text). | [optional] 
**icp_roles** | **List[str]** | (Optional) An array of ICP roles that should be set for each user with this role. | [optional] 
**name** | **str** | (Optional) A role name that the access-manager sees (for pre-defined roles, use translation text). | [optional] 
**removable** | **bool** | (Optional) Some pre-defined roles are not removable. | [optional] 
**role_id** | **str** | Permanent id of the role. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_update_role_request import Tenantuserv3UpdateRoleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateRoleRequest from a JSON string
tenantuserv3_update_role_request_instance = Tenantuserv3UpdateRoleRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateRoleRequest.to_json())

# convert the object into a dict
tenantuserv3_update_role_request_dict = tenantuserv3_update_role_request_instance.to_dict()
# create an instance of Tenantuserv3UpdateRoleRequest from a dict
tenantuserv3_update_role_request_from_dict = Tenantuserv3UpdateRoleRequest.from_dict(tenantuserv3_update_role_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


