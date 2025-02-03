# Assetsv3IPVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**data_center** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**dns** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**ip_address** | **str** |  | [optional] 
**ip_port** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**mac_address** | **str** |  | [optional] 
**region** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_ip_vertex import Assetsv3IPVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3IPVertex from a JSON string
assetsv3_ip_vertex_instance = Assetsv3IPVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3IPVertex.to_json())

# convert the object into a dict
assetsv3_ip_vertex_dict = assetsv3_ip_vertex_instance.to_dict()
# create an instance of Assetsv3IPVertex from a dict
assetsv3_ip_vertex_from_dict = Assetsv3IPVertex.from_dict(assetsv3_ip_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


