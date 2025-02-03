# Reportsv3JoinDefinition

JoinDefinition encapsulates all data necessary for a join object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **str** |  | [optional] 
**header_pair_list** | [**List[Reportsv3HeaderPair]**](Reportsv3HeaderPair.md) |  | [optional] 
**source_table_name** | **str** |  | [optional] 
**target_headers_selected_ids** | **List[str]** |  | [optional] 
**target_table_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_join_definition import Reportsv3JoinDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3JoinDefinition from a JSON string
reportsv3_join_definition_instance = Reportsv3JoinDefinition.from_json(json)
# print the JSON string representation of the object
print(Reportsv3JoinDefinition.to_json())

# convert the object into a dict
reportsv3_join_definition_dict = reportsv3_join_definition_instance.to_dict()
# create an instance of Reportsv3JoinDefinition from a dict
reportsv3_join_definition_from_dict = Reportsv3JoinDefinition.from_dict(reportsv3_join_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


