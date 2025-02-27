# Riskanalyticscontrollerv3UpdateRiskFeedbackResponse

UpdateRiskFeedbackResponse message for the UpdateRiskFeedback API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Response message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_update_risk_feedback_response import Riskanalyticscontrollerv3UpdateRiskFeedbackResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackResponse from a JSON string
riskanalyticscontrollerv3_update_risk_feedback_response_instance = Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_update_risk_feedback_response_dict = riskanalyticscontrollerv3_update_risk_feedback_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackResponse from a dict
riskanalyticscontrollerv3_update_risk_feedback_response_from_dict = Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.from_dict(riskanalyticscontrollerv3_update_risk_feedback_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


