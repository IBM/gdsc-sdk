# Riskanalyticscontrollerv3RiskEventTuningResponse

RiskEventTuningResponse is the response object for RiskEventTuning API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Response message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_risk_event_tuning_response import Riskanalyticscontrollerv3RiskEventTuningResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEventTuningResponse from a JSON string
riskanalyticscontrollerv3_risk_event_tuning_response_instance = Riskanalyticscontrollerv3RiskEventTuningResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEventTuningResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_tuning_response_dict = riskanalyticscontrollerv3_risk_event_tuning_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEventTuningResponse from a dict
riskanalyticscontrollerv3_risk_event_tuning_response_from_dict = Riskanalyticscontrollerv3RiskEventTuningResponse.from_dict(riskanalyticscontrollerv3_risk_event_tuning_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


