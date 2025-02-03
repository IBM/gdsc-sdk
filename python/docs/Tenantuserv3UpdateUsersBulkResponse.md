# Tenantuserv3UpdateUsersBulkResponse

UpdateUsersBulkResponse message for Patch v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **List[str]** | User id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_users_bulk_response import Tenantuserv3UpdateUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateUsersBulkResponse from a JSON string
tenantuserv3_update_users_bulk_response_instance = Tenantuserv3UpdateUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateUsersBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_update_users_bulk_response_dict = tenantuserv3_update_users_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3UpdateUsersBulkResponse from a dict
tenantuserv3_update_users_bulk_response_from_dict = Tenantuserv3UpdateUsersBulkResponse.from_dict(tenantuserv3_update_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


