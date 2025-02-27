# Guardiumconnectorv3GetGroupsResponse

Returns the list of groups for a particular Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Guardiumconnectorv3Group]**](Guardiumconnectorv3Group.md) | List of groups. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_groups_response import Guardiumconnectorv3GetGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetGroupsResponse from a JSON string
guardiumconnectorv3_get_groups_response_instance = Guardiumconnectorv3GetGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetGroupsResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_groups_response_dict = guardiumconnectorv3_get_groups_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetGroupsResponse from a dict
guardiumconnectorv3_get_groups_response_from_dict = Guardiumconnectorv3GetGroupsResponse.from_dict(guardiumconnectorv3_get_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


