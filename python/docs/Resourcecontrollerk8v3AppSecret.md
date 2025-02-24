# Resourcecontrollerk8v3AppSecret

AppSecret contains the information about an app secret.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** | Optional: The app ID. | [optional] 
**created** | **str** | Optional: The date this secret was created (ms since epoch). | [optional] 
**id** | **str** | Optional: The ID of the secret. | [optional] 
**modified** | **str** | Optional: The date this secret was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the secret. Must be a valid name of an environment variable. | [optional] 
**protected** | **bool** | Optional: Used to show the secret is encrypted or not in apphost. | [optional] 
**value** | **str** | The value of the secret. This value is write-only and will never be returned. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_app_secret import Resourcecontrollerk8v3AppSecret

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3AppSecret from a JSON string
resourcecontrollerk8v3_app_secret_instance = Resourcecontrollerk8v3AppSecret.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3AppSecret.to_json())

# convert the object into a dict
resourcecontrollerk8v3_app_secret_dict = resourcecontrollerk8v3_app_secret_instance.to_dict()
# create an instance of Resourcecontrollerk8v3AppSecret from a dict
resourcecontrollerk8v3_app_secret_from_dict = Resourcecontrollerk8v3AppSecret.from_dict(resourcecontrollerk8v3_app_secret_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


