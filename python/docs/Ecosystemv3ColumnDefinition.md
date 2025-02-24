# Ecosystemv3ColumnDefinition

ColumnDefinition defines a column in database.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_null** | **bool** | If null is allowed. | [optional] 
**column_id** | **int** | The id of the column. | [optional] 
**column_name** | **str** | The name of the column. | [optional] 
**column_size** | **str** | Data size of the column. | [optional] 
**column_type** | [**Ecosystemv3DataType**](Ecosystemv3DataType.md) |  | [optional] 
**unique** | **bool** | If the column is unique. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_column_definition import Ecosystemv3ColumnDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3ColumnDefinition from a JSON string
ecosystemv3_column_definition_instance = Ecosystemv3ColumnDefinition.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3ColumnDefinition.to_json())

# convert the object into a dict
ecosystemv3_column_definition_dict = ecosystemv3_column_definition_instance.to_dict()
# create an instance of Ecosystemv3ColumnDefinition from a dict
ecosystemv3_column_definition_from_dict = Ecosystemv3ColumnDefinition.from_dict(ecosystemv3_column_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


