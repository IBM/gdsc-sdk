# Jumpboxv3GetTenantsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenants** | [**List[Jumpboxv3Tenant]**](Jumpboxv3Tenant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_get_tenants_response import Jumpboxv3GetTenantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3GetTenantsResponse from a JSON string
jumpboxv3_get_tenants_response_instance = Jumpboxv3GetTenantsResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3GetTenantsResponse.to_json())

# convert the object into a dict
jumpboxv3_get_tenants_response_dict = jumpboxv3_get_tenants_response_instance.to_dict()
# create an instance of Jumpboxv3GetTenantsResponse from a dict
jumpboxv3_get_tenants_response_from_dict = Jumpboxv3GetTenantsResponse.from_dict(jumpboxv3_get_tenants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


