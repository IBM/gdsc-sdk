# Groupbuilderv3GdpGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **str** | Application of the group. | [optional] 
**description** | **str** | Name of the group. | [optional] 
**hierarchical** | **bool** | If the group is nested or not. | [optional] 
**id** | **int** | GDP group ID. | [optional] 
**member_count** | **int** | Number of group members. | [optional] 
**members** | **str** | Json object of nested or regular members. | [optional] 
**tuple_count** | **int** | Number of tuples. | [optional] 
**tuples** | **str** | The tuples of the group. | [optional] 
**type** | **str** | GDP type name. | [optional] 
**type_id** | **int** | GDP type ID of group. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_gdp_group import Groupbuilderv3GdpGroup

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GdpGroup from a JSON string
groupbuilderv3_gdp_group_instance = Groupbuilderv3GdpGroup.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GdpGroup.to_json())

# convert the object into a dict
groupbuilderv3_gdp_group_dict = groupbuilderv3_gdp_group_instance.to_dict()
# create an instance of Groupbuilderv3GdpGroup from a dict
groupbuilderv3_gdp_group_from_dict = Groupbuilderv3GdpGroup.from_dict(groupbuilderv3_gdp_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


