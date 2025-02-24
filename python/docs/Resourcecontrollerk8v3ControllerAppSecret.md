# Resourcecontrollerk8v3ControllerAppSecret


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **str** | The date this command was created (ms since epoch). | [optional] 
**id** | **str** | The ID of the secret. | [optional] 
**modified** | **str** | The date this command was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the secret. | [optional] 
**protected** | **bool** | Used to show the secret is encrypted or not in apphost. | [optional] 
**value** | **str** | The value of the secret. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_controller_app_secret import Resourcecontrollerk8v3ControllerAppSecret

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ControllerAppSecret from a JSON string
resourcecontrollerk8v3_controller_app_secret_instance = Resourcecontrollerk8v3ControllerAppSecret.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ControllerAppSecret.to_json())

# convert the object into a dict
resourcecontrollerk8v3_controller_app_secret_dict = resourcecontrollerk8v3_controller_app_secret_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ControllerAppSecret from a dict
resourcecontrollerk8v3_controller_app_secret_from_dict = Resourcecontrollerk8v3ControllerAppSecret.from_dict(resourcecontrollerk8v3_controller_app_secret_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


