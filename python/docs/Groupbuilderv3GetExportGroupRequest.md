# Groupbuilderv3GetExportGroupRequest

GetExportGroupRequest is the argument type of the GetExportGroupRequest API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**export_hierarchy** | **bool** | Export full hierarchy of nested group. | [optional] 
**group_id** | **int** | Group ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_export_group_request import Groupbuilderv3GetExportGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetExportGroupRequest from a JSON string
groupbuilderv3_get_export_group_request_instance = Groupbuilderv3GetExportGroupRequest.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetExportGroupRequest.to_json())

# convert the object into a dict
groupbuilderv3_get_export_group_request_dict = groupbuilderv3_get_export_group_request_instance.to_dict()
# create an instance of Groupbuilderv3GetExportGroupRequest from a dict
groupbuilderv3_get_export_group_request_from_dict = Groupbuilderv3GetExportGroupRequest.from_dict(groupbuilderv3_get_export_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


