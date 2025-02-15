# Resourcecontrollerk8v3Secret

Secret contains the information about a secret.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **str** | Optional: The date this secret was created (ms since epoch). | [optional] 
**id** | **str** | Optional:  The ID of the secret. | [optional] 
**modified** | **str** | Optional: The date this secret was modified (ms since epoch). | [optional] 
**name** | **str** | The name of the secret. Must be a valid name of an environment variable. | [optional] 
**protected** | **bool** | Optional: Used to show the secret is encrypted or not in workload pod. | [optional] 
**value** | **str** | The value of the secret. This value is write-only and will never be returned. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_secret import Resourcecontrollerk8v3Secret

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Secret from a JSON string
resourcecontrollerk8v3_secret_instance = Resourcecontrollerk8v3Secret.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Secret.to_json())

# convert the object into a dict
resourcecontrollerk8v3_secret_dict = resourcecontrollerk8v3_secret_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Secret from a dict
resourcecontrollerk8v3_secret_from_dict = Resourcecontrollerk8v3Secret.from_dict(resourcecontrollerk8v3_secret_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


