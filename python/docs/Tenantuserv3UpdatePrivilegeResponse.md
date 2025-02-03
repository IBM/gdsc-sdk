# Tenantuserv3UpdatePrivilegeResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privilege_id** | **str** | ID of privilege updated or created. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_privilege_response import Tenantuserv3UpdatePrivilegeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdatePrivilegeResponse from a JSON string
tenantuserv3_update_privilege_response_instance = Tenantuserv3UpdatePrivilegeResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdatePrivilegeResponse.to_json())

# convert the object into a dict
tenantuserv3_update_privilege_response_dict = tenantuserv3_update_privilege_response_instance.to_dict()
# create an instance of Tenantuserv3UpdatePrivilegeResponse from a dict
tenantuserv3_update_privilege_response_from_dict = Tenantuserv3UpdatePrivilegeResponse.from_dict(tenantuserv3_update_privilege_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


