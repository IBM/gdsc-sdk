# Groupbuilderv3StoreGroupMembersGdpRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**data** | **str** | Groups pushed from GDP in json format. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_store_group_members_gdp_request import Groupbuilderv3StoreGroupMembersGdpRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3StoreGroupMembersGdpRequest from a JSON string
groupbuilderv3_store_group_members_gdp_request_instance = Groupbuilderv3StoreGroupMembersGdpRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3StoreGroupMembersGdpRequest.to_json())

# convert the object into a dict
groupbuilderv3_store_group_members_gdp_request_dict = groupbuilderv3_store_group_members_gdp_request_instance.to_dict()
# create an instance of Groupbuilderv3StoreGroupMembersGdpRequest from a dict
groupbuilderv3_store_group_members_gdp_request_from_dict = Groupbuilderv3StoreGroupMembersGdpRequest.from_dict(groupbuilderv3_store_group_members_gdp_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


