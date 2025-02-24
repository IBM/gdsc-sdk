# Assetsv3HostVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**data_center** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**dns** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**host_ip** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**host_name** | **str** |  | [optional] 
**host_port** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**region** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**state** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_host_vertex import Assetsv3HostVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3HostVertex from a JSON string
assetsv3_host_vertex_instance = Assetsv3HostVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3HostVertex.to_json())

# convert the object into a dict
assetsv3_host_vertex_dict = assetsv3_host_vertex_instance.to_dict()
# create an instance of Assetsv3HostVertex from a dict
assetsv3_host_vertex_from_dict = Assetsv3HostVertex.from_dict(assetsv3_host_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


