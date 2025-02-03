# Tenantuserv3PostPrivilegesBulkResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege_id** | **List[str]** | Array of IDs representing the privileges created. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_post_privileges_bulk_response import Tenantuserv3PostPrivilegesBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostPrivilegesBulkResponse from a JSON string
tenantuserv3_post_privileges_bulk_response_instance = Tenantuserv3PostPrivilegesBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostPrivilegesBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_post_privileges_bulk_response_dict = tenantuserv3_post_privileges_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3PostPrivilegesBulkResponse from a dict
tenantuserv3_post_privileges_bulk_response_from_dict = Tenantuserv3PostPrivilegesBulkResponse.from_dict(tenantuserv3_post_privileges_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


