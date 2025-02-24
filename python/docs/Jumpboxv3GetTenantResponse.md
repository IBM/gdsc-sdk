# Jumpboxv3GetTenantResponse

GetTenantResponse message for GET v3/tenants/{tenant_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant** | [**Jumpboxv3Tenant**](Jumpboxv3Tenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_get_tenant_response import Jumpboxv3GetTenantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3GetTenantResponse from a JSON string
jumpboxv3_get_tenant_response_instance = Jumpboxv3GetTenantResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3GetTenantResponse.to_json())

# convert the object into a dict
jumpboxv3_get_tenant_response_dict = jumpboxv3_get_tenant_response_instance.to_dict()
# create an instance of Jumpboxv3GetTenantResponse from a dict
jumpboxv3_get_tenant_response_from_dict = Jumpboxv3GetTenantResponse.from_dict(jumpboxv3_get_tenant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


