# Tenantuserv3DisableUsersBulkResponse

DisableUsersBulkResponse message for Delete v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_ids** | **List[str]** | List of userId of deleted users. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_disable_users_bulk_response import Tenantuserv3DisableUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3DisableUsersBulkResponse from a JSON string
tenantuserv3_disable_users_bulk_response_instance = Tenantuserv3DisableUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3DisableUsersBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_disable_users_bulk_response_dict = tenantuserv3_disable_users_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3DisableUsersBulkResponse from a dict
tenantuserv3_disable_users_bulk_response_from_dict = Tenantuserv3DisableUsersBulkResponse.from_dict(tenantuserv3_disable_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


