# Resourcecontrollerk8v3ContainerResources


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limits** | [**Resourcecontrollerk8v3ContainerResourcesQuantity**](Resourcecontrollerk8v3ContainerResourcesQuantity.md) |  | [optional] 
**requests** | [**Resourcecontrollerk8v3ContainerResourcesQuantity**](Resourcecontrollerk8v3ContainerResourcesQuantity.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_container_resources import Resourcecontrollerk8v3ContainerResources

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3ContainerResources from a JSON string
resourcecontrollerk8v3_container_resources_instance = Resourcecontrollerk8v3ContainerResources.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3ContainerResources.to_json())

# convert the object into a dict
resourcecontrollerk8v3_container_resources_dict = resourcecontrollerk8v3_container_resources_instance.to_dict()
# create an instance of Resourcecontrollerk8v3ContainerResources from a dict
resourcecontrollerk8v3_container_resources_from_dict = Resourcecontrollerk8v3ContainerResources.from_dict(resourcecontrollerk8v3_container_resources_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


