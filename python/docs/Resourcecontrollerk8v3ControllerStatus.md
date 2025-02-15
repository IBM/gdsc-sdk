# Resourcecontrollerk8v3ControllerStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The internal ID of the controller. | [optional] 
**modified** | **str** | The date this controller was modified (ms since epoch). | [optional] 
**status** | **str** | The status of the controller. Currently supported values are unpaired, paired, uninstalling. | [optional] 
**version** | [**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_controller_status import Resourcecontrollerk8v3ControllerStatus

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerStatus from a JSON string
resourcecontrollerk8v3_controller_status_instance = Resourcecontrollerk8v3ControllerStatus.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerStatus.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_status_dict = resourcecontrollerk8v3_controller_status_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerStatus from a dict
resourcecontrollerk8v3_controller_status_from_dict = Resourcecontrollerk8v3ControllerStatus.from_dict(resourcecontrollerk8v3_controller_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


