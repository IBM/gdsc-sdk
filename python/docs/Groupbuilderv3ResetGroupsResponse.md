# Groupbuilderv3ResetGroupsResponse

ResetGroupsResponse returns status of group reset request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_reset_groups_response import Groupbuilderv3ResetGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3ResetGroupsResponse from a JSON string
groupbuilderv3_reset_groups_response_instance = Groupbuilderv3ResetGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3ResetGroupsResponse.to_json())

# convert the object into a dict
groupbuilderv3_reset_groups_response_dict = groupbuilderv3_reset_groups_response_instance.to_dict()
# create an instance of Groupbuilderv3ResetGroupsResponse from a dict
groupbuilderv3_reset_groups_response_from_dict = Groupbuilderv3ResetGroupsResponse.from_dict(groupbuilderv3_reset_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


