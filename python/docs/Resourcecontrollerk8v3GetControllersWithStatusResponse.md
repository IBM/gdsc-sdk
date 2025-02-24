# Resourcecontrollerk8v3GetControllersWithStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controllers** | [**List[Resourcecontrollerk8v3Controller]**](Resourcecontrollerk8v3Controller.md) | The controllers for the tenant. | [optional] 
**status_count** | **Dict[str, str]** |  | [optional] 
**tenant_id** | **str** | The internal ID of the tenant the controllers are for. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controllers_with_status_response import Resourcecontrollerk8v3GetControllersWithStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetControllersWithStatusResponse from a JSON string
resourcecontrollerk8v3_get_controllers_with_status_response_instance = Resourcecontrollerk8v3GetControllersWithStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetControllersWithStatusResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_controllers_with_status_response_dict = resourcecontrollerk8v3_get_controllers_with_status_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetControllersWithStatusResponse from a dict
resourcecontrollerk8v3_get_controllers_with_status_response_from_dict = Resourcecontrollerk8v3GetControllersWithStatusResponse.from_dict(resourcecontrollerk8v3_get_controllers_with_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


