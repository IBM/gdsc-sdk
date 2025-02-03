# Groupbuilderv3GetGroupsResponse

GetGroupResponse returns the list of available groups on Guardium Insights for Db2 Warehouse.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Groupbuilderv3Group]**](Groupbuilderv3Group.md) | List of groups. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_response import Groupbuilderv3GetGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupsResponse from a JSON string
groupbuilderv3_get_groups_response_instance = Groupbuilderv3GetGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupsResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_groups_response_dict = groupbuilderv3_get_groups_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupsResponse from a dict
groupbuilderv3_get_groups_response_from_dict = Groupbuilderv3GetGroupsResponse.from_dict(groupbuilderv3_get_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


