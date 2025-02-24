# Resourcecontrollerk8v3InitContainer

InitContainer contains the information about a init container.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **List[str]** | Optional: the initial commands of the container. | [optional] 
**image** | **str** | The container image. | [optional] 
**name** | **str** | The container name, it should be different from other initContainers in the same app. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_init_container import Resourcecontrollerk8v3InitContainer

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3InitContainer from a JSON string
resourcecontrollerk8v3_init_container_instance = Resourcecontrollerk8v3InitContainer.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3InitContainer.to_json())

# convert the object into a dict
resourcecontrollerk8v3_init_container_dict = resourcecontrollerk8v3_init_container_instance.to_dict()
# create an instance of Resourcecontrollerk8v3InitContainer from a dict
resourcecontrollerk8v3_init_container_from_dict = Resourcecontrollerk8v3InitContainer.from_dict(resourcecontrollerk8v3_init_container_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


