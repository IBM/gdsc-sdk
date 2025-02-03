# Groupbuilderv3GetGroupDetailResponse

GetGroupDetailResponse returns details for a specific group identified by group ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detail** | [**Groupbuilderv3Group**](Groupbuilderv3Group.md) |  | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_detail_response import Groupbuilderv3GetGroupDetailResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupDetailResponse from a JSON string
groupbuilderv3_get_group_detail_response_instance = Groupbuilderv3GetGroupDetailResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupDetailResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_group_detail_response_dict = groupbuilderv3_get_group_detail_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupDetailResponse from a dict
groupbuilderv3_get_group_detail_response_from_dict = Groupbuilderv3GetGroupDetailResponse.from_dict(groupbuilderv3_get_group_detail_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


