# Resourcecontrollerk8v3TenantLifecycleResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_tenant_lifecycle_response import Resourcecontrollerk8v3TenantLifecycleResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3TenantLifecycleResponse from a JSON string
resourcecontrollerk8v3_tenant_lifecycle_response_instance = Resourcecontrollerk8v3TenantLifecycleResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3TenantLifecycleResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_tenant_lifecycle_response_dict = resourcecontrollerk8v3_tenant_lifecycle_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3TenantLifecycleResponse from a dict
resourcecontrollerk8v3_tenant_lifecycle_response_from_dict = Resourcecontrollerk8v3TenantLifecycleResponse.from_dict(resourcecontrollerk8v3_tenant_lifecycle_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


