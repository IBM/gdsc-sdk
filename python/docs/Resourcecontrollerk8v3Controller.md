# Resourcecontrollerk8v3Controller

Controller contains the information about a controller.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_ids** | **List[str]** | Optional: The list of internal IDs of the apps for the controller. | [optional] 
**apps** | [**List[Resourcecontrollerk8v3App]**](Resourcecontrollerk8v3App.md) | Optional: The controller&#39;s apps. | [optional] 
**capability** | **Dict[str, bool]** | Optional: The controller capability like protected secret. If absence, app manager assumes all capabilities are false. | [optional] 
**created** | **str** | Optional: The date this controller was created (ms since epoch). | [optional] 
**description** | [**Resourcecontrollerk8v3TextContent**](Resourcecontrollerk8v3TextContent.md) |  | [optional] 
**id** | **str** | Optional: The internal ID of the controller. | [optional] 
**keypair** | [**Resourcecontrollerk8v3KeyPair**](Resourcecontrollerk8v3KeyPair.md) |  | [optional] 
**last_heartbeat** | **str** | Optional: The last date when a heartbeat was applied to this controller (ms since epoch). | [optional] 
**local** | **bool** | Is the controller \\\&quot;local\\\&quot;? \\\&quot;Local\\\&quot; controllers may not be unpaired, removed, or renewed. | [optional] 
**modified** | **str** | Optional: The date this controller was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the controller. | [optional] 
**resources** | [**Resourcecontrollerk8v3ControllerResources**](Resourcecontrollerk8v3ControllerResources.md) |  | [optional] 
**since_last_heartbeat** | **str** | Optional: The number of ms since the last heartbeat. | [optional] 
**status** | **str** | Optional: The status of the controller. Currently supported values are unpaired, paired, uninstalling. | [optional] 
**tenant_id** | **str** | Optional: The tenant id for the controller. | [optional] 
**tenant_uuid** | **str** | Optional: The internal ID of the tenant for the controller. | [optional] 
**version** | [**Resourcecontrollerk8v3Version**](Resourcecontrollerk8v3Version.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller import Resourcecontrollerk8v3Controller

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Controller from a JSON string
resourcecontrollerk8v3_controller_instance = Resourcecontrollerk8v3Controller.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Controller.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_dict = resourcecontrollerk8v3_controller_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Controller from a dict
resourcecontrollerk8v3_controller_from_dict = Resourcecontrollerk8v3Controller.from_dict(resourcecontrollerk8v3_controller_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


