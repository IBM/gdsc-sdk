# Tenantuserv3GetTenantPartNumbersDiffResponse

GetTenantPartNumbersDiffResponse message for Get v3/tenants api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**are_part_numbers_same** | **bool** |  | [optional] 
**tenant_capability_part_numbers_changes** | [**Dict[str, Tenantuserv3TenantCapabilityPartNumbers]**](Tenantuserv3TenantCapabilityPartNumbers.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_get_tenant_part_numbers_diff_response import Tenantuserv3GetTenantPartNumbersDiffResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetTenantPartNumbersDiffResponse from a JSON string
tenantuserv3_get_tenant_part_numbers_diff_response_instance = Tenantuserv3GetTenantPartNumbersDiffResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetTenantPartNumbersDiffResponse.to_json())

# convert the object into a dict
tenantuserv3_get_tenant_part_numbers_diff_response_dict = tenantuserv3_get_tenant_part_numbers_diff_response_instance.to_dict()
# create an instance of Tenantuserv3GetTenantPartNumbersDiffResponse from a dict
tenantuserv3_get_tenant_part_numbers_diff_response_from_dict = Tenantuserv3GetTenantPartNumbersDiffResponse.from_dict(tenantuserv3_get_tenant_part_numbers_diff_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


