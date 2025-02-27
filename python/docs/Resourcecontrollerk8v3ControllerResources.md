# Resourcecontrollerk8v3ControllerResources

ControllerResources contains the information about a controller's resources.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocatable** | **Dict[str, str]** | The allocatable resources for the controller. | [optional] 
**node** | **str** | The node where the controller is. | [optional] 
**timestamp** | **str** | The date this controller resource was queried. | [optional] 
**usage** | **Dict[str, str]** | The CPU and memory usage. | [optional] 
**window** | **str** | The duration this controller resource was collected (in seconds). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_resources import Resourcecontrollerk8v3ControllerResources

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerResources from a JSON string
resourcecontrollerk8v3_controller_resources_instance = Resourcecontrollerk8v3ControllerResources.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerResources.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_resources_dict = resourcecontrollerk8v3_controller_resources_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerResources from a dict
resourcecontrollerk8v3_controller_resources_from_dict = Resourcecontrollerk8v3ControllerResources.from_dict(resourcecontrollerk8v3_controller_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


