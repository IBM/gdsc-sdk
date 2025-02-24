# Tenantuserv3Tenant

Tenant contains id, name, and settings for the specified tenant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_date** | **datetime** | Date tenant was activated. | [optional] 
**external_id** | **str** | Extrenal id. | [optional] 
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**is_inactive** | **bool** | Whether or not the tenant is disabled. | [optional] 
**is_ready** | **bool** | Boolean is ready. | [optional] 
**name** | **str** |  | [optional] 
**part_number** | **str** | Part number. | [optional] 
**settings** | **Dict[str, str]** | Settings pertaining to all users of this tenant. | [optional] 
**tenant_capabilities** | **Dict[str, bool]** |  | [optional] 
**tenant_id** | **str** | The unique id for the tenant object. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_tenant import Tenantuserv3Tenant

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3Tenant from a JSON string
tenantuserv3_tenant_instance = Tenantuserv3Tenant.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3Tenant.to_json())

# convert the object into a dict
tenantuserv3_tenant_dict = tenantuserv3_tenant_instance.to_dict()
# create an instance of Tenantuserv3Tenant from a dict
tenantuserv3_tenant_from_dict = Tenantuserv3Tenant.from_dict(tenantuserv3_tenant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


