# Groupbuilderv3GroupType

GroupType provides information about available group types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_type_id** | **int** | Group type ID. | [optional] 
**name** | **str** | Group type name. | [optional] 
**tuple_count** | **int** | Type tuples count. | [optional] 
**tuple_params** | **List[str]** | Tuple parameters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_group_type import Groupbuilderv3GroupType

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GroupType from a JSON string
groupbuilderv3_group_type_instance = Groupbuilderv3GroupType.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GroupType.to_json())

# convert the object into a dict
groupbuilderv3_group_type_dict = groupbuilderv3_group_type_instance.to_dict()
# create an instance of Groupbuilderv3GroupType from a dict
groupbuilderv3_group_type_from_dict = Groupbuilderv3GroupType.from_dict(groupbuilderv3_group_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


