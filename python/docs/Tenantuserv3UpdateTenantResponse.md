# Tenantuserv3UpdateTenantResponse

UpdateTenantResponse message for PUT v3/tenants/{tenant_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** | Tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_update_tenant_response import Tenantuserv3UpdateTenantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3UpdateTenantResponse from a JSON string
tenantuserv3_update_tenant_response_instance = Tenantuserv3UpdateTenantResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3UpdateTenantResponse.to_json())

# convert the object into a dict
tenantuserv3_update_tenant_response_dict = tenantuserv3_update_tenant_response_instance.to_dict()
# create an instance of Tenantuserv3UpdateTenantResponse from a dict
tenantuserv3_update_tenant_response_from_dict = Tenantuserv3UpdateTenantResponse.from_dict(tenantuserv3_update_tenant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


