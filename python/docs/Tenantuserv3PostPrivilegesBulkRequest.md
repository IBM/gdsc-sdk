# Tenantuserv3PostPrivilegesBulkRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privileges** | [**List[Tenantuserv3Privilege]**](Tenantuserv3Privilege.md) | Array of privileges to be created. Use for bulk import of groups, datasources, etc. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_post_privileges_bulk_request import Tenantuserv3PostPrivilegesBulkRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostPrivilegesBulkRequest from a JSON string
tenantuserv3_post_privileges_bulk_request_instance = Tenantuserv3PostPrivilegesBulkRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostPrivilegesBulkRequest.to_json())

# convert the object into a dict
tenantuserv3_post_privileges_bulk_request_dict = tenantuserv3_post_privileges_bulk_request_instance.to_dict()
# create an instance of Tenantuserv3PostPrivilegesBulkRequest from a dict
tenantuserv3_post_privileges_bulk_request_from_dict = Tenantuserv3PostPrivilegesBulkRequest.from_dict(tenantuserv3_post_privileges_bulk_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


