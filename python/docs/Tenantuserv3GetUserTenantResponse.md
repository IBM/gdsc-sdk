# Tenantuserv3GetUserTenantResponse

GetUserTenantResponse message for GetUserTenant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or failure. | [optional] 
**user_tenant** | [**Tenantuserv3UserTenant**](Tenantuserv3UserTenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_user_tenant_response import Tenantuserv3GetUserTenantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetUserTenantResponse from a JSON string
tenantuserv3_get_user_tenant_response_instance = Tenantuserv3GetUserTenantResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetUserTenantResponse.to_json())

# convert the object into a dict
tenantuserv3_get_user_tenant_response_dict = tenantuserv3_get_user_tenant_response_instance.to_dict()
# create an instance of Tenantuserv3GetUserTenantResponse from a dict
tenantuserv3_get_user_tenant_response_from_dict = Tenantuserv3GetUserTenantResponse.from_dict(tenantuserv3_get_user_tenant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


