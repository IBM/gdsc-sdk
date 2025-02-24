# Tenantuserv3GetPrivilegeResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege** | [**Tenantuserv3Privilege**](Tenantuserv3Privilege.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_privilege_response import Tenantuserv3GetPrivilegeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetPrivilegeResponse from a JSON string
tenantuserv3_get_privilege_response_instance = Tenantuserv3GetPrivilegeResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetPrivilegeResponse.to_json())

# convert the object into a dict
tenantuserv3_get_privilege_response_dict = tenantuserv3_get_privilege_response_instance.to_dict()
# create an instance of Tenantuserv3GetPrivilegeResponse from a dict
tenantuserv3_get_privilege_response_from_dict = Tenantuserv3GetPrivilegeResponse.from_dict(tenantuserv3_get_privilege_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


