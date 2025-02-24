# Groupbuilderv3ResetGroupsRequest

ResetGroupsRequest requests reset of speciefied predefined groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_ids** | **List[int]** | Group IDs to delete. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_reset_groups_request import Groupbuilderv3ResetGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3ResetGroupsRequest from a JSON string
groupbuilderv3_reset_groups_request_instance = Groupbuilderv3ResetGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3ResetGroupsRequest.to_json())

# convert the object into a dict
groupbuilderv3_reset_groups_request_dict = groupbuilderv3_reset_groups_request_instance.to_dict()
# create an instance of Groupbuilderv3ResetGroupsRequest from a dict
groupbuilderv3_reset_groups_request_from_dict = Groupbuilderv3ResetGroupsRequest.from_dict(groupbuilderv3_reset_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


