# Resourcecontrollerk8v3EdgeTenantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edge_id** | **str** |  | [optional] 
**edge_name** | **str** |  | [optional] 
**edge_version** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**license_type** | **str** |  | [optional] 
**rsyslog** | **str** |  | [optional] 
**size** | **str** |  | [optional] 
**storage_class_name** | **str** |  | [optional] 
**storage_class_name_rwo** | **str** |  | [optional] 
**tenant_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_edge_tenant_request import Resourcecontrollerk8v3EdgeTenantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3EdgeTenantRequest from a JSON string
resourcecontrollerk8v3_edge_tenant_request_instance = Resourcecontrollerk8v3EdgeTenantRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3EdgeTenantRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_edge_tenant_request_dict = resourcecontrollerk8v3_edge_tenant_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3EdgeTenantRequest from a dict
resourcecontrollerk8v3_edge_tenant_request_from_dict = Resourcecontrollerk8v3EdgeTenantRequest.from_dict(resourcecontrollerk8v3_edge_tenant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


