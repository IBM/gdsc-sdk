# Groupbuilderv3NestedGroupMember

NestedGroupMember lists the group members in nested (hierarchical) groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **int** | Group ID. | [optional] 
**name** | **str** | Group member name. | [optional] 
**nested_member_id** | **int** | Group member ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_nested_group_member import Groupbuilderv3NestedGroupMember

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3NestedGroupMember from a JSON string
groupbuilderv3_nested_group_member_instance = Groupbuilderv3NestedGroupMember.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3NestedGroupMember.to_json())

# convert the object into a dict
groupbuilderv3_nested_group_member_dict = groupbuilderv3_nested_group_member_instance.to_dict()
# create an instance of Groupbuilderv3NestedGroupMember from a dict
groupbuilderv3_nested_group_member_from_dict = Groupbuilderv3NestedGroupMember.from_dict(groupbuilderv3_nested_group_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


