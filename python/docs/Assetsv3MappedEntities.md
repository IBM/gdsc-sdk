# Assetsv3MappedEntities

MappedEntities - Entity details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**Assetsv3Attributes**](Assetsv3Attributes.md) |  | [optional] 
**children** | [**List[Assetsv3MappedEntities]**](Assetsv3MappedEntities.md) |  | [optional] 
**name** | **str** |  | [optional] 
**parent_child_count** | **str** |  | [optional] 
**search_term** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_mapped_entities import Assetsv3MappedEntities

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3MappedEntities from a JSON string
assetsv3_mapped_entities_instance = Assetsv3MappedEntities.from_json(json)
# print the JSON string representation of the object
print(Assetsv3MappedEntities.to_json())

# convert the object into a dict
assetsv3_mapped_entities_dict = assetsv3_mapped_entities_instance.to_dict()
# create an instance of Assetsv3MappedEntities from a dict
assetsv3_mapped_entities_from_dict = Assetsv3MappedEntities.from_dict(assetsv3_mapped_entities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


