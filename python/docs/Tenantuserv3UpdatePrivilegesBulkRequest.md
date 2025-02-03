# Tenantuserv3UpdatePrivilegesBulkRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege** | [**List[Tenantuserv3BasicPrivilege]**](Tenantuserv3BasicPrivilege.md) | Array of privileges for which roles will be updated. | [optional] 
**role_id** | **str** | Used to determine what changed from the original roles array. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privileges_bulk_request import Tenantuserv3UpdatePrivilegesBulkRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdatePrivilegesBulkRequest from a JSON string
tenantuserv3_update_privileges_bulk_request_instance = Tenantuserv3UpdatePrivilegesBulkRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdatePrivilegesBulkRequest.to_json())

# convert the object into a dict
tenantuserv3_update_privileges_bulk_request_dict = tenantuserv3_update_privileges_bulk_request_instance.to_dict()
# create an instance of Tenantuserv3UpdatePrivilegesBulkRequest from a dict
tenantuserv3_update_privileges_bulk_request_from_dict = Tenantuserv3UpdatePrivilegesBulkRequest.from_dict(tenantuserv3_update_privileges_bulk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


