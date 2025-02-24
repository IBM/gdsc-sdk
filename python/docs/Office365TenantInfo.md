# Office365TenantInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_id** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.office365_tenant_info import Office365TenantInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Office365TenantInfo from a JSON string
office365_tenant_info_instance = Office365TenantInfo.from_json(json)
# print the JSON string representation of the object
print(Office365TenantInfo.to_json())

# convert the object into a dict
office365_tenant_info_dict = office365_tenant_info_instance.to_dict()
# create an instance of Office365TenantInfo from a dict
office365_tenant_info_from_dict = Office365TenantInfo.from_dict(office365_tenant_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


