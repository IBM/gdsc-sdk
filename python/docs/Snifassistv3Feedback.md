# Snifassistv3Feedback

Feedback defines the message structure for sniffer feedback.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_num** | **str** | Specify batch number uniquely associated with a policy or group update message. | [optional] 
**message** | **str** | Description of the status. | [optional] 
**status** | [**Snifassistv3FeedbackStatus**](Snifassistv3FeedbackStatus.md) |  | [optional] [default to Snifassistv3FeedbackStatus.SUCCEEDED]

## Example

```python
from ibm_gdsc_sdk_saas.models.snifassistv3_feedback import Snifassistv3Feedback

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3Feedback from a JSON string
snifassistv3_feedback_instance = Snifassistv3Feedback.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3Feedback.to_json())

# convert the object into a dict
snifassistv3_feedback_dict = snifassistv3_feedback_instance.to_dict()
# create an instance of Snifassistv3Feedback from a dict
snifassistv3_feedback_from_dict = Snifassistv3Feedback.from_dict(snifassistv3_feedback_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


