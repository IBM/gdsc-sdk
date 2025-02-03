# Policybuilderv3GetReceiversResponse

Response message that gives back the reciever information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_notification_object** | [**List[Policybuilderv3ActionNotificationObject]**](Policybuilderv3ActionNotificationObject.md) | Action Notification Objects. | [optional] 
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_get_receivers_response import Policybuilderv3GetReceiversResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3GetReceiversResponse from a JSON string
policybuilderv3_get_receivers_response_instance = Policybuilderv3GetReceiversResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3GetReceiversResponse.to_json())

# convert the object into a dict
policybuilderv3_get_receivers_response_dict = policybuilderv3_get_receivers_response_instance.to_dict()
# create an instance of Policybuilderv3GetReceiversResponse from a dict
policybuilderv3_get_receivers_response_from_dict = Policybuilderv3GetReceiversResponse.from_dict(policybuilderv3_get_receivers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


