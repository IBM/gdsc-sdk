# Tenantuserv3PostRoleRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**Tenantuserv3Role**](Tenantuserv3Role.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_post_role_request import Tenantuserv3PostRoleRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostRoleRequest from a JSON string
tenantuserv3_post_role_request_instance = Tenantuserv3PostRoleRequest.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostRoleRequest.to_json())

# convert the object into a dict
tenantuserv3_post_role_request_dict = tenantuserv3_post_role_request_instance.to_dict()
# create an instance of Tenantuserv3PostRoleRequest from a dict
tenantuserv3_post_role_request_from_dict = Tenantuserv3PostRoleRequest.from_dict(tenantuserv3_post_role_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


