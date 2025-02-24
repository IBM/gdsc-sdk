# Tenantuserv3PostRoleResponse

PostRoleResponse message for POST v3/role api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_id** | **str** | ID of role created. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_post_role_response import Tenantuserv3PostRoleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostRoleResponse from a JSON string
tenantuserv3_post_role_response_instance = Tenantuserv3PostRoleResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostRoleResponse.to_json())

# convert the object into a dict
tenantuserv3_post_role_response_dict = tenantuserv3_post_role_response_instance.to_dict()
# create an instance of Tenantuserv3PostRoleResponse from a dict
tenantuserv3_post_role_response_from_dict = Tenantuserv3PostRoleResponse.from_dict(tenantuserv3_post_role_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


