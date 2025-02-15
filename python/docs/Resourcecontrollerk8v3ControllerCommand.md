# Resourcecontrollerk8v3ControllerCommand

Contains the command information to be executed by a controller.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **object** | The command arguments. | [optional] 
**created** | **str** | The date this command was created (ms since epoch). | [optional] 
**id** | **str** | The ID of the command. | [optional] 
**modified** | **str** | The date this command was modified (ms since epoch). | [optional] 
**result** | **str** | The result of the command. This value is write-only and can only be written once. | [optional] 
**status** | **str** | The status of the command. The current valid values are pending, success, error. | [optional] 
**type** | **str** | The type of command. The current valid values are get_app_logs. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_controller_command import Resourcecontrollerk8v3ControllerCommand

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerCommand from a JSON string
resourcecontrollerk8v3_controller_command_instance = Resourcecontrollerk8v3ControllerCommand.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerCommand.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_command_dict = resourcecontrollerk8v3_controller_command_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerCommand from a dict
resourcecontrollerk8v3_controller_command_from_dict = Resourcecontrollerk8v3ControllerCommand.from_dict(resourcecontrollerk8v3_controller_command_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


