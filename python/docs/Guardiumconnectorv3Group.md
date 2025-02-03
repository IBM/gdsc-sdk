# Guardiumconnectorv3Group

Return details about the groups defined on a Guardium system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **str** | Application associated with the group. | [optional] 
**description** | **str** | Group name. | [optional] 
**group_id** | **int** | Group ID. | [optional] 
**group_type_id** | **int** | Group type ID. | [optional] 
**hierarchical** | **bool** | Group is nested (hierarchical). | [optional] 
**member_count** | **int** | Number of members in group. | [optional] 
**members** | [**List[Guardiumconnectorv3GroupMember]**](Guardiumconnectorv3GroupMember.md) | List of group members. | [optional] 
**nested_group_members** | [**List[Guardiumconnectorv3NestedGroupMember]**](Guardiumconnectorv3NestedGroupMember.md) | Array of group members. | [optional] 
**tuple_count** | **int** | Number of tuples in group. | [optional] 
**tuples** | **str** | Name of tuples in group type. | [optional] 
**type** | **int** | Group type. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_group import Guardiumconnectorv3Group

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Group from a JSON string
guardiumconnectorv3_group_instance = Guardiumconnectorv3Group.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Group.to_json())

# convert the object into a dict
guardiumconnectorv3_group_dict = guardiumconnectorv3_group_instance.to_dict()
# create an instance of Guardiumconnectorv3Group from a dict
guardiumconnectorv3_group_from_dict = Guardiumconnectorv3Group.from_dict(guardiumconnectorv3_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


