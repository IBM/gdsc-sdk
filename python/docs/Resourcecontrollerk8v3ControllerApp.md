# Resourcecontrollerk8v3ControllerApp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | [**Resourcecontrollerk8v3Container**](Resourcecontrollerk8v3Container.md) |  | [optional] 
**deployment** | [**Resourcecontrollerk8v3AppDeployment**](Resourcecontrollerk8v3AppDeployment.md) |  | [optional] 
**empty_dir** | **str** |  | [optional] 
**files** | [**List[Resourcecontrollerk8v3ControllerAppFile]**](Resourcecontrollerk8v3ControllerAppFile.md) |  | [optional] 
**hpa** | [**Resourcecontrollerk8v3AppHpa**](Resourcecontrollerk8v3AppHpa.md) |  | [optional] 
**id** | **str** | The internal ID of the app. | [optional] 
**init_containers** | [**List[Resourcecontrollerk8v3InitContainer]**](Resourcecontrollerk8v3InitContainer.md) |  | [optional] 
**modified** | **str** | The date this app was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the app. | [optional] 
**secret_key** | **str** |  | [optional] 
**secrets** | [**List[Resourcecontrollerk8v3ControllerAppSecret]**](Resourcecontrollerk8v3ControllerAppSecret.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_app import Resourcecontrollerk8v3ControllerApp

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerApp from a JSON string
resourcecontrollerk8v3_controller_app_instance = Resourcecontrollerk8v3ControllerApp.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerApp.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_app_dict = resourcecontrollerk8v3_controller_app_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerApp from a dict
resourcecontrollerk8v3_controller_app_from_dict = Resourcecontrollerk8v3ControllerApp.from_dict(resourcecontrollerk8v3_controller_app_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


