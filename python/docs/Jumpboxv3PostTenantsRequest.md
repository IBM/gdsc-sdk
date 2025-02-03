# Jumpboxv3PostTenantsRequest

PostTenantsRequest message for POST v3/tenants api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_async** | **bool** | Async. | [optional] 
**external_id** | **str** | External id. | [optional] 
**external_metadata** | [**Dict[str, Tenantuserv3ExternalMetadata]**](Tenantuserv3ExternalMetadata.md) | External metadata. | [optional] 
**name** | **str** | Tenant name. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**uid** | **str** | Email. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_request import Jumpboxv3PostTenantsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostTenantsRequest from a JSON string
jumpboxv3_post_tenants_request_instance = Jumpboxv3PostTenantsRequest.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostTenantsRequest.to_json())

# convert the object into a dict
jumpboxv3_post_tenants_request_dict = jumpboxv3_post_tenants_request_instance.to_dict()
# create an instance of Jumpboxv3PostTenantsRequest from a dict
jumpboxv3_post_tenants_request_from_dict = Jumpboxv3PostTenantsRequest.from_dict(jumpboxv3_post_tenants_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


