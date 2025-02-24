# Assetsv3PortVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**port_number** | **str** |  | [optional] 
**protocol** | **str** |  | [optional] 
**protocol_version** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_port_vertex import Assetsv3PortVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3PortVertex from a JSON string
assetsv3_port_vertex_instance = Assetsv3PortVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3PortVertex.to_json())

# convert the object into a dict
assetsv3_port_vertex_dict = assetsv3_port_vertex_instance.to_dict()
# create an instance of Assetsv3PortVertex from a dict
assetsv3_port_vertex_from_dict = Assetsv3PortVertex.from_dict(assetsv3_port_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


