# Reportsv3JoinDefinitionWithID

Includes join definition properties and join id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **str** |  | [optional] 
**header_pair_list** | [**List[Reportsv3HeaderPair]**](Reportsv3HeaderPair.md) |  | [optional] 
**join_id** | **str** | Unique join ID. | [optional] 
**source_table_name** | **str** |  | [optional] 
**target_headers_selected_ids** | **List[str]** |  | [optional] 
**target_table_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_join_definition_with_id import Reportsv3JoinDefinitionWithID

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3JoinDefinitionWithID from a JSON string
reportsv3_join_definition_with_id_instance = Reportsv3JoinDefinitionWithID.from_json(json)
# print the JSON string representation of the object
print(Reportsv3JoinDefinitionWithID.to_json())

# convert the object into a dict
reportsv3_join_definition_with_id_dict = reportsv3_join_definition_with_id_instance.to_dict()
# create an instance of Reportsv3JoinDefinitionWithID from a dict
reportsv3_join_definition_with_id_from_dict = Reportsv3JoinDefinitionWithID.from_dict(reportsv3_join_definition_with_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


