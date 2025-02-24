# Jumpboxv3UpdateTenantResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.jumpboxv3_update_tenant_response import Jumpboxv3UpdateTenantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Jumpboxv3UpdateTenantResponse from a JSON string
jumpboxv3_update_tenant_response_instance = Jumpboxv3UpdateTenantResponse.from_json(json)
# print the JSON string representation of the object
print(Jumpboxv3UpdateTenantResponse.to_json())

# convert the object into a dict
jumpboxv3_update_tenant_response_dict = jumpboxv3_update_tenant_response_instance.to_dict()
# create an instance of Jumpboxv3UpdateTenantResponse from a dict
jumpboxv3_update_tenant_response_from_dict = Jumpboxv3UpdateTenantResponse.from_dict(jumpboxv3_update_tenant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


