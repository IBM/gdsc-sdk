# Assetsv3DatabaseVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog** | **str** |  | [optional] 
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**database_host** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**database_ip** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**database_name** | **str** |  | [optional] 
**database_sub_type** | **str** |  | [optional] 
**database_subscription** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**database_type** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**owner** | **List[str]** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**schema_name** | **str** |  | [optional] 
**service_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_database_vertex import Assetsv3DatabaseVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3DatabaseVertex from a JSON string
assetsv3_database_vertex_instance = Assetsv3DatabaseVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3DatabaseVertex.to_json())

# convert the object into a dict
assetsv3_database_vertex_dict = assetsv3_database_vertex_instance.to_dict()
# create an instance of Assetsv3DatabaseVertex from a dict
assetsv3_database_vertex_from_dict = Assetsv3DatabaseVertex.from_dict(assetsv3_database_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


