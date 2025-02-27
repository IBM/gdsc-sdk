# Tenantuserv3GetAPIPrivilegesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**privileges** | **Dict[str, bool]** | Privileges based off the given roles. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_api_privileges_response import Tenantuserv3GetAPIPrivilegesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetAPIPrivilegesResponse from a JSON string
tenantuserv3_get_api_privileges_response_instance = Tenantuserv3GetAPIPrivilegesResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetAPIPrivilegesResponse.to_json())

# convert the object into a dict
tenantuserv3_get_api_privileges_response_dict = tenantuserv3_get_api_privileges_response_instance.to_dict()
# create an instance of Tenantuserv3GetAPIPrivilegesResponse from a dict
tenantuserv3_get_api_privileges_response_from_dict = Tenantuserv3GetAPIPrivilegesResponse.from_dict(tenantuserv3_get_api_privileges_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


