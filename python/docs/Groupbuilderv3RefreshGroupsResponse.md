# Groupbuilderv3RefreshGroupsResponse

RefreshGroupsResponse returns a default response status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_refresh_groups_response import Groupbuilderv3RefreshGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3RefreshGroupsResponse from a JSON string
groupbuilderv3_refresh_groups_response_instance = Groupbuilderv3RefreshGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3RefreshGroupsResponse.to_json())

# convert the object into a dict
groupbuilderv3_refresh_groups_response_dict = groupbuilderv3_refresh_groups_response_instance.to_dict()
# create an instance of Groupbuilderv3RefreshGroupsResponse from a dict
groupbuilderv3_refresh_groups_response_from_dict = Groupbuilderv3RefreshGroupsResponse.from_dict(groupbuilderv3_refresh_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


