# Groupbuilderv3StatusResponseBase

StatusReponseBase stores the default status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_status_response_base import Groupbuilderv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3StatusResponseBase from a JSON string
groupbuilderv3_status_response_base_instance = Groupbuilderv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3StatusResponseBase.to_json())

# convert the object into a dict
groupbuilderv3_status_response_base_dict = groupbuilderv3_status_response_base_instance.to_dict()
# create an instance of Groupbuilderv3StatusResponseBase from a dict
groupbuilderv3_status_response_base_from_dict = Groupbuilderv3StatusResponseBase.from_dict(groupbuilderv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


