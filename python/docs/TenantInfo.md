# TenantInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenant_info import TenantInfo

# TODO update the JSON string below
json = "{}"
# create an instance of TenantInfo from a JSON string
tenant_info_instance = TenantInfo.from_json(json)
# print the JSON string representation of the object
print(TenantInfo.to_json())

# convert the object into a dict
tenant_info_dict = tenant_info_instance.to_dict()
# create an instance of TenantInfo from a dict
tenant_info_from_dict = TenantInfo.from_dict(tenant_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


