# Tenantuserv3UpdatePrivilegesBulkResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Translated success string or error message. | [optional] 
**privilege_id** | **List[str]** | Array of IDs where privilege was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privileges_bulk_response import Tenantuserv3UpdatePrivilegesBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdatePrivilegesBulkResponse from a JSON string
tenantuserv3_update_privileges_bulk_response_instance = Tenantuserv3UpdatePrivilegesBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdatePrivilegesBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_update_privileges_bulk_response_dict = tenantuserv3_update_privileges_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3UpdatePrivilegesBulkResponse from a dict
tenantuserv3_update_privileges_bulk_response_from_dict = Tenantuserv3UpdatePrivilegesBulkResponse.from_dict(tenantuserv3_update_privileges_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


