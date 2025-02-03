# Assetsv3ResourcesVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_date** | **datetime** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**location** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**resources_account** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**sensitivities** | [**List[Assetsv3SensitivityInfo]**](Assetsv3SensitivityInfo.md) |  | [optional] 
**size** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_resources_vertex import Assetsv3ResourcesVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ResourcesVertex from a JSON string
assetsv3_resources_vertex_instance = Assetsv3ResourcesVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ResourcesVertex.to_json())

# convert the object into a dict
assetsv3_resources_vertex_dict = assetsv3_resources_vertex_instance.to_dict()
# create an instance of Assetsv3ResourcesVertex from a dict
assetsv3_resources_vertex_from_dict = Assetsv3ResourcesVertex.from_dict(assetsv3_resources_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


