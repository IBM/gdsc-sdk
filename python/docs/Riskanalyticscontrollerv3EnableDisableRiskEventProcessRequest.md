# Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest

EnableDisableRiskEventProcessRequest is the request object for EnableDisableRiskEventProcess API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Riskanalyticscontrollerv3Action**](Riskanalyticscontrollerv3Action.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_enable_disable_risk_event_process_request import Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest from a JSON string
riskanalyticscontrollerv3_enable_disable_risk_event_process_request_instance = Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_enable_disable_risk_event_process_request_dict = riskanalyticscontrollerv3_enable_disable_risk_event_process_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest from a dict
riskanalyticscontrollerv3_enable_disable_risk_event_process_request_from_dict = Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.from_dict(riskanalyticscontrollerv3_enable_disable_risk_event_process_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


