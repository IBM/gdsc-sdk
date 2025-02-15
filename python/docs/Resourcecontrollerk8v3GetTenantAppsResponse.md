# Resourcecontrollerk8v3GetTenantAppsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apps** | [**List[Resourcecontrollerk8v3App]**](Resourcecontrollerk8v3App.md) | The apps for the tenant. | [optional] 
**tenant_id** | **str** | The internal ID of the tenant the apps are for. | [optional] 
**tenant_uuid** | **str** | The uuid of the tenant to get jobs for. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_get_tenant_apps_response import Resourcecontrollerk8v3GetTenantAppsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetTenantAppsResponse from a JSON string
resourcecontrollerk8v3_get_tenant_apps_response_instance = Resourcecontrollerk8v3GetTenantAppsResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetTenantAppsResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_tenant_apps_response_dict = resourcecontrollerk8v3_get_tenant_apps_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetTenantAppsResponse from a dict
resourcecontrollerk8v3_get_tenant_apps_response_from_dict = Resourcecontrollerk8v3GetTenantAppsResponse.from_dict(resourcecontrollerk8v3_get_tenant_apps_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


