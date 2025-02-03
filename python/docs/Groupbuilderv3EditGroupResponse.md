# Groupbuilderv3EditGroupResponse

EditGroupResponse returns the number of newly inserted, deleted, or updated group members.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_count** | **int** | Number of deleted group members. | [optional] 
**inserted_count** | **int** | Number of new group members. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 
**updated_count** | **int** | Number of updated group members. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_edit_group_response import Groupbuilderv3EditGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3EditGroupResponse from a JSON string
groupbuilderv3_edit_group_response_instance = Groupbuilderv3EditGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3EditGroupResponse.to_json())

# convert the object into a dict
groupbuilderv3_edit_group_response_dict = groupbuilderv3_edit_group_response_instance.to_dict()
# create an instance of Groupbuilderv3EditGroupResponse from a dict
groupbuilderv3_edit_group_response_from_dict = Groupbuilderv3EditGroupResponse.from_dict(groupbuilderv3_edit_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


