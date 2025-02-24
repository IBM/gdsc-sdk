# Assetsv3StorageVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**criticality** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**data_center** | **str** |  | [optional] 
**dns** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**folder_path** | **str** |  | [optional] 
**owner** | **List[str]** |  | [optional] 
**region** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**risk_level** | [**Assetsv3Level**](Assetsv3Level.md) |  | [optional] 
**size** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**storage_account** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**storage_host** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**storage_id** | **str** |  | [optional] 
**storage_ip** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**storage_name** | **str** |  | [optional] 
**storage_resources** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**storage_sub_type** | **str** |  | [optional] 
**storage_subscription** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**storage_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_storage_vertex import Assetsv3StorageVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3StorageVertex from a JSON string
assetsv3_storage_vertex_instance = Assetsv3StorageVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3StorageVertex.to_json())

# convert the object into a dict
assetsv3_storage_vertex_dict = assetsv3_storage_vertex_instance.to_dict()
# create an instance of Assetsv3StorageVertex from a dict
assetsv3_storage_vertex_from_dict = Assetsv3StorageVertex.from_dict(assetsv3_storage_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


