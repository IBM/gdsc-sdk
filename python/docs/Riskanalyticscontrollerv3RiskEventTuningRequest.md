# Riskanalyticscontrollerv3RiskEventTuningRequest

RiskEventTuningRequest is the request object for RiskEventTuning API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excluded_items** | [**List[Riskanalyticscontrollerv3ExcludedItem]**](Riskanalyticscontrollerv3ExcludedItem.md) | Excluded items array. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_risk_event_tuning_request import Riskanalyticscontrollerv3RiskEventTuningRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEventTuningRequest from a JSON string
riskanalyticscontrollerv3_risk_event_tuning_request_instance = Riskanalyticscontrollerv3RiskEventTuningRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEventTuningRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_tuning_request_dict = riskanalyticscontrollerv3_risk_event_tuning_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEventTuningRequest from a dict
riskanalyticscontrollerv3_risk_event_tuning_request_from_dict = Riskanalyticscontrollerv3RiskEventTuningRequest.from_dict(riskanalyticscontrollerv3_risk_event_tuning_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


