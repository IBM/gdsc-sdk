# Policybuilderv3StatusResponseBase

StatusResponseBase is the message that stores status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_status_response_base import Policybuilderv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3StatusResponseBase from a JSON string
policybuilderv3_status_response_base_instance = Policybuilderv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3StatusResponseBase.to_json())

# convert the object into a dict
policybuilderv3_status_response_base_dict = policybuilderv3_status_response_base_instance.to_dict()
# create an instance of Policybuilderv3StatusResponseBase from a dict
policybuilderv3_status_response_base_from_dict = Policybuilderv3StatusResponseBase.from_dict(policybuilderv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


