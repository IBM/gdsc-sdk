# Resourcecontrollerk8v3Version

Version contains the version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**build** | **str** | Optional: The build number. This value is read-only. | [optional] 
**major** | **str** | Optional: The major version. This value is read-only. | [optional] 
**micro** | **str** | Optional: The micro version. This value is read-only. | [optional] 
**minor** | **str** | Optional: The minor version. This value is read-only. | [optional] 
**version** | **str** | Optional: The string representation of the version. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_version import Resourcecontrollerk8v3Version

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Version from a JSON string
resourcecontrollerk8v3_version_instance = Resourcecontrollerk8v3Version.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Version.to_json())

# convert the object into a dict
resourcecontrollerk8v3_version_dict = resourcecontrollerk8v3_version_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Version from a dict
resourcecontrollerk8v3_version_from_dict = Resourcecontrollerk8v3Version.from_dict(resourcecontrollerk8v3_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


