# Riskanalyticscontrollerv3GetRiskFeedbackResponse

GetRiskFeedbackResponse is the response object for GetRiskFeedback API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk_feedbacks** | [**List[Riskanalyticscontrollerv3RiskFeedback]**](Riskanalyticscontrollerv3RiskFeedback.md) | List of risk_feedbacks in status NEW. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_get_risk_feedback_response import Riskanalyticscontrollerv3GetRiskFeedbackResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskFeedbackResponse from a JSON string
riskanalyticscontrollerv3_get_risk_feedback_response_instance = Riskanalyticscontrollerv3GetRiskFeedbackResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskFeedbackResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_feedback_response_dict = riskanalyticscontrollerv3_get_risk_feedback_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskFeedbackResponse from a dict
riskanalyticscontrollerv3_get_risk_feedback_response_from_dict = Riskanalyticscontrollerv3GetRiskFeedbackResponse.from_dict(riskanalyticscontrollerv3_get_risk_feedback_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


