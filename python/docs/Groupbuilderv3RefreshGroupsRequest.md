# Groupbuilderv3RefreshGroupsRequest

Refreshes a tenants imported groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_ids** | **List[int]** | List of group IDs. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_refresh_groups_request import Groupbuilderv3RefreshGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3RefreshGroupsRequest from a JSON string
groupbuilderv3_refresh_groups_request_instance = Groupbuilderv3RefreshGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3RefreshGroupsRequest.to_json())

# convert the object into a dict
groupbuilderv3_refresh_groups_request_dict = groupbuilderv3_refresh_groups_request_instance.to_dict()
# create an instance of Groupbuilderv3RefreshGroupsRequest from a dict
groupbuilderv3_refresh_groups_request_from_dict = Groupbuilderv3RefreshGroupsRequest.from_dict(groupbuilderv3_refresh_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


