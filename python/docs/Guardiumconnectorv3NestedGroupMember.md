# Guardiumconnectorv3NestedGroupMember

List the group members in nested (heirarchical) groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Group member name. | [optional] 
**group_id** | **int** | Group ID. | [optional] 
**member_id** | **int** | Group member ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_nested_group_member import Guardiumconnectorv3NestedGroupMember

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3NestedGroupMember from a JSON string
guardiumconnectorv3_nested_group_member_instance = Guardiumconnectorv3NestedGroupMember.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3NestedGroupMember.to_json())

# convert the object into a dict
guardiumconnectorv3_nested_group_member_dict = guardiumconnectorv3_nested_group_member_instance.to_dict()
# create an instance of Guardiumconnectorv3NestedGroupMember from a dict
guardiumconnectorv3_nested_group_member_from_dict = Guardiumconnectorv3NestedGroupMember.from_dict(guardiumconnectorv3_nested_group_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


