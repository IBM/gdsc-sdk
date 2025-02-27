# Resourcecontrollerk8v3TenantGUCStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container_status** | **str** |  | [optional] 
**statefulset_state** | [**Resourcecontrollerk8v3GUCStatefulsetState**](Resourcecontrollerk8v3GUCStatefulsetState.md) |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_tenant_guc_status_response import Resourcecontrollerk8v3TenantGUCStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3TenantGUCStatusResponse from a JSON string
resourcecontrollerk8v3_tenant_guc_status_response_instance = Resourcecontrollerk8v3TenantGUCStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3TenantGUCStatusResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_tenant_guc_status_response_dict = resourcecontrollerk8v3_tenant_guc_status_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3TenantGUCStatusResponse from a dict
resourcecontrollerk8v3_tenant_guc_status_response_from_dict = Resourcecontrollerk8v3TenantGUCStatusResponse.from_dict(resourcecontrollerk8v3_tenant_guc_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


