# Tenantuserv3Role

Role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | A role description that the access-manager sees (for pre-defined roles, use translation text). | [optional] 
**icp_roles** | **List[str]** | An array of ICP roles that should be set for each user with this role. | [optional] 
**name** | **str** | A role name that the access-manager sees (for pre-defined roles, use translation text). | [optional] 
**removable** | **bool** | Some pre-defined roles are not removable. | [optional] 
**role_id** | **str** | Permanent id of the role. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_role import Tenantuserv3Role

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3Role from a JSON string
tenantuserv3_role_instance = Tenantuserv3Role.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3Role.to_json())

# convert the object into a dict
tenantuserv3_role_dict = tenantuserv3_role_instance.to_dict()
# create an instance of Tenantuserv3Role from a dict
tenantuserv3_role_from_dict = Tenantuserv3Role.from_dict(tenantuserv3_role_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


