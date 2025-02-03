# Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest

EnableDisableRiskEventFeedbackRequest is the request object for EnableDisableRiskEventFeedback API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Riskanalyticscontrollerv3Action**](Riskanalyticscontrollerv3Action.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request import Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest from a JSON string
riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request_instance = Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request_dict = riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest from a dict
riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request_from_dict = Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.from_dict(riskanalyticscontrollerv3_enable_disable_risk_event_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


