# Riskanalyticscontrollerv3RiskFeedback

RiskFeedback represent feedback object in status NEW that should be sent to UI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **str** | Feedback comments. | [optional] 
**creation_time** | **datetime** | Feedback creation time. | [optional] 
**features** | [**List[Riskanalyticsenginev3Feature]**](Riskanalyticsenginev3Feature.md) | List of features for the risk that related to this feedback. | [optional] 
**new_classification** | **str** | Feedback classification. | [optional] 
**new_severity** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] 
**old_classification** | **str** | Original classification. | [optional] 
**old_severity** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_feedback import Riskanalyticscontrollerv3RiskFeedback

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskFeedback from a JSON string
riskanalyticscontrollerv3_risk_feedback_instance = Riskanalyticscontrollerv3RiskFeedback.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskFeedback.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_feedback_dict = riskanalyticscontrollerv3_risk_feedback_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskFeedback from a dict
riskanalyticscontrollerv3_risk_feedback_from_dict = Riskanalyticscontrollerv3RiskFeedback.from_dict(riskanalyticscontrollerv3_risk_feedback_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


