# Resourcecontrollerk8v3ContainerResourcesQuantity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpu** | **str** |  | [optional] 
**memory** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_container_resources_quantity import Resourcecontrollerk8v3ContainerResourcesQuantity

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ContainerResourcesQuantity from a JSON string
resourcecontrollerk8v3_container_resources_quantity_instance = Resourcecontrollerk8v3ContainerResourcesQuantity.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ContainerResourcesQuantity.to_json())

# convert the object into a dict
resourcecontrollerk8v3_container_resources_quantity_dict = resourcecontrollerk8v3_container_resources_quantity_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ContainerResourcesQuantity from a dict
resourcecontrollerk8v3_container_resources_quantity_from_dict = Resourcecontrollerk8v3ContainerResourcesQuantity.from_dict(resourcecontrollerk8v3_container_resources_quantity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


