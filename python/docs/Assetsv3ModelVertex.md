# Assetsv3ModelVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] [default to Assetsv3Level.LEVEL_UNKNOWN]
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**has_training_data** | **bool** |  | [optional] 
**last_trained** | **datetime** |  | [optional] 
**model_application** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**model_deployment** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**model_id** | **str** |  | [optional] 
**model_name** | **str** |  | [optional] 
**model_resources** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**model_sub_type** | **str** |  | [optional] 
**model_type** | **str** |  | [optional] 
**publisher** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] [default to Assetsv3Level.LEVEL_UNKNOWN]
**version** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_model_vertex import Assetsv3ModelVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ModelVertex from a JSON string
assetsv3_model_vertex_instance = Assetsv3ModelVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ModelVertex.to_json())

# convert the object into a dict
assetsv3_model_vertex_dict = assetsv3_model_vertex_instance.to_dict()
# create an instance of Assetsv3ModelVertex from a dict
assetsv3_model_vertex_from_dict = Assetsv3ModelVertex.from_dict(assetsv3_model_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


