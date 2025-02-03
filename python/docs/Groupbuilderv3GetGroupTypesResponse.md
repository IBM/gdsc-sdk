# Groupbuilderv3GetGroupTypesResponse

GetGroupTypesResponse returns the list of available group types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_types** | [**List[Groupbuilderv3GroupType]**](Groupbuilderv3GroupType.md) | List of available group types. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_types_response import Groupbuilderv3GetGroupTypesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupTypesResponse from a JSON string
groupbuilderv3_get_group_types_response_instance = Groupbuilderv3GetGroupTypesResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupTypesResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_group_types_response_dict = groupbuilderv3_get_group_types_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupTypesResponse from a dict
groupbuilderv3_get_group_types_response_from_dict = Groupbuilderv3GetGroupTypesResponse.from_dict(groupbuilderv3_get_group_types_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


