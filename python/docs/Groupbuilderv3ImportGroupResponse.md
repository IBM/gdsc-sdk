# Groupbuilderv3ImportGroupResponse

ImportGroupResponse returns the specific groups imported from a Guardium Data Protection central manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List[Groupbuilderv3Group]**](Groupbuilderv3Group.md) | Content of the imported groups. | [optional] 
**status** | [**Groupbuilderv3StatusResponseBase**](Groupbuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_import_group_response import Groupbuilderv3ImportGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3ImportGroupResponse from a JSON string
groupbuilderv3_import_group_response_instance = Groupbuilderv3ImportGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3ImportGroupResponse.to_json())

# convert the object into a dict
groupbuilderv3_import_group_response_dict = groupbuilderv3_import_group_response_instance.to_dict()
# create an instance of Groupbuilderv3ImportGroupResponse from a dict
groupbuilderv3_import_group_response_from_dict = Groupbuilderv3ImportGroupResponse.from_dict(groupbuilderv3_import_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


