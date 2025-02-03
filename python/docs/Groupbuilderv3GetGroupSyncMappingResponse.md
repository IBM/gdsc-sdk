# Groupbuilderv3GetGroupSyncMappingResponse

Response object for group types mapping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_map** | **Dict[str, int]** | Map of gdp to gi group type mapping objects. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_group_sync_mapping_response import Groupbuilderv3GetGroupSyncMappingResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupSyncMappingResponse from a JSON string
groupbuilderv3_get_group_sync_mapping_response_instance = Groupbuilderv3GetGroupSyncMappingResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupSyncMappingResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_group_sync_mapping_response_dict = groupbuilderv3_get_group_sync_mapping_response_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupSyncMappingResponse from a dict
groupbuilderv3_get_group_sync_mapping_response_from_dict = Groupbuilderv3GetGroupSyncMappingResponse.from_dict(groupbuilderv3_get_group_sync_mapping_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


