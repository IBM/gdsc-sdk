# Tenantuserv3GetTenantResponse

GetTenantResponse message for GET v3/tenants/{tenant_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant** | [**Tenantuserv3Tenant**](Tenantuserv3Tenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_tenant_response import Tenantuserv3GetTenantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetTenantResponse from a JSON string
tenantuserv3_get_tenant_response_instance = Tenantuserv3GetTenantResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetTenantResponse.to_json())

# convert the object into a dict
tenantuserv3_get_tenant_response_dict = tenantuserv3_get_tenant_response_instance.to_dict()
# create an instance of Tenantuserv3GetTenantResponse from a dict
tenantuserv3_get_tenant_response_from_dict = Tenantuserv3GetTenantResponse.from_dict(tenantuserv3_get_tenant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


