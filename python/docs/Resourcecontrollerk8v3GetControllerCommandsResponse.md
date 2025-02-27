# Resourcecontrollerk8v3GetControllerCommandsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commands** | [**List[Resourcecontrollerk8v3ControllerCommand]**](Resourcecontrollerk8v3ControllerCommand.md) | Contains the command information to be executed by a controller. | [optional] 
**controller_id** | **str** | The ID of the controller for the commands. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_get_controller_commands_response import Resourcecontrollerk8v3GetControllerCommandsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3GetControllerCommandsResponse from a JSON string
resourcecontrollerk8v3_get_controller_commands_response_instance = Resourcecontrollerk8v3GetControllerCommandsResponse.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3GetControllerCommandsResponse.to_json())

# convert the object into a dict
resourcecontrollerk8v3_get_controller_commands_response_dict = resourcecontrollerk8v3_get_controller_commands_response_instance.to_dict()
# create an instance of Resourcecontrollerk8v3GetControllerCommandsResponse from a dict
resourcecontrollerk8v3_get_controller_commands_response_from_dict = Resourcecontrollerk8v3GetControllerCommandsResponse.from_dict(resourcecontrollerk8v3_get_controller_commands_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


