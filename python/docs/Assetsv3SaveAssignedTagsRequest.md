# Assetsv3SaveAssignedTagsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags_assigned** | [**List[Assetsv3TagsAssigned]**](Assetsv3TagsAssigned.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_save_assigned_tags_request import Assetsv3SaveAssignedTagsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SaveAssignedTagsRequest from a JSON string
assetsv3_save_assigned_tags_request_instance = Assetsv3SaveAssignedTagsRequest.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SaveAssignedTagsRequest.to_json())

# convert the object into a dict
assetsv3_save_assigned_tags_request_dict = assetsv3_save_assigned_tags_request_instance.to_dict()
# create an instance of Assetsv3SaveAssignedTagsRequest from a dict
assetsv3_save_assigned_tags_request_from_dict = Assetsv3SaveAssignedTagsRequest.from_dict(assetsv3_save_assigned_tags_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


