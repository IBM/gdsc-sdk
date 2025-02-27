# Groupbuilderv3GetGroupMembersRequest

Get Group Members request which contains group ids arrays.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **List[int]** | Group ids. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_get_group_members_request import Groupbuilderv3GetGroupMembersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupMembersRequest from a JSON string
groupbuilderv3_get_group_members_request_instance = Groupbuilderv3GetGroupMembersRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupMembersRequest.to_json())

# convert the object into a dict
groupbuilderv3_get_group_members_request_dict = groupbuilderv3_get_group_members_request_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupMembersRequest from a dict
groupbuilderv3_get_group_members_request_from_dict = Groupbuilderv3GetGroupMembersRequest.from_dict(groupbuilderv3_get_group_members_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


