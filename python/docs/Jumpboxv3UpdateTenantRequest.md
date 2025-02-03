# Jumpboxv3UpdateTenantRequest

UpdateTenantRequest message for PUT v3/tenants/{tenant_id} api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**is_inactive** | **bool** | Is inactive. | [optional] 
**is_ready** | **bool** | Is ready. | [optional] 
**name** | **str** | Name. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**tenant_id** | **str** | Tenant id. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_update_tenant_request import Jumpboxv3UpdateTenantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3UpdateTenantRequest from a JSON string
jumpboxv3_update_tenant_request_instance = Jumpboxv3UpdateTenantRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3UpdateTenantRequest.to_json())

# convert the object into a dict
jumpboxv3_update_tenant_request_dict = jumpboxv3_update_tenant_request_instance.to_dict()
# create an instance of Jumpboxv3UpdateTenantRequest from a dict
jumpboxv3_update_tenant_request_from_dict = Jumpboxv3UpdateTenantRequest.from_dict(jumpboxv3_update_tenant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


