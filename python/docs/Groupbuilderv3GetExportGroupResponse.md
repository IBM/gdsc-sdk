# Groupbuilderv3GetExportGroupResponse

GetExportGroupResponse returns type of the GetExportGroupResponse API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_export_group_response import Groupbuilderv3GetExportGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetExportGroupResponse from a JSON string
groupbuilderv3_get_export_group_response_instance = Groupbuilderv3GetExportGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetExportGroupResponse.to_json())

# convert the object into a dict
groupbuilderv3_get_export_group_response_dict = groupbuilderv3_get_export_group_response_instance.to_dict()
# create an instance of Groupbuilderv3GetExportGroupResponse from a dict
groupbuilderv3_get_export_group_response_from_dict = Groupbuilderv3GetExportGroupResponse.from_dict(groupbuilderv3_get_export_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


