# Tenantuserv3UpdateUserRoleBulkResponse

UpdateUserRoleBulkResponse returns success or errors for the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or failure. | [optional] 
**user_id** | **List[str]** | Array of user_id that are updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_update_user_role_bulk_response import Tenantuserv3UpdateUserRoleBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateUserRoleBulkResponse from a JSON string
tenantuserv3_update_user_role_bulk_response_instance = Tenantuserv3UpdateUserRoleBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateUserRoleBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_update_user_role_bulk_response_dict = tenantuserv3_update_user_role_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3UpdateUserRoleBulkResponse from a dict
tenantuserv3_update_user_role_bulk_response_from_dict = Tenantuserv3UpdateUserRoleBulkResponse.from_dict(tenantuserv3_update_user_role_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


