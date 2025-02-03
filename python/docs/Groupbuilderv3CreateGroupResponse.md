# Groupbuilderv3CreateGroupResponse

CreateGroupResponse returns the group ID of a new group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**new_group_id** | **int** | New group ID. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_create_group_response import Groupbuilderv3CreateGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3CreateGroupResponse from a JSON string
groupbuilderv3_create_group_response_instance = Groupbuilderv3CreateGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3CreateGroupResponse.to_json())

# convert the object into a dict
groupbuilderv3_create_group_response_dict = groupbuilderv3_create_group_response_instance.to_dict()
# create an instance of Groupbuilderv3CreateGroupResponse from a dict
groupbuilderv3_create_group_response_from_dict = Groupbuilderv3CreateGroupResponse.from_dict(groupbuilderv3_create_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


