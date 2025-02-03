# Groupbuilderv3CancelGroupImportResponse

CancelGroupImportResponse returns status of import cancelation request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_cancel_group_import_response import Groupbuilderv3CancelGroupImportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3CancelGroupImportResponse from a JSON string
groupbuilderv3_cancel_group_import_response_instance = Groupbuilderv3CancelGroupImportResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3CancelGroupImportResponse.to_json())

# convert the object into a dict
groupbuilderv3_cancel_group_import_response_dict = groupbuilderv3_cancel_group_import_response_instance.to_dict()
# create an instance of Groupbuilderv3CancelGroupImportResponse from a dict
groupbuilderv3_cancel_group_import_response_from_dict = Groupbuilderv3CancelGroupImportResponse.from_dict(groupbuilderv3_cancel_group_import_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


