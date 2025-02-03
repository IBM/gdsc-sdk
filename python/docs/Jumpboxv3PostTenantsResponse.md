# Jumpboxv3PostTenantsResponse

PostTenantsResponse message for POST v3/tenants api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** | Tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.jumpboxv3_post_tenants_response import Jumpboxv3PostTenantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3PostTenantsResponse from a JSON string
jumpboxv3_post_tenants_response_instance = Jumpboxv3PostTenantsResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3PostTenantsResponse.to_json())

# convert the object into a dict
jumpboxv3_post_tenants_response_dict = jumpboxv3_post_tenants_response_instance.to_dict()
# create an instance of Jumpboxv3PostTenantsResponse from a dict
jumpboxv3_post_tenants_response_from_dict = Jumpboxv3PostTenantsResponse.from_dict(jumpboxv3_post_tenants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


