# Resourcecontrollerk8v3ControllerHeartbeat

ControllerHeartbeat Contains the information about a controller heartbeat.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **Dict[str, bool]** |  | [optional] 
**controller_id** | **str** |  | [optional] 
**controller_version** | [**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md) |  | [optional] 
**resources** | [**Resourcecontrollerk8v3ControllerResources**](Resourcecontrollerk8v3ControllerResources.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_heartbeat import Resourcecontrollerk8v3ControllerHeartbeat

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerHeartbeat from a JSON string
resourcecontrollerk8v3_controller_heartbeat_instance = Resourcecontrollerk8v3ControllerHeartbeat.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerHeartbeat.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_heartbeat_dict = resourcecontrollerk8v3_controller_heartbeat_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerHeartbeat from a dict
resourcecontrollerk8v3_controller_heartbeat_from_dict = Resourcecontrollerk8v3ControllerHeartbeat.from_dict(resourcecontrollerk8v3_controller_heartbeat_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


