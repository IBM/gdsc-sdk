# Tenantuserv3PostUsersBulkResponse

PostUsersBulkResponse message for POST v3/users api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **str** |  | [optional] 
**user_ids** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_post_users_bulk_response import Tenantuserv3PostUsersBulkResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostUsersBulkResponse from a JSON string
tenantuserv3_post_users_bulk_response_instance = Tenantuserv3PostUsersBulkResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostUsersBulkResponse.to_json())

# convert the object into a dict
tenantuserv3_post_users_bulk_response_dict = tenantuserv3_post_users_bulk_response_instance.to_dict()
# create an instance of Tenantuserv3PostUsersBulkResponse from a dict
tenantuserv3_post_users_bulk_response_from_dict = Tenantuserv3PostUsersBulkResponse.from_dict(tenantuserv3_post_users_bulk_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


