# Tenantuserv3PostTenantsResponse

PostTenantsResponse message for POST v3/tenants api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** | Tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_post_tenants_response import Tenantuserv3PostTenantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3PostTenantsResponse from a JSON string
tenantuserv3_post_tenants_response_instance = Tenantuserv3PostTenantsResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3PostTenantsResponse.to_json())

# convert the object into a dict
tenantuserv3_post_tenants_response_dict = tenantuserv3_post_tenants_response_instance.to_dict()
# create an instance of Tenantuserv3PostTenantsResponse from a dict
tenantuserv3_post_tenants_response_from_dict = Tenantuserv3PostTenantsResponse.from_dict(tenantuserv3_post_tenants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


