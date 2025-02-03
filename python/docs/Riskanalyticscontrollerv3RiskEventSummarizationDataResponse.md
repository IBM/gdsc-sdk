# Riskanalyticscontrollerv3RiskEventSummarizationDataResponse

RiskEventSummarizationDataResponse message for the GetRiskEventDataForSummarization api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**former_hours** | [**Riskanalyticscontrollerv3RiskEventFormerHours**](Riskanalyticscontrollerv3RiskEventFormerHours.md) |  | [optional] 
**hourly_findings** | [**List[Riskanalyticscontrollerv3RiskEventHourlyFindings]**](Riskanalyticscontrollerv3RiskEventHourlyFindings.md) |  | [optional] 
**risk_event** | [**Riskanalyticscontrollerv3RiskEvent**](Riskanalyticscontrollerv3RiskEvent.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_summarization_data_response import Riskanalyticscontrollerv3RiskEventSummarizationDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse from a JSON string
riskanalyticscontrollerv3_risk_event_summarization_data_response_instance = Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_summarization_data_response_dict = riskanalyticscontrollerv3_risk_event_summarization_data_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse from a dict
riskanalyticscontrollerv3_risk_event_summarization_data_response_from_dict = Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.from_dict(riskanalyticscontrollerv3_risk_event_summarization_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


