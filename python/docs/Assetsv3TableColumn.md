# Assetsv3TableColumn


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default** | **bool** |  | [optional] 
**default_order** | **int** |  | [optional] 
**fixed** | **bool** |  | [optional] 
**header** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**nls_key** | **str** |  | [optional] 
**select** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_table_column import Assetsv3TableColumn

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TableColumn from a JSON string
assetsv3_table_column_instance = Assetsv3TableColumn.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TableColumn.to_json())

# convert the object into a dict
assetsv3_table_column_dict = assetsv3_table_column_instance.to_dict()
# create an instance of Assetsv3TableColumn from a dict
assetsv3_table_column_from_dict = Assetsv3TableColumn.from_dict(assetsv3_table_column_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


