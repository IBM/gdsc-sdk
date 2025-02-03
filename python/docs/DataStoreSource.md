# DataStoreSource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.data_store_source import DataStoreSource

# TODO update the JSON string below
json = "{}"
# create an instance of DataStoreSource from a JSON string
data_store_source_instance = DataStoreSource.from_json(json)
# print the JSON string representation of the object
print(DataStoreSource.to_json())

# convert the object into a dict
data_store_source_dict = data_store_source_instance.to_dict()
# create an instance of DataStoreSource from a dict
data_store_source_from_dict = DataStoreSource.from_dict(data_store_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


