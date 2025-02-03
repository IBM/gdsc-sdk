# Tenantuserv3UpdateUserRoleBulkRequest

UpdateUserRoleBulkRequest provides needed information to update user role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assign_role_id** | **List[str]** | Roles to add to the users above. | [optional] 
**remove_role_id** | **List[str]** | Roles to remove from the users above. | [optional] 
**user_id** | **List[str]** | Array of user_id to modify roles. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_user_role_bulk_request import Tenantuserv3UpdateUserRoleBulkRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateUserRoleBulkRequest from a JSON string
tenantuserv3_update_user_role_bulk_request_instance = Tenantuserv3UpdateUserRoleBulkRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateUserRoleBulkRequest.to_json())

# convert the object into a dict
tenantuserv3_update_user_role_bulk_request_dict = tenantuserv3_update_user_role_bulk_request_instance.to_dict()
# create an instance of Tenantuserv3UpdateUserRoleBulkRequest from a dict
tenantuserv3_update_user_role_bulk_request_from_dict = Tenantuserv3UpdateUserRoleBulkRequest.from_dict(tenantuserv3_update_user_role_bulk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


