# Guardiumconnectorv3GetGroupMembersResponse

Returns the list of group members for a particular Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Guardiumconnectorv3Group]**](Guardiumconnectorv3Group.md) | List of group memebers fetched with the command. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_group_members_response import Guardiumconnectorv3GetGroupMembersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetGroupMembersResponse from a JSON string
guardiumconnectorv3_get_group_members_response_instance = Guardiumconnectorv3GetGroupMembersResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetGroupMembersResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_group_members_response_dict = guardiumconnectorv3_get_group_members_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetGroupMembersResponse from a dict
guardiumconnectorv3_get_group_members_response_from_dict = Guardiumconnectorv3GetGroupMembersResponse.from_dict(guardiumconnectorv3_get_group_members_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


