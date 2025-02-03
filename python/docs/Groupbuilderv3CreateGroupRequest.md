# Groupbuilderv3CreateGroupRequest

CreateGroupRequest requests creation of a new group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**copy_group_id** | **int** | Group ID to copy. | [optional] 
**description** | **str** | Group description. | [optional] 
**group_type_id** | **int** | Group type ID. | [optional] 
**name** | **str** | Group name. | [optional] 
**nested** | **bool** | Nested (hierarchical). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_create_group_request import Groupbuilderv3CreateGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3CreateGroupRequest from a JSON string
groupbuilderv3_create_group_request_instance = Groupbuilderv3CreateGroupRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3CreateGroupRequest.to_json())

# convert the object into a dict
groupbuilderv3_create_group_request_dict = groupbuilderv3_create_group_request_instance.to_dict()
# create an instance of Groupbuilderv3CreateGroupRequest from a dict
groupbuilderv3_create_group_request_from_dict = Groupbuilderv3CreateGroupRequest.from_dict(groupbuilderv3_create_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


