# Groupbuilderv3StoreGroupMembersGdpResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message. | [optional] 
**response_code** | **str** | Translatable response code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_store_group_members_gdp_response import Groupbuilderv3StoreGroupMembersGdpResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3StoreGroupMembersGdpResponse from a JSON string
groupbuilderv3_store_group_members_gdp_response_instance = Groupbuilderv3StoreGroupMembersGdpResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3StoreGroupMembersGdpResponse.to_json())

# convert the object into a dict
groupbuilderv3_store_group_members_gdp_response_dict = groupbuilderv3_store_group_members_gdp_response_instance.to_dict()
# create an instance of Groupbuilderv3StoreGroupMembersGdpResponse from a dict
groupbuilderv3_store_group_members_gdp_response_from_dict = Groupbuilderv3StoreGroupMembersGdpResponse.from_dict(groupbuilderv3_store_group_members_gdp_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


