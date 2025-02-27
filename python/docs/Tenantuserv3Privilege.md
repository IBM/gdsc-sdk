# Tenantuserv3Privilege


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author_id** | **str** | Privilege author&#39;s id. | [optional] 
**immutable_roles** | **List[str]** | Roles of the type:* permission. | [optional] 
**manage_roles** | **List[str]** | Roles of the management permission. | [optional] 
**name** | **str** | A privilege name that the access-manager sees (for pre-defined privileges, use translation text). | [optional] 
**nls_id** | **str** |  | [optional] 
**privilege_id** | **str** | Permanent id of the privilege. | [optional] 
**removable** | **bool** | All pre-defined privileges are not removable. | [optional] 
**roles** | **List[str]** | The array of GDSC roles that this privilege belongs to. | [optional] 
**type** | **str** | Type of privilege: report, classification, group, page, restapi, etc. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_privilege import Tenantuserv3Privilege

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3Privilege from a JSON string
tenantuserv3_privilege_instance = Tenantuserv3Privilege.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3Privilege.to_json())

# convert the object into a dict
tenantuserv3_privilege_dict = tenantuserv3_privilege_instance.to_dict()
# create an instance of Tenantuserv3Privilege from a dict
tenantuserv3_privilege_from_dict = Tenantuserv3Privilege.from_dict(tenantuserv3_privilege_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


