# DataResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_resource_id** | **str** |  | 
**data_resource_name** | **str** |  | 
**data_store_id** | **str** |  | 
**data_resource_type** | **str** |  | 
**data_resource_owner** | **str** |  | [optional] 
**size_in_bytes** | **float** |  | [optional] 
**size_formatted** | **str** |  | [optional] 
**creation_time** | **str** |  | [optional] 
**modification_time** | **str** |  | [optional] 
**is_reviewed** | **bool** |  | [optional] 
**link** | **str** |  | [optional] 
**stats** | [**DataResourceStats**](DataResourceStats.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.data_resource import DataResource

# TODO update the JSON string below
json = "{}"
# create an instance of DataResource from a JSON string
data_resource_instance = DataResource.from_json(json)
# print the JSON string representation of the object
print(DataResource.to_json())

# convert the object into a dict
data_resource_dict = data_resource_instance.to_dict()
# create an instance of DataResource from a dict
data_resource_from_dict = DataResource.from_dict(data_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


