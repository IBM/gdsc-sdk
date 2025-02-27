# Tenantuserv3GetPrivilegesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privileges** | [**List[Tenantuserv3Privilege]**](Tenantuserv3Privilege.md) | Array of privileges found. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_privileges_response import Tenantuserv3GetPrivilegesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetPrivilegesResponse from a JSON string
tenantuserv3_get_privileges_response_instance = Tenantuserv3GetPrivilegesResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetPrivilegesResponse.to_json())

# convert the object into a dict
tenantuserv3_get_privileges_response_dict = tenantuserv3_get_privileges_response_instance.to_dict()
# create an instance of Tenantuserv3GetPrivilegesResponse from a dict
tenantuserv3_get_privileges_response_from_dict = Tenantuserv3GetPrivilegesResponse.from_dict(tenantuserv3_get_privileges_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


