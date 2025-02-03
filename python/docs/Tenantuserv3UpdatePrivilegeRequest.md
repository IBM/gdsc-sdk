# Tenantuserv3UpdatePrivilegeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manage_roles** | **List[str]** | (Optional) Roles of the management permission. | [optional] 
**name** | **str** | (Optional) A privilege name that the access-manager sees (for pre-defined privileges, use translation text). | [optional] 
**privilege_id** | **str** | Permanent id of the privilege to be updated or created. | [optional] 
**removable** | **bool** | (Optional) All pre-defined privileges are not removable. | [optional] 
**roles** | **List[str]** | The array of Insights roles that this privilege belongs to. | [optional] 
**type** | **str** | (Optional) Type of privilege: report, classification, group, page, restapi, etc. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privilege_request import Tenantuserv3UpdatePrivilegeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdatePrivilegeRequest from a JSON string
tenantuserv3_update_privilege_request_instance = Tenantuserv3UpdatePrivilegeRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdatePrivilegeRequest.to_json())

# convert the object into a dict
tenantuserv3_update_privilege_request_dict = tenantuserv3_update_privilege_request_instance.to_dict()
# create an instance of Tenantuserv3UpdatePrivilegeRequest from a dict
tenantuserv3_update_privilege_request_from_dict = Tenantuserv3UpdatePrivilegeRequest.from_dict(tenantuserv3_update_privilege_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


