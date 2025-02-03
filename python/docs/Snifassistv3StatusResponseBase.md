# Snifassistv3StatusResponseBase

StatusResponseBase is the message that stores status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_status_response_base import Snifassistv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3StatusResponseBase from a JSON string
snifassistv3_status_response_base_instance = Snifassistv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3StatusResponseBase.to_json())

# convert the object into a dict
snifassistv3_status_response_base_dict = snifassistv3_status_response_base_instance.to_dict()
# create an instance of Snifassistv3StatusResponseBase from a dict
snifassistv3_status_response_base_from_dict = Snifassistv3StatusResponseBase.from_dict(snifassistv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


