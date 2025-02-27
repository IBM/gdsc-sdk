# Tenantuserv3GetTenantsResponse

GetTenantsResponse message for GET v3/tenants api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenants** | [**List[Tenantuserv3Tenant]**](Tenantuserv3Tenant.md) | List of tenants. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_get_tenants_response import Tenantuserv3GetTenantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3GetTenantsResponse from a JSON string
tenantuserv3_get_tenants_response_instance = Tenantuserv3GetTenantsResponse.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3GetTenantsResponse.to_json())

# convert the object into a dict
tenantuserv3_get_tenants_response_dict = tenantuserv3_get_tenants_response_instance.to_dict()
# create an instance of Tenantuserv3GetTenantsResponse from a dict
tenantuserv3_get_tenants_response_from_dict = Tenantuserv3GetTenantsResponse.from_dict(tenantuserv3_get_tenants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


