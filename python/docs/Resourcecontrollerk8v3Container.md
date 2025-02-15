# Resourcecontrollerk8v3Container

Container contains the information about a container image.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | **str** | The container image. | [optional] 
**image_fully_qualified** | **bool** | Optional: Is the container image fully qualified? i.e. it contains the registry in the path. If this value is false, then the image will be assumed to come from the configured registry on the app controller. If unspecified, the value will remain unchanged. | [optional] 
**resources** | [**Resourcecontrollerk8v3ContainerResources**](Resourcecontrollerk8v3ContainerResources.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_container import Resourcecontrollerk8v3Container

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Container from a JSON string
resourcecontrollerk8v3_container_instance = Resourcecontrollerk8v3Container.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Container.to_json())

# convert the object into a dict
resourcecontrollerk8v3_container_dict = resourcecontrollerk8v3_container_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Container from a dict
resourcecontrollerk8v3_container_from_dict = Resourcecontrollerk8v3Container.from_dict(resourcecontrollerk8v3_container_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


