# Riskanalyticscontrollerv3UpdateRiskFeedbackRequest

UpdateRiskFeedbackRequest message for the UpdateRiskFeedback API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **str** |  | [optional] 
**feedback_classification_key** | **str** |  | [optional] 
**original_classification_key** | **str** |  | [optional] 
**risk_ids** | **List[int]** | One or more risk id. This API can be called for multiple risks, only if all of them are from the same category. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_update_risk_feedback_request import Riskanalyticscontrollerv3UpdateRiskFeedbackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackRequest from a JSON string
riskanalyticscontrollerv3_update_risk_feedback_request_instance = Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_update_risk_feedback_request_dict = riskanalyticscontrollerv3_update_risk_feedback_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3UpdateRiskFeedbackRequest from a dict
riskanalyticscontrollerv3_update_risk_feedback_request_from_dict = Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.from_dict(riskanalyticscontrollerv3_update_risk_feedback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


