# Assetsv3EndpointVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] [default to Assetsv3Level.LEVEL_UNKNOWN]
**endpoint_host** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**endpoint_ip** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**endpoint_name** | **str** |  | [optional] 
**endpoint_sub_type** | **str** |  | [optional] 
**endpoint_type** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**is_access_url** | **bool** | to check if this entry is for access url. Used as an access url for application. | [optional] 
**os** | **str** |  | [optional] 
**owner** | **List[str]** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] [default to Assetsv3Level.LEVEL_UNKNOWN]

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_endpoint_vertex import Assetsv3EndpointVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3EndpointVertex from a JSON string
assetsv3_endpoint_vertex_instance = Assetsv3EndpointVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3EndpointVertex.to_json())

# convert the object into a dict
assetsv3_endpoint_vertex_dict = assetsv3_endpoint_vertex_instance.to_dict()
# create an instance of Assetsv3EndpointVertex from a dict
assetsv3_endpoint_vertex_from_dict = Assetsv3EndpointVertex.from_dict(assetsv3_endpoint_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


