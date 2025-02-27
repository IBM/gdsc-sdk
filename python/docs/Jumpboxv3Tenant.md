# Jumpboxv3Tenant

Tenant contains id, name, and settings for the specified tenant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | **datetime** | Date tenant was activated. | [optional] 
**external_id** | **str** | Extrenal id. | [optional] 
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**is_inactive** | **bool** | Whether or not the tenant is disabled. | [optional] 
**is_ready** | **bool** | Boolean is ready. | [optional] 
**name** | **str** | The descriptive name. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**settings** | **Dict[str, str]** | Settings pertaining to all users of this tenant. | [optional] 
**tenant_capabilities** | **Dict[str, bool]** |  | [optional] 
**tenant_id** | **str** | The unique id for the tenant object. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_tenant import Jumpboxv3Tenant

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3Tenant from a JSON string
jumpboxv3_tenant_instance = Jumpboxv3Tenant.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3Tenant.to_json())

# convert the object into a dict
jumpboxv3_tenant_dict = jumpboxv3_tenant_instance.to_dict()
# create an instance of Jumpboxv3Tenant from a dict
jumpboxv3_tenant_from_dict = Jumpboxv3Tenant.from_dict(jumpboxv3_tenant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


