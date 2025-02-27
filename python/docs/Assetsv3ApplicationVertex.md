# Assetsv3ApplicationVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** |  | [optional] 
**application_database** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_endpoint** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_host** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_ip** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_name** | **str** |  | [optional] 
**application_storage** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_sub_type** | **str** |  | [optional] 
**application_subscription** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**application_type** | **str** |  | [optional] 
**category** | **str** |  | [optional] 
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**last_used** | **datetime** |  | [optional] 
**owner** | **List[str]** |  | [optional] 
**parent_application** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**service_type** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_application_vertex import Assetsv3ApplicationVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ApplicationVertex from a JSON string
assetsv3_application_vertex_instance = Assetsv3ApplicationVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ApplicationVertex.to_json())

# convert the object into a dict
assetsv3_application_vertex_dict = assetsv3_application_vertex_instance.to_dict()
# create an instance of Assetsv3ApplicationVertex from a dict
assetsv3_application_vertex_from_dict = Assetsv3ApplicationVertex.from_dict(assetsv3_application_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


