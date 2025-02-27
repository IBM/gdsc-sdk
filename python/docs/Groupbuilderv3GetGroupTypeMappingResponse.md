# Groupbuilderv3GetGroupTypeMappingResponse

Response object for group types mapping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 
**type_map** | **Dict[str, int]** | Map of GDP to gi group type mapping objects. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.groupbuilderv3_get_group_type_mapping_response import Groupbuilderv3GetGroupTypeMappingResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupTypeMappingResponse from a JSON string
groupbuilderv3_get_group_type_mapping_response_instance = Groupbuilderv3GetGroupTypeMappingResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupTypeMappingResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_group_type_mapping_response_dict = groupbuilderv3_get_group_type_mapping_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupTypeMappingResponse from a dict
groupbuilderv3_get_group_type_mapping_response_from_dict = Groupbuilderv3GetGroupTypeMappingResponse.from_dict(groupbuilderv3_get_group_type_mapping_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


