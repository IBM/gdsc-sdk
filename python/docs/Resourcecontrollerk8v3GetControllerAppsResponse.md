# Resourcecontrollerk8v3GetControllerAppsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apps** | [**List[Resourcecontrollerk8v3ControllerApp]**](Resourcecontrollerk8v3ControllerApp.md) | The apps for the controller. | [optional] 
**controller_id** | **str** | The internal ID of the controller. | [optional] 
**modified** | **str** | The last modified date of the controller apps (ms since epoch). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controller_apps_response import Resourcecontrollerk8v3GetControllerAppsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetControllerAppsResponse from a JSON string
resourcecontrollerk8v3_get_controller_apps_response_instance = Resourcecontrollerk8v3GetControllerAppsResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetControllerAppsResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_controller_apps_response_dict = resourcecontrollerk8v3_get_controller_apps_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetControllerAppsResponse from a dict
resourcecontrollerk8v3_get_controller_apps_response_from_dict = Resourcecontrollerk8v3GetControllerAppsResponse.from_dict(resourcecontrollerk8v3_get_controller_apps_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


