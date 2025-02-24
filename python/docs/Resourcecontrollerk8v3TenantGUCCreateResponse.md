# Resourcecontrollerk8v3TenantGUCCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**route_fqdn** | **str** |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_tenant_guc_create_response import Resourcecontrollerk8v3TenantGUCCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3TenantGUCCreateResponse from a JSON string
resourcecontrollerk8v3_tenant_guc_create_response_instance = Resourcecontrollerk8v3TenantGUCCreateResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3TenantGUCCreateResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_tenant_guc_create_response_dict = resourcecontrollerk8v3_tenant_guc_create_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3TenantGUCCreateResponse from a dict
resourcecontrollerk8v3_tenant_guc_create_response_from_dict = Resourcecontrollerk8v3TenantGUCCreateResponse.from_dict(resourcecontrollerk8v3_tenant_guc_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


