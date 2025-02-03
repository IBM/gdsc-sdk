# Tenantuserv3GetRolesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roles** | [**List[Tenantuserv3Role]**](Tenantuserv3Role.md) | Roles found. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_roles_response import Tenantuserv3GetRolesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetRolesResponse from a JSON string
tenantuserv3_get_roles_response_instance = Tenantuserv3GetRolesResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetRolesResponse.to_json())

# convert the object into a dict
tenantuserv3_get_roles_response_dict = tenantuserv3_get_roles_response_instance.to_dict()
# create an instance of Tenantuserv3GetRolesResponse from a dict
tenantuserv3_get_roles_response_from_dict = Tenantuserv3GetRolesResponse.from_dict(tenantuserv3_get_roles_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


